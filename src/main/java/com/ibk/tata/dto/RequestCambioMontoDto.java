package com.ibk.tata.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestCambioMontoDto {

  private Double monto;

  private String monedaOrigen;

  private String monedaDestino;

}
