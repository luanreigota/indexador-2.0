package config;

import java.io.File;
import java.io.IOException;
import java.util.List;

import entity.Extensoes;

public class SerializacaoExtensoes extends GenericSerialization {
	@Override
	public File getFile() {
		// TODO Auto-generated method stub
		return new File(getClass().getResource("extensoes.xml").getPath());
	}
	
	public void addExtensao(String newExtensao) throws IOException{
		@SuppressWarnings("unchecked")
		List<Extensoes> extensoes = (List<Extensoes>) leitor();
		boolean add = false;
		for (Extensoes e : extensoes) {
			if(e.getExtensao().equals(newExtensao)){
				add=false;
				break;
			}else{
				add = true;
			}
		}
		if (add) {
			System.out.println("add");
			extensoes.add(new Extensoes(newExtensao));
			inserir(extensoes);
		}
	}
	
	public void removerExtensao(int i) throws IOException{
		@SuppressWarnings("unchecked")
		List<Extensoes> extensoes = (List<Extensoes>) leitor();
		extensoes.remove(i);
		inserir(extensoes);
	}
	
}
