package com.huawei.hms.framework.network.grs;

import android.content.Context;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.restclient.hwhttp.plugin.BasePlugin;
import com.huawei.hms.framework.network.restclient.hwhttp.plugin.PluginInterceptor;
import java.util.Locale;

public class GrsManager implements BasePlugin {
    private static final int GRS_KEY_INDEX = 1;
    private static final int GRS_PATH_INDEX = 2;
    private static final String GRS_SCHEMA = "grs://";
    private static final int GRS_SERVICE_INDEX = 0;
    private static final int MAX_GRS_SPLIT = 3;
    private static final String SEPARATOR = "/";
    private static final String TAG = "GrsManager";
    private static volatile GrsManager instance;
    private GrsConfig grsConfig;
    private C23589f grsInterceptor;

    private GrsManager() {
    }

    public static GrsManager getInstance() {
        if (instance == null) {
            synchronized (GrsManager.class) {
                if (instance == null) {
                    instance = new GrsManager();
                }
            }
        }
        return instance;
    }

    private String getServiceNameUrl(String str, String str2) {
        return GrsApi.synGetGrsUrl(str, str2);
    }

    public static boolean isGRSSchema(String str) {
        return str != null && str.startsWith(GRS_SCHEMA);
    }

    private String[] parseGRSSchema(String str) {
        return StringUtils.substring(str, str.toLowerCase(Locale.ENGLISH).indexOf(GRS_SCHEMA) + 6).split(SEPARATOR, 3);
    }

    public PluginInterceptor getInterceptor() {
        if (this.grsInterceptor == null) {
            this.grsInterceptor = new C23589f();
        }
        return this.grsInterceptor;
    }

    public boolean initGrs(Context context, GrsConfig grsConfig2) {
        GrsConfig grsConfig3 = this.grsConfig;
        if (grsConfig3 != null && grsConfig3.equal(grsConfig2)) {
            return true;
        }
        this.grsConfig = grsConfig2;
        GrsBaseInfo grsBaseInfo = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        GrsConfig grsConfig4 = this.grsConfig;
        if (grsConfig4 != null) {
            grsBaseInfo = grsConfig4.getGrsBaseInfo(applicationContext);
        }
        GrsApi.grsSdkInit(applicationContext, grsBaseInfo);
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String parseGrs(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.GrsManager.parseGrs(java.lang.String):java.lang.String");
    }
}
