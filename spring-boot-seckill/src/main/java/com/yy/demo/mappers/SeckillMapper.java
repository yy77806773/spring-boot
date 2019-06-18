package com.yy.demo.mappers;

import com.yy.demo.common.entity.Seckill;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SeckillMapper {
    Seckill getBySeckillId(long id);
}
