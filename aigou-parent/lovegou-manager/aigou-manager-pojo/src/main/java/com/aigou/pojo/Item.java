package com.aigou.pojo;

import java.util.Date;

/**
 * 商品信息
 * @author hebin
 *
 */
public class Item {
	//商品编号
	private Long id;
	//商品的标题
	private String title;
	//商品的卖点
	private String sellPoint;
	//商品的价格
	private Long price;
	//商品的数量
	private Integer num;
	//商品的条形码
	private String barcode;
	//商品的图片地址
	private String image;
	//商品的分类
	private Long cid;
	//商品的状态
	private Byte status;
	//商品的创建时间
	private Date created;
	//商品的修改时间
	private Date updated;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSellPoint() {
		return sellPoint;
	}
	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
}
