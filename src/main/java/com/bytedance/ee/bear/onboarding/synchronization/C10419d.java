package com.bytedance.ee.bear.onboarding.synchronization;

import android.text.TextUtils;
import com.bytedance.ee.bear.onboarding.synchronization.OnBoardingPrefData;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.onboarding.synchronization.d */
public class C10419d {

    /* renamed from: a */
    private String f27992a;

    /* renamed from: c */
    public void mo39659c() {
        UserSP.getInstance().remove(this.f27992a);
    }

    /* renamed from: a */
    public OnBoardingPrefData mo39654a() {
        OnBoardingPrefData onBoardingPrefData = (OnBoardingPrefData) UserSP.getInstance().getJSONObject(this.f27992a, OnBoardingPrefData.class);
        if (onBoardingPrefData != null) {
            return onBoardingPrefData;
        }
        C13479a.m54772d("OnBoardingPrefDataManager", "sp onBoardingData = null");
        return new OnBoardingPrefData();
    }

    /* renamed from: b */
    public Map<String, Boolean> mo39658b() {
        Map<String, OnBoardingPrefData.OnBoardingItem> onBoardingItemMap = mo39654a().getOnBoardingItemMap();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, OnBoardingPrefData.OnBoardingItem> entry : onBoardingItemMap.entrySet()) {
            hashMap.put(entry.getKey(), Boolean.valueOf(entry.getValue().isDone()));
        }
        C13479a.m54772d("OnBoardingPrefDataManager", "Load OnBoardings from preference: " + onBoardingItemMap);
        return hashMap;
    }

    public C10419d(String str) {
        this.f27992a = str;
    }

    /* renamed from: a */
    public void mo39655a(OnBoardingPrefData onBoardingPrefData) {
        UserSP.getInstance().putJSONObject(this.f27992a, onBoardingPrefData);
    }

    /* renamed from: a */
    public void mo39657a(HashMap<String, Boolean> hashMap) {
        if (hashMap != null && !hashMap.isEmpty()) {
            C13479a.m54764b("OnBoardingPrefDataManager", "setPatchStatus to preference: " + hashMap);
            OnBoardingPrefData a = mo39654a();
            a.putAll(hashMap);
            mo39655a(a);
        }
    }

    /* renamed from: a */
    public void mo39656a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            C13479a.m54764b("OnBoardingPrefDataManager", "setStatus to preference: " + str + ": " + z);
            OnBoardingPrefData a = mo39654a();
            a.update(str, z);
            mo39655a(a);
        }
    }
}
