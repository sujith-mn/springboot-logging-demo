package com.devonfw.example.example_logging.testmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * TODO snesarmo This type ...
 *
 */
@Path("/testservice")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface TestRestService {

  /**
   * @return
   */
  @GET
  @Path("/hello")
  public String sayHello();
}
