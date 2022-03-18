package org.apache.commons.compress.compressors.snappy;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.lz77support.AbstractC69833a;
import org.apache.commons.compress.p3493a.C69748c;

/* renamed from: org.apache.commons.compress.compressors.snappy.c */
public class C69849c extends AbstractC69833a {

    /* renamed from: b */
    private final int f174598b;

    /* renamed from: c */
    private int f174599c;

    /* renamed from: d */
    private EnumC69851a f174600d;

    /* renamed from: e */
    private boolean f174601e;

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.compress.compressors.snappy.c$a */
    public enum EnumC69851a {
        NO_BLOCK,
        IN_LITERAL,
        IN_BACK_REFERENCE
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.compress.compressors.snappy.c$1 */
    public static /* synthetic */ class C698501 {

        /* renamed from: a */
        static final /* synthetic */ int[] f174602a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.apache.commons.compress.compressors.snappy.c$a[] r0 = org.apache.commons.compress.compressors.snappy.C69849c.EnumC69851a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.compress.compressors.snappy.C69849c.C698501.f174602a = r0
                org.apache.commons.compress.compressors.snappy.c$a r1 = org.apache.commons.compress.compressors.snappy.C69849c.EnumC69851a.NO_BLOCK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = org.apache.commons.compress.compressors.snappy.C69849c.C698501.f174602a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.apache.commons.compress.compressors.snappy.c$a r1 = org.apache.commons.compress.compressors.snappy.C69849c.EnumC69851a.IN_LITERAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = org.apache.commons.compress.compressors.snappy.C69849c.C698501.f174602a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.apache.commons.compress.compressors.snappy.c$a r1 = org.apache.commons.compress.compressors.snappy.C69849c.EnumC69851a.IN_BACK_REFERENCE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.snappy.C69849c.C698501.<clinit>():void");
        }
    }

    /* renamed from: e */
    private long m268043e() throws IOException {
        int i = 0;
        long j = 0;
        while (true) {
            int c = mo244970c();
            if (c != -1) {
                int i2 = i + 1;
                j |= (long) ((c & SmActions.ACTION_ONTHECALL_ENTRY) << (i * 7));
                if ((c & SmActions.ACTION_ONTHECALL_EXIT) == 0) {
                    return j;
                }
                i = i2;
            } else {
                throw new IOException("Premature end of stream reading size");
            }
        }
    }

    /* renamed from: d */
    private void m268042d() throws IOException {
        if (this.f174599c == 0) {
            this.f174601e = true;
            return;
        }
        int c = mo244970c();
        if (c != -1) {
            int i = c & 3;
            if (i == 0) {
                int b = m268041b(c);
                this.f174599c -= b;
                mo244971c((long) b);
                this.f174600d = EnumC69851a.IN_LITERAL;
            } else if (i == 1) {
                int i2 = ((c >> 2) & 7) + 4;
                this.f174599c -= i2;
                int i3 = (c & 224) << 3;
                int c2 = mo244970c();
                if (c2 != -1) {
                    mo244965a(i3 | c2, (long) i2);
                    this.f174600d = EnumC69851a.IN_BACK_REFERENCE;
                    return;
                }
                throw new IOException("Premature end of stream reading back-reference length");
            } else if (i == 2) {
                int i4 = (c >> 2) + 1;
                this.f174599c -= i4;
                mo244965a((int) C69748c.m267710a(this.f174543a, 2), (long) i4);
                this.f174600d = EnumC69851a.IN_BACK_REFERENCE;
            } else if (i == 3) {
                int i5 = (c >> 2) + 1;
                this.f174599c -= i5;
                mo244965a(Integer.MAX_VALUE & ((int) C69748c.m267710a(this.f174543a, 4)), (long) i5);
                this.f174600d = EnumC69851a.IN_BACK_REFERENCE;
            }
        } else {
            throw new IOException("Premature end of stream reading block start");
        }
    }

    public C69849c(InputStream inputStream) throws IOException {
        this(inputStream, 32768);
    }

    /* renamed from: b */
    private int m268041b(int i) throws IOException {
        long j;
        int i2 = i >> 2;
        switch (i2) {
            case 60:
                i2 = mo244970c();
                if (i2 == -1) {
                    throw new IOException("Premature end of stream reading literal length");
                }
                break;
            case 61:
                j = C69748c.m267710a(this.f174543a, 2);
                i2 = (int) j;
                break;
            case 62:
                j = C69748c.m267710a(this.f174543a, 3);
                i2 = (int) j;
                break;
            case 63:
                j = C69748c.m267710a(this.f174543a, 4);
                i2 = (int) j;
                break;
        }
        return i2 + 1;
    }

    public C69849c(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.f174600d = EnumC69851a.NO_BLOCK;
        int e = (int) m268043e();
        this.f174598b = e;
        this.f174599c = e;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f174601e) {
            return -1;
        }
        int i3 = C698501.f174602a[this.f174600d.ordinal()];
        if (i3 == 1) {
            m268042d();
            return read(bArr, i, i2);
        } else if (i3 == 2) {
            int a = mo244964a(bArr, i, i2);
            if (!mo244969b()) {
                this.f174600d = EnumC69851a.NO_BLOCK;
            }
            if (a > 0) {
                return a;
            }
            return read(bArr, i, i2);
        } else if (i3 == 3) {
            int b = mo244968b(bArr, i, i2);
            if (!mo244969b()) {
                this.f174600d = EnumC69851a.NO_BLOCK;
            }
            if (b > 0) {
                return b;
            }
            return read(bArr, i, i2);
        } else {
            throw new IOException("Unknown stream state " + this.f174600d);
        }
    }
}
