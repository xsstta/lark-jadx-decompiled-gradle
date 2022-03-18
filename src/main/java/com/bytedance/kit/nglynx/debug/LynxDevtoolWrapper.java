package com.bytedance.kit.nglynx.debug;

import android.util.AndroidRuntimeException;
import com.bytedance.kit.nglynx.init.LynxKitBase;
import com.lynx.devtoolwrapper.AbstractC26493d;
import com.lynx.devtoolwrapper.C26494e;
import com.lynx.tasm.LynxEnv;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000*\u0001\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000eJ\r\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bytedance/kit/nglynx/debug/LynxDevtoolWrapper;", "", "()V", "dependDevtool", "", "devtoolNeedsList", "", "Lcom/bytedance/kit/nglynx/debug/LynxDevtoolProcessor;", "mListener", "com/bytedance/kit/nglynx/debug/LynxDevtoolWrapper$mListener$1", "Lcom/bytedance/kit/nglynx/debug/LynxDevtoolWrapper$mListener$1;", "addDevtoolProcessor", "", "processor", "addDevtoolProcessor$x_lynx_kit_release", "registerDevtoolListener", "registerDevtoolListener$x_lynx_kit_release", "triggerLynxDevtool", "url", "", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.b.b */
public final class LynxDevtoolWrapper {

    /* renamed from: a */
    public static final LynxDevtoolWrapper f38542a = new LynxDevtoolWrapper();

    /* renamed from: b */
    private static boolean f38543b = true;

    /* renamed from: c */
    private static final List<LynxDevtoolProcessor> f38544c = new ArrayList();

    /* renamed from: d */
    private static final C14563a f38545d = new C14563a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/kit/nglynx/debug/LynxDevtoolWrapper$mListener$1", "Lcom/lynx/devtoolwrapper/LynxDevtoolCardListener;", "open", "", "url", "", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.b.b$a */
    public static final class C14563a implements AbstractC26493d {
        C14563a() {
        }
    }

    private LynxDevtoolWrapper() {
    }

    static {
        try {
        } catch (Throwable unused) {
            new AndroidRuntimeException("Just Warning: No Devtool Dependency found, add lynx_devtool if needs").printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo53717a() {
        if (f38543b) {
            LynxEnv.m96123e().mo94091a(true);
            if (!LynxKitBase.f38578b.mo53781c()) {
                LynxEnv.m96123e().mo94093b(true);
            }
            C26494e.m96054a().mo93943a(f38545d);
        }
    }

    /* renamed from: a */
    public final void mo53718a(LynxDevtoolProcessor aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "processor");
        f38544c.add(aVar);
    }

    /* renamed from: a */
    public final boolean mo53719a(String str) {
        if (str != null) {
            String str2 = null;
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "//remote_debug_lynx", false, 2, (Object) null)) {
                str2 = str;
            }
            if (str2 != null) {
                C26494e a = C26494e.m96054a();
                if (a.mo93944a(str)) {
                    a.mo93945b(str);
                    return true;
                }
            }
        }
        return false;
    }
}
