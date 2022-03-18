package com.ss.android.lark.chat.service.impl;

import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57878s;
import com.ss.android.lark.utils.compress.VideoCompressResult;
import com.ss.android.vesdk.C64034n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.chat.service.impl.v */
public class C34276v {
    /* renamed from: a */
    public static void m132951a() {
        try {
            Statistics.sendEvent("lark_android_compress_video", new JSONObject().put("compress_succ", C64034n.f161683a));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.service.impl.v$1 */
    public static /* synthetic */ class C342771 {

        /* renamed from: a */
        static final /* synthetic */ int[] f88563a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType[] r0 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chat.service.impl.C34276v.C342771.f88563a = r0
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.REUSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.chat.service.impl.C34276v.C342771.f88563a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.COPY_VE_NO_SUPPORT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.chat.service.impl.C34276v.C342771.f88563a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.COPY_SKIP_PROCESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.chat.service.impl.C34276v.C342771.f88563a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.COPY_SKIP_MUXER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.chat.service.impl.C34276v.C342771.f88563a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.MUXER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.chat.service.impl.C34276v.C342771.f88563a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.ENCODE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.service.impl.C34276v.C342771.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m132952a(float f, VideoCompressResult videoCompressResult) {
        String str;
        JSONObject jSONObject;
        String str2;
        String str3;
        if (videoCompressResult != null && videoCompressResult.mo196120a() != null) {
            String str4 = "";
            switch (C342771.f88563a[videoCompressResult.mo196120a().ordinal()]) {
                case 1:
                    str3 = VideoCompressResult.ResultType.REUSE.getValue();
                    str4 = str3;
                    str = str4;
                    break;
                case 2:
                    str3 = VideoCompressResult.ResultType.COPY_VE_NO_SUPPORT.getValue();
                    str4 = str3;
                    str = str4;
                    break;
                case 3:
                    str3 = "skip_process";
                    str4 = str3;
                    str = str4;
                    break;
                case 4:
                    str3 = "skip_muxer";
                    str4 = str3;
                    str = str4;
                    break;
                case 5:
                    str = "send_video_by_muxer";
                    break;
                case 6:
                    str = "send_video_by_encode";
                    break;
                default:
                    str3 = "default";
                    str4 = str3;
                    str = str4;
                    break;
            }
            try {
                if (!TextUtils.isEmpty(str4)) {
                    str = "send_video_by_copy";
                    jSONObject = new JSONObject();
                    jSONObject.put(ShareHitPoint.f121869d, str4);
                    jSONObject.put("file_size", (double) f);
                    str2 = jSONObject.toString();
                } else {
                    VideoCompressResult.C57816a b = videoCompressResult.mo196122b();
                    if (b == null) {
                        b = new VideoCompressResult.C57816a();
                    }
                    str2 = C57878s.m224591a(b);
                    jSONObject = new JSONObject(str2);
                }
                C53241h.m205899c("PerfCompressMediaMonitor", "serviceName: " + str + ", metric: " + str2);
                MonitorUtils.monitorEvent(str, null, jSONObject, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
