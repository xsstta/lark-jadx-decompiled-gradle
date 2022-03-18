package com.ss.android.lark.mail.impl.home.p2178a;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.badge.C41832a;
import com.ss.android.lark.mail.impl.entity.BadgeCountState;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.entity.C42089c;
import com.ss.android.lark.mail.impl.home.p2178a.C42379g;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.home.a.e */
public class C42369e implements C42379g.AbstractC42380a {

    /* renamed from: a */
    public C42088b f107852a;

    /* renamed from: b */
    private AbstractC42373a f107853b;

    /* renamed from: c */
    private final C1177w<List<C42368d>> f107854c = new C1177w<>();

    /* renamed from: com.ss.android.lark.mail.impl.home.a.e$a */
    interface AbstractC42373a {
        /* renamed from: a */
        LifecycleOwner mo152522a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    public C1177w<List<C42368d>> mo152529a() {
        return this.f107854c;
    }

    /* renamed from: b */
    public void mo152531b() {
        Log.m165389i("MailAccountService", "reloadData from account list page");
        C43277a.m171921a().mo154944h();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C43277a.m171921a().mo154953q().mo5923a(this.f107853b.mo152522a(), new AbstractC1178x<C42088b>() {
            /* class com.ss.android.lark.mail.impl.home.p2178a.C42369e.C423701 */

            /* renamed from: a */
            public void onChanged(final C42088b bVar) {
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.home.p2178a.C42369e.C423701.RunnableC423711 */

                    public void run() {
                        C42369e.this.f107852a = bVar;
                        C42369e.this.mo152530a(bVar);
                    }
                });
            }
        });
        C41832a.m166157a().mo150418d().mo5923a(this.f107853b.mo152522a(), new AbstractC1178x<C42089c>() {
            /* class com.ss.android.lark.mail.impl.home.p2178a.C42369e.C423722 */

            /* renamed from: a */
            public void onChanged(C42089c cVar) {
                if (cVar != null) {
                    C42369e eVar = C42369e.this;
                    eVar.mo152530a(eVar.f107852a);
                }
            }
        });
    }

    public C42369e(AbstractC42373a aVar) {
        this.f107853b = aVar;
    }

    /* renamed from: a */
    public void mo152530a(C42088b bVar) {
        int i;
        if (bVar == null) {
            this.f107854c.mo5926a((List<C42368d>) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C42089c b = C41832a.m166157a().mo150418d().mo5927b();
        for (C42087a aVar : bVar.mo151820b()) {
            C42368d dVar = new C42368d();
            dVar.f107849a = aVar;
            boolean z = false;
            if (b != null) {
                i = b.mo151829b(aVar.f107024a);
            } else {
                i = 0;
            }
            dVar.f107850b = i;
            if (b != null && b.mo151828a(aVar.f107024a) == BadgeCountState.RED) {
                z = true;
            }
            dVar.f107851c = z;
            arrayList.add(dVar);
        }
        this.f107854c.mo5926a(arrayList);
    }
}
