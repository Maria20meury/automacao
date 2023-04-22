package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]/a");
	private By btnParaVoce = By.id("bt1");
	private By CampoNome = By.id("nome");
	private By CampoTelefone = By.id("telefone");
	private By CampoEmail = By.id("email");
	private By CampoCpf = By.id("cpf");

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getBtnParaVoce() {
		return btnParaVoce;
	}

	public By getCampoNome() {
		return CampoNome;
	}

	public By getCampoTelefone() {
		return CampoTelefone;
	}

	public By getCampoEmail() {
		return CampoEmail;
	}

	public By getCampoCpf() {
		return CampoCpf;
	}

	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}

	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}

	private By btnQueroSerCliente = By.id("btnEnviar");
	private By textoFaltaPouco = By.cssSelector("<span style=\"color: #01874D\"> Falta pouco! </span>");

}
