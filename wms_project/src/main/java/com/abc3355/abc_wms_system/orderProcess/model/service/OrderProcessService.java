package com.abc3355.abc_wms_system.orderProcess.model.service;

import com.abc3355.abc_wms_system.orderProcess.model.dao.OrderProcessMapper;
import com.abc3355.abc_wms_system.orderProcess.model.dto.OrderListResDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.abc3355.abc_wms_system.common.MyBatisTemplate.getSqlSession;

public class OrderProcessService {
    public List<OrderListResDTO> getOrders(String userName) {

        SqlSession sqlSession = getSqlSession();
        OrderProcessMapper mapper = sqlSession.getMapper(OrderProcessMapper.class);
        List<OrderListResDTO> orderList = mapper.selectOrderByName(userName);

        return orderList;
    }
}
