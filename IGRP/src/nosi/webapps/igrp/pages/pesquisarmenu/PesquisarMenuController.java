/*-------------------------*/

/*Create Controller*/

package nosi.webapps.igrp.pages.pesquisarmenu;
import nosi.core.webapp.Controller;
import java.io.IOException;

public class PesquisarMenuController extends Controller {		

	public void actionIndex() throws IOException{
		PesquisarMenu model = new PesquisarMenu();
		PesquisarMenuView view = new PesquisarMenuView(model);
		this.renderView(view);
	}

	public void actionNovo() throws IOException{
	}
	
	public void actionMenuBase() throws IOException{
	}
	
	public void actionPesquisar() throws IOException{
	}
	
}