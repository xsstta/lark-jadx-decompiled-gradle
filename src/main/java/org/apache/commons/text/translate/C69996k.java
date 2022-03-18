package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;

/* renamed from: org.apache.commons.text.translate.k */
public class C69996k extends AbstractC69986c {

    /* renamed from: b */
    private final int f174917b;

    /* renamed from: c */
    private final int f174918c;

    /* renamed from: d */
    private final boolean f174919d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo246273b(int i) {
        return "\\u" + m268441a(i);
    }

    @Override // org.apache.commons.text.translate.AbstractC69986c
    /* renamed from: a */
    public boolean mo246271a(int i, Writer writer) throws IOException {
        if (this.f174919d) {
            if (i < this.f174917b || i > this.f174918c) {
                return false;
            }
        } else if (i >= this.f174917b && i <= this.f174918c) {
            return false;
        }
        if (i > 65535) {
            writer.write(mo246273b(i));
            return true;
        }
        writer.write("\\u");
        writer.write(f174897a[(i >> 12) & 15]);
        writer.write(f174897a[(i >> 8) & 15]);
        writer.write(f174897a[(i >> 4) & 15]);
        writer.write(f174897a[i & 15]);
        return true;
    }

    protected C69996k(int i, int i2, boolean z) {
        this.f174917b = i;
        this.f174918c = i2;
        this.f174919d = z;
    }
}
