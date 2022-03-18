package com.ss.android.lark.image.impl;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.vesdk.C64034n;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.image.impl.d */
public class C38882d {
    /* renamed from: a */
    public static void m153450a() {
        try {
            Statistics.sendEvent("lark_android_compress_pic", new JSONObject().put("compress_succ", C64034n.f161683a));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m153452a(Map<String, Float> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("compress_succ", "y");
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Statistics.sendEvent("lark_android_compress_pic", jSONObject);
    }

    /* renamed from: a */
    public static void m153451a(final long j, final String str, final String str2) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.image.impl.C38882d.RunnableC388831 */

            public void run() {
                File file = new File(str);
                File file2 = new File(str2);
                if (file.exists() && file2.exists()) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    HashMap hashMap3 = new HashMap();
                    hashMap.put("compress_cost", Float.valueOf((float) j));
                    hashMap2.put("format", ImageUtils.m224131a(file).getValue());
                    int[] b = C57820d.m224436b(str);
                    hashMap.put("input_size_bytes", Float.valueOf((float) file.length()));
                    hashMap.put("input_width", Float.valueOf((float) b[0]));
                    hashMap.put("input_height", Float.valueOf((float) b[1]));
                    int[] b2 = C57820d.m224436b(str2);
                    hashMap.put("output_size_bytes", Float.valueOf((float) file2.length()));
                    hashMap.put("output_width", Float.valueOf((float) b2[0]));
                    hashMap.put("output_height", Float.valueOf((float) b2[1]));
                    C53241h.m205899c("PerfCompressPicMonitor", "compress time:" + j + ", origin size is:" + file.length() + ", target size is:" + file2.length());
                    C38882d.m153452a(hashMap);
                    C38792a.m153106a().mo142259a("ee.lark.android.pic.compress", hashMap, hashMap2, hashMap3, false);
                }
            }
        });
    }
}
