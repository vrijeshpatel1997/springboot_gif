package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component

public class gifRepository {





    private static List<Gif> allgifs =  Arrays.asList(

            new Gif("android-explosion", LocalDate.of(2015,2,13), "Chris Ramacciotti", false,1),
            new Gif("ben-and-mike", LocalDate.of(2015,10,30), "Ben Jakuben", true,2),
            new Gif("book-dominos", LocalDate.of(2015,9,15), "Craig Dennis", false,3),
            new Gif("compiler-bot", LocalDate.of(2015,2,13), "Ada Lovelace", true,3),
            new Gif("cowboy-coder", LocalDate.of(2015,2,13), "Grace Hopper", false,1),
            new Gif("infinite-andrew", LocalDate.of(2015,8,23), "Marissa Mayer", true,2)


    );


    public Gif findbyName( String name) {

        for (Gif gif : allgifs) {
            if (gif.getName().equals(name)) {

                return  gif;

            }
        }
return  null;

    }

    public List<Gif> getAllgif(){

        return  allgifs;
    }

    public List<Gif> findByCategoryId(int id){
        List<Gif> gifs = new ArrayList<>();
        for(Gif gif : allgifs){
            if(gif.getId() == id){
                gifs.add(gif);
            }
        }

        return  gifs;
    }
}
