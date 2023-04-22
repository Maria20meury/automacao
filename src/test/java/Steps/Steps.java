package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	Metodos m = new Metodos();
	Elementos e = new Elementos();
   

@Given("^que o usuario acesse a url \"([^\"]*)\"$")
public void que_o_usuario_acesse_a_url(String url) throws Throwable {
	m.pausa(5000, url);
    m.executarnavegador(url, "chrome","abrindo navegador");
}

@Given("^selecione o botao abrir nova conta$")
public void selecione_o_botao_abrir_nova_conta() throws Throwable {
	m.pausa(3000, "pausa para caregar o botao abrir conta");
	m.click(e.getBtnAbrirConta(), "selenionando botao abrir conta");
}

@Given("^selecionar o botao abrir conta para voce$")
public void selecionar_o_botao_abrir_conta_para_voce() throws Throwable {
	m.click(e.getBtnParaVoce(), "selecionando botao abrir conta");
}


@When("^o usuario preencher o formulario$")
public void o_usuario_preencher_o_formulario() throws Throwable {
	m.preencher(e.getCampoNome(), "Flash code", "preenchendo campo Nome");
	m.preencher(e.getCampoTelefone(), "11111111111", "preenchendo campo Telefone");
	m.preencher(e.getCampoEmail(), "teste@teste.com.br", "preeenchendo campo Email");
	m.preencher(e.getCampoCpf(), "86022073014", "preenchendo campo Cpf");
	
	
	
}

@When("^selecionar o botao quero ser cliente$")
public void selecionar_o_botao_quero_ser_cliente() throws Throwable {
	m.click(e.getBtnQueroSerCliente(), "selecionando botao quero ser cliente");
}

@Then("^valido o texto falta pouco$")
public void valido_o_texto_falta_pouco() throws Throwable {
	
}  
	  
	  
		   
	}
	


