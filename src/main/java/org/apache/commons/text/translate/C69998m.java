package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;

/* renamed from: org.apache.commons.text.translate.m */
public class C69998m extends AbstractC69986c {
    @Override // org.apache.commons.text.translate.AbstractC69986c
    /* renamed from: a */
    public boolean mo246271a(int i, Writer writer) throws IOException {
        return i >= 55296 && i <= 57343;
    }
}
