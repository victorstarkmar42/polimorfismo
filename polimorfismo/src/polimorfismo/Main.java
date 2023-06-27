package polimorfismo;

public class Main {
	public static void main (String[] args) {
		Bombero bombero1 = new Bombero(); 
		Persona persona1 = new Persona("Juan",bombero1,"OOAZ900824MTSRLL08");
		Militar raso1 = new Raso();
		persona1.setEmpleo(raso1);
		
		Persona persona2 = new Persona("Pedro",bombero1,"OOAZ900824MTSRLL08");
		Militar cabo1 = new Cabo();
		persona2.setEmpleo(cabo1);
		
		Persona persona3 = new Persona("Pedro",bombero1,"OOAZ900824MTSRLL09");
		Militar sargento1 = new Sargento();
		persona3.setEmpleo(sargento1);
		//persona3.empleo = cabo1;  no debe hacer esto
		Persona persona4 = new Persona("Juan",bombero1,"OOAZ900824MTSRLL08");
		
		
		//Usurpador usurpador = new Usurpador(" ",null,null);
		System.out.println(persona1.getNombre()+": "+persona1.getEmpleo().getInfo());
		System.out.println(persona2.getNombre()+": "+persona2.getEmpleo().getInfo());
		System.out.println(persona3.getNombre()+": "+persona3.getEmpleo().getInfo());
		System.out.println(persona4.getNombre()+": "+persona4.getEmpleo().getInfo());
		

		if(persona1.equals(persona4)) {
			System.out.println("Son la mimsa persona");
		}else {
			System.out.println("No son la mimsa persona");
		}
		
		//estudiar hashcode java
		//scope de spring 
		// Comparar 2 personas, dara verdadero si el nombre de la persona y el curp  el mismo, cada persona puede tener
		// un identificador único (CURP). 
		// modificar la clase persona para ingresar el CURP
		
		//encapsulamiento
		// Juan no puede ser modificado 
		// Crear la clase militar, clase abstracta, la clase va a definir un metodo llamado getRango
		// La clase militiar va a implementar de empleo 
		// Crear los 3 rango que se llamen, Cabo, Raso y Sargento  
		// La clase abstracta debe definir una variable para su rango, esta debe ser establecida en el constructor
		
		//CRear PAblo y pedro con diferente trabajo
		
		//Protected permite que sea visible para las clases heredadas 
		//Una clase abstracta tiene puede tener y también métodos con cuerpo y abstractos, no se puede instanciar así misma 
		// es decir, se debe instanaciar a través de una clase hija
		// Ejemplo de polimorfismos es una clase Padre que hereda a una o mas clases hijas 
		// y cada una tiene un propio comportamiento 
		// Herencia
		
		//Implements e solo pa interfaces
		//Extends es para clases 
	}
}
