package com.bytedance.ee.bear.basesdk.services;

import android.app.Application;
import com.bytedance.ee.bear.contract.AbstractC5080aa;
import com.bytedance.ee.bear.contract.AbstractC5124d;
import com.bytedance.ee.log.C13479a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.basesdk.services.c */
public class C4502c extends AbstractC5124d {

    /* renamed from: b */
    private static AbstractC5080aa.AbstractC5081a f13186b;

    /* renamed from: a */
    private final String f13187a = "SDKBadgeServiceImp";

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5124d, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    /* renamed from: a */
    public static void m18562a(AbstractC5080aa.AbstractC5081a aVar) {
        f13186b = aVar;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5080aa
    public void remove(String str) {
        C13479a.m54764b("SDKBadgeServiceImp", "remove doc feed: ");
        AbstractC5080aa.AbstractC5081a aVar = f13186b;
        if (aVar != null) {
            aVar.remove(str);
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5080aa
    public void read(String str, int i, List<String> list) {
        if (list != null) {
            C13479a.m54764b("SDKBadgeServiceImp", "read badge:" + list.toString());
        }
        AbstractC5080aa.AbstractC5081a aVar = f13186b;
        if (aVar != null) {
            aVar.read(str, i, list);
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5080aa
    public void updateBadge(String str, long j, long j2) {
        C13479a.m54764b("SDKBadgeServiceImp", "update badge: " + j + ", version= " + j2);
        AbstractC5080aa.AbstractC5081a aVar = f13186b;
        if (aVar != null) {
            aVar.updateBadge(str, j, j2);
        }
    }
}
