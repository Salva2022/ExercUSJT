public class LivroDeNotas{

    private String nomeDoCurso;

    public String getNomeDoCurso(){
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso; // variavel que vai guardar o nome do curso de "private String nomeDoCurso";
    }

    public void exibirMensagem(String nomeDoCurso) {
        System.out.printf("Bem vindo ao livro de notas %s", nomeDoCurso);
        getNomeDoCurso();
    }
}


/*public class LivroDeNotas{
    public void exibirMensagem() {
        System.out.println("Bem vindo ao livro de notas");
    }
} */