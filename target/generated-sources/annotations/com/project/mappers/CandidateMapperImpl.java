package com.project.mappers;

import com.project.dto.CandidateDTO;
import com.project.enities.CandidateEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-14T16:16:56+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class CandidateMapperImpl implements CandidateMapper {

    @Override
    public CandidateEntity toEntity(CandidateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CandidateEntity.CandidateEntityBuilder candidateEntity = CandidateEntity.builder();

        candidateEntity.firstName( dto.getFirstName() );
        candidateEntity.lastName( dto.getLastName() );
        candidateEntity.phoneNumber( dto.getPhoneNumber() );
        candidateEntity.email( dto.getEmail() );
        candidateEntity.status( dto.getStatus() );
        candidateEntity.onboardStatus( dto.getOnboardStatus() );
        candidateEntity.profile( dto.getProfile() );

        return candidateEntity.build();
    }

    @Override
    public CandidateDTO toDTO(CandidateEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CandidateDTO.CandidateDTOBuilder candidateDTO = CandidateDTO.builder();

        candidateDTO.firstName( entity.getFirstName() );
        candidateDTO.lastName( entity.getLastName() );
        candidateDTO.email( entity.getEmail() );
        candidateDTO.phoneNumber( entity.getPhoneNumber() );
        candidateDTO.status( entity.getStatus() );
        candidateDTO.onboardStatus( entity.getOnboardStatus() );
        candidateDTO.profile( entity.getProfile() );

        return candidateDTO.build();
    }

    @Override
    public void updateCandidateFromDto(CandidateDTO dto, CandidateEntity entity) {
        if ( dto == null ) {
            return;
        }

        entity.setFirstName( dto.getFirstName() );
        entity.setLastName( dto.getLastName() );
        entity.setPhoneNumber( dto.getPhoneNumber() );
        entity.setEmail( dto.getEmail() );
        entity.setStatus( dto.getStatus() );
        entity.setOnboardStatus( dto.getOnboardStatus() );
        entity.setProfile( dto.getProfile() );
    }
}
