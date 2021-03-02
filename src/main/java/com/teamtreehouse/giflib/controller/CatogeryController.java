package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.CategoryRepository;
import com.teamtreehouse.giflib.data.gifRepository;
import com.teamtreehouse.giflib.model.Category;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CatogeryController {

@Autowired
    CategoryRepository categoryRepository;

@Autowired
    gifRepository gifRepository;







    @RequestMapping("/catogories")
    public String getcatogery(ModelMap modelMap){
        List<Category> category = categoryRepository.getcategories();
        modelMap.put("categories",category);


        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String Category(@PathVariable int id, ModelMap modelMap){
        Category category = categoryRepository.findById(id);
        modelMap.put("category",category);


        List<Gif> gifs = gifRepository.findByCategoryId(id);
        modelMap.put("gifs", gifs);
        return "category";

    }


}
