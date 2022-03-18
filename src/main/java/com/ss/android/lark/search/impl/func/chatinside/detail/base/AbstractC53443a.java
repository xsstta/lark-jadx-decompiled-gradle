package com.ss.android.lark.search.impl.func.chatinside.detail.base;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.lark.pb.search.v2.SearchCommonResponseHeader;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.entity.C53385a;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d;
import com.ss.android.lark.search.impl.func.chatinside.entity.ChatInsideSearchData;
import com.ss.android.lark.search.impl.func.chatinside.entity.ChatInsideSearchResponse;
import com.ss.android.lark.search.impl.func.chatinside.p2607a.C53407b;
import com.ss.android.lark.search.impl.func.chatinside.p2607a.C53408c;
import com.ss.android.lark.search.impl.func.chatinside.statistics.ChatInsideSearchStatistics;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.impl.p2592b.p2595c.C53345b;
import com.ss.android.lark.search.p2584b.C53287b;
import com.ss.android.lark.search.service.compatible.SearchLifecycleObserver;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.reporter.SearchClickReporter;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.utils.SessionManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.base.a */
public abstract class AbstractC53443a extends BaseModel implements AbstractC53452d.AbstractC53453a {

    /* renamed from: a */
    public String f132056a;

    /* renamed from: b */
    public String f132057b;

    /* renamed from: c */
    protected AbstractC53452d.AbstractC53453a.AbstractC53454a f132058c;

    /* renamed from: d */
    protected C53287b f132059d;

    /* renamed from: e */
    protected int f132060e;

    /* renamed from: f */
    public final ChatInsideSearchStatistics f132061f;

    /* renamed from: g */
    protected ISearchLifecycleObserver f132062g = new SearchLifecycleObserver(true);

    /* renamed from: h */
    protected HashMap<String, Long> f132063h = new HashMap<>();

    /* renamed from: i */
    private final String f132064i;

    /* renamed from: j */
    private boolean f132065j;

    /* renamed from: k */
    private String f132066k = "";

    /* renamed from: l */
    private final List<SearchBaseInfo> f132067l = new ArrayList();

    /* renamed from: m */
    private final ISearchModuleDependency.AbstractC53327m f132068m;

