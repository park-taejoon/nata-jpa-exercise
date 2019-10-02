package com.nata.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.nata.jpa.model.enums.ProjectMemberStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name="t_project_member",uniqueConstraints= {@UniqueConstraint(name="project_user_uniq",columnNames = { "project_cd","user_cd"})})
@Entity
public class ProjectMember {
	@Id
	@Column(name="seq")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long cd;
	
	@Column(name="project_cd",insertable=false, updatable=false)
	Long projectCd;
	@Column(name="user_cd",insertable=false, updatable=false)
	Long userCd;
	
	@Enumerated(EnumType.STRING)
	ProjectMemberStatus member_status;
	
	String writer;
	@Column(name="user_cd")
	@Temporal(TemporalType.TIMESTAMP)
    Date write_dt;
    String updater;
    @Temporal(TemporalType.TIMESTAMP)
    Date update_dt;
	
}
