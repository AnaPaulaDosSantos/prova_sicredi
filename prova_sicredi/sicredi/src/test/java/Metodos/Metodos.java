package Metodos;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Elementos.Elementos;
import Pages.Pages;

public class Metodos {
	Pages p = new Pages();
	Elementos e = new Elementos();
	WebDriver driver;
	String mensagem;
	String descricaoPasso;
	By elemento = null;

	public void acessarPlataforma(String site) throws IOException {
		p.ExecutarNavegador(site);
	}

	public void clicaremcomboselect() throws InterruptedException {
		p.clicar(e.getBtnSelectVersion());
		Thread.sleep(5000);
		p.clicar(e.getBtnV4Theme());

	}

	public void clicarAddCustomer() {
		p.clicar(e.getBtnAddCustomer());

	}

	public void preencherCampos() throws InterruptedException, IOException {
		p.preencher(e.getCampoName(), "Teste Sicredi");
		p.pausa(2000);
		p.preencher(e.getCampoLastName(), "Teste");
		p.pausa(2000);
		p.preencher(e.getCampoContactFirstName(), "Ana Paula");
		p.pausa(2000);
		p.preencher(e.getCampoPhone(), "51 9999-9999");
		p.pausa(2000);
		p.preencher(e.getCampoAddressLine1(), "Av Assis Brasil, 3970");
		p.pausa(2000);
		p.preencher(e.getCampoAddressLine2(), "Torre D");
		p.pausa(2000);
		p.preencher(e.getCampoCity(), "Porto Alegre");
		p.pausa(2000);
		p.preencher(e.getCampoState(), "RS");
		p.pausa(2000);
		p.preencher(e.getCampoPostal(), "91000-000");
		p.pausa(2000);
		p.scroll(e.getCampoCountry());
		p.pausa(2000);
		p.preencher(e.getCampoCountry(), " Brasil");
		p.pausa(2000);
		p.clicar(e.getBtnFrom());
		p.pausa(2000);
		p.clicar(e.getBtnFixter());
		p.pausa(2000);
		p.preencher(e.getCampoCreditLimit(), "200");
		p.pausa(2000);
		p.clicar(e.getBtnSave());
		p.pausa(4000);
		p.validarTexto("Your data has been successfully stored into the database. Edit Customer or Go back to list",
				e.getValidarMensagem());
		String Save = "validar o save";
		p.screnShoot("./Save/" + Save + ".png");
		p.pausa(2000);
		p.fecharBrowser(mensagem);
	}

	public void acessaurl(String site) {
		p.ExecutarNavegador(site);
	}

	public void clicarnacoluna() throws InterruptedException {
		p.clicar(e.getBtnColuna());
		p.pausa(2000);
		p.preencher(e.getBtnColuna(), "Teste Sicredi");
		p.pausa(2000);
	}

	public void clicarnochecbox() throws InterruptedException {

		p.clicar(e.getBtnActions());

	}

	public void clicardelete() throws InterruptedException {
		p.clicar(e.getBtnDelete());
		p.pausa(2000);
	}

	public void validarmensagemdopopup() throws InterruptedException, IOException {
		p.pausa(2000);
		p.validarTexto("Are you sure that you want to delete this record?", e.getValidarMensagemDoDelete());
		p.pausa(2000);
	}

	public void clicarnodeletedopopup() throws InterruptedException, IOException {
		String Delete = "validar o delete do teste";
		p.clicar(e.getBtnClicarDeletePopPup());
		p.pausa(2000);
		p.screnShoot("./Delete/" + Delete + ".png");
		p.pausa(2000);
	}

	public void fecharnavergado() throws IOException {
		p.fecharBrowser(mensagem);
	}
}
