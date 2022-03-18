package com.appsflyer.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFDeepLinkManager;
import com.appsflyer.AFLogger;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.aa */
public final class C2002aa extends OneLinkHttpTask {

    /* renamed from: ι */
    private static List<String> f6847 = Arrays.asList("onelink.me", "onelnk.com", "app.aflink.com");

    /* renamed from: ǃ */
    private String f6848;

    /* renamed from: ɩ */
    public AbstractC2003a f6849;

    /* renamed from: Ι */
    private String f6850;

    /* renamed from: com.appsflyer.internal.aa$a */
    public interface AbstractC2003a {
        /* renamed from: ı */
        void mo9994(String str);

        /* renamed from: ɩ */
        void mo9995(Map<String, String> map);
    }

    @Override // com.appsflyer.OneLinkHttpTask
    /* renamed from: ι */
    public final void mo10035() {
        String str = this.f6848;
        if (str == null) {
            str = "Can't get one link data";
        }
        this.f6849.mo9994(str);
    }

    /* renamed from: ı */
    public final boolean mo10055() {
        if (TextUtils.isEmpty(this.f6841) || TextUtils.isEmpty(this.f6850) || this.f6841.equals("app")) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.OneLinkHttpTask
    /* renamed from: ǃ */
    public final String mo10032() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1"));
        sb.append("/");
        sb.append(this.f6841);
        sb.append("?id=");
        sb.append(this.f6850);
        return sb.toString();
    }

    @Override // com.appsflyer.OneLinkHttpTask
    /* renamed from: Ι */
    public final void mo10034(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod("GET");
    }

    @Override // com.appsflyer.OneLinkHttpTask
    /* renamed from: ɩ */
    public final void mo10033(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.f6849.mo9995(hashMap);
        } catch (JSONException e) {
            this.f6849.mo9994("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    public C2002aa(Uri uri) {
        if (!(TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(uri.getPath()))) {
            boolean z = false;
            for (String str : f6847) {
                if (uri.getHost().contains(str)) {
                    z = true;
                }
            }
            if (AFDeepLinkManager.f6690 != null) {
                StringBuilder sb = new StringBuilder("Validate custom domain URLs: ");
                sb.append(Arrays.asList(AFDeepLinkManager.f6690));
                AFLogger.afRDLog(sb.toString());
                String[] strArr = AFDeepLinkManager.f6690;
                for (String str2 : strArr) {
                    if (uri.getHost().contains(str2) && str2 != "") {
                        StringBuilder sb2 = new StringBuilder("DeepLink matches customDomain: ");
                        sb2.append(uri.toString());
                        AFLogger.afDebugLog(sb2.toString());
                        z = true;
                    }
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.f6841 = split[1];
                this.f6850 = split[2];
                this.f6848 = uri.toString();
            }
        }
    }
}
