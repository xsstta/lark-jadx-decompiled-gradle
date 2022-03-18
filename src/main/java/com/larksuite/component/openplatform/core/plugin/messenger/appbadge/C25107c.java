package com.larksuite.component.openplatform.core.plugin.messenger.appbadge;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode;
import com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.impl.business.p3427a.p3428a.C67869a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.appbadge.c */
public class C25107c implements AbstractC67728b {
    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b
    /* renamed from: a */
    public String mo49147a() {
        return "report_badge";
    }

    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b
    /* renamed from: a */
    public void mo49148a(CrossProcessDataEntity crossProcessDataEntity, final AbstractC67727a aVar) {
        if (crossProcessDataEntity == null) {
            AppBrandLogger.m52830i("ReportBadgeCrossCallHandler", "update badge data is null");
            aVar.mo49530a(null);
            return;
        }
        final String b = crossProcessDataEntity.mo234744b("app_id");
        final Integer valueOf = Integer.valueOf(crossProcessDataEntity.mo234737a("badge_num", 0));
        Integer valueOf2 = Integer.valueOf(crossProcessDataEntity.mo234737a("feature_type", CommonEnum.OpenAppFeatureType.MiniApp.getValue()));
        AppBrandLogger.m52830i("ReportBadgeCrossCallHandler", "update badge badgeNum: " + valueOf + " featureType: " + valueOf2);
        if (TextUtils.isEmpty(b)) {
            aVar.mo49530a(null);
            return;
        }
        CommonEnum.OpenAppFeatureType fromValue = CommonEnum.OpenAppFeatureType.fromValue(valueOf2.intValue());
        HashMap hashMap = new HashMap();
        hashMap.put(b, Integer.valueOf(fromValue.getValue()));
        C67869a.m264038a((HashMap<String, Integer>) hashMap, (IGetDataCallback<PullOpenAppBadgeNodesResponse>) new IGetDataCallback<PullOpenAppBadgeNodesResponse>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25107c.C251081 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AppBrandLogger.m52830i("ReportBadgeCrossCallHandler", "PULL_OPEN_APP_BADGE_NODES err = " + errorResult.getDisplayMsg());
                aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("report_badge_response", (Object) null).mo234763b());
            }

            /* renamed from: a */
            public void onSuccess(PullOpenAppBadgeNodesResponse pullOpenAppBadgeNodesResponse) {
                boolean z;
                if (pullOpenAppBadgeNodesResponse == null) {
                    AppBrandLogger.m52830i("ReportBadgeCrossCallHandler", "PULL_OPEN_APP_BADGE_NODES response null");
                    aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("report_badge_response", (Object) null).mo234763b());
                    return;
                }
                List<OpenAppBadgeNode> list = pullOpenAppBadgeNodesResponse.notice_nodes;
                if (CollectionUtils.isEmpty(list)) {
                    AppBrandLogger.m52830i("ReportBadgeCrossCallHandler", "PULL_OPEN_APP_BADGE_NODES openAppBadgeNodes empty");
                    aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("report_badge_response", (Object) null).mo234763b());
                    return;
                }
                for (OpenAppBadgeNode openAppBadgeNode : list) {
                    if (b.equals(openAppBadgeNode.app_id)) {
                        if (valueOf == openAppBadgeNode.badge_num) {
                            z = true;
                        } else {
                            z = false;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("isMatched", z);
                            jSONObject.put("badgeNum", openAppBadgeNode.badge_num);
                        } catch (JSONException e) {
                            AppBrandLogger.m52830i("ReportBadgeCrossCallHandler", "PULL_OPEN_APP_BADGE_NODES response exception:" + e);
                        }
                        aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("report_badge_response", jSONObject).mo234763b());
                        return;
                    }
                }
            }
        }, false, false);
    }
}
