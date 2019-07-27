package cn.tedu.spring;

public class ValueBean {
	
	//SampleBean中names的第三个值
	public String name;
	
	//SampleBean中session的from
	public String from;
	
	//SampleBean中config的driver
	public String driver;
	
	//SampleBean中cities的第2个
	public String city;
	
	public void setCity(String city) {
		this.city = city;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
