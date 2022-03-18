package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import com.bumptech.glide.load.C2267e;

public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f7952a = new C2409a();

    /* renamed from: b */
    public static final DownsampleStrategy f7953b = new C2410b();

    /* renamed from: c */
    public static final DownsampleStrategy f7954c = new C2413e();

    /* renamed from: d */
    public static final DownsampleStrategy f7955d = new C2411c();

    /* renamed from: e */
    public static final DownsampleStrategy f7956e;

    /* renamed from: f */
    public static final DownsampleStrategy f7957f = new C2414f();

    /* renamed from: g */
    public static final DownsampleStrategy f7958g;

    /* renamed from: h */
    public static final C2267e<DownsampleStrategy> f7959h;

    /* renamed from: i */
    static final boolean f7960i;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: a */
    public abstract float mo10927a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract SampleSizeRounding mo10928b(int i, int i2, int i3, int i4);

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    private static class C2409a extends DownsampleStrategy {
        C2409a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public SampleSizeRounding mo10928b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public float mo10927a(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    private static class C2410b extends DownsampleStrategy {
        C2410b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public SampleSizeRounding mo10928b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public float mo10927a(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    private static class C2411c extends DownsampleStrategy {
        C2411c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public float mo10927a(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, f7954c.mo10927a(i, i2, i3, i4));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public SampleSizeRounding mo10928b(int i, int i2, int i3, int i4) {
            if (mo10927a(i, i2, i3, i4) == 1.0f) {
                return SampleSizeRounding.QUALITY;
            }
            return f7954c.mo10928b(i, i2, i3, i4);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    private static class C2412d extends DownsampleStrategy {
        C2412d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public SampleSizeRounding mo10928b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public float mo10927a(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    private static class C2413e extends DownsampleStrategy {
        C2413e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public SampleSizeRounding mo10928b(int i, int i2, int i3, int i4) {
            if (f7960i) {
                return SampleSizeRounding.QUALITY;
            }
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public float mo10927a(int i, int i2, int i3, int i4) {
            if (f7960i) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    private static class C2414f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public float mo10927a(int i, int i2, int i3, int i4) {
            return 1.0f;
        }

        C2414f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public SampleSizeRounding mo10928b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    static {
        boolean z;
        C2412d dVar = new C2412d();
        f7956e = dVar;
        f7958g = dVar;
        f7959h = C2267e.m9710a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        if (Build.VERSION.SDK_INT >= 19) {
            z = true;
        } else {
            z = false;
        }
        f7960i = z;
    }
}
