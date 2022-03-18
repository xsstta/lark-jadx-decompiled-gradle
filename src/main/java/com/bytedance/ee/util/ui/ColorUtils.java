package com.bytedance.ee.util.ui;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C0768a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.C69294l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J \u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000bH\u0007J\u0012\u0010\u001d\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u000bH\u0007J\u001c\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000bH\u0007J\u0012\u0010!\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u000bH\u0007J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0018\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u0016\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/bytedance/ee/util/ui/ColorUtils;", "", "()V", "TAG", "", "calcContrastRatio", "", "luminanceA", "luminanceB", "calcLuminance", "r", "", "g", C63954b.f161494a, "checkDarkModeAvailable", "", "context", "Landroid/content/Context;", "convertPercentAlphaToRGBValue", "percent", "", "generateAlphaColor", "alpha", "srcColor", "getArgbColorString", "rgbaColor", "getBorderColor", "solidColor", "defColor", "isColorBlack", "rgb", "isColorDark", "threshold", "isColorWhite", "parseArgbColor", "setViewAlpha", "", "view", "Landroid/view/View;", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.util.t.e */
public final class ColorUtils {

    /* renamed from: a */
    public static final ColorUtils f35933a = new ColorUtils();

    /* renamed from: a */
    private final double m55694a(double d, double d2) {
        return (d + 0.05d) / (d2 + 0.05d);
    }

    private ColorUtils() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.util.t.e$a */
    public static final class C13738a extends Lambda implements Function1<Integer, Double> {
        public static final C13738a INSTANCE = new C13738a();

        C13738a() {
            super(1);
        }

        public final double invoke(int i) {
            return ((double) i) / 255.0d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Double invoke(Integer num) {
            return Double.valueOf(invoke(num.intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.util.t.e$b */
    public static final class C13739b extends Lambda implements Function1<Double, Double> {
        public static final C13739b INSTANCE = new C13739b();

        C13739b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Double invoke(Double d) {
            return Double.valueOf(invoke(d.doubleValue()));
        }

        public final double invoke(double d) {
            if (d <= 0.03928d) {
                return d / 12.92d;
            }
            return Math.pow((d + 0.055d) / 1.055d, 2.4d);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m55697a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "rgbaColor");
        if (str.length() != 9) {
            return Color.parseColor(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        String substring = str.substring(7);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        String substring2 = str.substring(1, 7);
        Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring2);
        return Color.parseColor(sb.toString());
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m55702b(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (RangesKt.coerceAtLeast(red, RangesKt.coerceAtLeast(green, blue)) - RangesKt.coerceAtMost(red, RangesKt.coerceAtMost(green, blue)) >= 15 || ((red + green) + blue) / 3 <= 188) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m55699a(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (RangesKt.coerceAtLeast(red, RangesKt.coerceAtLeast(green, blue)) - RangesKt.coerceAtMost(red, RangesKt.coerceAtMost(green, blue)) >= 15 || ((red + green) + blue) / 3 >= 115) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m55701a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        double b = C0768a.m3714b(-1, context.getResources().getColor(R.color.bg_body));
        if (!UDUiModeUtils.m93319a(context) || b <= ((double) 3.0f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "color", "coefficient", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.util.t.e$c */
    public static final class C13740c extends Lambda implements Function2<Double, Double, Double> {
        public static final C13740c INSTANCE = new C13740c();

        C13740c() {
            super(2);
        }

        public final double invoke(double d, double d2) {
            return d * d2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Double invoke(Double d, Double d2) {
            return Double.valueOf(invoke(d.doubleValue(), d2.doubleValue()));
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m55696a(int i, int i2) {
        return Color.argb(i, Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m55703b(int i, int i2) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        double d = (double) i2;
        ColorUtils eVar = f35933a;
        if (d < eVar.m55694a(eVar.m55695a(255, 255, 255), eVar.m55695a(red, green, blue))) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m55698a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "solidColor");
        try {
            float[] fArr = new float[3];
            Color.colorToHSV(Color.parseColor(str), fArr);
            fArr[2] = (float) (((double) fArr[2]) * 0.9d);
            return Color.HSVToColor(fArr);
        } catch (Exception e) {
            e.printStackTrace();
            C13479a.m54758a("ColorUtils", "Bad color :" + str);
            return i;
        }
    }

    /* renamed from: a */
    private final double m55695a(int i, int i2, int i3) {
        return C69294l.m266148l(C69294l.m266132a(C69294l.m266140e(C69294l.m266140e(C69294l.m266121a(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)), C13738a.INSTANCE), C13739b.INSTANCE), C69294l.m266121a(Double.valueOf(0.2126d), Double.valueOf(0.7152d), Double.valueOf(0.0722d)), C13740c.INSTANCE));
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m55700a(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 3;
        }
        return m55703b(i, i2);
    }
}
