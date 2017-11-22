package model;

public class Animal extends Producto{

	private String tamaño;
	private String color;

	public Animal(int codigo, float precio, String descripcio, 
                     super(codigo, precio, descripcion);
   		     this.tamaño = tamaño;
		     this.color = color;
 }
   public String getTamaño(){
	  return tamaño;
 }
   public void setTamaño(String Tamaño){
	  this.tipo = tipo;
}
   public String getColor(){
          return color;
 }
public void setColor(String color){
  	this.color = color;
 }
  @Override
public String [] getInfo(){
	return new String []{Integer.toString(codigo), Float.toString(Precio),
           descripcion, tamaño, color};