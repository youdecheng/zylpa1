package com.zylpa.system.service;


import com.zylpa.system.domain.AppointmentOrder;

/**
 * 预约订单 服务层
 *
 * @author zyl
 * @date 2020-05-25
 */
public interface IAppointmentOrderService {
    /**
     * 查询预约订单信息
     *
     * @param fId 预约订单ID
     * @return 预约订单信息
     */
    AppointmentOrder selectAppointmentOrderById(String fId);


}
