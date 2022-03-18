package com.tt.p3256b;

import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.tt.b.a */
public abstract class AbstractC65679a {

    /* renamed from: a */
    private boolean f165492a;

    /* renamed from: a */
    public void mo49077a(int i) {
    }

    /* renamed from: a */
    public void mo49078a(Intent intent) {
    }

    /* renamed from: a */
    public void mo49079a(Intent intent, int i, int i2) {
    }

    /* renamed from: a */
    public void mo229925a(String str, float f) {
    }

    /* renamed from: a */
    public void mo49080a(String str, boolean z) {
    }

    /* renamed from: b */
    public void mo49081b() {
    }

    /* renamed from: b */
    public void mo49082b(Intent intent) {
    }

    /* renamed from: c */
    public void mo49083c() {
    }

    /* renamed from: d */
    public void mo49084d() {
    }

    /* renamed from: e */
    public void mo49085e() {
    }

    /* renamed from: f */
    public final void mo229927f() {
        this.f165492a = true;
        mo49083c();
    }

    /* renamed from: b */
    public final void mo229926b(int i) {
        AppBrandLogger.m52830i("tma_MiniAppLifeCycle", "onActivityExit:" + i);
        if (!this.f165492a) {
            mo49077a(i);
        }
    }
}
