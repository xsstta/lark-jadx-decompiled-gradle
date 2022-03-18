package com.ss.android.lark.mail.impl.validator.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.validator.base.i */
public final class C43889i {

    /* renamed from: a */
    public final AbstractC43868c f111343a;

    /* renamed from: b */
    public final boolean f111344b;

    /* renamed from: c */
    public final int f111345c;

    /* renamed from: d */
    private final AbstractC43893b f111346d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.validator.base.i$b */
    public interface AbstractC43893b {
        /* renamed from: b */
        Iterator<String> mo156276b(C43889i iVar, CharSequence charSequence);
    }

    /* renamed from: com.ss.android.lark.mail.impl.validator.base.i$a */
    private static abstract class AbstractC43892a extends AbstractC43865b<String> {

        /* renamed from: b */
        final CharSequence f111349b;

        /* renamed from: c */
        final AbstractC43868c f111350c;

        /* renamed from: d */
        final boolean f111351d;

        /* renamed from: e */
        int f111352e;

        /* renamed from: f */
        int f111353f;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract int mo156277a(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract int mo156278b(int i);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo156251a() {
            int a;
            int i = this.f111352e;
            while (true) {
                int i2 = this.f111352e;
                if (i2 == -1) {
                    return (String) mo156252b();
                }
                a = mo156277a(i2);
                if (a == -1) {
                    a = this.f111349b.length();
                    this.f111352e = -1;
                } else {
                    this.f111352e = mo156278b(a);
                }
                int i3 = this.f111352e;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f111352e = i4;
                    if (i4 > this.f111349b.length()) {
                        this.f111352e = -1;
                    }
                } else {
                    while (i < a && this.f111350c.mo156259c(this.f111349b.charAt(i))) {
                        i++;
                    }
                    while (a > i && this.f111350c.mo156259c(this.f111349b.charAt(a - 1))) {
                        a--;
                    }
                    if (!this.f111351d || i != a) {
                        int i5 = this.f111353f;
                    } else {
                        i = this.f111352e;
                    }
                }
            }
            int i52 = this.f111353f;
            if (i52 == 1) {
                a = this.f111349b.length();
                this.f111352e = -1;
                while (a > i && this.f111350c.mo156259c(this.f111349b.charAt(a - 1))) {
                    a--;
                }
            } else {
                this.f111353f = i52 - 1;
            }
            return this.f111349b.subSequence(i, a).toString();
        }

        protected AbstractC43892a(C43889i iVar, CharSequence charSequence) {
            this.f111350c = iVar.f111343a;
            this.f111351d = iVar.f111344b;
            this.f111353f = iVar.f111345c;
            this.f111349b = charSequence;
        }
    }

    /* renamed from: a */
    public Iterator<String> mo156273a(CharSequence charSequence) {
        return this.f111346d.mo156276b(this, charSequence);
    }

    private C43889i(AbstractC43893b bVar) {
        this(bVar, false, AbstractC43868c.m173879b(), Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static C43889i m173946a(char c) {
        return m173947a(AbstractC43868c.m173877a(c));
    }

    /* renamed from: a */
    public static C43889i m173947a(final AbstractC43868c cVar) {
        C43886f.m173939a(cVar);
        return new C43889i(new AbstractC43893b() {
            /* class com.ss.android.lark.mail.impl.validator.base.C43889i.C438901 */

            /* renamed from: a */
            public AbstractC43892a mo156276b(C43889i iVar, CharSequence charSequence) {
                return new AbstractC43892a(iVar, charSequence) {
                    /* class com.ss.android.lark.mail.impl.validator.base.C43889i.C438901.C438911 */

                    /* access modifiers changed from: package-private */
                    @Override // com.ss.android.lark.mail.impl.validator.base.C43889i.AbstractC43892a
                    /* renamed from: b */
                    public int mo156278b(int i) {
                        return i + 1;
                    }

                    /* access modifiers changed from: package-private */
                    @Override // com.ss.android.lark.mail.impl.validator.base.C43889i.AbstractC43892a
                    /* renamed from: a */
                    public int mo156277a(int i) {
                        return cVar.mo156256a(this.f111349b, i);
                    }
                };
            }
        });
    }

    /* renamed from: b */
    public List<String> mo156274b(CharSequence charSequence) {
        C43886f.m173939a(charSequence);
        Iterator<String> a = mo156273a(charSequence);
        ArrayList arrayList = new ArrayList();
        while (a.hasNext()) {
            arrayList.add(a.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public C43889i mo156272a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C43886f.m173942a(z, "must be greater than zero: %s", i);
        return new C43889i(this.f111346d, this.f111344b, this.f111343a, i);
    }

    private C43889i(AbstractC43893b bVar, boolean z, AbstractC43868c cVar, int i) {
        this.f111346d = bVar;
        this.f111344b = z;
        this.f111343a = cVar;
        this.f111345c = i;
    }
}
