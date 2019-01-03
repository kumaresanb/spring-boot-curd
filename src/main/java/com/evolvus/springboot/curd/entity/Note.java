package com.evolvus.springboot.curd.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="notes")
@Data
@Getter
@Setter
public class Note implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 983701926757186405L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Column(name="title",nullable=false)
	private String title;
	
	@Column(name="content",nullable=false)
	private String content;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="updated_date")
	private Date updatedDate;

	@Override
	public String toString() {
		return "Note [id=" + id + ", title=" + title + ", content=" + content + ", createDate=" + createDate
				+ ", updatedDate=" + updatedDate + "]";
	}

}
