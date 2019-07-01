package prova_poo;

public class Data {

	private int dia, mes, ano;

	public Data(String DiaMesAno) throws Exception {
		this.setData(DiaMesAno);

	}

	public Data(int _dia, String _mes1, int _ano) throws Exception {
		this.setData(_dia, _mes1, _ano);

	}

	public Data(int _dia, int _mes, int _ano) throws Exception {
		this.setData(_dia, _mes, _ano);
	}

	public Data() throws Exception {
		this(1,1,1900);
	}

	public Data(int _mes, int _ano) throws Exception {
		this(1,_mes,_ano);
	}

	//==========Construtores=============//

	public int getDia() {
		return this.dia;     
	}

	public int getMes() {
		return this.mes;     
	}

	public int getAno() {
		return this.ano;     
	}

	//==============Metodos============//

	public void setData(String _DiaMesAno) throws Exception {
		int posicao1=0,posicao2=0;	 //A ideia é ter 2 posicoes, uma representando o final e a outra o inicio
		String Dia1, Mes1 ,Ano1;

		posicao2 = _DiaMesAno.indexOf("/"); // o index me da a posicao da primeira /

		Dia1 =_DiaMesAno.substring(posicao1,posicao2); // Com a posicao da primeira barra consigo pegar os caracteres
		//até a posicao da primeira barra (indentificando o dia)

		posicao1 = posicao2+1;
		posicao2 = _DiaMesAno.indexOf("/",posicao1+1);		// Faco uma rapida troca nas posicoes e passo a posicao2 para

		//proxima barra (indentificando o mes)
		Mes1 =_DiaMesAno.substring(posicao1,posicao2);

		//System.out.println(Mes1);

		posicao1 = posicao2+1;					// Faco uma rapida troca nas posicoes, porem a posicao2 vai ser o
		posicao2 = posicao2+5;					//limite da string (no caso a ultima barra +4 pois o ano sempre tem 4 digitos);


		Ano1 = _DiaMesAno.substring(posicao1);
		//System.out.println(Ano1);

		this.setData(Dia1, Mes1, Ano1);

	}

	public void setData(String Dia1, String Mes1, String Ano1) throws Exception {
		int _dia, _mes, _ano;

		_dia = Integer.parseInt(Dia1);
		_mes = Integer.parseInt(Mes1);
		_ano = Integer.parseInt(Ano1);

		this.setData(_dia, _mes, _ano);

	}

	public void setData(int _dia, int _mes, int _ano) throws Exception{

		if( Data.isDataValida(_dia, _mes, _ano) == true){

			this.dia = _dia;
			this.mes = _mes;
			this.ano = _ano;
		}

		else{
			throw new Exception("ERRO: data invalida");
		}
	}

	public void setData(int _dia, String _mes1, int _ano) throws Exception {
		int i=0;
		if (_mes1.equals("janeiro")) {
			i = 1;
		}
		else if (_mes1.equals("fevereiro")) {
			i = 2;
		}
		else if (_mes1.equals("marco")) {
			i = 3;
		}
		else if (_mes1.equals("abril")) {
			i = 4;
		}
		else if (_mes1.equals("maio")) {
			i = 5;
		}
		else if (_mes1.equals("junho")) {
			i = 6;
		}
		else if (_mes1.equals("julho")) {
			i = 7;
		}
		else if (_mes1.equals("agosto")) {
			i = 8;
		}
		else if (_mes1.equals("setembro")) {
			i = 9;
		}
		else if (_mes1.equals("outubro")) {
			i = 10;
		}
		else if (_mes1.equals("novembro")) {
			i = 11;
		}
		else if (_mes1.equals("dezembro")) {
			i = 12;
		}

		setData(_dia,i,_ano);
	}



	public static boolean isDataBixesto(int dia, int mes, int ano){

		if ( (ano%4 == 0 && ano%100 != 0) || (ano%400 == 0) ){
			return true;
		}
		else
			return false;	
	}
	public boolean isDataBixesto() {

		return Data.isDataBixesto(this.getDia(), this.getMes(), this.getAno());
	}



	public static boolean isDataValida (int dia, int mes, int ano)throws Exception{

		if (dia > 31 || mes > 12 || ano < 1582) {

			return false;
		}

		else if( (mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 31 )){

			return true;
		}
		else if ( (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia < 32 )) {

			return true;
		}

		else if(mes == 2){
			if (Data.isDataBixesto(dia, mes, ano) == true) {
				if(dia > 29){
					return false;
				}

				else{
					return true;
				}
			}
			else if(dia < 28){
				return true;
			}

			else {
				return false;
			}
		}

		return false;
	}

	public void incrementa() throws Exception{
		try {
			this.setData(this.getDia()+1,this.getMes(),this.getAno());

		}
		catch(Exception e1){
			try {
				this.setData(1,this.getMes()+1,this.getAno());

			}
			catch(Exception e2){
				this.setData(1,1,this.getAno()+1);

			}
		}
	}

	public void incrementaN(int _quant) throws Exception{
		int i = 0;

		while(i !=_quant) {
			this.incrementa();
			i++;

		}

	}


	public int compareTo(Data _data) {

		if(this.getDia() == _data.getDia() &&
				this.getMes() == _data.getMes() && 
				this.getAno() == _data.getAno() ) 
			return 0;

		else if((this.getAno() > _data.getAno()) || 
				(this.getAno() == _data.getAno() && this.getMes() > _data.getMes()) ||
				(this.getAno() == _data.getAno() && this.getMes() == _data.getMes() && this.getDia() > _data.getDia())) {
			return 1;
		}
		else {
			return -1;
		}		
	}

	public boolean equals(Object objeto) {

		Data aux = (Data) objeto;

		if(this.getDia() == aux.getDia() &&
				this.getMes() == aux.getMes() && 
				this.getAno() == aux.getAno() ) 
			return true;

		else 
			return false;

	}


	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append("[");
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		dados.append("]");
		return dados.toString();
	}  
}


