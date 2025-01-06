package main.java.br.com.filefacilete.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryService {
    String path = ("C:\\Users\\Microsoft\\Documents\\ProjetosJava\\FileFacilite\\src\\directoryToProject\\");
    public boolean createdDirectory( String directory){
        Path way = Paths.get(path,directory.toLowerCase());
        if (Files.notExists(way) ){
            try {
                Files.createDirectory(way);
            } catch (IOException e) {
                throw new RuntimeException(e);

            }
            System.out.println("criado com Sucesso");
            return true;
        }else {
            System.out.println("Falha ao criar o diretorio (Ele ja existe)");
            return false;
        }

    }
    public boolean deleteDirectory(String directory){
        Path way = Paths.get(path, directory.toLowerCase());
        if (Files.exists(way) && Files.isDirectory(way)){
            try {
                Files.delete(way);
            } catch (IOException e) {
                System.out.println("Erro");
                throw new RuntimeException(e);
            }
            System.out.println("Diretorio excluido  ( " + way.toAbsolutePath() + ")");
            return true;

        }else {
            System.out.println("Diretorio não existe");
            return false;
        }
    }
}
