package com.paynet.oops;

interface WebDriverDemo
{
	void get(String url);
	String getTitle();
	void quit();
}

class ChromeDriverDemo implements WebDriverDemo
{
	public void chromeOnly()
	{
		System.out.println("chrome only");
	}
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("navigate to url in chrome");
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void quit() {
		// TODO Auto-generated method stub
	}
}

class FirefoxDriverDemo implements WebDriverDemo
{
	public void firefoxOnly()
	{
		System.out.println("firefoxOnly");
	}
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("navigate to url in firefox");
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	
	
}

public class BrowserDemo {

	public static void main(String[] args) {
		
		WebDriverDemo driver=new ChromeDriverDemo();
			
		driver.get("");
		driver.quit();
		
	}

}
