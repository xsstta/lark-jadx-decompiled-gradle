package com.bytedance.ee.bear.search.p538c;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.search.model.SearchHistoryResponse;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.search.c.a */
public class C10817a implements NetService.AbstractC5074c<SearchHistoryResponse> {
    /* renamed from: a */
    public SearchHistoryResponse parse(String str) {
        SearchHistoryResponse searchHistoryResponse;
        try {
            searchHistoryResponse = (SearchHistoryResponse) JSON.parseObject(str, SearchHistoryResponse.class);
        } catch (Exception e) {
            C13479a.m54758a("SearchHistoryParser", "parse() error:" + e);
            searchHistoryResponse = null;
        }
        if (searchHistoryResponse != null) {
            return searchHistoryResponse;
        }
        SearchHistoryResponse searchHistoryResponse2 = new SearchHistoryResponse();
        C13479a.m54758a("SearchHistoryParser", "parse() without exception but searchHistoryResponse == null");
        return searchHistoryResponse2;
    }
}
