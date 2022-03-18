package com.bytedance.ee.bear.domain;

import com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.Map;

/* access modifiers changed from: package-private */
public class SpaceKitUrlHelper$1 extends BinderOnDomainCharacteristicChangeListener.Stub {
    final /* synthetic */ C6313i this$0;

    SpaceKitUrlHelper$1(C6313i iVar) {
        this.this$0 = iVar;
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a.AbstractC6309a
    public void onConfigChanged(Map<String, String> map) {
        if (!C13657b.m55422a(map)) {
            C13479a.m54764b("SpaceKitUrlHelper", "onConfigChanged()...");
            this.this$0.mo25402j(map.get(C6306d.f17470d));
            this.this$0.mo25403k(map.get(C6306d.f17469c));
        }
    }
}
