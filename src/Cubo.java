public class Cubo extends FigurasGeometricas {
    public Cubo(double valor1){
        super(valor1);
    }
    @Override
    public double getArea(){
        return Math.pow(this.valor1,3) ;
    }
    @Override
    public double getPerimetro(){
        return 6*Math.pow(this.valor1,2) ;
    }
}
