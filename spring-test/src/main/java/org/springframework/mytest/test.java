package org.springframework.mytest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sheng on 02/12/2018
 *
 * @author sheng
 */
public class test {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("test.properties");

		application.getBean("test");
	}
}
