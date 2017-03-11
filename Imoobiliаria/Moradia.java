
/**
 * Write a description of class Moradia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Moradia extends Imovel
{

    // Variáveis de instância
    
    private int tipo;
    private double areaImplantacao;
    private double areaTotal;
    private double areaTerreno;
    private int numQuartos;
    private int numWCs;    
    private int numPorta;
    
    // Construtores
    
    public Moradia() { 
        super();
        tipo = 0;
        areaImplantacao = 0;
        areaTotal = 0;
        areaTerreno = 0;
        numQuartos = 0;        
        numWCs = 0;
        numPorta = 0;        
    }
    
    public Moradia(String rua, double preco, double precoMin, int tipo, double areaImplantacao, 
                   double areaTotal, double areaTerreno, int numQuartos, int numWCs, int numPorta) { 
        super(rua, preco, precoMin);
        this.tipo = tipo;
        this.setAreaImplantacao(areaImplantacao);
        this.setAreaTotal(areaTotal);
        this.setAreaTerreno(areaTerreno);
        this.setNumQuartos(numQuartos);
        this.setNumWCs(numWCs);        
        this.setNumPorta(numPorta);
    }
    
    public Moradia(Moradia m) { 
        super(m);
        tipo = m.getTipo();
        areaImplantacao = m.getAreaImplantacao();
        areaTotal = m.getAreaTotal();
        areaTerreno = m.getAreaTerreno();
        numQuartos = m.getNumQuartos();
        numWCs = m.getNumWCs();        
        numPorta = m.getNumPorta();
    }
    
    // Métodos de instância
    
    public int getTipo() { return tipo; }
    
    public double getAreaImplantacao() { return areaImplantacao; }
    
    public double getAreaTotal() { return areaTotal; }
    
    public double getAreaTerreno() { return areaTerreno; }
    
    public int getNumQuartos() { return numQuartos; }

    public int getNumWCs() { return numWCs; }    
    
    public int getNumPorta() { return numPorta; }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public void setAreaImplantacao(double areaImplantacao) {
        this.areaImplantacao = (areaImplantacao >= 0) ? areaImplantacao : 0;
    }
    
    public void setAreaTotal(double areaTotal) {
        this.areaTotal = (areaTotal >= 0) ? areaTotal : 0;
    }
    
    public void setAreaTerreno(double areaTerreno) {
        this.areaTerreno = (areaTerreno >= 0) ? areaTerreno : 0;
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
    
    // Métodos complementares comuns
    
    public boolean equals(Object o) {
         if (this == o) {
            return true;
        }
        
        if (o == null || (this.getClass() != o.getClass())) {
            return false;
        }
        
        Moradia m = (Moradia) o;
        
        return (super.equals(m) && tipo == m.getTipo() && areaImplantacao == m.getAreaImplantacao() && 
                areaTotal == m.getAreaTotal() && areaTerreno == m.getAreaTerreno() &&
                numQuartos == m.getNumQuartos() && numWCs == m.getNumWCs() && numPorta == m.getNumPorta());
    }
    
    public int hashCode() { return this.toString().hashCode(); }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("Moradia = (");
        
        sb.append(tipo);
        sb.append(", ");
        sb.append(areaImplantacao);
        sb.append(", ");
        sb.append(areaTotal);
        sb.append(", ");
        sb.append(areaTerreno);
        sb.append(", ");
        sb.append(numQuartos);        
        sb.append(", ");
        sb.append(numWCs);        
        sb.append(", ");        
        sb.append(numPorta);        
        sb.append(")\n");
        
        return sb.toString();
    }
    
    public Moradia clone() { return new Moradia(this); }
    
}
