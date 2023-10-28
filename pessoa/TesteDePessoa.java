package pessoa;

public class TesteDePessoa {
    
    public static void main(String[] args) {
        
        Professor professor = new Professor();
        professor.setCpf("333222111");
        professor.setNome("Vagner");
        professor.setIdade(32);
        professor.setSalario(50000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("111222333");
        aluno.setNome("Joana");
        aluno.setIdade(3);
        aluno.setMatricula("898989");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
