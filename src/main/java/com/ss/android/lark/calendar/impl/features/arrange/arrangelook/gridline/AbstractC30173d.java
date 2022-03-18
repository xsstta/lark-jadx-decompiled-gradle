package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline;

import android.view.View;
import java.util.Objects;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.d */
public abstract class AbstractC30173d<T extends View> {

    /* renamed from: a */
    Object[] f75310a;

    /* renamed from: b */
    int f75311b;

    /* renamed from: c */
    int f75312c = 0;

    /* renamed from: d */
    private AbstractC30174a f75313d;

    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.d$a */
    public interface AbstractC30174a<R> {
        /* renamed from: b */
        int mo108749b();

        /* renamed from: c */
        R mo108750c();
    }

    /* renamed from: a */
    public synchronized void mo108791a() {
        this.f75310a = new Object[this.f75311b];
    }

    public AbstractC30173d(AbstractC30174a aVar) {
        Objects.requireNonNull(aVar, "factory must not be null!");
        int b = aVar.mo108749b();
        this.f75311b = b;
        this.f75310a = new Object[b];
        this.f75313d = aVar;
    }

    /* renamed from: c */
    private boolean m111796c(T t) {
        for (int i = 0; i < this.f75312c; i++) {
            if (t.equals(this.f75310a[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public synchronized void mo108792a(int i) {
        while (true) {
            int i2 = this.f75312c;
            if (i2 < i && i2 < this.f75311b) {
                Object[] objArr = this.f75310a;
                this.f75312c = i2 + 1;
                objArr[i2] = this.f75313d.mo108750c();
            }
        }
    }

    /* renamed from: b */
    private boolean m111795b(T t) {
        for (int i = 0; i < this.f75312c; i++) {
            if (t.equals(this.f75310a[i])) {
                int i2 = (this.f75312c - i) - 1;
                if (i2 > 0) {
                    Object[] objArr = this.f75310a;
                    System.arraycopy(objArr, i + 1, objArr, i, i2);
                }
                Object[] objArr2 = this.f75310a;
                int i3 = this.f75312c - 1;
                this.f75312c = i3;
                objArr2[i3] = null;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public synchronized void mo108794a(T t) {
        if (t != null) {
            do {
            } while (m111795b(t));
        }
    }

    /* renamed from: b */
    public synchronized T mo108795b(int i) {
        int i2 = this.f75312c;
        if (i2 > 0) {
            Object[] objArr = this.f75310a;
            T t = (T) ((View) objArr[i2 - 1]);
            int i3 = i2 - 1;
            this.f75312c = i3;
            objArr[i3] = null;
            return t;
        }
        return (T) ((View) this.f75313d.mo108750c());
    }

    /* renamed from: a */
    public synchronized void mo108793a(int i, T t) {
        if (t != null) {
            if (this.f75312c < this.f75311b && !m111796c(t)) {
                Object[] objArr = this.f75310a;
                int i2 = this.f75312c;
                this.f75312c = i2 + 1;
                objArr[i2] = t;
            }
        }
    }
}
