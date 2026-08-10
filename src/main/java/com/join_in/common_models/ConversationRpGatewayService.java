package com.join_in.common_models;

import java.time.LocalDateTime;

public record ConversationRpGatewayService(
        String profileIdentity,
        String profileNames,
        String profileImage,
        LocalDateTime lastMessageAt,
        String conversationIdentity,
        String participantIdentity
) {
}
