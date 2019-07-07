package org.salem.recaptcha.dto;

public class RecaptchaDTO {	
	private String success;
	private String challenge_ts;
	private String hostname;
	private String score;
	private String action;
	
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getChallenge_ts() {
		return challenge_ts;
	}
	public void setChallenge_ts(String challenge_ts) {
		this.challenge_ts = challenge_ts;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "RecaptchaDTO [success=" + success + ", challenge_ts=" + challenge_ts + ", hostname=" + hostname
				+ ", score=" + score + ", action=" + action + "]";
	}

}
