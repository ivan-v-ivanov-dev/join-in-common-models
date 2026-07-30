package com.join_in.common_models;

public record CommentReactionsCountRpReactionService(
        String identity,
        int likeCount,
        int dislikeCount
) {
}
