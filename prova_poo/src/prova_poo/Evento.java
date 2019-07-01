package prova_poo;

public class Evento extends ItemAgenda {
	
	private String localEvento;
	private ItemAgenda item;
	
	public String getLocalEvento() {
		return this.localEvento;
	}

	public void setLocalEvento(String _evento) {
		this.localEvento = _evento;
	}
	
	public ItemAgenda getItem() {
		return this.item;
	}
	
	public void setItemAgenda(ItemAgenda _item) {
		this.item = _item;
	}
	
	public Evento(String _evento, ItemAgenda _item) throws Exception {
		
		this.setLocalEvento(_evento);
		this.setItemAgenda(_item);
		
	}
	
	public boolean equals(Object objeto) {

		Evento aux = (Evento) objeto;

		if (this.getItem().equals(aux.getItem()) && (this.getLocalEvento().equals(aux.getLocalEvento()))){
			return true;
			
		}
		else 
			return false;

	}
	
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append(".\n"+this.item.toString());
		dados.append("Local do Evento: "+this.getLocalEvento());
		return dados.toString();
	} 

}