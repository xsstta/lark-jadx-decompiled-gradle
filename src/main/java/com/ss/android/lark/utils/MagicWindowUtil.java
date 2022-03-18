package com.ss.android.lark.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.magicwindow.EasyGoWrapper;
import com.ss.android.lark.utils.magicwindow.HuaweiEasyGoImpl;
import com.ss.android.lark.utils.magicwindow.XiaomiEasyGoImpl;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0018\u001a\u00020\u0017H\u0007J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/utils/MagicWindowUtil;", "", "()V", "BRAND_HONOR", "", "BRAND_HUAWEI", "BRAND_XIAOMI", "TAG", "TAG_MAGIC_WINDOW", "easyGo", "Lcom/ss/android/lark/utils/magicwindow/EasyGoWrapper;", "getEasyGo", "()Lcom/ss/android/lark/utils/magicwindow/EasyGoWrapper;", "setEasyGo", "(Lcom/ss/android/lark/utils/magicwindow/EasyGoWrapper;)V", "connectServer", "", "context", "Landroid/content/Context;", "getRealWindowWidth", "", "(Landroid/content/Context;)Ljava/lang/Integer;", "isHuawei", "", "isInitialized", "isMagicWindow", "isPad", "isXiaomi", "syncLoginStatus", "value", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.utils.y */
public final class MagicWindowUtil {

    /* renamed from: a */
    public static EasyGoWrapper f142514a;

    /* renamed from: b */
    public static final MagicWindowUtil f142515b = new MagicWindowUtil();

    private MagicWindowUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m224685a() {
        if (f142514a != null) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m224683a(int i) {
        EasyGoWrapper aVar = f142514a;
        if (aVar != null) {
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("easyGo");
            }
            aVar.mo196170a(i);
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m224686d(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        if ((resources.getConfiguration().screenLayout & 15) >= 3) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: f */
    public static final Integer m224688f(Context context) {
        int i;
        DisplayMetrics displayMetrics;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            i = 0;
        } else {
            i = displayMetrics.widthPixels;
        }
        return Integer.valueOf(i);
    }

    @JvmStatic
    /* renamed from: e */
    public static final boolean m224687e(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        String configuration = resources.getConfiguration().toString();
        Intrinsics.checkExpressionValueIsNotNull(configuration, "context.resources.configuration.toString()");
        return StringsKt.contains$default((CharSequence) configuration, (CharSequence) "magic-windows", false, 2, (Object) null);
    }

    /* renamed from: b */
    public final boolean mo196229b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = Build.BRAND;
        Intrinsics.checkExpressionValueIsNotNull(str, "Build.BRAND");
        if (str != null) {
            String lowerCase = str.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            return StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "xiaomi", false, 2, (Object) null);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m224684a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (f142514a == null) {
            MagicWindowUtil yVar = f142515b;
            if (yVar.mo196230c(context) || yVar.mo196229b(context)) {
                if (yVar.mo196229b(context)) {
                    f142514a = new XiaomiEasyGoImpl(context);
                } else if (yVar.mo196230c(context)) {
                    f142514a = new HuaweiEasyGoImpl(context);
                }
                EasyGoWrapper aVar = f142514a;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("easyGo");
                }
                aVar.mo196169a();
                return;
            }
        }
        if (f142514a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("connectServer failed, device brand is ");
            String str = Build.BRAND;
            Intrinsics.checkExpressionValueIsNotNull(str, "Build.BRAND");
            if (str != null) {
                String lowerCase = str.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                sb.append(lowerCase);
                Log.m165389i("Magic_Window", sb.toString());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        Log.m165389i("Magic_Window", "magic window is isInitialized, return");
    }

    /* renamed from: c */
    public final boolean mo196230c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = Build.BRAND;
        Intrinsics.checkExpressionValueIsNotNull(str, "Build.BRAND");
        if (str != null) {
            String lowerCase = str.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "huawei", false, 2, (Object) null)) {
                String str2 = Build.BRAND;
                Intrinsics.checkExpressionValueIsNotNull(str2, "Build.BRAND");
                if (str2 != null) {
                    String lowerCase2 = str2.toLowerCase();
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    if (StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "honor", false, 2, (Object) null)) {
                        return true;
                    }
                    return false;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
