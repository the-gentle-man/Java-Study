package com.exercicio02;

public class Contatos
{
        private String nome;
        private String telefone;
        private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

   public String informaçãoDeContato(Contatos contato) {

        return "Contatos{" +
                "nome='" + this.getNome() + '\'' +
                ", telefone='" + this.getTelefone() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                '}';
   }

}
