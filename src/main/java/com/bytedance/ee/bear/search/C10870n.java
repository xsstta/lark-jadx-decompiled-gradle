package com.bytedance.ee.bear.search;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.list.cache.C8175b;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.search.C10841k;
import com.bytedance.ee.bear.search.model.SearchHistoryResponse;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.bear.search.model.SearchResult;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.search.n */
public class C10870n extends AbstractC1142af {
    private String mResultType;
    private final C1177w<String> mSearchKeyword = new C1177w<>();
    private final C10841k mSearchRepository;
    private final LiveData<SearchResult> mSearchResultList;
    private long mSearchStartTime;

    public String getResultType() {
        return this.mResultType;
    }

    public C1177w<String> getSearchKeyword() {
        return this.mSearchKeyword;
    }

    public LiveData<SearchResult> getSearchResultList() {
        return this.mSearchResultList;
    }

    public long getSearchStartTime() {
        return this.mSearchStartTime;
    }

    public LiveData<List<Document>> getFolderListData() {
        return this.mSearchRepository.mo40970e();
    }

    public LiveData<SearchHistoryResponse> getHistoryData() {
        return this.mSearchRepository.mo40960a();
    }

    public String getRequestId() {
        return this.mSearchRepository.mo40971f();
    }

    public LiveData<List<SearchResponse.Data.SpaceData>> getSearchWikiSpaceResult() {
        return this.mSearchRepository.mo40969d();
    }

    public void setResultType(String str) {
        this.mResultType = str;
    }

    public void setSearchStartTime(long j) {
        this.mSearchStartTime = j;
    }

    public void deleteSearchHistory(NetService.C5076e eVar) {
        this.mSearchRepository.mo40965b(eVar);
    }

    public void getSearchHistory(NetService.C5076e eVar) {
        this.mSearchRepository.mo40963a(eVar);
    }

    public AbstractC68307f<List<C8175b>> queryListCacheStatus(Set<String> set) {
        return this.mSearchRepository.mo40961a(set);
    }

    public void saveSearchHistory(SearchRecord searchRecord) {
        this.mSearchRepository.mo40964a(searchRecord);
    }

    public void searchWikiSpace(String str) {
        this.mSearchRepository.mo40968c(str);
    }

    public void searchFromCache(String str) {
        this.mSearchStartTime = System.currentTimeMillis();
        this.mResultType = "local";
        this.mSearchRepository.mo40966b(str);
    }

    public C10870n(C10841k kVar) {
        this.mSearchRepository = kVar;
        this.mSearchResultList = kVar.mo40967c();
    }

    public AbstractC68307f<Boolean> queryListCacheStatus(List<Document> list) {
        HashSet hashSet = new HashSet();
        for (Document document : list) {
            if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20316a(document.mo32483t())) {
                hashSet.add(document.mo32472o());
            }
        }
        C13479a.m54764b("SearchViewModel", "objTokens size = " + hashSet.size());
        if (hashSet.isEmpty()) {
            return AbstractC68307f.m265083a((Object) false).mo237985a(C11678b.m48481e());
        }
        return this.mSearchRepository.mo40961a(hashSet).mo238020d(new Function(list) {
            /* class com.bytedance.ee.bear.search.$$Lambda$n$maN28PwQGedfVVvVLY6I24Um72s */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C10870n.lambda$queryListCacheStatus$0(this.f$0, (List) obj);
            }
        });
    }

    public void search(int i, C10841k.C10844a aVar) {
        this.mSearchStartTime = System.currentTimeMillis();
        this.mResultType = "server";
        this.mSearchRepository.mo40962a(i, aVar);
    }

    static /* synthetic */ Boolean lambda$queryListCacheStatus$0(List list, List list2) throws Exception {
        boolean z = false;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        C13479a.m54764b("SearchViewModel", "cached size = " + list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C8175b bVar = (C8175b) it.next();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Document document = (Document) it2.next();
                if (TextUtils.equals(document.mo32472o(), bVar.mo31677a())) {
                    document.mo32431b(true);
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public void handleShareClick(FragmentActivity fragmentActivity, Document document, AccountService.Account account) {
        document.mo32443g(C10868m.m45142a(fragmentActivity, document));
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31493a(fragmentActivity, ar.m20936a(), document, account, "search", "", "left_slide");
    }

    static /* synthetic */ void lambda$preloadDocs$4(LinearLayoutManager linearLayoutManager, List list, String str) throws Exception {
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.size() > 0) {
            if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
                findFirstVisibleItemPosition = 0;
                findLastVisibleItemPosition = Math.min(8, arrayList.size() - 1);
            }
            C13479a.m54772d("SearchViewModel", "preloadDocs firstPos: " + findFirstVisibleItemPosition + "    lastPos: " + findLastVisibleItemPosition);
            ArrayList arrayList2 = new ArrayList();
            while (findFirstVisibleItemPosition <= findLastVisibleItemPosition && findFirstVisibleItemPosition < arrayList.size()) {
                Document document = (Document) arrayList.get(findFirstVisibleItemPosition);
                if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20316a(document.mo32483t())) {
                    arrayList2.add(new OfflineDoc(document.mo32472o(), document.mo32481s(), document.mo32483t(), "tab_search"));
                }
                findFirstVisibleItemPosition++;
            }
            if (arrayList2.size() > 0) {
                ar.m20936a().mo41508c(AbstractC5094ag.class).mo238020d(new Function(arrayList2) {
                    /* class com.bytedance.ee.bear.search.$$Lambda$n$deefFpLwZFnQ8LBFCLzEJS0LA6A */
                    public final /* synthetic */ List f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return ((AbstractC5094ag) obj).preloadDocs(this.f$0);
                    }
                }).mo238001b($$Lambda$n$jtkNtMCkMi94nk20ZiYSUylke5w.INSTANCE, $$Lambda$n$_Os9Z2574V3qJvrhN4nF07InUwo.INSTANCE);
            }
        }
    }

    public void preloadDocs(C10917c cVar, LinearLayoutManager linearLayoutManager, List<Document> list, boolean z) {
        if (z && cVar != null) {
            AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238001b(new Consumer(list) {
                /* class com.bytedance.ee.bear.search.$$Lambda$n$qEMcglVg1JVTSeNynOdFnZc8ZgA */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C10870n.lambda$preloadDocs$4(LinearLayoutManager.this, this.f$1, (String) obj);
                }
            }, $$Lambda$n$AFY4oPbEqMVZJBonwOxK1DRFpC0.INSTANCE);
        }
    }
}
