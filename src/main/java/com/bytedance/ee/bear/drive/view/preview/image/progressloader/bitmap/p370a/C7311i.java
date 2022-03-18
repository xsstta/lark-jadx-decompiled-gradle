package com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a;

import android.graphics.Bitmap;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7333f;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.i */
public class C7311i implements AbstractC7309g {

    /* renamed from: a */
    private static final Bitmap.Config[] f19581a = {Bitmap.Config.ARGB_8888, null};

    /* renamed from: b */
    private static final Bitmap.Config[] f19582b = {Bitmap.Config.RGB_565};

    /* renamed from: c */
    private static final Bitmap.Config[] f19583c = {Bitmap.Config.ARGB_4444};

    /* renamed from: d */
    private static final Bitmap.Config[] f19584d = {Bitmap.Config.ALPHA_8};

    /* renamed from: e */
    private final C7314b f19585e = new C7314b();

    /* renamed from: f */
    private final C7303e<C7313a, Bitmap> f19586f = new C7303e<>();

    /* renamed from: g */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f19587g = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.i$b */
    public static class C7314b extends AbstractC7300b<C7313a> {
        C7314b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C7313a mo28502b() {
            return new C7313a(this);
        }

        /* renamed from: a */
        public C7313a mo28523a(int i, Bitmap.Config config) {
            C7313a aVar = (C7313a) mo28504c();
            aVar.mo28518a(i, config);
            return aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.i$a */
    public static final class C7313a implements AbstractC7310h {

        /* renamed from: a */
        public int f19589a;

        /* renamed from: b */
        private final C7314b f19590b;

        /* renamed from: c */
        private Bitmap.Config f19591c;

        @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7310h
        /* renamed from: a */
        public void mo28495a() {
            this.f19590b.mo28503a(this);
        }

        public int hashCode() {
            int i;
            int i2 = this.f19589a * 31;
            Bitmap.Config config = this.f19591c;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return C7311i.m29203a(this.f19589a, this.f19591c);
        }

        public C7313a(C7314b bVar) {
            this.f19590b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.C7311i.C7313a
                r1 = 0
                if (r0 == 0) goto L_0x001d
                com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.i$a r4 = (com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.C7311i.C7313a) r4
                int r0 = r3.f19589a
                int r2 = r4.f19589a
                if (r0 != r2) goto L_0x001d
                android.graphics.Bitmap$Config r0 = r3.f19591c
                android.graphics.Bitmap$Config r4 = r4.f19591c
                if (r0 != 0) goto L_0x0016
                if (r4 != 0) goto L_0x001d
                goto L_0x001c
            L_0x0016:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x001d
            L_0x001c:
                r1 = 1
            L_0x001d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.C7311i.C7313a.equals(java.lang.Object):boolean");
        }

        /* renamed from: a */
        public void mo28518a(int i, Bitmap.Config config) {
            this.f19589a = i;
            this.f19591c = config;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.i$1 */
    public static /* synthetic */ class C73121 {

        /* renamed from: a */
        static final /* synthetic */ int[] f19588a;

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
                com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.C7311i.C73121.f19588a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.C7311i.C73121.f19588a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.C7311i.C73121.f19588a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.C7311i.C73121.f19588a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.C7311i.C73121.<clinit>():void");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f19586f);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f19587g.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f19587g.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7309g
    /* renamed from: a */
    public Bitmap mo28488a() {
        Bitmap a = this.f19586f.mo28508a();
        if (a != null) {
            m29205a(Integer.valueOf(C7333f.m29294a(a)), a.getConfig());
        }
        return a;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7309g
    /* renamed from: c */
    public int mo28493c(Bitmap bitmap) {
        return C7333f.m29294a(bitmap);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7309g
    /* renamed from: b */
    public String mo28492b(Bitmap bitmap) {
        return m29203a(C7333f.m29294a(bitmap), bitmap.getConfig());
    }

    /* renamed from: a */
    private NavigableMap<Integer, Integer> m29204a(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f19587g.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f19587g.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: b */
    private static Bitmap.Config[] m29206b(Bitmap.Config config) {
        int i = C73121.f19588a[config.ordinal()];
        if (i == 1) {
            return f19581a;
        }
        if (i == 2) {
            return f19582b;
        }
        if (i == 3) {
            return f19583c;
        }
        if (i == 4) {
            return f19584d;
        }
        return new Bitmap.Config[]{config};
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7309g
    /* renamed from: a */
    public void mo28490a(Bitmap bitmap) {
        C7313a a = this.f19585e.mo28523a(C7333f.m29294a(bitmap), bitmap.getConfig());
        this.f19586f.mo28510a(a, bitmap);
        NavigableMap<Integer, Integer> a2 = m29204a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.f19589a));
        Integer valueOf = Integer.valueOf(a.f19589a);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        a2.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static String m29203a(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: a */
    private void m29205a(Integer num, Bitmap.Config config) {
        NavigableMap<Integer, Integer> a = m29204a(config);
        Integer num2 = (Integer) a.get(num);
        if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7309g
    /* renamed from: b */
    public String mo28491b(int i, int i2, Bitmap.Config config) {
        return m29203a(C7333f.m29292a(i, i2, config), config);
    }

    /* renamed from: a */
    private C7313a m29202a(C7313a aVar, int i, Bitmap.Config config) {
        Bitmap.Config[] b = m29206b(config);
        for (Bitmap.Config config2 : b) {
            Integer ceilingKey = m29204a(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return aVar;
                        }
                    } else if (config2.equals(config)) {
                        return aVar;
                    }
                }
                this.f19585e.mo28503a(aVar);
                return this.f19585e.mo28523a(ceilingKey.intValue(), config2);
            }
        }
        return aVar;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7309g
    /* renamed from: a */
    public Bitmap mo28489a(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        int a = C7333f.m29292a(i, i2, config);
        Bitmap a2 = this.f19586f.mo28509a(m29202a(this.f19585e.mo28523a(a, config), a, config));
        if (a2 != null) {
            m29205a(Integer.valueOf(C7333f.m29294a(a2)), a2.getConfig());
            if (a2.getConfig() != null) {
                config2 = a2.getConfig();
            } else {
                config2 = Bitmap.Config.ARGB_8888;
            }
            a2.reconfigure(i, i2, config2);
        }
        return a2;
    }
}
