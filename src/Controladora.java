
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa
 */
   public class Controladora
{
    /**
     * Arraylist que vai armazenar os funcionarios
     * 
     * para criar um ArrayList vamos sempre usar o exemplo abaixo e vamos colocar entre <> a classe que 
     * desejamos armazenar com ArrayList<Carro>, ArrayList<Pessoa>, ArrayList<Conta>
     * 
     * para usar o ArrayList temos que lembrar de importar o "import java.util.ArrayList"
     *
     */
    private final ArrayList<Funcionario> funcionarios = new ArrayList();
    
    /**
     * 
     * @param f Funcionario recebemos o objeto "Funcionario f" pronto da classe Start.java, onde criamos uma nova instancia 
     * através do new Funcionario e populamos os atributos atraves do Entrada.leia
     */
    public void addFuncionario( Funcionario f )
    {
        //adiciona o objeto no array list 
        funcionarios.add( f );
    }
    
    public void imprimeFuncionarios()
    {
        /**
         * Exemplo de uso do ArrayList que é Classe que vamos utilizar  no lugar do vetor[]
         * 
         * Temos o exemplo para buscar o tamanho do array `funcionarios.size()`
         * Temos o exemplo para recuperar um Objeto de determindado posição do array `funcionarios.get( i )`
         * Temos o exemplo para adicionar um Objeto dentro do array `funcionarios.add( funcionario )`
         * 
         */
                             //funcionarios.lenght
        for ( int i = 0; i < funcionarios.size(); i++ )
        {
            Funcionario f = funcionarios.get( i );
//            //Funcionario f = funcionarios[ i ];
        }
        
        
        /**
         * Percore todos os obejtos dentro de um array
         */
        for ( Funcionario f : funcionarios )
        {
            System.out.println( f.nome );
        }
    }
    
    /**
     * Recebemos uma String nome como parametro e então percoremos todo o arraylist
     * comparando a String nome com o atributo nome do Funcionario, caso encontar um
     * funcionario devolvemos o mesmo. Se passar todo o arraylist e não encontrar
     * devolvemos null, pois não tem o funcionario cadastrado.
     * 
     * @param String nome
     * @return Funcionario f
     */
    public Funcionario getFuncionario( String nome )
    {    
        for ( Funcionario f : funcionarios )
        {
            if ( f.nome.equals( nome ) )
            {
                return f;
            }
        }
        
        return null;
    }
    
    /**
     * Percorre o array funcionarios e soma os salarios
     * 
     * @return double Soma dos salarios de todos os funcionarios
     */
    public double getGastosMensais()
    {
        double soma = 0;
        
        for ( Funcionario f : funcionarios )
        {
            soma += f.salario;
        }
        
       return  soma;
    }
    
    /**
     * Retorana o getGastosMensais * 13
     * 
     * @return double
     */
    public double getGastosAnual()
    {
        /**
         * Da mesma forma que temos acesso ao atributo, como por exemplo o atributo `funcionarios`,
         * podemos chamar os métodos que pertecem a classe como no exemplo abaixo chamamos o metódo
         * getGastosMensais() que faz a soma dos salarios e depois fazemos apenas o * 13, reaproveitadno 
         * o código acima.
         */
        return getGastosMensais() * 13;
    }
    

}