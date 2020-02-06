package com.mastertheboss.springboot.springbootwildfly.service;

import com.mastertheboss.springboot.springbootwildfly.model.Datas;

import java.util.List;

public interface DataValueService {
    List<Datas.DataValues> getAllValueWithDate(String startDate, String endDate);
}
