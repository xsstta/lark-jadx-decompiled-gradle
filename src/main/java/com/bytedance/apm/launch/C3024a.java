package com.bytedance.apm.launch;

import android.util.Log;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.launch.C3038c;
import com.bytedance.apm.trace.C3088b;

/* renamed from: com.bytedance.apm.launch.a */
public class C3024a {

    /* renamed from: a */
    private C3038c f9747a;

    /* renamed from: b */
    private C3088b.C3090a f9748b;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.launch.a$a */
    public static final class C3026a {

        /* renamed from: a */
        public static final C3024a f9749a = new C3024a();
    }

    private C3024a() {
    }

    /* renamed from: a */
    public static C3024a m12698a() {
        return C3026a.f9749a;
    }

    /* renamed from: b */
    public synchronized C3038c mo12840b() {
        if (this.f9747a == null) {
            this.f9747a = new C3038c.C3039a().mo12856c();
        }
        return this.f9747a;
    }

    /* renamed from: c */
    public synchronized C3088b.C3090a mo12842c() {
        if (this.f9748b == null) {
            this.f9748b = new C3088b.C3090a.C3091a().mo12969a();
        }
        return this.f9748b;
    }

    /* renamed from: a */
    public synchronized void mo12838a(C3038c cVar) {
        this.f9747a = cVar;
    }

    /* renamed from: b */
    public void mo12841b(String str) {
        if (C2785b.m11769j()) {
            Log.d("LaunchAnalysis", str);
        }
    }

    /* renamed from: a */
    public void mo12839a(String str) {
        Log.e("LaunchAnalysis", "notice!!!+ " + str);
    }
}
