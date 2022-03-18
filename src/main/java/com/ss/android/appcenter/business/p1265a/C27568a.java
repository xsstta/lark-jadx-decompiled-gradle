package com.ss.android.appcenter.business.p1265a;

import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.appcenter.business.activity.appsetting.LittleAppPermissionData;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.net.badge.AppBadgeSettingInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.a.a */
public class C27568a {
    /* renamed from: b */
    private static String m100615b(List<OpenAppBadgeNode> list) {
        String str;
        JsonArray jsonArray = new JsonArray();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                OpenAppBadgeNode openAppBadgeNode = list.get(i);
                CommonEnum.OpenAppFeatureType openAppFeatureType = openAppBadgeNode.feature;
                if (openAppFeatureType != null) {
                    str = openAppFeatureType.name();
                } else {
                    str = "";
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("appId", openAppBadgeNode.app_id);
                jsonObject.addProperty(ShareHitPoint.f121869d, str);
                jsonObject.addProperty("num", openAppBadgeNode.badge_num);
                jsonObject.addProperty("show", openAppBadgeNode.need_show);
                jsonArray.add(jsonObject);
            }
        }
        return jsonArray.toString();
    }

    /* renamed from: a */
    public static void m100612a(List<OpenAppBadgeNode> list) {
        C27700a a = C27700a.m101232a("op_app_badge_node_push");
        a.addCategoryValue("scene", 1);
        a.addCategoryValue("badge_brief", m100615b(list));
        a.setResultTypeSuccess();
        a.setErrorMessage("");
        a.flush();
    }

    /* renamed from: b */
    public static void m100616b(List<AppBadgeSettingInfo> list, boolean z, String str) {
        C27700a a = C27700a.m101232a("op_app_badge_setting_list");
        JsonArray jsonArray = new JsonArray();
        if (list != null) {
            for (AppBadgeSettingInfo appBadgeSettingInfo : list) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("appId", appBadgeSettingInfo.getClientId());
                jsonObject.addProperty(UpdateKey.STATUS, Boolean.valueOf(appBadgeSettingInfo.getNeedShow()));
                jsonArray.add(jsonObject);
            }
        }
        a.addCategoryValue("badge_setting_brief", jsonArray.toString());
        if (z) {
            a.setResultTypeSuccess();
        } else {
            a.setResultTypeFail();
        }
        a.setErrorMessage(str);
        a.flush();
    }

    /* renamed from: a */
    public static void m100613a(List<OpenAppBadgeNode> list, boolean z, String str) {
        C27700a a = C27700a.m101232a("op_app_badge_save_node");
        a.addCategoryValue("scene", 1);
        a.addCategoryValue("badge_brief", m100615b(list));
        if (z) {
            a.setResultTypeSuccess();
        } else {
            a.setResultTypeFail();
        }
        if (str == null) {
            str = "";
        }
        a.setErrorMessage(str);
        a.flush();
    }

    /* renamed from: a */
    public static void m100614a(Map<String, Boolean> map, boolean z, String str) {
        C27700a a = C27700a.m101232a("op_app_badge_update_notice_node");
        JsonArray jsonArray = new JsonArray();
        if (map != null) {
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("appId", entry.getKey());
                jsonObject.addProperty(UpdateKey.STATUS, entry.getValue());
                jsonArray.add(jsonObject);
            }
        }
        a.addCategoryValue("badge_brief", jsonArray.toString());
        a.addCategoryValue("scene", "3");
        if (z) {
            a.setResultTypeSuccess();
        } else {
            a.setResultTypeFail();
        }
        a.setErrorMessage(str);
        a.flush();
    }

    /* renamed from: a */
    public static void m100610a(int i, List<OpenAppBadgeNode> list, boolean z, String str) {
        if (C27569b.m100618a()) {
            C27700a a = C27700a.m101232a("op_app_badge_pull_node");
            a.addCategoryValue("scene", Integer.valueOf(i));
            a.addCategoryValue("badge_brief", m100615b(list));
            if (z) {
                a.setResultTypeSuccess();
            } else {
                a.setResultTypeFail();
            }
            a.setErrorMessage(str);
            a.flush();
        }
    }

    /* renamed from: a */
    public static void m100611a(String str, List<LittleAppPermissionData> list, boolean z, String str2, String str3) {
        C27700a a = C27700a.m101232a("op_app_auth_setting");
        JsonArray jsonArray = new JsonArray();
        if (!CollectionUtils.isEmpty(list)) {
            for (LittleAppPermissionData littleAppPermissionData : list) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("scope", littleAppPermissionData.getName());
                jsonObject.addProperty(UpdateKey.STATUS, Boolean.valueOf(littleAppPermissionData.isGranted()));
                jsonArray.add(jsonObject);
            }
        }
        String jsonArray2 = jsonArray.toString();
        a.addCategoryValue("app_id", str);
        a.addCategoryValue("auth_setting_brief", jsonArray2);
        if (z) {
            a.setResultTypeSuccess();
        } else {
            a.setResultTypeFail();
        }
        a.setErrorCode(str2);
        a.setErrorMessage(str3);
        a.flush();
    }
}
