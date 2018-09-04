package seleniumproject1basics;

import org.openqa.selenium.WebDriver;

public class FirstProgram {
		public static void main(String[] args) {
			Defaultselenium selenium=new Defaultselenium("localhost",4444,"firefox C:\\Program Files");
			selenium.start();
			
		}

	

}
