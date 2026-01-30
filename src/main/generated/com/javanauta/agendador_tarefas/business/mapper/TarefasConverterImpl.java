package com.javanauta.agendador_tarefas.business.mapper;

import com.javanauta.agendador_tarefas.business.dto.TarefasDTO;
import com.javanauta.agendador_tarefas.infrastructure.entity.TarefasEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-24T11:24:41-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class TarefasConverterImpl implements TarefasConverter {

    @Override
    public TarefasEntity paraTarefaEntity(TarefasDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TarefasEntity.TarefasEntityBuilder tarefasEntity = TarefasEntity.builder();

        tarefasEntity.id( dto.getId() );
        tarefasEntity.nomeTarefa( dto.getNomeTarefa() );
        tarefasEntity.descricao( dto.getDescricao() );
        tarefasEntity.dataCriacao( dto.getDataCriacao() );
        tarefasEntity.dataEvento( dto.getDataEvento() );
        tarefasEntity.emailUsuario( dto.getEmailUsuario() );
        tarefasEntity.dataAlteracao( dto.getDataAlteracao() );
        tarefasEntity.statusNotificacaoEnum( dto.getStatusNotificacaoEnum() );

        return tarefasEntity.build();
    }

    @Override
    public TarefasDTO paraTarefaDTO(TarefasEntity entity) {
        if ( entity == null ) {
            return null;
        }

        TarefasDTO.TarefasDTOBuilder tarefasDTO = TarefasDTO.builder();

        tarefasDTO.id( entity.getId() );
        tarefasDTO.nomeTarefa( entity.getNomeTarefa() );
        tarefasDTO.descricao( entity.getDescricao() );
        tarefasDTO.dataCriacao( entity.getDataCriacao() );
        tarefasDTO.dataEvento( entity.getDataEvento() );
        tarefasDTO.emailUsuario( entity.getEmailUsuario() );
        tarefasDTO.dataAlteracao( entity.getDataAlteracao() );
        tarefasDTO.statusNotificacaoEnum( entity.getStatusNotificacaoEnum() );

        return tarefasDTO.build();
    }

    @Override
    public List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<TarefasEntity> list = new ArrayList<TarefasEntity>( dtos.size() );
        for ( TarefasDTO tarefasDTO : dtos ) {
            list.add( paraTarefaEntity( tarefasDTO ) );
        }

        return list;
    }

    @Override
    public List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TarefasDTO> list = new ArrayList<TarefasDTO>( entities.size() );
        for ( TarefasEntity tarefasEntity : entities ) {
            list.add( paraTarefaDTO( tarefasEntity ) );
        }

        return list;
    }
}
