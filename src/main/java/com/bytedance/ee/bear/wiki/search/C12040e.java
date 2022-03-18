package com.bytedance.ee.bear.wiki.search;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.wiki.search.WikiSearchPuller;
import com.bytedance.ee.log.C13479a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.wiki.search.e */
public class C12040e extends AbstractC1142af {
    private WikiSearchPuller.WikiSearchParams mWikiSearchParams;
    private WikiSearchPuller mWikiSearchPuller;

    public LiveData<List<C12033c>> getWikiTreeSearchResult() {
        return this.mWikiSearchPuller.mo45982a();
    }

    public void cancelSearch() {
        C13479a.m54764b("WikiSearchTAG", "cancel search...");
        this.mWikiSearchPuller.mo45985b();
    }

    public void loadNextPage() {
        C13479a.m54764b("WikiSearchTAG", "load next page");
        this.mWikiSearchParams.offset += this.mWikiSearchParams.count;
        this.mWikiSearchPuller.mo45984a(this.mWikiSearchParams);
    }

    public C12040e(WikiSearchPuller wikiSearchPuller) {
        this.mWikiSearchPuller = wikiSearchPuller;
    }

    public void wikiSearch(String str, String str2, int i, int i2) {
        if (str2 == null || str == null) {
            C13479a.m54758a("WikiSearchTAG", "spaceId == null");
            return;
        }
        WikiSearchPuller.WikiSearchParams wikiSearchParams = new WikiSearchPuller.WikiSearchParams();
        this.mWikiSearchParams = wikiSearchParams;
        wikiSearchParams.query = str;
        this.mWikiSearchParams.space_id = str2;
        this.mWikiSearchParams.offset = 0;
        this.mWikiSearchParams.count = 20;
        this.mWikiSearchParams.search_field = "0";
        this.mWikiSearchParams.search_type = i;
        this.mWikiSearchParams.need_main_path = i2;
        this.mWikiSearchPuller.mo45984a(this.mWikiSearchParams);
    }
}
