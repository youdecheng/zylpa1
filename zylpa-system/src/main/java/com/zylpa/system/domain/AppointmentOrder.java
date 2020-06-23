package com.zylpa.system.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class AppointmentOrder
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	private String fId;

	/** id */
	private String fAppointmentOrderId;



	/** 预约订单编号 */
	private String fOrderNum;
	/** 产品ID */
	private String fProductId;
	/** 产品名称 */
	private String fProName;
	/** 产品牌号 */
	private String fProMark;
	/** 产品牌号 */
	private String fEnterpriseName;

	private String fPhone;
	private String fCreator;

	private BigDecimal fBond;
	/** 厂家 */
	private String fManufacturer;
	/** 预约价格 */
	private BigDecimal fPrice;
	/** 预约数量 */
	private Double fQuantity;
	/** 前台预约状态(0待上传凭证 1保证金凭证已上传审核中   2 待下单 3 下单成功 4订单失效 5订单被取消 6 全部金额支付审核中) */
	private String fAppointmentStatus;
	/** 预约时间 */
	private Date fTime;
	/** 缴纳保证金状态(0否 1是 ) */
	private String fStatus;

	private String fType;

	/** 后台订单状态(审核状态(0-审核中 1-审核通过 2-已拒绝) ) */
	private String fAuditStatus;
	/** 更新时间 */
	private Date fUpdateTime;
	/** 是否删除 */
	private String fIsDelete;


	/** 是否删除 */
	private String fDeliveryFTime;

	private String  fSaleOrderId;

	public String getFSaleOrderId() {
		return fSaleOrderId;
	}

	public void setFSaleOrderId(String FSaleOrderId) {
		this.fSaleOrderId = FSaleOrderId;
	}

	public String getfType() {
		return fType;
	}

	public void setfType(String fType) {
		this.fType = fType;
	}

	public void setFId(String fId)
	{
		this.fId = fId;
	}
	@JsonProperty("fId")
	public String getFId() 
	{
		return fId;
	}
	public void setFOrderNum(String fOrderNum) 
	{
		this.fOrderNum = fOrderNum;
	}
	@JsonProperty("fOrderNum")
	public String getFOrderNum() 
	{
		return fOrderNum;
	}
	public void setFProductId(String fProductId) 
	{
		this.fProductId = fProductId;
	}
	@JsonProperty("fProductId")
	public String getFProductId() 
	{
		return fProductId;
	}
	public void setFProName(String fProName) 
	{
		this.fProName = fProName;
	}
	@JsonProperty("fProName")
	public String getFProName() 
	{
		return fProName;
	}
	public void setFProMark(String fProMark) 
	{
		this.fProMark = fProMark;
	}
	@JsonProperty("fProMark")
	public String getFProMark() 
	{
		return fProMark;
	}
	public void setFManufacturer(String fManufacturer) 
	{
		this.fManufacturer = fManufacturer;
	}
	@JsonProperty("fManufacturer")
	public String getFManufacturer() 
	{
		return fManufacturer;
	}
	public void setFPrice(BigDecimal fPrice) 
	{
		this.fPrice = fPrice;
	}
	@JsonProperty("fPrice")
	public BigDecimal getFPrice() 
	{
		return fPrice;
	}
	public void setFQuantity(Double fQuantity) 
	{
		this.fQuantity = fQuantity;
	}
	@JsonProperty("fQuantity")
	public Double getFQuantity() 
	{
		return fQuantity;
	}
	public void setFAppointmentStatus(String fAppointmentStatus) 
	{
		this.fAppointmentStatus = fAppointmentStatus;
	}
	@JsonProperty("fAppointmentStatus")
	public String getFAppointmentStatus() 
	{
		return fAppointmentStatus;
	}
	public void setFTime(Date fTime) 
	{
		this.fTime = fTime;
	}
	@JsonProperty("fTime")
	public Date getFTime() 
	{
		return fTime;
	}
	public void setFStatus(String fStatus) 
	{
		this.fStatus = fStatus;
	}
	@JsonProperty("fStatus")
	public String getFStatus() 
	{
		return fStatus;
	}
	public void setFUpdateTime(Date fUpdateTime) 
	{
		this.fUpdateTime = fUpdateTime;
	}
	@JsonProperty("fUpdateTime")
	public Date getFUpdateTime() 
	{
		return fUpdateTime;
	}
	public void setFIsDelete(String fIsDelete) 
	{
		this.fIsDelete = fIsDelete;
	}
	@JsonProperty("fIsDelete")
	public String getFIsDelete() 
	{
		return fIsDelete;
	}

	public BigDecimal getFBond() {
		return fBond;
	}

	public void setFBond(BigDecimal fBond) {
		this.fBond = fBond;
	}

	@JsonProperty("fCreator")
	public String getFCreator() {
		return fCreator;
	}

	public void setFCreator(String fCreator) {
		this.fCreator = fCreator;
	}
	public String getfEnterpriseName() {
		return fEnterpriseName;
	}

	public void setfEnterpriseName(String fEnterpriseName) {
		this.fEnterpriseName = fEnterpriseName;
	}
	@JsonProperty("fPhone")
	public String getfPhone() {
		return fPhone;
	}

	public void setfPhone(String fPhone) {
		this.fPhone = fPhone;
	}
	@JsonProperty("fAuditStatus")
	public String getfAuditStatus() {
		return fAuditStatus;
	}



	public void setfAuditStatus(String fAuditStatus) {
		this.fAuditStatus = fAuditStatus;
	}
	@JsonProperty("fDeliveryFTime")
	public String getfDeliveryFTime() {
		return fDeliveryFTime;
	}
	@JsonProperty("fAppointmentOrderId")
	public String getfAppointmentOrderId() {
		return fAppointmentOrderId;
	}

	public void setfAppointmentOrderId(String fAppointmentOrderId) {
		this.fAppointmentOrderId = fAppointmentOrderId;
	}

	public void setfDeliveryFTime(String fDeliveryFTime) {
		this.fDeliveryFTime = fDeliveryFTime;
	}

}
