package com.lx.service;

import com.lx.pojo.City;

import java.util.List;

public interface CityService {
     String getCityName(String id);
     List<City> findAll();
     City DeleteById(int id);
}
