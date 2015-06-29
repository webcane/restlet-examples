package cane.brothers.restlet.demo.text;

import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class DemoStringResource extends ServerResource {

	public static void main(String[] args) throws Exception {
		new Server(Protocol.HTTP, 8000, DemoStringResource.class).start();
	}

	@Get
	public String getString() {
		return "Hello, world!";
	}

}
