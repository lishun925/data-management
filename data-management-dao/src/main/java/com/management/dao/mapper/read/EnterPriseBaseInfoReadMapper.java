package com.management.dao.mapper.read;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author:lishun
 * @create: 2024-02-19 15:36
 * @Description: 企业基本信息mapper
 */
@Mapper
public interface EnterPriseBaseInfoReadMapper {

    /**
    * @Description: 查询企业基本信息列表
    * @Author: lishun
    * @Date: 2024/2/19
    * @Param: []
    * @return: java.util.List
    */
    List<Map<String, Object>>  getQueryAll();
}
