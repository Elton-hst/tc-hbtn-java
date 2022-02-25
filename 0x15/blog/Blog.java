import java.util.*;

public class Blog {

    private List<Post> posts = new ArrayList<>();


    public void adicionarPostagem(Post postagem) {
        posts.add(postagem);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();

        for (Post post : posts) {
            autores.add(post.getAutor());
        }

        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer>obterContagemPorCategoria = new TreeMap<>();

        int contagem;
        for(Post post: posts) {
            if(obterContagemPorCategoria.containsKey(post.getCategoria())){
                contagem = obterContagemPorCategoria.get(post.getCategoria());
            }
            else {
                contagem = 0;
            }

            obterContagemPorCategoria.put(post.getCategoria(), contagem  + 1);

        }

        return obterContagemPorCategoria;
    }

}