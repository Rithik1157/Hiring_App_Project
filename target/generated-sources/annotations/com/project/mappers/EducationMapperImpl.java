package com.project.mappers;

import com.project.dto.EducationDTO;
import com.project.enities.EducationEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-14T16:16:56+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class EducationMapperImpl implements EducationMapper {

    @Override
    public EducationEntity toEntity(EducationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EducationEntity.EducationEntityBuilder educationEntity = EducationEntity.builder();

        educationEntity.highestQualification( dto.getHighestQualification() );
        educationEntity.university( dto.getUniversity() );
        educationEntity.passingYear( dto.getPassingYear() );

        return educationEntity.build();
    }

    @Override
    public EducationDTO toDto(EducationEntity entity) {
        if ( entity == null ) {
            return null;
        }

        EducationDTO.EducationDTOBuilder educationDTO = EducationDTO.builder();

        educationDTO.highestQualification( entity.getHighestQualification() );
        educationDTO.university( entity.getUniversity() );
        educationDTO.passingYear( entity.getPassingYear() );

        return educationDTO.build();
    }
}
