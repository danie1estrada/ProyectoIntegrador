package model;

public class Gato extends Animal{

	private String raza;

	public Perro (int codigo, float precio, String descripcion, String tamaño, String color
		      super(codigo, precio, descripcion, tam, color);
	              this.raza = raza;
 }
public String getRaza(){
	return raza;
 }
public void setRaza(String raza){
	this.raza = raza;
} 
@Override 
public String [] getInfo (){
return new String []{Integer.toString(codigo), Float.toString(precio),
descripcion, tam, color, raza};