package br.com.fiap.monitoramento.model;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "tbl_sensores")
public class Sensor {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SENSORES_SQ"
    )
    @SequenceGenerator(
            name = "SENSORES_SQ",
            sequenceName = "SENSORES_SQ",
            allocationSize = 50
    )
    private Long id;
    private String tipo;
    private String localizacao;

    @Column(name = "desastre_id")
    private Long desastreId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Long getDesastreId() {
        return desastreId;
    }

    public void setDesastreId(Long desastreId) {
        this.desastreId = desastreId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sensor sensor = (Sensor) o;
        return Objects.equals(id, sensor.id) && Objects.equals(tipo, sensor.tipo) && Objects.equals(localizacao, sensor.localizacao) && Objects.equals(desastreId, sensor.desastreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipo, localizacao, desastreId);
    }
}
