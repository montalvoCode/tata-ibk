package com.ibk.tata.service;

import com.ibk.tata.dto.RequestCambioMontoDto;
import com.ibk.tata.dto.ResponseCambioMontoDto;
import com.ibk.tata.entity.TipoCambio;
import java.util.List;

public interface TipoCambioService {

  ResponseCambioMontoDto tipoCambio(RequestCambioMontoDto requestCambioMontoDto);

  List<TipoCambio> findAll();

  TipoCambio update(TipoCambio tipoCambio);

  TipoCambio findById(Integer id);

}
