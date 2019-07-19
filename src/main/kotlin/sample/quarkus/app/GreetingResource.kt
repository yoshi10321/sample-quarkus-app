package sample.quarkus.app

import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource {

    @Inject
    lateinit var service: GreetingService

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    fun greeting(@PathParam("name") name: String): String {
        return service.greeting(name)
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello() = Greeting("hello")

}
