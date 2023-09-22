package oracle.g5.Hotel.Alura.controladores;

import oracle.g5.Hotel.Alura.CRUD.ReservaCrud;
import oracle.g5.Hotel.Alura.factory.conexionBase;
import oracle.g5.Hotel.Alura.modelo.reserva;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

public class ReservaControlador {
	private ReservaCrud reservas;
	
	public ReservaControlador() {
		Connection con = new conexionBase().recuperarConexion();
		this.reservas = new ReservaCrud(con);	
	}
	
	public void guardar (reserva res) {
		this.reservas.guardar(res);
	}
	
	public List<reserva> buscar(){
		return this.reservas.buscar();
	}
	public List<reserva> buscarId(String id){
		return this.reservas.buscarId(id);
	}
		
	public void actualizar(Date fechaE, Date fechaS, String valor, String formaPago, Integer id) {
		this.reservas.Actualizar(fechaE, fechaS, valor,formaPago, id);
	}
	
	public void Eliminar(Integer id) {
		this.reservas.Eliminar(id);
	}
}
