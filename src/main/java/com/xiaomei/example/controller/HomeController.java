package com.xiaomei.example.controller;

import com.xiaomei.example.domain.Article;
import com.xiaomei.example.domain.Image;
import com.xiaomei.example.service.ArticleService;
import com.xiaomei.example.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.soap.Addressing;
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

    @Autowired
    private ImageService imageService;

    @RequestMapping("/")
    public String home(Model model) {
        List<Article> articles = articleService.selectAll();
        model.addAttribute("articles",articles);
        return "index";
    }

    @RequestMapping("/share")
    public String picture(Model model) {
        List<Image> images = imageService.selectAll();
        model.addAttribute("images",images);
        return "share";
    }
}
