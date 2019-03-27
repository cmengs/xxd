package com.xxd.models;

import java.math.BigDecimal;

/**
 * 购物订单详情
 * @author Liang
 * @version 1.0
 */

public class XxdBuyOrderDetails {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_buy_order_details.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_buy_order_details.price
     *
     * @mbggenerated
     */
    private Integer price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_buy_order_details.buy_order_id
     *
     * @mbggenerated
     */
    private Integer buyOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_buy_order_details.num
     *
     * @mbggenerated
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_buy_order_details.goods_id
     *
     * @mbggenerated
     */
    private Integer goodsId;

    private Short sta;
    
    private String staCon;
    
    private String name;
    
    private String show_img_dir;
    
    private BigDecimal prices;
    
    private String format_name;
    
    private Integer ownership_leader_id;
    
    private String expressNo;
    
    private String time;
    
    private Short type;
    
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_buy_order_details.id
     *
     * @return the value of xxd_buy_order_details.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_buy_order_details.id
     *
     * @param id the value for xxd_buy_order_details.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_buy_order_details.price
     *
     * @return the value of xxd_buy_order_details.price
     *
     * @mbggenerated
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_buy_order_details.price
     *
     * @param price the value for xxd_buy_order_details.price
     *
     * @mbggenerated
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_buy_order_details.buy_order_id
     *
     * @return the value of xxd_buy_order_details.buy_order_id
     *
     * @mbggenerated
     */
    public Integer getBuyOrderId() {
        return buyOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_buy_order_details.buy_order_id
     *
     * @param buyOrderId the value for xxd_buy_order_details.buy_order_id
     *
     * @mbggenerated
     */
    public void setBuyOrderId(Integer buyOrderId) {
        this.buyOrderId = buyOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_buy_order_details.num
     *
     * @return the value of xxd_buy_order_details.num
     *
     * @mbggenerated
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_buy_order_details.num
     *
     * @param num the value for xxd_buy_order_details.num
     *
     * @mbggenerated
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_buy_order_details.goods_id
     *
     * @return the value of xxd_buy_order_details.goods_id
     *
     * @mbggenerated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_buy_order_details.goods_id
     *
     * @param goodsId the value for xxd_buy_order_details.goods_id
     *
     * @mbggenerated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

	public Short getSta() {
		return sta;
	}

	public void setSta(Short sta) {
		this.sta = sta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShow_img_dir() {
		return show_img_dir;
	}

	public void setShow_img_dir(String show_img_dir) {
		this.show_img_dir = show_img_dir;
	}

	public BigDecimal getPrices() {
		return prices;
	}

	public void setPrices(BigDecimal prices) {
		this.prices = prices;
	}

	public String getStaCon() {
		return staCon;
	}

	public void setStaCon(String staCon) {
		this.staCon = staCon;
	}

	public String getFormat_name() {
		return format_name;
	}

	public void setFormat_name(String format_name) {
		this.format_name = format_name;
	}

	public Integer getOwnership_leader_id() {
		return ownership_leader_id;
	}

	public void setOwnership_leader_id(Integer ownership_leader_id) {
		this.ownership_leader_id = ownership_leader_id;
	}

	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}
	
}