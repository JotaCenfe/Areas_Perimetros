package Trabajo_autonomo2;

public class TrianguloRectangulo extends FiguraGeometrica {

    private int base;
    private int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = calcularHipotenusa();
        return base + altura + hipotenusa;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    // Según el valor de los catetos
    public void determinarTipoTriangulo() {
        if (base == altura) {
            System.out.println("El triángulo rectángulo es isósceles (dos lados iguales).");
        } else {
            System.out.println("El triángulo rectángulo es escaleno (todos los lados diferentes).");
        }
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
