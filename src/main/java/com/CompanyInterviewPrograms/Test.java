package com.CompanyInterviewPrograms;

public class Test {
	private static Test t = null;

	private Test() {

	}

	public static Test getTest() {

		if (t == null) {
			t = new Test();
		}
		return t;
	}

}

class client {
	public static void main(String[] args) {
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());

	}

}