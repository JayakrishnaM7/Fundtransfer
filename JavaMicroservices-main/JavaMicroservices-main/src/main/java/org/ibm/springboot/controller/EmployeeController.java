package org.ibm.springboot.controller;

import java.io.IOException;
import java.util.List;

import org.ibm.springboot.model.CreateAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;

@CrossOrigin(origins = "http://159.122.181.3:30555")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private CloudantClient client;
	private Database db;

	@PostMapping("/createAccount")
	public @ResponseBody String createEmployee(@RequestBody CreateAccount employee) {
		db = client.database("fundtransfer", false);
		System.out.println(" fundtransfer " + employee);
		Response r = null;
		if (employee != null) {
			r = db.post(employee);
		}
		return r.getId();
	}
	@GetMapping("/getAccountDetails")
	public @ResponseBody List<CreateAccount> getAll() throws IOException {
		db = client.database("fundtransfer", false);
		List<CreateAccount> allDocs = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(CreateAccount.class);
		System.out.println("Get fundtransfer List " + allDocs);
		return allDocs;
	}

}
