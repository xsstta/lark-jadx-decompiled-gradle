package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;

/* renamed from: org.apache.commons.text.translate.c */
public abstract class AbstractC69986c extends AbstractC69985b {
    /* renamed from: a */
    public abstract boolean mo246271a(int i, Writer writer) throws IOException;

    @Override // org.apache.commons.text.translate.AbstractC69985b
    /* renamed from: a */
    public final int mo246237a(CharSequence charSequence, int i, Writer writer) throws IOException {
        return mo246271a(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }
}
