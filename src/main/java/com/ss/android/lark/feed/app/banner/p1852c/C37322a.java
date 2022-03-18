package com.ss.android.lark.feed.app.banner.p1852c;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.banner.export.AbstractC29478a;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37326a;
import com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37334b;
import com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37343c;
import com.ss.android.lark.feed.app.banner.p1852c.p1855c.C37360a;
import com.ss.android.lark.feed.app.banner.p1852c.p1855c.C37361b;
import com.ss.android.lark.feed.app.banner.ug_banner.IFeedBannerLoader;
import com.ss.android.lark.feed.app.entity.UGBannerPreview;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.feed.app.banner.c.a */
public class C37322a implements IFeedBannerLoader {

    /* renamed from: a */
    public IFeedBannerLoader.ILoadCompleteListener f95822a;

    /* renamed from: b */
    private volatile AbstractC29479b f95823b;

    /* renamed from: d */
    private volatile C37361b f95824d;

    /* renamed from: com.ss.android.lark.feed.app.banner.c.a$a */
    private static class C37325a implements AbstractC37366e {

        /* renamed from: a */
        private Context f95829a;

        /* renamed from: b */
        private AbstractC29478a f95830b;

        @Override // com.ss.android.lark.feed.app.banner.p1852c.AbstractC37366e
        /* renamed from: a */
        public View mo137175a() {
            AbstractC29478a aVar = this.f95830b;
            if (aVar != null) {
                return aVar.mo104364a(this.f95829a);
            }
            return null;
        }

        public C37325a(Context context, AbstractC29478a aVar) {
            this.f95829a = context;
            this.f95830b = aVar;
        }
    }

    @Override // com.ss.android.lark.feed.app.banner.ug_banner.IFeedBannerLoader
    /* renamed from: a */
    public synchronized void mo137171a() {
        if (this.f95823b != null) {
            this.f95823b.mo104357e();
            this.f95823b = null;
        }
        if (this.f95824d != null) {
            this.f95824d.mo137212b();
            this.f95824d = null;
        }
    }

    /* renamed from: a */
    public synchronized void mo137172a(Context context) {
        if (this.f95823b == null) {
            this.f95823b = C37262a.m146726a().mo139167N().mo139231a();
            m146993a(context, this.f95823b);
            C37360a.m147064a(this.f95823b);
            m146994b(context, this.f95823b);
            this.f95823b.mo104356d();
        }
        if (this.f95824d == null) {
            this.f95824d = new C37361b();
            this.f95824d.mo137211a();
        }
        this.f95823b.mo104345a();
    }

    /* renamed from: b */
    private void m146994b(final Context context, AbstractC29479b bVar) {
        bVar.mo104347a(new AbstractC29479b.AbstractC29480a() {
            /* class com.ss.android.lark.feed.app.banner.p1852c.C37322a.C373242 */

            @Override // com.ss.android.lark.banner.export.AbstractC29479b.AbstractC29480a
            /* renamed from: a */
            public void mo16922a() {
                m146998a(null, false);
            }

            @Override // com.ss.android.lark.banner.export.AbstractC29479b.AbstractC29480a
            /* renamed from: a */
            public void mo16923a(AbstractC29478a aVar) {
                UGBannerPreview uGBannerPreview;
                if (aVar != null) {
                    uGBannerPreview = new UGBannerPreview();
                    uGBannerPreview.setUgBannerView(new C37325a(context, aVar));
                } else {
                    uGBannerPreview = null;
                }
                m146998a(uGBannerPreview, true);
            }

            /* renamed from: a */
            private void m146998a(UGBannerPreview uGBannerPreview, boolean z) {
                if (C37322a.this.f95822a != null) {
                    C37322a.this.f95822a.mo137214a(uGBannerPreview, z);
                }
            }
        });
    }

    /* renamed from: a */
    private void m146993a(Context context, AbstractC29479b bVar) {
        bVar.mo104349a("UPGRADE_TEAM", new C37343c(context));
        bVar.mo104349a("INVITE_MEMBER", new C37334b());
        bVar.mo104349a("ACTIVITY", new C37326a());
    }

    @Override // com.ss.android.lark.feed.app.banner.ug_banner.IFeedBannerLoader
    /* renamed from: a */
    public void mo137173a(Context context, IFeedBannerLoader.ILoadCompleteListener bVar) {
        this.f95822a = bVar;
        final WeakReference weakReference = new WeakReference(context);
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.feed.app.banner.p1852c.C37322a.RunnableC373231 */

            public void run() {
                if (weakReference.get() != null) {
                    C37322a.this.mo137172a((Context) weakReference.get());
                }
            }
        });
    }
}
