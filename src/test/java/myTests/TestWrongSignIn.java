package myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;

public class TestWrongSignIn extends Common {
	
	@Test
	public void signInWithWrongCredentials() {
	    pIndex.clickOnSingInLink();
	    String email = "estefania@gmail.com";
	    String password = "estefania";
		String expectedBannerText = "Authentication failed.";
		pSingIn.setEmail(email);
		pSingIn.setPassword(password);
		pSingIn.clickOnSingInButton();
		Assert.assertEquals(pSingIn.getSignInBannerText(), expectedBannerText);
	}

}
