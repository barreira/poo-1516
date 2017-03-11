
/**
 * Write a description of class Comprador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Calendar;

public class Comprador extends Utilizador
{
    // Variáveis de instância
    
    // Lista
    
    // Construtores
    
    public Comprador() { super(); }
    
    public Comprador(String email, String nome, String password, String morada, Calendar dataNascimento) {
        super(email, nome, password, morada, dataNascimento);
    }
    
    public Comprador(Comprador c) { super(c); }
}
