package frete;

public class FreteNormal implements FreteStrategy {
    @Override
    public double calcular(double distancia) {
        return distancia * 1.5;
    }
}

