package com.javanauta.agendador_tarefas.business.mapper;

import com.javanauta.agendador_tarefas.business.dto.TarefasDTO;
import com.javanauta.agendador_tarefas.infrastructure.entity.TarefasEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-28T14:21:39-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class TarefaUpdateConverterImpl implements TarefaUpdateConverter {

    @Override
    public void updateTarefas(TarefasDTO dto, TarefasEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getNomeTarefa() != null ) {
            entity.setNomeTarefa( dto.getNomeTarefa() );
        }
        if ( dto.getDescricao() != null ) {
            entity.setDescricao( dto.getDescricao() );
        }
        if ( dto.getDataCriacao() != null ) {
            entity.setDataCriacao( dto.getDataCriacao() );
        }
        if ( dto.getDataEvento() != null ) {
            entity.setDataEvento( dto.getDataEvento() );
        }
        if ( dto.getEmailUsuario() != null ) {
            entity.setEmailUsuario( dto.getEmailUsuario() );
        }
        if ( dto.getDataAlteracao() != null ) {
            entity.setDataAlteracao( dto.getDataAlteracao() );
        }
        if ( dto.getStatusNotificacaoEnum() != null ) {
            entity.setStatusNotificacaoEnum( dto.getStatusNotificacaoEnum() );
        }
    }
}
