package org.apache.commons.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: org.apache.commons.text.d */
public class C69980d implements Cloneable, ListIterator<String> {

    /* renamed from: a */
    private static final C69980d f174856a;

    /* renamed from: b */
    private static final C69980d f174857b;

    /* renamed from: c */
    private char[] f174858c = null;

    /* renamed from: d */
    private String[] f174859d;

    /* renamed from: e */
    private int f174860e;

    /* renamed from: f */
    private AbstractC69975c f174861f = AbstractC69975c.m268374c();

    /* renamed from: g */
    private AbstractC69975c f174862g = AbstractC69975c.m268377f();

    /* renamed from: h */
    private AbstractC69975c f174863h = AbstractC69975c.m268377f();

    /* renamed from: i */
    private AbstractC69975c f174864i = AbstractC69975c.m268377f();

    /* renamed from: j */
    private boolean f174865j = false;

    /* renamed from: k */
    private boolean f174866k = true;

    /* renamed from: e */
    public AbstractC69975c mo246221e() {
        return this.f174861f;
    }

    /* renamed from: f */
    public AbstractC69975c mo246222f() {
        return this.f174862g;
    }

    /* renamed from: g */
    public AbstractC69975c mo246223g() {
        return this.f174863h;
    }

    /* renamed from: h */
    public AbstractC69975c mo246224h() {
        return this.f174864i;
    }

    /* renamed from: i */
    public boolean mo246227i() {
        return this.f174865j;
    }

    /* renamed from: j */
    public boolean mo246228j() {
        return this.f174866k;
    }

    public int nextIndex() {
        return this.f174860e;
    }

