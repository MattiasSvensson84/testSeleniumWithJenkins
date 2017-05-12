package test.google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * Created by mattiassvensson on 12/05/17.
 */
public class testGoogle {

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static FileHandler fh;
    private static Logger log;
    private static Robot robot;

    private static String url = "http://www.google.se";

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 3000);
        driver.manage().window().maximize();
        driver.get(url);

    }

    @After
    public void tearDown() throws Exception {
        driver.close();
        Thread.sleep(300);
        driver.quit();
    }

    @Test
    public void testGoogleSearch() throws InterruptedException {


    }

}
