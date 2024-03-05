package br.com.pucminas.barbeariateste.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Horario {
    private boolean NOVE_HORAS;
    private boolean DEZ_HORAS;
    private boolean ONZE_HORAS;
    private boolean DOZE_HORAS;
    private boolean TREZE_HORAS;
    private boolean QUARTORZE_HORAS;
    private boolean QUINZE_HORAS;
    private boolean DEZESSEIS_HORAS;
    private boolean DEZESSETE_HORAS;
    private boolean DEZOITO_HORAS;
    @Id
    private Long id;

    public Horario(Long id){
        this.NOVE_HORAS = false;
        this.DEZ_HORAS = false;
        this.ONZE_HORAS = false;
        this.DOZE_HORAS = false;
        this.TREZE_HORAS = false;
        this.QUARTORZE_HORAS = false;
        this.QUINZE_HORAS = false;
        this.DEZESSEIS_HORAS = false;
        this.DEZESSETE_HORAS = false;
        this.DEZOITO_HORAS = false;
        this.id = id;
    }

    public Horario() {
        this.NOVE_HORAS = false;
        this.DEZ_HORAS = false;
        this.ONZE_HORAS = false;
        this.DOZE_HORAS = false;
        this.TREZE_HORAS = false;
        this.QUARTORZE_HORAS = false;
        this.QUINZE_HORAS = false;
        this.DEZESSEIS_HORAS = false;
        this.DEZESSETE_HORAS = false;
        this.DEZOITO_HORAS = false;
    }
}
