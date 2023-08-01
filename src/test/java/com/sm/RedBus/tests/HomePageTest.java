package com.sm.RedBus.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sm.RedBus.base.Base;
import com.sm.RedBus.utils.AppConstants;

public class HomePageTest extends Base {

	@Test(priority = 1)
	public void hmPageTitleTest() {
		String actTitle = hmPage.getHomePageTitle();
		Assert.assertEquals(actTitle, AppConstants.HOME_PAGE_TITLE_VALUE);
	}

	@Test(priority = 2)
	public void hmPageLogoTest() {
		Assert.assertTrue(hmPage.isLogoExist());

	} 

	@Test(priority = 3)
	public void hmPageFromTextBoxTest() {
		Assert.assertTrue(hmPage.isfromtextboxdisplay());

	}

	@Test(priority = 4)
	public void hmPageToTextBoxTest() {
		Assert.assertTrue(hmPage.istotextboxdisplay());

	}

	@Test(priority = 5)
	public void hmPageSearchBtnTest() {
		Assert.assertTrue(hmPage.issearchbtndisplay());

	}
     
}