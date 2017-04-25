package com.endaycb.slim3.simple.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="role_detail")
public class RoleDetail {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@Column(name="id_role",nullable=false)
	private Role role;

	@Column(nullable=false)
	private String menu;

	@Column(nullable=false)
	private Integer can_read;

	@Column(nullable=false)
	private Integer can_add;

	@Column(nullable=false)
	private Integer can_edit;

	@Column(nullable=false)
	private Integer can_delete;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public Integer getCan_read() {
		return can_read;
	}

	public void setCan_read(Integer can_read) {
		this.can_read = can_read;
	}

	public Integer getCan_add() {
		return can_add;
	}

	public void setCan_add(Integer can_add) {
		this.can_add = can_add;
	}

	public Integer getCan_edit() {
		return can_edit;
	}

	public void setCan_edit(Integer can_edit) {
		this.can_edit = can_edit;
	}

	public Integer getCan_delete() {
		return can_delete;
	}

	public void setCan_delete(Integer can_delete) {
		this.can_delete = can_delete;
	}
	
	
}
