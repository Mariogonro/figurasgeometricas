public class Main {
    public static void main(String[] args) {
        Cuadrado cua = new Cuadrado(2);
        Cubo cub = new Cubo(2);
        Circulo cir = new Circulo(4);
        Rectangulo rec = new Rectangulo(4,2);
        Triangulo tri = new Triangulo(2,2);

        System.out.println("Area: " + cua.getArea() + " Perimetro " + cua.getPerimetro());
        System.out.println("Volumen: " + cub.getArea() + " Superficie " + cua.getPerimetro());
        System.out.println("Area: " + cir.getArea() + " Perimetro " + cir.getPerimetro());
        System.out.println("Area: " + rec.getArea() + " Perimetro " + rec.getPerimetro());
        System.out.println("Area: " + tri.getArea() + " Perimetro " + tri.getPerimetro());

    }
}