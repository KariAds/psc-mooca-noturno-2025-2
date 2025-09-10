package Poo;

public class Pessoafisica {
    
    public void criarPessoa(){
        boolean nasceu = true;

        if(nasceu){
        Pessoa pessoa = new Pessoa();
        pessoa.chorar();
        pessoa.setNome("Karina");
        pessoa.setCpf("123456789");
        pessoa.getNome();
        }else{
            System.out.println("nao nasceu");
        }
    }
    public void exibirPessoa(){
        Pessoa pessoa = new Pessoa();
        System.out.println("Bem vindo");
    }
}
