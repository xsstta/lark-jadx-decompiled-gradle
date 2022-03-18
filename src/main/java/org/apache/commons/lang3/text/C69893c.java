package org.apache.commons.lang3.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.lang3.C69877e;

/* renamed from: org.apache.commons.lang3.text.c */
public class C69893c implements Cloneable, ListIterator<String> {

    /* renamed from: a */
    private static final C69893c f174740a;

    /* renamed from: b */
    private static final C69893c f174741b;

    /* renamed from: c */
    private char[] f174742c = null;

    /* renamed from: d */
    private String[] f174743d;

    /* renamed from: e */
    private int f174744e;

    /* renamed from: f */
    private AbstractC69888b f174745f = AbstractC69888b.m268193c();

    /* renamed from: g */
    private AbstractC69888b f174746g = AbstractC69888b.m268196f();

    /* renamed from: h */
    private AbstractC69888b f174747h = AbstractC69888b.m268196f();

    /* renamed from: i */
    private AbstractC69888b f174748i = AbstractC69888b.m268196f();

    /* renamed from: j */
    private boolean f174749j = false;

    /* renamed from: k */
    private boolean f174750k = true;

    /* renamed from: e */
    public AbstractC69888b mo245637e() {
        return this.f174745f;
    }

    /* renamed from: f */
    public AbstractC69888b mo245638f() {
        return this.f174746g;
    }

    /* renamed from: g */
    public AbstractC69888b mo245639g() {
        return this.f174747h;
    }

    /* renamed from: h */
    public AbstractC69888b mo245640h() {
        return this.f174748i;
    }

    /* renamed from: i */
    public boolean mo245643i() {
        return this.f174749j;
    }

    /* renamed from: j */
    public boolean mo245644j() {
        return this.f174750k;
    }

    public int nextIndex() {
        return this.f174744e;
    }

