package es.ual.scribene.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

public class DocumentViewTest extends SeamTest {

	@Test
	public void test_documentView() throws Exception {
		new FacesRequest("/documentView.xhtml") {
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{documentView.documentView}");
			}
		}.run();
	}
}
