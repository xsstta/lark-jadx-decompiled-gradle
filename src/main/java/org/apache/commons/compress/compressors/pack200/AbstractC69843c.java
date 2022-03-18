package org.apache.commons.compress.compressors.pack200;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* access modifiers changed from: package-private */
/* renamed from: org.apache.commons.compress.compressors.pack200.c */
public abstract class AbstractC69843c extends FilterOutputStream {

    /* renamed from: a */
    private InputStream f174577a;

    /* renamed from: b */
    private final Object f174578b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract InputStream mo244989a() throws IOException;

    protected AbstractC69843c() {
        this(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public InputStream mo245000b() throws IOException {
        synchronized (this.f174578b) {
            if (this.f174577a == null) {
                this.f174577a = mo244989a();
            }
        }
        return this.f174577a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo245001c() throws IOException {
        close();
        synchronized (this.f174578b) {
            InputStream inputStream = this.f174577a;
            if (inputStream != null) {
                inputStream.close();
                this.f174577a = null;
            }
        }
    }

    protected AbstractC69843c(OutputStream outputStream) {
        super(outputStream);
        this.f174578b = new Object();
    }
}
