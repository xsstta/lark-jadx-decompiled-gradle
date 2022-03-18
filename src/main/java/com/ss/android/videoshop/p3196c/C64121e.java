package com.ss.android.videoshop.p3196c;

import com.ss.ttvideoengine.Resolution;

/* renamed from: com.ss.android.videoshop.c.e */
public class C64121e extends C64119c {

    /* renamed from: a */
    private String f161913a;

    /* renamed from: b */
    private boolean f161914b;

    /* renamed from: c */
    private Resolution f161915c;

    public C64121e(int i, Resolution resolution, boolean z) {
        super(i);
        this.f161915c = resolution;
        if (resolution != null) {
            this.f161913a = resolution.toString();
        }
        this.f161914b = z;
    }
}
