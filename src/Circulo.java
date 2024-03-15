public class Circulo extends FigurasGeometricas{
    public Circulo(double valor1){
        super(valor1);
    }
    @Override
    public double getArea(){
        return Math.pow(this.valor1,3);
    }
    @Override
    public double getPerimetro(){
        return Math.PI*this.valor1;
    }
}

