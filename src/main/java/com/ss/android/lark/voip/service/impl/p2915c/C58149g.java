package com.ss.android.lark.voip.service.impl.p2915c;

import com.ss.android.lark.voip.C57977a;
import com.ss.android.vc.impl.AbstractC61012a;
import com.ss.android.vc.impl.AbstractC61014c;
import com.ss.android.vc.irtc.AbstractC61026e;
import com.ss.android.vc.irtc.C61065q;

/* renamed from: com.ss.android.lark.voip.service.impl.c.g */
public class C58149g extends AbstractC61012a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.voip.service.impl.c.g$a */
    public static class C58150a {

        /* renamed from: a */
        public static final C58149g f143044a = new C58149g();
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: b */
    public String mo197061b() {
        return "2613a1a075a8416faede1c39";
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: d */
    public C61065q mo197063d() {
        return null;
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: e */
    public boolean mo197064e() {
        return false;
    }

    /* renamed from: a */
    public static C58149g m225570a() {
        return C58150a.f143044a;
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: f */
    public AbstractC61026e mo197065f() {
        return VoipLogListener.f143042a;
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: g */
    public AbstractC61014c mo197066g() {
        return VoipRtcLogListener.f143043a;
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: c */
    public String mo197062c() {
        return C57977a.m224905c().getDeviceId();
    }
}
