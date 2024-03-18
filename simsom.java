package simsom;

public class simsom {
     public static void main(String args[]) {
        jercicio p1 = new jercicio();
        
        //primeros datos
        p1.Nombre="homero";
        p1.Apellido="simpsom";
        p1.Edad="33";
        p1.Estatura="1.80";
        p1.Genero="masculino";
        System.out.println("\nnuevos valores de la persona");
        p1.desplegarDatos();
        if (p1.Nombre=="homero") {
            p1.Comer();
        }

        //datos de la segunda persona 
        jercicio p2 = new jercicio();
        p2.Nombre="march";
        p2.Apellido="simpsom";
        p2.Edad="32";
        p2.Estatura="1.76";
        p2.Genero="femenino";
        System.out.println("\nnuevos valores de la persona");
        p2.desplegarDatos();


        //datos de la tercera persona
        jercicio p3 = new jercicio();
        p3.Nombre="bart";
        p3.Apellido="simpsom";
        p3.Edad="11";
        p3.Estatura="1.50";
        p3.Genero="masculino";
        System.out.println("\nnuevos valores de la persona");
        p3.desplegarDatos();
        if (p3.Nombre=="bart") {
            p3.Hablar();
        }

        //datos de la cuarta persona
        jercicio p4 = new jercicio();
        p4.Nombre="lissa";
        p4.Apellido="simpsom";
        p4.Edad="10";
        p4.Estatura="1.50";
        p4.Genero="femenino";
        System.out.println("\nnuevos valores de la persona");
        p4.desplegarDatos();

        //datos de la quinta persona
        jercicio p5 = new jercicio();
        p5.Nombre="maggie";
        p5.Apellido="simpsom";
        p5.Edad="3";
        p5.Estatura="1.30";
        p5.Genero="femenino";
        System.out.println("\nnuevos valores de la persona");
        p5.desplegarDatos();
        if (p5.Nombre=="maggie") {
            p5.Reir();
        }
}
}
