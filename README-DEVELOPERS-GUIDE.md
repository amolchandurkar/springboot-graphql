# Developers Guide
Need to add details
[GraphQL Introduction](https://graphql.org/learn/)
[Queries and Mutation](https://graphql.org/learn/queries/)
[Schemas and Types](https://graphql.org/learn/schema/)

## Libraries reqire for Spring-boot server project
GraphQL depends on graphql-spring-boot-, which internally depends on graphql-java-tools, graphql-java. We only require graphql-spring
boot and spring boot parent pom to work with our simple graphql server project.
### graphql-java-tools
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
## Run GraphQL Queries
[Build maven project and in browser go to](http://localhost:8080/graphql)
