public class Usuario implements ManipulacaoDoUsuario{
    private String nome;
    private String numeroTelefone;
    private String email;
    private boolean emprestimo;
    private boolean reserva;
    private boolean renovacao;
    private boolean devolucao;
    private int qntReservas;

    public Usuario(String nome, String numeroTelefone, String email, boolean emprestimo, boolean reserva, boolean renovacao, boolean devolucao, int qntReservas) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.email = email;
        this.emprestimo = false;
        this.reserva = false;
        this.renovacao = false;
        this.devolucao = true;
        this.qntReservas = 0;
    }

    public String getNome() {
        return this.nome;
    }
    public String getNumeroTelefone() {
        return this.numeroTelefone;
    }
    public String getEmail() {
        return this.email;
    }
    public int getQntReservas() {
        return this.qntReservas;
    }

    @Override
    public boolean fazerEmprestimo() {
        if(this.emprestimo == true || this.devolucao == false) {
            System.out.println("Emprestimo já registrado ou devolução em pendência!");
            return false;
        } else {
            System.out.println("Emprestimo registrado");
            this.emprestimo = true;
            return true;
        }
    }

    @Override
    public void fazerReserva() {
        System.out.println("Livros reservados: "+this.qntReservas);
        this.qntReservas++;
        System.out.println("Reserva realizada!");
        System.out.println("Livros reservados: "+this.qntReservas);
    }

    @Override
    public void fazerRenovacao() {

    }

    @Override
    public void fazerDevolucao() {
        System.out.println("Livros pendentes: "+this.qntReservas);
        if(this.qntReservas != 0) {
            this.devolucao = false;
            System.out.println("Livros pendentes: "+this.qntReservas);
        } else {
            this.devolucao = true;
        }
        this.qntReservas--;
        System.out.println("Livros pendentes: "+this.qntReservas);
    }
}
