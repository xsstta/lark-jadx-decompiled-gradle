package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.AbstractC21439l;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.h */
public final /* synthetic */ class RunnableC21510h implements Runnable {

    /* renamed from: a */
    private final C21509g f52178a;

    /* renamed from: b */
    private final AbstractC21439l f52179b;

    /* renamed from: c */
    private final int f52180c;

    /* renamed from: d */
    private final Runnable f52181d;

    private RunnableC21510h(C21509g gVar, AbstractC21439l lVar, int i, Runnable runnable) {
        this.f52178a = gVar;
        this.f52179b = lVar;
        this.f52180c = i;
        this.f52181d = runnable;
    }

    /* renamed from: a */
    public static Runnable m77804a(C21509g gVar, AbstractC21439l lVar, int i, Runnable runnable) {
        return new RunnableC21510h(gVar, lVar, i, runnable);
    }

    public void run() {
        C21509g.m77800a(this.f52178a, this.f52179b, this.f52180c, this.f52181d);
    }
}
