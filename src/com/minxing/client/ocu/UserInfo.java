package com.minxing.client.ocu;

public class UserInfo {
	private int id;
	private String login_name;
	private int account_id;
	private String name;
	
	private boolean suppended;
	private boolean hidden;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	
	public boolean isHidden() {
		return this.hidden;
	}
	
	public void setSuppended(boolean suppended) {
		this.suppended = suppended;
	}
	
	public boolean isSuppended() {
		return this.suppended;
	}

}
