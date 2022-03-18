package com.ss.android.lark.guide.ui.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/guide/ui/common/StepChain;", "", "control", "Lcom/ss/android/lark/guide/ui/common/StepControl;", "stepList", "", "Lcom/ss/android/lark/guide/ui/common/Step;", "index", "", "(Lcom/ss/android/lark/guide/ui/common/StepControl;Ljava/util/List;I)V", "nextIndex", "prevIndex", "cache", "", "obj", "curIndex", "getCache", "isFirst", "", "isLast", "next", "prev", "total", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.common.b */
public final class StepChain {

    /* renamed from: a */
    private int f99428a;

    /* renamed from: b */
    private int f99429b;

    /* renamed from: c */
    private final StepControl f99430c;

    /* renamed from: d */
    private final List<Step> f99431d;

    /* renamed from: e */
    private final int f99432e;

    /* renamed from: c */
    public final int mo141676c() {
        return this.f99432e;
    }

    /* renamed from: d */
    public final boolean mo141677d() {
        if (this.f99432e == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo141678e() {
        return this.f99431d.size();
    }

    /* renamed from: f */
    public final Object mo141679f() {
        return this.f99430c.mo141685c();
    }

    /* renamed from: a */
    public final boolean mo141674a() {
        if (this.f99428a > this.f99431d.size() - 1) {
            this.f99430c.mo141688f();
            return false;
        }
        StepChain bVar = new StepChain(this.f99430c, this.f99431d, this.f99428a);
        this.f99430c.mo141681a(bVar);
        return this.f99431d.get(this.f99428a).mo141665a(bVar);
    }

    /* renamed from: b */
    public final boolean mo141675b() {
        int i = this.f99429b;
        if (i < 0) {
            return false;
        }
        StepChain bVar = new StepChain(this.f99430c, this.f99431d, this.f99429b);
        this.f99430c.mo141681a(bVar);
        return this.f99431d.get(i).mo141665a(bVar);
    }

    /* renamed from: a */
    public final void mo141673a(Object obj) {
        this.f99430c.mo141682a(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.guide.ui.common.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public StepChain(StepControl cVar, List<? extends Step> list, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "control");
        Intrinsics.checkParameterIsNotNull(list, "stepList");
        this.f99430c = cVar;
        this.f99431d = list;
        this.f99432e = i;
        this.f99428a = i + 1;
        this.f99429b = i - 1;
    }
}
