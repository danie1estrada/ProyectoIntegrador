package model;

public class Ave extends Animal{

	private String especie;

	public Perro (int codigo, float precio, String descripcion,
		      super(codigo, precio, descripcion);
	               this.tama�o = tama�o;
                       this.color = color;
                        this.especie = especie;
 }
public String getEspecie(){
	return especie;
 }
public void setEspecie(String especie){
	this.especie = especie;
} 
@Override 
public String [] getInfo (){
return new String []{Integer.toString(codigo), Float.toString(precio),
descripcion, tama�o, color, especie};