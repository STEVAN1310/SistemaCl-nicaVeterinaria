package SistemaClinica;

import java.util.ArrayList;

public class perro extends Animal implements Vacunables, Asegurable{
    private String raza;
    private ArrayList<String> vacunas;

    public perro(String nombre, int edad, String nombreDueño, String raza) {
        super(nombre, edad, nombreDueño);
        this.raza = raza;
        this.vacunas = new ArrayList<>();
    }

    @override
    public double calcularCostoConsulta() {
        return 45000 + (3000 * edad);
   }
   @override
   public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
   }
   @override
    public int getVacunasAplicadas() {
        return vacunas.size();
   }
   @override
    public double calcularPrimeraSeguro(){
        return 80000 * edad;
   }
   @override
    public String obtenerNumeroPoliza(){
        return "POL-PERRO-" + nombre.toUpperCase();
   }
}
