package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.AbstractC21395g;
import com.google.android.datatransport.runtime.AbstractC21433h;
import com.google.android.datatransport.runtime.AbstractC21439l;

/* renamed from: com.google.android.datatransport.runtime.scheduling.b */
final /* synthetic */ class RunnableC21490b implements Runnable {

    /* renamed from: a */
    private final C21449a f52133a;

    /* renamed from: b */
    private final AbstractC21439l f52134b;

    /* renamed from: c */
    private final AbstractC21395g f52135c;

    /* renamed from: d */
    private final AbstractC21433h f52136d;

    private RunnableC21490b(C21449a aVar, AbstractC21439l lVar, AbstractC21395g gVar, AbstractC21433h hVar) {
        this.f52133a = aVar;
        this.f52134b = lVar;
        this.f52135c = gVar;
        this.f52136d = hVar;
    }

    /* renamed from: a */
    public static Runnable m77742a(C21449a aVar, AbstractC21439l lVar, AbstractC21395g gVar, AbstractC21433h hVar) {
        return new RunnableC21490b(aVar, lVar, gVar, hVar);
    }

    public void run() {
        C21449a.m77600a(this.f52133a, this.f52134b, this.f52135c, this.f52136d);
    }
}
