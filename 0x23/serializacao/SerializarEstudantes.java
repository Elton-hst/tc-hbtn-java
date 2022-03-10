import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<E> {

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) throws IOException {

        try {
            FileOutputStream fos = new FileOutputStream(nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(estudantes);
            oos.close();
        }catch (IOException e){
            System.out.println("Nao foi possivel serializar");
        }
    }

    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() throws IOException {
        List<Estudante> estudantes = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(nomeArquivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            estudantes = (List<Estudante>) ois.readObject();
            fis.close();
            ois.close();
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Nao foi possivel desserializar");
        }
        return estudantes ;
    }
}