package com.signavio.cmmn.xml;

import javax.xml.namespace.QName;

import com.signavio.cmmn.xml.v11.ObjectFactory;


public class CustomObjectFactory extends ObjectFactory {
	
	public static final String	DEFAULT_NAMESPACE_NAME			= "";
	public static final String	DEFAULT_NAMESPACE				= "http://www.omg.org/spec/CMMN/20151109/CMMN11.xsd";

    // Signavio additional meta-attributes

    public static final QName QNAME_SIGNAVIO_SHAPE_ID           = new QName(Constants.NS_SCHEMA_SIGNAVIO, "shapeId");
    public static final QName QNAME_SIGNAVIO_DIAGRAM_ID         = new QName(Constants.NS_SCHEMA_SIGNAVIO, "diagramId");
    public static final QName QNAME_SIGNAVIO_GLOSSARY_ID        = new QName(Constants.NS_SCHEMA_SIGNAVIO, "glossaryId");
	public static final QName QNAME_SIGNAVIO_REVISION_ID          = new QName(Constants.NS_SCHEMA_SIGNAVIO, "revisionId");
	public static final QName QNAME_SIGNAVIO_REVISION_NUMBER           = new QName(Constants.NS_SCHEMA_SIGNAVIO, "revisionNumber");

}
