package com.ss.android.vc.meeting.module.tab3.list.p3174a;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.a.c */
public class C63371c implements AbstractC63369a {

    /* renamed from: a */
    private final Context f159988a;

    /* renamed from: b */
    private final ITitleController f159989b;

    /* renamed from: c */
    private final C63372d f159990c;

    /* renamed from: d */
    private final C63370b f159991d;

    /* renamed from: e */
    private int f159992e;

    @Override // com.ss.android.vc.meeting.module.tab3.list.p3174a.AbstractC63369a
    /* renamed from: a */
    public void mo219283a() {
        this.f159990c.mo219290a(ITitleInfo.IconStyle.Hide);
        this.f159989b.mo99191a(this.f159990c);
    }

    /* renamed from: b */
    public void mo219289b(boolean z) {
        this.f159989b.mo99194b(z);
        this.f159990c.mo219292a(false);
    }

    @Override // com.ss.android.vc.meeting.module.tab3.list.p3174a.AbstractC63369a
    /* renamed from: a */
    public void mo219285a(String str) {
        this.f159990c.mo219291a(str);
        this.f159989b.mo99191a(this.f159990c);
    }

    /* renamed from: a */
    public void mo219288a(boolean z) {
        this.f159989b.mo99192a(z);
        this.f159990c.mo219292a(true);
    }

    @Override // com.ss.android.vc.meeting.module.tab3.list.p3174a.AbstractC63369a
    /* renamed from: a */
    public void mo219284a(int i, int i2) {
        int a = this.f159991d.mo219287a(this.f159992e, i2);
        this.f159992e = a;
        float a2 = this.f159991d.mo219286a(a);
        Log.m165379d("VCTitleControllerWrapper", "onScrollBy, height:" + this.f159992e + ", alpha:" + a2 + ", visible:" + true);
        mo219288a(true);
    }

    public C63371c(Context context, ITitleController iTitleController, C63372d dVar) {
        this.f159988a = context;
        this.f159989b = iTitleController;
        this.f159990c = dVar;
        int a = iTitleController.mo99189a();
        this.f159992e = a;
        this.f159991d = new C63370b(a, a);
    }
}
