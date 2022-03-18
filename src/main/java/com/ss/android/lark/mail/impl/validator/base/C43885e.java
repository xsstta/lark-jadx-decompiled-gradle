package com.ss.android.lark.mail.impl.validator.base;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.ss.android.lark.mail.impl.validator.base.e */
public class C43885e {

    /* renamed from: a */
    public final String f111339a;

    /* renamed from: a */
    public static C43885e m173931a(String str) {
        return new C43885e(str);
    }

    private C43885e(String str) {
        this.f111339a = (String) C43886f.m173939a(str);
    }

    /* renamed from: a */
    public static C43885e m173930a(char c) {
        return new C43885e(String.valueOf(c));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo156268a(Object obj) {
        C43886f.m173939a(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    /* renamed from: a */
    public final String mo156269a(Iterable<?> iterable) {
        return mo156270a(iterable.iterator());
    }

    /* renamed from: a */
    public final String mo156270a(Iterator<?> it) {
        return mo156271a(new StringBuilder(), it).toString();
    }

    /* renamed from: a */
    public <A extends Appendable> A mo156267a(A a, Iterator<?> it) throws IOException {
        C43886f.m173939a(a);
        if (it.hasNext()) {
            a.append(mo156268a(it.next()));
            while (it.hasNext()) {
                a.append(this.f111339a);
                a.append(mo156268a(it.next()));
            }
        }
        return a;
    }

    /* renamed from: a */
    public final StringBuilder mo156271a(StringBuilder sb, Iterator<?> it) {
        try {
            mo156267a((Appendable) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
