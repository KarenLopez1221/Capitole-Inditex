package co.capitole.inditex.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BRANDS")
public class BrandsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "BRAND_ID")
	private int id;

	@Column(name = "DESC_BRAND")
	private String desc;

	public int getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}
}