package com.nata.jpa.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@Table(name="t_issue_member",uniqueConstraints= {@UniqueConstraint(name="issue_user_uniq",columnNames = { "issue_cd","user_cd"})})
@Table(name="t_issue_member")
@Entity
public class IssueMember {
	@Id
	@Column(name="seq")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long cd;
	@ManyToOne
	@JoinColumn(name="issue_cd")
	Issue issue;
	@ManyToOne
	@JoinColumn(name="user_cd")
	User iuser;
	
	String writer;
	@Temporal(TemporalType.TIMESTAMP)
    Date write_dt;
   
	public void chageIssue(Issue issue) {
		this.issue = issue;
		issue.getMembers().add(this);
	}
	public void changeIuser(User iuser) {
		this.iuser = iuser;
		//iuser.getIMembers().add(this);
	}
}
