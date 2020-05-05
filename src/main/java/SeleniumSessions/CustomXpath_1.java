package SeleniumSessions;

import org.openqa.selenium.By;

public class CustomXpath_1 {

	public static void main(String[] args) {
		
		//Xpath: is address of the element in HTML DOM
		//1. Absolute xpath: hierarchy based xpath; coming from the highest node and then traversing each and every parent and reaching to the particular element. eg //html/body/div/div[2]/div[3]/ul/li/a
		//2. Relative/custom xpath: create your own custom xpath eg //input[@id='test']
		
		//htmltag[@property='value']
		//input[@id='username']
		//*[@id='username']
		
		//htmltag[@property1='value' and @property2='value']
		//input[@id='username' and @type='email']
		//button[@id='loginBtn' and @type='submit']
		
		//button[@id='loginBtn' and @type]
		
		//button[@id and @type]
		//button[@id='ssoBtn' and @type]
		
		//input
		//input[@name='username']
		
		// (//input[@class='form-control'])[1]
		// (//input[@class='form-control'])[2]
		
		// (//input[@class='form-control'])[position()=1]
		// (//input[@class='form-control'])[position()=2]
		// (//input[@class='form-control'])[last()]
		
		//i18n-string[text()='Sign up']
		//a//i18n-string[text()='Sign up']
		
		//a[text()='Sign Up']
		
		//*[text()='Remember me']
		
		//a
		//ul[@class='nav navbar-nav navbar-right']/li/a --------------> get collection of 6 elements by findelements
		//ul[@class='nav navbar-nav navbar-right']/li/a[text()='Pricing']
		//li/a[text()='Pricing']
		//a[text()='Pricing']
		
		//--->for direct and indirect both childs and /---> for indirect child
		//div[@id='main_b_footer_second_block']/ul/li/a
		//div[@id='main_b_footer_second_block']//li/a
		
		//div/input ---->2
		//div//input ----->3 --- direct + indirect both child elements ---->2+1 = 3
		
		//contains(): is used to handle the dynamic elements or text
		//input[contains(@id,'username')]--- we are using comma for contains() because it is a method and have to write the parameters as eg @id and username
		//input[@id='username']
		
		//input[contains(@id,'user')]
		//input[contains(@id,'name')]
				
//		concept of dynamic:
//		<input id = 'test_123'>
//		<input id = 'test_2334'>
//		<input id = 'test_8979'>
//		//input[contains(@id,'test_')]
		
		//input[contains(@id,'user') and @type='email']
		//input[contains(@id,'user') and contains(@type,'email')]
			
		//i18n-string[contains(@data-key,'login.signupLink.cta') and text()='Sign up']
		
		//backward traversing in xpath: /..
		//input[@id='username']/../../../../../../../../../..
		
		//crow path is a plugin available in chrome browser which will tell you the basic xpath
		
		
		//Custom CSSSelector:
		//CSS - Cascaded Style Sheet
		//html is use to create the webpage, html is the standard language to create the webpage; to give the styling, look and feel, color, height, weight, ... all these coming from CSS
		//combination of html and CSS makes the webpage colorful and lively
		//CSS is defined in the class
		// there is no text function in CSS
		
		//id----> #id or htmltag#id ---> single
		//class ----> .classname or htmltag.classname ----> single or multiple classes
		//c1 c2 c3...cn
		//htmltag.c1.c2.c3...cn
		//.c1.c2.c3...cn
		
		// #username
		// input#username
		
		// .login-email
		// input.login-email
		// .form-control.private-form__control.login-email --->multiple classes
		// input.form-control.private-form__control.login-email
		
		// input.login-email#username
		// input.form-control.private-form__control.login-email#username
		// input#username.login-email 
		
		// input[id='username'] ----> single property
		// input[id='username'][type='email'] -----> multiple properties
		
		//parent child concept in CSS: use space or '>' for direct child; there is no indirect child concept in CSS
		// div.private-form__input-wrapper input#username
		// div.private-form__input-wrapper>input#username
		// ul.list-nav-links li a
		
		// input[id*='user'] ----> contains 
		// input[id^='user'] ----> starts-with (^ - carate)
		// input[id$='name'] -----> endswith
		
		//comma in CSS: to get the number of elements
		// div.private-form__input-wrapper, input#username
		// input#username, input#password
		// input#username, input#password, #loginBtn
		//input.login-email, input#password, #loginBtn
		
		//nth-of-type:
		// ul.list-nav-links li:nth-of-type(1) ----1st element
		// ul.list-nav-links li:nth-of-type(n)--- all elements
		
		//following sibling in CSS using +
		// div.private-form__input-wrapper + div
		
		//not operator in CSS:
		// input.form-control.private-form__control:not(.login-password)
		// input.form-control.private-form__control:not(#password)
		
		
		
		By email = By.className("login-email");
		By email1 = By.xpath("//input[@class='form-control private-form__control login-email']");
		By email2 = By.cssSelector("input.form-control.private-form__control.login-email");
		
		//limitations of CCS:
		//there is no text function available in CSS
		
		
		
		
		
		
		
		
	}

}
