package com.bytedance.ee.bear.atfinder;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.atfinder.b */
public class C4266b extends AbstractC1142af {
    private AbstractC4271f mSearchDelegate;
    private Map<String, C1177w<AtFinderResult>> mSearchResultMap = new HashMap();

    public void setSearchDelegate(AbstractC4271f fVar) {
        this.mSearchDelegate = fVar;
    }

    public C1177w<AtFinderResult> getSearchResultList(String str) {
        if (this.mSearchResultMap.containsKey(str)) {
            return this.mSearchResultMap.get(str);
        }
        C1177w<AtFinderResult> wVar = new C1177w<>();
        this.mSearchResultMap.put(str, wVar);
        return wVar;
    }

    public void onSearchResult(String str, AtFinderResult atFinderResult) {
        getSearchResultList(str).mo5929b(atFinderResult);
    }

    public void search(String str, String str2, final String str3, int i, String str4) {
        if (this.mSearchDelegate == null) {
            C13479a.m54758a("AtFinderViewModel", "search(): SearchDelegate is null");
            return;
        }
        if (this.mSearchResultMap.get(str3) == null) {
            this.mSearchResultMap.put(str3, new C1177w<>());
        }
        this.mSearchDelegate.mo16667a(new MentionModel(str2, str, i, ""), str3, new AbstractC4272g() {
            /* class com.bytedance.ee.bear.atfinder.C4266b.C42671 */

            @Override // com.bytedance.ee.bear.atfinder.AbstractC4272g
            /* renamed from: a */
            public void mo16696a() {
            }

            @Override // com.bytedance.ee.bear.atfinder.AbstractC4272g
            /* renamed from: a */
            public void mo16697a(AtFinderResult atFinderResult) {
                C4266b.this.getSearchResultList(str3).mo5929b(atFinderResult);
            }
        });
    }
}
