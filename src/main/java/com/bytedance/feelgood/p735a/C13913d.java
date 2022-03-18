package com.bytedance.feelgood.p735a;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.feelgood.a.d */
public class C13913d {

    /* renamed from: a */
    public String f36388a;

    /* renamed from: b */
    public String f36389b;

    /* renamed from: c */
    public C13914a f36390c;

    /* renamed from: com.bytedance.feelgood.a.d$a */
    public static class C13914a {

        /* renamed from: a */
        public List<String> f36391a;

        /* renamed from: b */
        public List<String> f36392b;

        /* renamed from: c */
        public HashMap<String, JSONObject> f36393c;

        /* renamed from: d */
        public boolean f36394d;

        public String toString() {
            return "Data{taskList=" + this.f36391a.toString() + "delayTaskList=" + this.f36392b.toString() + '}';
        }

        public C13914a(List<String> list, List<String> list2, HashMap<String, JSONObject> hashMap, boolean z) {
            this.f36391a = list;
            this.f36392b = list2;
            this.f36393c = hashMap;
            this.f36394d = z;
        }
    }

    public String toString() {
        return "SurveyResponse{msg='" + this.f36388a + '\'' + ", code='" + this.f36389b + '\'' + ", data=" + this.f36390c.toString() + '}';
    }

    /* renamed from: a */
    public static C13913d m56344a(String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C13913d dVar = new C13913d();
            JSONObject jSONObject = new JSONObject(str);
            dVar.f36388a = jSONObject.getString("msg");
            dVar.f36389b = jSONObject.getString("code");
            if (jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                JSONArray jSONArray = jSONObject2.getJSONArray("task_list");
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add((String) jSONArray.get(i));
                }
                JSONArray jSONArray2 = jSONObject2.getJSONArray("delay_task_list");
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add((String) jSONArray2.get(i2));
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("task_settings");
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject3.keys();
                if (!"{}".equals(jSONObject3.toString()) && keys.hasNext()) {
                    String obj = keys.next().toString();
                    hashMap.put(obj, jSONObject3.getJSONObject(obj));
                    JSONObject optJSONObject5 = jSONObject3.optJSONObject(obj);
                    if (!(optJSONObject5 == null || (optJSONObject = optJSONObject5.optJSONObject("survey_task")) == null || (optJSONObject2 = optJSONObject.optJSONObject("common_config")) == null || (optJSONObject3 = optJSONObject2.optJSONObject("appearance")) == null || (optJSONObject4 = optJSONObject3.optJSONObject("mobile")) == null)) {
                        z = optJSONObject4.optBoolean("native_global_dialog");
                    }
                }
                dVar.f36390c = new C13914a(arrayList, arrayList2, hashMap, z);
            }
            return dVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
