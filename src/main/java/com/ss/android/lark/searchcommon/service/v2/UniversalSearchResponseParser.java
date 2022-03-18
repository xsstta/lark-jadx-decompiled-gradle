package com.ss.android.lark.searchcommon.service.v2;

import android.text.TextUtils;
import com.bytedance.lark.pb.search.sidecard.ServiceCard;
import com.bytedance.lark.pb.search.v2.SearchCommonResponseHeader;
import com.bytedance.lark.pb.search.v2.SearchEntityType;
import com.bytedance.lark.pb.search.v2.SearchResult;
import com.bytedance.lark.pb.search.v2.SuggestionInfo;
import com.bytedance.lark.pb.search.v2.UniversalSearchResponse;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchServiceCardInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/UniversalSearchResponseParser;", "", "()V", "parse", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "requestId", "", "session", "seqId", "", SearchIntents.EXTRA_QUERY, "scene", "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "sdkResponse", "Lcom/bytedance/lark/pb/search/v2/UniversalSearchResponse;", "parseFromResults", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "results", "Lcom/bytedance/lark/pb/search/v2/SearchResult;", "parseFromSdkResponse", "", "response", "parseFromSuggestionInfo", "suggestionInfo", "Lcom/bytedance/lark/pb/search/v2/SuggestionInfo;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.g */
public final class UniversalSearchResponseParser {

    /* renamed from: a */
    public static final UniversalSearchResponseParser f133248a = new UniversalSearchResponseParser();

    private UniversalSearchResponseParser() {
    }

    /* renamed from: a */
    private final List<SearchBaseInfo> m209016a(List<SearchResult> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            MetaParser bVar = MetaParser.f133213a;
            SearchEntityType searchEntityType = t.type;
            Intrinsics.checkExpressionValueIsNotNull(searchEntityType, "it.type");
            SearchBaseInfo a = bVar.mo184337a(searchEntityType, t);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final List<SearchBaseInfo> m209015a(SuggestionInfo suggestionInfo) {
        SearchServiceCardInfo searchServiceCardInfo;
        List<ServiceCard> list = suggestionInfo.service_cards;
        Intrinsics.checkExpressionValueIsNotNull(list, "suggestionInfo.service_cards");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!TextUtils.isEmpty(t.render_content)) {
                String str = t.id;
                Intrinsics.checkExpressionValueIsNotNull(str, "serviceCard.id");
                String str2 = t.render_content;
                Intrinsics.checkExpressionValueIsNotNull(str2, "serviceCard.render_content");
                searchServiceCardInfo = new SearchServiceCardInfo(str, str2);
            } else {
                searchServiceCardInfo = null;
            }
            if (searchServiceCardInfo != null) {
                arrayList.add(searchServiceCardInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m209017a(SearchResponse searchResponse, UniversalSearchResponse universalSearchResponse) {
        Boolean bool = universalSearchResponse.header.has_more;
        Intrinsics.checkExpressionValueIsNotNull(bool, "sdkResponse.header.has_more");
        searchResponse.setHasMore(bool.booleanValue());
        Integer num = universalSearchResponse.header.total;
        Intrinsics.checkExpressionValueIsNotNull(num, "sdkResponse.header.total");
        searchResponse.setTotal(num.intValue());
        UniversalSearchResponseParser gVar = f133248a;
        List<SearchResult> list = universalSearchResponse.results;
        Intrinsics.checkExpressionValueIsNotNull(list, "sdkResponse.results");
        searchResponse.setInfoList(CollectionsKt.toMutableList((Collection) gVar.m209016a(list)));
        SuggestionInfo suggestionInfo = universalSearchResponse.suggestion_info;
        if (suggestionInfo != null) {
            List<SearchBaseInfo> suggestionList = searchResponse.getSuggestionList();
            Intrinsics.checkExpressionValueIsNotNull(suggestionInfo, "suggestionInfo");
            suggestionList.addAll(gVar.m209015a(suggestionInfo));
            for (SearchBaseInfo searchBaseInfo : searchResponse.getSuggestionList()) {
                Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo, "info");
                searchBaseInfo.setImprId(searchResponse.getImprId());
                searchBaseInfo.setSession(universalSearchResponse.header.search_session);
                searchBaseInfo.setRequestId(searchResponse.getRequestId());
                searchBaseInfo.setScene(searchResponse.getScene());
            }
        }
        searchResponse.setSession(universalSearchResponse.header.search_session);
        Integer num2 = universalSearchResponse.header.session_seq_id;
        Intrinsics.checkExpressionValueIsNotNull(num2, "sdkResponse.header.session_seq_id");
        searchResponse.setSeqId(num2.intValue());
        searchResponse.setPageToken(universalSearchResponse.header.pagination_token);
        searchResponse.setAbnormalNotice(universalSearchResponse.header.invoke_abnormal_notice);
        if (searchResponse.getAbnormalNotice() == SearchCommonResponseHeader.InvokeAbnormalNotice.VERSION_SWITCH) {
            searchResponse.setHasMore(false);
        }
        for (SearchBaseInfo searchBaseInfo2 : searchResponse.getInfoList()) {
            Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo2, "info");
            searchBaseInfo2.setImprId(searchResponse.getImprId());
            searchBaseInfo2.setSession(searchResponse.getSession());
            searchBaseInfo2.setRequestId(searchResponse.getRequestId());
            searchBaseInfo2.setScene(searchResponse.getScene());
        }
    }

    /* renamed from: a */
    public final SearchResponse mo184359a(String str, String str2, int i, String str3, Scene.Type type, UniversalSearchResponse universalSearchResponse) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        Intrinsics.checkParameterIsNotNull(str3, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(type, "scene");
        Intrinsics.checkParameterIsNotNull(universalSearchResponse, "sdkResponse");
        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setQuery(str3);
        searchResponse.setRequestId(str);
        searchResponse.setImprId(str2 + '_' + i);
        searchResponse.setScene(type);
        searchResponse.setFrom(1);
        f133248a.m209017a(searchResponse, universalSearchResponse);
        return searchResponse;
    }
}
