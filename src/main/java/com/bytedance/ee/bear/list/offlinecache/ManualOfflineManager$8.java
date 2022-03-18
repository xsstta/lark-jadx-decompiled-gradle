package com.bytedance.ee.bear.list.offlinecache;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class ManualOfflineManager$8 extends BinderISendDataCallback.Stub {
    final /* synthetic */ C8640a this$0;

    ManualOfflineManager$8(C8640a aVar) {
        this.this$0 = aVar;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5098d
    public void onReceiveData(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("action");
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject == null) {
                C13479a.m54764b("OfflineCacheManager", "dataObj is null");
                return;
            }
            String str2 = null;
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("extra");
            if (optJSONObject2 != null) {
                str2 = optJSONObject2.optString(ShareHitPoint.f121869d);
            }
            C13479a.m54764b("OfflineCacheManager", "onReceiveData()...action = " + optString + ", offlineType = " + str2);
            int i = 0;
            if (TextUtils.equals("offWatchResult", optString) && this.this$0.mo33624b(str2)) {
                JSONArray optJSONArray = optJSONObject.optJSONArray("tokens");
                if (optJSONArray != null) {
                    while (i < optJSONArray.length()) {
                        if (((JSONObject) optJSONArray.get(i)).optInt("succ") == 1) {
                            int optInt = ((JSONObject) optJSONArray.get(i)).optInt(ShareHitPoint.f121869d);
                            String optString2 = ((JSONObject) optJSONArray.get(i)).optString("token");
                            this.this$0.mo33623b(new OfflineDoc(optString2, optInt));
                            C13479a.m54764b("OfflineCacheManager", "registerSendDataCallback onReceiveData offWatchResult succ token: " + C13598b.m55197d(optString2) + "   type: " + optInt);
                        }
                        i++;
                    }
                }
            } else if (TextUtils.equals("offUnwatchResult", optString) && this.this$0.mo33624b(str2)) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("tokens");
                if (optJSONArray2 != null) {
                    while (i < optJSONArray2.length()) {
                        if (((JSONObject) optJSONArray2.get(i)).optInt("succ") == 1) {
                            int optInt2 = ((JSONObject) optJSONArray2.get(i)).optInt(ShareHitPoint.f121869d);
                            String optString3 = ((JSONObject) optJSONArray2.get(i)).optString("token");
                            this.this$0.mo33626c(new OfflineDoc(optString3, optInt2));
                            C13479a.m54764b("OfflineCacheManager", "registerSendDataCallback onReceiveData offUnwatchResult succ token: " + C13598b.m55197d(optString3) + "   type: " + optInt2);
                        }
                        i++;
                    }
                }
            } else if (TextUtils.equals("offWatchEntityDeleted", optString)) {
                this.this$0.mo33619a(optJSONObject.optJSONArray("tokens"));
                C13479a.m54764b("OfflineCacheManager", "registerSendDataCallback onReceiveData offWatchEntityDeleted");
            }
            this.this$0.mo33609a(30000);
        } catch (Exception e) {
            C13479a.m54759a("OfflineCacheManager", "onReceiveData", e);
        }
    }
}
