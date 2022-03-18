package com.bytedance.ee.larkbrand.p650e;

import com.bytedance.ee.larkbrand.hostbridge.AppUpdateHandler;
import com.bytedance.ee.larkbrand.hostbridge.GetChatIdHandler;
import com.bytedance.ee.larkbrand.hostbridge.GetChatInfoHandler;
import com.bytedance.ee.larkbrand.hostbridge.GetDynamicDomainHandler;
import com.bytedance.ee.larkbrand.hostbridge.inner.AppLogHandler;
import com.bytedance.ee.larkbrand.hostbridge.inner.GetUserInfoHandler;
import com.bytedance.ee.larkbrand.hostbridge.inner.SharePreferenceHandlerV2;
import com.bytedance.ee.larkbrand.hostbridge.p656b.C13102b;
import com.bytedance.ee.larkbrand.hostbridge.p656b.C13103c;
import com.bytedance.ee.larkbrand.hostbridge.sync.C13106a;
import com.bytedance.ee.larkbrand.hostbridge.sync.C13112b;
import com.bytedance.ee.larkbrand.hostbridge.sync.C13117d;
import com.bytedance.ee.larkbrand.hostbridge.sync.GetNtpTimeHandler;
import com.bytedance.ee.larkbrand.hostbridge.sync.KillGadgetHandler;
import com.bytedance.ee.larkbrand.hostbridge.sync.io.GetKaInfoHandler;
import com.bytedance.ee.larkbrand.hostbridge.sync.io.RegisterBadgeChangeHandler;
import com.bytedance.ee.larkbrand.hostbridge.sync.io.UnRegisterBadgeChangeHandler;
import com.bytedance.ee.larkbrand.hostbridge.sync.p657a.C13107a;
import com.bytedance.ee.larkbrand.hostbridge.sync.p657a.C13108b;
import com.bytedance.ee.larkbrand.hostbridge.sync.p657a.C13109c;
import com.bytedance.ee.larkbrand.hostbridge.sync.p657a.C13110d;
import com.bytedance.ee.larkbrand.hostbridge.sync.p657a.C13111e;
import com.bytedance.ee.larkbrand.hostbridge.sync.p658b.C13113b;
import com.bytedance.ee.larkbrand.hostbridge.sync.p658b.C13114c;
import com.bytedance.ee.larkbrand.hostbridge.sync.p658b.C13116e;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.e.y */
public class C13046y {
    /* renamed from: a */
    public static List<AbstractC67571b> m53528a(AbstractC41371j jVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GetUserInfoHandler());
        arrayList.add(new C13103c());
        arrayList.add(new AppLogHandler());
        arrayList.add(new GetChatInfoHandler(jVar));
        arrayList.add(new GetChatIdHandler(jVar));
        arrayList.add(new C13102b());
        arrayList.add(new C13116e());
        arrayList.add(new C13111e());
        arrayList.add(new C13109c(jVar));
        arrayList.add(new C13113b(jVar));
        arrayList.add(new C13114c());
        arrayList.add(new C13108b(jVar));
        arrayList.add(new C13112b());
        arrayList.add(new GetDynamicDomainHandler(jVar));
        arrayList.add(new GetKaInfoHandler(jVar));
        arrayList.add(new C13107a(jVar));
        arrayList.add(new RegisterBadgeChangeHandler(jVar));
        arrayList.add(new UnRegisterBadgeChangeHandler(jVar));
        arrayList.add(new GetNtpTimeHandler(jVar));
        arrayList.add(new SharePreferenceHandlerV2());
        arrayList.add(new AppUpdateHandler(jVar));
        arrayList.add(new C13110d(jVar));
        arrayList.add(new C13117d());
        arrayList.add(new C13106a(jVar));
        arrayList.add(new KillGadgetHandler());
        return arrayList;
    }
}
