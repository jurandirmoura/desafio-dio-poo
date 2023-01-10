import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

            Curso curso1 = new Curso();
            curso1.setTitulo("Curso Java");
            curso1.setDescricao("Descricao curso java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("Curso Js");
            curso2.setDescricao("Descricao curso js");
            curso2.setCargaHoraria(4);

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria de java");
            mentoria.setDescricao("Descrição mentoria java");
            mentoria.setData(LocalDate.now());


           /* System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria);*/

            BootCamp bootcamp = new BootCamp();
            bootcamp.setNome("bootcamp java developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devCamila = new Dev();
            devCamila.setNome("Camila Ferraz");
            devCamila.inscreverBootCamp(bootcamp);
            System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
            devCamila.progredir();
            devCamila.progredir();
            System.out.println("-");
            System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
            System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());
            System.out.println("Xp:" + devCamila.calcularTotalXp());

            System.out.println("----------");

            Dev devJoao = new Dev();
            devJoao.setNome("João Gomes");
            devJoao.inscreverBootCamp(bootcamp);
            System.out.println("Conteudos Inscritos João:" + devJoao.getConteudosInscritos());
            devJoao.progredir();
            System.out.println("-");
            System.out.println("Conteudos Inscritos João:" + devJoao.getConteudosInscritos());
            System.out.println("Conteudos Concluidos João:" + devJoao.getConteudosConcluidos());
            System.out.println("Xp:" + devJoao.calcularTotalXp());
            System.out.println("----------");
    }
}
