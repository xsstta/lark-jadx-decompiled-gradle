package com.bytedance.bdturing;

import android.util.Log;
import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u001c\u0010\f\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0006H\u0007J\u0014\u0010\u0010\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\u0011j\u0002`\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u001c\u0010\u0015\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/bdturing/LogUtil;", "", "()V", "LOG_LEVEL", "", "closeLog", "", C63690d.f160779a, "tag", "", "msg", "e", "i", "isDebug", "", "openLog", "printException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "printStack", "v", "w", "setting_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.e */
public final class LogUtil {

    /* renamed from: a */
    public static final LogUtil f11182a = new LogUtil();

    /* renamed from: b */
    private static int f11183b = 1;

    private LogUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m14896a() {
        if (f11183b > 6) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m14894a(Exception exc) {
        Intrinsics.checkParameterIsNotNull(exc, "e");
        if (f11183b < 3) {
            exc.printStackTrace();
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m14897b(String str, String str2) {
        if (f11183b >= 5) {
            Log.w(str, String.valueOf(str2));
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m14898c(String str, String str2) {
        if (f11183b >= 6) {
            Log.e(str, String.valueOf(str2));
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m14899d(String str, String str2) {
        if (f11183b >= 3) {
            Log.d(str, String.valueOf(str2));
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m14895a(String str, String str2) {
        if (f11183b >= 4) {
            Log.i(str, String.valueOf(str2));
        }
    }
}
