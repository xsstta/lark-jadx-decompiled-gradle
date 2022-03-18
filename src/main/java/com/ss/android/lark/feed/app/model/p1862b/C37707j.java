package com.ss.android.lark.feed.app.model.p1862b;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.featuregating.service.util.FeedFgSyncUtil;
import com.ss.android.lark.feed.app.model.common.DataLoader;
import com.ss.android.lark.feed.app.p1848a.C37290d;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1872c.C38071b;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.impl.C38146f;
import com.ss.android.lark.feed.service.impl.PullType;
import com.ss.android.lark.feed.service.p1884a.AbstractC38118b;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.C57782ag;

/* renamed from: com.ss.android.lark.feed.app.model.b.j */
public class C37707j extends DataLoader<C37702h, DataLoader.AbstractC37726a<AbstractC38118b.C38119a>> {

    /* renamed from: b */
    private FeedCard.FeedType f96662b;

    /* renamed from: c */
    private AbstractC38118b f96663c = C38146f.m149976a();

    public C37707j(FeedCard.FeedType feedType) {
        this.f96662b = feedType;
    }

    /* renamed from: a */
    private boolean m148255a(C37702h hVar) {
        boolean z;
        boolean z2;
        if (this.f96662b == FeedCard.FeedType.INBOX) {
            z = true;
        } else {
            z = false;
        }
        if (hVar.mo138196g() == PullType.LOAD_MORE) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(hVar.mo138195f());
        if (!z || !z2 || !isEmpty) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo138219a(C37702h hVar, DataLoader.AbstractC37726a<AbstractC38118b.C38119a> aVar) {
        String str;
        C38071b bVar = new C38071b("FeedModule_PageLoader");
        bVar.mo139359a();
        FeedCard.FeedType feedType = this.f96662b;
        if (feedType != null) {
            str = feedType.toString();
        } else {
            str = "";
        }
        bVar.mo139363a("loadType", str);
        bVar.mo139361a(hVar.mo138385a());
        try {
            mo138220a(hVar, bVar, aVar);
        } catch (Exception e) {
            m148253a(bVar, aVar, new ErrorResult(e));
        }
    }

    /* renamed from: a */
    private void m148253a(C38071b bVar, DataLoader.AbstractC37726a aVar, ErrorResult errorResult) {
        aVar.mo137409a(errorResult);
        bVar.mo139360b();
        bVar.mo139368d(errorResult.toString());
        bVar.mo139367d();
    }

    /* renamed from: a */
    public void mo138220a(C37702h hVar, C38071b bVar, DataLoader.AbstractC37726a<AbstractC38118b.C38119a> aVar) {
        String str;
        SdkSender.C53233d<AbstractC38118b.C38119a> dVar;
        long j;
        if (hVar.mo138198i() == null) {
            str = "";
        } else {
            str = hVar.mo138198i().name();
        }
        bVar.mo139363a("filter", str);
        bVar.mo139362a("cursor", hVar.mo138191c());
        bVar.mo139362a("expectLoadSize", (long) hVar.mo138194e());
        if (!TextUtils.isEmpty(hVar.mo138195f()) && !TextUtils.equals(hVar.mo138195f(), "0")) {
            bVar.mo139363a("p_id", hVar.mo138195f());
        }
        if (m148255a(hVar)) {
            C37290d.m146907a().mo137120d();
        }
        if (FeedFgSyncUtil.m146721a()) {
            if (C57782ag.m224241a(hVar.mo138195f())) {
                j = 0;
            } else {
                j = Long.valueOf(hVar.mo138195f()).longValue();
            }
            dVar = this.f96663c.mo139439a(hVar.mo138191c(), hVar.mo138200k(), hVar.mo138194e(), j, hVar.mo138198i(), bVar);
        } else {
            dVar = this.f96663c.mo139440a(hVar.mo138196g(), hVar.mo138191c(), hVar.mo138193d(), hVar.mo138194e(), hVar.mo138195f(), hVar.mo138198i(), bVar);
        }
        if (dVar.f131573b != null) {
            if (m148255a(hVar)) {
                C37290d.m146907a().mo137117a(dVar.f131573b);
            }
            m148253a(bVar, aVar, dVar.f131573b);
            return;
        }
        if (m148255a(hVar)) {
            C37290d.m146907a().mo137121e();
            C37290d.m146907a().mo137119c();
        }
        m148254a(bVar, dVar.f131572a, aVar);
    }

    /* renamed from: a */
    private void m148254a(C38071b bVar, AbstractC38118b.C38119a aVar, DataLoader.AbstractC37726a<AbstractC38118b.C38119a> aVar2) {
        String str;
        String str2;
        int i;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (!CollectionUtils.isEmpty(aVar.f97743d)) {
            for (C38126b bVar2 : aVar.f97743d) {
                sb2.append("(");
                sb2.append(bVar2.f97759a);
                sb2.append(",");
                sb2.append(bVar2.f97760b);
                sb2.append(")");
            }
        }
        if (aVar.f97746g == null) {
            str = "";
        } else {
            str = aVar.f97746g.name();
        }
        bVar.mo139363a("filter", str);
        bVar.mo139362a("nextCursor", aVar.f97740a);
        bVar.mo139363a("cursors", sb2.toString());
        if (aVar.f97741b == null) {
            str2 = "null";
        } else {
            str2 = aVar.f97741b.toString();
        }
        bVar.mo139363a("feedCursor", str2);
        if (!CollectionUtils.isEmpty(aVar.f97745f)) {
            for (FeedPreviewInfo feedPreviewInfo : aVar.f97745f) {
                sb.append("(");
                sb.append(feedPreviewInfo.mo106098p());
                sb.append(",dt:");
                sb.append(feedPreviewInfo.mo106089m());
                sb.append("rt:");
                sb.append(feedPreviewInfo.mo106092n());
                sb.append("ut:");
                sb.append(feedPreviewInfo.mo106095o());
                sb.append("avatar:");
                sb.append(feedPreviewInfo.mo106104r());
                sb.append("bg:");
                sb.append(feedPreviewInfo.mo106106t());
                if (C26284k.m95185a(C37268c.m146766b().mo139170a())) {
                    String E = feedPreviewInfo.mo105981E();
                    sb.append("length:");
                    if (E == null) {
                        i = 0;
                    } else {
                        i = E.length();
                    }
                    sb.append(i);
                }
                sb.append(")");
            }
        }
        bVar.mo139363a("info", sb.toString());
        aVar2.mo137411a(aVar);
        bVar.mo139360b();
        bVar.mo139367d();
    }
}
