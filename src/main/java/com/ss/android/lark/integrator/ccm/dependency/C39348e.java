package com.ss.android.lark.integrator.ccm.dependency;

import com.bytedance.ee.bear.basesdk.apisupport.AbstractC4433s;
import com.ss.android.lark.integrator.ccm.dependency.p2015a.C39317l;
import com.ss.android.lark.log.Log;
import org.koin.core.module.Module;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.integrator.ccm.dependency.e */
public class C39348e implements AbstractC4433s {
    C39348e() {
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4433s
    /* renamed from: a */
    public Module mo17162a() {
        if (C39317l.m155047b()) {
            Log.m165379d("SpacekitDependencyImpl", "spacekitDependencyModule return empty.");
            return new Module(false, false);
        }
        Log.m165397w("SpacekitDependencyImpl", "spacekitDependencyModule return getLarkAppKoinModule() value.");
        return C39317l.m155046a();
    }
}
