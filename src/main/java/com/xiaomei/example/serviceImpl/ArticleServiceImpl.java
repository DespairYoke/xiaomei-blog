package com.xiaomei.example.serviceImpl;

import com.xiaomei.example.domain.Article;
import com.xiaomei.example.domain.ArticleExample;
import com.xiaomei.example.mapper.ArticleMapper;
import com.xiaomei.example.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zwd
 * @date 2018/9/13 11:39
 * @Email stephen.zwd@gmail.com
 */
@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<Article> selectAll() {
        List<Article> articles = articleMapper.selectAll();
        return articles;
    }
}
