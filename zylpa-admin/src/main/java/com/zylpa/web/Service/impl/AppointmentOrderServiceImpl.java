package com.zylpa.web.Service.impl;








import com.zylpa.web.Service.IAppointmentOrderService;
import com.zylpa.web.domain.AppointmentOrder;

import com.zylpa.web.mapper.AppointmentOrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AppointmentOrderServiceImpl implements IAppointmentOrderService
{
	@Resource

	private AppointmentOrderMapper appointmentOrderMapper;





	/**
     * 查询预约订单信息
     * 
     * @param fId 预约订单ID
     * @return 预约订单信息
     */
    @Override
	public AppointmentOrder selectAppointmentOrderById(String fId)
	{
	    return appointmentOrderMapper.selectAppointmentOrderById(fId);
	}



	
}
