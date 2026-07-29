package com.join_in.common_models;

import java.util.List;

public record PostRpPostService(
        String postIdentity,
        String authorIdentity,
        String groupIdentity,

        String content,

        boolean hasText,
        boolean hasImage,
        boolean hasVideo,

        boolean poll,

        String imageIdentity,
        String youtubeUrl,

        String pollQuestion,
        List<PollOptionRpPostService> pollOptions,

        String postedAgo,
        List<CommentRpPostService> comments
) {
}
