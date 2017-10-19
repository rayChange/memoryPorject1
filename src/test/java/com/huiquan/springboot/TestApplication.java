package com.huiquan.springboot;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.huiquan.service.IStudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestApplication {
	
	@Autowired
	IStudentService studentService;
	
	@Test(expected=Exception.class)
	public void testBoot(){
		studentService.throwExceptionFunction();
	}
	
	@Test
	public void testBoot1(){
		studentService.getStudentById(3);
	}
	
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.huiquan.springboot.Foo");
			Method method = c.getMethod("method2", null);
			method.invoke(c, null);
			
			Foo foo = (Foo)c.newInstance();
			Field ageField = c.getDeclaredField("age");
			ageField.setAccessible(true);
			ageField.set(foo, "15");
			System.out.println(foo.getAge());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Foo {
	
	private String age;
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public static void method1(int arg1,int arg2){
		System.out.println("method1"+arg1+arg2);
	}
	public static void method2(){
		System.out.println("method2");
	}
}

