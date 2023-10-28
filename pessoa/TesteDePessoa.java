package pessoa;

public class TesteDePessoa {
    
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "33322211";
        pessoa1.nome = "Vagner";
        pessoa1.idade = 32;

        System.out.println(pessoa1.imprimirDadosDaPessoa());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "11122233";
        pessoa2.nome = "Joana";
        pessoa2.idade = 3;

        System.out.println(pessoa2.imprimirDadosDaPessoa());
    }
}
