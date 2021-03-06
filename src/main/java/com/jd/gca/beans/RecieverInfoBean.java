package com.jd.gca.beans;

/**
 * Data representation for chat window
 *
 * @author Joydeep Dey
 *
 */
public class RecieverInfoBean {

	private Long messageId;
	private String senderPcName;
	private String message;
	private String sentTimestamp;
	private String senderName;
	private String loginId;

	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public String getSenderPcName() {
		return senderPcName;
	}

	public void setSenderPcName(String senderId) {
		this.senderPcName = senderId;
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

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RecieverInfoBean [" + (messageId != null ? "messageId=" + messageId + ", " : "")
				+ (senderPcName != null ? "senderPcName=" + senderPcName + ", " : "")
				+ (message != null ? "message=" + message + ", " : "")
				+ (sentTimestamp != null ? "sentTimestamp=" + sentTimestamp + ", " : "")
				+ (senderName != null ? "senderName=" + senderName + ", " : "")
				+ (loginId != null ? "loginId=" + loginId : "") + "]";
	}

}
