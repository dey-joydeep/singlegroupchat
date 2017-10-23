package com.jd.gca.db.dao;

import com.jd.gca.db.entity.table.LoginEntity;

public interface LoginDAO {
	public LoginEntity getAuthenticationData(Object userId);

	public void updateLastLogin(long loginId);

	public void updateLastOnline(long loginId);
}
