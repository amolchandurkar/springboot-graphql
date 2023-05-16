# springboot-graphql- Inporgress...
GraphQL with Springboot
## What is GraphQL and its feature
GraphQL is an open-source query language and runtime for APIs. GraphQL allows clients to request and retrieve specific 
data from a server in a flexible and efficient manner.

Traditional RESTful APIs require multiple endpoints for different types of data requests, which often results in over-fetching 
or under-fetching of data. In contrast, GraphQL provides a single endpoint where clients can specify exactly what data they need. 
This makes it more efficient and reduces the amount of unnecessary data transferred over the network.

With GraphQL, clients can send queries that define the structure of the response they expect. They can request specific 
fields, nested relationships, and even specify the shape of the response. This enables clients to retrieve all the necessary 
data in a single round trip to the server, eliminating the need for multiple requests.

Another key feature of GraphQL is its strong typing system. GraphQL schemas define the structure of the data available in the 
API, including the types, relationships between types, and the available queries and mutations. Clients can introspect the schema 
to discover available data and operations, making it easier to understand and explore the API.

GraphQL is often used in web and mobile applications where efficient data retrieval is crucial. It has gained popularity due to 
its flexibility, allowing clients to request only the data they need and enabling backend developers to iterate and evolve APIs 
without breaking existing clients. It is widely supported in various programming languages and has a growing ecosystem of tools 
and libraries.

## Developers Guide
Need to add details
### Libraries reqire for Spring-boot server project
 GraphQL depends on graphql-spring-boot-, which internally depends on graphql-java-tools, graphql-java. We only require graphql-spring 
 boot and spring boot parent pom to work with our simple graphql server project.
#### graphql-java-tools 
This library allows you to build graph schema using the graphql schema language. This library takes a schema first approach and 
allows us to bring our own java object (matching the schema types) to fill in the implementation. This approach allows us to have 
complete control over the schema and have a good overview of what types are available. Graphql tools by default will look for all 
**/*.graphqls files on the classpath and it will automatically combine and compile them into one graphql schema at application runtime. 
This is available at localhost:port/graphql/schema.json.
Now We can create graphql schema file with root type query then we can create a matching GraphqlQueryResolver which will match the root 
queries. We then start graphql playground to view and play with our first graphql query.
### Maven Repos
https://repo.maven.apache.org/maven2/com/graphql-java-kickstart/
### Maven Plugins
Need to add list    