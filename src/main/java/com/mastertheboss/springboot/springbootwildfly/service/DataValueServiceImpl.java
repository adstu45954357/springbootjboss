package com.mastertheboss.springboot.springbootwildfly.service;

import com.mastertheboss.springboot.springbootwildfly.model.Datas;
import com.mastertheboss.springboot.springbootwildfly.repository.DataValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataValueServiceImpl implements DataValueService {

    @Autowired
    DataValueRepository dataValueRepository;

//    @Override
//    public List<Datas> getAllValueWithDate(String startDate, String endDate) {
//        return dataValueRepository.findByDateBetween(startDate, endDate);
//    }

    @Override
    public List<Datas.DataValues> getAllValueWithDate(String startDate, String endDate) {
        return dataValueRepository.findDateBetween(startDate, endDate);
    }
}
