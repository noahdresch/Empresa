/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa
 */
public class Start {
    
    /**
     * Toda vez que rodamos a aplicação esse método é chamado por primeiro
     * 
     * @param args 
     */
    public static void main( String[] args )
    {
        /**
         * Criaremos uma instancia (obejto) da classe controladora. Será apenas uma instancia
         * pois ela vai armazenar e controlar todas as operações feitas dentro do while true
         */
        Controladora controladora = new Controladora();

        while ( true )
        {
            int opcao = Entrada.leiaInt( "Digite uma opção:\n" +
                                         "1 - Adicionar funcionario\n" +
                                         "2 - Listar salário mensal\n" +
                                         "3 - Listar salário anual\n" +
                                         "4 - Promover funcionário\n" +
                                         "5 - Dar aumento funcionário\n" +
                                         "6 - Imprime funcionário\n" +
                                         "7 - Sair" );
            
            if ( opcao == 1 )
            {
                /**
                 * Criaremos uma nova instancia do Funcionario
                 * toda a vez que escolher a opção 1 vamos criar um novo
                 * funcionario, preencher os atributos e passar ele para a o objeto controladora
                 * que vai armazenar.
                 */
                Funcionario funcionario = new Funcionario();
                funcionario.nome = Entrada.leiaString( "Insira nome: ");
                funcionario.empresa = Entrada.leiaString( "Insira empresa:");
                funcionario.cargo = Entrada.leiaString( "Insira cargo:");
                funcionario.salario = Entrada.leiaDouble( "Insira salario:");

                controladora.addFuncionario( funcionario );
                
                System.out.println( "Funcionário adicionado com sucesso" );
            }
            
            else if ( opcao == 2 )
            {
                System.out.println( "Salário da empresa: " + controladora.getGastosMensais() );
            }
            
            else if ( opcao == 3 )
            {
                System.out.println( "Salário da empresa: " + controladora.getGastosAnual() );
            }
            
            else if ( opcao == 4 )
            {
                String nome = Entrada.leiaString( "Insira o nome do funcionário" );
                
                Funcionario funcionario = controladora.getFuncionario( nome );
                
                //se encontrar o funcionario pedimos o cargo e valor de aumento
                if ( funcionario != null )
                {
                    String cargo = Entrada.leiaString( "Insira o nova Cargo");
                    double valor = Entrada.leiaDouble( "Insira o valor de aumento" );
                    
                    //chamamos o metodo que troca o cargo do funcionario e acrescenta o valor no salario
                    funcionario.promocao( valor,cargo );
                }
                
                else
                {
                    System.out.println( "Funcionário não encontrado" );
                }
            }
            
            else if ( opcao == 5 )
            {
                String nome = Entrada.leiaString( "Insira o nome do funcionário" );
                
                Funcionario funcionario = controladora.getFuncionario( nome );
                
                //se encontrar o funcionario pedimos o cargo e valor de aumento
                if ( funcionario != null )
                {
                    double valor = Entrada.leiaDouble( "Insira o valor de aumento" );
                    
                    //chamamos o metodo que aumenta o valor no salario
                    funcionario.aumentoSalario( valor );
                }
                
                else
                {
                    System.out.println( "Funcionário não encontrado" );
                }
            }
            
            else if ( opcao == 6 )
            {
                String nome = Entrada.leiaString( "Insira o nome do funcionário" );
                
                Funcionario funcionario = controladora.getFuncionario( nome );
                
                if ( funcionario != null )
                {
                    System.out.println( funcionario.nome );
                    System.out.println( funcionario.empresa );
                    System.out.println( funcionario.cargo );
                    System.out.println( funcionario.salario );
                }
                
                else
                {
                    System.out.println( "Funcionário não encontrado" );
                }
            }
            
            else if ( opcao == 7 )
            {
                System.out.println( "tchau" );
                //Saimos do programa!
                System.exit( 0 );
            }
        }
    }
    
}
