public class CalculadoraHorasTrabalhadas implements ICalculadoraHorasTrabalhadas {

    public double update(int diasTrabalhados, int horasPorDia) {
        return diasTrabalhados * horasPorDia;
    }
}