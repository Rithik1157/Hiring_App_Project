package com.project.mappers;

import com.project.dto.DocumentDTO;
import com.project.enities.DocumentEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-14T16:16:56+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class DocumentMapperImpl implements DocumentMapper {

    @Override
    public DocumentEntity toEntity(DocumentDTO documentDTO) {
        if ( documentDTO == null ) {
            return null;
        }

        DocumentEntity.DocumentEntityBuilder documentEntity = DocumentEntity.builder();

        documentEntity.documentType( documentDTO.getDocumentType() );

        return documentEntity.build();
    }
}
