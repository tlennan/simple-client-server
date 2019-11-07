# simple-client-server
A pair of applications that demonstrate consuming JSON resources.

The interface is defined in the info-server module.  This includes the (trivial) data model and an 
interface that is annotated to indicate the URLs and HTTP methods to use when accessing the server.  
The intent is that this interface will also be used when consuming the service (note that InfoClient 
implements the interface).  On the server implementation the business logic in InfoServerImpl also 
implements the InfoServer interface.  The controller then merely extends this implementation and adds 
a single annotation to expose the service via the web.  The business logic would normally be created 
as its own Spring bean but here is created along with the web interface.

Using the interface across all these areas allows the parts to be freely swapped.  For example, if 
there's no need to scale the client and server seperately then you could easily embed the server 
implementation in the same app as the client with no changes to the client's business logic and web 
interface.

The security functionality for the client and server is split out into separate modules so they can 
be developed and tested without the complications of the security implementation.  The security used 
here is using JWT as shown at https://www.javainuse.com/spring/boot-jwt.  To access the web interface
provide the below in the request body:
{
    "name": "name",
    "description": "desc"
}

When running the secured apps visit http://localhost:8080/do  This will cause the client to invoke the server and display the content returned.
