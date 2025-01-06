package main.java.br.com.filefacilete.core;

import main.java.br.com.filefacilete.models.Usuario;
import main.java.br.com.filefacilete.services.DirectoryService;
import main.java.br.com.filefacilete.services.FileService;
import main.java.br.com.filefacilete.view.InterfaceUsuario;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileFacileteApp {
    public static void main(String[] args) {
        try (final Scanner SCANNER = new Scanner(System.in)){
            boolean finish = false;
            InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
            DirectoryService directoryService = new DirectoryService();
            FileService fileService = new FileService();
            System.out.println("Iniciando sistema");
            System.out.println("Qual seu nome ? ");
            String nomeDoUsuario = SCANNER.nextLine();

            do {
                 int opcao = interfaceUsuario.menu(nomeDoUsuario);
                switch (opcao) {
                    case 1:
                        String directory = interfaceUsuario.acessPath(SCANNER, "Nome do diretório :");
                        boolean createdDirectory = directoryService.createdDirectory(directory);
                        System.out.println("--------------------");
                        System.out.println(" ");
                        break;
                    case 2:
                        String deleteDirectory = interfaceUsuario.acessPath(SCANNER, "Nome do diretório para ser deletado :");
                        directoryService.deleteDirectory(deleteDirectory);
                        System.out.println("--------------------");
                        System.out.println(" ");
                        break;
                    case 3:
                        String directoryFile = interfaceUsuario.acessPath(SCANNER, "Nome do diretório que o arquivo será salvo  :");
                        String file = interfaceUsuario.acessPath(SCANNER, "Nome do arquivo  :");
                        fileService.createdFile(directoryFile, file);
                        System.out.println("--------------------");
                        System.out.println(" ");
                        break;
                    case 4:
                        String directoryToDeleteFile = interfaceUsuario.acessPath(SCANNER, "Nome do diretório que o arquivo será salvo  :");
                        String fileDelete = interfaceUsuario.acessPath(SCANNER, "Nome do arquivo  :");
                        fileService.deleteFile(directoryToDeleteFile, fileDelete);
                        System.out.println("--------------------");
                        System.out.println(" ");
                        break;
                    case 5:
                        String directoryToFile = interfaceUsuario.acessPath(SCANNER, "Nome do diretório :");
                        String fileRead = interfaceUsuario.acessPath(SCANNER, "Nome do arquivo que será lido :");
                        fileService.readFile(directoryToFile, fileRead);
                        System.out.println("--------------------");
                        System.out.println(" ");
                        break;
                    case 6:
                        String directoryToDetails = interfaceUsuario.acessPath(SCANNER, "Nome do diretório :");
                        String fileDetails = interfaceUsuario.acessPath(SCANNER, "Nome do arquivo que será lido :");
                        fileService.verificationOfFile(directoryToDetails, fileDetails);
                        System.out.println("--------------------");
                        System.out.println(" ");
                        break;
                    case 7:
                        System.out.println("-----------------------------");
                        fileService.listAllFilesAndDirectories();
                        System.out.println("-----------------------------");
                        break;
                    case 8:
                        System.out.println("Finalizando o FileFacilite...");
                        System.out.println("Desenvolvido por Herbert Matheus Oliveira Santos.");
                        System.out.println("Copyright © Herbert Matheus O.S.");
                        System.out.println("Confira o meu trabalho no GitHub: https://github.com/DevHerbertt");
                        System.out.println("Conecte-se comigo no LinkedIn: https://www.linkedin.com/in/herbert-matheus-o-s-081061307/");
                        System.out.println("--------------------");
                        System.out.println(" ");
                        finish = true;
                        break;
                    default:
                        System.out.println("Sua escolha não foi reconhecida ");
                        finish = true;
                        break;

                }

            }while (!finish);


        }
    }
}
