import java.util.*;

public class Blog {

    private List<Post> post;

    public Blog() {
        post = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        for (Post postagem : this.post) {
            if (postagem.getAutor().compareTo(post.getAutor()) == 0
                    && postagem.getTitulo().compareTo(post.getTitulo()) == 0) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        this.post.add(post);

    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post postAutor : post) {
            autores.add(postAutor.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> obterContagemPorCategoria = new TreeMap<>();

        for (Post post : post) {
            Categorias categoria = post.getCategoria();
            Integer contadorCategoria = obterContagemPorCategoria.get(categoria);
            if (contadorCategoria == null) {
                obterContagemPorCategoria.put(categoria, 1);
            } else {
                contadorCategoria++;
                obterContagemPorCategoria.replace(categoria, contadorCategoria);
            }
        }
        return obterContagemPorCategoria;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsPorAutor = new TreeSet<>();
        for (Post post : post) {
            if (post.getAutor().compareTo(autor) == 0) {
                postsPorAutor.add(post);
            }
        }
        return postsPorAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categorias) {
        Set<Post> postsPorCategoria = new TreeSet<>();
        for (Post post : post) {
            if (post.getCategoria().compareTo(categorias) == 0) {
                postsPorCategoria.add(post);
            }
        }
        return postsPorCategoria;
    }



    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> categoriasMap = new TreeMap<>();
        Set<Post> postsSet = new TreeSet<>();


        for (Post post : post) {
            postsSet = new TreeSet<>();

            Categorias categoria = post.getCategoria();
            Set<Post> posts = categoriasMap.get(categoria);

            if (posts == null) {
                postsSet.add(post);
                categoriasMap.put(categoria, postsSet);
            } else if (!postExiste(post, posts)){
                    posts.add(post);
                    categoriasMap.replace(categoria, posts);
                }
            }

            return categoriasMap;
        }


    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> autoresMap = new TreeMap<>();
        Set<Post> postsSet = new TreeSet<>();

        for (Post post : post) {
            postsSet = new TreeSet<>();
            Autor autor = post.getAutor();
            Set<Post> posts = autoresMap.get(autor);

            if (posts == null) {
                postsSet.add(post);
                autoresMap.put(autor, postsSet);
            } else if (!postExiste(post, posts)){
                posts.add(post);
                autoresMap.replace(autor, posts);
            }
        }

        return autoresMap;

    }

        private boolean postExiste (Post post, Set<Post> posts ) {
            for (Post postagem : posts) {
                if (post.getAutor().compareTo(postagem.getAutor()) == 0 &&
                        post.getTitulo().compareTo(postagem.getTitulo()) == 0) {
                    return true;
                }
            }
            return false;
    }
}