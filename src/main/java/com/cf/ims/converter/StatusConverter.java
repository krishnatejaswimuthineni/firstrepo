package com.cf.ims.converter;

import com.cf.ims.constants.Status;
import jakarta.persistence.AttributeConverter;

public class StatusConverter implements AttributeConverter<Status, Character> {
    @Override
    public Character convertToDatabaseColumn(final Status status) {
        return status.getValue();
    }

    @Override
    public Status convertToEntityAttribute(final Character character) {
        return Status.getByValue(character);
    }
}
