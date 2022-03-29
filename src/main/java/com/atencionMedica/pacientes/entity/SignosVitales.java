package com.atencionMedica.pacientes.entity;

public class SignosVitales {
    private Integer pulsaciones;
    private Float presionArterial;

    public SignosVitales() {
    }

    public SignosVitales(Integer pulsaciones, Float presionArterial) {
        this.pulsaciones = pulsaciones;
        this.presionArterial = presionArterial;
    }

    public Integer getPulsaciones() {
        return pulsaciones;
    }

    public void setPulsaciones(Integer pulsaciones) {
        this.pulsaciones = pulsaciones;
    }

    public Float getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(Float presionArterial) {
        this.presionArterial = presionArterial;
    }

    @Override
    public String toString() {
        return "SignosVitales{" +
                "pulsaciones=" + pulsaciones +
                ", presionArterial=" + presionArterial +
                '}';
    }
}
