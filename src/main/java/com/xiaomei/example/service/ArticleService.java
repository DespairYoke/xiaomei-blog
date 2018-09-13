package com.xiaomei.example.service;

import com.xiaomei.example.domain.Article;

import java.util.List;

/**
 * @author zwd
 * @date 2018/9/13 11:39
 * @Email stephen.zwd@gmail.com
 */
public interface ArticleService {
    List<Article> selectAll();
}
