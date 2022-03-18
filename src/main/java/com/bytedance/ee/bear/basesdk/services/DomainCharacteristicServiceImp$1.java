package com.bytedance.ee.bear.basesdk.services;

import com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener;
import java.util.Map;

/* access modifiers changed from: package-private */
public class DomainCharacteristicServiceImp$1 extends BinderOnDomainCharacteristicChangeListener.Stub {
    final /* synthetic */ C4507e this$0;

    DomainCharacteristicServiceImp$1(C4507e eVar) {
        this.this$0 = eVar;
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a.AbstractC6309a
    public void onConfigChanged(Map<String, String> map) {
        for (BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener : this.this$0.f13191a) {
            binderOnDomainCharacteristicChangeListener.onConfigChanged(map);
        }
    }
}
