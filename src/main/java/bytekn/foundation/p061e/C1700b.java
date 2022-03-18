package bytekn.foundation.p061e;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u0005*\u00060\u0002j\u0002`\u0003¨\u0006\u0006"}, d2 = {"getStackTraceString", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "printStackTraceKN", "", "kn_common_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.e.b */
public final class C1700b {
    /* renamed from: a */
    public static final String m7522a(Exception exc) {
        Intrinsics.checkParameterIsNotNull(exc, "$this$getStackTraceString");
        String stackTraceString = Log.getStackTraceString(exc);
        Intrinsics.checkExpressionValueIsNotNull(stackTraceString, "Log.getStackTraceString(this)");
        return stackTraceString;
    }
}
