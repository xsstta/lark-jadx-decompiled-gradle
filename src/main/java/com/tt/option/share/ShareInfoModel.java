package com.tt.option.share;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.actions.SearchIntents;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.MicroSchemaEntity;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareInfoModel implements Serializable {
    public AppInfoEntity appInfo;
    public String channel;
    public String desc;
    public String entryPath;
    public String extra;
    public String imageUrl;
    public boolean isExtraContainVideoPath;
    public String linkTitle;
    public String miniImageUrl;
    public int orientation;
    public String queryString;
    public String schema;
    public String shareType;
    public String templateId;
    public String title;
    public String token;
    public String ugUrl;
    public boolean withShareTicket;

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.appInfo.appId);
            jSONObject.put("appName", this.appInfo.appName);
            jSONObject.put("appIcon", this.appInfo.icon);
            jSONObject.put("appType", this.appInfo.type);
            jSONObject.put("desc", this.desc);
            jSONObject.put("extra", this.extra);
            jSONObject.put("imageUrl", this.imageUrl);
            jSONObject.put("miniImageUrl", this.miniImageUrl);
            jSONObject.put(SearchIntents.EXTRA_QUERY, this.queryString);
            jSONObject.put("schema", toSchema(this, false));
            jSONObject.put("title", this.title);
            jSONObject.put("token", this.token);
            jSONObject.put("ttid", this.appInfo.ttId);
            jSONObject.put("withShareTicket", this.withShareTicket);
            jSONObject.put("ugUrl", this.ugUrl);
            jSONObject.put("channel", this.channel);
            jSONObject.put("linkTitle", this.linkTitle);
            jSONObject.put("templateId", this.templateId);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return "ShareInfoModel{\n\nchannel='" + this.channel + '\'' + ",\n\n title='" + this.title + '\'' + ",\n\n linkTitle='" + this.linkTitle + '\'' + ",\n\n imageUrl='" + this.imageUrl + '\'' + ",\n\n queryString='" + this.queryString + '\'' + ",\n\n extra='" + this.extra + '\'' + ",\n\n isExtraContainVideoPath=" + this.isExtraContainVideoPath + ",\n\n appInfo=" + this.appInfo + ",\n\n entryPath='" + this.entryPath + '\'' + ",\n\n token='" + this.token + '\'' + ",\n\n miniImageUrl='" + this.miniImageUrl + '\'' + ",\n\n ugUrl='" + this.ugUrl + '\'' + ",\n\n schema='" + this.schema + '\'' + ",\n\n withShareTicket=" + this.withShareTicket + ",\n\n shareType='" + this.shareType + '\'' + ",\n\n desc='" + this.desc + '\'' + ",\n\n orientation=" + this.orientation + '}';
    }

    private static AbstractC67709b.AbstractC67710a getApiDependency(IAppContext iAppContext) {
        return (AbstractC67709b.AbstractC67710a) getApiService(iAppContext).mo235130i();
    }

    private static AbstractC67709b getApiService(IAppContext iAppContext) {
        return (AbstractC67709b) iAppContext.findServiceByInterface(AbstractC67709b.class);
    }

    public static ShareInfoModel parse(String str, IAppContext iAppContext) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ShareInfoModel shareInfoModel = new ShareInfoModel();
            shareInfoModel.channel = jSONObject.optString("channel");
            shareInfoModel.title = jSONObject.optString("title");
            shareInfoModel.desc = jSONObject.optString("desc");
            shareInfoModel.linkTitle = jSONObject.optString("linkTitle");
            shareInfoModel.imageUrl = jSONObject.optString("imageUrl");
            shareInfoModel.appInfo = C67432a.m262319a(iAppContext).getAppInfo();
            shareInfoModel.templateId = jSONObject.optString("templateId");
            shareInfoModel.withShareTicket = jSONObject.optBoolean("withShareTicket", false);
            String optString = jSONObject.optString(SearchIntents.EXTRA_QUERY);
            String optString2 = jSONObject.optString("path");
            if (shareInfoModel.appInfo.type != 2) {
                optString = optString2;
            }
            shareInfoModel.queryString = optString;
            JSONObject optJSONObject = jSONObject.optJSONObject("extra");
            if (optJSONObject != null) {
                String optString3 = optJSONObject.optString("videoPath");
                if (!TextUtils.isEmpty(optString3)) {
                    shareInfoModel.isExtraContainVideoPath = true;
                    String c = getApiDependency(iAppContext).mo235044c(optString3);
                    if (!TextUtils.isEmpty(c)) {
                        optJSONObject.put("videoPath", c);
                        optJSONObject.put("videoType", 0);
                    }
                }
                shareInfoModel.extra = optJSONObject.toString();
            } else {
                shareInfoModel.extra = "";
            }
            shareInfoModel.entryPath = jSONObject.optString("entryPath");
            if (shareInfoModel.title.length() == 0) {
                shareInfoModel.title = shareInfoModel.appInfo.appName;
            }
            shareInfoModel.schema = toSchema(shareInfoModel, true);
            return shareInfoModel;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ShareInfoModel", e.getStackTrace());
            return null;
        }
    }

    public static String toSchema(ShareInfoModel shareInfoModel, boolean z) {
        MicroSchemaEntity.Host host;
        HashMap hashMap = new HashMap();
        hashMap.put("name", shareInfoModel.appInfo.appName);
        hashMap.put("icon", shareInfoModel.appInfo.icon);
        MicroSchemaEntity.Builder protocol = new MicroSchemaEntity.Builder().appId(shareInfoModel.appInfo.appId).versionType(MicroSchemaEntity.VersionType.fromString(shareInfoModel.appInfo.versionType)).meta(hashMap).protocol(AppbrandContext.getInst().getInitParams().mo234501a(1008, "sslocal"));
        if (shareInfoModel.appInfo.isGame()) {
            host = MicroSchemaEntity.Host.MICROGAME;
        } else {
            host = MicroSchemaEntity.Host.MICROAPP;
        }
        MicroSchemaEntity.Builder host2 = protocol.host(host);
        if (z) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("launch_from", "publish_weitoutiao");
            host2.bdpLog(hashMap2);
        }
        if (shareInfoModel.appInfo.type != 2 || TextUtils.isEmpty(shareInfoModel.queryString)) {
            String str = shareInfoModel.queryString;
            if (!TextUtils.isEmpty(str)) {
                host2.path(Uri.decode(str));
            }
        } else {
            try {
                host2.query(CharacterUtils.getMapFromJson(Uri.decode(shareInfoModel.queryString)));
            } catch (Exception unused) {
            }
        }
        return host2.build().toSchema();
    }
}
