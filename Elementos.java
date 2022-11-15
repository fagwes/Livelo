package livelo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elementos {

	WebDriver driver;
//--------------------------------------------------------------------------------------------------//
	By usarpontos = By.cssSelector("#span-first-level-menu-1");
	By pontosviramdinheiro = By.cssSelector("#span-second-level-menu-1-8");
	By transferenciaunica = By.cssSelector("#span-third-level-menu-1-8-1");
	By pontosresgatar = By.xpath("//*[@id=\"input-points-quantity\"]");
	By instituicao = By.xpath("//*[@id=\"select-bank\"]");
	By tipoconta = By.xpath("//*[@id=\"select-account-type\"]");
	By agencia = By.xpath("//*[@id=\"input-agency\"]");
	By conta = By.xpath("//*[@id=\"input-account-number\"]");
	By digito = By.xpath("//*[@id=\"input-account-digit\"]");
	By salvarinformacoes = By.xpath(
			"//*[@id=\"custom-product-details-ted_v1-wi10000007\"]/div[1]/div/div/div/div[2]/div/div[4]/div/div/label\r\n"
					+ "");
	By continuar = By.xpath("//*[@id=\"submit\"]");
	By sms = By.xpath(
			"//*[@id=\"custom-modal-authentication-token_v1-wi10100301\"]/div[1]/div[2]/div/form/div/div[3]/div/div/div[1]/div[2]/label\r\n"
					+ "");
	By ligacao = By.xpath(
			"	//*[@id=\"custom-modal-authentication-token_v1-wi10100301\"]/div[1]/div[2]/div/form/div/div[3]/div/div/div[1]/div[2]/label\r\n"
					+ "");
	By naoestanalista = By.xpath("//*[@id=\"cc-number-is-out\"]");
	By enviarcodigo = By.xpath("//*[@id=\"button-modal-auth-phone\"]");
	By novonumero = By.xpath("//*[@id=\"modal-input-number\"]");

	// ----------------------------------------------------------------------------------------//

	By transferenciarecorrente = By.xpath("//*[@id=\"span-third-level-menu-1-8-2\"]");
	By queroativar = By.xpath("//*[@id=\"wi14000679-rich-text-10700126\"]/div/div/div/div/div/div[2]/a");
	By ativeagora = By.xpath("//*[@id=\"wi15000170-rich-text-11400029\"]/div/div/div/div/div[1]/div[1]/a");
	By ativar = By.xpath("//*[@id=\"submit\"]");
	By okentendi = By.xpath("//*[@id=\"popup-auto-ted-already-active-msg\"]/div[2]/div/div[2]/button");
	By extrato = By.xpath("	//*[@id=\"popup-auto-ted-already-active-msg\"]/div[2]/div/div[2]/a/button\r\n" + "");
	By desabilitar = By.xpath("	//*[@id=\"custom-profile-auto-ted-info\"]/div/div[3]/div/button\r\n" + "");
	By alterardadosbancarios = By.xpath("	//*[@id=\"custom-profile-auto-ted-info\"]/div/div[3]/div/a\r\n" + "");
	By confirmar = By.xpath("	//*[@id=\"popup-auto-ted-optin\"]/div[2]/div/div[2]/a/button");
	By cancelar = By.xpath("	//*[@id=\"popup-auto-ted-optin\"]/div[2]/div/div[2]/button\r\n" + "");

}
