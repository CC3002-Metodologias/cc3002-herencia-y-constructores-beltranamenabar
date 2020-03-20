public class Main {

    public static void main(String[] args) {
        Persona p = new Persona("Nicolás", "Ingeniero en Computación", 30);
        Estudiante e = new Estudiante("Juan",21);
        Academico a = new Academico("Pedro",30, "Esto es un paper");

        System.out.println(p.hacerLoSuyo());
        p.comer();
        p.dormir();
        System.out.println("");
        System.out.println(a.hacerLoSuyo());
        a.comer();
        a.dormir();
        System.out.println("");
        System.out.println(e.hacerLoSuyo());
        e.comer();
        e.dormir();
        System.out.println("");

    }
}
