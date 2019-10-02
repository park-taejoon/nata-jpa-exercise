package com.nata.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nata.jpa.model.enums.ProjectMemberStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Table(name="t_project_member")
@Entity
public class ProjectMember {
	@Id
	@Column(name="seq")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long cd;
	
	@ManyToOne
	@JoinColumn(name="project_cd")
	Project project;
	@ManyToOne
	@JoinColumn(name="user_cd", insertable=false, updatable=false)
	User puser;
	
	@Enumerated(EnumType.STRING)
	ProjectMemberStatus member_status;
	
	String writer;
	@Column(name="user_cd")
	@Temporal(TemporalType.TIMESTAMP)
    Date write_dt;
    String updater;
    @Temporal(TemporalType.TIMESTAMP)
    Date update_dt;
	
    public void changeProject(Project project) {
    	//연관관계 편의 메서드.
		this.project = project;
		project.getMembers().add(this);
	}
    public void changePuser(User puser) {
		this.puser = puser;
		//puser.getPMembers().add(this);
	}
    
}
