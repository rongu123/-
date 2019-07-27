package cn.tedu.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SampleBean {
	//就是更
	//荣伟利！！萨达所大所
	//Alex，Lucy，Kitty，Henry
	public List<String> names;
	
	//Bei Shang Guang Shen Shi
	public Set<String> cities;
	
	// username=Jack password=123456 from=shijiazhuang
	public Map<String, String> session;
	
	//9 5 2 7
	public Integer[] numbers;
	
	//JDBC配置
	public Properties config;
	
	public void setConfig(Properties config) {
		this.config = config;
	}

	public void setNumbers(Integer[] numbers) {
		this.numbers = numbers;
	}

	public void setSession(Map<String, String> session) {
		this.session = session;
	}

	public void setCities(Set<String> cities) {
		this.cities = cities;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
	
}
