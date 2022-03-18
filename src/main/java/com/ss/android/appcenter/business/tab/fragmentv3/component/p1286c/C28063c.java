package com.ss.android.appcenter.business.tab.fragmentv3.component.p1286c;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.ss.android.appcenter.business.dto.C27695c;
import com.ss.android.appcenter.business.tab.fragmentv3.component.View$OnClickListenerC28043a;
import com.ss.android.appcenter.business.tab.fragmentv3.component.header.C28078a;
import com.ss.android.appcenter.business.tab.fragmentv3.component.header.C28079b;
import com.ss.android.appcenter.business.tab.fragmentv3.component.header.CommonHeader;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28037d;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28040e;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.engine.AbstractC28246e;
import com.ss.android.appcenter.engine.AbstractC28248g;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.p1299a.C28237a;
import com.ss.android.appcenter.engine.vlayout.C28277b;
import com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28263b;
import com.ss.android.appcenter.engine.vlayout.p1301a.C28270g;
import com.ss.android.appcenter.engine.vlayout.p1301a.C28276k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.c.c */
public class C28063c implements AbstractC28248g {

    /* renamed from: a */
    private AbstractC28246e f70232a;

    public C28063c(AbstractC28246e eVar) {
        this.f70232a = eVar;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28248g
    /* renamed from: a */
    public List<C28277b.AbstractC28278a> mo99885a(NodeParams nodeParams) {
        C28184h.m103250d("FeedListTransformer", "transform>>>:" + nodeParams);
        ArrayList arrayList = new ArrayList();
        C28237a aVar = new C28237a();
        C28276k kVar = new C28276k();
        final C28079b bVar = new C28079b(this.f70232a.mo100596b(), kVar, nodeParams, "feed");
        C28270g gVar = new C28270g(1);
        final C28060a aVar2 = new C28060a(this.f70232a.mo100596b(), gVar, aVar, new View$OnClickListenerC28043a(this.f70232a, nodeParams.getKey()), this.f70232a, nodeParams);
        m102576a(nodeParams, kVar, bVar, gVar, aVar2);
        boolean d = C28037d.m102475d(nodeParams);
        boolean e = C28037d.m102476e(nodeParams);
        final boolean h = C28037d.m102479h(nodeParams);
        if (C28078a.m102637a(d, e)) {
            arrayList.add(bVar);
        }
        arrayList.add(aVar2);
        this.f70232a.mo100598d().mo99988a(nodeParams.getKey(), this.f70232a.mo100601g(), new AbstractC1178x<C28237a>() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1286c.C28063c.C280641 */

            /* renamed from: a */
            public void onChanged(C28237a aVar) {
                if (aVar.mo100615b()) {
                    C28062b bVar = new C28062b();
                    bVar.mo99907a((C27695c) aVar.mo100619f());
                    if (!h && !bVar.mo99922e()) {
                        bVar.mo99953a(new CommonHeader.C28076a(C28209p.m103291a(8.0f)));
                    }
                    aVar2.mo99903a(bVar);
                }
                aVar2.mo99884a(aVar);
            }
        }, aVar);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m102575a(Drawable drawable, View view, AbstractC28263b bVar) {
        if (view.getBackground() == null) {
            view.setBackground(drawable);
        }
    }

    /* renamed from: a */
    private void m102576a(NodeParams nodeParams, C28276k kVar, C28079b bVar, C28270g gVar, C28060a aVar) {
        int j = C28040e.m102503j(nodeParams);
        int i = C28040e.m102502i(nodeParams);
        int k = C28040e.m102504k(nodeParams);
        int l = C28040e.m102505l(nodeParams);
        int d = C28040e.m102497d(nodeParams);
        boolean d2 = C28037d.m102475d(nodeParams);
        boolean h = C28037d.m102479h(nodeParams);
        boolean e = C28037d.m102476e(nodeParams);
        if (C28078a.m102637a(d2, e)) {
            kVar.mo100756a(0, j, 0, 0);
            gVar.mo100756a(i, 0, k, l);
        } else {
            gVar.mo100756a(i, j, k, l);
        }
        if (C28078a.m102639b(d2, e)) {
            gVar.mo100756a(i, j, k, l);
            aVar.mo99904a(new CommonHeader.C28077b(C28037d.m102472a(nodeParams), C28037d.m102473b(nodeParams), C28037d.m102474c(nodeParams), true, C28037d.m102476e(nodeParams), "feed"));
        }
        if (h) {
            gVar.mo100728a(new AbstractC28263b.AbstractC28264a(C28209p.m103302b(this.f70232a.mo100596b(), d)) {
                /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1286c.$$Lambda$c$VZvQNFjF7L1x_Tr0UWEohquSKBo */
                public final /* synthetic */ Drawable f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28263b.AbstractC28264a
                public final void onBind(View view, AbstractC28263b bVar) {
                    C28063c.m102575a(this.f$0, view, bVar);
                }
            });
            return;
        }
        gVar.mo100759g(0);
        gVar.mo100761h(0);
        bVar.mo99953a(new CommonHeader.C28076a(C28209p.m103291a(12.0f)));
    }
}
