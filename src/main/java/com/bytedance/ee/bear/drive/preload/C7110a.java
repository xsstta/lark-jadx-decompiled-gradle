package com.bytedance.ee.bear.drive.preload;

import com.bytedance.ee.bear.contract.drive.sdk.entity.open.PreloadEntity;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.ee.bear.drive.preload.a */
public class C7110a {

    /* renamed from: a */
    private C10917c f19147a = new C10917c(new C10929e());

    /* renamed from: a */
    public void mo27834a(ArrayList<PreloadEntity> arrayList) {
        if (C13657b.m55421a(arrayList)) {
            C13479a.m54758a("DriveSdk", "DriveSdkPreloadManager#preload() param error");
            return;
        }
        Iterator<PreloadEntity> it = arrayList.iterator();
        while (it.hasNext()) {
            PreloadEntity next = it.next();
            new C7118f(this.f19147a, next.mo20601a(), next.mo20602b(), next.mo20603c()).mo27849a();
        }
    }
}
