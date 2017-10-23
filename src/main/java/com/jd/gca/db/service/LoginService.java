package com.jd.gca.db.service;

import com.jd.gca.db.entity.table.LoginEntity;

public interface LoginService {
	public LoginEntity getAuthenticationData(Object userId);

	public void updateLastLogin(long loginId);

	public void updateLastOnline(long loginId);
}
