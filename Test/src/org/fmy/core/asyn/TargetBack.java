package org.fmy.core.asyn;

import com.googlecode.asyn4j.core.callback.AsynCallBack;

//回调需继承AsynCallBack抽象类
public class TargetBack extends AsynCallBack {

	private static final long serialVersionUID = 3448275677739070615L;

	@Override
	public void doNotify() {
		//输出异步方法调用结果
		System.out.println(this.methodResult);

	}

}
