package com.ss.android.lark.search.impl.func.chatinside.detail.p2612c;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.lark.pb.search.v1.LocalIntegrationSearchRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.entity.C53385a;
import com.ss.android.lark.search.impl.func.chatinside.cache.ChatInsideFilterCacheBean;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.C53458a;
import com.ss.android.lark.search.impl.func.chatinside.entity.ChatInsideFilterData;
import com.ss.android.lark.search.impl.func.chatinside.entity.ChatInsideSearchResponse;
import com.ss.android.lark.search.impl.func.chatinside.p2607a.C53408c;
import com.ss.android.lark.search.impl.func.chatinside.p2608b.C53411a;
import com.ss.android.lark.search.impl.p2592b.p2595c.C53345b;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import com.ss.android.lark.searchcommon.p2634b.C53886b;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.c.a */
public class C53458a extends AbstractC53443a implements AbstractC53471f {

    /* renamed from: i */
    private NetSearchRequest.Filter.C53951a f132089i;

    /* renamed from: j */
    private final List<String> f132090j = new ArrayList();

    /* renamed from: k */
    private final List<String> f132091k = new ArrayList();

    /* renamed from: l */
    private Pair<Long, Long> f132092l;

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: b */
    public void mo182461b(C53385a aVar, IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z) {
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: n */
    public String mo182463n() {
        return "messages";
    }

    /* renamed from: r */
    public List<String> mo182561r() {
        return this.f132090j;
    }

    /* renamed from: s */
    public List<String> mo182562s() {
        return this.f132091k;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: a */
    public void mo182512a(List<SearchBaseInfo> list, boolean z) {
        if (!TextUtils.isEmpty(mo182515b()) || !mo182526l()) {
            C53408c.m206821a().mo182439a(mo182514b(list, z), m207010v());
        }
    }

    /* renamed from: u */
    private NetSearchRequest.Filter m207009u() {
        return this.f132089i.mo184522a();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: l */
    public boolean mo182526l() {
        if (!CollectionUtils.isEmpty(this.f132090j) || this.f132092l != null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: q */
    public void mo182464q() {
        m207008a(C26279i.m95159b(), "0");
    }

    /* renamed from: v */
    private ChatInsideFilterData m207010v() {
        ChatInsideFilterData aVar = new ChatInsideFilterData();
        aVar.mo182738a(mo182562s());
        aVar.mo182737a(m207009u());
        return aVar;
    }

    /* renamed from: t */
    public void mo182563t() {
        mo182518d();
        mo182464q();
        this.f132092l = null;
        this.f132090j.clear();
        this.f132091k.clear();
        mo182459a();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: a */
    public void mo182459a() {
        this.f132089i = NetSearchRequest.Filter.newBuilder().mo184520a(mo182524j()).mo184515a(20);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: o */
    public String mo182528o() {
        StringBuilder sb = new StringBuilder();
        if (!CollectionUtils.isEmpty(this.f132090j)) {
            sb.append("fromIds,");
        }
        Pair<Long, Long> pair = this.f132092l;
        if (pair != null) {
            if (((Long) pair.first).longValue() != 0) {
                sb.append("startTime,");
            }
            if (((Long) this.f132092l.second).longValue() != 0) {
                sb.append("endTime,");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private long m207007a(Date date) {
        if (date == null) {
            return 0;
        }
        return date.getTime() / 1000;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53540b
    /* renamed from: b */
    public void mo182560b(List<String> list) {
        mo182518d();
        mo182464q();
        this.f132090j.clear();
        this.f132090j.addAll(list);
        this.f132089i.mo184529d(list);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: c */
    public SearchContext mo182462c(String str) {
        Date date;
        SearchContext c = super.mo182462c(str);
        NetSearchRequest.Filter u = m207009u();
        c.mo184402b(u.messageCreatorIds);
        c.mo184401b(u.lastMessageId);
        c.mo184389a(u.lastCreateTime);
        c.mo184398b(u.count);
        Date date2 = null;
        if (u.messageStartTime != 0) {
            date = new Date(u.messageStartTime * 1000);
        } else {
            date = null;
        }
        if (u.messageEndTime != 0) {
            date2 = new Date(u.messageEndTime * 1000);
        }
        if (!(date == null && date2 == null)) {
            c.mo184390a(new Pair<>(date, date2));
        }
        return c;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53540b
    /* renamed from: a */
    public void mo182555a(ChatInsideFilterCacheBean aVar) {
        mo182558a(aVar.mo182426b());
        mo182560b(aVar.mo182422a().messageCreatorIds);
        if (aVar.mo182422a().messageEndTime != 0) {
            Pair<Long, Long> create = Pair.create(Long.valueOf(aVar.mo182422a().messageStartTime), Long.valueOf(aVar.mo182422a().messageEndTime));
            this.f132092l = create;
            this.f132089i.mo184516a(((Long) create.first).longValue()).mo184523b(((Long) this.f132092l.second).longValue());
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53540b
    /* renamed from: a */
    public void mo182558a(List<String> list) {
        this.f132091k.clear();
        this.f132091k.addAll(list);
    }

    /* renamed from: a */
    public void mo182556a(SearchResponse searchResponse, IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback) {
        mo182559b(searchResponse, iGetDataCallback);
    }

    public C53458a(String str, int i) {
        super(str, i);
    }

    /* renamed from: a */
    private void m207008a(long j, String str) {
        this.f132089i.mo184526c(j).mo184519a(str);
    }

    /* renamed from: a */
    public void mo182554a(C53385a aVar, final IGetDataCallback<SearchResponse> iGetDataCallback) {
        this.f132059d.mo181884a(aVar.f131929a, aVar.f131932d, new LocalIntegrationSearchRequest.FilterParam.C18835a().mo64676a(mo182524j()).build(), aVar.f131930b, aVar.f131931c, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<SearchResponse>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.C53458a.C534622 */

            /* renamed from: a */
            public void onSuccess(SearchResponse searchResponse) {
                iGetDataCallback.onSuccess(searchResponse);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        }));
    }

    /* renamed from: b */
    public void mo182559b(SearchResponse searchResponse, IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback) {
        mo182506a(searchResponse);
        Log.m165379d("LarkSearch.Search.ChatInsideSearchMsgModel", "has more: " + searchResponse.isHasMore());
        iGetDataCallback.onSuccess(C53411a.m206839a(searchResponse));
        if (!searchResponse.isEmpty()) {
            List<SearchBaseInfo> infoList = searchResponse.getInfoList();
            SearchBaseInfo searchBaseInfo = infoList.get(infoList.size() - 1);
            if (searchBaseInfo instanceof SearchMessageInfo) {
                SearchMessageInfo searchMessageInfo = (SearchMessageInfo) searchBaseInfo;
                m207008a(searchMessageInfo.getUpdateTime(), searchMessageInfo.getId());
                Log.m165379d("LarkSearch.Search.ChatInsideSearchMsgModel", "last msg info, id: " + searchMessageInfo.getId() + " update time: " + searchMessageInfo.getUpdateTime());
            }
        }
    }

    /* renamed from: a */
    public void mo182557a(Date date, Date date2) {
        mo182518d();
        mo182464q();
        Pair<Long, Long> create = Pair.create(Long.valueOf(m207007a(date)), Long.valueOf(m207007a(date2)));
        this.f132092l = create;
        this.f132089i.mo184516a(((Long) create.first).longValue()).mo184523b(((Long) this.f132092l.second).longValue());
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: a */
    public void mo182460a(final C53385a aVar, final IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z) {
        C534591 r0 = new IGetDataCallback<SearchResponse>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.C53458a.C534591 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("LarkSearch.Search.ChatInsideSearchMsgModel", "try search local because on error.");
                C53886b.m208807e(aVar.f131929a);
                C53458a.this.mo182554a(aVar, new IGetDataCallback<SearchResponse>() {
                    /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.C53458a.C534591.C534612 */

                    /* renamed from: a */
                    public void onSuccess(SearchResponse searchResponse) {
                        C53458a.this.mo182556a(searchResponse, iGetDataCallback);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C53886b.m208808f(aVar.f131929a);
                        iGetDataCallback.onError(errorResult);
                    }
                });
            }

            /* renamed from: a */
            public void onSuccess(SearchResponse searchResponse) {
                if (C53345b.m206466a(searchResponse.isEmpty(), aVar.f131929a, aVar.f131930b)) {
                    Log.m165389i("LarkSearch.Search.ChatInsideSearchMsgModel", "try search local because result is invalid.");
                    C53886b.m208806d(aVar.f131929a);
                    C53458a.this.mo182554a(aVar, new IGetDataCallback<SearchResponse>() {
                        /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.C53458a.C534591.C534601 */

                        /* renamed from: a */
                        public void onSuccess(SearchResponse searchResponse) {
                            C53458a.this.mo182556a(searchResponse, iGetDataCallback);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            C53886b.m208808f(aVar.f131929a);
                            iGetDataCallback.onError(errorResult);
                        }
                    });
                    return;
                }
                UICallbackExecutor.post(new Runnable(searchResponse, iGetDataCallback) {
                    /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.$$Lambda$a$1$sbKg6GrcLGMYwaBtrHZLK8CoBPM */
                    public final /* synthetic */ SearchResponse f$1;
                    public final /* synthetic */ IGetDataCallback f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C53458a.C534591.lambda$sbKg6GrcLGMYwaBtrHZLK8CoBPM(C53458a.C534591.this, this.f$1, this.f$2);
                    }
                });
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m207030a(SearchResponse searchResponse, IGetDataCallback iGetDataCallback) {
                C53458a.this.mo182559b(searchResponse, iGetDataCallback);
            }
        };
        if (z) {
            this.f132062g.mo181874b(aVar.f131932d, mo182462c(aVar.f131929a), r0);
        } else {
            this.f132062g.mo181873a(aVar.f131932d, mo182462c(aVar.f131929a), r0);
        }
    }
}
