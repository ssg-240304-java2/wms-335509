package com.abc3355.abc_wms_system.orderProcess.model.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class OrderDetailResDTO {

    int orderNo;
    int orderDetailNo;
    String productName;
    int orderAmount;
}
