package com.ss.android.lark.widget.photo_picker.p2951f;

import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.widget.photo_picker.f.b */
public class C58650b {

    /* renamed from: a */
    public long f144832a;

    /* renamed from: b */
    public boolean f144833b;

    /* renamed from: c */
    private int f144834c;

    public C58650b() {
        this(LocationRequest.PRIORITY_INDOOR);
    }

    /* renamed from: a */
    private void m227467a() {
        this.f144832a = 0;
        this.f144833b = false;
    }

    public C58650b(int i) {
        this.f144834c = i;
    }

    /* renamed from: a */
    public C58650b mo198847a(final Runnable runnable) {
        m227467a();
        Log.m165379d("DelayShower", "show delay");
        m227468a(new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.p2951f.C58650b.RunnableC586511 */

            public void run() {
                if (C58650b.this.f144833b) {
                    Log.m165379d("DelayShower", "not need show");
                    return;
                }
                C58650b.this.f144832a = System.currentTimeMillis();
                runnable.run();
                C58650b.this.f144833b = true;
            }
        }, (long) this.f144834c);
        return this;
    }

    /* renamed from: b */
    public C58650b mo198848b(Runnable runnable) {
        long j;
        long j2 = 0;
        if (!this.f144833b) {
            Log.m165379d("DelayShower", "hide and not need to show");
            this.f144833b = true;
            j = 0;
        } else {
            j = ((long) this.f144834c) - (System.currentTimeMillis() - this.f144832a);
        }
        if (j > 0) {
            j2 = j;
        }
        m227468a(runnable, j2);
        return this;
    }

    /* renamed from: a */
    private static void m227468a(Runnable runnable, long j) {
        if (j == 0) {
            runnable.run();
        } else {
            UICallbackExecutor.executeDelayed(runnable, j);
        }
    }
}
