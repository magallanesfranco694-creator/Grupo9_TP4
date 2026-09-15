/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_colegio;

/**
 *
 * @author Grupo9
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia web2 = new Materia(1, "WEB 2", 2);
        Materia mat1 = new Materia(2, "Matemáticas 1", 1);
        Materia lab1 = new Materia(3, "Laboratorio 1", 1);
        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");

        a1.agregarMateria(web2);
        a1.agregarMateria(mat1);
        a1.agregarMateria(lab1);
        System.out.println("Inscriptas de "+a1.getApellido()+": "+ a1.cantidadMaterias());

        a2.agregarMateria(web2);
        a2.agregarMateria(mat1);
        a2.agregarMateria(lab1);
        a2.agregarMateria(lab1);
        System.out.println("Inscriptas de "+a2.getApellido()+": "+ a2.cantidadMaterias());

    }

}
