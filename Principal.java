public class Principal {
    public static void main(String[] args) {   
        Vacina vac = new Vacina(53, "Pfizer", "vacina covid-19");
        ProfissionalDeSaude profSaude = new ProfissionalDeSaude ("Maria", 27, 11223344);
        Paciente paciente = new Paciente("Joao", 43);

        profSaude.aplicar(paciente, vac);
    }
}