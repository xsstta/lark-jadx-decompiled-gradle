package com.ss.android.lark.player.p2513c;

import android.os.Bundle;
import com.ss.android.lark.player.entity.C52129a;

/* renamed from: com.ss.android.lark.player.c.a */
public abstract class AbstractC52102a implements AbstractC52107b {

    /* renamed from: a */
    protected AbstractC52103a f129271a;

    /* renamed from: b */
    private int f129272b;

    /* renamed from: c */
    private AbstractC52111l f129273c;

    /* renamed from: d */
    private AbstractC52110k f129274d;

    /* renamed from: e */
    private AbstractC52109j f129275e;

    /* renamed from: f */
    private int f129276f;

    /* renamed from: com.ss.android.lark.player.c.a$a */
    public interface AbstractC52103a {
        void onVideoSizeChanged(float f, float f2);
    }

    /* renamed from: a */
    public int mo178474a() {
        return this.f129276f;
    }

    /* renamed from: b */
    public final int mo178481b() {
        return this.f129272b;
    }

    /* renamed from: a */
    public void mo178477a(AbstractC52103a aVar) {
        this.f129271a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo178475a(int i) {
        this.f129272b = i;
        Bundle a = C52129a.m202238a();
        a.putInt("int_data", i);
        mo178476a(-99031, a);
    }

    /* renamed from: a */
    public final void mo178478a(AbstractC52109j jVar) {
        this.f129275e = jVar;
    }

    /* renamed from: a */
    public final void mo178479a(AbstractC52110k kVar) {
        this.f129274d = kVar;
    }

    /* renamed from: a */
    public final void mo178480a(AbstractC52111l lVar) {
        this.f129273c = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo178476a(int i, Bundle bundle) {
        AbstractC52111l lVar = this.f129273c;
        if (lVar != null) {
            lVar.mo140068a(i, bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo178482b(int i, Bundle bundle) {
        AbstractC52110k kVar = this.f129274d;
        if (kVar != null) {
            kVar.mo140067a(i, bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo178483c(int i, Bundle bundle) {
        this.f129276f = i;
        AbstractC52109j jVar = this.f129275e;
        if (jVar != null) {
            jVar.mo178515a(i, bundle);
        }
    }
}
