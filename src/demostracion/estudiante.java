
package demostracion;


public class estudiante extends notas{
    //Elementos  miembros clase
    //atributos, caracteristiucas, campos, variable, datos
    //constructores
    //metodos
    int carnet;
   String nombre;
   String apellidos;
    int edad;
    
    public estudiante() {
        
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
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

    public void setApellidos(String apellidpos) {
        this.apellidos = apellidpos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String info_estudiante (String a, String b) {
        String name = "";
        name = a + " " + b;
        return name;
    }

    public estudiante(int carnet, String nombre, String apellidpos, int edad) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidpos;
        this.edad = edad;
    }
    
    public String info_estudiante() {
        String name ="";
        name=this.nombre+""+this.apellidos;
        return  name;
   
}
    public String info_estudiante(estudiante objeto) {
        String name = "*************\n";
        name += objeto.getNombre()+ " " + objeto.getApellidos()+ "\n";
        name += "********************\n";
        return name;
    }
    
public String informacion(){
    String name = "";
    name += "El carnet del estudiante es: " + this.carnet + "\n";
    name += "El nombre de el estudiante es: " + this.nombre + "\n";
    name += "El apellido de el estudiante es: " + this.apellidos + "\n";
    name += "La edad de el estudiante es: " + this.edad + "\n";
    return name;
}

}
