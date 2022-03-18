package com.appsflyer;

import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

public abstract class OneLinkHttpTask implements Runnable {

    /* renamed from: ı */
    public String f6841;

    public void setConnProvider(HttpsUrlConnectionProvider httpsUrlConnectionProvider) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ */
    public abstract String mo10032();

    /* access modifiers changed from: protected */
    /* renamed from: ɩ */
    public abstract void mo10033(String str);

    /* access modifiers changed from: protected */
    /* renamed from: Ι */
    public abstract void mo10034(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    /* access modifiers changed from: protected */
    /* renamed from: ι */
    public abstract void mo10035();

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.OneLinkHttpTask.run():void");
    }

    public static class HttpsUrlConnectionProvider {
        /* renamed from: ɩ */
        static HttpsURLConnection m8845(String str) throws IOException {
            return (HttpsURLConnection) new URL(str).openConnection();
        }
    }
}
