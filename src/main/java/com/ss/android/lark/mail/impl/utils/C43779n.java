package com.ss.android.lark.mail.impl.utils;

import android.text.TextUtils;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43788q;
import com.ss.android.lark.sp.AbstractSharedPreferences;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.utils.n */
public class C43779n extends AbstractSharedPreferences implements C43788q.AbstractC43789a<C43779n> {

    /* renamed from: a */
    private String f111073a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.utils.n$a */
    public static class C43781a {

        /* renamed from: a */
        public static final C43788q<C43779n> f111074a = new C43788q<>(new C43788q.AbstractC43790b<C43779n>() {
            /* class com.ss.android.lark.mail.impl.utils.C43779n.C43781a.C437821 */

            /* renamed from: a */
            public C43779n mo155066b(String str) {
                return new C43779n(str);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.utils.C43788q.AbstractC43789a
    /* renamed from: N */
    public String mo155022N() {
        return this.f111073a;
    }

    @Override // com.ss.android.lark.sp.AbstractSharedPreferences
    public String getSpName() {
        return this.f111073a;
    }

    /* renamed from: a */
    public static synchronized C43779n m173507a() {
        C43779n a;
        synchronized (C43779n.class) {
            a = C43781a.f111074a.mo155954a();
        }
        return a;
    }

    private C43779n(String str) {
        mo155040d(str);
    }

    /* renamed from: a */
    public static synchronized C43779n m173508a(String str) {
        synchronized (C43779n.class) {
            if (TextUtils.isEmpty(str)) {
                return m173507a();
            }
            return C43781a.f111074a.mo155955a(str);
        }
    }

    @Override // com.ss.android.lark.mail.impl.utils.C43788q.AbstractC43789a
    /* renamed from: d */
    public void mo155040d(String str) {
        this.f111073a = str;
        String spNameSuffix = UserSP.getInstance().getSpNameSuffix();
        if (TextUtils.isEmpty(this.f111073a)) {
            setBaseSharedPreferences(UserSP.getUserSPById(spNameSuffix + "_" + C41816b.m166115a().mo150139f()));
            return;
        }
        setBaseSharedPreferences(UserSP.getUserSPById(spNameSuffix + "_" + this.f111073a));
    }

    /* renamed from: a */
    public static synchronized void m173509a(String str, List<String> list) {
        synchronized (C43779n.class) {
            C43781a.f111074a.mo155956a(str, list);
        }
    }
}
