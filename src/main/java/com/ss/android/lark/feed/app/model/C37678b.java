package com.ss.android.lark.feed.app.model;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.banner.C37312a;
import com.ss.android.lark.feed.app.banner.base.IBanner;
import com.ss.android.lark.feed.app.entity.BannerPreview;
import com.ss.android.lark.sdk.C53241h;

/* renamed from: com.ss.android.lark.feed.app.model.b */
public class C37678b {

    /* renamed from: com.ss.android.lark.feed.app.model.b$a */
    public interface AbstractC37681a {
        /* renamed from: a */
        void mo138121a();

        /* renamed from: a */
        void mo138122a(BannerPreview bannerPreview);
    }

    public C37678b() {
        C37312a.m146962a().mo137150a(C37262a.m146726a().mo139170a());
    }

    /* renamed from: a */
    public void mo138118a(final AbstractC37681a aVar) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.feed.app.model.C37678b.RunnableC376791 */

            public void run() {
                IBanner b = C37312a.m146962a().mo137151b();
                if (b.mo137155a() == IBanner.BannerStyle.NONE) {
                    AbstractC37681a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo138121a();
                        return;
                    }
                    return;
                }
                b.mo137157c().mo137168a(new IGetDataCallback<BannerPreview>() {
                    /* class com.ss.android.lark.feed.app.model.C37678b.RunnableC376791.C376801 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C53241h.m205894a("FeedModule_BannerLoader", errorResult.getDebugMsg());
                    }

                    /* renamed from: a */
                    public void onSuccess(BannerPreview bannerPreview) {
                        C53241h.m205894a("FeedModule_BannerLoader", "update banner " + bannerPreview.getBannerStyle());
                        if (aVar != null) {
                            aVar.mo138122a(bannerPreview);
                        }
                    }
                });
            }
        });
    }
}
