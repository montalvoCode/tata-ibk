package com.ibk.tata.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseCambioMontoDto {

  private Double monto;

  private Double montoTipoCambio;

  private String monedaOrigen;

  private String monedaDestino;

  private Double tipoCambio;

}
