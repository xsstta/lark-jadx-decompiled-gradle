package com.bumptech.glide.load.engine.p087a;

import android.graphics.Bitmap;
import android.os.Build;
import com.bumptech.glide.util.C2568k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.engine.a.n */
public class C2297n implements AbstractC2295l {

    /* renamed from: a */
    private static final Bitmap.Config[] f7654a;

    /* renamed from: b */
    private static final Bitmap.Config[] f7655b;

    /* renamed from: c */
    private static final Bitmap.Config[] f7656c = {Bitmap.Config.RGB_565};

    /* renamed from: d */
    private static final Bitmap.Config[] f7657d = {Bitmap.Config.ARGB_4444};

    /* renamed from: e */
    private static final Bitmap.Config[] f7658e = {Bitmap.Config.ALPHA_8};

    /* renamed from: f */
    private final C2300b f7659f = new C2300b();

    /* renamed from: g */
    private final C2286h<C2299a, Bitmap> f7660g = new C2286h<>();

    /* renamed from: h */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f7661h = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.a.n$b */
    public static class C2300b extends AbstractC2282d<C2299a> {
        C2300b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C2299a mo10687b() {
            return new C2299a(this);
        }

        /* renamed from: a */
        public C2299a mo10721a(int i, Bitmap.Config config) {
            C2299a aVar = (C2299a) mo10689c();
            aVar.mo10716a(i, config);
            return aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.a.n$a */
    public static final class C2299a implements AbstractC2296m {

        /* renamed from: a */
        int f7663a;

        /* renamed from: b */
        private final C2300b f7664b;

        /* renamed from: c */
        private Bitmap.Config f7665c;

        @Override // com.bumptech.glide.load.engine.p087a.AbstractC2296m
        /* renamed from: a */
        public void mo10680a() {
            this.f7664b.mo10688a(this);
        }

        public int hashCode() {
            int i;
            int i2 = this.f7663a * 31;
            Bitmap.Config config = this.f7665c;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return C2297n.m9834a(this.f7663a, this.f7665c);
        }

        public C2299a(C2300b bVar) {
            this.f7664b = bVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2299a)) {
                return false;
            }
            C2299a aVar = (C2299a) obj;
            if (this.f7663a != aVar.f7663a || !C2568k.m10912a(this.f7665c, aVar.f7665c)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public void mo10716a(int i, Bitmap.Config config) {
            this.f7663a = i;
            this.f7665c = config;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.a.n$1 */
    public static /* synthetic */ class C22981 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7662a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.load.engine.p087a.C2297n.C22981.f7662a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bumptech.glide.load.engine.p087a.C2297n.C22981.f7662a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bumptech.glide.load.engine.p087a.C2297n.C22981.f7662a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bumptech.glide.load.engine.p087a.C2297n.C22981.f7662a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.p087a.C2297n.C22981.<clinit>():void");
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f7654a = configArr;
        f7655b = configArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f7660g);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f7661h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f7661h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2295l
    /* renamed from: a */
    public Bitmap mo10673a() {
        Bitmap a = this.f7660g.mo10697a();
        if (a != null) {
            m9836a(Integer.valueOf(C2568k.m10903a(a)), a);
        }
        return a;
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2295l
    /* renamed from: c */
    public int mo10678c(Bitmap bitmap) {
        return C2568k.m10903a(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2295l
    /* renamed from: b */
    public String mo10677b(Bitmap bitmap) {
        return m9834a(C2568k.m10903a(bitmap), bitmap.getConfig());
    }

    /* renamed from: a */
    private NavigableMap<Integer, Integer> m9835a(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f7661h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f7661h.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: b */
    private static Bitmap.Config[] m9838b(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f7655b;
        }
        int i = C22981.f7662a[config.ordinal()];
        if (i == 1) {
            return f7654a;
        }
        if (i == 2) {
            return f7656c;
        }
        if (i == 3) {
            return f7657d;
        }
        if (i == 4) {
            return f7658e;
        }
        return new Bitmap.Config[]{config};
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2295l
    /* renamed from: a */
    public void mo10675a(Bitmap bitmap) {
        C2299a a = this.f7659f.mo10721a(C2568k.m10903a(bitmap), bitmap.getConfig());
        this.f7660g.mo10699a(a, bitmap);
        NavigableMap<Integer, Integer> a2 = m9835a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.f7663a));
        Integer valueOf = Integer.valueOf(a.f7663a);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        a2.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: a */
    static String m9834a(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: a */
    private void m9836a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> a = m9835a(bitmap.getConfig());
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo10677b(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: b */
    private C2299a m9837b(int i, Bitmap.Config config) {
        C2299a a = this.f7659f.mo10721a(i, config);
        Bitmap.Config[] b = m9838b(config);
        for (Bitmap.Config config2 : b) {
            Integer ceilingKey = m9835a(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return a;
                        }
                    } else if (config2.equals(config)) {
                        return a;
                    }
                }
                this.f7659f.mo10688a(a);
                return this.f7659f.mo10721a(ceilingKey.intValue(), config2);
            }
        }
        return a;
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2295l
    /* renamed from: b */
    public String mo10676b(int i, int i2, Bitmap.Config config) {
        return m9834a(C2568k.m10901a(i, i2, config), config);
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2295l
    /* renamed from: a */
    public Bitmap mo10674a(int i, int i2, Bitmap.Config config) {
        C2299a b = m9837b(C2568k.m10901a(i, i2, config), config);
        Bitmap a = this.f7660g.mo10698a(b);
        if (a != null) {
            m9836a(Integer.valueOf(b.f7663a), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }
}
