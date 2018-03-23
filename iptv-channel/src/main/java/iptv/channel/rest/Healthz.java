package iptv.channel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * @author Ritik.Dwivedi
 *
 */
@Path("healthz")
public class Healthz {
	
	@GET	
	@Produces({MediaType.TEXT_PLAIN})
	public String healthz() {
        return "OK";
    }
}
