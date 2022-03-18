package com.huawei.hms.site.api;

import com.huawei.hms.site.api.model.SearchStatus;

public interface SearchResultListener<T> {
    void onSearchError(SearchStatus searchStatus);

    void onSearchResult(T t);
}
