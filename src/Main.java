import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(); //criando o curso 1
        curso1.setTitulo("Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); //criando o curso 2
        curso2.setTitulo("JavaScrip");
        curso2.setDescricao("Descricao curso JavaScrip");
        curso2.setCargaHoraria(10);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();



        Mentoria mentoria1 = new Mentoria(); //criando a mentoria 1
        mentoria1.setTitulo("Mnetoria de java");
        mentoria1.setDescricao("descrição da mentoria em java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1); //imprimindo o que esta no curso 1
        System.out.println(curso2); //imprimindo o que esta no curso 2
        System.out.println(mentoria1);//imprimindo o que esta na mentoria 1*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setMome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        System.out.println("Conteúdos inscritos: "+ devLucas.getConteudosInscritos());
        devLucas.proguedir();
        devLucas.proguedir();
        System.out.println("---");
        System.out.println("Conteúdos concluidos: "+ devLucas.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: "+ devLucas.getConteudosInscritos());
        System.out.println("XP: " +devLucas.calcularTotalXp());


        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: "+ devJoao.getConteudosInscritos());
        devJoao.proguedir();
        devJoao.proguedir();
        devJoao.proguedir();
        System.out.println("---");
        System.out.println("Conteúdos concluidos: "+ devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: "+ devJoao.getConteudosInscritos());
        System.out.println("XP: " +devJoao.calcularTotalXp());


    }

}
