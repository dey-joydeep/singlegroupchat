package com.jd.gca.db.service;

import java.util.Date;

import com.jd.gca.db.entity.table.LoginSessionEntity;

public interface LoginSessionService {
	public Date verifyLoginSessionAndGetExpiryDate(LoginSessionEntity entity);

	public void deleteLoginSession(LoginSessionEntity entity);

	public void insertLoginSession(LoginSessionEntity entity);
}
