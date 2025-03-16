public class Noticias {
    private String titulo;
    private String conteudo;
    private String link;

    public Noticias(String titulo, String conteudo, String link) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.link = link;
    }

    public void exibirNoticia() {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Para mais informações, clique no link: " + link);
    }

    public void clicarNoLink() {
        System.out.println("Redireciona para: " + link);
    }
}