package model;

public class Gato extends Animal{

	private String raza;

	public Perro (int codigo, float precio, String descripcion,
		      super(codigo, precio, descripcion);
	               this.tama�o = tama�o;
                       this.color = color;
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
descripcion, tama�o, color, raza};