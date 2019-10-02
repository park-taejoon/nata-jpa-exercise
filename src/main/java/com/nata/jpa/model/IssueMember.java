package com.nata.jpa.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name="t_issue_member",uniqueConstraints= {@UniqueConstraint(name="issue_user_uniq",columnNames = { "issue_cd","user_cd"})})
@Entity
public class IssueMember {
	@Id
	@Column(name="seq")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long cd;
	
	@Column(name="issue_cd",insertable=false, updatable=false)
	Long issue_cd;
	@Column(name="user_cd",insertable=false, updatable=false)
	Long user_cd;
	
	String writer;
	@Temporal(TemporalType.TIMESTAMP)
    Date write_dt;
   
	
}
