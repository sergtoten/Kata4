package software.ulpgc.katas;

import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;

public class Main {

    static void main() {
        Javalin.create(c -> init(c))
                .start(8081);
    }

    private static void init(JavalinConfig config) {
        config.routes.get("/Hola", ctx -> ctx.queryParam("Hola!"));
    }

}
