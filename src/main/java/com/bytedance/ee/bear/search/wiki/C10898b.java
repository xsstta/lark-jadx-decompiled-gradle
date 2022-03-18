package com.bytedance.ee.bear.search.wiki;

import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.bear.search.model.SearchResult;
import com.bytedance.ee.bear.search.p538c.C10818b;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.search.wiki.b */
public class C10898b extends C10818b {
    @Override // com.bytedance.ee.bear.search.p538c.C10818b
    /* renamed from: a */
    public SearchResult mo40914a(SearchResponse searchResponse) {
        return super.mo40914a(searchResponse);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.p538c.C10818b
    /* renamed from: a */
    public Document mo40913a(SearchResponse.Data.C10869Entity.ObjsBean objsBean, SearchResponse.Data.C10869Entity.UsersBean usersBean) {
        Document a = super.mo40913a(objsBean, usersBean);
        if (a != null) {
            if (objsBean.getWiki_infos() == null || objsBean.getWiki_infos().isEmpty()) {
                C13479a.m54758a("WikiSearchResultParser", "objToDocument()...wikiInfo is null");
            } else {
                SearchResponse.Data.WikiInfo wikiInfo = objsBean.getWiki_infos().get(0);
                a.mo32467m(wikiInfo.getWiki_url());
                a.mo32451i(wikiInfo.getWiki_token());
                a.mo32433d(C8275a.f22377j.mo32555b());
                a.mo32458k(objsBean.getType());
            }
        }
        return a;
    }
}
