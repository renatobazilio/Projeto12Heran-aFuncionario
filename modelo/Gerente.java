/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Gerente extends Funcionario {
    
    private String setor;
    private String senha;
    
    //constrututor e getter e setter

    public Gerente() {
    }

    public Gerente(String setor, String senha,
            String nome, double salario, String cpf) {
        //palavra reservada SUPER
        //this.nome = nome;
        //this.salario = salario; 
        //this.cpf = cpf;
        super(nome, salario, cpf);
        this.setor = setor;
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //Sobrecarga (OVERRIDE) permite o uso
    //do conceito de polimorfismo da Orientação a objtos
    //usando para isto a anotação @override
    @Override
    public String getinformacao(){
        return "Gerente: " + this.nome+
                " recebe " + this.salario;
    }
    
    @Override
    public double getBonificaao(){
        return this.salario * 0.15;
    }
    
    public boolean getAutenticacao(String senha){
        //comparação strings usamos equals
        //comparação int usamos ==
        if (this.senha.equals(senha)){
            System.out.println("Acesso Permitido");
            return true;
        }else
        {
            System.out.println("Acesso Negado");
            return false;
        }
    }
    /*
    public String getNome() {
        return nome;
    }
    */
}
