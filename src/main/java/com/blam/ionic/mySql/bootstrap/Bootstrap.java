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
        Categoria carne = Categoria.builder().id(1L).name("carne").build();
        categoriaRepository.save(carne);

        Comida estofado = Comida.builder().id(1L).title("estofado").fotoUrl("dfg").categoria(carne)
                .description("algo").videoUrl("sdv").build();
        comidaRepository.save(estofado);
        List<Comida>comidaList = new ArrayList<>();
        comidaList.add(estofado);
        carne.setComida(comidaList);

        categoriaRepository.save(carne);
    }
}
