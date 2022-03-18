package com.larksuite.component.openplatform.core.plugin.messenger.appbadge;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesResponse;
import com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppBadgeNodeResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.impl.business.p3427a.p3428a.C67869a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.appbadge.e */
public class C25111e implements AbstractC67728b {
    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b
    /* renamed from: a */
    public String mo49147a() {
        return "update_badge";
    }

    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b
    /* renamed from: a */
    public void mo49148a(CrossProcessDataEntity crossProcessDataEntity, final AbstractC67727a aVar) {
        if (crossProcessDataEntity == null) {
            AppBrandLogger.m52830i("UpdateBadgeCrossCallHandler", "update badge data is null");
            aVar.mo49530a(null);
            return;
        }
        String b = crossProcessDataEntity.mo234744b("app_id");
        Integer valueOf = Integer.valueOf(crossProcessDataEntity.mo234737a("badge_num", 0));
        Integer valueOf2 = Integer.valueOf(crossProcessDataEntity.mo234737a("feature_type", CommonEnum.OpenAppFeatureType.MiniApp.getValue()));
        AppBrandLogger.m52830i("UpdateBadgeCrossCallHandler", "update badge badgeNum: " + valueOf + " featureType: " + valueOf2);
        if (TextUtils.isEmpty(b)) {
            aVar.mo49530a(null);
            return;
        }
        CommonEnum.OpenAppFeatureType fromValue = CommonEnum.OpenAppFeatureType.fromValue(valueOf2.intValue());
        C67869a.m264035a(b, valueOf, null, fromValue, new IGetDataCallback<UpdateOpenAppBadgeNodeResponse>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25111e.C251121 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AppBrandLogger.m52830i("UpdateBadgeCrossCallHandler", "UPDATE_LOCAL_OPEN_APP_BADGE_NODE onError" + errorResult.getDisplayMsg());
                aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("update_badge_response", (Object) C25111e.this.mo88218a(-1, "op_app_badge_update_notice_node", 4, false)).mo234763b());
            }

            /* renamed from: a */
            public void onSuccess(UpdateOpenAppBadgeNodeResponse updateOpenAppBadgeNodeResponse) {
                if (updateOpenAppBadgeNodeResponse == null) {
                    AppBrandLogger.m52830i("UpdateBadgeCrossCallHandler", "UPDATE_LOCAL_OPEN_APP_BADGE_NODE response null");
                    aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("update_badge_response", (Object) C25111e.this.mo88218a(-1, "op_app_badge_update_notice_node", 4, false)).mo234763b());
                } else if (updateOpenAppBadgeNodeResponse.code != BadgeNodeActionCode.CODE_SUCCESS) {
                    AppBrandLogger.m52830i("UpdateBadgeCrossCallHandler", "UPDATE_LOCAL_OPEN_APP_BADGE_NODE failed， err = " + updateOpenAppBadgeNodeResponse.msg);
                    aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("update_badge_response", (Object) C25111e.this.mo88218a(updateOpenAppBadgeNodeResponse.code.getValue(), "op_app_badge_update_notice_node", 4, false)).mo234763b());
                } else {
                    aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("update_badge_response", (Object) C25111e.this.mo88218a(updateOpenAppBadgeNodeResponse.code.getValue(), "op_app_badge_update_notice_node", 4, false)).mo234763b());
                }
            }
        });
        m90446a(b, valueOf, fromValue, aVar);
    }

    /* renamed from: a */
    private void m90446a(String str, Integer num, CommonEnum.OpenAppFeatureType openAppFeatureType, final AbstractC67727a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, Integer.valueOf(openAppFeatureType.getValue()));
        C25105b.m90439a(str, null, num, openAppFeatureType);
        C67869a.m264038a((HashMap<String, Integer>) hashMap, (IGetDataCallback<PullOpenAppBadgeNodesResponse>) new IGetDataCallback<PullOpenAppBadgeNodesResponse>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25111e.C251132 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AppBrandLogger.m52830i("UpdateBadgeCrossCallHandler", "PULL_OPEN_APP_BADGE_NODES err = " + errorResult.getDisplayMsg());
                aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("update_badge_response", (Object) C25111e.this.mo88218a(-1, "op_app_badge_pull_node", 2, true)).mo234763b());
            }

            /* renamed from: a */
            public void onSuccess(PullOpenAppBadgeNodesResponse pullOpenAppBadgeNodesResponse) {
                if (pullOpenAppBadgeNodesResponse == null) {
                    AppBrandLogger.m52830i("UpdateBadgeCrossCallHandler", "PULL_OPEN_APP_BADGE_NODES response null");
                    aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("update_badge_response", (Object) C25111e.this.mo88218a(-1, "op_app_badge_pull_node", 2, true)).mo234763b());
                    return;
                }
                aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("update_badge_response", (Object) C25111e.this.mo88218a(BadgeNodeActionCode.CODE_SUCCESS.getValue(), "op_app_badge_pull_node", 2, true)).mo234763b());
                AppBrandLogger.m52830i("UpdateBadgeCrossCallHandler", "PULL_OPEN_APP_BADGE_NODES success");
            }
        }, false, true);
    }

    /* renamed from: a */
    public String mo88218a(int i, String str, int i2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i).put("event", str).put("scene", i2).put("fromPull", z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