    /* renamed from: b */
    public C69980d mo246212b() {
        this.f174860e = 0;
        this.f174859d = null;
        return this;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return mo246229k();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int previousIndex() {
        return this.f174860e - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public boolean hasNext() {
        m268387l();
        if (this.f174860e < this.f174859d.length) {
            return true;
        }
        return false;
    }

    public boolean hasPrevious() {
        m268387l();
        if (this.f174860e > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public String next() {
        if (hasNext()) {
            String[] strArr = this.f174859d;
            int i = this.f174860e;
            this.f174860e = i + 1;
            return strArr[i];
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public String previous() {
        if (hasPrevious()) {
            String[] strArr = this.f174859d;
            int i = this.f174860e - 1;
            this.f174860e = i;
            return strArr[i];
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Object mo246229k() throws CloneNotSupportedException {
        C69980d dVar = (C69980d) super.clone();
        char[] cArr = dVar.f174858c;
        if (cArr != null) {
            dVar.f174858c = (char[]) cArr.clone();
        }
        dVar.mo246212b();
        return dVar;
    }

    public String toString() {
        if (this.f174859d == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        return "StrTokenizer" + mo246207a();
    }

    /* renamed from: l */
    private void m268387l() {
        if (this.f174859d == null) {
            char[] cArr = this.f174858c;
            if (cArr == null) {
                List<String> a = mo246031a(null, 0, 0);
                this.f174859d = (String[]) a.toArray(new String[a.size()]);
                return;
            }
            List<String> a2 = mo246031a(cArr, 0, cArr.length);
            this.f174859d = (String[]) a2.toArray(new String[a2.size()]);
        }
    }

    static {
        C69980d dVar = new C69980d();
        f174856a = dVar;
        dVar.mo246208a(AbstractC69975c.m268372a());
        dVar.mo246213b(AbstractC69975c.m268376e());
        dVar.mo246217c(AbstractC69975c.m268377f());
        dVar.mo246220d(AbstractC69975c.m268375d());
        dVar.mo246209a(false);
        dVar.mo246214b(false);
        C69980d dVar2 = new C69980d();
        f174857b = dVar2;
        dVar2.mo246208a(AbstractC69975c.m268373b());
        dVar2.mo246213b(AbstractC69975c.m268376e());
        dVar2.mo246217c(AbstractC69975c.m268377f());
        dVar2.mo246220d(AbstractC69975c.m268375d());
        dVar2.mo246209a(false);
        dVar2.mo246214b(false);
    }

    /* renamed from: a */
    public List<String> mo246207a() {
        m268387l();
        ArrayList arrayList = new ArrayList(this.f174859d.length);
        Collections.addAll(arrayList, this.f174859d);
        return arrayList;
    }

    /* renamed from: a */
    public C69980d mo246209a(boolean z) {
        this.f174865j = z;
        return this;
    }

    /* renamed from: b */
    public C69980d mo246214b(boolean z) {
        this.f174866k = z;
        return this;
    }

    /* renamed from: a */
    public void set(String str) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    /* renamed from: c */
    public C69980d mo246217c(AbstractC69975c cVar) {
        if (cVar != null) {
            this.f174863h = cVar;
        }
        return this;
    }

    /* renamed from: d */
    public C69980d mo246220d(AbstractC69975c cVar) {
        if (cVar != null) {
            this.f174864i = cVar;
        }
        return this;
    }

    /* renamed from: a */
    public C69980d mo246208a(AbstractC69975c cVar) {
        if (cVar == null) {
            this.f174861f = AbstractC69975c.m268377f();
        } else {
            this.f174861f = cVar;
        }
        return this;
    }

    /* renamed from: b */
    public C69980d mo246213b(AbstractC69975c cVar) {
        if (cVar != null) {
            this.f174862g = cVar;
        }
        return this;
    }

    /* renamed from: b */
    public void add(String str) {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    /* renamed from: a */
    private void m268385a(List<String> list, String str) {
        if (str == null || str.length() == 0) {
            if (!mo246228j()) {
                if (mo246227i()) {
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
    public List<String> mo246031a(char[] cArr, int i, int i2) {
        if (cArr == null || i2 == 0) {
            return Collections.emptyList();
        }
        StrBuilder strBuilder = new StrBuilder();
        ArrayList arrayList = new ArrayList();
        int i3 = i;
        while (i3 >= 0 && i3 < i2) {
            i3 = m268383a(cArr, i3, i2, strBuilder, arrayList);
            if (i3 >= i2) {
                m268385a(arrayList, "");
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m268386a(char[] cArr, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            if (i6 >= i2 || cArr[i6] != cArr[i3 + i5]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private int m268383a(char[] cArr, int i, int i2, StrBuilder strBuilder, List<String> list) {
        while (i < i2) {
            int max = Math.max(mo246223g().mo246206a(cArr, i, i, i2), mo246224h().mo246206a(cArr, i, i, i2));
            if (max == 0 || mo246221e().mo246206a(cArr, i, i, i2) > 0 || mo246222f().mo246206a(cArr, i, i, i2) > 0) {
                break;
            }
            i += max;
        }
        if (i >= i2) {
            m268385a(list, "");
            return -1;
        }
        int a = mo246221e().mo246206a(cArr, i, i, i2);
        if (a > 0) {
            m268385a(list, "");
            return i + a;
        }
        int a2 = mo246222f().mo246206a(cArr, i, i, i2);
        if (a2 > 0) {
            return m268384a(cArr, i + a2, i2, strBuilder, list, i, a2);
        }
        return m268384a(cArr, i, i2, strBuilder, list, 0, 0);
    }

    /* renamed from: a */
    private int m268384a(char[] cArr, int i, int i2, StrBuilder strBuilder, List<String> list, int i3, int i4) {
        boolean z;
        strBuilder.clear();
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
                int a = mo246221e().mo246206a(cArr, i5, i, i2);
                if (a > 0) {
                    m268385a(list, strBuilder.substring(0, i6));
                    return i5 + a;
                } else if (i4 <= 0 || !m268386a(cArr, i5, i2, i3, i4)) {
                    int a2 = mo246223g().mo246206a(cArr, i5, i, i2);
                    if (a2 <= 0) {
                        a2 = mo246224h().mo246206a(cArr, i5, i, i2);
                        if (a2 > 0) {
                            strBuilder.append(cArr, i5, a2);
                        } else {
                            i5++;
                            strBuilder.append(cArr[i5]);
                            i6 = strBuilder.size();
                        }
                    }
                    i5 += a2;
                    i6 = i6;
                } else {
                    i5 += i4;
                    i6 = i6;
                    z2 = true;
                }
            } else if (m268386a(cArr, i5, i2, i3, i4)) {
                int i7 = i5 + i4;
                if (m268386a(cArr, i7, i2, i3, i4)) {
                    strBuilder.append(cArr, i5, i4);
                    i5 += i4 * 2;
                    i6 = strBuilder.size();
                } else {
                    i6 = i6;
                    i5 = i7;
                    z2 = false;
                }
            } else {
                i5++;
                strBuilder.append(cArr[i5]);
                i6 = strBuilder.size();
            }
        }
        m268385a(list, strBuilder.substring(0, i6));
        return -1;
    }
}
