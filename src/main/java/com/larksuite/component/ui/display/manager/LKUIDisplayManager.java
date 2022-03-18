package com.larksuite.component.ui.display.manager;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.p3466b.C69029a;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0007J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\rH\u0007J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u000fH\u0007J\u0018\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0011H\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0007J \u0010%\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u000fH\u0007J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011H\u0007J\u0018\u0010(\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0007J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011H\u0007J\u0018\u0010)\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J \u0010)\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0007J\u0018\u0010)\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0007J\u0018\u0010*\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010*\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0007J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0007J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/larksuite/component/ui/display/manager/LKUIDisplayManager;", "", "()V", "DISPLAY_ZOOM", "", "TAG", "mIsFgOpen", "", "getMIsFgOpen", "()Z", "mIsFgOpen$delegate", "Lkotlin/Lazy;", "mStoreGear", "Lcom/larksuite/component/ui/display/manager/IStore;", "mZoomLevel", "Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "dp2px", "", "context", "Landroid/content/Context;", "dp", "getFontFgState", "getFontSize", "larkFont", "Lcom/larksuite/component/ui/display/manager/LarkFont;", "zoomLevel", "getFontSize4", "getZoomLevel", "getZoomLevel4", "Lcom/larksuite/component/ui/display/manager/ZoomLevel4;", "init", "", "storeGear", "setZoomLevel", "level", "sp2px", "sp", "toDisplaySize", "", "originalSize", "toDisplaySize4", "toFontSize", "toFontSize4", "toFontSize4Dp", "toFontSizeDp", "display_manager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.component.ui.display.manager.c */
public final class LKUIDisplayManager {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f62618a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LKUIDisplayManager.class), "mIsFgOpen", "getMIsFgOpen()Z"))};

    /* renamed from: b */
    public static final LKUIDisplayManager f62619b = new LKUIDisplayManager();

    /* renamed from: c */
    private static IStore f62620c;

    /* renamed from: d */
    private static final Lazy f62621d = LazyKt.lazy(C25650a.INSTANCE);

    /* renamed from: e */
    private static ZoomLevel f62622e;

    /* renamed from: c */
    private final boolean m91882c() {
        Lazy lazy = f62621d;
        KProperty kProperty = f62618a[0];
        return ((Boolean) lazy.getValue()).booleanValue();
    }

    private LKUIDisplayManager() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m91873a(IStore aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "storeGear");
        f62620c = aVar;
        f62622e = aVar != null ? ZoomLevel.Companion.mo89305a(Integer.valueOf(aVar.mo89308a("display_zoom"))) : null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final ZoomLevel m91870a() {
        if (!f62619b.m91882c()) {
            return ZoomLevel.NORMAL;
        }
        ZoomLevel zoomLevel = f62622e;
        return zoomLevel != null ? zoomLevel : ZoomLevel.NORMAL;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m91872a(ZoomLevel zoomLevel) {
        Intrinsics.checkParameterIsNotNull(zoomLevel, "level");
        IStore aVar = f62620c;
        if (aVar != null) {
            aVar.mo89309a("display_zoom", zoomLevel.getLevel());
        }
        f62622e = zoomLevel;
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m91869a(Context context, int i, ZoomLevel zoomLevel) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(zoomLevel, "zoomLevel");
        return C69029a.m265653a(f62619b.m91863a(context, zoomLevel.getMultiplier() * ((float) i)));
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m91879b() {
        return f62619b.m91882c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.component.ui.display.manager.c$a */
    static final class C25650a extends Lambda implements Function0<Boolean> {
        public static final C25650a INSTANCE = new C25650a();

        C25650a() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            LKUIDisplayManager cVar = LKUIDisplayManager.f62619b;
            IStore aVar = LKUIDisplayManager.f62620c;
            if (aVar != null) {
                return aVar.mo89310a();
            }
            return false;
        }
    }

    /* renamed from: d */
    private final ZoomLevel4 m91884d() {
        int i = C25651d.f62623a[m91870a().ordinal()];
        if (i == 1) {
            return ZoomLevel4.SMALL;
        }
        if (i == 2) {
            return ZoomLevel4.LARGE1;
        }
        if (i == 3) {
            return ZoomLevel4.LARGE2;
        }
        if (i == 4) {
            return ZoomLevel4.LARGE3;
        }
        if (i != 5) {
            return ZoomLevel4.NORMAL;
        }
        return ZoomLevel4.LARGE4;
    }

    @JvmStatic
    /* renamed from: a */
    public static final float m91861a(float f) {
        return m91870a().getMultiplier() * f;
    }

    @JvmStatic
    /* renamed from: b */
    public static final float m91878b(LarkFont larkFont) {
        Intrinsics.checkParameterIsNotNull(larkFont, "larkFont");
        return f62619b.m91880c(larkFont);
    }

    @JvmStatic
    /* renamed from: a */
    public static final float m91862a(int i) {
        LarkFont[] values = LarkFont.values();
        for (LarkFont larkFont : values) {
            if (larkFont.getNormal() == i) {
                return m91867a(larkFont);
            }
        }
        return m91870a().getMultiplier() * ((float) i);
    }

    @JvmStatic
    /* renamed from: b */
    public static final float m91874b(int i) {
        LarkFont[] values = LarkFont.values();
        for (LarkFont larkFont : values) {
            if (larkFont.getNormal() == i) {
                return m91878b(larkFont);
            }
        }
        return f62619b.m91884d().getMultiplier() * ((float) i);
    }

    /* renamed from: c */
    private final float m91880c(LarkFont larkFont) {
        int i;
        switch (C25651d.f62625c[m91870a().ordinal()]) {
            case 1:
                i = larkFont.getSmall();
                break;
            case 2:
                i = larkFont.getNormal();
                break;
            case 3:
            case 4:
                i = larkFont.getLarge1();
                break;
            case 5:
            case 6:
                i = larkFont.getLarge2();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return (float) i;
    }

    @JvmStatic
    /* renamed from: a */
    public static final float m91867a(LarkFont larkFont) {
        Intrinsics.checkParameterIsNotNull(larkFont, "larkFont");
        return f62619b.m91868a(larkFont, m91870a());
    }

    /* renamed from: a */
    private final float m91863a(Context context, float f) {
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    /* renamed from: b */
    private final float m91875b(Context context, float f) {
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return TypedValue.applyDimension(2, f, resources.getDisplayMetrics());
    }

    @JvmStatic
    /* renamed from: c */
    public static final int m91881c(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return C69029a.m265653a(f62619b.m91863a(context, m91870a().getMultiplier() * ((float) i)));
    }

    @JvmStatic
    /* renamed from: d */
    public static final int m91883d(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        LKUIDisplayManager cVar = f62619b;
        return C69029a.m265653a(cVar.m91863a(context, cVar.m91884d().getMultiplier() * ((float) i)));
    }

    @JvmStatic
    /* renamed from: a */
    public static final float m91864a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        LKUIDisplayManager cVar = f62619b;
        if (!cVar.m91882c()) {
            return cVar.m91875b(context, (float) i);
        }
        LarkFont[] values = LarkFont.values();
        for (LarkFont larkFont : values) {
            if (larkFont.getNormal() == i) {
                return m91865a(context, larkFont);
            }
        }
        return f62619b.m91863a(context, m91870a().getMultiplier() * ((float) i));
    }

    @JvmStatic
    /* renamed from: b */
    public static final float m91876b(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        LKUIDisplayManager cVar = f62619b;
        if (!cVar.m91882c()) {
            return cVar.m91875b(context, (float) i);
        }
        LarkFont[] values = LarkFont.values();
        for (LarkFont larkFont : values) {
            if (larkFont.getNormal() == i) {
                return m91877b(context, larkFont);
            }
        }
        LKUIDisplayManager cVar2 = f62619b;
        return cVar2.m91863a(context, cVar2.m91884d().getMultiplier() * ((float) i));
    }

    @JvmStatic
    /* renamed from: a */
    public static final float m91865a(Context context, LarkFont larkFont) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(larkFont, "larkFont");
        LKUIDisplayManager cVar = f62619b;
        if (!cVar.m91882c()) {
            return cVar.m91875b(context, (float) larkFont.getNormal());
        }
        return cVar.m91863a(context, cVar.m91868a(larkFont, m91870a()));
    }

    @JvmStatic
    /* renamed from: b */
    public static final float m91877b(Context context, LarkFont larkFont) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(larkFont, "larkFont");
        LKUIDisplayManager cVar = f62619b;
        if (!cVar.m91882c()) {
            return cVar.m91875b(context, (float) larkFont.getNormal());
        }
        return cVar.m91863a(context, cVar.m91880c(larkFont));
    }

    /* renamed from: a */
    private final float m91868a(LarkFont larkFont, ZoomLevel zoomLevel) {
        int i;
        switch (C25651d.f62624b[zoomLevel.ordinal()]) {
            case 1:
                i = larkFont.getSmall();
                break;
            case 2:
                i = larkFont.getNormal();
                break;
            case 3:
                i = larkFont.getLarge1();
                break;
            case 4:
                i = larkFont.getLarge2();
                break;
            case 5:
                i = larkFont.getLarge3();
                break;
            case 6:
                i = larkFont.getLarge4();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return (float) i;
    }

    @JvmStatic
    /* renamed from: a */
    public static final float m91866a(Context context, LarkFont larkFont, ZoomLevel zoomLevel) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(larkFont, "larkFont");
        Intrinsics.checkParameterIsNotNull(zoomLevel, "zoomLevel");
        LKUIDisplayManager cVar = f62619b;
        return cVar.m91863a(context, cVar.m91868a(larkFont, zoomLevel));
    }
}
