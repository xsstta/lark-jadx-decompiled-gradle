package com.ss.android.lark.search.impl.func.detail.base;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.entity.C53385a;
import com.ss.android.lark.search.impl.entity.SearchDetailInitData;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.func.C53389a;
import com.ss.android.lark.search.impl.func.detail.C53621e;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53579e;
import com.ss.android.lark.search.impl.func.detail.p2616b.C53561a;
import com.ss.android.lark.search.impl.func.detail.p2617c.C53607c;
import com.ss.android.lark.search.impl.func.detail.p2618d.C53615b;
import com.ss.android.lark.search.impl.p2592b.p2595c.C53345b;
import com.ss.android.lark.search.p2584b.C53287b;
import com.ss.android.lark.searchcommon.constant.C53887a;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.C53892a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.p2634b.C53886b;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import com.ss.android.lark.searchcommon.utils.ImprId;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.detail.base.a */
public abstract class AbstractC53569a extends BaseModel implements AbstractC53579e.AbstractC53580a {

    /* renamed from: a */
    protected ISearchModuleDependency.AbstractC53317e f132312a;

    /* renamed from: b */
    protected C53621e f132313b;

    /* renamed from: c */
    protected int f132314c;

    /* renamed from: d */
    protected String f132315d;

    /* renamed from: e */
    protected String f132316e;

    /* renamed from: f */
    private ISearchModuleDependency.AbstractC53324j f132317f;

    /* renamed from: g */
    private C53287b f132318g;

    /* renamed from: h */
    private C53389a f132319h;

    /* renamed from: i */
    private boolean f132320i;

    /* renamed from: j */
    private int f132321j;

    /* renamed from: k */
    private int f132322k;

    /* renamed from: l */
    private String f132323l;

    /* renamed from: m */
    private int f132324m;

    /* renamed from: n */
    private Scene.Type f132325n;

    /* renamed from: o */
    private C53561a f132326o;

    /* renamed from: p */
    private List<SearchBaseViewData> f132327p = new ArrayList();

    /* renamed from: q */
    private String f132328q;

    /* renamed from: r */
    private ImprId f132329r;

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract boolean mo182798o();

    /* renamed from: a */
    public String mo182832a() {
        return this.f132323l;
    }

    /* renamed from: b */
    public String mo182843b() {
        return this.f132315d;
    }

    /* renamed from: c */
    public List<SearchBaseViewData> mo182844c() {
        return this.f132327p;
    }

    /* renamed from: f */
    public C53561a mo182847f() {
        return this.f132326o;
    }

    /* renamed from: g */
    public boolean mo182848g() {
        return this.f132320i;
    }

    /* renamed from: h */
    public Scene.Type mo182849h() {
        return this.f132325n;
    }

    /* renamed from: i */
    public int mo182850i() {
        return this.f132322k;
    }

    /* renamed from: j */
    public int mo182851j() {
        return this.f132324m;
    }

    /* renamed from: k */
    public int mo182852k() {
        return this.f132314c;
    }

    /* renamed from: m */
    public int mo182854m() {
        return this.f132321j;
    }

    /* renamed from: q */
    public String mo182857q() {
        return this.f132328q;
    }

    /* renamed from: a */
    public void mo182840a(String str, IGetDataCallback<List<SearchBaseViewData>> iGetDataCallback) {
        this.f132315d = str;
        m207452b(iGetDataCallback);
    }

    /* renamed from: a */
    public void mo182841a(String str, SearchCommonConstants.FeedType feedType) {
        ISearchModuleDependency.AbstractC53324j jVar = this.f132317f;
        if (jVar != null) {
            jVar.mo181814a(str, feedType);
        }
    }

