/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example


fun main(){
    println("=== Etapa 1: Funciones Básicas ===")
    // TODO: Implementar función calcularPromedio
    val promedio1 = calcularPromedio(7.5, 8.0)
    println("El promedio es: $promedio1")    // TODO: Implementar función esAprobado
    val nota = 7.0
    val aprobado = esAprobado(nota)
    println("¿Está aprobado? $aprobado")

    println("\n=== Etapa 2: Funciones con Múltiples Parámetros ===")
    // TODO: Implementar función calcularPromedioTresNotas
    val promedioTresNotas = calcularPromedioTresNotas(7.0, 8.0, 9.0)
    println("El promedio de las tres notas es: $promedioTresNotas")

    // TODO: Implementar función obtenerEstadoAlumno
    val estado = obtenerEstadoAlumno("Juan", "Pérez", 7.5)
    println(estado)

    println("\n=== Etapa 3: Funciones con Listas ===")
    // TODO: Implementar función calcularPromedioCurso
    val notas = listOf(7.0, 8.0, 6.5, 9.0, 7.5)
    val promedioCurso = calcularPromedioCurso(notas)
    println("El promedio del curso es: $promedioCurso")

    // TODO: Implementar función obtenerAlumnosAprobados
    val nombres = listOf("Ana", "Juan", "María", "Pedro", "Lucía")
    val notasAlumnos = listOf(7.0, 5.0, 8.0, 6.0, 9.0)
    val aprobados = obtenerAlumnosAprobados(nombres, notasAlumnos)
    println("Alumnos aprobados: $aprobados")

    println("\n=== Etapa 4: Funciones Avanzadas ===")
    // TODO: Implementar función generarBoletin
    val materias = listOf("Matemática", "Lengua", "Historia")
    val notasMaterias = listOf(8.0, 7.5, 9.0)
    val boletin = generarBoletin("Juan Pérez", materias, notasMaterias)
    println(boletin)

    // TODO: Implementar funciones de análisis de rendimiento
    println("Estadísticas del curso:")
    println("Promedio: ${calcularPromedioCurso(notas)}")
    println("Nota más alta: ${obtenerNotaMasAlta(notas)}")
    println("Nota más baja: ${obtenerNotaMasBaja(notas)}")
    println("Cantidad de aprobados: ${contarAprobados(notas)}")
}




fun calcularPromedio(nota1: Double, nota2: Double): Double {
    // Sumar las dos notas y dividir por 2 para obtener el promedio
    return (nota1 + nota2) / 2
}

fun esAprobado(nota: Double): Boolean {
    // Verificar si la nota es mayor o igual a 6 para determinar si está aprobado
    if(nota >= 6.0){
        return true
    }
    return false
}



// Etapa 2

fun calcularPromedioTresNotas(nota1: Double, nota2: Double, nota3: Double): Double {
    return (nota1 + nota2 + nota3) / 3
}

fun obtenerEstadoAlumno(nombre: String, apellido: String, nota: Double): String {
    val estado = if (nota >= 10.5){ "está aprobado" }else {"está desaprobado"}
    return "El alumno $nombre $apellido esta aprobado"
}

// Etapa 3

// 1. Calcula el promedio de una lista de notas
fun calcularPromedioCurso(notas: List<Double>): Double {
    return if (notas.isNotEmpty()) {
        notas.sum() / notas.size
    } else {
        0.0
    }
}

// 2. Devuelve una lista con los nombres de los alumnos que tienen nota igual o mayor a 6.0
fun obtenerAlumnosAprobados(nombres: List<String>, notas: List<Double>): List<String> {
    val alumnosAprobados = mutableListOf<String>()
    for (i in nombres.indices) {
        if (i < notas.size && notas[i] >= 6.0) {
            alumnosAprobados.add(nombres[i])
        }
    }
    return alumnosAprobados
}

// Etapa 4
fun generarBoletin(nombre: String, materias: List<String>, notas: List<Double>): String {
    val builder = StringBuilder()
    builder.append("Boletín de notas de $nombre\n")
    builder.append("----------------------------\n")
    for (i in materias.indices) {
        val nota = if (i < notas.size) notas[i] else 0.0
        builder.append("${materias[i]}: $nota\n")
    }
    val promedio = if (notas.isNotEmpty()) notas.sum() / notas.size else 0.0
    builder.append("----------------------------\n")
    builder.append("Promedio general: %.2f".format(promedio))
    return builder.toString()
}

fun obtenerNotaMasAlta(notas: List<Double>): Double {
    return notas.maxOrNull() ?: 0.0
}

fun obtenerNotaMasBaja(notas: List<Double>): Double {
    return notas.minOrNull() ?: 0.0
}

fun contarAprobados(notas: List<Double>): Int {
    return notas.count { it >= 6.0 }
}

