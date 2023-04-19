import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devBerenice = new Dev();
        devBerenice.setNome("Berenice");
        devBerenice.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Berenice:" + devBerenice.getConteudosInscritos());
        devBerenice.progredir();
        devBerenice.progredir();
        devBerenice.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Berenice:" + devBerenice.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Berenice:" + devBerenice.getConteudosConcluidos());
        System.out.println("XP:" + devBerenice.calcularTotalXp());

        System.out.println("......");


        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcelo:" + devMarcelo.getConteudosInscritos());
        devMarcelo.progredir();
        devMarcelo.progredir();
        devMarcelo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcelo:" + devMarcelo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcelo:" + devMarcelo.getConteudosConcluidos());
        System.out.println("XP:" + devMarcelo.calcularTotalXp());

        System.out.println(".....");




    }
}