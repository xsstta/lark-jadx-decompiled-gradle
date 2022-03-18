package com.prolificinteractive.materialcalendarview;

import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.prolificinteractive.materialcalendarview.i */
public class C27000i {

    /* renamed from: a */
    private boolean f67060a = false;

    /* renamed from: b */
    private Drawable f67061b;

    /* renamed from: c */
    private Drawable f67062c;

    /* renamed from: d */
    private final LinkedList<C27001a> f67063d = new LinkedList<>();

    /* renamed from: e */
    private boolean f67064e = false;

    /* access modifiers changed from: package-private */
    /* renamed from: com.prolificinteractive.materialcalendarview.i$a */
    public static class C27001a {

        /* renamed from: a */
        final Object f67065a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo96094b() {
        return this.f67060a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Drawable mo96095c() {
        return this.f67062c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Drawable mo96096d() {
        return this.f67061b;
    }

    /* renamed from: f */
    public boolean mo96098f() {
        return this.f67064e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<C27001a> mo96097e() {
        return Collections.unmodifiableList(this.f67063d);
    }

    C27000i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo96090a() {
        this.f67061b = null;
        this.f67062c = null;
        this.f67063d.clear();
        this.f67060a = false;
        this.f67064e = false;
    }

    /* renamed from: b */
    public void mo96093b(Drawable drawable) {
        if (drawable != null) {
            this.f67062c = drawable;
            this.f67060a = true;
            return;
        }
        throw new IllegalArgumentException("Cannot be null");
    }

    /* renamed from: a */
    public void mo96091a(Drawable drawable) {
        if (drawable != null) {
            this.f67061b = drawable;
            this.f67060a = true;
            return;
        }
        throw new IllegalArgumentException("Cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo96092a(C27000i iVar) {
        Drawable drawable = this.f67062c;
        if (drawable != null) {
            iVar.mo96093b(drawable);
        }
        Drawable drawable2 = this.f67061b;
        if (drawable2 != null) {
            iVar.mo96091a(drawable2);
        }
        iVar.f67063d.addAll(this.f67063d);
        iVar.f67060a |= this.f67060a;
        iVar.f67064e = this.f67064e;
    }
}
