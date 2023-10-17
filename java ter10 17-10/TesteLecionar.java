public class TesteLecionar {
    public static void main(String[] args) {
        var profHorista = new ProfessorHorista();
        profHorista.setNome("Rodrigo");
        var profPesq = new ProfessorPesquisador();
        profPesq.setNome("José");
        profHorista.lecionar();
        profPesq.lecionar();
    }
}