package com.yy.demo.web;

import com.yy.demo.common.entity.Seckill;
import com.yy.demo.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seckill")
public class SeckillController {

    @Autowired
    SeckillService seckillService;

    @RequestMapping("/get")
    public Seckill get(long id) {
        Seckill seckill = seckillService.getSeckill(id);
        return seckill;
    }
}
