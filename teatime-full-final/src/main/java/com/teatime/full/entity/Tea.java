package com.teatime.full.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tea")
public class Tea {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="tea_name")
	private String teaName;
	
	@Column(name="brand_id")
	private int brandID;
	
	@Column(name="type")
	private String type;
	
	@Column(name="stock")
	private int teaBags;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeaName() {
		return teaName;
	}

	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	public int getBrandID() {
		return brandID;
	}

	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTeaBags() {
		return teaBags;
	}

	public void setTeaBags(int teaBags) {
		this.teaBags = teaBags;
	}
	
	@Override
	public String toString() {
		return "Tea [id=" + id + ", teaName=" + teaName + ", brandID=" + brandID + ", type=" + type + ", teaBags="
				+ teaBags + "]";
	}
	
}
