package frete;

public class FreteExpresso implements FreteStrategy {
    @Override
    public  double calcular(double distancia) {
        return distancia * 3.0;
    }
}
