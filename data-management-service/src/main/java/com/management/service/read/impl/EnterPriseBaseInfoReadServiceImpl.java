package com.management.service.read.impl;

import com.management.dao.mapper.read.EnterPriseBaseInfoReadMapper;
import com.management.service.read.EnterPriseBaseInfoReadService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author:lishun
 * @create: 2024-03-12 16:23
 * @Description: 企业基本信息api实现类
 */
@Service
@Transactional
@MapperScan(basePackages = "com.management.dao.mapper.*")
public class EnterPriseBaseInfoReadServiceImpl implements EnterPriseBaseInfoReadService {
    @Resource
    private EnterPriseBaseInfoReadMapper enterPriseBaseInfoReadMapper;
    @Resource
    private RedisTemplate redisTemplate;
    /**
     * @Description: 查询抽检所有列表
     * @Author: lishun
     * @Date: 2024/2/19
     * @Param: []
     * @return: java.util.List
     */
    @Override
    public List<Map<String, Object>> getQueryAll() {
        //string数据操作
        ValueOperations valueOperations = redisTemplate.opsForValue();
        //hash类型的数据操作
        HashOperations hashOperations = redisTemplate.opsForHash();
        //list类型的数据操作
        ListOperations listOperations = redisTemplate.opsForList();
        //set类型数据操作
        SetOperations setOperations = redisTemplate.opsForSet();
        //zset类型数据操作
        ZSetOperations zSetOperations = redisTemplate.opsForZSet();
        valueOperations.set("list",enterPriseBaseInfoReadMapper.getQueryAll());
        return enterPriseBaseInfoReadMapper.getQueryAll();
    }
}
