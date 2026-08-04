package com.join_in.common_models;

import java.time.LocalDateTime;

public record KeywordsHistoryRpSearchService(
        String keyword,
        LocalDateTime searchedAt
) {
}
