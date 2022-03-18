package com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode;

import com.bytedance.ee.log.C13479a;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ImageHeaderParser {

    /* renamed from: a */
    private static final byte[] f19592a;

    /* renamed from: b */
    private static final int[] f19593b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: c */
    private final C7316b f19594c;

    /* renamed from: a */
    private static int m29218a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: a */
    private static boolean m29220a(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    public enum ImageType {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        private ImageType(boolean z) {
            this.hasAlpha = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.ImageHeaderParser$a */
    public static class C7315a {

        /* renamed from: a */
        private final ByteBuffer f19595a;

        /* renamed from: a */
        public int mo28528a() {
            return this.f19595a.array().length;
        }

        /* renamed from: b */
        public short mo28531b(int i) {
            return this.f19595a.getShort(i);
        }

        public C7315a(byte[] bArr) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f19595a = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo28529a(int i) {
            return this.f19595a.getInt(i);
        }

        /* renamed from: a */
        public void mo28530a(ByteOrder byteOrder) {
            this.f19595a.order(byteOrder);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.ImageHeaderParser$b */
    public static class C7316b {

        /* renamed from: a */
        private final InputStream f19596a;

        /* renamed from: c */
        public int mo28536c() throws IOException {
            return this.f19596a.read();
        }

        /* renamed from: b */
        public short mo28535b() throws IOException {
            return (short) (this.f19596a.read() & 255);
        }

        /* renamed from: a */
        public int mo28532a() throws IOException {
            return ((this.f19596a.read() << 8) & 65280) | (this.f19596a.read() & 255);
        }

        public C7316b(InputStream inputStream) {
            this.f19596a = inputStream;
        }

        /* renamed from: a */
        public int mo28533a(byte[] bArr) throws IOException {
            int length = bArr.length;
            while (length > 0) {
                int read = this.f19596a.read(bArr, bArr.length - length, length);
                if (read == -1) {
                    break;
                }
                length -= read;
            }
            return bArr.length - length;
        }

        /* renamed from: a */
        public long mo28534a(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f19596a.skip(j2);
                if (skip <= 0) {
                    if (this.f19596a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: a */
    public boolean mo28524a() throws IOException {
        return mo28525b().hasAlpha();
    }

    static {
        byte[] bArr = new byte[0];
        try {
            bArr = "Exif\u0000\u0000".getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        f19592a = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo28526c() throws java.io.IOException {
        /*
            r7 = this;
            com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.ImageHeaderParser$b r0 = r7.f19594c
            int r0 = r0.mo28532a()
            boolean r0 = m29220a(r0)
            r1 = -1
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            byte[] r0 = r7.m29221d()
            r2 = 0
            if (r0 == 0) goto L_0x001d
            int r3 = r0.length
            byte[] r4 = com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.ImageHeaderParser.f19592a
            int r4 = r4.length
            if (r3 <= r4) goto L_0x001d
            r3 = 1
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            if (r3 == 0) goto L_0x0030
            r4 = 0
        L_0x0021:
            byte[] r5 = com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.ImageHeaderParser.f19592a
            int r6 = r5.length
            if (r4 >= r6) goto L_0x0030
            byte r6 = r0[r4]
            byte r5 = r5[r4]
            if (r6 == r5) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x0030:
            r2 = r3
        L_0x0031:
            if (r2 == 0) goto L_0x003d
            com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.ImageHeaderParser$a r1 = new com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.ImageHeaderParser$a
            r1.<init>(r0)
            int r0 = m29219a(r1)
            return r0
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.ImageHeaderParser.mo28526c():int");
    }

    /* renamed from: b */
    public ImageType mo28525b() throws IOException {
        int a = this.f19594c.mo28532a();
        if (a == 65496) {
            return ImageType.JPEG;
        }
        int a2 = ((a << 16) & -65536) | (this.f19594c.mo28532a() & 65535);
        if (a2 == -1991225785) {
            this.f19594c.mo28534a(21);
            if (this.f19594c.mo28536c() >= 3) {
                return ImageType.PNG_A;
            }
            return ImageType.PNG;
        } else if ((a2 >> 8) == 4671814) {
            return ImageType.GIF;
        } else {
            return ImageType.UNKNOWN;
        }
    }

    /* renamed from: d */
    private byte[] m29221d() throws IOException {
        short b;
        int a;
        long j;
        long a2;
        do {
            short b2 = this.f19594c.mo28535b();
            if (b2 != 255) {
                C13479a.m54772d("ImageHeaderParser", "Unknown segmentId=" + ((int) b2));
                return null;
            }
            b = this.f19594c.mo28535b();
            if (b == 218) {
                return null;
            }
            if (b == 217) {
                C13479a.m54772d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                return null;
            }
            a = this.f19594c.mo28532a() - 2;
            if (b != 225) {
                j = (long) a;
                a2 = this.f19594c.mo28534a(j);
            } else {
                byte[] bArr = new byte[a];
                int a3 = this.f19594c.mo28533a(bArr);
                if (a3 == a) {
                    return bArr;
                }
                C13479a.m54772d("ImageHeaderParser", "Unable to read segment data, type: " + ((int) b) + ", length: " + a + ", actually read: " + a3);
                return null;
            }
        } while (a2 == j);
        C13479a.m54772d("ImageHeaderParser", "Unable to skip enough data, type: " + ((int) b) + ", wanted to skip: " + a + ", but actually skipped: " + a2);
        return null;
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.f19594c = new C7316b(inputStream);
    }

    /* renamed from: a */
    private static int m29219a(C7315a aVar) {
        ByteOrder byteOrder;
        short b = aVar.mo28531b(6);
        if (b == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (b == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            C13479a.m54772d("ImageHeaderParser", "Unknown endianness = " + ((int) b));
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        aVar.mo28530a(byteOrder);
        int a = aVar.mo28529a(10) + 6;
        short b2 = aVar.mo28531b(a);
        for (int i = 0; i < b2; i++) {
            int a2 = m29218a(a, i);
            short b3 = aVar.mo28531b(a2);
            if (b3 == 274) {
                short b4 = aVar.mo28531b(a2 + 2);
                if (b4 < 1 || b4 > 12) {
                    C13479a.m54772d("ImageHeaderParser", "Got invalid format code=" + ((int) b4));
                } else {
                    int a3 = aVar.mo28529a(a2 + 4);
                    if (a3 < 0) {
                        C13479a.m54772d("ImageHeaderParser", "Negative tiff component count");
                    } else {
                        C13479a.m54772d("ImageHeaderParser", "Got tagIndex=" + i + " tagType=" + ((int) b3) + " formatCode=" + ((int) b4) + " componentCount=" + a3);
                        int i2 = a3 + f19593b[b4];
                        if (i2 > 4) {
                            C13479a.m54772d("ImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) b4));
                        } else {
                            int i3 = a2 + 8;
                            if (i3 < 0 || i3 > aVar.mo28528a()) {
                                C13479a.m54772d("ImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) b3));
                            } else if (i2 >= 0 && i2 + i3 <= aVar.mo28528a()) {
                                return aVar.mo28531b(i3);
                            } else {
                                C13479a.m54772d("ImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) b3));
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
}
