package com.ibk.tata.controller;

import com.ibk.tata.dto.RequestCambioMontoDto;
import com.ibk.tata.dto.ResponseCambioMontoDto;
import com.ibk.tata.entity.TipoCambio;
import com.ibk.tata.service.TipoCambioService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class CambioMontoController {

  private TipoCambioService cambioMontoService;

  @ApiOperation(value = "Obtener Tipo de Cambio", response = Iterable.class, tags = "tipoCambio")
  @PostMapping(value = "/tipo/cambio")
  public ResponseEntity<ResponseCambioMontoDto> tipoCambio(@RequestBody RequestCambioMontoDto requestCambioMontoDto) {
    ResponseCambioMontoDto cambioMontoDtoSingle = cambioMontoService.tipoCambio(requestCambioMontoDto);
    return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(cambioMontoDtoSingle);
  }

  @ApiOperation(value = "Lista de tipo de cambio", response = Iterable.class, tags = "tipoCambio")
  @GetMapping
  public ResponseEntity<List<TipoCambio>> findAll() {
    List<TipoCambio> listTipoCambio = cambioMontoService.findAll();
    return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(listTipoCambio);
  }

  @ApiOperation(value = "Actualizar Tipo de Cambio", response = Iterable.class, tags = "tipoCambio")
  @PutMapping(value = "/{id}")
  public ResponseEntity<TipoCambio> update(@RequestBody TipoCambio tipoCambio, @PathVariable Integer id) {
    TipoCambio tipoCambioMaybe = cambioMontoService.findById(id);
    tipoCambio.setId(tipoCambioMaybe.getId());
    cambioMontoService.update(tipoCambio);
    return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(tipoCambioMaybe);
  }

  @ApiOperation(value = "Buscar Tipo de Cambio por Id", response = Iterable.class, tags = "tipoCambio")
  @GetMapping(value = "/{id}")
  public ResponseEntity<TipoCambio> findById(@PathVariable Integer id) {
    TipoCambio tipoCambio = cambioMontoService.findById(id);
    return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(tipoCambio);
  }
}
