package software.ulpgc.katas.application.domain;

import software.ulpgc.katas.application.SeriesCalculator;
import software.ulpgc.katas.application.model.Series;

public class FibonacciSeriesCalculator implements SeriesCalculator {


    @Override
    public Series calculate(int value) {
        Series series = new Series();
        int a = 0;
        int b = 1;
        for (int i = 0; i < value; i++) {
            series = series.put(a);
            a = b;
            b += series.get(i);
        }
        return series;
    }
}
