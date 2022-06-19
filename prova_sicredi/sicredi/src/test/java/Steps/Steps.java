package Steps;

import java.io.IOException;

import Metodos.Metodos;
import io.cucumber.java.en.Given;

public class Steps {
	Metodos m = new Metodos();
	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String string) throws IOException {
	    m.acessarPlataforma(string);
	}

	@Given("clicar combo select version para Bootstrap V4 Theme")
	public void clicar_combo_select_version_para_bootstrap_v4_theme() throws InterruptedException {
	    m.clicaremcomboselect();
	}

	@Given("clicar no botão Add Customer")
	public void clicar_no_botão_add_customer() {
	  m.clicarAddCustomer();
	}

	@Given("preencher campos")
	public void preencher_campos() throws InterruptedException, IOException {
	   m.preencherCampos();
	}

	@Given("{string}")
	public void string(String string) {
	    m.acessaurl(string);
	}

	@Given("clicar na Search	e digita o conteudo")
	public void clicar_na_search_e_digita_o_conteudo() throws InterruptedException {
	    m.clicarnacoluna();
	}

	@Given("clicar no checbox abaixo da palavra actions")
	public void clicar_no_checbox_abaixo_da_palavra_actions() throws InterruptedException {
	    m.clicarnochecbox();
	}

	@Given("clicar no botão delete")
	public void clicar_no_botão_delete() throws InterruptedException {
	  m.clicardelete();
	}

	@Given("Validar o texto Are you sure that you want to delete this {int} item?")
	public void validar_o_texto_are_you_sure_that_you_want_to_delete_this_item(Integer int1) throws InterruptedException, IOException {
	    m.validarmensagemdopopup();
	}

	@Given("clicar no botão delete no popup")
	public void clicar_no_botão_delete_no_popup() throws InterruptedException, IOException {
	   m.clicarnodeletedopopup();
	}

	@Given("fechar o navegador")
	public void fechar_o_navegador() throws IOException {
	    m.fecharnavergado();
	}
	
}
