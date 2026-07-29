package com.join_in.common_models;

public record PollOptionRpGatewayService(
        String optionIdentity,
        String optionText,
        int voteCount
) {
}
