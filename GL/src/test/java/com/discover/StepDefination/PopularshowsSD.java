package com.discover.StepDefination;

import org.openqa.selenium.support.PageFactory;

import com.discover.pages.Shows;
import com.webdriverUtils.Commonfunctions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class PopularshowsSD extends Commonfunctions {

	//Shows show=PageFactory.initElements(driver,Shows.class);
	Shows show= new Shows();
	@Given("^Navigate to \"([^\"]*)\"$")
	public void navigate_to(String arg1) throws Throwable {
		driverSetup();
		show.launchURL();
		
	}
		
	

	@When("^Scroll down to popular shows$")
	public void scroll_down_to_popular_shows() throws Throwable {
		show.scrollPopularShows();
		
	}

	@And("^Go to the last video by pressing the icon and click on EXPLORE THE SHOW$")
	public void go_to_the_last_video_by_pressing_the_icon_and_click_on_EXPLORE_THE_SHOW() throws Throwable {
		show.LastVideoExploreTheShow();
		
	}

	@When("^Click on SHOW MORE button twice and you will see the list of shows$")
	public void click_on_SHOW_MORE_button_twice_and_you_will_see_the_list_of_shows() throws Throwable {
		
		show.ClickShowMore();
	}
	@Then("^Fetch episode title and duration in a file$")
	public void fetch_episode_title_and_duration_in_a_file() throws Throwable {
		show.FetchEpisodeDetail();
}
}