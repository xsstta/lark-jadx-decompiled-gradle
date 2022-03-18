package com.huawei.hms.site.api;

import com.huawei.hms.site.api.model.DetailSearchRequest;
import com.huawei.hms.site.api.model.DetailSearchResponse;
import com.huawei.hms.site.api.model.NearbySearchRequest;
import com.huawei.hms.site.api.model.NearbySearchResponse;
import com.huawei.hms.site.api.model.QueryAutocompleteRequest;
import com.huawei.hms.site.api.model.QueryAutocompleteResponse;
import com.huawei.hms.site.api.model.QuerySuggestionRequest;
import com.huawei.hms.site.api.model.QuerySuggestionResponse;
import com.huawei.hms.site.api.model.TextSearchRequest;
import com.huawei.hms.site.api.model.TextSearchResponse;

public interface SearchService {
    void detailSearch(DetailSearchRequest detailSearchRequest, SearchResultListener<DetailSearchResponse> searchResultListener);

    void nearbySearch(NearbySearchRequest nearbySearchRequest, SearchResultListener<NearbySearchResponse> searchResultListener);

    void queryAutocomplete(QueryAutocompleteRequest queryAutocompleteRequest, SearchResultListener<QueryAutocompleteResponse> searchResultListener);

    void querySuggestion(QuerySuggestionRequest querySuggestionRequest, SearchResultListener<QuerySuggestionResponse> searchResultListener);

    void textSearch(TextSearchRequest textSearchRequest, SearchResultListener<TextSearchResponse> searchResultListener);
}
