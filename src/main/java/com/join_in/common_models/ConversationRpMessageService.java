package com.join_in.common_models;

import java.time.LocalDateTime;

public record ConversationRpMessageService(
    String profileIdentity,
    LocalDateTime lastMessageAt,
    String conversationIdentity,
    String participantIdentity
) {
}
