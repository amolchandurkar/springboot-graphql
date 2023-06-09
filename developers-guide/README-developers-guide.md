# Index
    1. Overview
    2. Local Environment Setup
    3. Library Used and its integration
    4. Integration with API or Service
    5. API Examples
    6. Quality of Service and Alerts
    7. Release
    8. Testing
    9. Database

# Overview
[GraphQL Introduction](https://graphql.org/learn/)

[Queries and Mutation](https://graphql.org/learn/queries/)

[Schemas and Types](https://graphql.org/learn/schema/)

We can see two main ways to setup Graphql server in Java

One is implementing GraphQlResolver like

    public class MyResolver implements GraphQLResolver<ModelX>

another one is by Implementing Datafetcher Reference: https://www.graphql-java.com

    @Component
        public class MyDataFetcher implements DataFetcher<ModelX> {
            @Override
            public ModelX get(DataFetchingEnvironment environment) {
            }        
        }

DataFetcher is from graphql-java library

GraphQLResolver is from graphql-java-tools library which is built on top of graphql-java. You can think that it provides a way
which allow you to build a GraphQL server in a more high level way or a way that you may find more convenient. At the end ,
GraphQLResolver will somehow invoke DataFetcher#get() for resolving the value for a field.

# Local Environment Setup

# Library Used and its integration
GraphQL depends on graphql-spring-boot-, which internally depends on graphql-java-tools, graphql-java. We only require graphql-spring
boot and spring boot parent pom to work with our simple graphql server project.
## graphql-java-tools
This library allows you to build graph schema using the graphql schema language. This library takes a schema first approach and
allows us to bring our own java object (matching the schema types) to fill in the implementation. This approach allows us to have
complete control over the schema and have a good overview of what types are available. Graphql tools by default will look for all
**/*.graphqls files on the classpath and it will automatically combine and compile them into one graphql schema at application runtime.
This is available at localhost:port/graphql/schema.json.
Now We can create graphql schema file with root type query then we can create a matching GraphqlQueryResolver which will match the root
queries. We then start graphql playground to view and play with our first graphql query.
## Maven Repos
[graphql-java-kickstart](https://repo.maven.apache.org/maven2/com/graphql-java-kickstart/)
## Additional Maven Plugins
Need to add list
[OWASP Dependency Check](https://jeremylong.github.io/DependencyCheck/dependency-check-maven/)

# Integration with API or Service

# API Examples

# Quality of Service and Alerts

# Release

# Testing
## GraphQL Clients
[Postman](https://www.postman.com/downloads)

[Altair](https://altair.sirmuel.design)

[Insomnia Core](https://insomnia.rest/download)

## Run GraphQL Queries
[Build maven project and in browser go to](http://localhost:8080/graphql)

# Database


