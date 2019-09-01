package com.imooc;

public class Telephoneclass {
	float screen;
	float cpu;
	public Telephoneclass() {
		System.out.println("无参数构造方法");
	}
	public Telephoneclass(float screennew, float newcpu) {
		screen = screennew;
		cpu = newcpu;
		System.out.println("有参数构造函数运行");
		
	}
}
