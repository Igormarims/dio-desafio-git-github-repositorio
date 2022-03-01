package br.com.dio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    // curso1
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descrição curso java");
    curso1.setCargaHoraria(8);
    // curso
         Curso curso2 = new Curso();
        curso2.setDescricao("Descrição curso Js");
        curso2.setTitulo("JavaScript");
        curso2.setCargaHoraria(4);
        // criando mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());



   /*     System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        // criando os bootcamps
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // criando os deves

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos COncluídos: " + devCamila.getConteudoCompluido());
        System.out.println("XP: " + devCamila.calclularTotalXp());

        System.out.println("-------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos: " + devJoao.getConteudoCompluido());
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudoInscritos());
        System.out.println("XP: " + devJoao.calclularTotalXp());


    }

}
