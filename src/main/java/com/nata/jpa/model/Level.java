package com.nata.jpa.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="t_level")
public class Level {
	@Id
	@Column(name="level_cd")
	@GeneratedValue(strategy=GenerationType.AUTO)//ID가 자동으로 생성되어야 함
	long cd;
	@Column(name="level_name")
	@NonNull
	String name;
	@Column(name="level_dec")
	String dec;
}
