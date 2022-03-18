package org.apache.commons.compress.compressors.lz4;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.lz77support.AbstractC69833a;
import org.apache.commons.compress.p3493a.C69748c;

/* renamed from: org.apache.commons.compress.compressors.lz4.a */
public class C69819a extends AbstractC69833a {

    /* renamed from: b */
    private int f174485b;

    /* renamed from: c */
    private EnumC69821a f174486c = EnumC69821a.NO_BLOCK;

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.compress.compressors.lz4.a$a */
    public enum EnumC69821a {
        NO_BLOCK,
        IN_LITERAL,
        LOOKING_FOR_BACK_REFERENCE,
        IN_BACK_REFERENCE,
        EOF
    }

    /* renamed from: e */
    private long m267922e() throws IOException {
        int c;
        long j = 0;
        do {
            c = mo244970c();
            if (c != -1) {
                j += (long) c;
            } else {
                throw new IOException("Premature end of stream while parsing length");
            }
        } while (c == 255);
        return j;
    }

    /* renamed from: org.apache.commons.compress.compressors.lz4.a$1 */
    static /* synthetic */ class C698201 {

        /* renamed from: a */
        static final /* synthetic */ int[] f174487a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.apache.commons.compress.compressors.lz4.a$a[] r0 = org.apache.commons.compress.compressors.lz4.C69819a.EnumC69821a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.compress.compressors.lz4.C69819a.C698201.f174487a = r0
                org.apache.commons.compress.compressors.lz4.a$a r1 = org.apache.commons.compress.compressors.lz4.C69819a.EnumC69821a.EOF     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = org.apache.commons.compress.compressors.lz4.C69819a.C698201.f174487a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.apache.commons.compress.compressors.lz4.a$a r1 = org.apache.commons.compress.compressors.lz4.C69819a.EnumC69821a.NO_BLOCK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = org.apache.commons.compress.compressors.lz4.C69819a.C698201.f174487a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.apache.commons.compress.compressors.lz4.a$a r1 = org.apache.commons.compress.compressors.lz4.C69819a.EnumC69821a.IN_LITERAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = org.apache.commons.compress.compressors.lz4.C69819a.C698201.f174487a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.apache.commons.compress.compressors.lz4.a$a r1 = org.apache.commons.compress.compressors.lz4.C69819a.EnumC69821a.LOOKING_FOR_BACK_REFERENCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = org.apache.commons.compress.compressors.lz4.C69819a.C698201.f174487a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.apache.commons.compress.compressors.lz4.a$a r1 = org.apache.commons.compress.compressors.lz4.C69819a.EnumC69821a.IN_BACK_REFERENCE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.lz4.C69819a.C698201.<clinit>():void");
        }
    }

    /* renamed from: d */
    private void m267921d() throws IOException {
        int c = mo244970c();
        if (c != -1) {
            this.f174485b = c & 15;
            long j = (long) ((c & 240) >> 4);
            if (j == 15) {
                j += m267922e();
            }
            mo244971c(j);
            this.f174486c = EnumC69821a.IN_LITERAL;
            return;
        }
        throw new IOException("Premature end of stream while looking for next block");
    }

    /* renamed from: f */
    private boolean m267923f() throws IOException {
        try {
            int a = (int) C69748c.m267710a(this.f174543a, 2);
            int i = this.f174485b;
            long j = (long) i;
            if (i == 15) {
                j += m267922e();
            }
            mo244965a(a, j + 4);
            this.f174486c = EnumC69821a.IN_BACK_REFERENCE;
            return true;
        } catch (IOException e) {
            if (this.f174485b == 0) {
                return false;
            }
            throw e;
        }
    }

    public C69819a(InputStream inputStream) throws IOException {
        super(inputStream, 65536);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = C698201.f174487a[this.f174486c.ordinal()];
        if (i3 == 1) {
            return -1;
        }
        if (i3 == 2) {
            m267921d();
        } else if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new IOException("Unknown stream state " + this.f174486c);
                }
            } else if (!m267923f()) {
                this.f174486c = EnumC69821a.EOF;
                return -1;
            }
            int b = mo244968b(bArr, i, i2);
            if (!mo244969b()) {
                this.f174486c = EnumC69821a.NO_BLOCK;
            }
            if (b > 0) {
                return b;
            }
            return read(bArr, i, i2);
        }
        int a = mo244964a(bArr, i, i2);
        if (!mo244969b()) {
            this.f174486c = EnumC69821a.LOOKING_FOR_BACK_REFERENCE;
        }
        if (a > 0) {
            return a;
        }
        return read(bArr, i, i2);
    }
}
