package com.ss.android.ugc.effectmanager.common.utils;

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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u00014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010+\u001a\u00020\u0011H\u0002J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nH\u0002J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\nH\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\nJ\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nH\u0002J\u000e\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u000202J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\fR\u0011\u0010\u0018\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u0011\u0010\u001c\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\fR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"X\u0004¢\u0006\u0002\n\u0000R*\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0%j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 `&X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u0011\u0010)\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010\f¨\u00065"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/utils/GPUUtils;", "", "()V", "DEVICEINFO_UNKNOWN", "", "alusOrThroughput", "", "getAlusOrThroughput", "()D", "glExtension", "", "getGlExtension", "()Ljava/lang/String;", "glVer", "getGlVer", "()I", "gpuInfo", "Lcom/ss/android/ugc/effectmanager/common/utils/GPUUtils$GPUInfo;", "getGpuInfo", "()Lcom/ss/android/ugc/effectmanager/common/utils/GPUUtils$GPUInfo;", "gpuInfo$delegate", "Lkotlin/Lazy;", "gpuInfoStr", "getGpuInfoStr", "maxFreq", "getMaxFreq", "minFreq", "getMinFreq", "renderer", "getRenderer", "sAdrenoGpuFreqMap", "Landroid/util/SparseArray;", "", "sAdrenoSerialPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "sMaliGpuFreqMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "vendor", "getVendor", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getVersion", "generateGPUInfo", "getAdrenoGpuFreq", ShareHitPoint.f121869d, "getAdrenoSerial", "getGpuMHz", "getGpuOpenGlVersion", "context", "Landroid/content/Context;", "getMaliGpuFreq", "GPUInfo", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.h.m */
public final class GPUUtils {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f151346a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GPUUtils.class), "gpuInfo", "getGpuInfo()Lcom/ss/android/ugc/effectmanager/common/utils/GPUUtils$GPUInfo;"))};

    /* renamed from: b */
    public static final GPUUtils f151347b = new GPUUtils();

    /* renamed from: c */
    private static final HashMap<String, float[]> f151348c;

    /* renamed from: d */
    private static final SparseArray<float[]> f151349d;

    /* renamed from: e */
    private static final Pattern f151350e = Pattern.compile("\\d+$");

    /* renamed from: f */
    private static final Lazy f151351f = LazyKt.lazy(C60534c.INSTANCE);

    /* renamed from: f */
    private final GPUInfo m235298f() {
        Lazy lazy = f151351f;
        KProperty kProperty = f151346a[0];
        return (GPUInfo) lazy.getValue();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/utils/GPUUtils$GPUInfo;", "", "()V", "alusOrThroughput", "", "getAlusOrThroughput", "()D", "setAlusOrThroughput", "(D)V", "glExtension", "", "getGlExtension", "()Ljava/lang/String;", "setGlExtension", "(Ljava/lang/String;)V", "glVer", "", "getGlVer", "()I", "setGlVer", "(I)V", "maxFreq", "getMaxFreq", "setMaxFreq", "minFreq", "getMinFreq", "setMinFreq", "renderer", "getRenderer", "setRenderer", "vendor", "getVendor", "setVendor", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getVersion", "setVersion", "toString", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.common.h.m$a */
    public static final class GPUInfo {

        /* renamed from: a */
        private String f151352a = "unknown";

        /* renamed from: b */
        private String f151353b = "unknown";

        /* renamed from: c */
        private String f151354c = "unknown";

        /* renamed from: d */
        private int f151355d;

        /* renamed from: e */
        private int f151356e;

        /* renamed from: f */
        private int f151357f = -1;

        /* renamed from: g */
        private double f151358g = -1.0d;

        /* renamed from: h */
        private String f151359h = "unknown";

        /* renamed from: a */
        public final String mo207266a() {
            return this.f151352a;
        }

        /* renamed from: b */
        public final String mo207270b() {
            return this.f151353b;
        }

        /* renamed from: c */
        public final String mo207273c() {
            return this.f151354c;
        }

        /* renamed from: d */
        public final String mo207275d() {
            return this.f151359h;
        }

        public String toString() {
            return "GPUInfo{renderer='" + this.f151352a + "'" + ", version='" + this.f151353b + "'" + ", vendor='" + this.f151354c + "'" + ", maxFreq=" + this.f151355d + ", minFreq=" + this.f151356e + ", glVer=" + this.f151357f + ", alusOrThroughput=" + this.f151358g + "}";
        }

        /* renamed from: a */
        public final void mo207267a(double d) {
            this.f151358g = d;
        }

        /* renamed from: b */
        public final void mo207271b(int i) {
            this.f151356e = i;
        }

        /* renamed from: c */
        public final void mo207274c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f151354c = str;
        }

        /* renamed from: d */
        public final void mo207276d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f151359h = str;
        }

        /* renamed from: a */
        public final void mo207268a(int i) {
            this.f151355d = i;
        }

        /* renamed from: b */
        public final void mo207272b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f151353b = str;
        }

        /* renamed from: a */
        public final void mo207269a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f151352a = str;
        }
    }

    private GPUUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/effectmanager/common/utils/GPUUtils$GPUInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.common.h.m$c */
    static final class C60534c extends Lambda implements Function0<GPUInfo> {
        public static final C60534c INSTANCE = new C60534c();

        C60534c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GPUInfo invoke() {
            return GPUUtils.f151347b.mo207265e();
        }
    }

    /* renamed from: a */
    public final String mo207261a() {
        return m235298f().mo207266a();
    }

    /* renamed from: b */
    public final String mo207262b() {
        return m235298f().mo207270b();
    }

    /* renamed from: c */
    public final String mo207263c() {
        return m235298f().mo207273c();
    }

    /* renamed from: d */
    public final String mo207264d() {
        return m235298f().mo207275d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2 A[Catch:{ all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0 A[Catch:{ all -> 0x0121 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.effectmanager.common.utils.GPUUtils.GPUInfo mo207265e() {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.GPUUtils.mo207265e():com.ss.android.ugc.effectmanager.common.h.m$a");
    }

    static {
        HashMap<String, float[]> hashMap = new HashMap<>();
        f151348c = hashMap;
        SparseArray<float[]> sparseArray = new SparseArray<>();
        f151349d = sparseArray;
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
    private final int m235295b(String str) {
        Matcher matcher = f151350e.matcher(str);
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
    public final double mo207260a(String str) {
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
                fArr = f151348c.get(str);
            } else {
                String lowerCase2 = str.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "adreno", false, 2, (Object) null)) {
                    fArr = f151349d.get(m235295b(str));
                }
            }
            if (fArr != null) {
                return (double) fArr[2];
            }
        }
        return (double) -1;
    }

    /* renamed from: b */
    private final int m235296b(String str, String str2) {
        float f;
        float[] fArr = f151348c.get(str);
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
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "file", "Ljava/io/File;", "kotlin.jvm.PlatformType", "s", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.common.h.m$b */
    public static final class C60533b implements FilenameFilter {

        /* renamed from: a */
        public static final C60533b f151360a = new C60533b();

        C60533b() {
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
    private final int m235294a(String str, String str2) {
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
                return m235296b(str, str2);
            }
            if (str != null) {
                String lowerCase2 = str.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (StringsKt.startsWith$default(lowerCase2, "adreno", false, 2, (Object) null)) {
                    return m235297c(str, str2);
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
    private final int m235297c(java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.GPUUtils.m235297c(java.lang.String, java.lang.String):int");
    }
}
