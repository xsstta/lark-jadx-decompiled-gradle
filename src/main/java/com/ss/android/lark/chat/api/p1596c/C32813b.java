package com.ss.android.lark.chat.api.p1596c;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.chat.api.c.b */
public class C32813b {

    /* renamed from: a */
    private static final Map<String, String> f84245a = new ConcurrentHashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.api.c.b$1 */
    public static /* synthetic */ class C328141 {

        /* renamed from: a */
        static final /* synthetic */ int[] f84246a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 145
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.api.p1596c.C32813b.C328141.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m125947a(Message.Type type) {
        switch (C328141.f84246a[type.ordinal()]) {
            case 1:
                return "text";
            case 2:
                return "post";
            case 3:
                return "image";
            case 4:
                return "media";
            case 5:
                return "file";
            case 6:
                return "sticker";
            case 7:
                return "audio";
            case 8:
                return "location";
            case 9:
                return "red_packet";
            case 10:
                return "share_group";
            case 11:
                return "merge_forward";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "share_user_card";
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static void m125949a(String str, String str2) {
        PerfLog.start("sync_create_quasi_message", str, str2);
        C29990c.m110930b().mo134577e().mo120965b(f84245a.get(str), "sync_create_quasi_message");
    }

    /* renamed from: b */
    public static void m125951b(String str, String str2) {
        PerfLog.end("sync_create_quasi_message", str, str2);
        C29990c.m110930b().mo134577e().mo120971d("sync_create_quasi_message");
    }

    /* renamed from: c */
    public static void m125952c(String str, String str2) {
        PerfLog.start("sync_create_local_message", str, str2);
        C29990c.m110930b().mo134577e().mo120965b(f84245a.get(str), "sync_create_local_message");
    }

    /* renamed from: d */
    public static void m125953d(String str, String str2) {
        PerfLog.end("sync_create_local_message", str, str2);
        C29990c.m110930b().mo134577e().mo120971d("sync_create_local_message");
    }

    /* renamed from: e */
    public static void m125954e(String str, String str2) {
        PerfLog.start("quasi_message_on_screen_single", str, str2);
        C29990c.m110930b().mo134577e().mo120965b(f84245a.get(str), "quasi_message_on_screen_single");
    }

    /* renamed from: f */
    public static void m125955f(String str, String str2) {
        PerfLog.end("quasi_message_on_screen_single", str, str2);
        C29990c.m110930b().mo134577e().mo120971d("quasi_message_on_screen_single");
    }

    /* renamed from: g */
    public static void m125956g(String str, String str2) {
        PerfLog.start("async_call_send_message", str, str2);
        C29990c.m110930b().mo134577e().mo120965b(f84245a.get(str), "async_call_send_message");
    }

    /* renamed from: h */
    public static void m125957h(String str, String str2) {
        PerfLog.end("async_call_send_message", str, str2);
        C29990c.m110930b().mo134577e().mo120971d("async_call_send_message");
    }

    /* renamed from: i */
    public static void m125958i(String str, String str2) {
        PerfLog.start("get_image_data_single", str, str2);
        C29990c.m110930b().mo134577e().mo120965b(f84245a.get(str), "get_image_data_single");
    }

    /* renamed from: j */
    public static void m125959j(String str, String str2) {
        PerfLog.end("get_image_data_single", str, str2);
        C29990c.m110930b().mo134577e().mo120971d("get_image_data_single");
    }

    /* renamed from: k */
    public static void m125960k(String str, String str2) {
        PerfLog.end("compress_media_data", str, str2);
        C29990c.m110930b().mo134577e().mo120965b(f84245a.get(str), "compress_media_data");
    }

    /* renamed from: l */
    public static void m125961l(String str, String str2) {
        PerfLog.end("compress_media_data", str, str2);
        C29990c.m110930b().mo134577e().mo120971d("compress_media_data");
    }

    /* renamed from: b */
    public static void m125950b(Message.Type type, String str, String str2) {
        String str3 = "send_" + m125947a(type);
        PerfLog.end(str3, str, str2);
        Log.m165379d("MessageSendPerf", "sendEnd:" + Thread.currentThread());
        C29990c.m110930b().mo134577e().mo120971d(str3);
    }

    /* renamed from: a */
    public static void m125948a(Message.Type type, String str, String str2) {
        String str3 = "send_" + m125947a(type);
        f84245a.put(str, str3);
        PerfLog.start(str3, str, str2);
        Log.m165379d("MessageSendPerf", "sendStart:" + Thread.currentThread());
        C29990c.m110930b().mo134577e().mo120968c(str3);
    }
}
