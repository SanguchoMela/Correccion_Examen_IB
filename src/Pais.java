public class Pais {
    //atributos
    private String nombre;
    private int numHabitantes;

    //constructores
    public Pais(){}

    public Pais(String nombre, int numHabitantes) {
        this.nombre = nombre;
        this.numHabitantes = numHabitantes;
    }

    //setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    //métodos
    public void convocarElecciones(){
        System.out.println("Este es el metodo para convocar a elecciones");
    }
}
