public class ProfissionalDeSaude extends Pessoa{
    private int matricula;
    
    ProfissionalDeSaude(String nome, int idade, int matricula){
        super(nome, idade);
        setMatricula(matricula);
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void aplicar (Paciente paciente, Vacina vac){
        System.out.println(paciente.getNome() + " vacinado com "+ vac.getFabricante());
    }
}