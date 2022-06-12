# REST

**REpresentational State Transfer**

#### Resources
- are identified by URIs
#### Methods
helps you create/modify/delete resources
- GET: retrieve a resource
- POST: create a new resource
- PUT: update an existing resource
#### Resources
- helps you view and interact with the data (XML, HTML, JSON)

## JAX-RS example
### Step 1: Give ID to resource
```java
@Path("orders/{id}")
public class OrderResource {
  @Path("customer") // URI: /orders/{id}/customer
  public CustomerResource getCustomer() {
    /// ...
  }
}
```

### Step 2: Use standard HTTP methods
```java
@GET
@PUT
@POST
@DELETE
```

#### Can extract informations from URI
```java
@ConsumeMime("application/json")
// ...
@QueryParam("page")
// ...
@PathParam("id")
```

### Step 3: Link to other resources
- UriInfo: provides information about the URI (Context)
- UriBuilder: allows you to build URIs

### Step 4: Choose between representations

```java
@ProduceMime("application/json")
@ProduceMime("application/xml")
@ConsumeMime("application/json")
// ...
```

### Step 5: Stateless communication
- New instance of resource for each request
- No session caching
- No persistent storage