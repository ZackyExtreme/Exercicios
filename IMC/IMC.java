
public class IMC {
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	
	IMC(String nome, int idade, double altura, double peso ,String sexo){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String analisaIMC () {
		String resultado;
		double imc=calculaIMC();
		
		if(imc<= 19)
			resultado = "abaixo do Peso";
		else if(imc <= 25)
			resultado = "Peso ideal";
		else if(imc <= 30)
			resultado = "Acima do Peso";
		else if(imc <= 35)
			resultado = "Obesidade Leve";
		else 
			resultado = "Obesidade";
		
		return resultado;
	}
	
	public double calculaIMC() {
		return this.peso/(this.altura*this.altura);
		
	}
	
}

