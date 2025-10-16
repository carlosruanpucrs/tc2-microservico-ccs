package com.carlosruanpucrs.tc2_microservico_ccs.api;

import com.carlosruanpucrs.tc2_microservico_ccs.api.request.AberturaContaNotificationCcsRequest;
import com.carlosruanpucrs.tc2_microservico_ccs.message.event.AberturaContaNotificationCcsEvent;
import com.carlosruanpucrs.tc2_microservico_ccs.message.producer.CcsNotificacaoProducer;
import com.carlosruanpucrs.tc2_microservico_ccs.service.CcsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/v1/ccs", produces = MediaType.APPLICATION_JSON_VALUE)
public class CcsApi {

    private final CcsService ccsService;

    @PostMapping("/notificacao/abertura")
    public ResponseEntity<Void> notificarAberturaConta(AberturaContaNotificationCcsRequest request){
        ccsService.notificarAberturaConta(request);
        return ResponseEntity.ok().build();
    }

}
