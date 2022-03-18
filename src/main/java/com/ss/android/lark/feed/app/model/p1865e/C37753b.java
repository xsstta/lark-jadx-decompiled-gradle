package com.ss.android.lark.feed.app.model.p1865e;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.ShortcutInfoLoadResult;
import com.ss.android.lark.feed.app.model.common.DataLoader;
import com.ss.android.lark.feed.app.model.p1865e.AbstractC37751a;
import com.ss.android.lark.feed.p1872c.C38071b;
import com.ss.android.lark.feed.service.impl.C38173m;
import com.ss.android.lark.feed.service.p1884a.AbstractC38121c;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.feed.app.model.e.b */
public class C37753b extends DataLoader implements AbstractC37751a {

    /* renamed from: b */
    AbstractC38121c f96792b = C38173m.m150043b();

    /* renamed from: a */
    public void mo138456a(final AbstractC37751a.AbstractC37752a aVar) {
        if (mo138356b()) {
            final C38071b bVar = new C38071b("FeedModule_ShortcutLoader");
            bVar.mo139359a();
            this.f96792b.mo139448a(0, 1000, new IGetDataCallback<ShortcutInfoLoadResult>() {
                /* class com.ss.android.lark.feed.app.model.p1865e.C37753b.C377541 */

                /* renamed from: a */
                public void onSuccess(ShortcutInfoLoadResult shortcutInfoLoadResult) {
                    bVar.mo139362a("loadedSize", (long) shortcutInfoLoadResult.shortcuts.size());
                    AbstractC37751a.AbstractC37752a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo138455a(shortcutInfoLoadResult);
                    }
                    C37753b.this.mo138358d();
                    bVar.mo139360b();
                    bVar.mo139367d();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("FeedModule_ShortcutLoader", "netLoad onError: " + errorResult);
                    AbstractC37751a.AbstractC37752a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo138454a(errorResult);
                    }
                    C37753b.this.mo138357c();
                    bVar.mo139360b();
                    bVar.mo139367d();
                }
            }, bVar);
        }
    }
}
