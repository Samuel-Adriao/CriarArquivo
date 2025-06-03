import java.io.FileWriter;
import java.io.IOException;

public class Escritor {
    public static void main(String[] args){

try{
    FileWriter escritor1 = new FileWriter("arquivoFrase.txt");
    escritor1.write("Essa é uma frase de texte.");
    escritor1.close();
    System.out.println("Se tudo ocorreu bem com o escritor1, essa mensagem irá ser mostrada");
} catch(IOException e){
    System.out.println("Se algo deu errado essa mensagem será mostrada");
    e.printStackTrace();
}

try{
    FileWriter escritor2 = new FileWriter("frase.txt");
    escritor2.write("A prática leva à perfeição");
    escritor2.close();
    System.out.println("Tudo Certo!");
}catch(IOException e){
    System.out.println("Algo deu errado!");
    e.printStackTrace();
}

    }
}


