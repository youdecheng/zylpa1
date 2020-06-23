package com.zylpa.web.Service;



import com.zylpa.web.domain.AppointmentOrder;

import java.util.List;

/**
 * 预约订单 服务层
 * 
 * @author zyl
 * @date 2020-05-25
 */
public interface IAppointmentOrderService 
{
	/**
     * 查询预约订单信息
     * 
     * @param fId 预约订单ID
     * @return 预约订单信息
     */
	public AppointmentOrder selectAppointmentOrderById(String fId);


		

}
