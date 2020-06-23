package com.zylpa.web.mapper;



import com.zylpa.web.domain.AppointmentOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 预约订单 数据层
 * 
 * @author zyl
 * @date 2020-05-25
 */
@Repository
public interface AppointmentOrderMapper 
{
	/**
     * 查询预约订单信息
     * 
     * @param fId 预约订单ID
     * @return 预约订单信息
     */
	public AppointmentOrder selectAppointmentOrderById(String fId);


	
}