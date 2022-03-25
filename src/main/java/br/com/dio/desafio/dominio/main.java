package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {

        curso curso1 = new curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        curso curso2 = new curso();

        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(5);

        mentoria mentoria = new mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentora java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println("-----------------");
//        System.out.println(curso2);
//        System.out.println("-----------------");
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno Medeiros");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Bruno: " + devBruno.getConteudosInscritos());

        devBruno.progredir();
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos de Bruno: " + devBruno.getConteudosInscritos());
        System.out.println("Conteudos concluídos de Bruno: " + devBruno.getConteudosConcluidos());
        System.out.println("XP: " + devBruno.calcularTotalXP());

        System.out.println("-----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João Santos");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de João: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos de João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluídos de João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());

    }
}
