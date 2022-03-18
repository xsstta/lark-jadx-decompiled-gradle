package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.a */
public class C22139a {

    /* renamed from: a */
    private final View f53858a;

    /* renamed from: b */
    private int f53859b;

    /* renamed from: c */
    private int f53860c;

    /* renamed from: d */
    private int f53861d;

    /* renamed from: e */
    private int f53862e;

    /* renamed from: f */
    private boolean f53863f = true;

    /* renamed from: g */
    private boolean f53864g = true;

    /* renamed from: c */
    public int mo76481c() {
        return this.f53861d;
    }

    /* renamed from: d */
    public int mo76482d() {
        return this.f53862e;
    }

    /* renamed from: e */
    public int mo76483e() {
        return this.f53859b;
    }

    /* renamed from: f */
    public boolean mo76484f() {
        return this.f53863f;
    }

    /* renamed from: g */
    public boolean mo76485g() {
        return this.f53864g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76475a() {
        this.f53859b = this.f53858a.getTop();
        this.f53860c = this.f53858a.getLeft();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo76478b() {
        View view = this.f53858a;
        ViewCompat.m4087i(view, this.f53861d - (view.getTop() - this.f53859b));
        View view2 = this.f53858a;
        ViewCompat.m4089j(view2, this.f53862e - (view2.getLeft() - this.f53860c));
    }

    /* renamed from: a */
    public void mo76476a(boolean z) {
        this.f53863f = z;
    }

    /* renamed from: b */
    public void mo76479b(boolean z) {
        this.f53864g = z;
    }

    public C22139a(View view) {
        this.f53858a = view;
    }

    /* renamed from: a */
    public boolean mo76477a(int i) {
        if (!this.f53863f || this.f53861d == i) {
            return false;
        }
        this.f53861d = i;
        mo76478b();
        return true;
    }

    /* renamed from: b */
    public boolean mo76480b(int i) {
        if (!this.f53864g || this.f53862e == i) {
            return false;
        }
        this.f53862e = i;
        mo76478b();
        return true;
    }
}
