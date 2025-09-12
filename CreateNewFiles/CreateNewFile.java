import java.io.*;

public class CreateNewFile{
    public static void main(String[] args){
        create();
    }

    private static void create() {
        try{
            // criando o arquivo
            File arquivo = new File("/home/alexandre/Área de trabalho/texto.txt");
            arquivo.createNewFile();
            // escrevendo algo no arquivo
            FileWriter writer = new FileWriter(arquivo);
            writer.write("testando se eu posso escrever kkkkkk");
            // lendo oque esta escrito no arquivo
            FileReader reader = new FileReader(arquivo);
            reader.ready();
            // fechando os objetos abertos
            writer.close();
            reader.close();

        } catch(IOException error){
            error.getMessage();
        }

    }
}
