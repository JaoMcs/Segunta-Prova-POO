package prova_poo;

public class Meta extends ItemAgenda {

	private int prioridade;
	private ItemAgenda item;
	
	
	public int getPrioridade() {
		return this.prioridade;
	}

	public void setPrioridade(int _prioridade) {
		this.prioridade = _prioridade;
	}
	
	public ItemAgenda getItem() {
		return this.item;
	}
	
	public void setItemAgenda(ItemAgenda _item) {
		this.item = _item;
	}
	
	
	public Meta () {
		
	}
	
	public Meta(int _prioridade, char _titulo, char _descricao, int _diaI, int _mesI,
			int _anoI, int _horaI, int _minutoI,  int _diaF, int _mesF, int _anoF,
			int _horaF, int _minutoF) throws Exception {

		
	}
	
	public Meta(int _prioridade, ItemAgenda _item) throws Exception {
	
		this.setPrioridade(_prioridade);
		this.setItemAgenda(_item);
		
	}
	
	public boolean equals(Object objeto) {

		Meta aux = (Meta) objeto;

		if (this.getItem().equals(aux.getItem()) && (this.getPrioridade() == aux.getPrioridade())){
			return true;
			
		}
		else 
			return false;

	}
	
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append(".\n"+this.item.toString());
		dados.append("Prioridade da Meta: "+this.getPrioridade());
		return dados.toString();
	}  
	
}
