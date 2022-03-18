package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b;
import com.ss.android.lark.dependency.AbstractC36454ac;
import com.ss.android.lark.integrator.im.C39603g;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.t */
class C39546t implements AbstractC36454ac {

    /* renamed from: a */
    private AbstractC29555b f101003a = C39603g.m157159a().getCoreDependency().mo143386L();

    @Override // com.ss.android.lark.dependency.AbstractC36454ac
    /* renamed from: a */
    public int mo134409a() {
        return 4098;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36454ac
    /* renamed from: b */
    public int mo134414b() {
        return 4100;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36454ac
    /* renamed from: c */
    public String mo134417c() {
        return this.f101003a.mo105699a();
    }

    C39546t() {
    }

    @Override // com.ss.android.lark.dependency.AbstractC36454ac
    /* renamed from: b */
    public Bundle mo134415b(Bundle bundle) {
        bundle.putInt("open_fragment_id", 4098);
        return bundle;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36454ac
    /* renamed from: a */
    public Bundle mo134412a(Bundle bundle) {
        bundle.putInt("open_fragment_id", 4100);
        return bundle;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36454ac
    /* renamed from: b */
    public void mo134416b(Context context, String str) {
        this.f101003a.mo105709c(context, str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36454ac
    /* renamed from: a */
    public void mo134413a(Context context, String str) {
        this.f101003a.mo105706b(context, str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36454ac
    /* renamed from: a */
    public Intent mo134410a(Context context, Bundle bundle, int i) {
        return this.f101003a.mo105696a(context, bundle, i);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36454ac
    /* renamed from: a */
    public Intent mo134411a(Context context, String str, Bundle bundle) {
        return this.f101003a.mo105698a(context, str, bundle);
    }
}
