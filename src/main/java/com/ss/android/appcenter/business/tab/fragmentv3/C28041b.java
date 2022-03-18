package com.ss.android.appcenter.business.tab.fragmentv3;

import com.ss.android.appcenter.business.tab.fragmentv3.component.C28051b;
import com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper.C28075c;
import com.ss.android.appcenter.engine.AbstractC28240b;
import com.ss.android.appcenter.engine.AbstractC28244c;
import com.ss.android.appcenter.engine.AbstractC28246e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.b */
public class C28041b implements AbstractC28244c {

    /* renamed from: a */
    private final Map<String, AbstractC28240b> f70147a = new HashMap();

    public C28041b(AbstractC28246e eVar) {
        m102506a(eVar);
    }

    /* renamed from: a */
    private void m102506a(AbstractC28246e eVar) {
        mo99877a("FeedSwiper", new C28075c(eVar));
        mo99877a("Default", new C28051b());
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28244c
    /* renamed from: a */
    public AbstractC28240b mo99876a(String str) {
        if (!this.f70147a.containsKey(str)) {
            return this.f70147a.get("Default");
        }
        return this.f70147a.get(str);
    }

    /* renamed from: a */
    public void mo99877a(String str, AbstractC28240b bVar) {
        this.f70147a.put(str, bVar);
    }
}
