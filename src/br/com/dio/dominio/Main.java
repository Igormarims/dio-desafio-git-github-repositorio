package br.com.dio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    // curso1
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescrição("Descrição curso java");
    curso1.setCargaHoraria(8);
    // curso
         Curso curso2 = new Curso();
        curso2.setDescrição("Descrição curso Js");
        curso2.setTitulo("JavaScript");
        curso2.setCargaHoraria(4);
        // criando mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescrição("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());



        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }

}
