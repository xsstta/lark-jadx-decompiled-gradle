package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.C21396a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.h */
public abstract class AbstractC21433h {
    /* renamed from: a */
    public abstract String mo72604a();

    /* renamed from: b */
    public abstract Integer mo72605b();

    /* renamed from: c */
    public abstract C21432g mo72606c();

    /* renamed from: d */
    public abstract long mo72607d();

    /* renamed from: e */
    public abstract long mo72608e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Map<String, String> mo72610f();

    /* renamed from: i */
    public static AbstractC21434a m77526i() {
        return new C21396a.C21398a().mo72617a(new HashMap());
    }

    /* renamed from: g */
    public final Map<String, String> mo72683g() {
        return Collections.unmodifiableMap(mo72610f());
    }

    /* renamed from: h */
    public AbstractC21434a mo72684h() {
        return new C21396a.C21398a().mo72616a(mo72604a()).mo72615a(mo72605b()).mo72614a(mo72606c()).mo72613a(mo72607d()).mo72619b(mo72608e()).mo72617a(new HashMap(mo72610f()));
    }

    /* renamed from: c */
    public final String mo72682c(String str) {
        String str2 = mo72610f().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: a */
    public final int mo72680a(String str) {
        String str2 = mo72610f().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: b */
    public final long mo72681b(String str) {
        String str2 = mo72610f().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: com.google.android.datatransport.runtime.h$a */
    public static abstract class AbstractC21434a {
        /* renamed from: a */
        public abstract AbstractC21434a mo72613a(long j);

        /* renamed from: a */
        public abstract AbstractC21434a mo72614a(C21432g gVar);

        /* renamed from: a */
        public abstract AbstractC21434a mo72615a(Integer num);

        /* renamed from: a */
        public abstract AbstractC21434a mo72616a(String str);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract AbstractC21434a mo72617a(Map<String, String> map);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract Map<String, String> mo72618a();

        /* renamed from: b */
        public abstract AbstractC21434a mo72619b(long j);

        /* renamed from: b */
        public abstract AbstractC21433h mo72620b();

        /* renamed from: a */
        public final AbstractC21434a mo72685a(String str, int i) {
            mo72618a().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final AbstractC21434a mo72686a(String str, long j) {
            mo72618a().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public final AbstractC21434a mo72687a(String str, String str2) {
            mo72618a().put(str, str2);
            return this;
        }
    }
}
