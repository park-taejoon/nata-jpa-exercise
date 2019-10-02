package com.nata.jpa.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name="t_project")
@Entity
public class Project {
	@Id
	@Column(name="project_cd",length=24)
	String cd;
	@Column(name="project_subject",length=20)
	String subject;
	@Lob
	String desc;
	String use_yn;
	String complete_yn;
	String writer;
	@Temporal(TemporalType.TIMESTAMP)
    Date write_dt;
    String updater;
    @Temporal(TemporalType.TIMESTAMP)
    Date update_dt;
   
	
}
