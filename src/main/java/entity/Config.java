package entity;

public class Config {

	//pasta dos indices
	private String pathIndice;
	
	//pasta para indexar
	private String pathIndexar;

	public Config() {
		
	}
	
	public Config(String pathIndice, String pathIndexar) {
		super();
		this.pathIndice = pathIndice;
		this.pathIndexar = pathIndexar;
	}

	public String getPathIndice() {
		return pathIndice;
	}

	public void setPathIndice(String pathIndice) {
		this.pathIndice = pathIndice;
	}

	public String getPathIndexar() {
		return pathIndexar;
	}

	public void setPathIndexar(String pathIndexar) {
		this.pathIndexar = pathIndexar;
	}
	
	
	
	
}
