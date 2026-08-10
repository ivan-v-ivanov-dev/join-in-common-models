package com.join_in.common_models;

import java.time.LocalDateTime;

public record ConversationRpGatewayService(
        String profileIdentity,
        String participantNames,
        String participantProfileImage,
        LocalDateTime lastMessageAt,
        String conversationIdentity,
        String participantIdentity
) {
}
