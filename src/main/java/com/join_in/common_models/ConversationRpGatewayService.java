package com.join_in.common_models;

import java.time.LocalDateTime;

public record ConversationRpGatewayService(
        String profileIdentity,
        String participantNames,
        String participantProfileImage,
        String postedAgo,
        String conversationIdentity,
        String participantIdentity
) {
}
