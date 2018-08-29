import io.github.bonigarcia.wdm.ChromeDriverManager
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver

import java.util.concurrent.TimeUnit

baseUrl = 'http://localhost:7000/'
ChromeDriverManager.chromedriver().setup()
timeout = 15
driver = {
//    def driver = new ChromeDriver()
    def driver = new HtmlUnitDriver()
//    driver.manage().window().maximize()
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
    driver
}
