package com.example.backEndProject.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class InterestsConverter implements AttributeConverter<Interests,String> {

    @Override
    public String convertToDatabaseColumn(Interests interest) {
        if (interest == null) {
            return null;
        }
        return interest.getCode();
    }

    @Override
    public Interests convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }

        return Stream.of(Interests.values())
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
