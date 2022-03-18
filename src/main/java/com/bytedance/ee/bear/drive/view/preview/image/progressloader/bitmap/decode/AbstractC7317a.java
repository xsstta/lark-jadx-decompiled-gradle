package com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.ImageHeaderParser;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7301c;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7327a;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7329c;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7330d;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7333f;
import com.bytedance.ee.log.C13479a;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.a */
public abstract class AbstractC7317a {

    /* renamed from: a */
    public static final AbstractC7317a f19602a = new AbstractC7317a() {
        /* class com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.AbstractC7317a.C73181 */

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.AbstractC7317a
        /* renamed from: a */
        public int mo28546a(int i, int i2, int i3, int i4) {
            return Math.min(i2 / i4, i / i3);
        }
    };

    /* renamed from: b */
    public static final AbstractC7317a f19603b = new AbstractC7317a() {
        /* class com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.AbstractC7317a.C73192 */

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.AbstractC7317a
        /* renamed from: a */
        public int mo28546a(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return max << i5;
        }
    };

    /* renamed from: c */
    public static final AbstractC7317a f19604c = new AbstractC7317a() {
        /* class com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.AbstractC7317a.C73203 */

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.AbstractC7317a
        /* renamed from: a */
        public int mo28546a(int i, int i2, int i3, int i4) {
            return 0;
        }
    };

