package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑凭证延期接口
 *
 * @author auto create
 * @since 1.0, 2018-04-27 22:32:24
 */
public class KoubeiTradeTicketTicketcodeDelayModel extends AlipayObject {

	private static final long serialVersionUID = 1489536415972172216L;

	/**
	 * INTERNAL_CODE(券码),EXTERNAL_CODE(外部券码),默认INTERNAL_CODE
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 延至日期
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 请求id，唯一标识一次请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 凭证码
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTicketCode() {
		return this.ticketCode;
	}
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

}