    /* renamed from: b */
    public C69893c mo245628b() {
        this.f174744e = 0;
        this.f174743d = null;
        return this;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return mo245645k();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int previousIndex() {
        return this.f174744e - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public boolean hasNext() {
        m268207l();
        if (this.f174744e < this.f174743d.length) {
            return true;
        }
        return false;
    }

    public boolean hasPrevious() {
        m268207l();
        if (this.f174744e > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public String next() {
        if (hasNext()) {
            String[] strArr = this.f174743d;
            int i = this.f174744e;
            this.f174744e = i + 1;
            return strArr[i];
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public String previous() {
        if (hasPrevious()) {
            String[] strArr = this.f174743d;
            int i = this.f174744e - 1;
            this.f174744e = i;
            return strArr[i];
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Object mo245645k() throws CloneNotSupportedException {
        C69893c cVar = (C69893c) super.clone();
        char[] cArr = cVar.f174742c;
        if (cArr != null) {
            cVar.f174742c = (char[]) cArr.clone();
        }
        cVar.mo245628b();
        return cVar;
    }

    public String toString() {
        if (this.f174743d == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        return "StrTokenizer" + mo245623a();
    }

    /* renamed from: l */
    private void m268207l() {
        if (this.f174743d == null) {
            char[] cArr = this.f174742c;
            if (cArr == null) {
                List<String> a = mo245612a(null, 0, 0);
                this.f174743d = (String[]) a.toArray(new String[a.size()]);
                return;
            }
            List<String> a2 = mo245612a(cArr, 0, cArr.length);
            this.f174743d = (String[]) a2.toArray(new String[a2.size()]);
        }
    }

    static {
        C69893c cVar = new C69893c();
        f174740a = cVar;
        cVar.mo245624a(AbstractC69888b.m268191a());
        cVar.mo245629b(AbstractC69888b.m268195e());
        cVar.mo245633c(AbstractC69888b.m268196f());
        cVar.mo245636d(AbstractC69888b.m268194d());
        cVar.mo245625a(false);
        cVar.mo245630b(false);
        C69893c cVar2 = new C69893c();
        f174741b = cVar2;
        cVar2.mo245624a(AbstractC69888b.m268192b());
        cVar2.mo245629b(AbstractC69888b.m268195e());
        cVar2.mo245633c(AbstractC69888b.m268196f());
        cVar2.mo245636d(AbstractC69888b.m268194d());
        cVar2.mo245625a(false);
        cVar2.mo245630b(false);
    }

    /* renamed from: a */
    public List<String> mo245623a() {
        m268207l();
        ArrayList arrayList = new ArrayList(this.f174743d.length);
        arrayList.addAll(Arrays.asList(this.f174743d));
        return arrayList;
    }

    /* renamed from: a */
    public C69893c mo245625a(boolean z) {
        this.f174749j = z;
        return this;
    }

    /* renamed from: b */
    public C69893c mo245630b(boolean z) {
        this.f174750k = z;
        return this;
    }

    /* renamed from: a */
    public void set(String str) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    /* renamed from: c */
    public C69893c mo245633c(AbstractC69888b bVar) {
        if (bVar != null) {
            this.f174747h = bVar;
        }
        return this;
    }

    /* renamed from: d */
    public C69893c mo245636d(AbstractC69888b bVar) {
        if (bVar != null) {
            this.f174748i = bVar;
        }
        return this;
    }

    /* renamed from: a */
    public C69893c mo245624a(AbstractC69888b bVar) {
        if (bVar == null) {
            this.f174745f = AbstractC69888b.m268196f();
        } else {
            this.f174745f = bVar;
        }
        return this;
    }

    /* renamed from: b */
    public C69893c mo245629b(AbstractC69888b bVar) {
        if (bVar != null) {
            this.f174746g = bVar;
        }
        return this;
    }

    /* renamed from: b */
    public void add(String str) {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    /* renamed from: a */
    private void m268205a(List<String> list, String str) {
        if (C69877e.m268158a(str)) {
            if (!mo245644j()) {
                if (mo245643i()) {
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
    public List<String> mo245612a(char[] cArr, int i, int i2) {
        if (cArr == null || i2 == 0) {
            return Collections.emptyList();
        }
        StrBuilder strBuilder = new StrBuilder();
        ArrayList arrayList = new ArrayList();
        int i3 = i;
        while (i3 >= 0 && i3 < i2) {
            i3 = m268203a(cArr, i3, i2, strBuilder, arrayList);
            if (i3 >= i2) {
                m268205a(arrayList, "");
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m268206a(char[] cArr, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            if (i6 >= i2 || cArr[i6] != cArr[i3 + i5]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private int m268203a(char[] cArr, int i, int i2, StrBuilder strBuilder, List<String> list) {
        while (i < i2) {
            int max = Math.max(mo245639g().mo245622a(cArr, i, i, i2), mo245640h().mo245622a(cArr, i, i, i2));
            if (max == 0 || mo245637e().mo245622a(cArr, i, i, i2) > 0 || mo245638f().mo245622a(cArr, i, i, i2) > 0) {
                break;
            }
            i += max;
        }
        if (i >= i2) {
            m268205a(list, "");
            return -1;
        }
        int a = mo245637e().mo245622a(cArr, i, i, i2);
        if (a > 0) {
            m268205a(list, "");
            return i + a;
        }
        int a2 = mo245638f().mo245622a(cArr, i, i, i2);
        if (a2 > 0) {
            return m268204a(cArr, i + a2, i2, strBuilder, list, i, a2);
        }
        return m268204a(cArr, i, i2, strBuilder, list, 0, 0);
    }

    /* renamed from: a */
    private int m268204a(char[] cArr, int i, int i2, StrBuilder strBuilder, List<String> list, int i3, int i4) {
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
                int a = mo245637e().mo245622a(cArr, i5, i, i2);
                if (a > 0) {
                    m268205a(list, strBuilder.substring(0, i6));
                    return i5 + a;
                } else if (i4 <= 0 || !m268206a(cArr, i5, i2, i3, i4)) {
                    int a2 = mo245639g().mo245622a(cArr, i5, i, i2);
                    if (a2 <= 0) {
                        a2 = mo245640h().mo245622a(cArr, i5, i, i2);
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
            } else if (m268206a(cArr, i5, i2, i3, i4)) {
                int i7 = i5 + i4;
                if (m268206a(cArr, i7, i2, i3, i4)) {
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
        m268205a(list, strBuilder.substring(0, i6));
        return -1;
    }
}
