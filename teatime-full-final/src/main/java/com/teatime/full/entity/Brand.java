package com.teatime.full.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="brand")
public class Brand {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="brand_name")
	private String brandName;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="brand_id")
	private List<Tea> teas;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<Tea> getTeas() {
		return teas;
	}

	public void setTeas(List<Tea> teas) {
		this.teas = teas;
	}
	
	public void addTea(Tea theTea) {
		
		if(teas==null) {
			teas = new ArrayList<>();
		}
		
		teas.add(theTea);
		}
	
	
	@Override
	public String toString() {
		return "Brand [id=" + id + ", brandName=" + brandName + "]";
	}
	

}
