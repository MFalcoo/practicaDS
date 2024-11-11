package ar.edu.utn.frba.dds.ejercicio_02.personajes;




import ar.edu.utn.frba.dds.ejercicio_02.elementos.Arco;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Escudo;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Espada;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ElementosAttributeConverter implements AttributeConverter<ElementoDefensor, String> {
    @Override
    public String convertToDatabaseColumn(ElementoDefensor elemento) {
        if (elemento== null){
            return null;
        }
        String motivacionString = "";
        if (elemento instanceof Escudo){
            motivacionString="escudo";
        }
        else if (elemento instanceof Arco){
            motivacionString="arco";
        }
        else if (elemento instanceof Espada){
            motivacionString="espada";
        }
        return motivacionString;
    }

    @Override
    public ElementoDefensor convertToEntityAttribute(String s) {
        if (s == null){
            return null;
        }
        ElementoDefensor elemento  = null;
        switch (s) {
            case "espada":
                elemento = new Espada();break;
            case "escudo":
                elemento = new Escudo();break;
            case "arco":
                elemento = new Arco();break;
        }
        return elemento;
    }
}