package com.bytedance.platform.godzilla.p860a.p862b.p866b.p868b;

import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p860a.p862b.p863a.p865b.AbstractC20262a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.platform.godzilla.a.b.b.b.a */
public class C20269a implements AbstractC20262a {

    /* renamed from: a */
    private static List<String> f49555a;

    @Override // com.bytedance.platform.godzilla.p860a.p862b.p863a.p865b.AbstractC20262a
    /* renamed from: a */
    public boolean mo68549a() {
        return true;
    }

    static {
        ArrayList arrayList = new ArrayList();
        f49555a = arrayList;
        arrayList.add("FILE_PROVIDER_PATHS");
        f49555a.add("NullPointerException");
        f49555a.add("Failed to resolve canonical path");
        f49555a.add("android.os.DeadSystemException");
        f49555a.add("Package manager has died");
    }

    @Override // com.bytedance.platform.godzilla.p860a.p862b.p863a.p865b.AbstractC20262a
    /* renamed from: a */
    public boolean mo68550a(Object obj, Throwable th) {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getMethodName().contains("installProvider") && th != null) {
                String th2 = th.toString();
                for (String str : f49555a) {
                    if (th2.contains(str)) {
                        Logger.m74099c("ProviderInstallFailed", "Hint the crash " + str);
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
