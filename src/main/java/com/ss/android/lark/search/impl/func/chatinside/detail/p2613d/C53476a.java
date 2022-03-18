package com.ss.android.lark.search.impl.func.chatinside.detail.p2613d;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.constant.SearchConstants;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.C53339b;
import com.ss.android.lark.search.impl.entity.C53385a;
import com.ss.android.lark.search.impl.func.chatinside.cache.ChatInsideFilterCacheBean;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.C53476a;
import com.ss.android.lark.search.impl.func.chatinside.entity.ChatInsideFilterData;
import com.ss.android.lark.search.impl.func.chatinside.entity.ChatInsideSearchResponse;
import com.ss.android.lark.search.impl.func.chatinside.p2607a.C53408c;
import com.ss.android.lark.search.impl.func.chatinside.p2608b.C53411a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.d.a */
public class C53476a extends AbstractC53443a implements AbstractC53484f {

    /* renamed from: i */
    private final List<String> f132120i = new ArrayList();

    /* renamed from: j */
    private final List<String> f132121j = new ArrayList();

    /* renamed from: k */
    private final List<String> f132122k = new ArrayList();

    /* renamed from: l */
    private SearchConstants.SpaceType f132123l;

    /* renamed from: m */
    private NetSearchRequest.Filter.C53951a f132124m;

