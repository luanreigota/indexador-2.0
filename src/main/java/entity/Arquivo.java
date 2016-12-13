package entity;

import java.io.File;
import java.text.SimpleDateFormat;

public class Arquivo {
	
	private String nome;
	private String extensao;
	private String caminho;
	private String ultimaModificacao;

	
	public Arquivo(File file) {
		// TODO Auto-generated constructor stub
		SimpleDateFormat formatador = new SimpleDateFormat("yyyyMMdd");
		caminho = file.getPath();
		nome=file.getName();
		ultimaModificacao = formatador.format(file.lastModified());
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getExtensao() {
		return extensao;
	}
	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}
	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	public String getUltimaModificacao() {
		return ultimaModificacao;
	}
	public void setUltimaModificacao(String ultimaModificacao) {
		this.ultimaModificacao = ultimaModificacao;
	}
}
