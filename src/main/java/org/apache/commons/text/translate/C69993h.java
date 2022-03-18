package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.Range;

/* renamed from: org.apache.commons.text.translate.h */
public class C69993h extends AbstractC69986c {

    /* renamed from: b */
    private final boolean f174915b;

    /* renamed from: c */
    private final Range<Integer> f174916c;

    public C69993h() {
        this(0, Integer.MAX_VALUE, true);
    }

    /* renamed from: a */
    public static C69993h m268455a(int i, int i2) {
        return new C69993h(i, i2, true);
    }

    @Override // org.apache.commons.text.translate.AbstractC69986c
    /* renamed from: a */
    public boolean mo246271a(int i, Writer writer) throws IOException {
        if (this.f174915b != this.f174916c.contains(Integer.valueOf(i))) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }

    private C69993h(int i, int i2, boolean z) {
        this.f174916c = Range.between(Integer.valueOf(i), Integer.valueOf(i2));
        this.f174915b = z;
    }
}
