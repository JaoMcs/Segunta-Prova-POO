package prova_poo;

public class Periodo {
	
	private Data dataI;
	private Horario horaI;
	private Data dataF;
	private Horario horaF;
	
	
	// Gets e Sets
	public Data getDataI() {
		return dataI;
	}
	public void setDataI(Data _dataI) {
		this.dataI = _dataI;
	}
	public Horario getHoraI() {
		return horaI;
	}
	public void setHoraI(Horario _horaI) {
		this.horaI = _horaI;
	}
	public Data getDataF() {
		return dataF;
	}
	public void setDataF(Data _dataF) {
		this.dataF = _dataF;
	}
	public Horario getHoraF() {
		return horaF;
	}
	public void setHoraF(Horario _horaF) {
		this.horaF = _horaF;
	}
	
	public Periodo(Data _dataI, Horario _horaI, Data _dataF, Horario _horaF){
		
		
		this.setDataI(_dataI);
		this.setHoraI(_horaI);
		
		this.setDataF(_dataF);
		this.setHoraF(_horaF);
		
	}
	
	
	public Periodo(int _diaI, int _mesI, int _anoI, int _horaI, int _minutoI,  int _diaF, int _mesF, int _anoF, int _horaF, int _minutoF)throws Exception{
		
		this.setDataI(new Data(_diaI, _mesI, _anoI));

		this.setHoraI(new Horario (_horaI,_minutoI));

		
		this.setDataI(new Data(_diaF, _mesF, _anoF));
		
		this.setHoraI(new Horario (_horaF,_minutoF));

		
	}
	
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append("Data e Horario de Inicio: "+" Data e Horario de Fim: ");
		dados.append("\n[");
		dados.append(this.getDataI()+" "+this.getHoraI());
		dados.append("]");
		dados.append(" ");
		dados.append("[");
		dados.append(this.getDataF()+" "+this.getHoraF());
		dados.append("]");
		return dados.toString();
	}  
	
}
