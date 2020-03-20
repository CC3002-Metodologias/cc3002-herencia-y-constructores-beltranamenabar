public class Academico extends Persona{
    private String paper;
    public Academico(String nombre, String ocupacion, int edad, String paper){
        super(nombre, ocupacion, edad);
        this.paper = paper;
    }
}
