package com.ss.android.lark.widget.richtext.preprocess;

import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.d */
public class C59049d {

    /* renamed from: a */
    int f146365a;

    /* renamed from: b */
    private boolean f146366b;

    /* renamed from: c */
    private boolean f146367c;

    /* renamed from: d */
    private boolean f146368d;

    /* renamed from: e */
    private boolean f146369e;

    /* renamed from: f */
    private int f146370f;

    /* renamed from: g */
    private String f146371g;

    /* renamed from: h */
    private boolean f146372h;

    /* renamed from: i */
    private boolean f146373i;

    /* renamed from: a */
    public boolean mo200630a() {
        return this.f146373i;
    }

    /* renamed from: b */
    public boolean mo200631b() {
        return this.f146368d;
    }

    /* renamed from: c */
    public int mo200632c() {
        return this.f146365a;
    }

    /* renamed from: d */
    public boolean mo200633d() {
        return this.f146366b;
    }

    /* renamed from: e */
    public boolean mo200634e() {
        return this.f146367c;
    }

    /* renamed from: f */
    public int mo200636f() {
        return this.f146370f;
    }

    /* renamed from: g */
    public boolean mo200637g() {
        return this.f146372h;
    }

    /* renamed from: h */
    public boolean mo200638h() {
        return this.f146369e;
    }

    /* renamed from: com.ss.android.lark.widget.richtext.preprocess.d$a */
    public static class C59050a {

        /* renamed from: a */
        public boolean f146374a = true;

        /* renamed from: b */
        public boolean f146375b;

        /* renamed from: c */
        public boolean f146376c;

        /* renamed from: d */
        public boolean f146377d;

        /* renamed from: e */
        public int f146378e;

        /* renamed from: f */
        public String f146379f = "";

        /* renamed from: g */
        public boolean f146380g;

        /* renamed from: h */
        public int f146381h;

        /* renamed from: i */
        public boolean f146382i;

        /* renamed from: a */
        public C59049d mo200642a() {
            return new C59049d(this);
        }

        /* renamed from: a */
        public C59050a mo200640a(int i) {
            this.f146378e = i;
            return this;
        }

        /* renamed from: b */
        public C59050a mo200643b(int i) {
            this.f146381h = i;
            return this;
        }

        /* renamed from: c */
        public C59050a mo200645c(boolean z) {
            this.f146376c = z;
            return this;
        }

        /* renamed from: d */
        public C59050a mo200646d(boolean z) {
            this.f146377d = z;
            return this;
        }

        /* renamed from: e */
        public C59050a mo200647e(boolean z) {
            this.f146380g = z;
            return this;
        }

        /* renamed from: f */
        public C59050a mo200648f(boolean z) {
            this.f146382i = z;
            return this;
        }

        /* renamed from: a */
        public C59050a mo200641a(boolean z) {
            this.f146374a = z;
            return this;
        }

        /* renamed from: b */
        public C59050a mo200644b(boolean z) {
            this.f146375b = z;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f146366b), Boolean.valueOf(this.f146367c), Boolean.valueOf(this.f146369e), Boolean.valueOf(this.f146368d), Integer.valueOf(this.f146370f), Boolean.valueOf(this.f146373i), this.f146371g);
    }

    public C59049d(C59050a aVar) {
        this.f146366b = aVar.f146374a;
        this.f146367c = aVar.f146375b;
        this.f146369e = aVar.f146377d;
        this.f146370f = aVar.f146378e;
        this.f146371g = aVar.f146379f;
        this.f146372h = aVar.f146380g;
        this.f146365a = aVar.f146381h;
        this.f146368d = aVar.f146376c;
        this.f146373i = aVar.f146382i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C59049d dVar = (C59049d) obj;
        if (this.f146366b == dVar.f146366b && this.f146367c == dVar.f146367c && this.f146369e == dVar.f146369e && this.f146368d == dVar.f146368d && this.f146370f == dVar.f146370f && this.f146372h == dVar.f146372h && this.f146373i == dVar.f146373i && Objects.equals(this.f146371g, dVar.f146371g)) {
            return true;
        }
        return false;
    }
}
