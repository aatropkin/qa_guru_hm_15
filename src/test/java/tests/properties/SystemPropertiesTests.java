package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void systemProperty4Test() {
        System.out.println(System.getProperty("browser", "safari"));
    }


    @Test
    @Tag("property1")
    void systemProperty5Test() {
        System.out.println(System.getProperty("browser", "opera"));
    }

    @Test
    @Tag("property2")
    void systemProperty6Test() {
        String browser = System.getProperty("browser", "chrome");
        String browserVersion = System.getProperty("browser_version", "100.0");
        String browserSize = System.getProperty("browser_size", "1920x1080");

        String browserConfig = String.format("Browser: %s\nVersion: %s\nWindow size: %s", browser, browserVersion, browserSize);
        //gradle property2_test -Dbrowser=safari -Dbrowser_version="96.0" -Dbrowser_size=1080x720
        System.out.println(browserConfig);
    }



}
