package com.ss.android.lark.inno.player.p1978c.p1979a;

import android.content.Context;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.DataLoaderListener;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.ss.ttvideoengine.utils.Error;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.inno.player.c.a.a */
public class C38951a {

    /* renamed from: a */
    private static boolean f100109a;

    /* renamed from: a */
    public static void m153689a() {
        if (!f100109a) {
            f100109a = true;
            TTVideoEngine.setStringValue(0, m153688a(C45851c.m181646a()));
            TTVideoEngine.setIntValue(1, 314572800);
            TTVideoEngine.setDataLoaderListener(new DataLoaderListener() {
                /* class com.ss.android.lark.inno.player.p1978c.p1979a.C38951a.C389521 */

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public String apiStringForFetchVideoModel(Map<String, String> map, String str, Resolution resolution) {
                    return null;
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public String authStringForFetchVideoModel(String str, Resolution resolution) {
                    return null;
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public String getCheckSumInfo(String str) {
                    return null;
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public HashMap<String, String> getCustomHttpHeaders(String str) {
                    return null;
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public boolean loadLibrary(String str) {
                    return false;
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onLoadProgress(DataLoaderHelper.DataLoaderTaskLoadProgress dataLoaderTaskLoadProgress) {
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onLogInfoToMonitor(int i, String str, JSONObject jSONObject) {
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onNotify(int i, long j, long j2, String str) {
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onNotifyCDNLog(DataLoaderCDNLog dataLoaderCDNLog) {
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onNotifyCDNLog(JSONObject jSONObject) {
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onTaskProgress(DataLoaderHelper.DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo) {
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void dataLoaderError(String str, int i, Error error) {
                    C45855f.m181666e("VcVideoEngineInit", "dataLoaderError " + str + " " + i + " " + error);
                }

                @Override // com.ss.ttvideoengine.DataLoaderListener
                public void onLogInfo(int i, String str, JSONObject jSONObject) {
                    C45855f.m181664c("VcVideoEngineInit", "onLogInfo what: " + i + " logType: " + str + " log: " + jSONObject);
                }
            });
            try {
                TTVideoEngine.startDataLoader(C45851c.m181646a());
            } catch (Exception e) {
                C45855f.m181666e("VcVideoEngineInit", "startDataLoader exception ");
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static String m153688a(Context context) {
        String str = C26308n.m95256b(context) + "/video_vc_cache/";
        C26311p.m95289i(str);
        return str;
    }
}
