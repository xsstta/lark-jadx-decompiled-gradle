package com.ss.android.appcenter.business.net.dto;

import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode;
import com.ss.android.appcenter.common.util.C28184h;
import java.io.Serializable;

public class AppBadgeNode implements Serializable {
    public int appAbility;
    public int badgeNum;
    public String clientId;
    public int clientType;
    public String extra;
    public long id;
    public boolean needShow;
    public long updateTime;
    public long version;

    public OpenAppBadgeNode toRawAppBadgeNode() {
        try {
            OpenAppBadgeNode.C18679a aVar = new OpenAppBadgeNode.C18679a();
            aVar.mo64290a(this.id + "");
            aVar.mo64292b(this.clientId);
            aVar.mo64287a(CommonEnum.OpenAppFeatureType.fromValue(this.appAbility));
            aVar.mo64288a(Boolean.valueOf(this.needShow));
            aVar.mo64289a(Integer.valueOf(this.badgeNum));
            aVar.mo64293c(this.extra);
            aVar.mo64294d(this.version + "");
            return aVar.build();
        } catch (Exception e) {
            C28184h.m103248b("AppBadgeNode", "build raw node failed" + e.toString());
            return null;
        }
    }

    private static long parseNodeVersion(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private static long parseId(String str) {
        if (str == null || "".equals(str)) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static AppBadgeNode fromRawAppBadgeNode(OpenAppBadgeNode openAppBadgeNode) {
        if (openAppBadgeNode == null) {
            return null;
        }
        AppBadgeNode appBadgeNode = new AppBadgeNode();
        appBadgeNode.clientId = openAppBadgeNode.app_id;
        appBadgeNode.appAbility = openAppBadgeNode.feature.getValue();
        appBadgeNode.needShow = openAppBadgeNode.need_show.booleanValue();
        appBadgeNode.badgeNum = openAppBadgeNode.badge_num.intValue();
        appBadgeNode.extra = openAppBadgeNode.extra;
        appBadgeNode.id = parseId(openAppBadgeNode.id);
        appBadgeNode.version = parseNodeVersion(openAppBadgeNode.version);
        return appBadgeNode;
    }
}
