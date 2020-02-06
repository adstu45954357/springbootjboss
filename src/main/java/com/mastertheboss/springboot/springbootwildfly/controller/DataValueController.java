package com.mastertheboss.springboot.springbootwildfly.controller;

import com.mastertheboss.springboot.springbootwildfly.model.Datas;
import com.mastertheboss.springboot.springbootwildfly.service.DataValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataValueController {

    @Autowired
    DataValueService dataValueService;

    //    @GetMapping("/datas")
//    private List<Datas> getAllData(String startDate, String endDate) {
//        System.out.println(dataValueService.getAllValueWithDate(startDate, endDate) + "");
//        String json;
//
//        return dataValueService.getAllValueWithDate(startDate, endDate);
//    }
    @GetMapping("/datas")
    private List<Datas.DataValues> getAllData(String startDate, String endDate) {

        return dataValueService.getAllValueWithDate(startDate, endDate);
    }
}
