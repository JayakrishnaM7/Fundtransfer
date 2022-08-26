package org.ibm.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccount {
		private String accountNumber;
		private String  accountName;
		private String branchCode;
		private String branchName;
		private String  taxIdentificationNumber;
		private String  accountPurpose;private String  address;
}
