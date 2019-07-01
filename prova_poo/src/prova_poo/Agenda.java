package prova_poo;

import java.util.*;
import java.io.*;

public class Agenda {

	private LinkedList<Meta> Metas = new LinkedList<Meta>(); 
	private LinkedList<Evento> Eventos = new LinkedList<Evento>(); 
	private LinkedList<Lembrete> Lembretes = new LinkedList<Lembrete>(); 


	public void addMeta(Meta _meta) {
		this.Metas.add(_meta);
	}
	public void addEvento(Evento _evento) {
		this.Eventos.add(_evento);
	}
	public void addLembrete(Lembrete _lembrete) {
		this.Lembretes.add(_lembrete);
	}

	public Meta getMeta(int _prioridade) {
		return this.Metas.get(_prioridade);
	}
	public Lembrete getLembrete(int _qtdeMinutos) {
		return this.Lembretes.get(_qtdeMinutos);
	}
	public Evento getEvento(char _local) {
		return this.Eventos.get(_local);
	}


	public Agenda (Meta _meta, Evento _evento, Lembrete _lembrete) {

		this.addMeta(_meta);
		this.addEvento(_evento);
		this.addLembrete(_lembrete);
	}


	public Agenda () {

	}

	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append(this.Metas);
		dados.append(this.Eventos);
		dados.append(this.Lembretes);
		return dados.toString();
	}

	
}
