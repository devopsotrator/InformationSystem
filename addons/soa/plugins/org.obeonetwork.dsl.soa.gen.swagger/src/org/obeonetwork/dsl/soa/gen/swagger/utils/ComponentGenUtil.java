package org.obeonetwork.dsl.soa.gen.swagger.utils;

import static org.obeonetwork.dsl.soa.gen.swagger.utils.StringUtils.isNullOrWhite;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.obeonetwork.dsl.environment.PrimitiveType;
import org.obeonetwork.dsl.environment.StructuredType;
import org.obeonetwork.dsl.environment.Type;
import org.obeonetwork.dsl.soa.Component;

public class ComponentGenUtil {

	public static String getName(Component component) {
		return (isNullOrWhite(component.getName()))? "UnnamedComponent" : component.getName();
	}

	public static Collection<Type> getExposedTypes(Component component) {
		Set<Type> exposedTypes = new HashSet<>();
		
		component.getProvidedServices().stream()
		.flatMap(service -> service.getOwnedInterface().getOwnedOperations().stream())
		.flatMap(operation -> OperationGenUtil.getOwnedParameters(operation).stream())
		.forEach(parameter -> collectExposedTypes(exposedTypes, parameter.getType()));
		
		return exposedTypes;
	}

	private static void collectExposedTypes(Set<Type> exposedTypes, Type type) {
		
		if(type == null) {
			return;
		}
		
		// Filter out primitive types
		if(type instanceof PrimitiveType) {
			return;
		}
		
		// Recursion stop condition
		if(exposedTypes.contains(type)) {
			return;
		}
		
		exposedTypes.add(type);
		
		if(type instanceof StructuredType) {
			StructuredType structuredType = (StructuredType) type;
			structuredType.getAttributes().forEach(attribute -> collectExposedTypes(exposedTypes, attribute.getType()));
			structuredType.getReferences().forEach(reference -> collectExposedTypes(exposedTypes, reference.getReferencedType()));
		}
		
	}
	
}