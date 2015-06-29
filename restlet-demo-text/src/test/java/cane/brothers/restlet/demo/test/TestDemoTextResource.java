package cane.brothers.restlet.demo.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

public class TestDemoTextResource {

	@Test
	public void test() throws ResourceException, IOException {
		final ClientResource cr = new ClientResource("http://localhost:8000");
		String responce = cr.get().getText();
		String message = "Hello, Demo World!";

		assertEquals(responce, message);
	}

}
