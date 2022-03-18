package org.apache.commons.text.translate;

/* renamed from: org.apache.commons.text.translate.f */
public class C69991f extends C69996k {
    /* access modifiers changed from: protected */
    @Override // org.apache.commons.text.translate.C69996k
    /* renamed from: b */
    public String mo246273b(int i) {
        char[] chars = Character.toChars(i);
        return "\\u" + m268441a(chars[0]) + "\\u" + m268441a(chars[1]);
    }

    /* renamed from: a */
    public static C69991f m268452a(int i, int i2) {
        return new C69991f(i, i2, false);
    }

    public C69991f(int i, int i2, boolean z) {
        super(i, i2, z);
    }
}
