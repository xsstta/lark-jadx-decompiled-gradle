package com.ss.android.lark.littleapp.p2128e.p2130b;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;

/* renamed from: com.ss.android.lark.littleapp.e.b.a */
public class C41325a {
    /* renamed from: a */
    public static String m163829a(IAppContext iAppContext) {
        AppInfoEntity appInfo;
        StringBuilder sb = new StringBuilder();
        sb.append("https://tmaservice.developer.toutiao.com/");
        if (!(iAppContext == null || ((!ProcessUtil.isMiniappProcess() && AppType.GadgetAPP != iAppContext.getAppType()) || C67432a.m262319a(iAppContext) == null || (appInfo = C67432a.m262319a(iAppContext).getAppInfo()) == null || appInfo.appId == null || appInfo.version == null))) {
            sb.append("?appid=");
            sb.append(appInfo.appId);
            sb.append("&version=");
            sb.append(appInfo.version);
        }
        return sb.toString();
    }
}
