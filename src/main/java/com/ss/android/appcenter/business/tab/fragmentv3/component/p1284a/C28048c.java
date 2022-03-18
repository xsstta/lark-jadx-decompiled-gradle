package com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a;

import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28040e;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.engine.AbstractC28246e;
import com.ss.android.appcenter.engine.AbstractC28248g;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.p1299a.C28237a;
import com.ss.android.appcenter.engine.vlayout.C28277b;
import com.ss.android.appcenter.engine.vlayout.p1301a.C28270g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.a.c */
public class C28048c implements AbstractC28248g {

    /* renamed from: a */
    public AbstractC28246e f70171a;

    public C28048c(AbstractC28246e eVar) {
        this.f70171a = eVar;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28248g
    /* renamed from: a */
    public List<C28277b.AbstractC28278a> mo99885a(final NodeParams nodeParams) {
        C28184h.m103250d("BlockTransformer", "transform>>> " + nodeParams);
        ArrayList arrayList = new ArrayList();
        C28270g gVar = new C28270g(1);
        gVar.mo100763i(C28040e.m102503j(nodeParams));
        gVar.mo100759g(C28040e.m102502i(nodeParams));
        gVar.mo100761h(C28040e.m102504k(nodeParams));
        gVar.mo100764j(C28040e.m102505l(nodeParams));
        final C28046b bVar = new C28046b(this.f70171a.mo100596b(), gVar, new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a.C28048c.View$OnClickListenerC280491 */

            public void onClick(View view) {
                C28048c.this.f70171a.mo100598d().mo99987a(nodeParams.getKey());
            }
        }, nodeParams, this.f70171a);
        arrayList.add(bVar);
        final String key = nodeParams.getKey();
        this.f70171a.mo100598d().mo99988a(key, this.f70171a.mo100601g(), new AbstractC1178x<C28237a>() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a.C28048c.C280502 */

            /* renamed from: a */
            public void onChanged(C28237a aVar) {
                C28184h.m103250d("BlockTransformer", "onChanged>>> key:" + key + " data:" + aVar);
                bVar.mo99884a(aVar);
            }
        }, new C28237a());
        return arrayList;
    }
}
