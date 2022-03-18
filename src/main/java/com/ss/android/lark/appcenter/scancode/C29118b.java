package com.ss.android.lark.appcenter.scancode;

import android.content.Context;
import android.os.Vibrator;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;

/* renamed from: com.ss.android.lark.appcenter.scancode.b */
public class C29118b {

    /* renamed from: a */
    private Context f72939a;

    /* renamed from: b */
    private AppCenterModule.AbstractC29127a f72940b;

    /* renamed from: com.ss.android.lark.appcenter.scancode.b$a */
    private static final class C29120a {

        /* renamed from: a */
        public static final C29118b f72941a = new C29118b();
    }

    /* renamed from: b */
    public void mo103281b() {
        this.f72940b = null;
    }

    /* renamed from: c */
    public void mo103282c() {
        this.f72939a = null;
    }

    private C29118b() {
    }

    /* renamed from: a */
    public static C29118b m107036a() {
        return C29120a.f72941a;
    }

    /* renamed from: d */
    private void m107037d() {
        Vibrator vibrator;
        Context context = this.f72939a;
        if (context != null && (vibrator = (Vibrator) context.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200);
        }
    }

    /* renamed from: a */
    public void mo103277a(Context context) {
        this.f72939a = context;
    }

    /* renamed from: a */
    public void mo103279a(AppCenterModule.AbstractC29127a aVar) {
        this.f72940b = aVar;
    }

    /* renamed from: a */
    public boolean mo103280a(String str, int i) {
        AppCenterModule.AbstractC29127a aVar = this.f72940b;
        if (aVar == null || !aVar.handleResult(this.f72939a, str, i)) {
            m107037d();
            return false;
        }
        m107037d();
        return true;
    }

    /* renamed from: a */
    public void mo103278a(Context context, int[] iArr, boolean z) {
        ScanCodeActivity.m106999a(context, iArr, z);
    }
}
