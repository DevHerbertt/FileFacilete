package main.java.br.com.filefacilete.view;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class InterfaceUsuario {
    private final Scanner OPCAO = new Scanner(System.in);

    public int menu(String nome){
        System.out.println("O que você deseja fazer hoje " + nome + "? ");
        System.out.println(" 1- Criar Diretório \n 2- Excluir Diretório \n 3- Criar Arquivo \n 4- Excluir Arquivo\n " +
                "5- Verificar o Arquivo \n 6- Detalhes do Arquivo \n 7- Listar Arquivos e Diretórios \n 8- Finalizar");

        return OPCAO.nextInt();
    }

    public String acessPath(Scanner scanner, String mensagem){

        System.out.println(mensagem);
        return  scanner.nextLine();
    }

    public Path wayOfDirectoriesOrFiles(Path way){

        return way.toAbsolutePath();
    }

}
