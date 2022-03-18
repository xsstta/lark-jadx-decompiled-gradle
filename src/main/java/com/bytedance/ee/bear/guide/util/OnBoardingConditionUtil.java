package com.bytedance.ee.bear.guide.util;

import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import java.util.HashMap;
import java.util.Map;

public class OnBoardingConditionUtil {

    private static class OnBoardingPrefData implements NonProguard {
        private Map<String, Boolean> onBoardingStatusMap = new HashMap();

        public Map<String, Boolean> getOnBoardingStatusMap() {
            if (this.onBoardingStatusMap == null) {
                this.onBoardingStatusMap = new HashMap(1);
            }
            return this.onBoardingStatusMap;
        }

        public void setOnBoardingStatusMap(Map<String, Boolean> map) {
            this.onBoardingStatusMap = map;
        }

        public boolean getStatus(String str) {
            Boolean bool;
            if (!TextUtils.isEmpty(str) && (bool = getOnBoardingStatusMap().get(str)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m31346a() {
        if (ar.m20936a() == null || C4511g.m18594d().mo17344E() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m31347b() {
        try {
            return ((Boolean) new PersistenceSharedPreference("debug_config").mo34038b("lark_docs_newer_guide_switch", false)).booleanValue();
        } catch (Exception e) {
            C13479a.m54758a("OnBoardingConditionUtil", "isForceShowNewerGuide()... error = " + e.getMessage());
            return false;
        }
    }
}
