package com.jd.gca.beans;

/**
 * This class is used to hold contents when a message is sent by a user
 *
 * @author Joydeep Dey
 *
 */
public class MessageBean {

	private String senderIp;
	private String message;
	private String sentTimestamp;
	private String loginId;

	public String getSenderIp() {
		return senderIp;
	}

	public void setSenderIp(String senderIp) {
		this.senderIp = senderIp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSentTimestamp() {
		return sentTimestamp;
	}

	public void setSentTimestamp(String sentTimestamp) {
		this.sentTimestamp = sentTimestamp;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MessageBean [" + (senderIp != null ? "senderIp=" + senderIp + ", " : "")
				+ (message != null ? "message=" + message + ", " : "")
				+ (sentTimestamp != null ? "sentTimestamp=" + sentTimestamp + ", " : "")
				+ (loginId != null ? "loginId=" + loginId : "") + "]";
	}
}
