package com.endaycb.slim3.simple.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="position_tree_detail")
public class PositionTreeDetail {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(nullable=false)
	private PositionTree positionTree;

	@ManyToOne
	@JoinColumn(name="id_position",nullable=false)
	private Position position;

	@Column(nullable=false)
	private TreeTipe tipe;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PositionTree getPositionTree() {
		return positionTree;
	}

	public void setPositionTree(PositionTree positionTree) {
		this.positionTree = positionTree;
	}

	public TreeTipe getTipe() {
		return tipe;
	}

	public void setTipe(TreeTipe tipe) {
		this.tipe = tipe;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	

}
