package software.ulpgc.katas.application.ports;

import software.ulpgc.katas.application.model.Series;

public interface SeriesSerializer {
    String serializer(Series series);
}
