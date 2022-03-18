package com.bytedance.ee.bear.notification;

import android.text.TextUtils;
import com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener;
import com.bytedance.ee.bear.domain.C6306d;
import com.bytedance.ee.bear.notification.AbstractC10323d;
import java.util.Map;

/* access modifiers changed from: package-private */
public class NotificationViewModel$11 extends BinderOnDomainCharacteristicChangeListener.Stub {
    private String oldUnitId;
    final /* synthetic */ C10350i this$0;
    final /* synthetic */ AbstractC10323d.AbstractC10325b val$listener;

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a.AbstractC6309a
    public void onConfigChanged(Map<String, String> map) {
        String str = map.get(C6306d.f17474h);
        if (!TextUtils.equals(this.oldUnitId, str)) {
            this.val$listener.mo39434a(str);
        }
        this.oldUnitId = str;
    }

    NotificationViewModel$11(C10350i iVar, AbstractC10323d.AbstractC10325b bVar) {
        this.this$0 = iVar;
        this.val$listener = bVar;
    }
}
