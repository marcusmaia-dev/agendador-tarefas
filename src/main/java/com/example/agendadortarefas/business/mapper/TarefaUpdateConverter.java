package com.example.agendadortarefas.business.mapper;


import com.example.agendadortarefas.Infrastructure.entity.TarefasEntity;
import com.example.agendadortarefas.business.dto.TarefasDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
public interface TarefaUpdateConverter {


    //TarefasEntity vai ser o principal caso o DTO for null
    void updateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);
}
