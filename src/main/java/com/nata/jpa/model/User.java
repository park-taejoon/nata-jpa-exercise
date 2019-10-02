package com.nata.jpa.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="t_user")
public class User implements UserDetails{
	
	private static final long serialVersionUID = 1990051315112426863L;
	@Id
	@Column(name="user_cd",length=24)
	@GeneratedValue(strategy=GenerationType.AUTO)//ID가 자동으로 생성되어야 함
	Long cd;
	@Column(name="user_id",length=20,unique=true)
	@NonNull
	String id;
	@Column(name="user_email",nullable=false)
	@NonNull
	String email;
	@NonNull
	@Column(name="user_password",nullable=false)
	String password;
	
	@Transient
	private List<GrantedAuthority> authorities;
	@Column(name="expire_yn")
    private boolean accountNonExpired;//사용자 계정이 만료된 경우;
	@Column(name="lock_yn")
    private boolean accountNonLocked;//사용자가 잠겨 있는지 여부를 나타냅니다.
	@Column(name="credential_yn")
    private boolean credentialsNonExpired;//사용자의 자격 증명 (암호)이 만료되었는지 여부를 나타냅니다.
	@Column(name="use_yn")
    private boolean enabled;// 사용자의 사용 가능 여부를 나타냅니다.
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}
	@Override
	public String getPassword() {
		return this.password;
	}
	@Override
	public String getUsername() {
		return this.id;
	}
	@Override
	public boolean isAccountNonExpired() {
		return this.accountNonExpired;
	}
	@Override
	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}
	@Override
	public boolean isEnabled() {
		return this.enabled;
	}
	
}
