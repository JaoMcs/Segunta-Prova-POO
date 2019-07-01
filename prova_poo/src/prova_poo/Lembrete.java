package prova_poo;

public class Lembrete extends ItemAgenda{

	private int qtdeMinutos;
	private ItemAgenda item;
	
	public int getQtdeMinutos() {
		return this.qtdeMinutos;
	}

	public void setQtdeMinutos(int _qtdeminuto) {
		this.qtdeMinutos = _qtdeminuto;
	}
	
	public ItemAgenda getItem() {
		return this.item;
	}
	
	public void setItemAgenda(ItemAgenda _item) {
		this.item = _item;
	}
	
	public Lembrete(int _qtdeminuto, ItemAgenda _item) throws Exception {
		
		this.setQtdeMinutos(_qtdeminuto);
		this.setItemAgenda(_item);
		
	}
	
	public boolean equals(Object objeto) {

		Lembrete aux = (Lembrete) objeto;

		if (this.getItem().equals(aux.getItem()) && (this.getQtdeMinutos() == aux.getQtdeMinutos())){
			return true;
			
		}
		else 
			return false;

	}
	
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append(".\n"+this.item.toString());
		dados.append("Quantidade de Minutos: "+this.getQtdeMinutos());
		return dados.toString();
	} 
	
}
