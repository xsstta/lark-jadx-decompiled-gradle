package com.ss.android.ugc.effectmanager.common.logger;

import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0007J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0007J$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0007J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\nH\u0007J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/logger/EPLog;", "", "()V", "sEnableLog", "", "getSEnableLog", "()Z", "setSEnableLog", "(Z)V", "sLogger", "Lcom/ss/android/ugc/effectmanager/common/logger/ILogger;", "sdkTag", "", "addSDKTagString", "", "tagStr", C63690d.f160779a, "tag", "msg", "e", "t", "", "getSDKTag", "i", "setEnableLog", "enable", "setLogger", "logger", "w", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.d.b */
public final class EPLog {

    /* renamed from: a */
    public static final EPLog f151297a = new EPLog();

    /* renamed from: b */
    private static ILogger f151298b = DefaultLogger.f151296a;

    /* renamed from: c */
    private static boolean f151299c = true;

    /* renamed from: d */
    private static String f151300d = "EffectPlatform";

    private EPLog() {
    }

    /* renamed from: a */
    public final boolean mo207194a() {
        return f151299c;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m235175a(String str) {
        String str2 = f151300d;
        f151300d = str2 + '-' + str;
    }

    /* renamed from: b */
    private final String m235178b(String str) {
        return '[' + f151300d + '#' + str + "]:";
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m235176a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        ILogger cVar = f151298b;
        cVar.mo207191a(f151297a.m235178b(str) + "  " + str2);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m235180c(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        ILogger cVar = f151298b;
        cVar.mo207192a(f151297a.m235178b(str) + "  " + str2, null);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m235179b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        ILogger cVar = f151298b;
        cVar.mo207193b(f151297a.m235178b(str) + "  " + str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m235177a(String str, String str2, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        ILogger cVar = f151298b;
        cVar.mo207192a(f151297a.m235178b(str) + "  " + str2, th);
    }
}
