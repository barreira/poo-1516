
/**
 * Write a description of class Apartamento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Apartamento extends Imovel
{
    // Variáveis de instância
    
    private int tipo;
    private double areaTotal;
    private int numQuartos;
    private int numWCs;
    private int numPorta;
    private int numAndar;
    private boolean possuiGaragem;
    
    // Construtores
    
    public Apartamento() { 
        super();
        tipo = 0;
        areaTotal = 0;
        numQuartos = 0;
        numWCs = 0;
        numPorta = 0;
        numAndar = 0;
        possuiGaragem = false;
    }
    
    public Apartamento(String rua, double preco, double precoMin, int tipo, double areaTotal, int numQuartos, 
                       int numWCs, int numPorta, int numAndar, boolean possuiGaragem) {
        super(rua, preco, precoMin);
        this.tipo = tipo;
        this.setAreaTotal(areaTotal);
        this.setNumQuartos(numQuartos);
        this.setNumWCs(numWCs);
        this.setNumPorta(numPorta);
        this.setNumAndar(numAndar);
        this.possuiGaragem = possuiGaragem;
    }
    
    public Apartamento(Apartamento a) { 
        super(a);
        tipo = a.getTipo();
        areaTotal = a.getAreaTotal();
        numQuartos = a.getNumQuartos();
        numWCs = a.getNumWCs();
        numPorta = a.getNumPorta();
        numAndar = a.getNumAndar();
        possuiGaragem = a.possuiGaragem();
    }
    
    // Métodos de instância
    
    public int getTipo() { return tipo; }
    
    public double getAreaTotal() { return areaTotal; }
    
    public int getNumQuartos() { return numQuartos; }
    
    public int getNumWCs() { return numWCs; }
    
    public int getNumPorta() { return numPorta; }

    public int getNumAndar() { return numAndar; }
    
    public boolean possuiGaragem() { return possuiGaragem; }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public void setAreaTotal(double areaTotal) {
        this.areaTotal = (areaTotal >= 0) ? areaTotal : 0;
    }
    
    public void setNumQuartos(int numQuartos) {
        this.numQuartos = (numQuartos >= 0) ? numQuartos : 0;
    }
    
    public void setNumWCs(int numWCs) {
        this.numWCs = (numWCs >= 0) ? numWCs : 0;
    }
    
    public void setNumPorta(int numPorta) {
        this.numPorta = (numPorta >= 0) ? numPorta : 0;
    }
    
    public void setNumAndar(int numAndar) {
        this.numAndar = (numAndar >= 0) ? numAndar : 0;
    }
    
    public void setPossuiGaragem(boolean possuiGaragem) { this.possuiGaragem = possuiGaragem; } 
    
    // Métodos complementares comuns
    
    public boolean equals(Object o) {
         if (this == o) {
            return true;
        }
        
        if (o == null || (this.getClass() != o.getClass())) {
            return false;
        }
        
        Apartamento a = (Apartamento) o;
        
        return (super.equals(a) && tipo == a.getTipo() && areaTotal == a.getAreaTotal() &&
                numQuartos == a.getNumQuartos() && numWCs == a.getNumWCs() && numPorta == a.getNumPorta() && 
                numAndar == a.getNumAndar() && possuiGaragem == a.possuiGaragem());
    }
    
    public int hashCode() { return this.toString().hashCode(); }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("Apartamento = (");
        
        sb.append(tipo);
        sb.append(", ");
        sb.append(areaTotal);
        sb.append(", ");
        sb.append(numQuartos);        
        sb.append(", ");
        sb.append(numWCs);        
        sb.append(", ");
        sb.append(numPorta);
        sb.append(", ");
        sb.append(numAndar);        
        sb.append(", ");
        sb.append(possuiGaragem);        
        sb.append(", ");
        sb.append(")\n");
        
        return sb.toString();
    }
    
    public Apartamento clone() { return new Apartamento(this); }
    
}
