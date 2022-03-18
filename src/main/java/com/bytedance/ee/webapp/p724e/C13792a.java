package com.bytedance.ee.webapp.p724e;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper;
import com.bytedance.ee.ref.p682a.p685c.C13492c;
import com.bytedance.ee.util.p700c.C13602d;
import com.bytedance.ee.webapp.config.C13771b;
import com.bytedance.ee.webapp.config.C13772c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.AbstractC48760b;
import com.ss.android.lark.openapi.permission.bean.C48768a;
import com.tt.refer.p3400a.p3412i.AbstractC67735c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.webapp.e.a */
public class C13792a {

    /* renamed from: a */
    private C13771b f36051a;

    /* renamed from: b */
    private String f36052b;

    /* renamed from: c */
    private final List<String> f36053c = new ArrayList<String>() {
        /* class com.bytedance.ee.webapp.p724e.C13792a.C137931 */

        {
            add("share");
            add("requestAuthCode");
            add("getInspectDebugList");
            add("setStatusBarColor");
            add("config");
            add("setMainNavRightItems");
        }
    };

    /* renamed from: a */
    public void mo50829a(String str, String str2) {
        this.f36051a.mo50791a(str, str2);
    }

    public C13792a(C13771b bVar, String str) {
        this.f36051a = bVar;
        this.f36052b = str;
    }

    /* renamed from: a */
    public AbstractC48760b mo50828a(String str, IAppContext iAppContext, String str2) {
        Log.m165389i("TTPermissionChecker", "handle name:" + str2);
        if (C13772c.m55814b(this.f36052b) || this.f36053c.contains(str2)) {
            Log.m165389i("TTPermissionChecker", "this appId in white Api List");
            return C48768a.m192107a();
        }
        String a = C13772c.m55812a(str);
        AppBrandLogger.m52830i("TTPermissionChecker", "checkPermission url hash code:" + C13602d.m55222a(a));
        if (!TextUtils.isEmpty(a)) {
            Uri parse = Uri.parse(a);
            AppBrandLogger.m52830i("TTPermissionChecker", "checkPermission url host:" + parse.getHost() + ",path:" + parse.getEncodedPath() + ",query:" + parse.getEncodedQuery() + ", fragment" + parse.getEncodedFragment());
        }
        if (!this.f36051a.mo50792a(a)) {
            return C48768a.m192108a(100001, "invalid authentication");
        }
        AbstractC67735c cVar = (AbstractC67735c) iAppContext.findServiceByInterface(AbstractC67735c.class);
        if ((cVar instanceof C13492c) && AbsPermissionSyncWrapper.SyncAuthState.SUCCESS != ((C13492c) cVar).mo50200c()) {
            cVar.mo49509a(this.f36052b, this.f36051a.mo50789a());
        }
        return C48768a.m192107a();
    }
}
