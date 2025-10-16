package com.carlosruanpucrs.tc2_microservico_ccs.mapper;

import com.carlosruanpucrs.tc2_microservico_ccs.api.request.AberturaContaNotificationCcsRequest;
import com.carlosruanpucrs.tc2_microservico_ccs.message.event.AberturaContaNotificationCcsEvent;

public class CssMapper {

    public static AberturaContaNotificationCcsEvent from(AberturaContaNotificationCcsRequest request) {
        return AberturaContaNotificationCcsEvent.builder()
                .dataAberturaConta(request.getDataAberturaConta())
                .idTransacao(request.getIdTransacao())
                .nomeBanco(request.getNomeBanco())
                .numeroConta(request.getNumeroConta())
                .numeroDocumentoCliente(request.getNumeroDocumentoCliente())
                .build();
    }
}
