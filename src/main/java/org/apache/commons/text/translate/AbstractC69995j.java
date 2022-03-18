package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;

/* access modifiers changed from: package-private */
/* renamed from: org.apache.commons.text.translate.j */
public abstract class AbstractC69995j extends AbstractC69985b {
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo246272b(CharSequence charSequence, Writer writer) throws IOException;

    AbstractC69995j() {
    }

    /* renamed from: a */
    private String m268460a() {
        Class<?> cls = getClass();
        if (cls.isAnonymousClass()) {
            return cls.getName();
        }
        return cls.getSimpleName();
    }

    @Override // org.apache.commons.text.translate.AbstractC69985b
    /* renamed from: a */
    public int mo246237a(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (i == 0) {
            mo246272b(charSequence, writer);
            return Character.codePointCount(charSequence, i, charSequence.length());
        }
        throw new IllegalArgumentException(m268460a() + ".translate(final CharSequence input, final int index, final Writer out) can not handle a non-zero index.");
    }
}
