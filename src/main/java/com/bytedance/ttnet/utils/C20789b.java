package com.bytedance.ttnet.utils;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.ttnet.TTNetInit;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.ttnet.utils.b */
public class C20789b {
    /* renamed from: a */
    public static String m75731a(Context context, int i) {
        String str;
        switch (i) {
            case 1:
                str = TTNetInit.getTTNetDepend().mo69985a(context, "ssids", "");
                break;
            case 2:
                str = TTNetInit.getTTNetDepend().mo69985a(context, "dns", "");
                break;
            case 3:
                str = TTNetInit.getTTNetDepend().mo69985a(context, "https_dns", "");
                break;
            case 4:
                str = TTNetInit.getTTNetDepend().mo69985a(context, "tnc_config", "");
                break;
            case 5:
                str = TTNetInit.getTTNetDepend().mo69985a(context, "tnc_etag", "");
                break;
            case 6:
                try {
                    str = TTNetInit.getTTNetDepend().mo69985a(context, "tnc_abtest", "");
                    break;
                } catch (Exception unused) {
                }
            default:
                str = "";
                break;
        }
        if (str instanceof String) {
            return String.valueOf(str);
        }
        return "";
    }

    /* renamed from: a */
    public static void m75732a(Context context, int i, String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            switch (i) {
                case 1:
                    linkedHashMap.put("ssids", str);
                    break;
                case 2:
                    linkedHashMap.put("dns", str);
                    break;
                case 3:
                    linkedHashMap.put("https_dns", str);
                    break;
                case 4:
                    linkedHashMap.put("tnc_config", str);
                    break;
                case 5:
                    linkedHashMap.put("tnc_etag", str);
                    break;
                case 6:
                    linkedHashMap.put("tnc_abtest", str);
                    break;
            }
            if (Logger.debug()) {
                Logger.m15167d("PushService", "saveData = " + str);
            }
            TTNetInit.getTTNetDepend().mo69987a(context, linkedHashMap);
        } catch (Exception unused) {
        }
    }
}
