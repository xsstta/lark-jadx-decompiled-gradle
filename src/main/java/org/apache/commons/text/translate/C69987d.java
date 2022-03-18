package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.C69877e;

/* renamed from: org.apache.commons.text.translate.d */
public final class C69987d {

    /* renamed from: a */
    public static final String f174898a;

    /* renamed from: b */
    public static final String f174899b;

    /* renamed from: c */
    public static final char[] f174900c = {',', '\"', '\r', '\n'};

    static {
        String valueOf = String.valueOf('\"');
        f174898a = valueOf;
        f174899b = valueOf + valueOf;
    }

    /* renamed from: org.apache.commons.text.translate.d$a */
    public static class C69988a extends AbstractC69995j {
        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.text.translate.AbstractC69995j
        /* renamed from: b */
        public void mo246272b(CharSequence charSequence, Writer writer) throws IOException {
            String charSequence2 = charSequence.toString();
            if (C69877e.m268163b(charSequence2, C69987d.f174900c)) {
                writer.write(charSequence2);
                return;
            }
            writer.write(34);
            writer.write(C69877e.m268155a(charSequence2, C69987d.f174898a, C69987d.f174899b));
            writer.write(34);
        }

        @Override // org.apache.commons.text.translate.AbstractC69985b, org.apache.commons.text.translate.AbstractC69995j
        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo246237a(CharSequence charSequence, int i, Writer writer) throws IOException {
            return super.mo246237a(charSequence, i, writer);
        }
    }

    /* renamed from: org.apache.commons.text.translate.d$b */
    public static class C69989b extends AbstractC69995j {
        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.text.translate.AbstractC69995j
        /* renamed from: b */
        public void mo246272b(CharSequence charSequence, Writer writer) throws IOException {
            if (charSequence.charAt(0) == '\"' && charSequence.charAt(charSequence.length() - 1) == '\"') {
                String charSequence2 = charSequence.subSequence(1, charSequence.length() - 1).toString();
                if (C69877e.m268160a(charSequence2, C69987d.f174900c)) {
                    writer.write(C69877e.m268155a(charSequence2, C69987d.f174899b, C69987d.f174898a));
                } else {
                    writer.write(charSequence.toString());
                }
            } else {
                writer.write(charSequence.toString());
            }
        }

        @Override // org.apache.commons.text.translate.AbstractC69985b, org.apache.commons.text.translate.AbstractC69995j
        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo246237a(CharSequence charSequence, int i, Writer writer) throws IOException {
            return super.mo246237a(charSequence, i, writer);
        }
    }
}
