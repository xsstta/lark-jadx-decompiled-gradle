package p001a.p002a.p003a.p005b.p006a.p007a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.ttvecamera.p3038g.C60375c;

/* renamed from: a.a.a.b.a.a.c */
public class C0014c implements DynamicModule.VersionPolicy {
    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        DynamicModule.LoadingException loadingException;
        Bundle bundle;
        try {
            bundle = DynamicModule.getRemoteModuleInfo(context, str);
            loadingException = null;
        } catch (DynamicModule.LoadingException e) {
            if (e.getBundle() != null) {
                loadingException = new DynamicModule.LoadingException(e.getMessage(), e.getBundle());
            } else {
                loadingException = new DynamicModule.LoadingException(e.getMessage());
            }
            Logger.println(5, C60375c.f150914a, "Get remote module info failed: " + e.getMessage() + ". try to query local.");
            bundle = new Bundle();
        }
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        Logger.println(4, C60375c.f150914a, "The version of remote module " + str + ":" + bundle.getInt("module_version"));
        Logger.println(4, C60375c.f150914a, "The version of local module " + str + ":" + localModuleInfo.getInt("local_module_version"));
        if (localModuleInfo.getInt("local_module_version") > 0 && localModuleInfo.getInt("local_module_version") >= bundle.getInt("module_version")) {
            Logger.println(4, C60375c.f150914a, "Choose local module info.");
            return localModuleInfo;
        } else if (loadingException == null || bundle.getInt("module_version") != 0) {
            Logger.println(4, C60375c.f150914a, "Choose remote module info.");
            return bundle;
        } else {
            throw loadingException;
        }
    }
}
