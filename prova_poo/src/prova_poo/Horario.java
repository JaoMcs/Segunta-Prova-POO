package prova_poo;

public class Horario {

	private int hora;
	private int minuto;
	private final static int HORAMAX = 23;
	private final static int MINUTOMAX = 59;


	// Construtores basicos:

	public Horario (int _hora, int _minuto) throws Exception {
		this.setHorario(_hora,_minuto);

	}

	public Horario (int _hora) throws Exception {
		this.setHorario(_hora,0);


	}

	public Horario () throws Exception {
		this.setHorario(0,0);

	}



	//Interface dos Campos:

	public int getHora() {
		return this.hora;     
	}

	public int getMinuto() {
		return this.minuto;     
	}

	public void setHora(int _hora) {
		this.hora = _hora; 	
	}

	public void setMinuto(int _minuto) {
		this.minuto = _minuto;
	}


	public void setHorario(int _hora, int _minuto) throws Exception {
		if(_hora <= HORAMAX && _minuto <= MINUTOMAX) {

			this.setHora(_hora);
			this.setMinuto(_minuto);

		}
		else {
			throw new Exception("ERRO: Horario invalido");
		}

	}
	// EQUALS SOBREPOSTO E TOSTRING(usando o string builder)

	public boolean equals(Object objeto) {

		Horario aux = (Horario) objeto;

		if(this.getHora() == aux.getHora() &&
				this.getMinuto() == aux.getMinuto() ) 
			return true;

		else 
			return false;

	}

	public String toString(){
		StringBuilder dados = new StringBuilder();
		//			dados.append("[");  Nao necessario,
		dados.append(this.getHora());
		dados.append("h ");
		dados.append(this.getMinuto());
		dados.append("min ");
		//			dados.append("]");  Nao necessario
		return dados.toString();
	} 

	// Metodo CompareTo
	public int compareTo(Horario _horario) {

		if(this.getHora() == _horario.getHora() &&
				this.getMinuto() == _horario.getMinuto() ) 
			return 0;

		else if( this.getHora() > _horario.getHora() ||
				(this.getHora() == _horario.getHora() &&
				this.getMinuto() > _horario.getMinuto()) ) {
			return 1;
		}
		else {
			return -1;
		}		
	}

}
