# springboot-graphql- Inporgress...
GraphQL with Springboot
## What is GraphQL and its feature
GraphQL is an open-source query language and runtime for APIs. GraphQL allows clients to request and retrieve specific data from a server in a flexible and efficient manner.

Traditional RESTful APIs require multiple endpoints for different types of data requests, which often results in over-fetching or under-fetching of data. In contrast, 
GraphQL provides a single endpoint where clients can specify exactly what data they need. This makes it more efficient and reduces the amount of unnecessary data 
transferred over the network.

With GraphQL, clients can send queries that define the structure of the response they expect. They can request specific fields, nested relationships, and even specify 
the shape of the response. This enables clients to retrieve all the necessary data in a single round trip to the server, eliminating the need for multiple requests.

Another key feature of GraphQL is its strong typing system. GraphQL schemas define the structure of the data available in the API, including the types, relationships 
between types, and the available queries and mutations. Clients can introspect the schema to discover available data and operations, making it easier to understand 
and explore the API.

GraphQL is often used in web and mobile applications where efficient data retrieval is crucial. It has gained popularity due to its flexibility, allowing clients to 
request only the data they need and enabling backend developers to iterate and evolve APIs without breaking existing clients. It is widely supported in various programming 
languages and has a growing ecosystem of tools and libraries.

## Developers Guide
Need to add details
### Libraries reqire for Spring-boot server project
We need some graphql library to work with our simple graphql server project. GraphQL depends on graphql-spring-boot-, which internally depends on graphql-java-tools, graphql-java. 
we only require graphql-spring boot and spring boot parent pom.
### Maven Repos
https://repo.maven.apache.org/maven2/com/graphql-java-kickstart/
### Maven Plugins
Need to add list    