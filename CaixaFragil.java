public class CaixaFragil extends Caixa {
    private double pesoMax;

    public CaixaFragil(double pesoMax, String identificador, String conteudo, double peso, double altura) {
        super(identificador, conteudo, peso,altura);
        this.pesoMax = pesoMax;
    }
    
    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public boolean verificarpesoMax(double pesoMax){
        if (pesoMax > 0) {
            return true;
        } else {
            return false;
        }
    }
    public void exibirEtiqueta(String identificador, String conteudo, double peso, double altura, double pesoMax){
        System.out.println("Identificador: " + identificador);
        System.out.println("Conteudo: " + conteudo);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Peso máximo suportado: "+pesoMax);
    }
}
