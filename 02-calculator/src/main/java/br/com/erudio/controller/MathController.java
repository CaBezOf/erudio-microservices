package br.com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import MathOperator.MathOperations;
import br.com.erudio.exception.UnsupportedMathOperationException;
import converters.MathConverter;

@RestController
public class MathController {
	
	private MathOperations mathOperation = new MathOperations();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne")String numberOne, @PathVariable("numberTwo")String numberTwo) throws Exception {
		if(!MathConverter.isNumeric(numberOne) || !MathConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}	
		return mathOperation.sum(MathConverter.convertToDouble(numberOne), MathConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value="/subtr/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subtr(@PathVariable("numberOne")String numberOne, @PathVariable("numberTwo")String numberTwo) throws Exception {
		if(!MathConverter.isNumeric(numberOne) || !MathConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}		
		return mathOperation.subtraction(MathConverter.convertToDouble(numberOne), MathConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/multipl/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multipl(@PathVariable("numberOne")String numberOne, @PathVariable("numberTwo")String numberTwo) throws Exception {
		if(!MathConverter.isNumeric(numberOne) || !MathConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}		
		return mathOperation.multiplication(MathConverter.convertToDouble(numberOne), MathConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/divis/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double divis(@PathVariable("numberOne")String numberOne, @PathVariable("numberTwo")String numberTwo) throws Exception {
		if(!MathConverter.isNumeric(numberOne) || !MathConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}		
		return mathOperation.division(MathConverter.convertToDouble(numberOne), MathConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/mean/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double mean(@PathVariable("numberOne")String numberOne, @PathVariable("numberTwo")String numberTwo) throws Exception {
		if(!MathConverter.isNumeric(numberOne) || !MathConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}		
		return mathOperation.division(MathConverter.convertToDouble(numberOne), MathConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/raiz/{number}", method=RequestMethod.GET)
	public Double raiz(@PathVariable("number")String number) throws Exception {
		if(!MathConverter.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}		
		return mathOperation.sqrRoot(MathConverter.convertToDouble(number));
	}

	
	
}
