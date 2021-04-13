package com.centric.stepdefinition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.centric.objectrepository.BOMCreationPage;
import com.centric.objectrepository.BusinessPlanningPage;
import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.DocumentPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.SetupPageTK;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.StyleInspectionPage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CalendarSetupSteps extends Commonactions {

	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	PopupPage pp = new PopupPage();
	ConfigurationPage co = new ConfigurationPage();
	BOMCreationPage bc = new BOMCreationPage();
	SourcingPage sp = new SourcingPage();


	@Then("User moves into Calendar Template setup")
	public void user_moves_into_Calendar_Template_setup() throws Throwable {
		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(bc.getProdSpecSetup());
		ca.click(bc.getProdSpecSetup());
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Calendar Templates" +Keys.ENTER);
		ca.eleToBeClickable();
	}

	@And("User create Calendar Type for season {string},{string},{string}")
	public void user_create_Calendar_Type_for_season(String CalType, String CalTemplate, String CalDesc) throws Throwable {
		Commonactions.isElementPresent(co.getNewTemplatecalendarbtn());
		ca.click(co.getNewTemplatecalendarbtn());
		Commonactions.isElementPresent(co.getCalendartype());
		ca.insertText(co.getCalendartype(), CalType);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTemplatecalendar());
		ca.insertText(co.getTemplatecalendar(), CalTemplate);
		Commonactions.isElementPresent(co.getCalendardescription());
		ca.insertText(co.getCalendardescription(), CalDesc);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
	}
	@Then("user create season Template activity under Calendar Type {string},{string},{string},{string},{string},{string}")
	public void user_create_season_Template_activity_under_Calendar_Type(String TempActivity, String ActivityType, String ActivityLevel, String TrackingType, String TrackingPhase, String TrackingState) throws Throwable {
		String[] TempActivityvalue = TempActivity.split(",");
		String[] ActivityTypevalue = ActivityType.split(",");
		String[] ActivityLevelvalue = ActivityLevel.split(",");
		String[] TrackingTypevalue = TrackingType.split(",");
		String[] TrackingPhasevalue = TrackingPhase.split(",");

		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[0]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getActivityLevel());
		ca.insertText(co.getActivityLevel(), ActivityLevelvalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[1]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getActivityLevel());
		ca.insertText(co.getActivityLevel(), ActivityLevelvalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(co.getMilestonneEdit());
		ca.click(co.getMilestonneEdit());
		Commonactions.isElementPresent(co.getActivityLevel());
		ca.insertText(co.getActivityLevel(), ActivityLevelvalue[2]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[2]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingTypevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingPhase());
		ca.insertText(co.getTrackingPhase(), TrackingPhasevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingState);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<100;i++)
		{
			ca.click(co.getCalslider());
		}
		Commonactions.isElementPresent(co.getArtworkIcon());
		ca.click(co.getArtworkIcon());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e1, "star");
		ca.eleToBeClickable();
		ca.jsMouseOver();

		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[3]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingPhase());
		ca.insertText(co.getTrackingPhase(), TrackingPhasevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingState);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getMatchAll());
		ca.click(co.getMatchAll());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<100;i++)
		{
			ca.click(co.getCalslider());
		}
		Commonactions.isElementPresent(co.getIDSTrackIcon());
		ca.click(co.getIDSTrackIcon());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e2, "star");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		System.out.println("Calendar_Season for season created successfully");
		
	}

	@And("User create Calendar Type for material {string},{string},{string}")
	public void user_create_Calendar_Type_for_material(String CalType, String CalTemplate, String CalDesc) throws Throwable {
		Commonactions.isElementPresent(co.getNewTemplatecalendarbtn());
		ca.click(co.getNewTemplatecalendarbtn());
		Commonactions.isElementPresent(co.getCalendartype());
		ca.insertText(co.getCalendartype(), CalType);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTemplatecalendar());
		ca.insertText(co.getTemplatecalendar(), CalTemplate);
		Commonactions.isElementPresent(co.getCalendardescription());
		ca.insertText(co.getCalendardescription(), CalDesc);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
		}

	@Then("user create material Template activity under Calendar Type {string},{string},{string},{string},{string}")
	public void user_create_material_Template_activity_under_Calendar_Type(String TempActivity, String ActivityType, String ActivityLevel, String TrackingType, String TrackingState) throws Throwable {
		Commonactions.isElementPresent(co.getExpandIcon());
		ca.click(co.getExpandIcon());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e2, "Calendar_MSG");
		ca.eleToBeClickable();
		e2.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		
		String[] TempActivityvalue = TempActivity.split(",");
		String[] ActivityTypevalue = ActivityType.split(",");
		String[] ActivityLevelvalue = ActivityLevel.split(",");
		String[] TrackingTypevalue = TrackingType.split(",");
		String[] TrackingStatevalue = TrackingState.split(",");

		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[0]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getActivityLevel());
		ca.insertText(co.getActivityLevel(), ActivityLevelvalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[1]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingTypevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingStatevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getMatchAll());
		ca.click(co.getMatchAll());
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[2]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingStatevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getMatchAll());
		ca.click(co.getMatchAll());
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[3]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingTypevalue[2]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingStatevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[2]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getPredecessors());
		ca.insertText(co.getPredecessors(), "");
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys(Keys.DOWN);	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getBOMTrackchecckbox());
		ca.click(co.getBOMTrackchecckbox());
		ca.click(co.getManualcheckbox());
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[4]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Calendar_MSG for material created successfully");
		
	}


}
