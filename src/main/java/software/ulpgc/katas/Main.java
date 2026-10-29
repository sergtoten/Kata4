package software.ulpgc.katas;

import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;
import software.ulpgc.katas.application.UseCase;
import software.ulpgc.katas.application.useCase.CalculaterFibonacciSeriesUseCase;
import software.ulpgc.katas.infraestructure.adapters.JsonSeriesSerializer;

public class Main {

    static void main() {
        Javalin.create(c -> init(c))
                .start(8081);
    }

    private static void init(JavalinConfig config) {
        config.routes.get("/fibonacci", ctx -> fibonacciExecute(ctx));
    }

    private static void fibonacciExecute(@NotNull Context ctx) {
        UseCase useCase = new CalculaterFibonacciSeriesUseCase(new JsonSeriesSerializer());
        ctx.result(useCase.execute(ctx.queryParam("n")));
    }

}
