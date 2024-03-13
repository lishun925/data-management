package com.management.service.read;


import java.util.List;
import java.util.Map;

/**
 * @author:lishun
 * @create: 2024-02-19 15:36
 * @Description: 企业基本信息api
 */
public interface EnterPriseBaseInfoReadService {

    /**
    * @Description: 查询抽检所有列表
    * @Author: lishun
    * @Date: 2024/2/19
    * @Param: []
    * @return: java.util.List
    */
    List<Map<String, Object>>  getQueryAll();
}
