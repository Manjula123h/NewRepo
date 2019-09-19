package com.discover.pages;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdriverUtils.Commonfunctions;

public class Shows extends Commonfunctions {
	//@FindBy(xpath = "//h2[@class='popularShowsCarousel__header']")
	//public WebElement showheader =

	//@FindBy(xpath = "//div[@class='carousel__arrowWrapper popularShowsCarousel__controlsProp']//child::i")
	//public WebElement arrow=

	//@FindBy(xpath = "//button[text()='Explore the Show'])[last()]")
	//public WebElement explore_button= 

	//@FindBy(xpath = "//ul[@class='episodeList__list']/li")
	

	//@FindBy(xpath = "//button[text()='Show More']")
	//public WebElement showMore=

	public void launchURL() throws InterruptedException,

	FileNotFoundException {

		// Create text file to list out the episode details
          driver.get("https://go.discovery.com/");
		PrintStream fileOut = new PrintStream("EpisodeDetails.txt");

		System.setOut(fileOut);

		// b.start();

	}

	public void scrollPopularShows()

	{
try{
		// WebElement popularshow = driver.findElement(showheader);

		scrollByJavascript(driver.findElement(By.xpath("//h2[@class='popularShowsCarousel__header']")));
}
catch(Exception e){
	e.printStackTrace();
}
	}

	public void LastVideoExploreTheShow() throws InterruptedException

	{

		// WebElement clickarrow = driver.findElement(arrow);

		try {

			while ((driver.findElement(By.xpath("//div[@class='carousel__arrowWrapper popularShowsCarousel__controlsProp']//child::i"))).isDisplayed()) {
           List list =driver.findElements(By.xpath("//div[@class='carousel__arrowWrapper popularShowsCarousel__controlsProp']//child::i"));
			if(list.size()==1)	
            jsClick(driver.findElement(By.xpath("//div[@class='carousel__arrowWrapper popularShowsCarousel__controlsProp']//child::i")));
			else{
			jsClick(driver.findElement(By.xpath("(//div[@class='carousel__arrowWrapper popularShowsCarousel__controlsProp']//child::i)[2]")));
			if(!(driver.findElement(By.xpath("(//div[@class='carousel__arrowWrapper popularShowsCarousel__controlsProp']//child::i)[2]")).isDisplayed()))
			break;
			}
			}
		} catch (Exception e) {

			// WebElement clickexplore = driver.findElement(explore_button);

			Thread.sleep(2000);

			WebDriverWait wait = new WebDriverWait(driver, 20);

			// wait.until(ExpectedConditions.stalenessOf(explore_button));

			jsClick(driver.findElement(By.xpath("(//button[text()='Explore the Show'])[last()]")));

			// explore_button.click();

		}

	}

	public void ClickShowMore()

	{

		for (int i = 0; i < 2; i++) {
			// WebElement element2 = driver.findElement(showMore);
			scrollByJavascript(driver.findElement(By.xpath("//button[text()='Show More']")));
			jsClick(driver.findElement(By.xpath("//button[text()='Show More']")));

		}

	}

	public void FetchEpisodeDetail()
	{
		 List<WebElement> videolist=driver.findElements(By.xpath("//ul[@class='episodeList__list']/li"));
		for (int j = 0; j < (videolist.size() - 1); j++) {
			WebElement epsd = videolist.get(j);
			String[] array1 = epsd.getText().split("\\n");
			System.out.println("Episode name: " + array1[1]);
			System.out.println("Duration: " + array1[2]);
			System.out
					.println("=====================================================================================================");
		}
	}

}
