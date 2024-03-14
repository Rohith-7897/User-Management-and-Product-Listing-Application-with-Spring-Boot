package org.jsp.userbootapp.exception;

import org.jsp.userbootapp.dto.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ProductExceptionHandler extends ResponseEntityExceptionHandler{
	
	public ResponseEntity<ResponseStructure<String>> handlePNFE(ProductNotFoundException exception){
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setData("Product Not Found");
		structure.setMessage(exception.getMessage());
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_FOUND);
	}
	
}
