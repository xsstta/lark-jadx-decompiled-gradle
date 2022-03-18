package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: a */
    protected final AbstractC21667e f52619a;

    private static AbstractC21667e getChimeraLifecycleFragmentImpl(C21666d dVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void mo73326a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo73327a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo73328a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public void mo73329b() {
    }

    /* renamed from: b */
    public void mo73330b(Bundle bundle) {
    }

    /* renamed from: c */
    public void mo73331c() {
    }

    /* renamed from: d */
    public void mo73332d() {
    }

    /* renamed from: e */
    public void mo73333e() {
    }

    /* renamed from: a */
    protected static AbstractC21667e m78341a(C21666d dVar) {
        if (dVar.mo73474a()) {
            return cv.m78720a(dVar.mo73477d());
        }
        if (dVar.mo73475b()) {
            return zza.m78839a(dVar.mo73476c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    /* renamed from: a */
    public static AbstractC21667e m78340a(Activity activity) {
        return m78341a(new C21666d(activity));
    }

    protected LifecycleCallback(AbstractC21667e eVar) {
        this.f52619a = eVar;
    }

    /* renamed from: a */
    public Activity mo73325a() {
        return this.f52619a.mo73470a();
    }
}
