package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class LinkGenerator {

    /* renamed from: ı */
    String f7014;

    /* renamed from: Ɩ */
    private String f7015;

    /* renamed from: ǃ */
    private String f7016;

    /* renamed from: ȷ */
    private String f7017;

    /* renamed from: ɩ */
    String f7018;

    /* renamed from: ɪ */
    private String f7019;

    /* renamed from: ɹ */
    private String f7020;

    /* renamed from: ɾ */
    private Map<String, String> f7021 = new HashMap();

    /* renamed from: Ι */
    private String f7022;

    /* renamed from: ι */
    private String f7023;

    /* renamed from: І */
    private String f7024;

    /* renamed from: і */
    private String f7025;

    /* renamed from: Ӏ */
    private String f7026;

    /* renamed from: ӏ */
    private Map<String, String> f7027 = new HashMap();

    public String getBrandDomain() {
        return this.f7017;
    }

    public String getCampaign() {
        return this.f7023;
    }

    public String getChannel() {
        return this.f7016;
    }

    public String getMediaSource() {
        return this.f7022;
    }

    public Map<String, String> getParameters() {
        return this.f7021;
    }

    public String generateLink() {
        return m8948().toString();
    }

    /* renamed from: ι */
    private StringBuilder m8948() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.f7014;
        if (str2 == null || !str2.startsWith("http")) {
            sb.append(ServerConfigHandler.getUrl("https://%sapp.%s"));
        } else {
            sb.append(this.f7014);
        }
        if (this.f7018 != null) {
            sb.append('/');
            sb.append(this.f7018);
        }
        this.f7027.put("pid", this.f7022);
        sb.append('?');
        sb.append("pid=");
        sb.append(m8947(this.f7022, "media source"));
        String str3 = this.f7025;
        if (str3 != null) {
            this.f7027.put("af_referrer_uid", str3);
            sb.append('&');
            sb.append("af_referrer_uid=");
            sb.append(m8947(this.f7025, "referrerUID"));
        }
        String str4 = this.f7016;
        if (str4 != null) {
            this.f7027.put("af_channel", str4);
            sb.append('&');
            sb.append("af_channel=");
            sb.append(m8947(this.f7016, "channel"));
        }
        String str5 = this.f7015;
        if (str5 != null) {
            this.f7027.put("af_referrer_customer_id", str5);
            sb.append('&');
            sb.append("af_referrer_customer_id=");
            sb.append(m8947(this.f7015, "referrerCustomerId"));
        }
        String str6 = this.f7023;
        if (str6 != null) {
            this.f7027.put(C60375c.f150914a, str6);
            sb.append('&');
            sb.append("c=");
            sb.append(m8947(this.f7023, "campaign"));
        }
        String str7 = this.f7024;
        if (str7 != null) {
            this.f7027.put("af_referrer_name", str7);
            sb.append('&');
            sb.append("af_referrer_name=");
            sb.append(m8947(this.f7024, "referrerName"));
        }
        String str8 = this.f7026;
        if (str8 != null) {
            this.f7027.put("af_referrer_image_url", str8);
            sb.append('&');
            sb.append("af_referrer_image_url=");
            sb.append(m8947(this.f7026, "referrerImageURL"));
        }
        if (this.f7019 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f7019);
            String str9 = "";
            if (this.f7019.endsWith("/")) {
                str = str9;
            } else {
                str = "/";
            }
            sb2.append(str);
            String str10 = this.f7020;
            if (str10 != null) {
                sb2.append(str10);
            }
            this.f7027.put("af_dp", sb2.toString());
            sb.append('&');
            sb.append("af_dp=");
            sb.append(m8947(this.f7019, "baseDeeplink"));
            if (this.f7020 != null) {
                if (!this.f7019.endsWith("/")) {
                    str9 = "%2F";
                }
                sb.append(str9);
                sb.append(m8947(this.f7020, "deeplinkPath"));
            }
        }
        for (String str11 : this.f7021.keySet()) {
            String obj = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str11);
            sb3.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb3.append(m8947(this.f7021.get(str11), str11));
            if (!obj.contains(sb3.toString())) {
                sb.append('&');
                sb.append(str11);
                sb.append('=');
                sb.append(m8947(this.f7021.get(str11), str11));
            }
        }
        return sb;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.f7019 = str;
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.f7017 = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.f7023 = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.f7016 = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f7020 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.f7015 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.f7026 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.f7024 = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.f7025 = str;
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.f7021.putAll(map);
        }
        return this;
    }

    public LinkGenerator(String str) {
        this.f7022 = str;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.f7021.put(str, str2);
        return this;
    }

    /* renamed from: ǃ */
    private static String m8947(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException unused) {
            StringBuilder sb = new StringBuilder("Illegal ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            AFLogger.afInfoLog(sb.toString());
            return "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        if (!this.f7021.isEmpty()) {
            for (Map.Entry<String, String> entry : this.f7021.entrySet()) {
                this.f7027.put(entry.getKey(), entry.getValue());
            }
        }
        m8948();
        String str = this.f7017;
        Map<String, String> map = this.f7027;
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, AppsFlyerLibCore.getInstance(), context, AppsFlyerLib.getInstance().isTrackingStopped());
        createOneLinkHttpTask.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
        createOneLinkHttpTask.setListener(responseListener);
        createOneLinkHttpTask.setBrandDomain(str);
        AFExecutor.getInstance().getThreadPoolExecutor().execute(createOneLinkHttpTask);
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.f7014 = String.format("https://%s/%s", ServerConfigHandler.getUrl("%sapp.%s"), str3);
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.f7014 = String.format("https://%s/%s", str2, str);
        }
        return this;
    }
}
