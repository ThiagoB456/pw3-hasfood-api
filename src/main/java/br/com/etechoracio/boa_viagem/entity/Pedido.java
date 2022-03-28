package br.com.etechoracio.boa_viagem.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import br.com.etechoracio.boa_viagem.enums.StatusPedidoEnum;

@Getter
@Setter
@Entity
@Table(name="TBL_PEDIDO")

public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PEDIDO")
    private Long id; 
 
	@Column(name="TX_STATUS")
    private String descricao; 
 
	@Column(name="DT_PEDIDO")
    private LocalDate data;
	
	@Column(name="ID_RESTAURANTE")
    private LocalDate id_restaurante;
}
