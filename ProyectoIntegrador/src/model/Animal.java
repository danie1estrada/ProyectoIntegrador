package model;

public abstract class Animal extends Producto{

	private String tama�o;
	private String color;

	public Animal(int codigo, float precio, String descripcion, 
                     super(codigo, precio, descripcion);
   		     this.tama�o = tama�o;
		     this.color = color;
 }
   public String getTama�o(){
	  return tama�o;
 }
   public void setTama�o(String Tama�o){
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
           descripcion, tama�o, color};