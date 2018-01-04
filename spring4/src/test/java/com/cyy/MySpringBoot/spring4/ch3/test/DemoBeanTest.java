package com.cyy.MySpringBoot.spring4.ch3.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
@ActiveProfiles("pro")
public class DemoBeanTest {

	@Autowired
	private TestBean testBean;
	
	@Test
	public void testProInject(){
		String expected = "PRO TEST BEAN";
		String actual = testBean.getContent();
		Assert.assertEquals(expected, actual);
	}
}
