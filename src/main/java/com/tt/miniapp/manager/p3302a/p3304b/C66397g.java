package com.tt.miniapp.manager.p3302a.p3304b;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.event.C66016a;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.manager.p3302a.C66389b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.miniapphost.util.TimeMeter;

/* renamed from: com.tt.miniapp.manager.a.b.g */
public class C66397g extends AbstractC66390a {
    @Override // com.tt.miniapp.manager.p3302a.p3304b.AbstractC66390a
    /* renamed from: a */
    public C66391b mo231908a(Context context, C66391b bVar) {
        if (bVar.f167618f) {
            AppBrandLogger.m52830i("ResolveDownloadHandler", "ignore task");
            return bVar;
        } else if (!bVar.f167617e || bVar.f167620h == null || !bVar.f167620h.exists()) {
            bVar.f167613a.mo231087e("basebundle download resolve fail");
            AppBrandLogger.m52830i("ResolveDownloadHandler", "download failed");
            return bVar;
        } else {
            C66016a.C66018a aVar = bVar.f167613a;
            bVar.f167616d = TimeMeter.newAndStart();
            bVar.f167614b = C66389b.m259571a(context, bVar.f167620h, "download_bundle", bVar.f167615c, bVar.f167619g, aVar);
            String convertVersionCodeToStr = AppbrandUtil.convertVersionCodeToStr(C66389b.m259581c());
            long millisAfterStart = bVar.f167616d.getMillisAfterStart();
            if (bVar.f167614b > 0) {
                C66036d.m262458a("mp_lib_install_result", convertVersionCodeToStr, bVar.f167615c, AppbrandUtil.convertVersionCodeToStr(bVar.f167614b), "success", "", millisAfterStart);
            } else {
                new C67500a(C67501b.f170246n, this.f167611b.f167621i).setErrorMessage("unzip or copy failed").flush();
                C66036d.m262458a("mp_lib_install_result", bVar.f167615c, convertVersionCodeToStr, AppbrandUtil.convertVersionCodeToStr(bVar.f167614b), "fail", "unzip and copy basebundle fail", millisAfterStart);
            }
            return bVar;
        }
    }
}
