package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.util.C2567j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f7947a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f7948b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    private static int m10185a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: a */
    private static boolean m10190a(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo10477a(ByteBuffer byteBuffer) throws IOException {
        return m10189a(new C2406a((ByteBuffer) C2567j.m10894a(byteBuffer)));
    }

    /* access modifiers changed from: private */
    public interface Reader {
        /* renamed from: a */
        int mo10919a(byte[] bArr, int i) throws IOException;

        /* renamed from: a */
        long mo10920a(long j) throws IOException;

        /* renamed from: a */
        short mo10921a() throws IOException;

        /* renamed from: b */
        int mo10922b() throws IOException;

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C2407b {

        /* renamed from: a */
        private final ByteBuffer f7950a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo10923a() {
            return this.f7950a.remaining();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public short mo10926b(int i) {
            if (m10204a(i, 2)) {
                return this.f7950a.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo10924a(int i) {
            if (m10204a(i, 4)) {
                return this.f7950a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10925a(ByteOrder byteOrder) {
            this.f7950a.order(byteOrder);
        }

        /* renamed from: a */
        private boolean m10204a(int i, int i2) {
            if (this.f7950a.remaining() - i >= i2) {
                return true;
            }
            return false;
        }

        C2407b(byte[] bArr, int i) {
            this.f7950a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    private static final class C2406a implements Reader {

        /* renamed from: a */
        private final ByteBuffer f7949a;

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo10922b() throws Reader.EndOfFileException {
            return (mo10921a() << 8) | mo10921a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public short mo10921a() throws Reader.EndOfFileException {
            if (this.f7949a.remaining() >= 1) {
                return (short) (this.f7949a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        C2406a(ByteBuffer byteBuffer) {
            this.f7949a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public long mo10920a(long j) {
            int min = (int) Math.min((long) this.f7949a.remaining(), j);
            ByteBuffer byteBuffer = this.f7949a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo10919a(byte[] bArr, int i) {
            int min = Math.min(i, this.f7949a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f7949a.get(bArr, 0, min);
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    private static final class C2408c implements Reader {

        /* renamed from: a */
        private final InputStream f7951a;

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo10922b() throws IOException {
            return (mo10921a() << 8) | mo10921a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public short mo10921a() throws IOException {
            int read = this.f7951a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        C2408c(InputStream inputStream) {
            this.f7951a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public long mo10920a(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f7951a.skip(j2);
                if (skip <= 0) {
                    if (this.f7951a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo10919a(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f7951a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new Reader.EndOfFileException();
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo10476a(InputStream inputStream) throws IOException {
        return m10189a(new C2408c((InputStream) C2567j.m10894a(inputStream)));
    }

    /* renamed from: b */
    private int m10192b(Reader reader) throws IOException {
        short a;
        int b;
        long j;
        long a2;
        do {
            short a3 = reader.mo10921a();
            if (a3 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) a3));
                }
                return -1;
            }
            a = reader.mo10921a();
            if (a == 218) {
                return -1;
            }
            if (a == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            b = reader.mo10922b() - 2;
            if (a == 225) {
                return b;
            }
            j = (long) b;
            a2 = reader.mo10920a(j);
        } while (a2 == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) a) + ", wanted to skip: " + b + ", but actually skipped: " + a2);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m10188a(C2407b bVar) {
        ByteOrder byteOrder;
        short b = bVar.mo10926b(6);
        if (b == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (b != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) b));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo10925a(byteOrder);
        int a = bVar.mo10924a(10) + 6;
        short b2 = bVar.mo10926b(a);
        for (int i = 0; i < b2; i++) {
            int a2 = m10185a(a, i);
            short b3 = bVar.mo10926b(a2);
            if (b3 == 274) {
                short b4 = bVar.mo10926b(a2 + 2);
                if (b4 >= 1 && b4 <= 12) {
                    int a3 = bVar.mo10924a(a2 + 4);
                    if (a3 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + ((int) b3) + " formatCode=" + ((int) b4) + " componentCount=" + a3);
                        }
                        int i2 = a3 + f7948b[b4];
                        if (i2 <= 4) {
                            int i3 = a2 + 8;
                            if (i3 < 0 || i3 > bVar.mo10923a()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) b3));
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo10923a()) {
                                return bVar.mo10926b(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) b3));
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) b4));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) b4));
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    private ImageHeaderParser.ImageType m10189a(Reader reader) throws IOException {
        try {
            int b = reader.mo10922b();
            if (b == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int a = (b << 8) | reader.mo10921a();
            if (a == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int a2 = (a << 8) | reader.mo10921a();
            if (a2 == -1991225785) {
                reader.mo10920a(21);
                try {
                    if (reader.mo10921a() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (a2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                reader.mo10920a(4);
                if (((reader.mo10922b() << 16) | reader.mo10922b()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int b2 = (reader.mo10922b() << 16) | reader.mo10922b();
                if ((b2 & -256) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = b2 & 255;
                if (i == 88) {
                    reader.mo10920a(4);
                    if ((reader.mo10921a() & 16) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    reader.mo10920a(4);
                    if ((reader.mo10921a() & 8) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: a */
    private boolean m10191a(byte[] bArr, int i) {
        boolean z;
        if (bArr == null || i <= f7947a.length) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f7947a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private int m10186a(Reader reader, AbstractC2278b bVar) throws IOException {
        try {
            int b = reader.mo10922b();
            if (!m10190a(b)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + b);
                }
                return -1;
            }
            int b2 = m10192b(reader);
            if (b2 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.mo10668a(b2, byte[].class);
            try {
                return m10187a(reader, bArr, b2);
            } finally {
                bVar.mo10671a(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo10475a(InputStream inputStream, AbstractC2278b bVar) throws IOException {
        return m10186a(new C2408c((InputStream) C2567j.m10894a(inputStream)), (AbstractC2278b) C2567j.m10894a(bVar));
    }

    /* renamed from: a */
    private int m10187a(Reader reader, byte[] bArr, int i) throws IOException {
        int a = reader.mo10919a(bArr, i);
        if (a != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + a);
            }
            return -1;
        } else if (m10191a(bArr, i)) {
            return m10188a(new C2407b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }
}
