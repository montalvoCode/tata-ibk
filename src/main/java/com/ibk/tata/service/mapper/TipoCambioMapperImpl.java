package com.ibk.tata.service.mapper;

import com.ibk.tata.dto.RequestCambioMontoDto;
import com.ibk.tata.dto.ResponseCambioMontoDto;
import org.springframework.stereotype.Component;

@Component
public class TipoCambioMapperImpl implements TipoCambioMapper {

  @Override
  public ResponseCambioMontoDto responseCambioMonto(RequestCambioMontoDto requestCambioMontoDto, Double montoFinal, Double tipoCambio) {
    return ResponseCambioMontoDto.builder()
        .monto(requestCambioMontoDto.getMonto())
        .montoTipoCambio(montoFinal)
        .monedaOrigen(requestCambioMontoDto.getMonedaOrigen())
        .monedaDestino(requestCambioMontoDto.getMonedaDestino())
        .tipoCambio(tipoCambio)
        .build();
  }
}
