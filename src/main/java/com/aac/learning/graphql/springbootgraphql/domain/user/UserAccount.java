package com.aac.learning.graphql.springbootgraphql.domain.user;

import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class UserAccount {
  UUID id;
  String userName;
  String userEmailId;
}
