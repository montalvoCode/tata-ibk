package com.ibk.tata.repository;

import com.ibk.tata.entity.TipoCambio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoCambioRepository extends JpaRepository<TipoCambio, Integer> {

  TipoCambio findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino);

}
