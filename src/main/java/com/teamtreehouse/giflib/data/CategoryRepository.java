package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository



{

  private  static   List<Category> clist = Arrays.asList(

          new Category(1,"Technology"),
          new Category(2,"People"),
          new Category(3,"Destruction")
  );


  public List getcategories(){

      return  clist;
  }


  public Category findById(int id) {
      for (Category category : clist) {
          if (category.getId() == id) {
              return category;
          }

      }
      return null;
  }
}
