package com.join_in.common_models;

import java.util.List;

public record PostGatewayRq(
        String groupIdentity,
        String content,
        byte[] imageBytes,
        String youtubeUrl,
        String pollQuestion,
        List<String> pollOptions
) {
}
