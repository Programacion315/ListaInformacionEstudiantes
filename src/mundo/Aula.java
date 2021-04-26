/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Aula {

    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    private int posicion = 0;

    public Aula() {
        estudiantes.add(new Estudiante("1945834", "David Blaine", "M", "Diseño Grafico", 6, 4.5, "src/imagenes/blaine.jpg"));
        estudiantes.add(new Estudiante("2944837", "Jessica Watkins", "F", "Ing Mecanica", 2, 3.6, "src/imagenes/jessica.jpg"));
        estudiantes.add(new Estudiante("3944834", "Carlos Gardel", "M", "Diseño Grafico", 3, 3.0, "src/imagenes/Gardel.jpg"));
        estudiantes.add(new Estudiante("4942834", "Mila Kunis", "F", "Administracion de empresas", 6, 4.3, "src/imagenes/mila.jpg"));
        estudiantes.add(new Estudiante("5123456", "Lara Croft", "F", "Astronomia", 7, 3.1, "src/imagenes/lara.jpg"));
        estudiantes.add(new Estudiante("6944834", "James Randy", "M", "Quimica", 2, 3.7, "src/imagenes/james.jpg"));
        estudiantes.add(new Estudiante("7947834", "Katie Bouman", "F", "Ing de Sistemas", 9, 2.8, "src/imagenes/Katie.png"));
        estudiantes.add(new Estudiante("8946834", "Juan Ruiz", "M", "Ing Industrial", 6, 2.3, "src/imagenes/juan.jpg"));
        estudiantes.add(new Estudiante("9945834", "Yuri Gagarin", "M", "Fisica", 2, 2.3, "src/imagenes/yuri.jpg"));
        estudiantes.add(new Estudiante("1044834", "Agustín Magaldi", "M", "Diseño Grafico", 3, 4.9, "src/imagenes/agustin.jpg"));
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Estudiante getEstudianteBase() {

        return estudiantes.get(posicion);
    }

    public Estudiante getSiguienteEstudiante() {

        posicion += 1;

        return estudiantes.get(posicion);

    }

    public Estudiante getAnteriorEstudiante() {
        
        posicion -= 1;

        return estudiantes.get(posicion);
        
    }
    
    public int getPosicion(){
        return posicion;
    }
}
