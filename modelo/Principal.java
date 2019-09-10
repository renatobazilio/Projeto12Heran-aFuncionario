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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario objFunc01 = new Funcionario();
        objFunc01.setNome("joão");
        objFunc01.setSalario(500);
        objFunc01.setCpf("111222333");
        System.out.println("Func01: "+objFunc01.getNome());
        System.out.println("info: "+ objFunc01.getinformacao());
        
        Gerente objGer01 = new Gerente();
        objGer01.setNome("Maria");
        objGer01.setSalario(600);
        objGer01.setCpf("222333444");
        objGer01.setSetor("ADM");
        objGer01.setSenha("223344");
        System.out.println("Ger01: "+objGer01.getNome());
        System.out.println(objGer01.getinformacao());
        //testando senha gerente verdadeiro ou falso
        objGer01.getAutenticacao("223344");
        
        Funcionario objFunc02 = new Gerente();
        //casting entre objetos (classes)
        //da mesma forma que vimos em tipos PRIMITIVOS
        //Gerente objGer02 = (Gerente) new Funcionario();
        
        //atribuição entre objetos
        //usando casting
        //objFunc02 = objGer02;
        //objGer02 = (Gerente) objFunc02;
        
        
    }
    
}
