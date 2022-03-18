package com.tt.miniapp.manager.p3302a;

import android.content.Context;
import com.tt.miniapp.event.C66016a;
import com.tt.miniapp.manager.p3302a.p3304b.AbstractC66390a;
import com.tt.miniapp.manager.p3302a.p3304b.C66391b;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.miniapphost.util.ProcessUtil;

/* renamed from: com.tt.miniapp.manager.a.e */
public class C66406e extends AbstractC66390a {
    @Override // com.tt.miniapp.manager.p3302a.p3304b.AbstractC66390a
    /* renamed from: a */
    public C66391b mo231908a(Context context, C66391b bVar) {
        if (ProcessUtil.isMainProcess(context) && bVar.f167614b > 0) {
            String convertVersionCodeToStr = AppbrandUtil.convertVersionCodeToStr(bVar.f167614b);
            C66399c.m259608a().mo231919a(convertVersionCodeToStr, AppbrandUtil.convertFourToThreeVersion(convertVersionCodeToStr), bVar.f167615c);
            C66016a.C66018a aVar = bVar.f167613a;
            aVar.mo231087e("setCurrentBaseVersion:" + bVar.f167614b);
        }
        return bVar;
    }
}
