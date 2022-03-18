package com.appsflyer.share;

import android.content.Context;
import android.os.AsyncTask;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.internal.C2008ae;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class CrossPromotionHelper {

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.share.CrossPromotionHelper$e */
    public static class AsyncTaskC2047e extends AsyncTask<String, Void, Void> {

        /* renamed from: ı */
        private C2008ae f7011;

        /* renamed from: Ι */
        private boolean f7012;

        /* renamed from: ι */
        private WeakReference<Context> f7013;

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
            if (r2 != null) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
            return null;
         */
        /* renamed from: ι */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.String... r6) {
            /*
            // Method dump skipped, instructions count: 184
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.CrossPromotionHelper.AsyncTaskC2047e.doInBackground(java.lang.String[]):java.lang.Void");
        }

        AsyncTaskC2047e(C2008ae aeVar, Context context, boolean z) {
            this.f7011 = aeVar;
            this.f7013 = new WeakReference<>(context);
            this.f7012 = z;
        }
    }

    public static void trackAndOpenStore(Context context, String str, String str2) {
        trackAndOpenStore(context, str, str2, null);
    }

    public static void trackCrossPromoteImpression(Context context, String str, String str2) {
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
            return;
        }
        LinkGenerator r4 = m8945(context, str, str2, null, ServerConfigHandler.getUrl("https://%simpression.%s"));
        new AsyncTaskC2047e(null, null, AppsFlyerLib.getInstance().isTrackingStopped()).execute(r4.generateLink());
    }

    public static void trackAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator r4 = m8945(context, str, str2, map, ServerConfigHandler.getUrl("https://%sapp.%s"));
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("af_campaign", str2);
        AppsFlyerLib.getInstance().trackEvent(context, "af_cross_promotion", hashMap);
        new AsyncTaskC2047e(new C2008ae(), context, AppsFlyerLib.getInstance().isTrackingStopped()).execute(r4.generateLink());
    }

    /* renamed from: ǃ */
    private static LinkGenerator m8945(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.f7014 = str3;
        linkGenerator.f7018 = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }
}
