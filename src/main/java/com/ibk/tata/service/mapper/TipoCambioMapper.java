package com.ibk.tata.service.mapper;

import com.ibk.tata.dto.RequestCambioMontoDto;
import com.ibk.tata.dto.ResponseCambioMontoDto;

public interface TipoCambioMapper {

  ResponseCambioMontoDto responseCambioMonto(RequestCambioMontoDto requestCambioMontoDto, Double montoFinal,
      Double tipoCambio);

}
