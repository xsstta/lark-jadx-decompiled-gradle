package com.bytedance.sysoptimizer.java;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class IConnectivityManagerProtector {
    private static final List<String> PROTECTED_METHODS = Arrays.asList("getNetworkCapabilities", "getAllNetworks", "getLinkProperties", "getLinkPropertiesForType");
    private static boolean sIsInit;

    public static void install(Context context) {
        if (!sIsInit && context != null) {
            sIsInit = BinderServiceWrapperProtector.install(context.getApplicationContext(), "connectivity", PROTECTED_METHODS, "ICMP", new BinderServiceWrapperProtector.AdminResult() {
                /* class com.bytedance.sysoptimizer.java.IConnectivityManagerProtector.C207091 */

                @Override // com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector.AdminResult
                public Object getDefaultResult(Object obj, Method method, Object[] objArr) {
                    if (Build.VERSION.SDK_INT < 21) {
                        Log.e("ICMP", "it shouldn't reach here");
                        return null;
                    }
                    String name = method.getName();
                    if (!"getNetworkCapabilities".equals(name) && !"getAllNetworks".equals(name) && !"getLinkProperties".equals(name)) {
                        return new Object();
                    }
                    return null;
                }
            });
        }
    }
}
