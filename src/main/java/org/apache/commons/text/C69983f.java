package org.apache.commons.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.text.p3505a.AbstractC69972b;
import org.apache.commons.text.p3505a.C69973c;

/* renamed from: org.apache.commons.text.f */
public class C69983f implements Cloneable, ListIterator<String> {

    /* renamed from: a */
    private static final C69983f f174884a;

    /* renamed from: b */
    private static final C69983f f174885b;

    /* renamed from: c */
    private char[] f174886c = null;

    /* renamed from: d */
    private String[] f174887d;

    /* renamed from: e */
    private int f174888e;

    /* renamed from: f */
    private AbstractC69972b f174889f = C69973c.f174835a.mo246202d();

    /* renamed from: g */
    private AbstractC69972b f174890g = C69973c.f174835a.mo246201c();

    /* renamed from: h */
    private AbstractC69972b f174891h = C69973c.f174835a.mo246201c();

    /* renamed from: i */
    private AbstractC69972b f174892i = C69973c.f174835a.mo246201c();

    /* renamed from: j */
    private boolean f174893j = false;

    /* renamed from: k */
    private boolean f174894k = true;

    /* renamed from: e */
    public AbstractC69972b mo246252e() {
        return this.f174889f;
    }

    /* renamed from: f */
    public AbstractC69972b mo246253f() {
        return this.f174890g;
    }

    /* renamed from: g */
    public AbstractC69972b mo246254g() {
        return this.f174891h;
    }

    /* renamed from: h */
    public AbstractC69972b mo246255h() {
        return this.f174892i;
    }

    /* renamed from: i */
    public boolean mo246258i() {
        return this.f174893j;
    }

    /* renamed from: j */
    public boolean mo246259j() {
        return this.f174894k;
    }

    public int nextIndex() {
        return this.f174888e;
    }

