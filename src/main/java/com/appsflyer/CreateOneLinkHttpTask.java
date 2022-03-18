package com.appsflyer;

import android.content.Context;
import com.appsflyer.share.LinkGenerator;
import com.google.firebase.messaging.Constants;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateOneLinkHttpTask extends OneLinkHttpTask {

    /* renamed from: ǃ */
    private Map<String, String> f6828;

    /* renamed from: ɩ */
    private String f6829;

    /* renamed from: ɹ */
    private boolean f6830;

    /* renamed from: Ι */
    private String f6831 = "";

    /* renamed from: ι */
    private ResponseListener f6832;

    /* renamed from: І */
    private String f6833;

    /* renamed from: і */
    private Context f6834;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    /* access modifiers changed from: package-private */
    @Override // com.appsflyer.OneLinkHttpTask
    /* renamed from: ǃ */
    public final String mo10032() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1"));
        sb.append("/");
        sb.append(this.f6841);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Override // com.appsflyer.OneLinkHttpTask
    /* renamed from: ι */
    public final void mo10035() {
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.f6841, AppsFlyerProperties.getInstance().getString("onelinkDomain"), this.f6831).addParameter("af_siteid", this.f6831).addParameters(this.f6828);
        String string = AppsFlyerProperties.getInstance().getString("AppUserId");
        if (string != null) {
            addParameters.setReferrerCustomerId(string);
        }
        this.f6832.onResponse(addParameters.generateLink());
    }

    public void setBrandDomain(String str) {
        this.f6833 = str;
    }

    public void setListener(ResponseListener responseListener) {
        this.f6832 = responseListener;
    }

    /* access modifiers changed from: package-private */
    @Override // com.appsflyer.OneLinkHttpTask
    /* renamed from: ɩ */
    public final void mo10033(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.f6832.onResponse(jSONObject.optString(keys.next()));
            }
        } catch (JSONException e) {
            this.f6832.onResponseError("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.appsflyer.OneLinkHttpTask
    /* renamed from: Ι */
    public final void mo10034(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        if (!this.f6830) {
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setUseCaches(false);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject(this.f6828);
            jSONObject.put("ttl", this.f6829);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            String str = this.f6833;
            if (str != null) {
                jSONObject.put("brand_domain", str);
            }
            httpsURLConnection.connect();
            DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
            dataOutputStream.writeBytes(jSONObject.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
        }
    }

    public CreateOneLinkHttpTask(String str, Map<String, String> map, AppsFlyerLibCore appsFlyerLibCore, Context context, boolean z) {
        this.f6830 = z;
        this.f6834 = context;
        if (context != null) {
            this.f6831 = context.getPackageName();
        } else {
            AFLogger.afWarnLog("CreateOneLinkHttpTask: context can't be null");
        }
        this.f6841 = str;
        this.f6829 = "-1";
        this.f6828 = map;
    }
}
