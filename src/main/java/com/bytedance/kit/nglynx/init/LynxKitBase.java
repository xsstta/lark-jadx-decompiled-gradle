package com.bytedance.kit.nglynx.init;

import android.app.Application;
import com.lynx.tasm.LynxEnv;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/bytedance/kit/nglynx/init/LynxKitBase;", "", "()V", "context", "Landroid/app/Application;", "getContext", "()Landroid/app/Application;", "setContext", "(Landroid/app/Application;)V", "coreJsVersion", "", "debug", "", "getDebug", "()Z", "setDebug", "(Z)V", "devtoolOuterControl", "getDevtoolOuterControl", "setDevtoolOuterControl", "lynxVersion", "getLynxVersion", "()Ljava/lang/String;", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.c.f */
public final class LynxKitBase {

    /* renamed from: a */
    public static Application f38577a;

    /* renamed from: b */
    public static final LynxKitBase f38578b = new LynxKitBase();

    /* renamed from: c */
    private static boolean f38579c;

    /* renamed from: d */
    private static boolean f38580d;

    /* renamed from: e */
    private static final String f38581e;

    private LynxKitBase() {
    }

    /* renamed from: b */
    public final boolean mo53780b() {
        return f38579c;
    }

    /* renamed from: c */
    public final boolean mo53781c() {
        return f38580d;
    }

    /* renamed from: a */
    public final Application mo53777a() {
        Application application = f38577a;
        if (application == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return application;
    }

    static {
        LynxEnv e = LynxEnv.m96123e();
        Intrinsics.checkExpressionValueIsNotNull(e, "LynxEnv.inst()");
        String s = e.mo94114s();
        Intrinsics.checkExpressionValueIsNotNull(s, "LynxEnv.inst().lynxVersion");
        f38581e = s;
    }

    /* renamed from: a */
    public final void mo53779a(boolean z) {
        f38579c = z;
    }

    /* renamed from: a */
    public final void mo53778a(Application application) {
        Intrinsics.checkParameterIsNotNull(application, "<set-?>");
        f38577a = application;
    }
}
