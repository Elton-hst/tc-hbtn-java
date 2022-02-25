import java.util.*;

public class Blog {
    private List<Post> posts = new ArrayList<>();

    public void adicionarPostagem(Post post) {
        for(Post p : posts) {
            if ((p.getAutor().compareTo(post.getAutor()) == 0) &&
                 (p.getTitulo() == post.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }

        this.posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> resultado = new TreeSet<>();
        
        for(Post p : posts) {
            resultado.add(p.getAutor());
        }

        return resultado;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> resultado = new HashMap<>();
        
        for(Post p : posts) {
            if (resultado.containsKey(p.getCategoria())) {
                int contagemAtual = resultado.get(p.getCategoria());
                resultado.put(p.getCategoria(), ++contagemAtual);
            } else {
                resultado.put(p.getCategoria(), 1);
            }
        }

        return resultado;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> resultado = new TreeSet<>();

        for(Post p : posts) {
            if (p.getAutor().compareTo(autor) == 0) {
                resultado.add(p);
            }
        }

        return resultado;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> resultado = new TreeSet<>();

        for(Post p : posts) {
            if (p.getCategoria().compareTo(categoria) == 0) {
                resultado.add(p);
            }
        }    
        
        return resultado;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> resultado = new TreeMap<>();

        for(Post p : posts) {
            if (resultado.containsKey(p.getCategoria())) {
                Set<Post> postsAtuais = resultado.get(p.getCategoria());
                postsAtuais.add(p);
                resultado.put(p.getCategoria(), postsAtuais);
            } else {
                Set<Post> posts = new TreeSet<Post>();
                posts.add(p);
                resultado.put(p.getCategoria(), posts);
            }
        }

        return resultado;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> resultado = new TreeMap<>();

        for(Post p : posts) {
            if (resultado.containsKey(p.getAutor())) {
                Set<Post> postsAtuais = resultado.get(p.getAutor());
                postsAtuais.add(p);
                resultado.put(p.getAutor(), postsAtuais);
            } else {
                Set<Post> posts = new TreeSet<Post>();
                posts.add(p);
                resultado.put(p.getAutor(), posts);
            }
        }

        return resultado;
    }
}