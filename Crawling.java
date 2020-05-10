import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crawling {
    private static WebElement text_box_id;
    private static WebElement text_box_pw;
    private static WebElement btn_login;

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        // 브라우저로 웹 사이트 open
        driver.get("URL for login");

        // ID 입력
        text_box_id = driver.findElement(By.xpath("xpath of ID"));
        text_box_id.clear();
        text_box_id.sendKeys("User ID");

        // 비밀번호 입력
        text_box_pw = driver.findElement(By.xpath("xpath of password"));
        text_box_pw.clear();
        text_box_pw.sendKeys("User Password");

        // 로그인 버튼 클릭
        Thread.sleep(1000);
        btn_login = driver.findElement(By.xpath("xpath of login button"));
        btn_login.click();

        // 드라이버 종료
        driver.close();
    }
}
