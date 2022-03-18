package com.bytedance.apm.block;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.AbstractC2936g;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.C2941h;
import com.bytedance.apm.block.p136a.C2848f;
import com.bytedance.apm.config.C2895f;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.services.apm.api.AbstractC20698c;

/* renamed from: com.bytedance.apm.block.b */
public class C2863b extends AbstractC2833a implements AbstractC2936g, AbstractC20698c {

    /* renamed from: a */
    private boolean f9139a;

    /* renamed from: b */
    private boolean f9140b;

    /* renamed from: c */
    private C2872j f9141c = C2872j.m12082a();

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityPause(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityResume(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onChange(Activity activity, Fragment fragment) {
    }

    /* renamed from: c */
    public void mo12306c() {
        if (this.f9139a && !this.f9140b) {
            this.f9140b = true;
            if (C2785b.m11769j()) {
                C2925e.m12375d("BlockDetector", "BlockDetector start: ");
            }
        }
    }

    /* renamed from: d */
    public void mo12307d() {
        if (this.f9140b) {
            this.f9140b = false;
            this.f9141c.mo12322b(false);
            if (C2785b.m11769j()) {
                C2925e.m12375d("BlockDetector", "BlockDetector stop: ");
            }
        }
    }

    /* renamed from: b */
    public void mo12305b() {
        ActivityLifeObserver.getInstance().register(this);
        C2941h.m12400a(this);
        this.f9141c.mo12320b();
        C2848f.m12008a().mo12243a(this);
        this.f9139a = true;
        if (C2785b.m11769j()) {
            C2925e.m12375d("BlockDetector", "BlockDetector init: ");
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onBackground(Activity activity) {
        mo12307d();
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onFront(Activity activity) {
        mo12306c();
    }

    /* renamed from: a */
    public void mo12302a(long j) {
        this.f9141c.mo12321b(j);
    }

    @Override // com.bytedance.apm.block.AbstractC2833a
    /* renamed from: a */
    public void mo12214a(String str) {
        super.mo12214a(str);
        if (this.f9140b) {
            this.f9141c.mo12317a(str);
        }
    }

    /* renamed from: a */
    public void mo12304a(boolean z) {
        this.f9141c.mo12328f(z);
    }

    @Override // com.bytedance.apm.AbstractC2936g
    /* renamed from: a */
    public void mo12303a(C2895f fVar) {
        boolean z;
        if (fVar != null) {
            long f = fVar.mo12500f();
            long e = fVar.mo12498e();
            boolean b = fVar.mo12491b();
            boolean a = fVar.mo12488a();
            this.f9141c.mo12318a(b);
            this.f9141c.mo12321b(f);
            this.f9141c.mo12324c(e);
            this.f9141c.mo12327e(a);
            C2872j jVar = this.f9141c;
            boolean z2 = false;
            if (C2785b.m11752b() || fVar.mo12505h()) {
                z = true;
            } else {
                z = false;
            }
            jVar.mo12325c(z);
            C2872j jVar2 = this.f9141c;
            if (C2785b.m11752b() || fVar.mo12497d()) {
                z2 = true;
            }
            jVar2.mo12326d(z2);
        }
    }

    @Override // com.bytedance.apm.block.AbstractC2833a
    /* renamed from: a */
    public void mo12213a(long j, long j2, long j3, long j4, boolean z) {
        super.mo12213a(j, j2, j3, j4, z);
        if (this.f9140b) {
            this.f9141c.mo12322b(z);
        }
    }
}
