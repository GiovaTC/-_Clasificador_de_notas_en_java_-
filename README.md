# -_Clasificador_de_notas_en_java_- :.
# 📚 Clasificador de Notas en Java:

```

Programa **básico en Java** desarrollado para trabajar en **IntelliJ IDEA**.

El ejercicio permite practicar:

* `Scanner` para entrada de datos.
* Estructura `do while`.
* Condicional `if`.
* Condicional `else if`.
* Condicional `else`.
* Clasificación sencilla de una nota.
* Repetición del programa mediante una opción `S/N`.

---

## 🎯 Objetivo

Crear un programa de consola que permita ingresar una nota entre **0 y 100** y clasificarla de acuerdo con el siguiente criterio:

|     Nota | Resultado |
| -------: | --------- |
| 90 - 100 | Excelente |
|  70 - 89 | Aprobado  |
|   0 - 69 | Reprobado |

Después de mostrar el resultado, el usuario puede decidir si desea ingresar otra nota.

---

## 🛠️ Tecnologías utilizadas

* **Java**
* **IntelliJ IDEA**
* `Scanner`
* `do while`
* `if`
* `else if`
* `else`

---

## 📁 Estructura del proyecto

```text
ClasificadorNotas
└── src
    └── Main.java
```

---

# 💻 Código completo

## `Main.java`

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota;
        String continuar;

        do {

            System.out.println("=================================");
            System.out.println("     CLASIFICADOR DE NOTAS");
            System.out.println("=================================");

            System.out.print("Ingrese una nota de 0 a 100: ");
            nota = scanner.nextInt();

            // Condicional 1
            if (nota >= 90) {
                System.out.println("Resultado: Excelente");

            // Condicional 2
            } else if (nota >= 70) {
                System.out.println("Resultado: Aprobado");

            // Condicional 3
            } else {
                System.out.println("Resultado: Reprobado");
            }

            System.out.print("\n¿Desea ingresar otra nota? (S/N): ");
            continuar = scanner.next();

            System.out.println();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Programa finalizado.");

        scanner.close();
    }
}
```

---

# ▶️ Ejemplo de ejecución

```text
=================================
     CLASIFICADOR DE NOTAS
=================================
Ingrese una nota de 0 a 100: 95
Resultado: Excelente

¿Desea ingresar otra nota? (S/N): S

=================================
     CLASIFICADOR DE NOTAS
=================================
Ingrese una nota de 0 a 100: 75
Resultado: Aprobado

¿Desea ingresar otra nota? (S/N): S

=================================
     CLASIFICADOR DE NOTAS
=================================
Ingrese una nota de 0 a 100: 50
Resultado: Reprobado

¿Desea ingresar otra nota? (S/N): N

Programa finalizado.
```

---

# 🔄 Estructura utilizada

```text
Main
 └── do while
      │
      ├── Scanner
      │
      ├── if
      │    └── nota >= 90
      │         └── Excelente
      │
      ├── else if
      │    └── nota >= 70
      │         └── Aprobado
      │
      └── else
           └── nota < 70
                └── Reprobado
```

---

# 🧠 Conceptos practicados

## 1. Scanner

Se utiliza `Scanner` para leer los datos introducidos por el usuario:

```java
Scanner scanner = new Scanner(System.in);
```

Para leer un número entero:

```java
nota = scanner.nextInt();
```

Para leer una cadena:

```java
continuar = scanner.next();
```

---

## 2. Condicional `if`

El primer condicional verifica si la nota es igual o superior a 90:

```java
if (nota >= 90) {
    System.out.println("Resultado: Excelente");
}
```

---

## 3. Condicional `else if`

El segundo condicional verifica si la nota es igual o superior a 70:

```java
else if (nota >= 70) {
    System.out.println("Resultado: Aprobado");
}
```

---

## 4. Condicional `else`

Si ninguna de las condiciones anteriores se cumple, la nota es inferior a 70:

```java
else {
    System.out.println("Resultado: Reprobado");
}
```

---

## 5. Ciclo `do while`

El programa se ejecuta al menos una vez y continúa mientras el usuario escriba `S`:

```java
do {
    // Código del programa

} while (continuar.equalsIgnoreCase("S"));
```

El método:

```java
equalsIgnoreCase()
```

permite aceptar tanto:

```text
S
```

como:

```text
s
```

---

# 🚀 Ejecución en IntelliJ IDEA

### Paso 1. Crear el proyecto

En IntelliJ IDEA:

```text
New Project
    ↓
Java
    ↓
Nombre: ClasificadorNotas
    ↓
Create
```

### Paso 2. Crear `Main.java`

Dentro de `src`, crear:

```text
Main.java
```

### Paso 3. Copiar el código

Copiar el código completo de `Main.java`.

### Paso 4. Ejecutar

Presionar:

```text
▶ Run
```

o utilizar:

```text
Shift + F10
```

---

# 📌 Resumen

Este ejercicio permite practicar los fundamentos básicos de programación en Java:

```text
Java
 │
 ├── Scanner
 │
 ├── if
 │
 ├── else if
 │
 ├── else
 │
 └── do while
```

Es un ejercicio introductorio ideal para practicar **Java + IntelliJ IDEA + entrada de datos + tres condiciones + ciclo `do while`**.
:. . / .
