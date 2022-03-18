package com.bumptech.glide.load.engine.p088b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.util.C2567j;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bumptech.glide.load.engine.b.j */
public final class C2319j {

    /* renamed from: a */
    private final int f7691a;

    /* renamed from: b */
    private final int f7692b;

    /* renamed from: c */
    private final Context f7693c;

    /* renamed from: d */
    private final int f7694d;

    /* renamed from: com.bumptech.glide.load.engine.b.j$c */
    interface AbstractC2322c {
        /* renamed from: a */
        int mo10750a();

        /* renamed from: b */
        int mo10751b();
    }

    /* renamed from: a */
    public int mo10741a() {
        return this.f7692b;
    }

    /* renamed from: b */
    public int mo10742b() {
        return this.f7691a;
    }

    /* renamed from: c */
    public int mo10743c() {
        return this.f7694d;
    }

    /* renamed from: com.bumptech.glide.load.engine.b.j$a */
    public static final class C2320a {

        /* renamed from: a */
        static final int f7695a;

        /* renamed from: b */
        final Context f7696b;

        /* renamed from: c */
        ActivityManager f7697c;

        /* renamed from: d */
        AbstractC2322c f7698d;

        /* renamed from: e */
        float f7699e = 2.0f;

        /* renamed from: f */
        float f7700f = ((float) f7695a);

        /* renamed from: g */
        float f7701g = 0.4f;

        /* renamed from: h */
        float f7702h = 0.33f;

        /* renamed from: i */
        int f7703i = 4194304;

        /* renamed from: a */
        public C2319j mo10746a() {
            return new C2319j(this);
        }

        static {
            int i;
            if (Build.VERSION.SDK_INT < 26) {
                i = 4;
            } else {
                i = 1;
            }
            f7695a = i;
        }

        /* renamed from: a */
        public C2320a mo10745a(int i) {
            this.f7703i = i;
            return this;
        }

        /* renamed from: a */
        public C2320a mo10744a(float f) {
            boolean z;
            if (f >= BitmapDescriptorFactory.HUE_RED) {
                z = true;
            } else {
                z = false;
            }
            C2567j.m10898a(z, "Memory cache screens must be greater than or equal to 0");
            this.f7699e = f;
            return this;
        }

        /* renamed from: b */
        public C2320a mo10747b(float f) {
            boolean z;
            if (f >= BitmapDescriptorFactory.HUE_RED) {
                z = true;
            } else {
                z = false;
            }
            C2567j.m10898a(z, "Bitmap pool screens must be greater than or equal to 0");
            this.f7700f = f;
            return this;
        }

        /* renamed from: c */
        public C2320a mo10748c(float f) {
            boolean z;
            if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
                z = false;
            } else {
                z = true;
            }
            C2567j.m10898a(z, "Size multiplier must be between 0 and 1");
            this.f7701g = f;
            return this;
        }

        /* renamed from: d */
        public C2320a mo10749d(float f) {
            boolean z;
            if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
                z = false;
            } else {
                z = true;
            }
            C2567j.m10898a(z, "Low memory max size multiplier must be between 0 and 1");
            this.f7702h = f;
            return this;
        }

        public C2320a(Context context) {
            this.f7696b = context;
            this.f7697c = (ActivityManager) context.getSystemService("activity");
            this.f7698d = new C2321b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C2319j.m9887a(this.f7697c)) {
                this.f7700f = BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b.j$b */
    private static final class C2321b implements AbstractC2322c {

        /* renamed from: a */
        private final DisplayMetrics f7704a;

        @Override // com.bumptech.glide.load.engine.p088b.C2319j.AbstractC2322c
        /* renamed from: a */
        public int mo10750a() {
            return this.f7704a.widthPixels;
        }

        @Override // com.bumptech.glide.load.engine.p088b.C2319j.AbstractC2322c
        /* renamed from: b */
        public int mo10751b() {
            return this.f7704a.heightPixels;
        }

        C2321b(DisplayMetrics displayMetrics) {
            this.f7704a = displayMetrics;
        }
    }

    /* renamed from: a */
    private String m9886a(int i) {
        return Formatter.formatFileSize(this.f7693c, (long) i);
    }

    /* renamed from: a */
    static boolean m9887a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    C2319j(C2320a aVar) {
        int i;
        boolean z;
        this.f7693c = aVar.f7696b;
        if (m9887a(aVar.f7697c)) {
            i = aVar.f7703i / 2;
        } else {
            i = aVar.f7703i;
        }
        this.f7694d = i;
        int a = m9885a(aVar.f7697c, aVar.f7701g, aVar.f7702h);
        float a2 = (float) (aVar.f7698d.mo10750a() * aVar.f7698d.mo10751b() * 4);
        int round = Math.round(aVar.f7700f * a2);
        int round2 = Math.round(a2 * aVar.f7699e);
        int i2 = a - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f7692b = round2;
            this.f7691a = round;
        } else {
            float f = ((float) i2) / (aVar.f7700f + aVar.f7699e);
            this.f7692b = Math.round(aVar.f7699e * f);
            this.f7691a = Math.round(f * aVar.f7700f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m9886a(this.f7692b));
            sb.append(", pool size: ");
            sb.append(m9886a(this.f7691a));
            sb.append(", byte array size: ");
            sb.append(m9886a(i));
            sb.append(", memory class limited? ");
            if (i3 > a) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(m9886a(a));
            sb.append(", memoryClass: ");
            sb.append(aVar.f7697c.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m9887a(aVar.f7697c));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: a */
    private static int m9885a(ActivityManager activityManager, float f, float f2) {
        boolean a = m9887a(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (a) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }
}
