public class Caixa{
    private String identificador;
    private  String conteudo;
    private double peso;
    private double altura;

    public Caixa(String identificador, String conteudo, double peso, double altura) {
        this.identificador = identificador;
        this.peso = peso;
        this.altura = altura;
        this.conteudo = conteudo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean verificarPeso(double peso){
        if(peso > 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarAltura(double altura){
        if(altura > 0){
            return true;
        } else {
            return false;
        }
    }

    public void exibirEtiqueta(String identificador, String conteudo, double peso, double altura){
        System.out.println("Identificador: " + identificador);
        System.out.println("Conteudo: " + conteudo);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    @Override
    public String toString() {
        return "Caixa [identificador=" + identificador + ", Conteudo=" + Conteudo + ", peso=" + peso + ", altura="
                + altura + "]";
    }

    /*
     * 2ª questão:
     * a) A herança foi usada nas classes "Caixa" e "CaixaFragil", onde a segunda herda atributos usados das primeira, para poder realizar o que é pedido. Já o encapsulamento foi usado também nos atributos, deixando eles privados e usando métodos gets e sets para poder modificar conforme pedido.
     * b)O polimorfismo é uma maneira de criar outros métodos em diferentes classes, porém mudando sua função dependendo do que for necessário, o que também envolve os conceitos de herança.
     */

    
    
}