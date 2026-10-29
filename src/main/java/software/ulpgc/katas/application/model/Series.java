package software.ulpgc.katas.application.model;

import java.util.Arrays;

public class Series {

    private final int[] values;
    private Series(int[] values) {
        this.values = values;
    }

    public Series() {
        this(new int[0]);
    }

    public Series put(int value) {
        int[] values = Arrays.copyOf(this.values, this.values.length + 1);
        values[this.values.length] = value;
        return new Series(values);
    }

    public int[] get() {
        return this.values;
    }

    public int get(int value) {
        return this.values[value];
    }

}
