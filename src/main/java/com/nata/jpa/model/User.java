package com.nata.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity //jpa 엔티티를 지정하면 디비 테이블과 매핑되며, 자바 인터페이스를 Repository로 지정하면 테이블로 자동생성.
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)//ID가 자동으로 생성되어야 함
	long id;
	@NonNull
	String nick;
	@NonNull
	String email;
	
}
