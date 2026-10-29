package software.ulpgc.katas.application.useCase;

import software.ulpgc.katas.application.UseCase;
import software.ulpgc.katas.application.domain.FibonacciSeriesCalculator;
import software.ulpgc.katas.application.model.Series;
import software.ulpgc.katas.application.ports.SeriesSerializer;

public class CalculaterFibonacciSeriesUseCase implements UseCase {

    private final SeriesSerializer serializer;

    public CalculaterFibonacciSeriesUseCase(SeriesSerializer serializer) {
        this.serializer = serializer;
    }

    @Override
    public String execute(String input) {
        Series series = new FibonacciSeriesCalculator().calculate(Integer.parseInt(input));
        return serializer.serializer(series);
    }
}
