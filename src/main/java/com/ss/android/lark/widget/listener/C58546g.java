package com.ss.android.lark.widget.listener;

import android.view.View;

/* renamed from: com.ss.android.lark.widget.listener.g */
public class C58546g {

    /* renamed from: a */
    private C58549b f144522a;

    /* renamed from: b */
    private C58549b f144523b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.listener.g$a */
    public static final class C58548a {

        /* renamed from: a */
        public static final C58546g f144524a = new C58546g();
    }

    /* renamed from: com.ss.android.lark.widget.listener.g$b */
    public static class C58549b {

        /* renamed from: a */
        private int f144525a = -1;

        /* renamed from: b */
        private int f144526b = -1;

        /* renamed from: c */
        private int f144527c = -1;

        /* renamed from: d */
        private int f144528d = -1;

        /* renamed from: e */
        private int f144529e = -1;

        /* renamed from: f */
        private int f144530f = -1;

        /* renamed from: g */
        private int f144531g = -1;

        /* renamed from: h */
        private int f144532h = -1;

        /* renamed from: a */
        public int mo198458a() {
            return this.f144525a;
        }

        /* renamed from: b */
        public int mo198459b() {
            return this.f144526b;
        }

        /* renamed from: e */
        public int mo198462e() {
            return this.f144529e;
        }

        /* renamed from: f */
        public int mo198463f() {
            return this.f144530f;
        }

        /* renamed from: g */
        private boolean m227077g() {
            if (this.f144529e == this.f144530f) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public int mo198461d() {
            if (m227077g()) {
                return this.f144526b - 7;
            }
            return this.f144526b + 3;
        }

        public C58549b() {
        }

        /* renamed from: c */
        public int mo198460c() {
            int i;
            if (m227077g()) {
                i = this.f144525a + this.f144529e;
            } else {
                i = this.f144525a + 64;
            }
            return i - 3;
        }

        public C58549b(View view) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            this.f144525a = iArr[0];
            this.f144526b = iArr[1];
            this.f144527c = view.getTop();
            this.f144528d = view.getRight();
            this.f144529e = view.getWidth();
            this.f144530f = view.getHeight();
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            this.f144531g = iArr2[0];
            this.f144532h = iArr2[1];
        }
    }

    /* renamed from: a */
    public static C58546g m227072a() {
        return C58548a.f144524a;
    }

    /* renamed from: c */
    public C58549b mo198457c() {
        return this.f144523b;
    }

    /* renamed from: d */
    private void m227073d() {
        this.f144522a = new C58549b();
    }

    private C58546g() {
        C58549b bVar = new C58549b();
        this.f144522a = bVar;
        this.f144523b = bVar;
    }

    /* renamed from: b */
    public C58549b mo198456b() {
        this.f144523b = this.f144522a;
        m227073d();
        return this.f144523b;
    }

    /* renamed from: a */
    public void mo198455a(View view) {
        this.f144522a = new C58549b(view);
    }
}
