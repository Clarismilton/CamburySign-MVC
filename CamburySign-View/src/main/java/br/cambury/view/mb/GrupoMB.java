package br.cambury.view.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.cambury.bean.Grupo;
import br.cambury.controle.GrupoBCI;

@ManagedBean(name = "GrupoMB")
@ViewScoped
public class GrupoMB extends SpringBeanAutowiringSupport {

	private Grupo bean;
	private Grupo alterar;
	@Autowired
	private GrupoBCI controle;
	private List<Grupo> list;
	private Boolean exibirBtnAlterar;

	/*
	 * este m�todo init tem uma nota��o PostConstruct isso faz com que o m�todo rode
	 * automaticamente ap�s o construtor ser chamado
	 */

	@PostConstruct
	public void init() {
		this.bean = new Grupo();
		this.list = controle.select();
		this.alterar = null;
		this.exibirBtnAlterar = false;
	}

	public Boolean getExibirBtnAlterar() {
		return exibirBtnAlterar;
	}

	public void setExibirBtnAlterar(Boolean exibirBtnAlterar) {
		this.exibirBtnAlterar = exibirBtnAlterar;
	}

	public Grupo getAlterar() {
		return alterar;
	}

	public void setAlterar(Grupo alterar) {
		this.alterar = alterar;
	}

	public Grupo getBean() {
		return bean;
	}

	public void setBean(Grupo bean) {
		this.bean = bean;
	}

	public List<Grupo> getList() {
		return list;
	}

	public void setList(List<Grupo> list) {
		this.list = list;
	}

	public void gravar() {
		this.controle.insert(this.bean);
		this.init();
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null, new FacesMessage("Sucesso", "O Grupo foi cadastrado!"));
	}

	public void cancelar() {
		this.init();
	}

	public void atualizar() {
		this.controle.update(this.bean);
		this.init();
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null, new FacesMessage("Sucesso", "O Grupo foi atualizado!"));
	}

	public void excluir() {
		this.controle.delete(this.bean);
		this.init();
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null, new FacesMessage("Sucesso", "O Grupo foi Excluido!"));
	}

	public void preparaUpdate() {
		this.bean = this.alterar;
		this.exibirBtnAlterar = true;
	}
}