package com.lx.dao;

import com.lx.pojo.City;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface CityDao  {
    String queryById(String id);
     List<City> findAll();
     City  DeleteById(int id);

}
