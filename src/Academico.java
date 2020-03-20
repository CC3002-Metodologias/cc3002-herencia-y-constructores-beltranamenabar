public class Academico extends Persona{
    private String paper;
    public Academico(String nombre, String ocupacion, int edad, String paper){
        super(nombre, "Academico", edad);
        this.paper = paper;
    }

    public void dormir(){
        System.out.println("ZzzZzZz");
    }

    public String hacerLoSuyo(){
        return super.hacerLoSuyo() + "\n" + "Aprendiendo a usar Zoom";
    }

    public String publicarPaper(){
        return paper;
    }
}
