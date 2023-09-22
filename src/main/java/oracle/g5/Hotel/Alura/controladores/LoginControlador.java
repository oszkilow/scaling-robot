package oracle.g5.Hotel.Alura.controladores;

import oracle.g5.Hotel.Alura.modelo.usuario;
import oracle.g5.Hotel.Alura.views.Login;
import oracle.g5.Hotel.Alura.views.MenuUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class LoginControlador implements ActionListener {
	private Login vista;
	
	public LoginControlador(Login vista) {
		this.vista = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre = vista.getNombre();
		String contrasenia = vista.getContrasenia();
		

        if(usuario.validarUsuario(nombre, contrasenia)){
            MenuUsuario menu = new MenuUsuario();
            menu.setVisible(true);
            vista.dispose();	 
        }else {
            JOptionPane.showMessageDialog(vista, "Usuario o Contraseña no válidos");
        }
	}

}
