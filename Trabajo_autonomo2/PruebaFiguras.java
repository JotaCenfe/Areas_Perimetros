package Trabajo_autonomo2;

// ------------------------------------------------------------
// Nombre: Jorge Claudio
// Trabajo Autonomo 2: Cálculo de áreas y perímetros
// ------------------------------------------------------------

public class PruebaFiguras {

    /**
     * Método main que crea un círculo, un rectángulo, un cuadrado,
     * un triángulo rectángulo y un trapecio. Para cada una de estas figuras
     * se calcula su área y perímetro.
     */
    public static void main(String[] args) {

        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        Trapecio figura5 = new Trapecio(6, 4, 3, 3, 2);

        System.out.println("=== CÍRCULO ===");
        System.out.println("Área del círculo = " + figura1.calcularArea());
        System.out.println("Perímetro del círculo = " + figura1.calcularPerimetro());
        System.out.println();

        System.out.println("=== RECTÁNGULO ===");
        System.out.println("Área del rectángulo = " + figura2.calcularArea());
        System.out.println("Perímetro del rectángulo = " + figura2.calcularPerimetro());
        System.out.println();

        System.out.println("=== CUADRADO ===");
        System.out.println("Área del cuadrado = " + figura3.calcularArea());
        System.out.println("Perímetro del cuadrado = " + figura3.calcularPerimetro());
        System.out.println();

        System.out.println("=== TRIÁNGULO RECTÁNGULO ===");
        System.out.println("Área del triángulo = " + figura4.calcularArea());
        System.out.println("Perímetro del triángulo = " + figura4.calcularPerimetro());
        System.out.println("Hipotenusa del triángulo = " + figura4.calcularHipotenusa());
        figura4.determinarTipoTriangulo();
        System.out.println();

        System.out.println("=== TRAPECIO ===");
        System.out.println("Área del trapecio = " + figura5.calcularArea());
        System.out.println("Perímetro del trapecio = " + figura5.calcularPerimetro());
    }
}
