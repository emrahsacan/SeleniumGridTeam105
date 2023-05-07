package test;

import org.testng.annotations.Test;

import static utilities.SeleniumGridDrivers.remoteDriverChromeOptions;
import static utilities.SeleniumGridDrivers.remoteDriverFirefoxOptions;

public class SeleniumGridTest {

    @Test
    public void test01(){

        remoteDriverChromeOptions().get("https://www.amazon.com");

    }

    @Test
    public void test02(){
        remoteDriverFirefoxOptions().get("https://www.google.com");
        System.out.println(remoteDriverFirefoxOptions().getTitle());
    }


}
