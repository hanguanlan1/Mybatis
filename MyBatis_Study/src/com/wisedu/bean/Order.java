/**
 * 
 */
package com.wisedu.bean;

/**
 * @author 01212021
 * @time 2016-4-21ÏÂÎç07:20:48
 */
public class Order {
	private int orderId; 
	private String orderNo;
	private float orderPrice;

	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the orderPrice
	 */
	public float getOrderPrice() {
		return orderPrice;
	}

	/**
	 * @param orderPrice
	 *            the orderPrice to set
	 */
	public void setOrderPrice(float orderPrice) {
		this.orderPrice = orderPrice;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderNo=" + orderNo
				+ ", orderPrice=" + orderPrice + "]";
	}

}
