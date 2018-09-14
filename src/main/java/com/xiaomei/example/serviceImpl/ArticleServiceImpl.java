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
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria();
        List<Article> articles = articleMapper.selectByExample(articleExample);
        return articles;
    }

    @Override
    public List<Article> selectNote() {
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andTypeEqualTo((byte) 0);
        List<Article> articles = articleMapper.selectByExample(articleExample);
        return articles;
    }

    @Override
    public List<Article> selectFeel() {
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andTypeEqualTo((byte) 1);
        List<Article> articles = articleMapper.selectByExample(articleExample);
        return articles;
    }

    @Override
    public Article selectById(Integer id) {
        Article article = articleMapper.selectByPrimaryKey(id);
        return article;
    }
}
