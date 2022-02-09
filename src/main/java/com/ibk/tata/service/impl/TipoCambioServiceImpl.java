package com.ibk.tata.service.impl;

import com.ibk.tata.dto.RequestCambioMontoDto;
import com.ibk.tata.dto.ResponseCambioMontoDto;
import com.ibk.tata.entity.TipoCambio;
import com.ibk.tata.process.TipoCambioProcess;
import com.ibk.tata.repository.TipoCambioRepository;
import com.ibk.tata.service.TipoCambioService;
import com.ibk.tata.service.mapper.TipoCambioMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TipoCambioServiceImpl implements TipoCambioService {

  private final TipoCambioRepository tipoCambioRepository;

  private final TipoCambioMapper cambioMontoMapper;

  private final TipoCambioProcess tipoCambioProcess;

  @Override
  public ResponseCambioMontoDto tipoCambio(RequestCambioMontoDto requestCambioMontoDto) {
    TipoCambio responseTipoCambio =
        tipoCambioRepository.findByMonedaOrigenAndMonedaDestino(requestCambioMontoDto.getMonedaOrigen().toUpperCase(),
            requestCambioMontoDto.getMonedaDestino().toUpperCase());

    Double montoFinal = tipoCambioProcess.converMontoTipoCambio(requestCambioMontoDto.getMonto(), responseTipoCambio.getTipoCambio());
    return cambioMontoMapper.responseCambioMonto(requestCambioMontoDto, montoFinal, responseTipoCambio.getTipoCambio());
  }

  @Override
  public List<TipoCambio> findAll() {
    return tipoCambioRepository.findAll();
  }

  @Override
  public TipoCambio update(TipoCambio tipoCambio) {
    return tipoCambioRepository.save(tipoCambio);
  }

  @Override
  public TipoCambio findById(Integer id) {
    Optional<TipoCambio> optionalTipoCambio = tipoCambioRepository.findById(id);

    if (optionalTipoCambio.isPresent()) {
      return optionalTipoCambio.get();
    } else {
      return new TipoCambio();
    }
  }
}
