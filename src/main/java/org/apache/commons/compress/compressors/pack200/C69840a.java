package org.apache.commons.compress.compressors.pack200;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.commons.compress.compressors.pack200.a */
class C69840a extends AbstractC69843c {
    C69840a() {
        super(new ByteArrayOutputStream());
    }

    /* access modifiers changed from: package-private */
    @Override // org.apache.commons.compress.compressors.pack200.AbstractC69843c
    /* renamed from: a */
    public InputStream mo244989a() throws IOException {
        return new ByteArrayInputStream(((ByteArrayOutputStream) this.out).toByteArray());
    }
}
