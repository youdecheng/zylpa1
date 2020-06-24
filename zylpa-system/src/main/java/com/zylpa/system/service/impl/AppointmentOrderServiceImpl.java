package com.zylpa.system.service.impl;


import com.zylpa.system.domain.AppointmentOrder;
import com.zylpa.system.mapper.AppointmentOrderMapper;
import com.zylpa.system.service.IAppointmentOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("appointmentOrderServiceImpl")
public class AppointmentOrderServiceImpl implements IAppointmentOrderService {
    @Autowired
    private AppointmentOrderMapper appointmentOrderMapper;


    /**
     * 查询预约订单信息
     *
     * @param fId 预约订单ID
     * @return 预约订单信息
     */
    @Override
    public AppointmentOrder selectAppointmentOrderById(String fId) {
        return appointmentOrderMapper.selectAppointmentOrderById(fId);
    }



}
