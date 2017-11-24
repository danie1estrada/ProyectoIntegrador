package model;

public abstract class Animal extends Producto{

	private String tamaño;
	private String color;

	public Animal(int codigo, float precio, String descripcion, 
                     super(codigo, precio, descripcion);
   		     this.tam = tam;
		     this.color = color;
 }
   public String getTamaño(){
	  return tam;
 }
   public void setTam(String Tam){
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
	return new String []{Integer.toString(codigo), Float.toString(precio),
           descripcion, tam, color};