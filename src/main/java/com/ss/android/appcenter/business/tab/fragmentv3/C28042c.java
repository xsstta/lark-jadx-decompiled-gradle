package com.ss.android.appcenter.business.tab.fragmentv3;

import com.ss.android.appcenter.business.tab.fragmentv3.component.C28059c;
import com.ss.android.appcenter.business.tab.fragmentv3.component.C28071e;
import com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper.C28074b;
import com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a.C28048c;
import com.ss.android.appcenter.business.tab.fragmentv3.component.p1285b.C28052a;
import com.ss.android.appcenter.business.tab.fragmentv3.component.p1286c.C28063c;
import com.ss.android.appcenter.engine.AbstractC28245d;
import com.ss.android.appcenter.engine.AbstractC28246e;
import com.ss.android.appcenter.engine.AbstractC28248g;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.vlayout.C28277b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.c */
public class C28042c implements AbstractC28245d {

    /* renamed from: a */
    private Map<String, AbstractC28248g> f70148a = new HashMap();

    public C28042c(AbstractC28246e eVar) {
        m102509a(eVar);
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28245d
    /* renamed from: a */
    public List<C28277b.AbstractC28278a> mo99879a(NodeParams nodeParams) {
        return mo99878a(nodeParams.getComponentName()).mo99885a(nodeParams);
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28245d
    /* renamed from: a */
    public AbstractC28248g mo99878a(String str) {
        if (this.f70148a.get(str) == null) {
            return this.f70148a.get("Default");
        }
        return this.f70148a.get(str);
    }

    /* renamed from: a */
    private void m102509a(AbstractC28246e eVar) {
        this.f70148a.put("Single", new C28071e(eVar));
        this.f70148a.put("Block", new C28048c(eVar));
        this.f70148a.put("FeedSwiper", new C28074b(eVar));
        this.f70148a.put("FeedList", new C28063c(eVar));
        this.f70148a.put("CommonAndRecommend", new C28052a(eVar));
        this.f70148a.put("Default", new C28059c());
    }
}
