package com.maven.mapstruct.mapper;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import org.mapstruct.Mapper;

import com.maven.mapstruct.dto.TransactionDTO;
import com.maven.mapstruct.entity.Transaction;

//Sometimes, we may want to customize our mapper in a way which exceeds @Mapping capabilities.

//For example, in addition to type conversion, we may want to transform the values in some way as in our example below.

//In such case, we can create an abstract class and implement methods we want to have customized and leave abstract those, 

//that should be generated by MapStruct.

//The tricky part here is converting the BigDecimal totalamount of dollars into a Long totalInCents. in Transaction and TransactionDTO classes.

@Mapper
public abstract class TransactionMapper {
	
	
	//This method is a customized method for converting BigDecimal totalDollars into Long totalInCents.
	public TransactionDTO toTransactionDTO(Transaction transaction) {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setUuid(transaction.getUuid());
        transactionDTO.setTotalInCents(transaction.getTotal()
          .multiply(new BigDecimal("100")).longValue());
        return transactionDTO;
    }
	
	//This method will be used by MapStruct.This method is abstract and will be implemented by MapStruct.
	public abstract List<TransactionDTO> toTransactionDTO(
		      Collection<Transaction> transactions);
	

}
