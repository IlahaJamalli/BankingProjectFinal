package com.example.bankingprojectfinal.DTOS.Transaction;

import com.example.bankingprojectfinal.Model.Entity.TransactionEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-19T01:24:25+0400",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.jar, environment: Java 17.0.13 (Amazon.com Inc.)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransactionDto mapToTransactionDto(TransactionEntity transactionEntity) {
        if ( transactionEntity == null ) {
            return null;
        }

        TransactionDto.TransactionDtoBuilder transactionDto = TransactionDto.builder();

        transactionDto.transactionId( transactionEntity.getTransactionId() );
        transactionDto.transactionDate( transactionEntity.getTransactionDate() );
        transactionDto.amount( transactionEntity.getAmount() );
        transactionDto.status( transactionEntity.getStatus() );

        return transactionDto.build();
    }
}
