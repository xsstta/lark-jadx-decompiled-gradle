package org.apache.commons.compress.compressors.pack200;

import com.ss.ugc.effectplatform.cache.disklrucache.StrictLineReader;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.p3493a.C69753g;

/* renamed from: org.apache.commons.compress.compressors.pack200.b */
public class C69841b extends AbstractC69780a {

    /* renamed from: c */
    private static final byte[] f174572c;

    /* renamed from: d */
    private static final int f174573d;

    /* renamed from: a */
    private final InputStream f174574a;

    /* renamed from: b */
    private final AbstractC69843c f174575b;

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f174575b.mo245000b().available();
    }

    public boolean markSupported() {
        try {
            return this.f174575b.mo245000b().markSupported();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.f174575b.mo245000b().read();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.f174575b.mo245000b().reset();
    }

    static {
        byte[] bArr = {-54, -2, -48, StrictLineReader.f164804b};
        f174572c = bArr;
        f174573d = bArr.length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        try {
            this.f174575b.mo245001c();
        } finally {
            InputStream inputStream = this.f174574a;
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public C69841b(InputStream inputStream) throws IOException {
        this(inputStream, Pack200Strategy.IN_MEMORY);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return C69753g.m267721a(this.f174575b.mo245000b(), j);
    }

    public void mark(int i) {
        try {
            this.f174575b.mo245000b().mark(i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return this.f174575b.mo245000b().read(bArr);
    }

    public C69841b(InputStream inputStream, Pack200Strategy pack200Strategy) throws IOException {
        this(inputStream, null, pack200Strategy, null);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f174575b.mo245000b().read(bArr, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r3.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C69841b(java.io.InputStream r3, java.io.File r4, org.apache.commons.compress.compressors.pack200.Pack200Strategy r5, java.util.Map<java.lang.String, java.lang.String> r6) throws java.io.IOException {
        /*
            r2 = this;
            r2.<init>()
            r2.f174574a = r3
            org.apache.commons.compress.compressors.pack200.c r5 = r5.newStreamBridge()
            r2.f174575b = r5
            java.util.jar.JarOutputStream r0 = new java.util.jar.JarOutputStream
            r0.<init>(r5)
            java.util.jar.Pack200$Unpacker r5 = java.util.jar.Pack200.newUnpacker()     // Catch:{ all -> 0x002f }
            if (r6 == 0) goto L_0x001d
            java.util.SortedMap r1 = r5.properties()     // Catch:{ all -> 0x002f }
            r1.putAll(r6)     // Catch:{ all -> 0x002f }
        L_0x001d:
            if (r4 != 0) goto L_0x0028
            org.apache.commons.compress.compressors.pack200.b$1 r4 = new org.apache.commons.compress.compressors.pack200.b$1     // Catch:{ all -> 0x002f }
            r4.<init>(r3)     // Catch:{ all -> 0x002f }
            r5.unpack(r4, r0)     // Catch:{ all -> 0x002f }
            goto L_0x002b
        L_0x0028:
            r5.unpack(r4, r0)     // Catch:{ all -> 0x002f }
        L_0x002b:
            r0.close()
            return
        L_0x002f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r5 = move-exception
            r3.addSuppressed(r5)
        L_0x003a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.pack200.C69841b.<init>(java.io.InputStream, java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map):void");
    }
}
