package com.ss.ugc.effectplatform.util;

import android.util.SparseArray;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.MediaPlayer;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u00014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010+\u001a\u00020\u0011H\u0002J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nH\u0002J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\nH\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\nJ\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nH\u0002J\u000e\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u000202J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\fR\u0011\u0010\u0018\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u0011\u0010\u001c\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\fR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"X\u0004¢\u0006\u0002\n\u0000R*\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0%j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 `&X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u0011\u0010)\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010\f¨\u00065"}, d2 = {"Lcom/ss/ugc/effectplatform/util/GPUUtils;", "", "()V", "DEVICEINFO_UNKNOWN", "", "alusOrThroughput", "", "getAlusOrThroughput", "()D", "glExtension", "", "getGlExtension", "()Ljava/lang/String;", "glVer", "getGlVer", "()I", "gpuInfo", "Lcom/ss/ugc/effectplatform/util/GPUUtils$GPUInfo;", "getGpuInfo", "()Lcom/ss/ugc/effectplatform/util/GPUUtils$GPUInfo;", "gpuInfo$delegate", "Lkotlin/Lazy;", "gpuInfoStr", "getGpuInfoStr", "maxFreq", "getMaxFreq", "minFreq", "getMinFreq", "renderer", "getRenderer", "sAdrenoGpuFreqMap", "Landroid/util/SparseArray;", "", "sAdrenoSerialPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "sMaliGpuFreqMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "vendor", "getVendor", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getVersion", "generateGPUInfo", "getAdrenoGpuFreq", ShareHitPoint.f121869d, "getAdrenoSerial", "getGpuMHz", "getGpuOpenGlVersion", "context", "Landroid/content/Context;", "getMaliGpuFreq", "GPUInfo", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.l */
public final class GPUUtils {

    /* renamed from: a */
    public static final GPUUtils f165114a = new GPUUtils();

    /* renamed from: b */
    private static final HashMap<String, float[]> f165115b;

    /* renamed from: c */
    private static final SparseArray<float[]> f165116c;

    /* renamed from: d */
    private static final Pattern f165117d = Pattern.compile("\\d+$");

    /* renamed from: e */
    private static final Lazy f165118e = LazyKt.lazy(C65554c.INSTANCE);

    /* renamed from: f */
    private final GPUInfo m257093f() {
        return (GPUInfo) f165118e.getValue();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e¨\u0006%"}, d2 = {"Lcom/ss/ugc/effectplatform/util/GPUUtils$GPUInfo;", "", "()V", "alusOrThroughput", "", "getAlusOrThroughput", "()D", "setAlusOrThroughput", "(D)V", "glExtension", "", "getGlExtension", "()Ljava/lang/String;", "setGlExtension", "(Ljava/lang/String;)V", "glVer", "", "getGlVer", "()I", "setGlVer", "(I)V", "maxFreq", "getMaxFreq", "setMaxFreq", "minFreq", "getMinFreq", "setMinFreq", "renderer", "getRenderer", "setRenderer", "vendor", "getVendor", "setVendor", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getVersion", "setVersion", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.util.l$a */
    public static final class GPUInfo {

        /* renamed from: a */
        private String f165119a = "unknown";

        /* renamed from: b */
        private String f165120b = "unknown";

        /* renamed from: c */
        private String f165121c = "unknown";

        /* renamed from: d */
        private int f165122d;

        /* renamed from: e */
        private int f165123e;

        /* renamed from: f */
        private int f165124f = -1;

        /* renamed from: g */
        private double f165125g = -1.0d;

        /* renamed from: h */
        private String f165126h = "unknown";

        /* renamed from: a */
        public final String mo228332a() {
            return this.f165119a;
        }

        /* renamed from: b */
        public final String mo228336b() {
            return this.f165120b;
        }

        /* renamed from: c */
        public final String mo228339c() {
            return this.f165121c;
        }

        /* renamed from: d */
        public final String mo228341d() {
            return this.f165126h;
        }

        public String toString() {
            return "GPUInfo{renderer='" + this.f165119a + "'" + ", version='" + this.f165120b + "'" + ", vendor='" + this.f165121c + "'" + ", maxFreq=" + this.f165122d + ", minFreq=" + this.f165123e + ", glVer=" + this.f165124f + ", alusOrThroughput=" + this.f165125g + "}";
        }

        /* renamed from: a */
        public final void mo228333a(double d) {
            this.f165125g = d;
        }

        /* renamed from: b */
        public final void mo228337b(int i) {
            this.f165123e = i;
        }

        /* renamed from: c */
        public final void mo228340c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f165121c = str;
        }

        /* renamed from: d */
        public final void mo228342d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f165126h = str;
        }

        /* renamed from: a */
        public final void mo228334a(int i) {
            this.f165122d = i;
        }

        /* renamed from: b */
        public final void mo228338b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f165120b = str;
        }

        /* renamed from: a */
        public final void mo228335a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f165119a = str;
        }
    }

    private GPUUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/ugc/effectplatform/util/GPUUtils$GPUInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.util.l$c */
    static final class C65554c extends Lambda implements Function0<GPUInfo> {
        public static final C65554c INSTANCE = new C65554c();

        C65554c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GPUInfo invoke() {
            return GPUUtils.f165114a.mo228331e();
        }
    }

    /* renamed from: a */
    public final String mo228327a() {
        return m257093f().mo228332a();
    }

    /* renamed from: b */
    public final String mo228328b() {
        return m257093f().mo228336b();
    }

    /* renamed from: c */
    public final String mo228329c() {
        return m257093f().mo228339c();
    }

    /* renamed from: d */
    public final String mo228330d() {
        return m257093f().mo228341d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c8 A[Catch:{ all -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d6 A[Catch:{ all -> 0x0117 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.ugc.effectplatform.util.GPUUtils.GPUInfo mo228331e() {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.util.GPUUtils.mo228331e():com.ss.ugc.effectplatform.util.l$a");
    }

    static {
        HashMap<String, float[]> hashMap = new HashMap<>();
        f165115b = hashMap;
        SparseArray<float[]> sparseArray = new SparseArray<>();
        f165116c = sparseArray;
        hashMap.put("mali-g72", new float[]{850.0f, 850.0f, 27.2f});
        hashMap.put("mali-g71", new float[]{850.0f, 850.0f, 27.2f});
        hashMap.put("mali-t880", new float[]{850.0f, 850.0f, 13.6f});
        hashMap.put("mali-t860", new float[]{650.0f, 650.0f, 10.4f});
        hashMap.put("mali-t760", new float[]{650.0f, 650.0f, 10.4f});
        hashMap.put("mali-g51", new float[]{650.0f, 650.0f, 3.9f});
        hashMap.put("mali-t830", new float[]{650.0f, 650.0f, 2.6f});
        hashMap.put("mali-t820", new float[]{650.0f, 650.0f, 2.6f});
        hashMap.put("mali-t720", new float[]{650.0f, 650.0f, 5.2f});
        hashMap.put("mali-t470", new float[]{250.0f, 650.0f, 0.65f});
        hashMap.put("mali-t450", new float[]{270.0f, 650.0f, 5.2f});
        hashMap.put("mali-t400", new float[]{210.0f, 500.0f, 2.0f});
        hashMap.put("mali-400 mp", new float[]{210.0f, 500.0f, 2.0f});
        hashMap.put("mali-450 mp", new float[]{210.0f, 500.0f, 2.6f});
        sparseArray.put(LocationRequest.PRIORITY_HD_ACCURACY, new float[]{200.0f, 245.0f, 8.0f});
        sparseArray.put(SmEvents.EVENT_HBRESET, new float[]{245.0f, 294.0f, 16.0f});
        sparseArray.put(SmEvents.EVENT_HB_NOTICE_DISCONNECT, new float[]{225.0f, 245.0f, 16.0f});
        sparseArray.put(220, new float[]{266.0f, 266.0f, 32.0f});
        sparseArray.put(225, new float[]{400.0f, 400.0f, 32.0f});
        sparseArray.put(302, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(304, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(305, new float[]{400.0f, 450.0f, 24.0f});
        sparseArray.put(306, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(308, new float[]{500.0f, 500.0f, 24.0f});
        sparseArray.put(320, new float[]{450.0f, 450.0f, 96.0f});
        sparseArray.put(330, new float[]{578.0f, 578.0f, 128.0f});
        sparseArray.put(405, new float[]{550.0f, 550.0f, 48.0f});
        sparseArray.put(418, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(420, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(430, new float[]{500.0f, 650.0f, 192.0f});
        sparseArray.put(505, new float[]{450.0f, 450.0f, 48.0f});
        sparseArray.put(506, new float[]{650.0f, 650.0f, 96.0f});
        sparseArray.put(508, new float[]{850.0f, 850.0f, 96.0f});
        sparseArray.put(MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(MediaPlayer.MEDIA_PLAYER_OPTION_APPID, new float[]{600.0f, 850.0f, 128.0f});
        sparseArray.put(530, new float[]{650.0f, 650.0f, 256.0f});
        sparseArray.put(540, new float[]{710.0f, 710.0f, 256.0f});
    }

    /* renamed from: b */
    private final int m257090b(String str) {
        Matcher matcher = f165117d.matcher(str);
        if (matcher.find()) {
            boolean z = false;
            String group = matcher.group(0);
            Intrinsics.checkExpressionValueIsNotNull(group, "serial");
            if (group.length() > 0) {
                z = true;
            }
            if (z) {
                return Integer.parseInt(group);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final double mo228326a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "renderer");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float[] fArr = null;
            String lowerCase = str.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (StringsKt.startsWith$default(lowerCase, "mali", false, 2, (Object) null)) {
                fArr = f165115b.get(str);
            } else {
                String lowerCase2 = str.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "adreno", false, 2, (Object) null)) {
                    fArr = f165116c.get(m257090b(str));
                }
            }
            if (fArr != null) {
                return (double) fArr[2];
            }
        }
        return (double) -1;
    }

    /* renamed from: b */
    private final int m257091b(String str, String str2) {
        float f;
        float[] fArr = f165115b.get(str);
        if (fArr == null) {
            return 850;
        }
        if (Intrinsics.areEqual("min", str2)) {
            f = fArr[0];
        } else {
            f = fArr[1];
        }
        return (int) f;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "file", "Ljava/io/File;", "kotlin.jvm.PlatformType", "s", "", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.util.l$b */
    public static final class C65553b implements FilenameFilter {

        /* renamed from: a */
        public static final C65553b f165127a = new C65553b();

        C65553b() {
        }

        public final boolean accept(File file, String str) {
            Intrinsics.checkExpressionValueIsNotNull(file, "file");
            if (!file.isDirectory()) {
                return false;
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "s");
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "kgsl", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private final int m257089a(String str, String str2) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (StringsKt.startsWith$default(lowerCase, "mali", false, 2, (Object) null)) {
                return m257091b(str, str2);
            }
            if (str != null) {
                String lowerCase2 = str.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (StringsKt.startsWith$default(lowerCase2, "adreno", false, 2, (Object) null)) {
                    return m257092c(str, str2);
                }
                return -1;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b4 A[SYNTHETIC, Splitter:B:51:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ba A[SYNTHETIC, Splitter:B:57:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m257092c(java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.util.GPUUtils.m257092c(java.lang.String, java.lang.String):int");
    }
}
