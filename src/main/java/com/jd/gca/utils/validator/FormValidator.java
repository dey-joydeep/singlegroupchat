package com.jd.gca.utils.validator;

import java.util.Map;

import com.jd.gca.resources.Commons;
import com.jd.gca.resources.Messages;

public class FormValidator {

	public static final String validateLoginForm(final Map<String, String> formData) {
		String message = null;
		String userId = formData.get(Commons.ReqParams.USER_ID);
		String password = formData.get(Commons.ReqParams.PASSWORD);

		if (userId == null || password == null)
			message = Messages.Login.CREDENTIAL_EMPTY;
		return message;
	}
}
