import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(5);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
//        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.increverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Vitor: " + devVitor.getConteudosInscritos());
        devVitor.progredir();
        System.out.println("Conteudos Concluidos Vitor: " + devVitor.getConteudosConcluidos());
        System.out.println("Conteudos incritos Vitor: " + devVitor.getConteudosInscritos());


        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.increverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Guilherme: " + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        System.out.println("Conteudos incritos Guilherme: " + devGuilherme.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Guilherme: " + devGuilherme.getConteudosConcluidos());

    }
}