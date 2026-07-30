package com.join_in.common_models;

public record PostReactionsCountRpReactionService(
        String identity,
        int likeCount,
        int dislikeCount,
        int hahaCount,
        int angryCount
) {
}
