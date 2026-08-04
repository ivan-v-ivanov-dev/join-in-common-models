package com.join_in.common_models;

import java.util.ArrayList;
import java.util.List;

public record SearchHistoryRpSearchService(
        String identity,
        List<KeywordsHistoryRpSearchService> keywordsHistoryEntries
) {
    public SearchHistoryRpSearchService {
        keywordsHistoryEntries = keywordsHistoryEntries == null
                ? new ArrayList<>()
                : new ArrayList<>(keywordsHistoryEntries);
    }

    public SearchHistoryRpSearchService(
            String identity,
            KeywordsHistoryRpSearchService... entries
    ) {
        this(identity, List.of(entries));
    }
}
