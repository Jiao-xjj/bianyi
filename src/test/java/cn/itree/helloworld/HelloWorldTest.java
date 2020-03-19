package cn.itree.helloworld;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;



public class HelloWorldTest {

	private static HelloWorld helloWorld = new HelloWorld();
	
	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testHelloWorld(){
		helloWorld.helloWorld(1);
		Assert.assertEquals(1,helloWorld.helloWorld(1));
	}
}
