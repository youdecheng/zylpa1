package com.zylpa.system.mapper;


import com.zylpa.system.domain.AppointmentOrder;


/**
 * 预约订单 数据层
 *
 * @author zyl
 * @date 2020-05-25
 */

public interface AppointmentOrderMapper {
    /**
     * 查询预约订单信息
     *
     * @param fId 预约订单ID
     * @return 预约订单信息
     */
    public AppointmentOrder selectAppointmentOrderById(String fId);


}