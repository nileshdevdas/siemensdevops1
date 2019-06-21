package com.siemens.devopsdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsdemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bpm.vinsys.com/");
		driver.findElement(By.id("Username")).sendKeys("nilesh.devdas@vinsys.com");
		driver.findElement(By.id("UserPassword")).sendKeys("abcd@1234");
		driver.findElement(By.cssSelector("body > div > div > form > button")).click();;
	}

}
