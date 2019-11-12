package com.seok2.ladder.structure.domain;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

import com.seok2.ladder.structure.dto.LayerDTO;


public class LayerAssembler {

    static LayerDTO assemble(Layer layer) {
        return layer.layer.stream()
            .map(LineAssembler::assemble)
            .collect(collectingAndThen(toList(), LayerDTO::new));
    }
}