package com.carlosruanpucrs.tc2_microservico_ccs.service;

import com.carlosruanpucrs.tc2_microservico_ccs.api.request.AberturaContaNotificationCcsRequest;
import com.carlosruanpucrs.tc2_microservico_ccs.mapper.CssMapper;
import com.carlosruanpucrs.tc2_microservico_ccs.message.producer.CcsNotificacaoProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class CcsService {

    private final CcsNotificacaoProducer ccsNotificacaoProducer;

    public void notificarAberturaConta(AberturaContaNotificationCcsRequest request) {
        var evento = CssMapper.from(request);
        ccsNotificacaoProducer.notificarAberturaConta(evento);
    }
}
