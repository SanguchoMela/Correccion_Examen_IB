public class Canton extends Provincia{
    //atributos
    private String comidaTipica;

    //constructores
    public Canton() {
        super();
    }

    public Canton(String nombre, int numHabitantes, String fechaFundacion, String autoridad, String comidaTipica) {
        super(nombre, numHabitantes, fechaFundacion, autoridad);
        this.comidaTipica = comidaTipica;
    }

    //setters y getters
    public String getComidaTipica() {
        return comidaTipica;
    }

    public void setComidaTipica(String comidaTipica) {
        this.comidaTipica = comidaTipica;
    }

    //métodos
    public void cocinarComidaTipica(){
        System.out.println("Se cocina comida tipica");
    }
}
