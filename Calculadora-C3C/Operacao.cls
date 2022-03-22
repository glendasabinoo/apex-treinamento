public class Operacao implements InterfaceOperacao {
    //atributos 
    private Double num1;
    private Double num2;
    private String operador;
    
    //métodos especiais
    public Double getNum1() {
        return num1;
    }
    
    public Double setNum1(Double num1) {
        this.num1 = num1;
        return num1;
    }
    
    public Double getNum2() {
        return num2;
    }
    
    public Double setNum2(Double num2) {
        this.num2 = num2;
        return num2;
    }
    
    public String getOperador() {
        return operador;
    }
    
    public String setOperador(String operador) {
        this.operador = operador;
        return operador;
    }
    
    //sobrescrevendo métodos da interface
    public Double soma(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }
    public static double divisao(double num1, double num2) {
        return num1 / num2;
    }     
}
