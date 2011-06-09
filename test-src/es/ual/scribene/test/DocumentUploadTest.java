package es.ual.scribene.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

public class DocumentUploadTest extends SeamTest {

	@Test
	public void test_documentUpload() throws Exception {
		new FacesRequest("/documentUpload.xhtml") {
			@Override
			protected void updateModelValues() throws Exception {				
				//set form input to model attributes
				setValue("#{documentUpload.value}", "seam");
			}
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{documentUpload.documentUpload}");
			}
			@Override
			protected void renderResponse() {
				//check model attributes if needed
				assert getValue("#{documentUpload.value}").equals("seam");
			}
		}.run();
	}
}
