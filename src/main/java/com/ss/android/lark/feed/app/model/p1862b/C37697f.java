package com.ss.android.lark.feed.app.model.p1862b;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.model.common.C37728b;
import com.ss.android.lark.feed.app.model.common.DataLoader;
import com.ss.android.lark.feed.app.model.p1862b.AbstractC37691d;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.p1884a.AbstractC38118b;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.feed.app.model.b.f */
public class C37697f extends AbstractC37691d<C37695e, C37700g> {

    /* renamed from: g */
    protected AbstractC37699a f96624g;

    /* renamed from: h */
    protected FeedCard.FeedType f96625h;

    /* renamed from: i */
    protected FeedFilter f96626i;

    /* renamed from: com.ss.android.lark.feed.app.model.b.f$a */
    public interface AbstractC37699a {
        /* renamed from: a */
        boolean mo138174a(FeedPreview feedPreview);

        /* renamed from: d */
        boolean mo138175d(FeedCard.FeedType feedType, FeedFilter feedFilter);
    }

    /* renamed from: a */
    public boolean mo138135a(C37695e eVar) {
        if (this.f96624g.mo138175d(this.f96625h, this.f96626i)) {
            Log.m165389i("FeedModule_NoticeLoadStrategy", "checkNeedLoad: isLoadCompleted");
            return false;
        } else if (this.f96624g.mo138174a(eVar.mo138162b())) {
            return false;
        } else {
            return super.mo138135a((C37728b) eVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo138133a(C37695e eVar, final AbstractC37691d.AbstractC37692a aVar) {
        mo138154a(false, aVar);
        if (!mo138135a(eVar)) {
            mo138157b(true, aVar);
            return;
        }
        Log.m165389i("FeedModule_NoticeLoadStrategy", "begin NoticeLoad contextId=" + eVar.mo138385a() + " currentId=" + eVar.mo138162b().getId());
        final long rankTime = eVar.mo138162b().getRankTime();
        ((C37700g) this.f96608c).mo138176a(eVar, new DataLoader.AbstractC37726a<AbstractC38118b.C38120b>() {
            /* class com.ss.android.lark.feed.app.model.p1862b.C37697f.C376981 */

            @Override // com.ss.android.lark.feed.app.model.common.DataLoader.AbstractC37726a
            /* renamed from: a */
            public void mo137409a(ErrorResult errorResult) {
                C37697f.this.mo138152a(errorResult, aVar);
                C37697f.this.mo138157b(false, aVar);
            }

            /* renamed from: a */
            public void mo137411a(AbstractC38118b.C38120b bVar) {
                C38126b bVar2;
                if (bVar.f97750c != null) {
                    bVar2 = new C38126b(bVar.f97750c);
                } else if (TextUtils.isEmpty(bVar.f97751d) || CollectionUtils.isEmpty(bVar.f97748a) || bVar.f97749b <= 0) {
                    bVar2 = null;
                } else {
                    bVar2 = new C38126b(bVar.f97749b, rankTime);
                }
                C37697f.this.mo138153a(new AbstractC37691d.C37694c(bVar.f97748a, bVar.f97752e, bVar2, bVar.f97753f), aVar);
                C37697f.this.mo138157b(true, aVar);
            }
        });
    }

    public C37697f(FeedCard.FeedType feedType, FeedFilter feedFilter, AbstractC37699a aVar, AbstractC37691d.AbstractC37693b bVar) {
        super(bVar);
        this.f96625h = feedType;
        this.f96626i = feedFilter;
        this.f96624g = aVar;
        this.f96608c = new C37700g(feedType);
    }
}
