package org.ies.highschool.components;

import org.ies.highschool.model.Student;

import java.util.Scanner;

public class StudentReader {
    private final Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Student read() {
        System.out.println("Introduce los datos del estudiante");
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Apellido:");
        String apellido = scanner.nextLine();;
        System.out.println("Direccion:");
        String direccion = scanner.nextLine();

        return new Student(
                nombre,
                apellido,
                direccion
        );

    }
}
