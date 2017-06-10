package com.signavio.cmmn.xml;


import java.io.StringWriter;
import java.io.Writer;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import com.signavio.cmmn.xml.v11.ObjectFactory;
import com.signavio.cmmn.xml.v11.TDefinitions;
import com.signavio.diagram.model.Diagram;
import org.xml.sax.SAXException;


public class CmmnXmlExporter {
	
	private static final String NAMESPACE_MAPPER_PROPERTY = "com.sun.xml.bind.namespacePrefixMapper";
	
	private Diagram diagram;
	
	
	public CmmnXmlExporter(Diagram diagram) {
		this.diagram = diagram;
	}
	
	public String generateXml() {
		TDefinitions definitions = new TDefinitions();
		try {
			return marshall(definitions);
		} catch (JAXBException | SAXException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	private void configureMarshaller(TDefinitions definition, Marshaller marshaller) throws PropertyException {
		NameSpaceMapper namespaceMapper = (NameSpaceMapper) marshaller.getProperty(NAMESPACE_MAPPER_PROPERTY);
		namespaceMapper.putNewNamespaceMapping(Constants.NS_NAME_SIGNAVIO, definition.getTargetNamespace());
		marshaller.setProperty(NAMESPACE_MAPPER_PROPERTY, namespaceMapper);
	}
	
	
	private void marshall(TDefinitions definition, Writer writer) throws JAXBException, SAXException {
		ObjectFactory factory = new ObjectFactory();
		Marshaller marshaller = getMarshaller();
		
		configureMarshaller(definition, marshaller);
		
		marshaller.marshal(factory.createDefinitions(definition), writer);
	}
	
	
	public String marshall(TDefinitions definition) throws JAXBException, SAXException {
		Writer writer = new StringWriter();
		marshall(definition, writer);
		return writer.toString();
	}
	
	
	private Marshaller getMarshaller() throws JAXBException, SAXException {
		Marshaller marshaller = getJAXBInstance().createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(NAMESPACE_MAPPER_PROPERTY, new NameSpaceMapper());
		return marshaller;
	}
	
	private JAXBContext getJAXBInstance() throws JAXBException {
		return JAXBContext.newInstance(TDefinitions.class);
	}
}
