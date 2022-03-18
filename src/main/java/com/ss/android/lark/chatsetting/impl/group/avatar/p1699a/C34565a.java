package com.ss.android.lark.chatsetting.impl.group.avatar.p1699a;

import android.text.TextUtils;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.a.a */
public class C34565a implements Comparable<C34565a> {

    /* renamed from: a */
    String f89248a;

    /* renamed from: b */
    String f89249b;

    /* renamed from: c */
    String f89250c;

    /* renamed from: d */
    String f89251d;

    /* renamed from: e */
    int f89252e;

    /* renamed from: f */
    int f89253f;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.a.a$a */
    public static class C34567a {

        /* renamed from: a */
        C34565a f89254a = new C34565a();

        /* renamed from: a */
        public C34565a mo127739a() {
            return this.f89254a;
        }

        /* renamed from: a */
        public C34567a mo127737a(int i) {
            this.f89254a.f89252e = i;
            return this;
        }

        /* renamed from: b */
        public C34567a mo127740b(String str) {
            this.f89254a.f89249b = str;
            return this;
        }

        /* renamed from: c */
        public C34567a mo127741c(String str) {
            this.f89254a.f89251d = str;
            return this;
        }

        /* renamed from: d */
        public C34567a mo127742d(String str) {
            this.f89254a.f89250c = str;
            return this;
        }

        /* renamed from: a */
        public C34567a mo127738a(String str) {
            this.f89254a.f89248a = str;
            return this;
        }
    }

    /* renamed from: a */
    public String mo127730a() {
        return this.f89248a;
    }

    /* renamed from: b */
    public String mo127731b() {
        return this.f89249b;
    }

    /* renamed from: c */
    public String mo127732c() {
        return this.f89251d;
    }

    /* renamed from: d */
    public int mo127734d() {
        return this.f89252e;
    }

    /* renamed from: f */
    public String mo127736f() {
        return this.f89250c;
    }

    private C34565a() {
        this.f89252e = -1;
        this.f89253f = -1;
    }

    /* renamed from: e */
    public boolean mo127735e() {
        int i = this.f89252e;
        if (i == -1 || i == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public int compareTo(C34565a aVar) {
        boolean z;
        if (!TextUtils.equals(this.f89248a, aVar.f89248a) || !TextUtils.equals(this.f89250c, aVar.f89250c) || !TextUtils.equals(this.f89251d, aVar.f89251d) || this.f89252e != aVar.f89252e || this.f89253f != aVar.f89253f) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return 0;
        }
        return 1;
    }
}