    /* renamed from: d */
    private static final Set<ImageHeaderParser.ImageType> f19605d = EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG);

    /* renamed from: e */
    private static final Queue<BitmapFactory.Options> f19606e = C7333f.m29295a(0);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo28546a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    private static synchronized BitmapFactory.Options m29240a() {
        BitmapFactory.Options poll;
        synchronized (AbstractC7317a.class) {
            Queue<BitmapFactory.Options> queue = f19606e;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m29245b(poll);
            }
        }
        return poll;
    }

    /* renamed from: a */
    private static void m29241a(BitmapFactory.Options options) {
        m29245b(options);
        Queue<BitmapFactory.Options> queue = f19606e;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: b */
    private static void m29245b(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= Build.VERSION.SDK_INT) {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }

    /* renamed from: a */
    private static boolean m29243a(InputStream inputStream) {
        if (19 <= Build.VERSION.SDK_INT) {
            return true;
        }
        inputStream.mark(1024);
        try {
            boolean contains = f19605d.contains(new ImageHeaderParser(inputStream).mo28525b());
            try {
                inputStream.reset();
            } catch (IOException e) {
                C13479a.m54773d("Downsampler", "Cannot reset the input stream", e);
            }
            return contains;
        } catch (IOException e2) {
            C13479a.m54773d("Downsampler", "Cannot determine the image type from header", e2);
            try {
                inputStream.reset();
                return false;
            } catch (IOException e3) {
                C13479a.m54773d("Downsampler", "Cannot reset the input stream", e3);
                return false;
            }
        } catch (Throwable th) {
            try {
                inputStream.reset();
            } catch (IOException e4) {
                C13479a.m54773d("Downsampler", "Cannot reset the input stream", e4);
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static Bitmap.Config m29238a(InputStream inputStream, DecodeFormat decodeFormat) {
        if (decodeFormat == DecodeFormat.ALWAYS_ARGB_8888 || decodeFormat == DecodeFormat.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
            return Bitmap.Config.ARGB_8888;
        }
        boolean z = false;
        inputStream.mark(1024);
        try {
            z = new ImageHeaderParser(inputStream).mo28524a();
            try {
                inputStream.reset();
            } catch (IOException e) {
                C13479a.m54773d("Downsampler", "Cannot reset the input stream", e);
            }
        } catch (IOException e2) {
            C13479a.m54773d("Downsampler", "Cannot determine whether the image has alpha or not from header for format " + decodeFormat, e2);
            inputStream.reset();
        } catch (Throwable th) {
            try {
                inputStream.reset();
            } catch (IOException e3) {
                C13479a.m54773d("Downsampler", "Cannot reset the input stream", e3);
            }
            throw th;
        }
        if (z) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGB_565;
    }

    /* renamed from: a */
    private static void m29242a(BitmapFactory.Options options, Bitmap bitmap) {
        if (11 <= Build.VERSION.SDK_INT) {
            options.inBitmap = bitmap;
        }
    }

    /* renamed from: b */
    private static Bitmap m29244b(C7330d dVar, RecyclableBufferedInputStream recyclableBufferedInputStream, BitmapFactory.Options options) {
        if (options.inJustDecodeBounds) {
            dVar.mark(5242880);
        } else {
            recyclableBufferedInputStream.mo28537a();
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(dVar, null, options);
        try {
            if (options.inJustDecodeBounds) {
                dVar.reset();
            }
        } catch (IOException e) {
            C13479a.m54759a("Downsampler", "Exception loading inDecodeBounds=" + options.inJustDecodeBounds + " sample=" + options.inSampleSize, e);
        }
        return decodeStream;
    }

    /* renamed from: a */
    public int[] mo28548a(C7330d dVar, RecyclableBufferedInputStream recyclableBufferedInputStream, BitmapFactory.Options options) {
        options.inJustDecodeBounds = true;
        m29244b(dVar, recyclableBufferedInputStream, options);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: a */
    private int m29237a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (i5 == Integer.MIN_VALUE) {
            i5 = i3;
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = i2;
        }
        if (i == 90 || i == 270) {
            i6 = mo28546a(i3, i2, i4, i5);
        } else {
            i6 = mo28546a(i2, i3, i4, i5);
        }
        if (i6 == 0) {
            i7 = 0;
        } else {
            i7 = Integer.highestOneBit(i6);
        }
        return Math.max(1, i7);
    }

    /* renamed from: a */
    public Bitmap mo28547a(InputStream inputStream, AbstractC7301c cVar, int i, int i2, DecodeFormat decodeFormat) {
        int i3;
        C7327a a = C7327a.m29273a();
        byte[] b = a.mo28559b();
        byte[] b2 = a.mo28559b();
        BitmapFactory.Options a2 = m29240a();
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, b2);
        C7329c a3 = C7329c.m29278a(recyclableBufferedInputStream);
        C7330d dVar = new C7330d(a3);
        try {
            a3.mark(5242880);
            try {
                int c = new ImageHeaderParser(a3).mo28526c();
                try {
                    a3.reset();
                } catch (IOException e) {
                    C13479a.m54773d("Downsampler", "Cannot reset the input stream", e);
                }
                i3 = c;
            } catch (IOException e2) {
                C13479a.m54773d("Downsampler", "Cannot determine the image orientation from header", e2);
                try {
                    a3.reset();
                } catch (IOException e3) {
                    C13479a.m54773d("Downsampler", "Cannot reset the input stream", e3);
                }
                i3 = 0;
            } catch (Throwable th) {
                try {
                    a3.reset();
                } catch (IOException e4) {
                    C13479a.m54773d("Downsampler", "Cannot reset the input stream", e4);
                }
                throw th;
            }
            a2.inTempStorage = b;
            int[] a4 = mo28548a(dVar, recyclableBufferedInputStream, a2);
            int i4 = a4[0];
            int i5 = a4[1];
            Bitmap a5 = m29239a(dVar, recyclableBufferedInputStream, a2, cVar, i4, i5, m29237a(C7321b.m29252a(i3), i4, i5, i, i2), decodeFormat);
            IOException a6 = a3.mo28564a();
            if (a6 == null) {
                Bitmap bitmap = null;
                if (a5 != null) {
                    bitmap = C7321b.m29254a(a5, cVar, i3);
                    if (!a5.equals(bitmap) && !cVar.mo28506a(a5)) {
                        a5.recycle();
                    }
                }
                return bitmap;
            }
            throw new RuntimeException(a6);
        } finally {
            a.mo28558a(b);
            a.mo28558a(b2);
            a3.mo28566b();
            m29241a(a2);
        }
    }

    /* renamed from: a */
    private Bitmap m29239a(C7330d dVar, RecyclableBufferedInputStream recyclableBufferedInputStream, BitmapFactory.Options options, AbstractC7301c cVar, int i, int i2, int i3, DecodeFormat decodeFormat) {
        Bitmap.Config a = m29238a(dVar, decodeFormat);
        options.inSampleSize = i3;
        options.inPreferredConfig = a;
        if ((options.inSampleSize == 1 || 19 <= Build.VERSION.SDK_INT) && m29243a(dVar)) {
            double d = (double) i3;
            m29242a(options, cVar.mo28507b((int) Math.ceil(((double) i) / d), (int) Math.ceil(((double) i2) / d), a));
        }
        return m29244b(dVar, recyclableBufferedInputStream, options);
    }
}
