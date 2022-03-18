package com.larksuite.arch.jack;

import android.util.Log;
import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/larksuite/arch/jack/JackArchPlugins;", "", "()V", "Log", "Lcom/larksuite/arch/jack/Log;", "getLog", "()Lcom/larksuite/arch/jack/Log;", "isDebug", "", "()Z", "setDebug", "(Z)V", "logInternal", "setLog", "", "log", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.j */
public final class JackArchPlugins {

    /* renamed from: a */
    public static final JackArchPlugins f59416a = new JackArchPlugins();

    /* renamed from: b */
    private static Log f59417b;

    /* renamed from: c */
    private static final Log f59418c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\"\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/larksuite/arch/jack/JackArchPlugins$logInternal$1", "Lcom/larksuite/arch/jack/Log;", C63690d.f160779a, "", "tag", "", "message", "e", "error", "", "i", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.j$a */
    public static final class C24026a implements Log {
        C24026a() {
        }

        @Override // com.larksuite.arch.jack.Log
        /* renamed from: a */
        public void mo86228a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(str2, "message");
            Log.i(str, str2);
        }
    }

    private JackArchPlugins() {
    }

    /* renamed from: a */
    public final Log mo86227a() {
        return f59418c;
    }

    static {
        C24026a aVar = new C24026a();
        f59417b = aVar;
        f59418c = aVar;
    }
}