    /* renamed from: n */
    private final ISearchModuleDependency f132125n = C53258a.m205939a();

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: n */
    public String mo182463n() {
        return "docs";
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: q */
    public void mo182464q() {
    }

    /* renamed from: r */
    public List<String> mo182561r() {
        return this.f132120i;
    }

    /* renamed from: t */
    public List<String> mo182597t() {
        return this.f132122k;
    }

    /* renamed from: u */
    private NetSearchRequest.Filter m207083u() {
        return this.f132124m.mo184522a();
    }

    /* renamed from: w */
    private ChatInsideFilterData m207085w() {
        ChatInsideFilterData aVar = new ChatInsideFilterData();
        aVar.mo182738a(mo182597t());
        aVar.mo182737a(m207083u());
        aVar.mo182736a(this.f132123l);
        return aVar;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: l */
    public boolean mo182526l() {
        if (!CollectionUtils.isEmpty(this.f132120i) || !CollectionUtils.isEmpty(this.f132121j)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public void mo182596s() {
        mo182518d();
        mo182464q();
        this.f132121j.clear();
        this.f132120i.clear();
        this.f132122k.clear();
        this.f132123l = null;
        mo182459a();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: a */
    public void mo182459a() {
        this.f132124m = NetSearchRequest.Filter.newBuilder().mo184520a(mo182524j()).mo184515a(20);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: o */
    public String mo182528o() {
        StringBuilder sb = new StringBuilder();
        if (!CollectionUtils.isEmpty(this.f132120i)) {
            sb.append("docsAuthor,");
        }
        if (!CollectionUtils.isEmpty(this.f132121j)) {
            sb.append("docTypes,");
        }
        return sb.toString();
    }

    /* renamed from: v */
    private List<String> m207084v() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchConstants.SpaceType.DOC.getName());
        arrayList.add(SearchConstants.SpaceType.SHEET.getName());
        if (C53339b.m206452l()) {
            arrayList.add(SearchConstants.SpaceType.BITABLE.getName());
        }
        arrayList.add(SearchConstants.SpaceType.FILE.getName());
        if (C53339b.m206451k()) {
            arrayList.add(SearchConstants.SpaceType.MINDNOTE.getName());
        }
        if (C53339b.m206450j()) {
            arrayList.add(SearchConstants.SpaceType.SLIDE.getName());
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53540b
    /* renamed from: a */
    public void mo182558a(List<String> list) {
        this.f132122k.clear();
        this.f132122k.addAll(list);
    }

    /* renamed from: b */
    private List<String> m207082b(SearchConstants.SpaceType spaceType) {
        if (spaceType == SearchConstants.SpaceType.ALL) {
            return m207084v();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(spaceType.getName());
        return arrayList;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53540b
    /* renamed from: b */
    public void mo182560b(List<String> list) {
        mo182518d();
        this.f132120i.clear();
        this.f132120i.addAll(list);
        this.f132124m.mo184530e(this.f132120i);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: c */
    public SearchContext mo182462c(String str) {
        SearchContext c = super.mo182462c(str);
        c.mo184391a(Scene.Type.SEARCH_DOCS_WIKI_IN_CHAT_SCENE);
        NetSearchRequest.Filter u = m207083u();
        c.mo184406c(u.docCreatorIds);
        ArrayList arrayList = new ArrayList();
        for (String str2 : u.docTypes) {
            arrayList.add(Doc.Type.fromValue(SearchConstants.SpaceType.nameOf(str2).getValue()));
        }
        c.mo184409d(arrayList);
        return c;
    }

    /* renamed from: a */
    public void mo182595a(SearchConstants.SpaceType spaceType) {
        mo182518d();
        this.f132121j.clear();
        this.f132121j.addAll(m207082b(spaceType));
        this.f132124m.mo184527c(this.f132121j);
        this.f132123l = spaceType;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53540b
    /* renamed from: a */
    public void mo182555a(ChatInsideFilterCacheBean aVar) {
        mo182558a(aVar.mo182426b());
        mo182560b(aVar.mo182422a().docCreatorIds);
        this.f132121j.clear();
        this.f132121j.addAll(aVar.mo182422a().docTypes);
        this.f132124m.mo184527c(this.f132121j);
        this.f132123l = aVar.mo182427c();
    }

    public C53476a(String str, int i) {
        super(str, i);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: a */
    public void mo182512a(List<SearchBaseInfo> list, boolean z) {
        if (!TextUtils.isEmpty(mo182515b()) || !mo182526l()) {
            C53408c.m206821a().mo182439a(mo182514b(list, z), m207085w());
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: a */
    public void mo182460a(C53385a aVar, IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z) {
        m207081a(aVar.f131929a, aVar.f131932d, iGetDataCallback, z);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: b */
    public void mo182461b(C53385a aVar, IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z) {
        m207081a(aVar.f131929a, aVar.f131932d, iGetDataCallback, z);
    }

    /* renamed from: a */
    private void m207081a(String str, String str2, final IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z) {
        C534771 r0 = new IGetDataCallback<SearchResponse>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.C53476a.C534771 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UICallbackExecutor.post(new Runnable(errorResult) {
                    /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.$$Lambda$a$1$qloGt_QsPIT4CX3UqFe7bKjIJ0 */
                    public final /* synthetic */ ErrorResult f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C53476a.C534771.m270947lambda$qloGt_QsPIT4CX3UqFe7bKjIJ0(IGetDataCallback.this, this.f$1);
                    }
                });
            }

            /* renamed from: a */
            public void onSuccess(SearchResponse searchResponse) {
                UICallbackExecutor.post(new Runnable(searchResponse, iGetDataCallback) {
                    /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.$$Lambda$a$1$wreTvsm9KCcLHAibnzBYbqjdQQ */
                    public final /* synthetic */ SearchResponse f$1;
                    public final /* synthetic */ IGetDataCallback f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C53476a.C534771.m270948lambda$wreTvsm9KCcLHAibnzBYbqjdQQ(C53476a.C534771.this, this.f$1, this.f$2);
                    }
                });
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m207103a(SearchResponse searchResponse, IGetDataCallback iGetDataCallback) {
                C53476a.this.mo182506a(searchResponse);
                iGetDataCallback.onSuccess(C53411a.m206839a(searchResponse));
            }
        };
        if (z) {
            this.f132062g.mo181874b(str2, mo182462c(str), r0);
        } else {
            this.f132062g.mo181873a(str2, mo182462c(str), r0);
        }
    }
}
