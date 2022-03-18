package com.ss.android.lark.image.impl.p1962b;

import java.io.File;

/* renamed from: com.ss.android.lark.image.impl.b.d */
public class C38852d {

    /* renamed from: a */
    public final Throwable f99824a;

    /* renamed from: b */
    public File f99825b;

    /* renamed from: c */
    public int f99826c;

    /* renamed from: d */
    public int f99827d;

    /* renamed from: e */
    public long f99828e;

    /* renamed from: f */
    public int f99829f;

    /* renamed from: g */
    public int f99830g;

    /* renamed from: h */
    public long f99831h;

    /* renamed from: com.ss.android.lark.image.impl.b.d$a */
    static final class C38854a {

        /* renamed from: a */
        public Throwable f99832a;

        /* renamed from: b */
        public int f99833b;

        /* renamed from: c */
        public int f99834c;

        /* renamed from: d */
        public long f99835d;

        /* renamed from: e */
        public int f99836e;

        /* renamed from: f */
        public int f99837f;

        /* renamed from: g */
        public long f99838g;

        /* renamed from: h */
        public File f99839h;

        private C38854a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C38852d mo142354a() {
            return new C38852d(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C38854a mo142351a(int i) {
            this.f99833b = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C38854a mo142355b(int i) {
            this.f99834c = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C38854a mo142357c(int i) {
            this.f99836e = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C38854a mo142358d(int i) {
            this.f99837f = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C38854a mo142352a(long j) {
            this.f99835d = j;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C38854a mo142356b(long j) {
            this.f99838g = j;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C38854a mo142353a(File file) {
            this.f99839h = file;
            return this;
        }
    }

    /* renamed from: b */
    static C38854a m153356b() {
        return new C38854a();
    }

    /* renamed from: a */
    public float mo142350a() {
        long j = this.f99828e;
        if (j <= 0) {
            return 1.0f;
        }
        long j2 = this.f99831h;
        if (j2 > 0) {
            return (((float) j) * 1.0f) / ((float) j2);
        }
        return 1.0f;
    }

    C38852d(Throwable th) {
        this.f99824a = th;
    }

    private C38852d(C38854a aVar) {
        this.f99824a = aVar.f99832a;
        this.f99826c = aVar.f99833b;
        this.f99827d = aVar.f99834c;
        this.f99828e = aVar.f99835d;
        this.f99829f = aVar.f99836e;
        this.f99830g = aVar.f99837f;
        this.f99831h = aVar.f99838g;
        this.f99825b = aVar.f99839h;
    }
}
