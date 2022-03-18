package com.larksuite.component.openplatform.core.plugin.infra.network;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.net.C66504b;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"operateDownloadTask"}, support = {AppType.GadgetAPP, AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.t */
public class C24955t extends AbstractC65797c {
    public C24955t() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("operateDownloadTask");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52829e("AbstractDownloadListener", "abort....");
        try {
            int intValue = ((Integer) bVar.mo234984a("downloadTaskId")).intValue();
            String str = (String) bVar.mo234984a("operationType");
            if (TextUtils.equals(str, "abort")) {
                AppBrandLogger.m52830i("ApiHandler", "operate download task cancel download task:", Integer.valueOf(intValue));
                C66504b.m259890a(intValue, mo230473f());
            } else {
                AppBrandLogger.m52830i("ApiHandler", "operate download task,operateType:", str);
            }
            mo230494j();
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiHandler", "OperateDownloadFileTaskAsyncHandler error:", e);
            mo230486a(e);
        }
    }

    public C24955t(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
