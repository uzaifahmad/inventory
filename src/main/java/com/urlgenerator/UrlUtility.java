package com.urlgenerator;

import java.util.HashMap;

public class UrlUtility {

	private String baseUrl;

	public UrlUtility(String baseUrl) {

		this.baseUrl = baseUrl;
		try {

			isValid(baseUrl);
			System.out.println("valid");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void isValid(String url) throws Exception {

		if (!(url.indexOf("http://localhost/") == 0) | (url.indexOf("http://localhost:") == 0) )
		{
			if(!(url.indexOf("http:://")==0) ) {
				
				throw new Exception("Invalid URL.");
			}	
		}
		if(url.contains(" ")) {
			throw new Exception("Invalid URL.");
		}
		}

//		if (!(url.contains("http://www.") | url.contains("https://www."))
//				& (url.indexOf("http") == 0 & !url.contains(" "))) {
//
//			throw new Exception("Invalid URL.");
//		}


	public void addParams(HashMap<String, String> map) {

		map.forEach((k, v) -> {
			if (baseUrl.contains("?")) {
				baseUrl = baseUrl.concat("&" + k + "=" + v);
			} else {
				baseUrl = baseUrl.concat("?" + k + "=" + v);
			}
		});

	}

	public void addParams(String k, String v) {

		if (baseUrl.contains("?")) {
			baseUrl = baseUrl.concat("&" + k + "=" + v);
		} else {
			baseUrl = baseUrl.concat("?" + k + "=" + v);
		}

	}

	public void addPath(HashMap<String, String> map) {

		map.forEach((k, v) -> {

			baseUrl = baseUrl.replace("{" + k + "}", v);

		});

	}

	public void addPath(String k, String v) {

		baseUrl = baseUrl.replace("{" + k + "}", v);

	}

	public String getUrl() {
		return baseUrl;
	}

}
