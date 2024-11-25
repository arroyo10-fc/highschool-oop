package org.ies.highschool.model;

//import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String nombre;
    private String apellido;
    private String direccion;

    public Student(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(nombre, student.nombre) && Objects.equals(apellido, student.apellido) && Objects.equals(direccion, student.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, direccion);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public void showInfo() {
        System.out.println("Nombre: " + nombre + "Apellido: " + apellido + "Direccion: " + direccion);
    }

}