    /* renamed from: n */
    private int f132069n = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo182459a();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo182526l() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo182527m() {
        return 20;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo182463n() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public String mo182528o() {
        return "";
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: b */
    public String mo182515b() {
        return this.f132056a;
    }

    /* renamed from: e */
    public boolean mo182519e() {
        return this.f132065j;
    }

    /* renamed from: f */
    public String mo182520f() {
        return this.f132066k;
    }

    /* renamed from: g */
    public String mo182521g() {
        return this.f132064i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo182529p() {
        return this.f132069n;
    }

    /* renamed from: a */
    public void mo182513a(boolean z) {
        this.f132065j = z;
    }

    /* renamed from: a */
    public void mo182512a(List<SearchBaseInfo> list, boolean z) {
        if (!TextUtils.isEmpty(this.f132056a)) {
            C53408c.m206821a().mo182438a(mo182514b(list, z));
        }
    }

    /* renamed from: k */
    public boolean mo182525k() {
        return mo182526l();
    }

    /* renamed from: c */
    public void mo182517c() {
        Log.m165379d("LarkSearch.Search.BaseChatInsideSearchModel", "reset mRequestId.");
        this.f132057b = "";
    }

    /* renamed from: d */
    public void mo182518d() {
        this.f132067l.clear();
        mo182513a(false);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: h */
    public C53407b mo182522h() {
        return C53408c.m206821a().mo182441b(this.f132064i, this.f132060e);
    }

    /* renamed from: i */
    public void mo182523i() {
        C53408c.m206821a().mo182440a(this.f132064i, this.f132060e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public List<String> mo182524j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f132064i);
        return arrayList;
    }

    /* renamed from: r */
    private C53385a mo182561r() {
        return ((C53385a.C53387b) ((C53385a.C53387b) ((C53385a.C53387b) ((C53385a.C53387b) C53385a.m206660a().mo182093a(this.f132056a)).mo182095b(this.f132057b)).mo182091a(this.f132067l.size())).mo182094b(this.f132067l.size() + mo182527m())).mo182097b();
    }

    /* renamed from: a */
    public void mo182504a(AbstractC53452d.AbstractC53453a.AbstractC53454a aVar) {
        this.f132058c = aVar;
    }

    /* renamed from: b */
    public void mo182516b(String str) {
        this.f132066k = str;
    }

    /* renamed from: a */
    public void mo182506a(SearchResponse searchResponse) {
        mo182513a(searchResponse.isHasMore());
        mo182516b(searchResponse.getPageToken());
    }

    /* renamed from: a */
    public void mo182507a(String str) {
        this.f132056a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public SearchContext mo182462c(String str) {
        SearchContext searchContext = new SearchContext();
        searchContext.mo184394a(str);
        searchContext.mo184391a(Scene.Type.SEARCH_MESSAGES);
        searchContext.mo184395a(mo182524j());
        searchContext.mo184405c(this.f132064i);
        searchContext.mo184415f(mo182520f());
        return searchContext;
    }

    /* renamed from: a */
    public void mo182505a(ChatInsideSearchResponse chatInsideSearchResponse, IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        List<SearchBaseInfo> a = C53345b.m206462a(this.f132067l, chatInsideSearchResponse.getSearchItems());
        if (!CollectionUtils.isEmpty(a)) {
            this.f132067l.addAll(a);
        }
        for (SearchBaseInfo searchBaseInfo : this.f132067l) {
            searchBaseInfo.setChatInsideShow(true);
        }
        iGetDataCallback.onSuccess(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ChatInsideSearchData mo182514b(List<SearchBaseInfo> list, boolean z) {
        ChatInsideSearchData bVar = new ChatInsideSearchData(this.f132064i, this.f132060e);
        bVar.mo182742a(this.f132056a);
        bVar.mo182743a(list);
        bVar.mo182744a(this.f132065j);
        bVar.mo182747b(!z);
        bVar.mo182746b(this.f132066k);
        return bVar;
    }

    public AbstractC53443a(String str, int i) {
        this.f132064i = str;
        mo182459a();
        this.f132060e = i;
        this.f132056a = "";
        this.f132059d = C53287b.m206193a();
        this.f132068m = C53258a.m205939a().mo181758g();
        this.f132061f = new ChatInsideSearchStatistics();
    }

    /* renamed from: a */
    public void mo182503a(final IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback, final boolean z) {
        this.f132057b = C53234a.m205877a();
        Log.m165379d("LarkSearch.Search.BaseChatInsideSearchModel", "pull mRequestId: " + this.f132057b + " who am i? " + this);
        this.f132063h.put(this.f132057b, Long.valueOf(System.currentTimeMillis()));
        this.f132069n = SessionManager.m209246b();
        mo182461b(mo182561r(), new IGetDataCallback<ChatInsideSearchResponse>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a.C534452 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(ChatInsideSearchResponse chatInsideSearchResponse) {
                boolean z;
                if (!z) {
                    SearchClickReporter.m208837a((String) null, AbstractC53443a.this.mo182463n(), "", AbstractC53443a.this.mo182528o(), chatInsideSearchResponse.getImprId(), "chat", AbstractC53443a.this.f132063h.get(AbstractC53443a.this.f132057b));
                }
                AbstractC53443a.this.f132063h.clear();
                StringBuilder sb = new StringBuilder();
                sb.append("pull query: ");
                sb.append(AbstractC53443a.this.f132056a);
                sb.append(" mRequestId: ");
                sb.append(AbstractC53443a.this.f132057b);
                sb.append(" searchResponse.getSearchKey(): ");
                sb.append(chatInsideSearchResponse.getSearchKey());
                sb.append(" searchResponse.getRequestId(): ");
                sb.append(chatInsideSearchResponse.getRequestId());
                sb.append(" cancel? ");
                boolean z2 = true;
                if (chatInsideSearchResponse.getAbnormalNotice() == SearchCommonResponseHeader.InvokeAbnormalNotice.REQUEST_CANCELED) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                Log.m165379d("LarkSearch.Search.BaseChatInsideSearchModel", sb.toString());
                if (!TextUtils.equals(AbstractC53443a.this.f132057b, chatInsideSearchResponse.getRequestId()) || chatInsideSearchResponse.getAbnormalNotice() == SearchCommonResponseHeader.InvokeAbnormalNotice.REQUEST_CANCELED) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("pull query: ");
                    sb2.append(AbstractC53443a.this.f132056a);
                    sb2.append(" mRequestId: ");
                    sb2.append(AbstractC53443a.this.f132057b);
                    sb2.append(" searchResponse.getSearchKey(): ");
                    sb2.append(chatInsideSearchResponse.getSearchKey());
                    sb2.append(" searchResponse.getRequestId(): ");
                    sb2.append(chatInsideSearchResponse.getRequestId());
                    sb2.append(" cancel? ");
                    if (chatInsideSearchResponse.getAbnormalNotice() != SearchCommonResponseHeader.InvokeAbnormalNotice.REQUEST_CANCELED) {
                        z2 = false;
                    }
                    sb2.append(z2);
                    Log.m165397w("LarkSearch.Search.BaseChatInsideSearchModel", sb2.toString());
                    return;
                }
                AbstractC53443a.this.mo182505a(chatInsideSearchResponse, iGetDataCallback);
            }
        }, z);
    }

    /* renamed from: a */
    public void mo182509a(String str, List<SearchBaseInfo> list) {
        this.f132056a = str;
        this.f132067l.addAll(list);
    }

    /* renamed from: a */
    public void mo182510a(List<String> list, final IGetDataCallback<List<BasePickViewData>> iGetDataCallback) {
        C53345b.m206464a(list, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<List<BasePickViewData>>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a.C534463 */

            /* renamed from: a */
            public void onSuccess(List<BasePickViewData> list) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(list);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo182508a(final String str, final IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback, final boolean z) {
        mo182518d();
        mo182464q();
        this.f132056a = str;
        this.f132057b = C53234a.m205877a();
        Log.m165379d("LarkSearch.Search.BaseChatInsideSearchModel", "search, key:" + str + " mRequestId: " + this.f132057b);
        this.f132063h.put(this.f132057b, Long.valueOf(System.currentTimeMillis()));
        this.f132069n = SessionManager.m209246b();
        mo182460a(mo182561r(), new IGetDataCallback<ChatInsideSearchResponse>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a.C534441 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(ChatInsideSearchResponse chatInsideSearchResponse) {
                boolean z;
                if (!z) {
                    SearchClickReporter.m208837a((String) null, AbstractC53443a.this.mo182463n(), str, AbstractC53443a.this.mo182528o(), chatInsideSearchResponse.getImprId(), "chat", AbstractC53443a.this.f132063h.get(AbstractC53443a.this.f132057b));
                }
                AbstractC53443a.this.f132063h.clear();
                AbstractC53443a.this.f132061f.mo182444a(AbstractC53443a.this.f132060e, chatInsideSearchResponse.getRequestId());
                StringBuilder sb = new StringBuilder();
                sb.append("query: ");
                sb.append(AbstractC53443a.this.f132056a);
                sb.append(" mRequestId: ");
                sb.append(AbstractC53443a.this.f132057b);
                sb.append(" searchResponse.getSearchKey(): ");
                sb.append(chatInsideSearchResponse.getSearchKey());
                sb.append(" searchResponse.getRequestId(): ");
                sb.append(chatInsideSearchResponse.getRequestId());
                sb.append(" cancel? ");
                boolean z2 = true;
                if (chatInsideSearchResponse.getAbnormalNotice() == SearchCommonResponseHeader.InvokeAbnormalNotice.REQUEST_CANCELED) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                Log.m165379d("LarkSearch.Search.BaseChatInsideSearchModel", sb.toString());
                if (!TextUtils.equals(AbstractC53443a.this.f132057b, chatInsideSearchResponse.getRequestId()) || chatInsideSearchResponse.getAbnormalNotice() == SearchCommonResponseHeader.InvokeAbnormalNotice.REQUEST_CANCELED) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("query: ");
                    sb2.append(AbstractC53443a.this.f132056a);
                    sb2.append(" mRequestId: ");
                    sb2.append(AbstractC53443a.this.f132057b);
                    sb2.append(" searchResponse.getSearchKey(): ");
                    sb2.append(chatInsideSearchResponse.getSearchKey());
                    sb2.append(" searchResponse.getRequestId(): ");
                    sb2.append(chatInsideSearchResponse.getRequestId());
                    sb2.append(" cancel? ");
                    if (chatInsideSearchResponse.getAbnormalNotice() != SearchCommonResponseHeader.InvokeAbnormalNotice.REQUEST_CANCELED) {
                        z2 = false;
                    }
                    sb2.append(z2);
                    Log.m165397w("LarkSearch.Search.BaseChatInsideSearchModel", sb2.toString());
                    return;
                }
                AbstractC53443a.this.mo182505a(chatInsideSearchResponse, iGetDataCallback);
            }
        }, z);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: a */
    public void mo182511a(List<String> list, List<String> list2, int i, int i2, IGetDataCallback<List<Bitmap>> iGetDataCallback) {
        this.f132068m.mo181807a(list, list2, i, i2, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }
}
