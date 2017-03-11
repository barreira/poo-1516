
/**
 * Write a description of class Utilizador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Utilizador
{
    // Variáveis de instância
    
    private String email;
    private String nome;
    private String password;
    private String morada;
    private Calendar dataNascimento;
    
    
    // Construtores
    
    public Utilizador(String email, String nome, String password, String morada, 
                      Calendar dataNascimento) {
        this.email = email;
        this.nome = nome;
        this.password = password;
        this.morada = morada;
        this.dataNascimento = (GregorianCalendar) dataNascimento.clone();
    }
    
    public Utilizador() { this("", "", "", "", new GregorianCalendar()); }
    
    public Utilizador(Utilizador u) {
        email = u.getEmail();
        nome = u.getNome();
        password = u.getPassword();
        morada = u.getMorada();
        dataNascimento = u.getDataNascimento();
    }
    
    
    // Métodos de instância
    
    public String getEmail() { return email; }
    
    public String getNome() { return nome; }
    
    public String getPassword() { return password; }
    
    public String getMorada() { return morada; }
    
    public Calendar getDataNascimento() { return (GregorianCalendar) dataNascimento.clone(); }
    
    public void setEmail(String email) { this.email = email; }
    
    public void setNome(String nome) { this.nome = nome; }
    
    public void setPassword(String password) { this.password = password; }
    
    public void setMorada(String morada) { this.morada = morada; }
    
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = (GregorianCalendar) dataNascimento.clone(); 
    }
    
    
    // Métodos complementares comuns
    
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || (this.getClass() != o.getClass())) {
            return false;
        }
        
        Utilizador u = (Utilizador) o;
        
        return (email.equals(u.getEmail()) && nome.equals(u.getNome()) && 
                password.equals(u.getPassword()) && morada.equals(u.getMorada()) &&
                dataNascimento.equals(u.getDataNascimento()));
    }
    
    public int hashCode() { return this.toString().hashCode(); }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("Utilizador = (");
        
        sb.append(email);
        sb.append(", ");
        sb.append(nome);
        sb.append(", ");
        sb.append(password);
        sb.append(", ");
        sb.append(morada);
        sb.append(", ");
        sb.append(dataNascimento.toString());
        sb.append(")\n");
        
        return sb.toString();
    }
    
    public Utilizador clone() { return new Utilizador(this); }
}
