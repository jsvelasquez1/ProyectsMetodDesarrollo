package mundo;

import java.util.Scanner;

//Clase Persona. La clase Persona es la Clase Base
public class Persona {
	private String nif;
	private String nombre;

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void leer(){
        Scanner sc = new Scanner(System.in);                                                                      
        System.out.print("Nif: ");
        nif = sc.nextLine();
        System.out.print("Nombre: ");
        nombre = sc.nextLine();     
    }
}