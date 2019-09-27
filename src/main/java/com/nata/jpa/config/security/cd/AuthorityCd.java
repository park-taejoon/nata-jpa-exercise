package com.nata.jpa.config.security.cd;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AuthorityCd implements GrantedAuthority{
	//@formatter:off
	ROLE_ADMIN(ROLES.ADMIN, "관리자계정"),
	ROLE_USER(ROLES.USER, "일반 사용자"),
	ROLE_ANONYMOUS(ROLES.ANONYMOUS, "로그인하지 않은 사용자.");
	//@formatter:on
	
	private String authority; 
	private String description;
	//@Secured(AuthorityCd.ROLES.USER)

	public static class ROLES{ 
		public static final String USER = "ROLE_USER"; 
		public static final String ADMIN = "ROLE_ADMIN"; 
		public static final String ANONYMOUS = "ROLE_ANONYMOUS";
	}

	public static AuthorityCd getEnum(String key) throws Exception {

		try {
			return AuthorityCd.valueOf(key);
		} catch (Exception e) {
			throw new Exception("Not Exist : " + key);
		}
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return authority;
	}
}
