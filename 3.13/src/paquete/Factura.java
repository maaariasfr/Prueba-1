package paquete;
//prueba de cambios en github 
public class Factura 
{
	
	private String numeroPieza;//estos son todos los atributos de la clase factura
	private String descripcion;
	private int cantidad;
	private double precio;
	
	//procedemos a crear el constructor
	public Factura(String num, String desc, int cuantos, double aComo)
	{
		numeroPieza = num;
		descripcion= desc;
		if(cuantos>0){
			cantidad=cuantos;
		}
		if(aComo>0){
		precio= aComo;
		}
	}//hasta aqui va el constructor
	
	//ahora crearemos los metodos set y get para cada variable
	
	public void setNumeropieza(String num)
	{
		numeroPieza=num;
	}
	
	public void setDescripcion(String d)
	{
		descripcion=d;
	}
	
	public void setCantidad(int c)
	{
		cantidad=c;
	}
	
	public void setPrecio(double p)
	{
		precio=p;
	}
	//hasta ahi, lo que hicimos fueron los metodos que sirven para establecer el valor de cada
	//uno de los atributos de nuestro objeto tipo Factura
	
	//ahora haremos metodos para obtener los atributos de nuestro objeto tipo Factura
	
	public String getNumeroPieza(){//este metodo retorna una cadena y no recibe parametros
		return numeroPieza;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public int getCantidad(){
		return cantidad;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	//ahora harenmos un metodo que nos calcule precio total, multiplicando cantidad*precio
	
	public double obtenerMontoFactura(){
		return precio*cantidad;//probemos luego multiplicar los gets de precio y cantidad
	}
}
