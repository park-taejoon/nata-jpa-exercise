package com.nata.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name="t_project_member",uniqueConstraints= {@UniqueConstraint(name="project_user_uniq",columnNames = { "project_cd","user_cd"})})
@Entity
public class ProjectMember {
	@Id
	@Column(name="project_cd",length=24,nullable=false)
	String project_cd;
	@Column(name="user_cd",length=24,nullable=false)
	String user_cd;
	@Column(name="use_yn",length=1)
	String use_yn;
	@Column(name="admin_yn",length=1)
	String admin_yn;
	String writer;
	@Temporal(TemporalType.TIMESTAMP)
    Date write_dt;
    String updater;
    @Temporal(TemporalType.TIMESTAMP)
    Date update_dt;
	
}
