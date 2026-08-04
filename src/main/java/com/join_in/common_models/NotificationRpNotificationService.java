package com.join_in.common_models;

public record NotificationRpNotificationService(
        String authorIdentity,
        String authorProfileImage,
        String postIdentity,
        String content,
        String postedAgo
) {
}
