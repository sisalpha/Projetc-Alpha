package com.projectalpha.ml.model;

public final class LoginML {

	private String clientId = "1981697416912758";
	private String clientSecret = "1m8sqGBXgVG27XXfkfHytAZ7MjfnUmyo";
	
	private String token;
	private String url;
	
	public static LoginML INSTANCE;
	
	private LoginML(){
		token = "null";
		url = "null";
	}

	public static synchronized LoginML getInstance(){
		if(INSTANCE == null){
			INSTANCE = new LoginML();
		}
		return INSTANCE;
	}
	
	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
