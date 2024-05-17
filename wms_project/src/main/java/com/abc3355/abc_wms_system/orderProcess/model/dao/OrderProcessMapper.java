package com.abc3355.abc_wms_system.orderProcess.model.dao;

import com.abc3355.abc_wms_system.orderProcess.model.dto.OrderListResDTO;

import java.util.List;

public interface OrderProcessMapper {
    List<OrderListResDTO> selectOrderByName(String userName);
}
