package com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper;

import com.ss.android.appcenter.business.tab.fragmentv3.component.C28065d;
import com.ss.android.appcenter.engine.AbstractC28246e;
import com.ss.android.appcenter.engine.AbstractC28248g;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.vlayout.C28277b;
import com.ss.android.appcenter.engine.vlayout.p1301a.C28276k;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper.b */
public class C28074b implements AbstractC28248g {

    /* renamed from: a */
    private AbstractC28246e f70272a;

    public C28074b(AbstractC28246e eVar) {
        this.f70272a = eVar;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28248g
    /* renamed from: a */
    public List<C28277b.AbstractC28278a> mo99885a(NodeParams nodeParams) {
        return Arrays.asList(new C28065d(this.f70272a, nodeParams, new C28276k()));
    }
}
