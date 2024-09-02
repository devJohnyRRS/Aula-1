import java.util.Date;


 class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean logar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}



// Funcionário
class Funcionario extends Usuario {
    private int numFuncional;

    public Funcionario(String login, String senha, int numFuncional) {
        super(login, senha);
        this.numFuncional = numFuncional;
    }

    public void registarHorario(Date hora) {
        System.out.println("Horário registrado: " + hora);
    }


    public int getNumFuncional() {
        return numFuncional;
    }

    public void setNumFuncional(int numFuncional) {
        this.numFuncional = numFuncional;
    }
}

class Aluno extends Usuario {
    private int matricula;
    private String curso;
    private int matricular;

    public Aluno(String login, String senha, int matricula, String curso) {
        super(login, senha);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void matricularSe() {
        System.out.println("Aluno matriculado no curso: " + curso);
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}


class Professor extends Funcionario {
    private String titulacao;

    public Professor(String login, String senha, int numFuncional, String titulacao) {
        super(login, senha, numFuncional);
        this.titulacao = titulacao;
    }

    public void digitarNotas(int turma) {
        System.out.println("Notas digitadas: " + turma);
    }

    // Getters e Setters
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}

//Teste
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("func_login", "func_senha", 12345);
        Aluno aluno = new Aluno("aluno_login", "aluno_senha", 67890, "ADS");
        Professor professor = new Professor("prof_login", "prof_senha", 54321, "prof");

        // Teste dos métodos
        funcionario.registarHorario(new Date());
        aluno.matricularSe();
        professor.digitarNotas(101);
    }
}

