package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import com.ss.android.lark.dependency.ak;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.ab */
public class C39495ab implements ak {
    @Override // com.ss.android.lark.dependency.ak
    /* renamed from: a */
    public ISearchLifecycleObserver mo134459a() {
        return C39603g.m157159a().getCoreDependency().ak();
    }

    @Override // com.ss.android.lark.dependency.ak
    /* renamed from: a */
    public void mo134461a(Context context, String str, boolean z) {
        C39603g.m157159a().getCoreDependency().mo143450a(context, str, z);
    }

    @Override // com.ss.android.lark.dependency.ak
    /* renamed from: a */
    public void mo134460a(Context context, String str, String str2, int i) {
        C39603g.m157159a().getCoreDependency().mo143445a(context, str, str2, i);
    }
}
