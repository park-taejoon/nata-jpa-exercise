package com.nata.jpa.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nata.jpa.model.enums.CompleteStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name="t_issue")
@Entity
public class Issue {
	@Id
	@Column(name="issue_cd")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long cd;
	
	@Column(name="issue_subject",length=20)
	String subject;
	@Lob
	@Column(name="issue_desc",nullable=true)
	String desc;
	
	@Enumerated(EnumType.STRING)
	CompleteStatus complete_status;
	String writer;
	@Temporal(TemporalType.TIMESTAMP)
    Date write_dt;
    String updater;
    @Temporal(TemporalType.TIMESTAMP)
    Date update_dt;
   
	
}
