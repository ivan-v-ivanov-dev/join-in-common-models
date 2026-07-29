package com.join_in.common_models;

public record PollOptionRpPostService(
        String optionIdentity,
        String optionText,
        int voteCount
) {
}
