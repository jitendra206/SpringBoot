package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@Table(name="product")
@ToString
public class Product {

	@Id
	@GeneratedValue
	private Integer pid;
	private String pcode;
	private Double pcost;

	public Product() {
		super();
	}

	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public Double getPcost() {
		return pcost;
	}

	public void setPcost(Double pcost) {
		this.pcost = pcost;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pcode=" + pcode + ", pcost=" + pcost + "]";
	}
	

}
