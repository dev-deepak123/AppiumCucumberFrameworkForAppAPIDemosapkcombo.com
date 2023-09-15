package stepdefinations;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qa.pages.GraphicPage;
import com.qa.pages.SearchPage;
import com.qa.util.Test_Base;
import com.qa.util.Test_Util;

import io.cucumber.java.en.Then;

public class Graphics_Step_defination extends Test_Base{
	
	private static Logger log = LogManager.getLogger(Graphics_Step_defination.class) ;//Logger
	public GraphicPage graphicPage = new GraphicPage(wd);
	
	Test_Util util = new Test_Util();
	
	@Then("click on Graphic button")
	public void click_on_graphic_button() {
		log.info("*******click on Graphic button***********");
		graphicPage.clickGraphic();
	}

	@Then("click on AlphaBitmap and check the title and move back")
	public void click_on_alpha_bitmap_and_check_the_title_and_move_back() {
		
		log.info("*******click on AlphaBitmap and check the title and move back***********");
		graphicPage.clickalphaBitmap();
		assertEquals(graphicPage.titlealphaBitmapLable.getText(),"Graphics/AlphaBitmap");
		wd.navigate().back();
	}

	@Then("click on the AnimateDrawbles check the title and move back")
	public void click_on_the_animate_drawbles_check_the_title_and_move_back() {
		
		log.info("*******click on the AnimateDrawbles check the title and move back***********");
		graphicPage.clickanimatedrawables();
		assertEquals(graphicPage.titleanimatedrawablesLable.getText(),"Graphics/AnimateDrawables");
		wd.navigate().back();
	}

	@Then("click on the Density check the title scroll down and move back")
	public void click_on_the_density_check_the_title_scroll_down_and_move_back() throws InterruptedException {
		
		log.info("*******click on the Density check the title scroll down and move back***********");
		graphicPage.clickdensity();
		assertEquals(graphicPage.titledensityLable.getText(),"Density: Extra High");
		Thread.sleep(3000);
	    util.verticalswipe(0.90, 0.10, 0.90);
		wd.navigate().back();
	}

	@Then("Scroll down")
	public void scroll_down() throws InterruptedException {
		
		log.info("*******Scroll down***********");
		Thread.sleep(3000);
	    util.verticalswipe(0.90, 0.10, 0.90);
	    util.verticalswipe(0.90, 0.10, 0.90);
	    util.verticalswipe(0.90, 0.10, 0.90);
	    util.verticalswipe(0.90, 0.10, 0.90);
	}

	@Then("clcik on picture check the title and move back")
	public void clcik_on_picture_check_the_title_and_move_back() throws InterruptedException {
		
		log.info("*******clcik on picture check the title and move back***********");
		graphicPage.clicktextAlign();
		assertEquals(graphicPage.titletextAlignLable.getText(),"Graphics/Text Align");
		wd.navigate().back();
		
	}

	@Then("clcik on Touch paint and check the title and touch on screen")
	public void clcik_on_touch_paint_and_check_the_title_and_touch_on_screen() throws InterruptedException {
		
		log.info("*******clcik on Touch paint and check the title and touch on screen***********");
		graphicPage.clicktouchPaint();
		assertEquals(graphicPage.titletouchPaintLable.getText(),"Graphics/Touch Paint");
		Thread.sleep(3000);
		graphicPage.tapByCoordinates(1000, 200);
		wd.navigate().back();
	}

}
