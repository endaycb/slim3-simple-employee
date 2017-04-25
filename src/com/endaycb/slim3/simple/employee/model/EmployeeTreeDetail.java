package com.endaycb.slim3.simple.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="employee_tree_detail")
public class EmployeeTreeDetail {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_employee_tree", nullable=false)
	private EmployeeTree employeeTree;
	
	@ManyToOne
	@JoinColumn(name="id_employee", nullable=false)
	private Employee employee;
	
	@Column(nullable=false)
	private TreeTipe tipe;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EmployeeTree getEmployeeTree() {
		return employeeTree;
	}

	public void setEmployeeTree(EmployeeTree employeeTree) {
		this.employeeTree = employeeTree;
	}

	public TreeTipe getTipe() {
		return tipe;
	}

	public void setTipe(TreeTipe tipe) {
		this.tipe = tipe;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
