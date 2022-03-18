package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C2267e;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.p083a.C2163m;
import com.bumptech.glide.load.resource.bitmap.AbstractC2443q;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.util.C2563f;
import com.bumptech.glide.util.C2567j;
import com.bumptech.glide.util.C2568k;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k */
public final class C2434k {

    /* renamed from: a */
    public static final C2267e<DecodeFormat> f7985a = C2267e.m9710a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* renamed from: b */
    public static final C2267e<PreferredColorSpace> f7986b = C2267e.m9710a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", PreferredColorSpace.SRGB);

    /* renamed from: c */
    public static final C2267e<DownsampleStrategy> f7987c = DownsampleStrategy.f7959h;

    /* renamed from: d */
    public static final C2267e<Boolean> f7988d = C2267e.m9710a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", (Object) false);

    /* renamed from: e */
    public static final C2267e<Boolean> f7989e = C2267e.m9710a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", (Object) false);

    /* renamed from: f */
    private static final Set<String> f7990f = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));

    /* renamed from: g */
    private static final AbstractC2436a f7991g = new AbstractC2436a() {
        /* class com.bumptech.glide.load.resource.bitmap.C2434k.C24351 */

        @Override // com.bumptech.glide.load.resource.bitmap.C2434k.AbstractC2436a
        /* renamed from: a */
        public void mo10953a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2434k.AbstractC2436a
        /* renamed from: a */
        public void mo10954a(AbstractC2283e eVar, Bitmap bitmap) {
        }
    };

    /* renamed from: h */
    private static final Set<ImageHeaderParser.ImageType> f7992h = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: i */
    private static final Queue<BitmapFactory.Options> f7993i = C2568k.m10909a(0);

    /* renamed from: j */
    private final AbstractC2283e f7994j;

    /* renamed from: k */
    private final DisplayMetrics f7995k;

    /* renamed from: l */
    private final AbstractC2278b f7996l;

    /* renamed from: m */
    private final List<ImageHeaderParser> f7997m;

    /* renamed from: n */
    private final C2442p f7998n = C2442p.m10316a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k$a */
    public interface AbstractC2436a {
        /* renamed from: a */
        void mo10953a();

        /* renamed from: a */
        void mo10954a(AbstractC2283e eVar, Bitmap bitmap) throws IOException;
    }

    /* renamed from: a */
    private static boolean m10286a(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: c */
    private static int m10293c(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: a */
    public boolean mo10951a(InputStream inputStream) {
        return true;
    }

    /* renamed from: a */
    public boolean mo10952a(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10948a(InputStream inputStream, int i, int i2, C2390f fVar) throws IOException {
        return mo10949a(inputStream, i, i2, fVar, f7991g);
    }

    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10949a(InputStream inputStream, int i, int i2, C2390f fVar, AbstractC2436a aVar) throws IOException {
        return m10279a(new AbstractC2443q.C2444a(inputStream, this.f7997m, this.f7996l), i, i2, fVar, aVar);
    }

    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10947a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C2390f fVar) throws IOException {
        return m10279a(new AbstractC2443q.C2445b(parcelFileDescriptor, this.f7997m, this.f7996l), i, i2, fVar, f7991g);
    }

    /* renamed from: a */
    private static void m10284a(ImageHeaderParser.ImageType imageType, AbstractC2443q qVar, AbstractC2436a aVar, AbstractC2283e eVar, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        double d;
        if (i2 > 0 && i3 > 0) {
            if (m10286a(i)) {
                i6 = i2;
                i7 = i3;
            } else {
                i7 = i2;
                i6 = i3;
            }
            float a = downsampleStrategy.mo10927a(i7, i6, i4, i5);
            if (a > BitmapDescriptorFactory.HUE_RED) {
                DownsampleStrategy.SampleSizeRounding b = downsampleStrategy.mo10928b(i7, i6, i4, i5);
                if (b != null) {
                    float f = (float) i7;
                    float f2 = (float) i6;
                    int c = i7 / m10293c((double) (a * f));
                    int c2 = i6 / m10293c((double) (a * f2));
                    if (b == DownsampleStrategy.SampleSizeRounding.MEMORY) {
                        i8 = Math.max(c, c2);
                    } else {
                        i8 = Math.min(c, c2);
                    }
                    if (Build.VERSION.SDK_INT > 23 || !f7990f.contains(options.outMimeType)) {
                        i9 = Math.max(1, Integer.highestOneBit(i8));
                        if (b == DownsampleStrategy.SampleSizeRounding.MEMORY && ((float) i9) < 1.0f / a) {
                            i9 <<= 1;
                        }
                    } else {
                        i9 = 1;
                    }
                    options.inSampleSize = i9;
                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                        float min = (float) Math.min(i9, 8);
                        i10 = (int) Math.ceil((double) (f / min));
                        i11 = (int) Math.ceil((double) (f2 / min));
                        int i12 = i9 / 8;
                        if (i12 > 0) {
                            i10 /= i12;
                            i11 /= i12;
                        }
                    } else {
                        if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                            float f3 = (float) i9;
                            i10 = (int) Math.floor((double) (f / f3));
                            d = Math.floor((double) (f2 / f3));
                        } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                float f4 = (float) i9;
                                i10 = Math.round(f / f4);
                                i11 = Math.round(f2 / f4);
                            } else {
                                float f5 = (float) i9;
                                i10 = (int) Math.floor((double) (f / f5));
                                d = Math.floor((double) (f2 / f5));
                            }
                        } else if (i7 % i9 == 0 && i6 % i9 == 0) {
                            i10 = i7 / i9;
                            i11 = i6 / i9;
                        } else {
                            int[] a2 = m10289a(qVar, options, aVar, eVar);
                            i10 = a2[0];
                            i11 = a2[1];
                        }
                        i11 = (int) d;
                    }
                    double a3 = (double) downsampleStrategy.mo10927a(i10, i11, i4, i5);
                    if (Build.VERSION.SDK_INT >= 19) {
                        options.inTargetDensity = m10276a(a3);
                        options.inDensity = m10290b(a3);
                    }
                    if (m10287a(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculate scaling, source: [" + i2 + "x" + i3 + "], degreesToRotate: " + i + ", target: [" + i4 + "x" + i5 + "], power of two scaled: [" + i10 + "x" + i11 + "], exact scale factor: " + a + ", power of 2 sample size: " + i9 + ", adjusted scale factor: " + a3 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + a + " from: " + downsampleStrategy + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "]");
        } else if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i4 + "x" + i5 + "]");
        }
    }

    /* renamed from: a */
    private boolean m10288a(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f7992h.contains(imageType);
    }

    /* renamed from: a */
    private void m10285a(AbstractC2443q qVar, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (!this.f7998n.mo10956a(i, i2, options, z, z2)) {
            if (decodeFormat == DecodeFormat.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = qVar.mo10959a().hasAlpha();
            } catch (IOException e) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e);
                }
            }
            options.inPreferredConfig = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            if (options.inPreferredConfig == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* renamed from: a */
    private static int[] m10289a(AbstractC2443q qVar, BitmapFactory.Options options, AbstractC2436a aVar, AbstractC2283e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        m10291b(qVar, options, aVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: a */
    private static boolean m10287a(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    /* renamed from: a */
    private static void m10283a(BitmapFactory.Options options, AbstractC2283e eVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.mo10694b(i, i2, config);
    }

    /* renamed from: a */
    private static synchronized BitmapFactory.Options m10278a() {
        BitmapFactory.Options poll;
        synchronized (C2434k.class) {
            Queue<BitmapFactory.Options> queue = f7993i;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m10295d(poll);
            }
        }
        return poll;
    }

    /* renamed from: b */
    private static String m10292b(BitmapFactory.Options options) {
        return m10281a(options.inBitmap);
    }

    /* renamed from: a */
    public boolean mo10950a(ParcelFileDescriptor parcelFileDescriptor) {
        return C2163m.m9405c();
    }

    /* renamed from: c */
    private static void m10294c(BitmapFactory.Options options) {
        m10295d(options);
        Queue<BitmapFactory.Options> queue = f7993i;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: a */
    private static int m10276a(double d) {
        int b = m10290b(d);
        int c = m10293c(((double) b) * d);
        return m10293c((d / ((double) (((float) c) / ((float) b)))) * ((double) c));
    }

    /* renamed from: b */
    private static int m10290b(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: d */
    private static void m10295d(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: a */
    private static String m10281a(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    public C2434k(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, AbstractC2283e eVar, AbstractC2278b bVar) {
        this.f7997m = list;
        this.f7995k = (DisplayMetrics) C2567j.m10894a(displayMetrics);
        this.f7994j = (AbstractC2283e) C2567j.m10894a(eVar);
        this.f7996l = (AbstractC2278b) C2567j.m10894a(bVar);
    }

    /* renamed from: b */
    private static Bitmap m10291b(AbstractC2443q qVar, BitmapFactory.Options options, AbstractC2436a aVar, AbstractC2283e eVar) throws IOException {
        if (!options.inJustDecodeBounds) {
            aVar.mo10953a();
            qVar.mo10961c();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        C2455y.m10369a().lock();
        try {
            return qVar.mo10958a(options);
        } catch (IllegalArgumentException e) {
            IOException a = m10280a(e, i, i2, str, options);
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", a);
            }
            if (options.inBitmap != null) {
                try {
                    eVar.mo10693a(options.inBitmap);
                    options.inBitmap = null;
                    return m10291b(qVar, options, aVar, eVar);
                } catch (IOException unused) {
                    throw a;
                }
            } else {
                throw a;
            }
        } finally {
            C2455y.m10369a().unlock();
        }
    }

    /* renamed from: a */
    private AbstractC2383u<Bitmap> m10279a(AbstractC2443q qVar, int i, int i2, C2390f fVar, AbstractC2436a aVar) throws IOException {
        boolean z;
        byte[] bArr = (byte[]) this.f7996l.mo10668a(65536, byte[].class);
        BitmapFactory.Options a = m10278a();
        a.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) fVar.mo10900a(f7985a);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) fVar.mo10900a(f7986b);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) fVar.mo10900a(DownsampleStrategy.f7959h);
        boolean booleanValue = ((Boolean) fVar.mo10900a(f7988d)).booleanValue();
        C2267e<Boolean> eVar = f7989e;
        if (fVar.mo10900a(eVar) == null || !((Boolean) fVar.mo10900a(eVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        try {
            return C2428e.m10257a(m10277a(qVar, a, downsampleStrategy, decodeFormat, preferredColorSpace, z, i, i2, booleanValue, aVar), this.f7994j);
        } finally {
            m10294c(a);
            this.f7996l.mo10671a(bArr);
        }
    }

    /* renamed from: a */
    private static IOException m10280a(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m10292b(options), illegalArgumentException);
    }

    /* renamed from: a */
    private static void m10282a(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v("Downsampler", "Decoded " + m10281a(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m10292b(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C2563f.m10879a(j));
    }

    /* renamed from: a */
    private Bitmap m10277a(AbstractC2443q qVar, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, AbstractC2436a aVar) throws IOException {
        boolean z3;
        int i3;
        int i4;
        int i5;
        boolean z4;
        C2434k kVar;
        int i6;
        ColorSpace.Named named;
        int i7;
        int i8;
        float f;
        long a = C2563f.m10880a();
        int[] a2 = m10289a(qVar, options, aVar, this.f7994j);
        boolean z5 = false;
        int i9 = a2[0];
        int i10 = a2[1];
        String str = options.outMimeType;
        if (i9 == -1 || i10 == -1) {
            z3 = false;
        } else {
            z3 = z;
        }
        int b = qVar.mo10960b();
        int a3 = C2455y.m10363a(b);
        boolean b2 = C2455y.m10377b(b);
        if (i == Integer.MIN_VALUE) {
            i4 = i2;
            if (m10286a(a3)) {
                i3 = i10;
            } else {
                i3 = i9;
            }
        } else {
            i4 = i2;
            i3 = i;
        }
        if (i4 != Integer.MIN_VALUE) {
            i5 = i4;
        } else if (m10286a(a3)) {
            i5 = i9;
        } else {
            i5 = i10;
        }
        ImageHeaderParser.ImageType a4 = qVar.mo10959a();
        m10284a(a4, qVar, aVar, this.f7994j, downsampleStrategy, a3, i9, i10, i3, i5, options);
        m10285a(qVar, decodeFormat, z3, b2, options, i3, i5);
        if (Build.VERSION.SDK_INT >= 19) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (options.inSampleSize == 1 || z4) {
            kVar = this;
            if (kVar.m10288a(a4)) {
                if (i9 < 0 || i10 < 0 || !z2 || !z4) {
                    if (m10287a(options)) {
                        f = ((float) options.inTargetDensity) / ((float) options.inDensity);
                    } else {
                        f = 1.0f;
                    }
                    int i11 = options.inSampleSize;
                    float f2 = (float) i11;
                    i8 = Math.round(((float) ((int) Math.ceil((double) (((float) i9) / f2)))) * f);
                    i7 = Math.round(((float) ((int) Math.ceil((double) (((float) i10) / f2)))) * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + i8 + "x" + i7 + "] for source [" + i9 + "x" + i10 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f);
                    }
                } else {
                    i8 = i3;
                    i7 = i5;
                }
                if (i8 > 0 && i7 > 0) {
                    m10283a(options, kVar.f7994j, i8, i7);
                }
            }
        } else {
            kVar = this;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) {
                z5 = true;
            }
            if (z5) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else {
                named = ColorSpace.Named.SRGB;
            }
            options.inPreferredColorSpace = ColorSpace.get(named);
        } else if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap b3 = m10291b(qVar, options, aVar, kVar.f7994j);
        aVar.mo10954a(kVar.f7994j, b3);
        if (Log.isLoggable("Downsampler", 2)) {
            i6 = b;
            m10282a(i9, i10, str, options, b3, i, i2, a);
        } else {
            i6 = b;
        }
        Bitmap bitmap = null;
        if (b3 != null) {
            b3.setDensity(kVar.f7995k.densityDpi);
            bitmap = C2455y.m10366a(kVar.f7994j, b3, i6);
            if (!b3.equals(bitmap)) {
                kVar.f7994j.mo10693a(b3);
            }
        }
        return bitmap;
    }
}
