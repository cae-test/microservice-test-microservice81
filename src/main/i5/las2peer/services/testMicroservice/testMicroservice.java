package i5.las2peer.services.testMicroservice;


import java.net.HttpURLConnection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import i5.las2peer.api.Context;
import i5.las2peer.api.ManualDeployment;
import i5.las2peer.api.ServiceException;
import i5.las2peer.api.logging.MonitoringEvent;
import i5.las2peer.restMapper.RESTService;
import i5.las2peer.restMapper.annotations.ServicePath;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import org.json.simple.*;

import java.util.HashMap;
import java.util.Map;
 

/**
 *
 * test-microservice81
 *
 * This microservice was generated by the CAE (Community Application Editor). If you edit it, please
 * make sure to keep the general structure of the file and only add the body of the methods provided
 * in this main file. Private methods are also allowed, but any "deeper" functionality should be
 * outsourced to (imported) classes.
 *
 */
@ServicePath("test")
@ManualDeployment
public class testMicroservice extends RESTService {





  public testMicroservice() {
	super();
    // read and set properties values
    setFieldValues();
    
  }

  @Override
  public void initResources() {
	getResourceConfig().register(RootResource.class);
  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // REST methods
  // //////////////////////////////////////////////////////////////////////////////////////

  @Api
  @SwaggerDefinition(
      info = @Info(title = "test-microservice81", version = "$Metadata_Version$",
          description = "$Metadata_Description$",
          termsOfService = "$Metadata_Terms$",
          contact = @Contact(name = "test", email = "CAEAddress@gmail.com") ,
          license = @License(name = "BSD",
              url = "https://github.com/cae-test/microservice-test-microservice81/blob/master/LICENSE.txt") ) )
  @Path("/")
  public static class RootResource {

    private final testMicroservice service = (testMicroservice) Context.getCurrent().getService();

      /**
   * 
   * testMethod
   *
   * 
   *
   * 
   * @return Response 
   * 
   */
  @GET
  @Path("/testmethod")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.TEXT_PLAIN)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "testResponse")
  })
  @ApiOperation(value = "testMethod", notes = " ")
  public Response testMethod() {




     
    // service method invocations

     




    // testResponse
    boolean testResponse_condition = true;
    if(testResponse_condition) {
      JSONObject testResult = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_OK).entity(testResult.toJSONString()).build();
    }
    return null;
  }



  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // Service methods (for inter service calls)
  // //////////////////////////////////////////////////////////////////////////////////////
  
  

  // //////////////////////////////////////////////////////////////////////////////////////
  // Custom monitoring message descriptions (can be called via RMI)
  // //////////////////////////////////////////////////////////////////////////////////////

  public Map<String, String> getCustomMessageDescriptions() {
    Map<String, String> descriptions = new HashMap<>();
    
    return descriptions;
  }

}
