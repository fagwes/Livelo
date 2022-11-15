package livelo;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caminho extends Elementos {

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\fagwe\\OneDrive\\Área de Trabalho\\Wesley\\Nova pasta\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.livelo.com.br/");
		driver.manage().window().maximize();
}
}
