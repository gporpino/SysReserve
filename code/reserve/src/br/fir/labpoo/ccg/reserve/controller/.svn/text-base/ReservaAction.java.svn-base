package br.fir.labpoo.ccg.reserve.controller;

import java.util.Collection;
import java.util.Set;

import org.vraptor.annotations.Component;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.facade.Facade;
import br.fir.labpoo.ccg.reserve.model.Apartamento;
import br.fir.labpoo.ccg.reserve.model.Reserva;

@Component
public class ReservaAction {
	
	private Collection<Reserva> reservas;
	private Reserva reserva;
	private Facade facade;
	private Set<Apartamento> apartamentos;
	
	public ReservaAction(){
		this.facade = Facade.getInstacia();
	}
	
	public Collection<Reserva> getReservas() {
		return reservas;
	}
	
	public Reserva getReserva() {
		return reserva;
	}
	
	public Set<Apartamento> getApartamentos(){
		return apartamentos;
	}
	
	public void saveReserva(Reserva reserva){
		try {
			facade.save(reserva);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeReserva(Reserva reserva){
		try {
			facade.excluir(reserva);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registerReserva(Reserva reserva){
		try {
			this.reserva = facade.consultar(reserva);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listReserva(){
		try {
			this.reservas = facade.listarReserva();
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	/*public void listApartamentosDisponiveis(Reserva reserva){
		this.apartamentos = facade.listApartamentosDisponiveis(reserva.getInicio(), reserva.getFim());
	}*/
}
