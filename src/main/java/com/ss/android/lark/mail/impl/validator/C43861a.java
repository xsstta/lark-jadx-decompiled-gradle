package com.ss.android.lark.mail.impl.validator;

import com.ss.android.lark.mail.impl.validator.lexer.C43897a;
import com.ss.android.lark.mail.impl.validator.parser.C43902b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.validator.a */
public final class C43861a {

    /* renamed from: a */
    private final C43902b f111308a = new C43902b(new C43897a());

    /* renamed from: b */
    private List<AbstractC43863b> f111309b = Collections.emptyList();

    /* renamed from: a */
    public C43902b mo156231a() {
        return this.f111308a;
    }

    public String toString() {
        return "EmailValidator{name=" + this.f111308a.mo156299a() + ",local=" + this.f111308a.mo156301b() + ",domain=" + this.f111308a.mo156303c() + "," + '}';
    }

    /* renamed from: b */
    private boolean m173861b(String str) {
        Iterator<AbstractC43863b> it = this.f111309b.iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                AbstractC43863b next = it.next();
                if (!z || !next.mo156237a(str, this.f111308a).booleanValue()) {
                    z = false;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo156232a(String str) {
        String str2;
        boolean z;
        C43902b bVar = this.f111308a;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.trim();
        }
        String b = bVar.mo156302b(bVar.mo156304c(str2));
        try {
            this.f111308a.mo156300a(b);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        if (!z || !m173861b(b)) {
            return false;
        }
        return true;
    }
}