    /* renamed from: b */
    public C69983f mo246243b() {
        this.f174888e = 0;
        this.f174887d = null;
        return this;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return mo246260k();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int previousIndex() {
        return this.f174888e - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public boolean hasNext() {
        m268417l();
        if (this.f174888e < this.f174887d.length) {
            return true;
        }
        return false;
    }

    public boolean hasPrevious() {
        m268417l();
        if (this.f174888e > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public String next() {
        if (hasNext()) {
            String[] strArr = this.f174887d;
            int i = this.f174888e;
            this.f174888e = i + 1;
            return strArr[i];
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public String previous() {
        if (hasPrevious()) {
            String[] strArr = this.f174887d;
            int i = this.f174888e - 1;
            this.f174888e = i;
            return strArr[i];
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Object mo246260k() throws CloneNotSupportedException {
        C69983f fVar = (C69983f) super.clone();
        char[] cArr = fVar.f174886c;
        if (cArr != null) {
            fVar.f174886c = (char[]) cArr.clone();
        }
        fVar.mo246243b();
        return fVar;
    }

    public String toString() {
        if (this.f174887d == null) {
            return "StringTokenizer[not tokenized yet]";
        }
        return "StringTokenizer" + mo246238a();
    }

    /* renamed from: l */
    private void m268417l() {
        if (this.f174887d == null) {
            char[] cArr = this.f174886c;
            if (cArr == null) {
                List<String> a = mo246197a(null, 0, 0);
                this.f174887d = (String[]) a.toArray(new String[a.size()]);
                return;
            }
            List<String> a2 = mo246197a(cArr, 0, cArr.length);
            this.f174887d = (String[]) a2.toArray(new String[a2.size()]);
        }
    }

    static {
        C69983f fVar = new C69983f();
        f174884a = fVar;
        fVar.mo246239a(C69973c.f174835a.mo246199a());
        fVar.mo246244b(C69973c.f174835a.mo246200b());
        fVar.mo246248c(C69973c.f174835a.mo246201c());
        fVar.mo246251d(C69973c.f174835a.mo246204f());
        fVar.mo246240a(false);
        fVar.mo246245b(false);
        C69983f fVar2 = new C69983f();
        f174885b = fVar2;
        fVar2.mo246239a(C69973c.f174835a.mo246203e());
        fVar2.mo246244b(C69973c.f174835a.mo246200b());
        fVar2.mo246248c(C69973c.f174835a.mo246201c());
        fVar2.mo246251d(C69973c.f174835a.mo246204f());
        fVar2.mo246240a(false);
        fVar2.mo246245b(false);
    }

    /* renamed from: a */
    public List<String> mo246238a() {
        m268417l();
        ArrayList arrayList = new ArrayList(this.f174887d.length);
        Collections.addAll(arrayList, this.f174887d);
        return arrayList;
    }

    /* renamed from: a */
    public C69983f mo246240a(boolean z) {
        this.f174893j = z;
        return this;
    }

    /* renamed from: b */
    public C69983f mo246245b(boolean z) {
        this.f174894k = z;
        return this;
    }

    /* renamed from: a */
    public void set(String str) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    /* renamed from: c */
    public C69983f mo246248c(AbstractC69972b bVar) {
        if (bVar != null) {
            this.f174891h = bVar;
        }
        return this;
    }

    /* renamed from: d */
    public C69983f mo246251d(AbstractC69972b bVar) {
        if (bVar != null) {
            this.f174892i = bVar;
        }
        return this;
    }

    /* renamed from: a */
    public C69983f mo246239a(AbstractC69972b bVar) {
        if (bVar == null) {
            this.f174889f = C69973c.f174835a.mo246201c();
        } else {
            this.f174889f = bVar;
        }
        return this;
    }

    /* renamed from: b */
    public C69983f mo246244b(AbstractC69972b bVar) {
        if (bVar != null) {
            this.f174890g = bVar;
        }
        return this;
    }

    /* renamed from: b */
    public void add(String str) {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    /* renamed from: a */
    private void m268415a(List<String> list, String str) {
        if (str == null || str.length() == 0) {
            if (!mo246259j()) {
                if (mo246258i()) {
                    str = null;
                }
            } else {
                return;
            }
        }
        list.add(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<String> mo246197a(char[] cArr, int i, int i2) {
        if (cArr == null || i2 == 0) {
            return Collections.emptyList();
        }
        TextStringBuilder textStringBuilder = new TextStringBuilder();
        ArrayList arrayList = new ArrayList();
        int i3 = i;
        while (i3 >= 0 && i3 < i2) {
            i3 = m268413a(cArr, i3, i2, textStringBuilder, arrayList);
            if (i3 >= i2) {
                m268415a(arrayList, "");
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m268416a(char[] cArr, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            if (i6 >= i2 || cArr[i6] != cArr[i3 + i5]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private int m268413a(char[] cArr, int i, int i2, TextStringBuilder textStringBuilder, List<String> list) {
        while (i < i2) {
            int max = Math.max(mo246254g().mo246198a(cArr, i, i, i2), mo246255h().mo246198a(cArr, i, i, i2));
            if (max == 0 || mo246252e().mo246198a(cArr, i, i, i2) > 0 || mo246253f().mo246198a(cArr, i, i, i2) > 0) {
                break;
            }
            i += max;
        }
        if (i >= i2) {
            m268415a(list, "");
            return -1;
        }
        int a = mo246252e().mo246198a(cArr, i, i, i2);
        if (a > 0) {
            m268415a(list, "");
            return i + a;
        }
        int a2 = mo246253f().mo246198a(cArr, i, i, i2);
        if (a2 > 0) {
            return m268414a(cArr, i + a2, i2, textStringBuilder, list, i, a2);
        }
        return m268414a(cArr, i, i2, textStringBuilder, list, 0, 0);
    }

    /* renamed from: a */
    private int m268414a(char[] cArr, int i, int i2, TextStringBuilder textStringBuilder, List<String> list, int i3, int i4) {
        boolean z;
        textStringBuilder.clear();
        if (i4 > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        int i5 = i;
        int i6 = 0;
        while (i5 < i2) {
            if (!z2) {
                int a = mo246252e().mo246198a(cArr, i5, i, i2);
                if (a > 0) {
                    m268415a(list, textStringBuilder.substring(0, i6));
                    return i5 + a;
                } else if (i4 <= 0 || !m268416a(cArr, i5, i2, i3, i4)) {
                    int a2 = mo246254g().mo246198a(cArr, i5, i, i2);
                    if (a2 <= 0) {
                        a2 = mo246255h().mo246198a(cArr, i5, i, i2);
                        if (a2 > 0) {
                            textStringBuilder.append(cArr, i5, a2);
                        } else {
                            i5++;
                            textStringBuilder.append(cArr[i5]);
                            i6 = textStringBuilder.size();
                        }
                    }
                    i5 += a2;
                    i6 = i6;
                } else {
                    i5 += i4;
                    i6 = i6;
                    z2 = true;
                }
            } else if (m268416a(cArr, i5, i2, i3, i4)) {
                int i7 = i5 + i4;
                if (m268416a(cArr, i7, i2, i3, i4)) {
                    textStringBuilder.append(cArr, i5, i4);
                    i5 += i4 * 2;
                    i6 = textStringBuilder.size();
                } else {
                    i6 = i6;
                    i5 = i7;
                    z2 = false;
                }
            } else {
                i5++;
                textStringBuilder.append(cArr[i5]);
                i6 = textStringBuilder.size();
            }
        }
        m268415a(list, textStringBuilder.substring(0, i6));
        return -1;
    }
}
