# springboot-graphql-with-fetcher
This repository contain a code for graphql implementation. We will setup Graphql server 
in Java using [DataFetcher](https://www.graphql-java.com). DataFetcher library is from graphql-java library

    @Component
        public class MyDataFetcher implements DataFetcher<ModelX> {
            @Override
            public ModelX get(DataFetchingEnvironment environment) {
            }        
        }



