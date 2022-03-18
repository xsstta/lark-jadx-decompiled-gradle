package com.ss.android.vc.meeting.module.tab.history.p3171a;

import android.content.Context;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;

/* renamed from: com.ss.android.vc.meeting.module.tab.history.a.c */
public class C63276c implements AbstractC63274a {

    /* renamed from: a */
    private final Context f159613a;

    /* renamed from: b */
    private final ITitleController f159614b;

    /* renamed from: c */
    private final C63277d f159615c;

    /* renamed from: d */
    private final C63275b f159616d;

    /* renamed from: e */
    private int f159617e;

    @Override // com.ss.android.vc.meeting.module.tab.history.p3171a.AbstractC63274a
    /* renamed from: a */
    public void mo218965a() {
        this.f159615c.mo218973a(ITitleInfo.IconStyle.Hide);
        this.f159614b.mo99191a(this.f159615c);
    }

    /* renamed from: b */
    public void mo218972b(boolean z) {
        this.f159614b.mo99194b(z);
        this.f159615c.mo218975a(false);
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.p3171a.AbstractC63274a
    /* renamed from: a */
    public void mo218967a(String str) {
        this.f159615c.mo218974a(str);
        this.f159614b.mo99191a(this.f159615c);
    }

    /* renamed from: a */
    public void mo218971a(boolean z) {
        this.f159614b.mo99192a(z);
        this.f159615c.mo218975a(true);
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.p3171a.AbstractC63274a
    /* renamed from: a */
    public void mo218966a(int i, int i2) {
        int a = this.f159616d.mo218969a(this.f159617e, i2);
        this.f159617e = a;
        if (this.f159616d.mo218970a(this.f159616d.mo218968a(a))) {
            mo218971a(true);
        } else {
            mo218972b(true);
        }
    }

    public C63276c(Context context, ITitleController iTitleController, C63277d dVar) {
        this.f159613a = context;
        this.f159614b = iTitleController;
        this.f159615c = dVar;
        int a = iTitleController.mo99189a();
        this.f159617e = a;
        this.f159616d = new C63275b(a, a);
    }
}
