public class Provincia extends Pais {
    //atributos
    private String fechaFundacion;
    private String autoridad;

    //constructores
    public Provincia(){
        super();
    }

    public Provincia(String nombre, int numHabitantes, String fechaFundacion, String autoridad) {
        super(nombre, numHabitantes);
        this.fechaFundacion = fechaFundacion;
        this.autoridad = autoridad;
    }

    //setters y getters
    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(String autoridad) {
        this.autoridad = autoridad;
    }

    //métodos
    public void mostrarCapital(){
        System.out.println("Se muestra la capital de provincia");
    }

    //metodo para mostrar información
    public void mostrarInfo(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Numero de habitantes: " + getNumHabitantes());
        System.out.println("Fecha de fundación: " + getFechaFundacion());
        System.out.println("Autoridad: " + getAutoridad());
    }
}
