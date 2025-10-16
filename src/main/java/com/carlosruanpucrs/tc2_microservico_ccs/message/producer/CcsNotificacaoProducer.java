package com.carlosruanpucrs.tc2_microservico_ccs.message.producer;

import com.carlosruanpucrs.tc2_microservico_ccs.config.RabbitConfig;
import com.carlosruanpucrs.tc2_microservico_ccs.message.event.AberturaContaNotificationCcsEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;




@Slf4j
@Component
@RequiredArgsConstructor
public class CcsNotificacaoProducer {

    private final RabbitTemplate rabbitTemplate;

    public void notificarAberturaConta(AberturaContaNotificationCcsEvent evento) {
        try {
            log.info("[RABBITMQ] Enviando notificacao abertua conta ao bacen, payload: {}", evento);

            rabbitTemplate.convertAndSend(
                    RabbitConfig.CONTAEXCHANGE_BACEN,
                    RabbitConfig.CONTA_ROUTING_KEY_BACEN,
                    evento
            );

            log.info("[RABBITMQ] Notificacao abertua conta ao bacen enviada com sucesso, payload: {}", evento);
        } catch (RuntimeException e) {
            log.error("[RABBITMQ] Erro ao notificar abertura de conta ao bacen, erro: {}", e.getMessage());
            throw e;
        }
    }
}
