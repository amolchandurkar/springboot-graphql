package com.aac.learning.graphql.springbootgraphql.domain.user;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class UserAccount {
    UUID id;
    String userName;
    String userEmailId;
    UserLanguage userLanguage;
}
