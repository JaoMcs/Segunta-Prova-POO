package prova_poo;

public class ItemAgenda {
	
	private String titulo;
	private String descricao;
	private Periodo periodo;
	
	// Gets e Sets
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}
	public Periodo getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(Periodo _periodo) {
		this.periodo = _periodo;
	}
	
	
	public ItemAgenda (String _titulo, String _descricao, Periodo _periodo) {
		
		this.setTitulo(_titulo);
		this.setDescricao(_descricao);
		this.setPeriodo(_periodo);
		
	}
	
	public ItemAgenda (String _titulo, String _descricao, int _diaI, int _mesI, int _anoI, int _horaI, int _minutoI,  int _diaF, int _mesF, int _anoF, int _horaF, int _minutoF)throws Exception{
		
		this.setTitulo(_titulo);
		this.setDescricao(_descricao);
		
		this.setPeriodo(new Periodo(_diaI,_mesI,_anoI,_horaI,_minutoI,_diaF,_mesF,_anoF,_horaF,_minutoF));
		
	}
	
	public ItemAgenda() {
		
	}
	
	public int compareTo(ItemAgenda aux) {

		if( this.getTitulo().compareTo(aux.getTitulo())==1) {
			return 1;
		}
		else if( this.getTitulo().compareTo(aux.getTitulo())==-1) {
			return -1;
		}
		else {
			if( this.getDescricao().compareTo(aux.getDescricao())==1) {
				return 1;
			}
			if( this.getDescricao().compareTo(aux.getDescricao())==-1 ) {
				return -1;
			}
			
		}
		return 0;
	}	
	
	
	
	public boolean equals(Object objeto) {

		ItemAgenda aux = (ItemAgenda) objeto;

		if (this.getTitulo().equals(aux.getTitulo())&&this.getDescricao() == aux.getDescricao()){
			return true;
			
		}
		else 
			return false;

	}
	
	
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append("Nome: "+this.getTitulo() + ".\n"+ this.getDescricao());
		dados.append(".\n"+this.periodo.toString());
		return dados.toString();
	}  
	
}
