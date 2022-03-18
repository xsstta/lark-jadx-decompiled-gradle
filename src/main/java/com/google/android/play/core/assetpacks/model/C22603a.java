package com.google.android.play.core.assetpacks.model;

import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.model.a */
public final class C22603a {

    /* renamed from: a */
    private static final Map<Integer, String> f55953a;

    /* renamed from: b */
    private static final Map<Integer, String> f55954b;

    static {
        HashMap hashMap = new HashMap();
        f55953a = hashMap;
        HashMap hashMap2 = new HashMap();
        f55954b = hashMap2;
        hashMap.put(-1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).");
        hashMap.put(-2, "The requested pack is not available.");
        hashMap.put(-3, "The request is invalid.");
        hashMap.put(-4, "The requested download is not found.");
        hashMap.put(-5, "The Asset Delivery API is not available.");
        hashMap.put(-6, "Network error. Unable to obtain the asset pack details.");
        hashMap.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        hashMap.put(-10, "Asset pack download failed due to insufficient storage.");
        hashMap.put(-11, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        hashMap.put(-100, "Unknown error downloading an asset pack.");
        hashMap2.put(-1, "APP_UNAVAILABLE");
        hashMap2.put(-2, "PACK_UNAVAILABLE");
        hashMap2.put(-3, "INVALID_REQUEST");
        hashMap2.put(-4, "DOWNLOAD_NOT_FOUND");
        hashMap2.put(-5, "API_NOT_AVAILABLE");
        hashMap2.put(-6, "NETWORK_ERROR");
        hashMap2.put(-7, "ACCESS_DENIED");
        hashMap2.put(-10, "INSUFFICIENT_STORAGE");
        hashMap2.put(-11, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-12, "NETWORK_UNRESTRICTED");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }

    /* renamed from: a */
    public static String m82150a(int i) {
        Map<Integer, String> map = f55953a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        String str = map.get(valueOf);
        String str2 = f55954b.get(valueOf);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + SmEvents.EVENT_RE + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
