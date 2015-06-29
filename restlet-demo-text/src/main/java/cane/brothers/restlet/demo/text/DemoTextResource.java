package cane.brothers.restlet.demo.text;

import org.restlet.Server;
import org.restlet.data.MediaType;
import org.restlet.data.Protocol;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.representation.Variant;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

public class DemoTextResource extends ServerResource {

	public DemoTextResource() {
		getVariants().add(new Variant(MediaType.TEXT_PLAIN));
	}

	public static void main(String[] args) throws Exception {
		new Server(Protocol.HTTP, 8000, DemoTextResource.class).start();
	}

	@Override
	protected Representation get(Variant variant) throws ResourceException {
		String message = "Hello, Demo World!";
		return new StringRepresentation(message, MediaType.TEXT_PLAIN);
	}

}