    /* renamed from: a */
    public void mo182838a(SearchInfoHistory searchInfoHistory) {
        this.f132318g.mo181877a(searchInfoHistory, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.search.impl.func.detail.base.AbstractC53569a.C535701 */

            /* renamed from: a */
            public void onSuccess(String str) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("LarkSearch.Search.BaseSearchModel", "set search history failed: " + errorResult.toString());
            }
        }));
    }

    /* renamed from: a */
    public void mo182842a(String str, String str2, List<C53892a> list) {
        this.f132318g.mo181887a(str, str2, this.f132328q, new Scene("", mo182849h()), list, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.search.impl.func.detail.base.AbstractC53569a.C535723 */

            /* renamed from: a */
            public void onSuccess(Void r1) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("put search history: " + errorResult.getDebugMsg());
            }
        }));
    }

    /* renamed from: s */
    private void m207456s() {
        C53594h.m207520a().mo182882b();
    }

    /* renamed from: u */
    private C53385a m207458u() {
        return m207457t();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m207455r();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m207456s();
    }

    /* renamed from: n */
    public void mo182855n() {
        this.f132316e = "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C53385a mo182856p() {
        return m207457t();
    }

    /* renamed from: d */
    public void mo182845d() {
        mo182834a(0);
        this.f132329r.nextImprId();
        this.f132327p.clear();
    }

    /* renamed from: e */
    public C53887a mo182846e() {
        return this.f132319h.mo182358a(this.f132322k);
    }

    /* renamed from: l */
    public NetSearchRequest.Filter mo182853l() {
        return NetSearchRequest.Filter.newBuilder().mo184522a();
    }

    /* renamed from: r */
    private void m207455r() {
        C53594h.m207520a().mo182881a(100000011, new C53607c());
        C53594h.m207520a().mo182881a(100000010, new C53615b());
    }

    /* renamed from: t */
    private C53385a m207457t() {
        this.f132316e = C53234a.m205877a();
        return ((C53385a.C53387b) ((C53385a.C53387b) ((C53385a.C53387b) ((C53385a.C53387b) ((C53385a.C53387b) ((C53385a.C53387b) C53385a.m206660a().mo182093a(this.f132315d)).mo182095b(this.f132316e)).mo182091a(this.f132314c)).mo182094b(this.f132314c + 20)).mo182092a(this.f132326o)).mo182096c(this.f132329r.imprId())).mo182097b();
    }

    /* renamed from: a */
    public void mo182834a(int i) {
        this.f132314c = i;
    }

    /* renamed from: c */
    private IGetDataCallback<SearchResponse> m207454c(final IGetDataCallback<List<SearchBaseViewData>> iGetDataCallback) {
        return getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<SearchResponse>() {
            /* class com.ss.android.lark.search.impl.func.detail.base.AbstractC53569a.C535745 */

            /* renamed from: a */
            public void onSuccess(SearchResponse searchResponse) {
                AbstractC53569a.this.mo182837a(searchResponse, iGetDataCallback);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo182839a(String str) {
        this.f132315d = str;
    }

    public AbstractC53569a(SearchDetailInitData searchDetailInitData) {
        m207449a(searchDetailInitData);
        this.f132318g = C53287b.m206193a();
        if (C53258a.m205939a() != null) {
            this.f132317f = C53258a.m205939a().mo181760i();
            this.f132312a = C53258a.m205939a().mo181756f();
        }
        this.f132319h = new C53389a();
        this.f132313b = new C53621e();
    }

    /* renamed from: a */
    private void m207449a(SearchDetailInitData searchDetailInitData) {
        ImprId imprId;
        this.f132325n = searchDetailInitData.sceneType;
        this.f132322k = searchDetailInitData.resultType;
        this.f132315d = searchDetailInitData.searchKey;
        this.f132321j = searchDetailInitData.dataFromType;
        this.f132320i = searchDetailInitData.hasMore;
        this.f132314c = searchDetailInitData.initDataList.size();
        this.f132327p = searchDetailInitData.initDataList;
        this.f132328q = searchDetailInitData.searchImprId;
        this.f132323l = searchDetailInitData.searchActionType;
        this.f132324m = searchDetailInitData.searchFromTab;
        if (searchDetailInitData.imprId == null) {
            imprId = new ImprId();
        } else {
            imprId = searchDetailInitData.imprId;
        }
        this.f132329r = imprId;
        m207451a(searchDetailInitData.filter);
    }

    /* renamed from: b */
    private void m207452b(IGetDataCallback<List<SearchBaseViewData>> iGetDataCallback) {
        AbstractC53593g a = C53594h.m207520a().mo182880a(this.f132322k);
        if (a == null) {
            Log.m165383e("LarkSearch.Search.BaseSearchModel", "searcher is null: search result type is " + this.f132322k);
        } else if (!mo182798o() || this.f132321j == 1) {
            m207453b(a, iGetDataCallback);
        } else {
            m207450a(a, iGetDataCallback);
        }
    }

    /* renamed from: a */
    private void m207451a(NetSearchRequest.Filter filter) {
        C53561a aVar = new C53561a();
        aVar.f132286a = filter.chatIds;
        aVar.f132287b = filter.messageCreatorIds;
        aVar.f132288c = filter.messageStartTime;
        aVar.f132289d = filter.messageEndTime;
        if (filter.chatFilter != null) {
            aVar.f132292g = filter.chatFilter.chatMemberIds;
            aVar.f132291f = filter.chatFilter.chatTypes;
            aVar.f132290e = filter.chatFilter.chatModes;
        }
        this.f132326o = aVar;
    }

    @Override // com.ss.android.lark.search.impl.func.detail.base.AbstractC53579e.AbstractC53580a
    /* renamed from: a */
    public void mo182835a(final IGetDataCallback<Integer> iGetDataCallback) {
        C53345b.m206463a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Integer>() {
            /* class com.ss.android.lark.search.impl.func.detail.base.AbstractC53569a.C535712 */

            /* renamed from: a */
            public void onSuccess(Integer num) {
                iGetDataCallback.onSuccess(num);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        }));
    }

    /* renamed from: a */
    private void m207450a(AbstractC53593g gVar, IGetDataCallback<List<SearchBaseViewData>> iGetDataCallback) {
        C53886b.m208805c(this.f132315d);
        gVar.mo182879b(m207458u(), m207454c(iGetDataCallback));
    }

    /* renamed from: b */
    private void m207453b(AbstractC53593g gVar, final IGetDataCallback<List<SearchBaseViewData>> iGetDataCallback) {
        final long currentTimeMillis = System.currentTimeMillis();
        C53886b.m208804b(this.f132315d);
        gVar.mo182878a(mo182856p(), getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<SearchResponse>() {
            /* class com.ss.android.lark.search.impl.func.detail.base.AbstractC53569a.C535734 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(SearchResponse searchResponse) {
                AbstractC53569a.this.mo182836a(searchResponse, currentTimeMillis, iGetDataCallback);
            }
        }));
    }

    /* renamed from: a */
    public void mo182837a(SearchResponse searchResponse, IGetDataCallback<List<SearchBaseViewData>> iGetDataCallback) {
        if (TextUtils.equals(this.f132316e, searchResponse.getRequestId())) {
            this.f132320i = searchResponse.isHasMore();
            this.f132315d = searchResponse.getQuery();
            List<SearchBaseViewData> a = C53345b.m206462a(this.f132327p, mo182833a(searchResponse.getInfoList(), "", "", Scene.Type.UNKNOWN));
            if (!CollectionUtils.isEmpty(a)) {
                this.f132314c += 20;
                this.f132327p.addAll(a);
            }
            iGetDataCallback.onSuccess(a);
        }
    }

    /* renamed from: a */
    public void mo182836a(SearchResponse searchResponse, long j, IGetDataCallback<List<SearchBaseViewData>> iGetDataCallback) {
        if (TextUtils.equals(this.f132316e, searchResponse.getRequestId())) {
            this.f132320i = searchResponse.isHasMore();
            this.f132328q = searchResponse.getImprId();
            List<SearchBaseViewData> a = C53345b.m206462a(this.f132327p, mo182833a(searchResponse.getInfoList(), searchResponse.getRequestId(), searchResponse.getImprId(), searchResponse.getScene()));
            if (!CollectionUtils.isEmpty(a)) {
                this.f132314c += 20;
                this.f132327p.addAll(a);
            }
            iGetDataCallback.onSuccess(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<SearchBaseViewData> mo182833a(List<SearchBaseInfo> list, String str, String str2, Scene.Type type) {
        return this.f132313b.mo182911a(Integer.valueOf(this.f132322k), list, str, str2, type);
    }
}
