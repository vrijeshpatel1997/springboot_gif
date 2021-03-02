package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.gifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {

    @Autowired
    private gifRepository gifs;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap) {

        List<Gif> allgifs = gifs.getAllgif();

        modelMap.put("gifs",allgifs);
        return "home";

    }

    @RequestMapping("/msg")
    @ResponseBody // string response
    public String mymsg() {
        return "home";





    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){

        Gif gif = gifs.findbyName(name);


        modelMap.put("gif",gif);
        return "gif-details";
    }

}
