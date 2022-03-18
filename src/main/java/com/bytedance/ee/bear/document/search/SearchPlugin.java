package com.bytedance.ee.bear.document.search;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.search.C6106b;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import java.util.Map;

public class SearchPlugin extends DocumentPlugin {
    public AbstractC7947h clearSearchDelegate;
    protected C6106b searchViewModel;
    public AbstractC7947h switchSearchDelegate;
    public AbstractC7947h updateSearchDelegate;

    public Class<? extends C6106b> getModelClass() {
        return C6106b.class;
    }

    public LiveData<Boolean> getActive() {
        return this.searchViewModel.getActive();
    }

    /* access modifiers changed from: package-private */
    public void startSearch() {
        this.searchViewModel.setActive(true);
    }

    /* access modifiers changed from: protected */
    public void ensureSearchFragment() {
        getUIContainer().mo19589a(this, instantiateFragment(View$OnClickListenerC6104a.class));
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.ee.bear.document.search.SearchPlugin$d */
    public class C6100d implements C6106b.AbstractC6108b {
        @Override // com.bytedance.ee.bear.document.search.C6106b.AbstractC6108b
        /* renamed from: a */
        public void mo24618a() {
            if (SearchPlugin.this.clearSearchDelegate != null) {
                SearchPlugin.this.clearSearchDelegate.mo17188a(new JSONObject());
            }
        }

        protected C6100d() {
        }

        @Override // com.bytedance.ee.bear.document.search.C6106b.AbstractC6108b
        /* renamed from: a */
        public void mo24619a(int i) {
            if (SearchPlugin.this.switchSearchDelegate != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("index", (Object) Integer.valueOf(i));
                SearchPlugin.this.switchSearchDelegate.mo17188a(jSONObject);
            }
        }

        @Override // com.bytedance.ee.bear.document.search.C6106b.AbstractC6108b
        /* renamed from: a */
        public void mo24620a(String str, boolean z) {
            if (SearchPlugin.this.updateSearchDelegate != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("content", (Object) str);
                jSONObject.put("inKeyboard", (Object) Boolean.valueOf(z));
                SearchPlugin.this.updateSearchDelegate.mo17188a(jSONObject);
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.search.SearchPlugin$a */
    private class C6097a implements AbstractC7945d<String> {
        private C6097a() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            SearchPlugin.this.clearSearchDelegate = hVar;
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.search.SearchPlugin$b */
    private class C6098b implements AbstractC7945d<String> {
        private C6098b() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            SearchPlugin.this.startSearch();
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.search.SearchPlugin$c */
    private class C6099c implements AbstractC7945d<String> {
        private C6099c() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            SearchPlugin.this.searchViewModel.setActive(false);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.search.SearchPlugin$e */
    private class C6101e implements AbstractC7945d<String> {
        private C6101e() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            SearchPlugin.this.updateSearchDelegate = hVar;
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.search.SearchPlugin$f */
    private class C6102f implements AbstractC7945d<String> {
        private C6102f() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            SearchPlugin.this.switchSearchDelegate = hVar;
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.search.SearchPlugin$g */
    private class C6103g implements AbstractC7945d<SearchResult> {
        private C6103g() {
        }

        /* renamed from: a */
        public void handle(SearchResult searchResult, AbstractC7947h hVar) {
            SearchPlugin.this.searchViewModel.updateSearchResult(searchResult.getCurrentIndex(), searchResult.getTotalNum());
        }
    }

    public /* synthetic */ void lambda$onAttachToHost$0$SearchPlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            ensureSearchFragment();
        } else {
            getUIContainer().mo19597c(this);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.content.enterSearch", new C6098b());
        map.put("biz.content.search", new C6101e());
        map.put("biz.content.clearSearchResult", new C6097a());
        map.put("biz.content.switchSearchResult", new C6102f());
        map.put("biz.content.updateSearchResult", new C6103g());
        map.put("biz.content.exitSearch", new C6099c());
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        C6106b bVar = (C6106b) aj.m5366a(getActivity()).mo6005a(getModelClass());
        this.searchViewModel = bVar;
        bVar.getActive().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.search.$$Lambda$SearchPlugin$jusxnoQpLcpypM_zx_zm1cbqsw */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SearchPlugin.this.lambda$onAttachToHost$0$SearchPlugin((Boolean) obj);
            }
        });
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39928b(this.searchViewModel);
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.searchViewModel.onDetachFromUI();
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        this.searchViewModel.onAttachToUI(getActivity(), getWeb());
        sVar.mo24599n().registerEditPanel(getLifecycleOwner(), this.searchViewModel);
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39924a(this.searchViewModel);
        this.searchViewModel.setDelegate(new C6100d());
    }
}
