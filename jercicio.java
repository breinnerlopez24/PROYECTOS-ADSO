package simsom;

public class jercicio {
    
    String Nombre;
    String Apellido;
    String Edad;
    String Estatura;
    String Genero;
    public void desplegarDatos(){
        System.out.println("nombre: "+Nombre);
        System.out.println("apellido: "+Apellido);
        System.out.println("edad: "+Edad);
        System.out.println("estatura: "+Estatura);
        System.out.println("genero: "+Genero);
    }
    public void Comer(){
        System.out.println(Nombre+ " esta comiendo");
    }
    public void Hablar(){
        System.out.println(Nombre+ " esta hablando");
    }
    public void Reir(){
        System.out.println(Nombre+ " esta riendo");
    }
}
