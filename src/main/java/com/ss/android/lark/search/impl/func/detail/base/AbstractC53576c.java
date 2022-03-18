package com.ss.android.lark.search.impl.func.detail.base;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.func.detail.SearchDetailBackRouterManager;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f;
import com.ss.android.lark.search.impl.hitpoint.SearchHitPoint;
import com.ss.android.lark.search.impl.hitpoint.loading.SearchLoadingLog;
import com.ss.android.lark.search.impl.p2592b.p2595c.C53348c;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.C53892a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.p2634b.C53883a;
import com.ss.android.lark.searchcommon.p2634b.C53886b;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.detail.base.c */
public abstract class AbstractC53576c implements AbstractC53584f.AbstractC53585a.AbstractC53586a {

    /* renamed from: a */
    protected Activity f132340a;

    /* renamed from: b */
    public BaseSearchView f132341b;

    /* renamed from: c */
    public AbstractC53569a f132342c;

    @Override // com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f.AbstractC53585a.AbstractC53586a
    /* renamed from: a */
    public boolean mo182871a() {
        return this.f132342c.mo182848g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo182875c() {
        C53258a.m205939a().mo181752d().mo181830a();
    }

    @Override // com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f.AbstractC53585a.AbstractC53586a
    /* renamed from: b */
    public void mo182872b() {
        mo182873b(this.f132342c.mo182843b());
        Log.m165389i("LarkSearch.Search.BaseSearchViewDelegate", "user scroll to get more advance result, start index: " + this.f132342c.mo182852k());
    }

    @Override // com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f.AbstractC53585a.AbstractC53586a
    /* renamed from: a */
    public void mo182866a(String str) {
        mo182873b(str);
    }

    /* renamed from: d */
    private boolean m207494d(String str) {
        return !C57782ag.m224241a(str);
    }

    @Override // com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f.AbstractC53585a.AbstractC53586a
    /* renamed from: a */
    public void mo182864a(Activity activity) {
        SearchDetailBackRouterManager.f132285a.mo182808a(activity, this.f132342c.mo182851j());
    }

    /* renamed from: c */
    private boolean m207493c(String str) {
        if (!TextUtils.equals(str, this.f132342c.mo182843b())) {
            this.f132342c.mo182845d();
        }
        Scene.Type h = this.f132342c.mo182849h();
        boolean d = m207494d(str);
        if (!d) {
            this.f132342c.mo182839a("");
            this.f132342c.mo182855n();
            this.f132341b.mo182825o();
            this.f132341b.mo182818a(new ArrayList());
        }
        boolean a = this.f132342c.mo182847f().mo182809a();
        if (!d && a) {
            return false;
        }
        if (this.f132342c.mo182852k() < 100 || Scene.Type.SEARCH_CHATTERS != h) {
            return true;
        }
        this.f132341b.mo182820b(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SearchUserMax, "max_user", Integer.toString(100)));
        this.f132341b.mo182825o();
        return false;
    }

