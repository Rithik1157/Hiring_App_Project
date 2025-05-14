package com.project.mappers;

import com.project.dto.PersonalDTO;
import com.project.enities.PersonalEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-14T16:16:56+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class PersonalMapperImpl implements PersonalMapper {

    @Override
    public PersonalEntity toEntity(PersonalDTO personalDTO) {
        if ( personalDTO == null ) {
            return null;
        }

        PersonalEntity.PersonalEntityBuilder personalEntity = PersonalEntity.builder();

        personalEntity.dob( personalDTO.getDob() );
        personalEntity.gender( personalDTO.getGender() );
        personalEntity.nationality( personalDTO.getNationality() );
        personalEntity.address( personalDTO.getAddress() );

        return personalEntity.build();
    }

    @Override
    public PersonalDTO toDTO(PersonalEntity personalEntity) {
        if ( personalEntity == null ) {
            return null;
        }

        PersonalDTO.PersonalDTOBuilder personalDTO = PersonalDTO.builder();

        personalDTO.dob( personalEntity.getDob() );
        personalDTO.gender( personalEntity.getGender() );
        personalDTO.nationality( personalEntity.getNationality() );
        personalDTO.address( personalEntity.getAddress() );

        return personalDTO.build();
    }
}
