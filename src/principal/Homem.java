package principal;

public class Homem extends PessoaIMC {
    public Homem(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    public String resultIMC() {
        double imc = calculaIMC();
        if (imc < 20.7) {
            return "Abaixo do peso  ideal";
        } else if (imc < 26.4) {
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }

    public String toString() {
        return super.toString() + "\nResultado IMC: " + resultIMC();
    }
}
