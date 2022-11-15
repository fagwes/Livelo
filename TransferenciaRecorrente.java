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

	}

	@Test
	public void test2() throws InterruptedException {

		Thread.sleep(7000);
		driver.findElement(usarpontos).click();

		Thread.sleep(2000);
		driver.findElement(pontosviramdinheiro).click();

		Thread.sleep(2000);
		driver.findElement(transferenciarecorrente).click();

		Thread.sleep(2000);
		driver.findElement(ativeagora).click();

		Thread.sleep(2000);
		driver.findElement(ativar).click();

		Thread.sleep(2000);
		driver.findElement(okentendi).click();

	}

	@Test
	public void test3() throws InterruptedException {

		Thread.sleep(7000);
		driver.findElement(usarpontos).click();

		Thread.sleep(2000);
		driver.findElement(pontosviramdinheiro).click();

		Thread.sleep(2000);
		driver.findElement(transferenciarecorrente).click();

		Thread.sleep(2000);
		driver.findElement(ativeagora).click();

		Thread.sleep(2000);
		driver.findElement(ativar).click();

		Thread.sleep(2000);
		driver.findElement(extrato).click();

		Thread.sleep(2000);
		driver.findElement(desabilitar).click();

	}

	@Test
	public void test4() throws InterruptedException {

		Thread.sleep(7000);
		driver.findElement(usarpontos).click();

		Thread.sleep(2000);
		driver.findElement(pontosviramdinheiro).click();

		Thread.sleep(2000);
		driver.findElement(transferenciarecorrente).click();

		Thread.sleep(2000);
		driver.findElement(ativeagora).click();

		Thread.sleep(2000);
		driver.findElement(ativar).click();

		Thread.sleep(2000);
		driver.findElement(extrato).click();

		Thread.sleep(2000);
		driver.findElement(alterardadosbancarios).click();

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
		driver.findElement(confirmar).click();

		Thread.sleep(2000);
		driver.findElement(sms).click();

		Thread.sleep(2000);
		driver.findElement(enviarcodigo).click();

		driver.quit();

	}

	@Test
	public void test5() throws InterruptedException {

		Thread.sleep(7000);
		driver.findElement(usarpontos).click();

		Thread.sleep(2000);
		driver.findElement(pontosviramdinheiro).click();

		Thread.sleep(2000);
		driver.findElement(transferenciarecorrente).click();

		Thread.sleep(2000);
		driver.findElement(ativeagora).click();

		Thread.sleep(2000);
		driver.findElement(ativar).click();

		Thread.sleep(2000);
		driver.findElement(extrato).click();

		Thread.sleep(2000);
		driver.findElement(alterardadosbancarios).click();

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
		driver.findElement(confirmar).click();

		Thread.sleep(2000);
		driver.findElement(ligacao).click();

		Thread.sleep(2000);
		driver.findElement(enviarcodigo).click();

		driver.quit();

	}

	@Test
	public void test6() throws InterruptedException {

		Thread.sleep(7000);
		driver.findElement(usarpontos).click();

		Thread.sleep(2000);
		driver.findElement(pontosviramdinheiro).click();

		Thread.sleep(2000);
		driver.findElement(transferenciarecorrente).click();

		Thread.sleep(2000);
		driver.findElement(ativeagora).click();

		Thread.sleep(2000);
		driver.findElement(ativar).click();

		Thread.sleep(2000);
		driver.findElement(extrato).click();

		Thread.sleep(2000);
		driver.findElement(alterardadosbancarios).click();

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
		driver.findElement(confirmar).click();

		Thread.sleep(2000);
		driver.findElement(novonumero).click();

		Thread.sleep(2000);
		driver.findElement(enviarcodigo).click();

		driver.quit();

	}

	@Test
	public void test7() throws InterruptedException {

		Thread.sleep(7000);
		driver.findElement(usarpontos).click();

		Thread.sleep(2000);
		driver.findElement(pontosviramdinheiro).click();

		Thread.sleep(2000);
		driver.findElement(transferenciarecorrente).click();

		Thread.sleep(2000);
		driver.findElement(ativeagora).click();

		Thread.sleep(2000);
		driver.findElement(ativar).click();

		Thread.sleep(2000);
		driver.findElement(extrato).click();

		Thread.sleep(2000);
		driver.findElement(alterardadosbancarios).click();

		Thread.sleep(2000);
		driver.findElement(cancelar).click();

		driver.quit();
	}
}




