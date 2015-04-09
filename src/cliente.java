/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class cliente{
    String nombre,apellidos,direccion;
public cliente(){
    nombre="Pedro";
    apellidos="Salazar";
    direccion="Tarapoto";

System.out.println("El cliente es:  "+nombre+"\t"+apellidos+"\t"+"De:  "+"\t"+direccion);
      
        
}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
//constructor
    public cliente(String nombre, String apellidos, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }
//operaciones del cliente
    public void pagar(){
    System.out.println("Estoy pagando al contado");
    
}
   public void comprar(){
       System.out.println("Estoy comprando un tarro de leche");
   
   }
   public void escoger(){
       System.out.println("Estoy escogiendo productos lacteos");
  
            
    }
   }

