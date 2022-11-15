package livelo;

import org.junit.Test;

public class TransferenciaUnica extends Caminho {

	@Test
	public void teste1() throws InterruptedException {

		Thread.sleep(7000);
		driver.findElement(usarpontos).click();

		Thread.sleep(2000);
		driver.findElement(pontosviramdinheiro).click();

		Thread.sleep(2000);
		driver.findElement(transferenciaunica).click();

		Thread.sleep(2000);
		driver.findElement(pontosresgatar).click();

		Thread.sleep(2000);
		driver.findElement(pontosresgatar).sendKeys("500");

		Thread.sleep(2000);
		driver.findElement(instituicao).click();

		Thread.sleep(2000);
		driver.findElement(tipoconta).click();

		Thread.sleep(2000);
		driver.findElement(agencia).click();
		driver.findElement(agencia).sendKeys("0241");

		Thread.sleep(2000);
		driver.findElement(conta).click();
		driver.findElement(conta).sendKeys("11111111110");

		Thread.sleep(2000);
		driver.findElement(digito).click();
		driver.findElement(digito).sendKeys("7");

		Thread.sleep(2000);
		driver.findElement(salvarinformacoes).click();

		Thread.sleep(2000);
		driver.findElement(continuar).click();

		Thread.sleep(2000);
		driver.findElement(sms).click();

		Thread.sleep(2000);
		driver.findElement(enviarcodigo).click();

		driver.quit();

	}

	@Test
	public void teste2() throws InterruptedException {

		Thread.sleep(7000);
		driver.findElement(usarpontos).click();

		Thread.sleep(2000);
		driver.findElement(pontosviramdinheiro).click();

		Thread.sleep(2000);
		driver.findElement(transferenciaunica).click();

		Thread.sleep(2000);
		driver.findElement(pontosresgatar).click();

		Thread.sleep(2000);
		driver.findElement(pontosresgatar).sendKeys("500");

		Thread.sleep(2000);
		driver.findElement(instituicao).click();

		Thread.sleep(2000);
		driver.findElement(tipoconta).click();

		Thread.sleep(2000);
		driver.findElement(agencia).click();
		driver.findElement(agencia).sendKeys("0241");

		Thread.sleep(2000);
		driver.findElement(conta).click();
		driver.findElement(conta).sendKeys("11111111110");

		Thread.sleep(2000);
		driver.findElement(digito).click();
		driver.findElement(digito).sendKeys("7");

		Thread.sleep(2000);
		driver.findElement(salvarinformacoes).click();

		Thread.sleep(2000);
		driver.findElement(continuar).click();

		Thread.sleep(2000);
		driver.findElement(ligacao).click();

		Thread.sleep(2000);
		driver.findElement(enviarcodigo).click();

		driver.quit();

	}

	@Test
	public void teste3() throws InterruptedException {

		Thread.sleep(7000);
		driver.findElement(usarpontos).click();

		Thread.sleep(2000);
		driver.findElement(pontosviramdinheiro).click();

		Thread.sleep(2000);
		driver.findElement(transferenciaunica).click();

		Thread.sleep(2000);
		driver.findElement(pontosresgatar).click();

		Thread.sleep(2000);
		driver.findElement(pontosresgatar).sendKeys("500");

		Thread.sleep(2000);
		driver.findElement(instituicao).click();

		Thread.sleep(2000);
		driver.findElement(tipoconta).click();

		Thread.sleep(2000);
		driver.findElement(agencia).click();
		driver.findElement(agencia).sendKeys("0241");

		Thread.sleep(2000);
		driver.findElement(conta).click();
		driver.findElement(conta).sendKeys("11111111110");

		Thread.sleep(2000);
		driver.findElement(digito).click();
		driver.findElement(digito).sendKeys("7");

		Thread.sleep(2000);
		driver.findElement(salvarinformacoes).click();

		Thread.sleep(2000);
		driver.findElement(continuar).click();

		Thread.sleep(2000);
		driver.findElement(novonumero).click();

		Thread.sleep(2000);
		driver.findElement(enviarcodigo).click();

		driver.quit();

	}

}
