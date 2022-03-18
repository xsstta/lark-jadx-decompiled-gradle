package com.ss.android.lark.passport.kar.refresh;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.http.p1952a.AbstractC38759a;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49149ad;
import com.ss.android.lark.passport.infra.util.C49185d;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.kar.model.KaConfig;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseLoginHttpRequest;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KaTokenRefreshRequest extends BaseLoginHttpRequest<KaTokenRefreshResponse> {
    private static final PassportLog log = PassportLog.f123351c.mo171474a();
    private static String sRefreshUrl;
    private static C49149ad sTimePrinter;
    private final String mIdpType;

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getPath() {
        return "/ssdp/app/rs/";
    }

    private static class KaTokenRefreshRequestBody implements Serializable {
        @JSONField(name = "API_ATTRS")
        public ApiAttrsEntity apiAttrs;
        @JSONField(name = "REQUEST_DATA")
        public RequestDataEntity requestData;

        public static class ApiAttrsEntity implements Serializable {
            @JSONField(name = "Api_ID")
            public String apiId;
            @JSONField(name = "Api_Version")
            public String apiVersion;
            @JSONField(name = "App_ID")
            public String appId;
            @JSONField(name = "App_Sub_ID")
            public String appSubId;
            @JSONField(name = "App_Token")
            public String appToken;
            @JSONField(name = "App_Version")
            public String appVersion;
            @JSONField(name = "Divice_ID")
            public String diviceId;
            @JSONField(name = "Divice_Version")
            public String diviceVersion;
            @JSONField(name = "OS_Version")
            public String osVersion;
            @JSONField(name = "Partner_ID")
            public String partnerId;
            @JSONField(name = "Sign")
            public String sign;
            @JSONField(name = "Time_Stamp")
            public String timestamp;
            @JSONField(name = "User_Token")
            public String userToken;
        }

        public static class RequestDataEntity implements Serializable {
            @JSONField(name = "Refresh_key")
            public String refreshKey;
            @JSONField(name = "Remarks")
            public String remarks = "";
            @JSONField(name = "Scope")
            public String scope = "";
        }

        private KaTokenRefreshRequestBody() {
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest, com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC38759a<V2ResponseModel<KaTokenRefreshResponse>> getObjectConverter() {
        return new C49322a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.BaseRequest
    public String getBaseUrl() {
        if (TextUtils.equals(this.mIdpType, "crc_test")) {
            return "https://ssdpuat.crc.com.cn:8443";
        }
        return "https://ssdp.crc.com.cn";
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest, com.ss.lark.android.passport.biz.compat.v2.http.base.BaseRequest
    public String getUrl() {
        if (!TextUtils.isEmpty(sRefreshUrl)) {
            return sRefreshUrl;
        }
        log.mo171465b("KaTokenRefreshRequest", "getUrl：sRefreshUrl is empty");
        return super.getUrl();
    }

    public static void setRefreshUrl(String str) {
        PassportLog passportLog = log;
        passportLog.mo171465b("KaTokenRefreshRequest", "setRefreshUrl=" + str);
        sRefreshUrl = str;
    }

    static /* synthetic */ int lambda$getSign$0(String str, String str2) {
        if (str != null) {
            return str.compareTo(str2);
        }
        return -1;
    }

    public String getSign(KaTokenRefreshRequestBody.ApiAttrsEntity apiAttrsEntity, KaTokenRefreshRequestBody.RequestDataEntity requestDataEntity, String str) {
        Map map;
        if (apiAttrsEntity == null) {
            log.mo171471d("KaTokenRefreshRequest", "getSign apiAttrs is null");
        }
        TreeMap treeMap = new TreeMap($$Lambda$KaTokenRefreshRequest$PmIGodXeW2TOeuG3MRKxzbd6gU.INSTANCE);
        Object json = JSON.toJSON(apiAttrsEntity);
        if (json instanceof Map) {
            map = (Map) json;
        } else {
            map = new HashMap();
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        treeMap.put("REQUEST_DATA", C38760a.m153057a(requestDataEntity));
        StringBuilder sb = new StringBuilder((int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
        for (Map.Entry entry2 : treeMap.entrySet()) {
            sb.append((String) entry2.getKey());
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(entry2.getValue());
            sb.append(ContainerUtils.FIELD_DELIMITER);
        }
        sb.append(str);
        return C49160a.m193854a(sb.toString()).toUpperCase();
    }

    public KaTokenRefreshRequest(String str, KaConfig kaConfig, String str2, String str3, String str4, String str5) {
        if (sTimePrinter == null) {
            sTimePrinter = new C49149ad("yyyy-MM-dd HH:mm:ss:SSSZ", false);
        }
        this.mIdpType = str;
        KaTokenRefreshRequestBody kaTokenRefreshRequestBody = new KaTokenRefreshRequestBody();
        kaTokenRefreshRequestBody.requestData = new KaTokenRefreshRequestBody.RequestDataEntity();
        kaTokenRefreshRequestBody.requestData.refreshKey = str3;
        kaTokenRefreshRequestBody.apiAttrs = new KaTokenRefreshRequestBody.ApiAttrsEntity();
        kaTokenRefreshRequestBody.apiAttrs.diviceId = str5;
        kaTokenRefreshRequestBody.apiAttrs.diviceVersion = C49185d.m193925a();
        kaTokenRefreshRequestBody.apiAttrs.osVersion = C49185d.m193927b();
        kaTokenRefreshRequestBody.apiAttrs.timestamp = sTimePrinter.mo171630a();
        kaTokenRefreshRequestBody.apiAttrs.userToken = str4;
        kaTokenRefreshRequestBody.apiAttrs.appVersion = str2;
        if (kaConfig != null) {
            if (kaConfig.ext != null) {
                kaTokenRefreshRequestBody.apiAttrs.apiVersion = KaConfig.getValueForKey(kaConfig.ext, "Api_Version");
                kaTokenRefreshRequestBody.apiAttrs.appSubId = KaConfig.getValueForKey(kaConfig.ext, "App_Sub_ID");
                kaTokenRefreshRequestBody.apiAttrs.appToken = KaConfig.getValueForKey(kaConfig.ext, "App_Token");
                kaTokenRefreshRequestBody.apiAttrs.partnerId = KaConfig.getValueForKey(kaConfig.ext, "Partner_ID");
            } else {
                log.mo171471d("KaTokenRefreshRequest", "config.ext null makes requestbody some apiAttrs missing");
            }
            if (kaConfig.client != null) {
                kaTokenRefreshRequestBody.apiAttrs.apiId = kaConfig.client.refreshApiId;
                kaTokenRefreshRequestBody.apiAttrs.appId = kaConfig.client.refreshAppId;
            } else {
                log.mo171471d("KaTokenRefreshRequest", "config.client null makes requestbody some apiAttrs missing");
            }
            kaTokenRefreshRequestBody.apiAttrs.sign = getSign(kaTokenRefreshRequestBody.apiAttrs, kaTokenRefreshRequestBody.requestData, KaConfig.getValueForKey(kaConfig.ext, "App_key"));
        } else {
            log.mo171471d("KaTokenRefreshRequest", "config null makes requestbody apiAttrs missing");
        }
        mRequestBody.put("REQUEST", kaTokenRefreshRequestBody);
        if (kaConfig == null || kaConfig.ext == null || kaConfig.client == null) {
            log.mo171471d("KaTokenRefreshRequest", "config null or ext null makes ssdp missing");
            return;
        }
        String str6 = kaConfig.client.refreshApiId;
        String valueForKey = KaConfig.getValueForKey(kaConfig.ext, "App_Sub_ID");
        String valueForKey2 = KaConfig.getValueForKey(kaConfig.ext, "Api_Version");
        this.mQueryParams.put("ssdp", C49160a.m193856a(("Api_ID=" + str6 + "&App_Sub_ID=" + valueForKey + "&Api_Version=" + valueForKey2).getBytes()));
    }
}
