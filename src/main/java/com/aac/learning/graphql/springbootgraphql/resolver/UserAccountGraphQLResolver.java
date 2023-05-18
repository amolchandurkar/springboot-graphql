package com.aac.learning.graphql.springbootgraphql.resolver;

import com.aac.learning.graphql.springbootgraphql.domain.user.UserAccount;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/** Use GraphQLQueryResolver class to handle root element of graph */
@Slf4j
@Component
public class UserAccountGraphQLResolver implements GraphQLQueryResolver {
  public UserAccount userAccount(UUID id) {
    log.info("LOG_EVENT=USER_ACCT_GRAPHQL_RESOLVER, LOG_STEP=GET_USER_ACCT for user {}", id);

    return UserAccount.builder()
        .id(id)
        .userName("Amol")
        .userEmailId("test@gmail.com")
        .build();
  }
}
