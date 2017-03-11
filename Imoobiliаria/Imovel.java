public class Imovel
{
    // Variáveis de instância
    
    private String rua;
    private double preco;
    private double precoMin;
    
    // Construtores
    
    public Imovel(String rua, double preco, double precoMin) {
        this.rua = rua;
        this.preco = preco;
        this.precoMin = precoMin;
    }
    
    public Imovel() { this("", 0, 0); }
    
    public Imovel(Imovel i) {
        rua = i.getRua();
        preco = i.getPreco();
        precoMin = i.getPrecoMin();
    }
    
    // Métodos de instância
    
    public String getRua() { return rua; }
    
    public double getPreco() { return preco; }
    
    public double getPrecoMin() { return precoMin; }
    
    public void setRua(String rua) { this.rua = rua; }
    
    public void setPreco(double preco) { this.preco = preco; }
    
    public void setPrecoMin(double precoMin) { this.precoMin = precoMin; }
    
    // Métodos complementares comuns
    
    public boolean equals(Object o) {
         if (this == o) {
            return true;
        }
        
        if (o == null || (this.getClass() != o.getClass())) {
            return false;
        }
        
        Imovel i = (Imovel) o;
        
        return (rua.equals(i.getRua()) && preco == i.getPreco() && precoMin == i.getPrecoMin());
    }
    
    public int hashCode() { return this.toString().hashCode(); }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("Imovel = (");
        
        sb.append(rua);
        sb.append(", ");
        sb.append(preco);
        sb.append(", ");
        sb.append(precoMin);
        sb.append(")\n");
        
        return sb.toString();
    }
    
    public Imovel clone() { return new Imovel(this); }
}
