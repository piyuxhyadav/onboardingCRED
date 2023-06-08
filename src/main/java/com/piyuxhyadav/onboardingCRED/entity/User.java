package com.piyuxhyadav.onboardingCRED.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_id;
	private String f_name;
	private String l_name;
	private String p_number;
	private String s_delete="false";


	public User() {
		
	}
	
	public User(String f_name, String l_name, String p_number) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.p_number = p_number;

	}

	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getP_number() {
		return p_number;
	}
	public void setP_number(String p_number) {
		this.p_number = p_number;
	}

	public String getS_delete() {
        return s_delete;
    }
	public void setS_delete(String s_delete) {
        this.s_delete = s_delete;
    }
}
