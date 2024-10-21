package WebService.demo;

import java.util.*;

public class CursoManager {
    private List<Curso> cursos;

    public CursoManager() {
        this.cursos = new ArrayList<>();
        this.cursos.add(new Curso("Sistemas de Informacao", 3000));
        this.cursos.add(new Curso("Ciencia de Computacao", 3000));
    }

    public List<Curso> getCursos(){
        return this.cursos;
    }
}

// Nome: Matheus Ricardo
// RA: 10418754