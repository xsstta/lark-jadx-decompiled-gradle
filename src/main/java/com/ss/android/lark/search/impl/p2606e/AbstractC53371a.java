package com.ss.android.lark.search.impl.p2606e;

import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.p2634b.C53883a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.e.a */
public abstract class AbstractC53371a<T extends SearchBaseViewData, D extends SearchBaseInfo> {

    /* renamed from: a */
    protected ISearchModuleDependency.AbstractC53328n f131908a = C53258a.m205939a().mo181761j();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo182051a(D d);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo182053a(T t, D d);

    /* renamed from: b */
    public final T mo182054b(D d) {
        T a = mo182051a(d);
        m206597b(a, d);
        mo182053a(a, d);
        return a;
    }

    /* renamed from: b */
    private void m206597b(T t, SearchBaseInfo searchBaseInfo) {
        t.setId(searchBaseInfo.getId());
        t.setAvatarKey(searchBaseInfo.getAvatarKey());
        t.setAvatarUrl(searchBaseInfo.getImageUrl());
        t.setTitle(searchBaseInfo.getTitle());
        t.setSubTitle(searchBaseInfo.getSubTitle());
        t.setTitleHitTerms(searchBaseInfo.getTitleHitTerms());
        t.setSubTitleHitTerms(searchBaseInfo.getSubTitleHitTerms());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ SearchBaseViewData m206596a(String str, String str2, Scene.Type type, SearchBaseInfo searchBaseInfo) {
        T b = mo182054b(searchBaseInfo);
        b.setRequestId(str);
        b.setImprId(str2);
        b.setScene(type);
        b.setSession(C53883a.m208794a().mo183799b());
        return b;
    }

    /* renamed from: a */
    public final List<T> mo182052a(List<D> list, String str, String str2, Scene.Type type) {
        try {
            return C26249aa.m94984a(list, new C26249aa.AbstractC26250a(str, str2, type) {
                /* class com.ss.android.lark.search.impl.p2606e.$$Lambda$a$U6Tw0n2ua9ns6kdcjAX0a0S5WM */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ Scene.Type f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.larksuite.framework.utils.C26249aa.AbstractC26250a
                public final Object get(Object obj) {
                    return AbstractC53371a.m270941lambda$U6Tw0n2ua9ns6kdcjAX0a0S5WM(AbstractC53371a.this, this.f$1, this.f$2, this.f$3, (SearchBaseInfo) obj);
                }
            });
        } catch (Exception e) {
            Log.m165383e("LarkSearch.Search.SearchBaseParser", "err! " + e.getMessage());
            return new ArrayList();
        }
    }
}
