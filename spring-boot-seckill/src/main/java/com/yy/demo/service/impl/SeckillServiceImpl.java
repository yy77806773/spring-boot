package com.yy.demo.service.impl;

import com.yy.demo.common.entity.Seckill;
import com.yy.demo.mappers.SeckillMapper;
import com.yy.demo.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SeckillServiceImpl implements SeckillService {

    @Autowired
    SeckillMapper seckillMapper;

    @Override
    public Seckill getSeckill(long seckillId) {
        Seckill seckill = seckillMapper.getBySeckillId(seckillId);
        return seckill;
    }
}
