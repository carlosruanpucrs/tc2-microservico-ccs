package com.carlosruanpucrs.tc2_microservico_ccs.api.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AberturaContaNotificationCcsRequest {

    String idTransacao;
    Integer numeroConta;
    String numeroDocumentoCliente;
    LocalDate dataAberturaConta;
    String nomeBanco;
}
