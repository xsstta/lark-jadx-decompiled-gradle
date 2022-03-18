package com.ss.android.lark.statistics.perf;

import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.statistics.BasePerfMonitor;
import org.json.JSONException;
import org.json.JSONObject;

public class PerfCreateGroupMonitor extends BasePerfMonitor {

    /* renamed from: a */
    private static C54983a f135897a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.statistics.perf.PerfCreateGroupMonitor$a */
    public static class C54983a extends BasePerfMonitor.AbstractC57880b {

        /* renamed from: a */
        private CreateGroupWay f135898a;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return "create_group_time";
        }

        C54983a() {
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        public boolean aG_() {
            if (!super.aG_() || this.f142500m >= 10000 || this.f135898a == null) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public void mo187694a(CreateGroupWay createGroupWay) {
            this.f135898a = createGroupWay;
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: a */
        public void mo142423a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            super.mo142423a(jSONObject, jSONObject2, jSONObject3);
            try {
                jSONObject.put("way", this.f135898a.value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m213515a() {
        C54983a aVar = f135897a;
        if (aVar != null) {
            if (aVar.aG_()) {
                m224592a(f135897a);
                m224593b(f135897a);
                f135897a = null;
            }
            Log.m165379d("PerfCreateGroupMonitor", "end CreateGroupData");
        }
    }

    public enum CreateGroupWay {
        NEW_GROUP("new_group"),
        SINGLE_CHAT("single_chat_to_group"),
        EXTERNAL_GROUP("create_external_group"),
        UNKNOWN("Unknown");
        
        final String value;

        public static CreateGroupWay fromValue(String str) {
            CreateGroupWay[] values = values();
            for (CreateGroupWay createGroupWay : values) {
                if (TextUtils.equals(createGroupWay.value, str)) {
                    return createGroupWay;
                }
            }
            return UNKNOWN;
        }

        private CreateGroupWay(String str) {
            this.value = str;
        }
    }

    /* renamed from: a */
    public static void m213516a(String str) {
        if (f135897a == null) {
            f135897a = new C54983a();
        }
        f135897a.mo187694a(CreateGroupWay.fromValue(str));
        f135897a.aF_();
        Log.m165379d("PerfCreateGroupMonitor", "start CreateGroupData");
    }
}
