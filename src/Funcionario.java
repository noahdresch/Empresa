/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa
 */
public class Funcionario {
    
    //atributos
    public String nome;
    public String empresa;
    public String cargo;
    public double salario;
    
    // metodo
    public void aumentoSalario( double aumento )
    {
        salario += aumento;
    }
    
    //metodo
    public void promocao( double aumento, String novoCargo )
    {
        cargo = novoCargo;
        
        aumentoSalario( aumento );
    }
    
    
}
