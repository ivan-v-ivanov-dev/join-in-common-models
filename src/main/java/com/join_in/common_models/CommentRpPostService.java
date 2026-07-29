package com.join_in.common_models;

public record CommentRpPostService(
        String authorProfileImage,
        String authorFirstName,
        String authorLastName,
        String commentIdentity,
        String postIdentity,
        String authorIdentity,
        String content,
        String postedAgo
) {
}
