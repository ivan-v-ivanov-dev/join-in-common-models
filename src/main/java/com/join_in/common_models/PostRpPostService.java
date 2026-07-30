package com.join_in.common_models;

import java.util.List;

public record PostRpPostService(
        String authorProfileImage,
        String authorNames,

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

        int likeCount,
        int dislikeCount,
        int hahaCount,
        int angryCount,

        String postedAgo,
        List<CommentRpPostService> comments
) {
}
