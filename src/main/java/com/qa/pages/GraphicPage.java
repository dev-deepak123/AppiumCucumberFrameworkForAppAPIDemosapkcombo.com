package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.util.Test_Base;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;

public class GraphicPage extends Test_Base{
	
	public GraphicPage(AppiumDriver<MobileElement> wd) {
        PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Graphics']")
	public  MobileElement graphicLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='AlphaBitmap']")
	public  MobileElement alphaBitmapLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Graphics/AlphaBitmap']")
	public  MobileElement titlealphaBitmapLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='AnimateDrawables']")
	public  MobileElement animatedrawablesLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Graphics/AnimateDrawables']")
	public  MobileElement titleanimatedrawablesLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Density']")
	public  MobileElement densityLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Density: Extra High']")
	public  MobileElement titledensityLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Text Align']")
	public  MobileElement textAlignLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Graphics/Text Align']")
	public  MobileElement titletextAlignLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Touch Paint']")
	public  MobileElement touchPaintLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Graphics/Touch Paint']")
	public  MobileElement titletouchPaintLable;
	
	
	//methods
	public void clickGraphic() {
		graphicLable.click();
	}
	
	public void clickalphaBitmap() {
		alphaBitmapLable.click();
	}
	
	public void clickanimatedrawables() {
		animatedrawablesLable.click();
	}
	
	public void clickdensity() {
		densityLable.click();
	}
	
	public void clicktextAlign() {
		textAlignLable.click();
	}
	
	public void clicktouchPaint() {
		touchPaintLable.click();
	}
	
	public void tapByCoordinates (int x,  int y) {
        new TouchAction(wd).tap(point(x,y))
           .tap(point(x,y))
           .waitAction(waitOptions(ofMillis(250))).perform();
    }


	
}
