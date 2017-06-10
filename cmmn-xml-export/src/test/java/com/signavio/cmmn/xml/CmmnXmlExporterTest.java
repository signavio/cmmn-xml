package com.signavio.cmmn.xml;


import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.signavio.diagram.model.Diagram;
import com.signavio.diagram.model.DiagramBuilder;
import com.signavio.diagram.model.Shape;
import com.signavio.diagram.stencilset.StencilSet;
import com.signavio.diagram.stencilset.StencilSetBuilder;
import com.signavio.diagram.stencilset.access.stencils.CmmnStencil;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CmmnXmlExporterTest {

	@Test
	public void testHelloWorld() throws IOException, JSONException {
		String modelJson = readFile("signavio/cmmn hello world.json");
		Diagram diagram = DiagramBuilder.parseJson(modelJson, UUID.randomUUID().toString());
		
		List<Shape> tasks = diagram.getShapesByStencilInfos(Arrays.asList(CmmnStencil.TASK));
		AssertJUnit.assertEquals("b", tasks.get(0).getLabel());
		
		CmmnXmlExporter xmlExporter = new CmmnXmlExporter(diagram);
		String xml = xmlExporter.generateXml();
		System.out.println(xml);
	}
	
	private String readFile(String path) throws IOException {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);
		return IOUtils.toString(inputStream);
	}
}
