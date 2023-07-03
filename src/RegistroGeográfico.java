import java.util.ArrayList;
public class RegistroGeográfico {
    public static void main(String[] args) {
        //creacion de instancias
        Pais miPais = new Pais("Ecuador",17000000);
        Provincia miProvincia = new Provincia("Pichincha",3340039,"25/06/1984","Paola Pabon");
        Provincia tuProvincia = new Provincia("Guayas",4500000,"25/07/1537","Marcela Aguiñaga");
        Canton miCanton = new Canton("Distrito Metropolitano de Quito",2879791,"27/10/1993","Pabel Muñoz","Locro de papas");
        Barrio miBarrio = new Barrio("Auqui de Monjas",600,"20/05/2007","Juan Zapata","Salchipapa","La casa del árbol");


        //declarar array
        ArrayList<Provincia> provincias = new ArrayList<Provincia>();

        //añadir elementos al array
        provincias.add(miProvincia);
        provincias.add(tuProvincia);

        //imprimir array
        for(Provincia provincia : provincias){
            System.out.println("\n\t-> Provincia " + (provincias.indexOf(provincia)+1));
            provincia.mostrarInfo();
        }
    }
}
