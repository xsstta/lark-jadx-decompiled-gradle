package p001a.p002a.p003a.p005b.p006a.p007a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.statistics.p3180a.C63690d;

/* renamed from: a.a.a.b.a.a.d */
public class C0015d implements DynamicModule.VersionPolicy {
    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        Bundle remoteModuleInfo = DynamicModule.getRemoteModuleInfo(context, str);
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        Logger.println(4, C63690d.f160779a, "The version of remote module " + str + ":" + remoteModuleInfo.getInt("module_version"));
        Logger.println(4, C63690d.f160779a, "The version of local module " + str + ":" + localModuleInfo.getInt("local_module_version"));
        if (remoteModuleInfo.getInt("module_version") >= localModuleInfo.getInt("local_module_version")) {
            Logger.println(4, C63690d.f160779a, "Choose remote module info.");
            return remoteModuleInfo;
        }
        Logger.println(4, C63690d.f160779a, "Choose local module info.");
        return localModuleInfo;
    }
}
