package com.abc3355.abc_wms_system.orderProcess.model.dto;


import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class OrderListResDTO {

    int orderNo;
    String orderId;
    String orderPlace;
    int orderPrice;
    String orderStatus;
    String orderDetail;
    LocalDateTime orderDate;

}
