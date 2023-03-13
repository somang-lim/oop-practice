package org.example.calculator;

import java.util.List;

import org.example.calculator.operator.AdditionOperator;
import org.example.calculator.operator.DivisionOperator;
import org.example.calculator.operator.MultiplicationOperator;
import org.example.calculator.operator.NewArithmeticOperator;
import org.example.calculator.operator.SubtractionOperator;

public class Calculator {
	private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
	public static int calculator(int operand1, String operator, int operand2) {
		return arithmeticOperators.stream()
			.filter(arithmeticOperator -> arithmeticOperator.supports(operator))
			.map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
	}
}
