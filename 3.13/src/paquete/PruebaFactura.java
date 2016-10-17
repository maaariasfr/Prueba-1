package paquete;
import java.util.Scanner;
public class PruebaFactura {
	private static Scanner entrada;

	//en esta clase estara el main y vamos a crear un objeto de tipo Factura y llamaremos
	//a sus metodos y atributos para jugar con ellos jajaj :)otrooooooooooooooooo
	
	//primero el main
	public static void main(String args[])
	{
		//creamos un objeto de la clase Factura y como este tenia un constructor, le 
		//ponemos los argumentos
		//como los primeros parametros son tipo String, se deben poner entre comillas ""
		Factura mifactura= new Factura("A2345", "esta bonito", 2, 12.3);
		
	System.out.printf("Tu producto tiene:\nNumero de pieza= %s\nDescripcion"
			+ "=%s\nCantidad=%d\nPrecio=%f", mifactura.getNumeroPieza(), 
			mifactura.getDescripcion(), mifactura.getCantidad(), mifactura.getPrecio());
	//it works!!!It's great :D
	//Ahora sabremos cual es el precio total
	
	System.out.printf("\nEl costo total es: %f\n", mifactura.obtenerMontoFactura());
	
	//Ahora estableceremos nuevos valores para cada atributo
	
	String numPieza;
	String descPieza;
	int cantPieza;
	double precioPieza;
	
	entrada = new Scanner(System.in);//podemos poner eso de static yyy eso en el main o
	//ponerlo norma pero nos da una advertencia
	
	//esto es para que lea los valores desde la consola
	System.out.println("Numero de pieza: ");
	numPieza= entrada.nextLine();
	System.out.println("Descripcion de la pieza: ");
	descPieza= entrada.nextLine();
	System.out.println("Cantidad: ");
	cantPieza= entrada.nextInt();
	System.out.println("Precio: ");
	precioPieza= entrada.nextDouble();
	
	//ya "atrapamos" los valores, ahora lo que haremos sera guardarlos como atributos de 
	//el objeto mifactura
	
	mifactura.setNumeropieza(numPieza);
	mifactura.setDescripcion(descPieza);
	mifactura.setCantidad(cantPieza);
	mifactura.setPrecio(precioPieza);
	
	System.out.printf("Tu producto ahora tiene:\nNumero de pieza= %s\nDescripcion"
			+ "=%s\nCantidad=%d\nPrecio=%f", mifactura.getNumeroPieza(), 
			mifactura.getDescripcion(), mifactura.getCantidad(), mifactura.getPrecio());
	
	System.out.printf("\nEl costo total es: %f\n", mifactura.obtenerMontoFactura());
	
	//NOTA IMPORTANTE... AL INTRODUCIR VALORES TIPO FLOAT O DOUBLE DESDE PANTALLA,
	//LOS DEBEMOS PONER CON COMA (,) NO CON PUNTO O SI NO SE CUCHIFLEA JAJAJ
	
	
	
	
	}
	
	
	
	

}
