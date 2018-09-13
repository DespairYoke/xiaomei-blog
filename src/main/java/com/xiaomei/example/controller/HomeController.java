package com.xiaomei.example.controller;

import com.xiaomei.example.domain.Article;
import com.xiaomei.example.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zwd
 * @date 2018/9/13 10:30
 * @Email stephen.zwd@gmail.com
 */
@Controller
public class HomeController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/")
    public String home(Model model) {
        List<Article> articles = articleService.selectAll();
        model.addAttribute("articles",articles);
        return "index";
    }

    @RequestMapping("/picture")
    public String picture() {

        return "share";
    }
}
