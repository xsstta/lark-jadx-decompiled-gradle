package kotlinx.coroutines.internal;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ANDROID_DETECTED", "", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.k */
public final class C69569k {

    /* renamed from: a */
    private static final boolean f173831a;

    /* renamed from: a */
    public static final boolean m267035a() {
        return f173831a;
    }

    static {
        Object obj;
        try {
            Result.Companion aVar = Result.Companion;
            obj = Result.m271569constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        f173831a = Result.m271576isSuccessimpl(obj);
    }
}
