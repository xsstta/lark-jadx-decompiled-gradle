package com.ss.android.lark.mail.impl.p2171h.p2173b;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42239f;
import com.ss.android.lark.mail.impl.utils.C43767j;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.c */
public class C42255c extends AbstractC42231a<C42239f> {

    /* renamed from: d */
    private static long f107591d;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: d */
    public String mo152326d() {
        return "email_apm_create_draft_start";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: e */
    public String mo152328e() {
        return "email_apm_create_draft";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C42239f mo152324c(String str) {
        return null;
    }

    /* renamed from: a */
    public static void m168802a(long j) {
        f107591d = j;
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: b */
    public void mo152321b(String str) {
        super.mo152321b(str);
        if (f107591d == 0) {
            f107591d = System.currentTimeMillis();
        }
        ((AbstractC42231a.C42234b) this.f107788m).f107520i = f107591d;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: a */
    public JSONObject mo152315a(AbstractC42231a<C42239f>.C42232a aVar) {
        f107591d = 0;
        return C43767j.m173489a().mo155933a("sence", aVar.f107521j).mo155930a("mail_body_length", (float) aVar.f107511b).mo155930a("time_cost_ms", (float) aVar.f107512c).mo155933a(UpdateKey.STATUS, aVar.f107510a).mo155934a();
    }
}
