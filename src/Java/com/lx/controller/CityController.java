package com.lx.controller;

import com.lx.pojo.City;
import com.lx.service.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/city")
public class CityController {


    @Autowired
    private CityServiceImpl cityService;

    @RequestMapping("/getcityname")
    public ModelAndView hello(ModelAndView mv,@RequestParam String id){
        String name=cityService.getCityName(id);
        mv.addObject("cityname",name);
        mv.setViewName("cityname");
        return mv;
    }

    @RequestMapping("/getall")
    public ModelAndView test(ModelAndView mv){
        List<City> list;
        list=cityService.findAll();
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getId()+list.get(i).getName()+list.get(i).getDistrict());


        }

        return mv;
    }
    @RequestMapping("/delete")
    public void hello2(@RequestParam String id){
       cityService.DeleteById(Integer.parseInt(id));
    }
}
