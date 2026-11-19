# KATA4

#### - OBJETIVOS
El objetivo de esta cuarta kata es Aprender a exponer operaciones Java como servicio web con Javalin. Cada manejador recibe
los datos de la petición, llama al caso de uso y prepara la respuesta HTTP.


#### - CÓMO COMPILAR Y EJECUTAR
En esta ocasión basta con simplemente estar en la clase `Main` que se encuentra en el paquete `software.ulpgc.katas` y en este 
clickar en el botón de runear que tiene el propio IntelliJ o usar shift + F10, de esta manera se compila y runea.

#### - DEPENDENCIAS Y VERSION DE JDK
- **Build System:** Maven
- **JDK:** openjdk-27
- **Dependencies:** Gson (librería) y Javalin (framework)

#### - ESTRUCTURA DE LA ENTREGA Y CLASES PRINCIPALES
- **Estructura:** Arquitectura hexagonal / Arquitectura de puertos
```
kata4/
├── .idea/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── software.ulpgc.katas/
│   │   │       ├── application/
│   │   │       │   ├── domain/
│   │   │       │   │   └── FibonacciSeriesCalculator.java
│   │   │       │   ├── model/
│   │   │       │   │   └── Series.java
│   │   │       │   ├── ports/
│   │   │       │   │   └── SeriesSerializer.java
│   │   │       │   ├── useCase/
│   │   │       │   │   └── CalculaterFibonacciSeriesUseCase.java
│   │   │       │   ├── SeriesCalculator.java
│   │   │       │   └── UseCase.java
│   │   │       ├── infraestructure/
│   │   │       │   └── adapters/
│   │   │       │       └── JsonSeriesSerializer.java
│   │   │       └── Main.java
│   │   └── resources/
│   └── test/
├── target/
├── .gitignore
└── pom.xml
└── README.md
```
### - Clases Principales:
**Capa `application`**
- `domain` → **`FibonacciSeriesCalculator`**: calcula la serie de Fibonacci.
- `model` → **`Series`**: modelo de datos de la serie.
- `ports` → **`SeriesSerializer`** *(interfaz)*: puerto de serialización.
- `useCase` → **`CalculaterFibonacciSeriesUseCase`**: orquesta el caso de uso.
- **`SeriesCalculator`** y **`UseCase`** *(interfaces)*: contratos de cálculo y de caso de uso.

**Capa `infraestructure`**
- `adapters` → **`JsonSeriesSerializer`**: serializa la serie en formato JSON.

**Punto de entrada**
- **`Main`**: conecta todas las piezas y ejecuta la aplicación.

#### - FLUJO DE GIT USADO
En esta práctica no se realizó ningún flujo de git. Todos los commits fueron realizados desde la propia rama de master.

Para clonar el repositorio se puede usar en la terminal del IntelliJ el comando `git clone`, pero también se puede hacer desde la propia interfaz antes de crear un proyecto.

## ENLACE AL VIDEO EXPLICATIVO
[https://youtu.be/UBGOnvGSxBQ](https://youtu.be/MQ1_x-MEJ8U)

En el video explicativo se muestra como se hizo la kata usando los conceptos aprendidos en clase.
