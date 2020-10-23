package com.blam.ionic.mySql.bootstrap;

import com.blam.ionic.mySql.domain.Categoria;
import com.blam.ionic.mySql.domain.Comida;
import com.blam.ionic.mySql.repository.CategoriaRepository;
import com.blam.ionic.mySql.repository.ComidaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Bootstrap implements CommandLineRunner {

    private final ComidaRepository comidaRepository;
    private final CategoriaRepository categoriaRepository;

    @Override
    public void run(String... args) throws Exception {
        Categoria carne = Categoria.builder().id(1L).categoria("carne").build();
        categoriaRepository.save(carne);

        Comida estofado = Comida.builder().id(1L).title("estofado").fotoUrl("dfg").categoria(carne)
                .description("algo").videoUrl("sdv").build();
        comidaRepository.save(estofado);
        List<Comida>comidaList = new ArrayList<>();
        comidaList.add(estofado);


        categoriaRepository.save(carne);


        Categoria pasta = Categoria.builder().id(2L).categoria("pasta").build();
        categoriaRepository.save(pasta);

        Comida ravioles = Comida.builder().id(2L).title("ravioles").fotoUrl("dfg").categoria(pasta)
                .description("algo").videoUrl("sdv").build();
        comidaRepository.save(ravioles);
        List<Comida>comidaList2 = new ArrayList<>();
        comidaList2.add(ravioles);


        categoriaRepository.save(pasta);


        Comida asado = Comida.builder().id(3L).title("asado").fotoUrl("dfg").categoria(carne)
                .description("algo").videoUrl("sdv").build();
        comidaRepository.save(asado);
        List<Comida>comidaList3 = new ArrayList<>();
        comidaList3.add(asado);


        categoriaRepository.save(carne);
    }
}
