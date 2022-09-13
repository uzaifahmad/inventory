package com.urlgenerator;


public class Driver {

	public static void main(String[] args)  {
//		
//		HashMap<String, String> query = new HashMap<String, String>();
//		HashMap<String, String> path = new HashMap<String, String>();
//		path.put("storeId", "2343");
//		path.put("id", "123456");
//		
//		query.put("filter", "name");
//		query.put("name", "hair_oil");
//		query.put("price", "less_than_20");

		UrlUtility url = new UrlUtility("http://localhost/products");
	
		//		url.addPath(path);
		//		url.addParams(query);
//		url.addPath("storeId", "2343");
//		url.addPath("id", "554646");
//		url.addParams(query);
//		System.out.println(url.getUrl());
	}

}
