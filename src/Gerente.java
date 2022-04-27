public class Gerente extends Funcionario{
    private double salario;

    public Gerente(){
    }
    public Gerente (int matricula, String name, double salario){
        super(matricula, name);
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
