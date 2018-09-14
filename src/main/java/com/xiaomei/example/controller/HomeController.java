package com.xiaomei.example.controller;

import com.xiaomei.example.domain.Article;
import com.xiaomei.example.domain.Image;
import com.xiaomei.example.service.ArticleService;
import com.xiaomei.example.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.soap.Addressing;
import java.util.ArrayList;
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
    public String picture(Model model,@RequestParam(required =true) Integer currpage) {
        List<Image> images = imageService.selectAll(currpage-1,12);
        long count = imageService.countImages();
        List<String> pagelist = new ArrayList();

        model.addAttribute("pagelength",count/12+1);
        model.addAttribute("count",count);
        model.addAttribute("currpage",currpage);
        model.addAttribute("images",images);
        return "share";
    }

    @RequestMapping("/note")
    public String note(Model model) {
        List<Article> articles = articleService.selectNote();
        model.addAttribute("articles",articles);
        return "index";
    }

    @RequestMapping("/feel")
    public String feel(Model model) {
        List<Article> articles = articleService.selectFeel();
        model.addAttribute("articles",articles);
        return "index";
    }
    @RequestMapping("/content")
    public String content(Model model,Integer id) {
        Article article = articleService.selectById(id);
        model.addAttribute("article",article);
        return "info";
    }

}
