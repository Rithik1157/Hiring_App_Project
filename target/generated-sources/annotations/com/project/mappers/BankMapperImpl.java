package com.project.mappers;

import com.project.dto.BankDTO;
import com.project.enities.BankEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-14T16:16:56+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class BankMapperImpl implements BankMapper {

    @Override
    public BankEntity toEntity(BankDTO dto) {
        if ( dto == null ) {
            return null;
        }

        BankEntity bankEntity = new BankEntity();

        bankEntity.setBankName( dto.getBankName() );
        bankEntity.setAccountNumber( dto.getAccountNumber() );
        bankEntity.setIfscCode( dto.getIfscCode() );

        return bankEntity;
    }

    @Override
    public BankDTO toDTO(BankEntity entity) {
        if ( entity == null ) {
            return null;
        }

        BankDTO.BankDTOBuilder bankDTO = BankDTO.builder();

        bankDTO.bankName( entity.getBankName() );
        bankDTO.accountNumber( entity.getAccountNumber() );
        bankDTO.ifscCode( entity.getIfscCode() );

        return bankDTO.build();
    }
}
