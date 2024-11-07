package ar.edu.utn.frba.dds.ejercicio_01;

import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.BajarDePeso;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Mantener;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Motivacion;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Tonificar;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class MotivacionAttributeConverter implements AttributeConverter<Motivacion, String> {
    @Override
    public String convertToDatabaseColumn(Motivacion motivacion) {
        if (motivacion== null){
            return null;
        }
        String motivacionString = "";
        if (motivacion instanceof Mantener){
            motivacionString="mantener";
        }
        else if (motivacion instanceof BajarDePeso){
            motivacionString="bajarPeso";
        }
        else if (motivacion instanceof Tonificar){
            motivacionString="tonificar";
        }
        return motivacionString;
    }

    @Override
    public Motivacion convertToEntityAttribute(String s) {
        if (s == null){
            return null;
        }
        Motivacion motivacion = null;
        switch (s) {
            case "mantener":
                motivacion = new Mantener();break;
            case "bajarPeso":
                motivacion = new BajarDePeso();break;
            case "tonificar":
                motivacion = new Tonificar();break;
        }
        return motivacion;
    }
}
