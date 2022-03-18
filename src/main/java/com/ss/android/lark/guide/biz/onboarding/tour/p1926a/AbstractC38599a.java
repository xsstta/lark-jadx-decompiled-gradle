package com.ss.android.lark.guide.biz.onboarding.tour.p1926a;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.guide.biz.onboarding.tour.entity.C38604a;
import com.ss.android.lark.guide.biz.onboarding.tour.entity.C38605b;
import com.ss.android.lark.guide.biz.onboarding.tour.entity.TrustedMailRequestParam;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.entity.LdrServiceData;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.a.a */
public interface AbstractC38599a {
    /* renamed from: a */
    void mo141373a(IGetDataCallback<C38604a> iGetDataCallback);

    /* renamed from: a */
    void mo141374a(TrustedMailRequestParam trustedMailRequestParam, IGetDataCallback<C38605b> iGetDataCallback);

    /* renamed from: a */
    void mo141375a(List<String> list, Map<String, String> map);

    /* renamed from: b */
    void mo141376b(IGetDataCallback<List<LdrServiceData>> iGetDataCallback);
}
