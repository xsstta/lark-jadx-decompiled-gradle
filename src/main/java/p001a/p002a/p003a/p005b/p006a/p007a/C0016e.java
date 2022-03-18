package p001a.p002a.p003a.p005b.p006a.p007a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;

/* renamed from: a.a.a.b.a.a.e */
public class C0016e implements DynamicModule.VersionPolicy {
    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        Bundle remoteModuleInfo = DynamicModule.getRemoteModuleInfo(context, str);
        if (remoteModuleInfo.getInt("module_version") > 0) {
            Logger.println(4, "e", "Prefer remote: The version of remote module " + str + ":" + remoteModuleInfo.getInt("module_version"));
            return remoteModuleInfo;
        }
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        if (localModuleInfo.getInt("local_module_version") > 0) {
            Logger.println(4, "e", "Choose local: The version of local module " + str + ":" + localModuleInfo.getInt("local_module_version"));
            return localModuleInfo;
        }
        Logger.println(4, "e", "Cannot get module info in remote or local.");
        return new Bundle();
    }
}
