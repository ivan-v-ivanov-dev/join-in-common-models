package com.join_in.common_models;

public record CommentRpGatewayService(
        String authorProfileImage,
        String authorNames,
        String commentIdentity,
        String postIdentity,
        String authorIdentity,
        String content,
        String postedAgo
) {
}
