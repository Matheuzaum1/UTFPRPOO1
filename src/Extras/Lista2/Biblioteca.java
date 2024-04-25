package Extras.Lista2;

public class Biblioteca {
    String titulo;
    String autor;
    String editora;
    int numpaginas;
    int anodepublicacao;
    boolean situacao = true;

    public Biblioteca(String titulo, String autor, String editora, int numpaginas, int anodepublicacao,
            boolean situacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.numpaginas = numpaginas;
        this.anodepublicacao = anodepublicacao;
        this.situacao = situacao;
    }

    public void emprestar() {
        if (situacao == true) {
            System.out.println(this.titulo + " de " + this.autor + " está disponível para empréstimo.");
            situacao = false;
        } else {
            System.out.println(this.titulo + " de " + this.autor + " já está emprestado.");
        }
    }
    public void devolver() {
        if (situacao == false) {
            System.out.println(this.titulo + " de " + this.autor + " foi devolvido.");
            situacao = true;
        } else {
            System.out.println(this.titulo + " de " + this.autor + " já está devolvido.");
        }
    }

    @Override
    public String toString() {
        return "Biblioteca [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", numpaginas="
                + numpaginas + ", anodepublicacao=" + anodepublicacao + ", situacao=" + situacao + "]";
    }

}