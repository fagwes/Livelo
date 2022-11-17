package livelo;

import org.junit.Test;

public class TransferenciaRecorrente extends Elementos {

	

	@Test
	public void test1() throws InterruptedException {

		Thread.sleep(7000);
		driver.findElement(usarpontos).click();

		Thread.sleep(2000);
		driver.findElement(pontosviramdinheiro).click();

		Thread.sleep(2000);
		driver.findElement(transferenciarecorrente).click();

		Thread.sleep(2000);
		driver.findElement(queroativar).click();

		Thread.sleep(2000);
		driver.findElement(ativar).click();

		Thread.sleep(2000);
		driver.findElement(okentendi).click();
                driver.quit();
	}

}



