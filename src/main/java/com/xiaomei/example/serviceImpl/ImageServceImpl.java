package com.xiaomei.example.serviceImpl;

import com.xiaomei.example.domain.Image;
import com.xiaomei.example.domain.ImageExample;
import com.xiaomei.example.mapper.ImageMapper;
import com.xiaomei.example.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zwd
 * @date 2018/9/13 17:15
 * @Email stephen.zwd@gmail.com
 */
@Service
@Transactional
public class ImageServceImpl implements ImageService {
    @Autowired
    private ImageMapper imageMapper;
    @Override
    public List<Image> selectAll(Integer currpage,Integer pageSize) {
        ImageExample imageExample = new ImageExample();
        imageExample.setStartRow((currpage-1)*pageSize);
        imageExample.setPageSize(pageSize);
        imageExample.createCriteria();
        List<Image> images = imageMapper.selectByExample(imageExample);
        return images;
    }

    @Override
    public long countImages() {
        ImageExample imageExample = new ImageExample();
        imageExample.createCriteria();
        long l = imageMapper.countByExample(imageExample);
        return l;
    }
}
