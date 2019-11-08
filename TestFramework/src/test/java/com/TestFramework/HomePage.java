package com.TestFramework;

public class HomePage {
	
	String url = "https://www.rte.ie/";

	public void goTo() {

		String url = "https://www.rte.ie/";
		Browser.goTo(url);		
	}

	public boolean isAt() {
		String url = "RTÉ Ireland&#39;s National Television and Radio Broadcaster";
		return Browser.title().equals(url);
	}
}


