package com.bytedance.ee.bear.middleground.drive.export;

import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.drive.export.e */
public class C9366e {

    /* renamed from: a */
    public String f25183a;

    /* renamed from: b */
    public String f25184b;

    /* renamed from: c */
    public List<C9368b> f25185c;

    /* renamed from: d */
    public AbstractC9365d f25186d;

    /* renamed from: e */
    public String f25187e;

    /* renamed from: com.bytedance.ee.bear.middleground.drive.export.e$a */
    public static final class C9367a {

        /* renamed from: a */
        private String f25188a;

        /* renamed from: b */
        private String f25189b;

        /* renamed from: c */
        private AbstractC9365d f25190c;

        /* renamed from: d */
        private List<C9368b> f25191d;

        /* renamed from: e */
        private String f25192e;

        /* renamed from: a */
        public C9366e mo35751a() {
            return new C9366e(this.f25188a, this.f25189b, this.f25190c, this.f25191d, this.f25192e);
        }

        /* renamed from: a */
        public C9367a mo35748a(AbstractC9365d dVar) {
            this.f25190c = dVar;
            return this;
        }

        /* renamed from: b */
        public C9367a mo35752b(String str) {
            this.f25189b = str;
            return this;
        }

        /* renamed from: c */
        public C9367a mo35753c(String str) {
            this.f25192e = str;
            return this;
        }

        /* renamed from: a */
        public C9367a mo35749a(String str) {
            this.f25188a = str;
            return this;
        }

        /* renamed from: a */
        public C9367a mo35750a(List<C9368b> list) {
            this.f25191d = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.ee.bear.middleground.drive.export.e$b */
    public static class C9368b {

        /* renamed from: a */
        public String f25193a;

        /* renamed from: b */
        public long f25194b;

        public String toString() {
            return "Item{objToken='" + this.f25193a + '\'' + ", type=" + this.f25194b + '}';
        }

        public C9368b(String str, long j) {
            this.f25193a = str;
            this.f25194b = j;
        }
    }

    public C9366e(String str, String str2, AbstractC9365d dVar, List<C9368b> list, String str3) {
        this.f25183a = str;
        this.f25184b = str2;
        this.f25185c = list;
        this.f25186d = dVar;
        this.f25187e = str3;
    }
}
