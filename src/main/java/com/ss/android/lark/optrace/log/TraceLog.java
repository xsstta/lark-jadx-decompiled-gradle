package com.ss.android.lark.optrace.log;

import com.ss.android.lark.log.Log;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0014\b\u0001\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0007J1\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\rJ1\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\rJ1\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\rJ1\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/optrace/log/TraceLog;", "", "()V", "createLog", "", "messages", "", "([Ljava/lang/Object;)Ljava/lang/String;", C63690d.f160779a, "", "tag", "traceId", "msg", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "e", "i", "w", "OPTrace_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.optrace.b.a */
public final class TraceLog {

    /* renamed from: a */
    public static final TraceLog f122920a = new TraceLog();

    private TraceLog() {
    }

    /* renamed from: a */
    private final String m192774a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(" ");
            if (obj != null) {
                sb.append(obj);
            } else {
                sb.append("null");
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "buffer.toString()");
        return sb2;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m192776b(String str, String str2, Object... objArr) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "traceId");
        Intrinsics.checkParameterIsNotNull(objArr, "msg");
        String a = f122920a.m192774a(Arrays.copyOf(objArr, objArr.length));
        Log.m165389i(str, '[' + str2 + "] " + a);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m192777c(String str, String str2, Object... objArr) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "traceId");
        Intrinsics.checkParameterIsNotNull(objArr, "msg");
        String a = f122920a.m192774a(Arrays.copyOf(objArr, objArr.length));
        Log.m165397w(str, '[' + str2 + "] " + a);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m192775a(String str, String str2, Object... objArr) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "traceId");
        Intrinsics.checkParameterIsNotNull(objArr, "msg");
        String a = f122920a.m192774a(Arrays.copyOf(objArr, objArr.length));
        Log.m165379d(str, '[' + str2 + "] " + a);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m192778d(String str, String str2, Object... objArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "traceId");
        Intrinsics.checkParameterIsNotNull(objArr, "msg");
        boolean z2 = false;
        if (objArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((!z) && (objArr[objArr.length - 1] instanceof Throwable)) {
            z2 = true;
        }
        String a = f122920a.m192774a(Arrays.copyOf(objArr, objArr.length));
        if (z2) {
            String str3 = '[' + str2 + "] " + a;
            Object obj = objArr[objArr.length - 1];
            if (obj != null) {
                Log.m165384e(str, str3, (Throwable) obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
        }
        Log.m165383e(str, '[' + str2 + "] " + a);
    }
}
