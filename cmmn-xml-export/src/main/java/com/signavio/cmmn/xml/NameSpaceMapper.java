package com.signavio.cmmn.xml;

import java.util.HashMap;
import java.util.Map;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

/**
 * Implementation of {@link NamespacePrefixMapper} that maps the schema
 * namespaces more to readable names. Used by the jaxb marshaller. Requires
 * setting the property "com.sun.xml.bind.namespacePrefixMapper" to an instance
 * of this class.
 * <p>
 * Requires dependency on JAXB implementation jars
 * </p>
 */
public class NameSpaceMapper extends NamespacePrefixMapper {
 
	private Map<String, String> namespaceMap = new HashMap<>();
 
	/**
	 * Create mappings.
	 */
	public NameSpaceMapper() {
		namespaceMap.put(CustomObjectFactory.DEFAULT_NAMESPACE, CustomObjectFactory.DEFAULT_NAMESPACE_NAME);
		namespaceMap.put(Constants.NS_SCHEMA_SIGNAVIO, Constants.NS_NAME_SIGNAVIO_EXTENSIONS);
	}
 	
	@Override
	public String[] getPreDeclaredNamespaceUris() {
		return namespaceMap.keySet().toArray(new String[0]);
	}
	
	/* (non-Javadoc)
	 * Returning null when not found based on spec.
	 * @see com.sun.xml.bind.marshaller.NamespacePrefixMapper#getPreferredPrefix(java.lang.String, java.lang.String, boolean)
	 */
	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
		return namespaceMap.getOrDefault(namespaceUri, suggestion);
	}
	
	public void putNewNamespaceMapping(String prefix, String namespace) {
		namespaceMap.put(namespace, prefix);
	}
}