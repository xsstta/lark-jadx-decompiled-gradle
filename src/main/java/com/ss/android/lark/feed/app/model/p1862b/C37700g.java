package com.ss.android.lark.feed.app.model.p1862b;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.featuregating.service.util.FeedFgSyncUtil;
import com.ss.android.lark.feed.app.hitpoint.FeedApm;
import com.ss.android.lark.feed.app.model.common.DataLoader;
import com.ss.android.lark.feed.app.model.p1863c.C37713d;
import com.ss.android.lark.feed.p1872c.C38071b;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.impl.C38146f;
import com.ss.android.lark.feed.service.p1884a.AbstractC38118b;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.feed.app.model.b.g */
public class C37700g extends DataLoader<C37695e, DataLoader.AbstractC37726a<AbstractC38118b.C38120b>> {

    /* renamed from: b */
    private FeedCard.FeedType f96630b;

    /* renamed from: c */
    private AbstractC38118b f96631c = C38146f.m149976a();

    public C37700g(FeedCard.FeedType feedType) {
        this.f96630b = feedType;
    }

    /* renamed from: a */
    public void mo138180a(AbstractC38118b.C38120b bVar) {
        if (C37713d.f96679i) {
            if (!CollectionUtils.isEmpty(bVar.f97748a)) {
                for (FeedPreviewInfo feedPreviewInfo : bVar.f97748a) {
                    if (feedPreviewInfo.mo106107u()) {
                        return;
                    }
                }
            }
            Log.m165379d("FeedModule_NoticeLoader", "checkMonitorBadge");
            CoreThreadPool.getBackgroundHandler().postDelayed(new FeedApm.CheckMonitorBadgeRunnable(bVar.f97753f, bVar.f97754g, true), 3000);
        }
    }

    /* renamed from: a */
    public void mo138176a(C37695e eVar, DataLoader.AbstractC37726a<AbstractC38118b.C38120b> aVar) {
        C38071b bVar = new C38071b("FeedModule_NoticeLoader");
        bVar.mo139359a();
        bVar.mo139363a("id", eVar.mo138162b().getId());
        bVar.mo139361a("");
        try {
            mo138177a(eVar, bVar, aVar);
        } catch (Exception e) {
            mo138178a(bVar, aVar, new ErrorResult(e));
        }
    }

    /* renamed from: a */
    public void mo138178a(C38071b bVar, DataLoader.AbstractC37726a aVar, ErrorResult errorResult) {
        aVar.mo137409a(errorResult);
        bVar.mo139360b();
        bVar.mo139368d(errorResult.toString());
        bVar.mo139367d();
    }

    /* renamed from: a */
    public void mo138177a(C37695e eVar, final C38071b bVar, final DataLoader.AbstractC37726a<AbstractC38118b.C38120b> aVar) {
        C377011 r5 = new IGetDataCallback<AbstractC38118b.C38120b>() {
            /* class com.ss.android.lark.feed.app.model.p1862b.C37700g.C377011 */

            /* renamed from: a */
            public void onSuccess(AbstractC38118b.C38120b bVar) {
                C37700g.this.mo138179a(bVar, bVar, aVar);
                C37700g.this.mo138180a(bVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C37700g.this.mo138178a(bVar, aVar, errorResult);
            }
        };
        if (FeedFgSyncUtil.m146721a()) {
            this.f96631c.mo139443a(eVar.mo138162b().getId(), eVar.mo138165e(), eVar.mo138164d(), eVar.mo138163c(), r5, bVar);
        } else {
            this.f96631c.mo139442a(eVar.mo138162b().getId(), eVar.mo138164d(), eVar.mo138163c(), r5, bVar);
        }
    }

    /* renamed from: a */
    public void mo138179a(C38071b bVar, AbstractC38118b.C38120b bVar2, DataLoader.AbstractC37726a<AbstractC38118b.C38120b> aVar) {
        String str;
        aVar.mo137411a(bVar2);
        bVar.mo139362a("loadedSize", (long) bVar2.f97748a.size());
        bVar.mo139363a("next_id", bVar2.f97751d);
        bVar.mo139362a("nextLoadCursor", bVar2.f97749b);
        StringBuilder sb = new StringBuilder();
        if (!CollectionUtils.isEmpty(bVar2.f97752e)) {
            for (C38126b bVar3 : bVar2.f97752e) {
                sb.append("(");
                sb.append(bVar3.f97759a);
                sb.append(",");
                sb.append(bVar3.f97760b);
                sb.append(")");
            }
        }
        bVar.mo139363a("cursors", sb.toString());
        if (bVar2.f97750c != null) {
            str = bVar2.f97750c.toString();
        } else {
            str = null;
        }
        bVar.mo139363a("feedCursor", str);
        bVar.mo139360b();
        bVar.mo139367d();
    }
}
