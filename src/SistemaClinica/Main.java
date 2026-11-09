package SistemaClinica;

public class Main {
    static void main(String[] args) {

        Perro perro = new Perro("Max", 3, "Carlos", "Labrador");
        Gato gato = new Gato("Luna", 2, "Maria", true);
        Ave ave = new Ave("Piolin", 1, "Pedro", 150);

        Animal[] animales = {perro, gato, ave};

        System.out.println("--- FICHAS ANIMALES ---");

        for (Animal animal : animales) {
            animal.imprimirFicha();
        }

        System.out.println("--- VACUNACION ---");

        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Parvovirus");

        gato.registrarVacuna("Triple felina");

        System.out.println("Vacunas de Max: " + perro.getVacunasAplicadas());
        System.out.println("Vacunas de Luna: " + gato.getVacunasAplicadas());

        Clinica clinica = new Clinica(
                "vetCare",
                "calle 10 # 20-30"
        );
        Asegurable[] asegurables = {perro, gato, ave};

        System.out.println("--- POLIZA DE SEGURO ---");

        for (Asegurable asegurado : asegurables) {
            System.out.println("Poliza: " + asegurado.obtenerNumeroPoliza());
            System.out.println("Prima anual: $" + asegurado.cacularPrimaSeguro);
        }

        Conejo conejo = new Conejo("copito", 2, "Laura");
        animales = new Animal[]{perro, gato, ave, conejo};

        System.out.println("--- ANIMALES CON CONEJO ---");

        for (Animal animal : animales ){
            animal.imprimirFicha();
        }
    }
}
