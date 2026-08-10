package com.join_in.common_models;

import java.time.LocalDateTime;

public record ConversationRpMessageService(
    String profileIdentity,
    String participantNames,
    String participantProfileImage,
    LocalDateTime lastMessageAt,
    String conversationIdentity,
    String participantIdentity
) {
}
