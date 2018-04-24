package cn.iclass.backend;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import cn.iclass.backend.service.PersonSay;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestHello {
	
	@Resource
	private PersonSay say;

	@Test
	public void testSay(){
		Assert.assertEquals("Hello World!", say.say());
	}
}
