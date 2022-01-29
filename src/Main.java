import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        Mentoria mentoria1 = new Mentoria(); //criando a mentoria 1
        mentoria1.setTitulo("Mnetoria de java");
        mentoria1.setDescricao("descrição da mentoria em java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1); //imprimindo o que esta no curso 1
        System.out.println(curso2); //imprimindo o que esta no curso 2
        System.out.println(mentoria1);//imprimindo o que esta na mentoria 1


    }

}