    /* renamed from: b */
    public void mo182873b(final String str) {
        if (m207493c(str)) {
            final long currentTimeMillis = System.currentTimeMillis();
            final int k = this.f132342c.mo182852k();
            C53886b.m208801a(str);
            Log.m165389i("LarkSearch.Search.BaseSearchViewDelegate", "start advance search request, query: " + SearchCommonUtils.m209228a(str) + ", search session:" + C53883a.m208794a().mo183799b() + ", begin:" + k + ", end: " + k + 20);
            this.f132342c.mo182840a(str, new IGetDataCallback<List<SearchBaseViewData>>() {
                /* class com.ss.android.lark.search.impl.func.detail.base.AbstractC53576c.C535771 */

                /* renamed from: a */
                public void onSuccess(List<SearchBaseViewData> list) {
                    if (k != 0) {
                        AbstractC53576c.this.f132341b.mo182818a(list);
                    } else if (CollectionUtils.isEmpty(list)) {
                        AbstractC53576c.this.f132341b.mo182823m();
                    } else {
                        AbstractC53576c.this.f132341b.mo182818a(list);
                    }
                    AbstractC53576c.this.mo182870a(list, currentTimeMillis);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("LarkSearch.Search.BaseSearchViewDelegate", "search failed: , query: " + SearchCommonUtils.m209228a(str) + ", search session:" + C53883a.m208794a().mo183799b() + ", error code" + errorResult.getErrorCode() + ", error message: " + errorResult.getMessage() + ", result type:" + SearchCommonUtils.m209226a(AbstractC53576c.this.f132342c.mo182850i()) + ", begin:" + k + ", end: " + k + 20);
                    if (k == 0) {
                        AbstractC53576c.this.f132341b.mo182823m();
                    } else {
                        AbstractC53576c.this.f132341b.mo182824n();
                    }
                    C53886b.m208802a(str, System.currentTimeMillis() - currentTimeMillis, (long) errorResult.getErrorCode(), errorResult.getDisplayMsg());
                }
            });
        }
    }

    public AbstractC53576c(BaseSearchView baseSearchView, AbstractC53569a aVar) {
        this.f132341b = baseSearchView;
        this.f132342c = aVar;
        this.f132340a = baseSearchView.mo181972i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182865a(NetSearchRequest.Filter filter, SearchCommonConstants.SearchHistorySource searchHistorySource) {
        Log.m165389i("LarkSearch.Search.BaseSearchViewDelegate", "start send search history, search session: " + C53883a.m208794a().mo183799b() + ", query:" + SearchCommonUtils.m209228a(this.f132342c.mo182843b()) + ", result type: " + SearchCommonUtils.m209226a(this.f132342c.mo182850i()));
        String b = this.f132342c.mo182843b();
        if (!TextUtils.isEmpty(b)) {
            SearchInfoHistory searchInfoHistory = new SearchInfoHistory();
            searchInfoHistory.setQuery(b);
            searchInfoHistory.setFilter(filter);
            searchInfoHistory.setHistorySource(searchHistorySource);
            this.f132342c.mo182838a(searchInfoHistory);
        }
    }

    /* renamed from: a */
    public void mo182870a(List<SearchBaseViewData> list, long j) {
        boolean z = true;
        if (this.f132342c.mo182854m() != 1) {
            z = false;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        List<String> a = C53348c.m206468a(list);
        Log.m165389i("LarkSearch.Search.BaseSearchViewDelegate", "advance search result refresh ui, results: " + a + ",result type: " + SearchCommonUtils.m209226a(this.f132342c.mo182850i()) + ",query: " + SearchCommonUtils.m209228a(this.f132342c.mo182843b()) + ", session: " + C53883a.m208794a().mo183799b());
        C53886b.m208800a(list.size(), C53348c.m206468a(list), z, currentTimeMillis);
        SearchLoadingLog.f131887a.mo182029a(this.f132342c.mo182850i(), z, currentTimeMillis);
        SearchLoadingLog.f131887a.mo182028a(this.f132342c.mo182850i(), z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo182874b(String str, int i, String str2) {
        m207492a(this.f132342c.mo182843b(), str2, i, 2, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182867a(String str, int i, String str2) {
        m207492a(this.f132342c.mo182843b(), str2, i, 1, str);
    }

    /* renamed from: a */
    private void m207492a(String str, String str2, int i, int i2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C53892a(i + 1, i2, str3));
            this.f132342c.mo182842a(str, str2, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182868a(String str, String str2, int i, int i2, String str3, String str4) {
        SearchHitPoint.m206541a(str, str2, i + 1, str4, this.f132342c.mo182857q(), i2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182869a(String str, String str2, int i, String str3, String str4, int i2, String str5) {
        SearchHitPoint.m206542a(str, str2, i + 1, str3, str4, this.f132342c.mo182857q(), i2, str5);
    }
}
