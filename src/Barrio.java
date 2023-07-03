public class Barrio extends Canton{
    //atributos
    private String atraccionTuristica;
    //constructores
    public Barrio() {
        super();
    }

    public Barrio(String nombre, int numHabitantes, String fechaFundacion, String autoridad, String comidaTipica, String atraccionTuristica) {
        super(nombre, numHabitantes, fechaFundacion, autoridad, comidaTipica);
        this.atraccionTuristica = atraccionTuristica;
    }

    //setters y getters
    public String getAtraccionTuristica() {
        return atraccionTuristica;
    }

    public void setAtraccionTuristica(String atraccionTuristica) {
        this.atraccionTuristica = atraccionTuristica;
    }

    //métodos
    public void visitarAtraccion(){
        System.out.println("Se visita una atraccion turistica");
    }
}
