package com.ss.android.lark.image.impl.p1962b;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26320t;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.image.impl.b.k */
public class C38861k {

    /* renamed from: a */
    private String f99842a;

    /* renamed from: b */
    private int f99843b;

    /* renamed from: c */
    private int f99844c;

    /* renamed from: com.ss.android.lark.image.impl.b.k$a */
    static final class C38863a {

        /* renamed from: a */
        public String f99845a;

        /* renamed from: b */
        public int f99846b;

        /* renamed from: c */
        public int f99847c;

        private C38863a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C38861k mo142371a() {
            return new C38861k(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo142373b() {
            return mo142371a().mo142368a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C38863a mo142369a(int i) {
            this.f99846b = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C38863a mo142372b(int i) {
            this.f99847c = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C38863a mo142370a(String str) {
            this.f99845a = str;
            return this;
        }
    }

    /* renamed from: b */
    static C38863a m153388b() {
        return new C38863a();
    }

    /* renamed from: a */
    public String mo142368a() {
        String a = C26320t.m95318a(this.f99842a);
        if (TextUtils.isEmpty(a)) {
            a = String.valueOf(Objects.hashCode(this.f99842a));
        }
        return String.format("%s_%d_%d", a, Integer.valueOf(this.f99844c), Integer.valueOf(this.f99843b));
    }

    private C38861k(C38863a aVar) {
        this.f99842a = aVar.f99845a;
        this.f99843b = aVar.f99846b;
        this.f99844c = aVar.f99847c;
    }
}
