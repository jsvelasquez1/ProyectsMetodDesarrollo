package mundo;

import java.util.Scanner;

//Clase Alumno. Es la clase derivada. La clase Alumno hereda de la clase Persona
public class Alumno extends Persona {
	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override  //indica que se modifica un método heredado                                                        
    public void leer(){
        Scanner sc = new Scanner(System.in);
        super.leer(); //se llama al método leer de Persona para leer nif y nombre                                 
        System.out.print("Curso: ");
        curso = sc.nextLine(); //se lee el curso
    }  
}
