package com.ss.android.lark.app.util;

import android.app.Activity;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57824f;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.app.util.d */
public class C29086d {
    /* renamed from: a */
    public static void m106952a() {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.init(new DynamicFeatureCore.AbstractC36595a() {
                /* class com.ss.android.lark.app.util.C29086d.C290871 */

                @Override // com.ss.android.lark.dfcore.DynamicFeatureCore.AbstractC36595a
                /* renamed from: a */
                public Activity mo103168a() {
                    return AppLifecycle.m200904a().mo177978h();
                }

                @Override // com.ss.android.lark.dfcore.DynamicFeatureCore.AbstractC36595a
                /* renamed from: a */
                public void mo103169a(String str, JSONObject jSONObject) {
                    Statistics.sendEvent(str, jSONObject);
                }
            });
        }
    }
}
