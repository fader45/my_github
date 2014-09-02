package org.fmy.core.asyn;

//异步调用对象
public class TargetService {
	
	public String test(String name) {
		System.out.println(name + " test is execute!");
		return name;
	}

}
