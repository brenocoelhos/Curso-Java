package entities;


import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String email;
    private LocalDate data;

    public Cliente() {}

    public Cliente(String nome, String email, LocalDate data) {
        this.nome = nome;
        this.email = email;
        this.data = data;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
}

