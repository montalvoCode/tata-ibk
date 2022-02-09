package com.ibk.tata.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_tipo")
public class TipoCambio {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String monedaOrigen;

  private String monedaDestino;

  private Double tipoCambio;

}
