# KATA4

#### - OBJETIVOS
La tercera kata consolida la transformación de datos justo después de trabajar con InputStream
y OutputStream. La idea principal de esta práctica es demostrar el uso del protocolo HTTP y el como se deserializa en esta ocasión un formato JSON
en un objeto.

#### - CÓMO COMPILAR Y EJECUTAR
En esta ocasión basta con simplemente estar en la clase `Main` que se encuentra en el paquete `software.ulpgc.katas` y en este 
clickar en el botón de runear que tiene el propio IntelliJ o usar shift + F10, de esta manera se compila y runea.

#### - DEPENDENCIAS Y VERSION DE JDK
- **Build System:** Maven
- **JDK:** openjdk-26
- **Dependencies:** Gson

#### - ESTRUCTURA DE LA ENTREGA Y CLASES PRINCIPALES
- **Estructura:** La estándar de Maven
```
Kata3/
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
Se ha seguido una versión simplificada del modelo de flujo Gitflow, utilizando principalmente dos ramas: `main` como rama estable/principal y `develop` como 
rama de trabajo donde se integraron la mayoría de los commits.

Para clonar el repositorio se puede usar en la terminal del IntelliJ el comando `git clone`, pero también se puede hacer desde la propia interfaz antes de crear un proyecto.

## ENLACE AL VIDEO EXPLICATIVO
[https://youtu.be/UBGOnvGSxBQ](https://youtu.be/tDLPOrKmnxM)

En el video explicativo se muestra como se hizo la kata repitiendo los pasos que realizó el profesor en clases.
