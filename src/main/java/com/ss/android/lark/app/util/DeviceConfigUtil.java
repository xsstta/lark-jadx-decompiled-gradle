package com.ss.android.lark.app.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/app/util/DeviceConfigUtil;", "", "()V", "Companion", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.app.util.c */
public final class DeviceConfigUtil {

    /* renamed from: a */
    public static final String f72891a = Build.BRAND;

    /* renamed from: b */
    public static final HashSet<String> f72892b;

    /* renamed from: c */
    public static final Companion f72893c = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final boolean m106949a(Context context) {
        return f72893c.mo103167a(context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/app/util/DeviceConfigUtil$Companion;", "", "()V", "BRAND", "", "kotlin.jvm.PlatformType", "brandSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "isPad", "", "context", "Landroid/content/Context;", "isPadHorizontalEnable", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.app.util.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final boolean m106950b(Context context) {
            if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
                return true;
            }
            return false;
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo103167a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (!m106950b(context)) {
                return false;
            }
            for (T t : DeviceConfigUtil.f72892b) {
                if (t != null) {
                    String lowerCase = t.toLowerCase();
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                    String str = lowerCase;
                    String str2 = DeviceConfigUtil.f72891a;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "BRAND");
                    if (str2 != null) {
                        String lowerCase2 = str2.toLowerCase();
                        Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                        if (TextUtils.equals(str, lowerCase2)) {
                            return true;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return false;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f72892b = hashSet;
        hashSet.add("HUAWEI");
    }
}
