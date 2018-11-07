package com.lx.service.impl;
 import com.lx.dao.CityDao;
 import com.lx.pojo.City;
 import com.lx.service.CityService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

 import java.util.List;

@Service("cityService")
public class CityServiceImpl implements CityService {
    @Autowired
    CityDao cityDao;
    public String getCityName(String  id) {
        return cityDao.queryById(id);
    }

    public List<City> findAll() {
        return cityDao.findAll();
    }

    public City DeleteById(int id) {
        return cityDao.DeleteById(id);

    }


}
