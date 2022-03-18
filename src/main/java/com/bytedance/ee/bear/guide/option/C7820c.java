package com.bytedance.ee.bear.guide.option;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.guide.option.UserPropertiesData;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.guide.option.c */
public class C7820c {

    /* renamed from: a */
    public static boolean f21129a;

    /* renamed from: b */
    private static boolean f21130b;

    /* renamed from: a */
    public static void m31345a() {
        C13479a.m54764b("OptionResearchManager", "finishOptionResearch()...");
        f21130b = false;
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39519b("doc_onboarding_option_research");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m31344a(SimpleRequestResult simpleRequestResult) throws Exception {
        boolean z;
        String str;
        if (simpleRequestResult.code == 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set user properties ");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        sb.append(str);
        C13479a.m54764b("OptionResearchManager", sb.toString());
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public static AbstractC68307f<Boolean> m31343a(UserPropertiesData.OnBoardingData onBoardingData) {
        if (onBoardingData == null) {
            return AbstractC68307f.m265083a((Object) true);
        }
        C13479a.m54764b("OptionResearchManager", "setUserProperties()... onBoardingData = " + onBoardingData);
        ar.m20936a();
        UserPropertiesData userPropertiesData = new UserPropertiesData(onBoardingData);
        NetService.C5077f fVar = new NetService.C5077f("/space/api/user_properties/set/");
        fVar.mo20143a(1);
        fVar.mo20153c(JSONObject.toJSONString(userPropertiesData));
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C5205f()).mo20141a(fVar).mo238020d($$Lambda$c$tI8A_5Y9hNobenH5wXcwkPcUhY.INSTANCE);
    }
}
