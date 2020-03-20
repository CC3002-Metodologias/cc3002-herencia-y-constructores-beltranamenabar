public class Estudiante extends Persona{
    public Estudiante(String nombre, String ocupacion, int edad){
        super(nombre, ocupacion, edad);
    }

    public void comer() {
        System.out.println("Ñom Ñom completo de Gorbea");
    }

    public void dormir() {
        System.out.println("ZzzZzZ");
    }

    public String hacerLoSuyo() {
        return super.hacerLoSuyo() + "\n" + "Viendo Netflix";
    }
}
