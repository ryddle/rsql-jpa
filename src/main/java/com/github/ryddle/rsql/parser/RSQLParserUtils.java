package com.github.ryddle.rsql.parser;

import java.util.Set;

import com.github.ryddle.rsql.parser.ast.ComparisonOperatorProxy;

import cz.jirutka.rsql.parser.RSQLParser;
import cz.jirutka.rsql.parser.ast.ComparisonOperator;
import cz.jirutka.rsql.parser.ast.RSQLOperators;

public class RSQLParserUtils {

	public static RSQLParser getParser(){
		Set<ComparisonOperator> operators = RSQLOperators.defaultOperators();
		operators.add(ComparisonOperatorProxy.IN_DATE.getOperator());
		return new RSQLParser(operators);
	}
}
