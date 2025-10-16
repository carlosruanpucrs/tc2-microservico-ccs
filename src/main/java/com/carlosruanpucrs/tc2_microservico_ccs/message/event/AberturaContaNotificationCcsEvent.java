package com.carlosruanpucrs.tc2_microservico_ccs.message.event;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AberturaContaNotificationCcsEvent implements Serializable {

    String idTransacao;
    Integer numeroConta;
    String numeroDocumentoCliente;
    LocalDate dataAberturaConta;
    String nomeBanco;
}