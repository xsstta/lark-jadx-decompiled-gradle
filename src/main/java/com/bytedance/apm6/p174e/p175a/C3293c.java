package com.bytedance.apm6.p174e.p175a;

import com.bytedance.apm.util.C3131o;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p167c.C3212a;
import com.bytedance.apm6.p167c.p168a.AbstractC3215b;
import com.bytedance.apm6.p167c.p168a.C3214a;
import com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b;
import com.bytedance.apm6.p174e.p175a.p176a.C3286a;
import com.bytedance.apm6.util.p195b.C3350b;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.e.a.c */
public class C3293c implements AbstractC3215b {

    /* renamed from: a */
    private C3214a f10511a;

    @Override // com.bytedance.apm6.p167c.p168a.AbstractC3215b
    /* renamed from: a */
    public C3214a mo13322a() {
        return this.f10511a;
    }

    public C3293c() {
        C3286a.m13719a().mo13501b();
        C3286a.m13719a().mo13499a(new AbstractC3290b() {
            /* class com.bytedance.apm6.p174e.p175a.C3293c.C32941 */

            @Override // com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b
            /* renamed from: a */
            public void mo13498a(JSONObject jSONObject, boolean z) {
                C3293c.this.mo13508a(jSONObject, z);
            }
        });
    }

    /* renamed from: a */
    public void mo13508a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("disk")) != null) {
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Disk", "parseConfig:" + optJSONObject);
            }
            C3214a aVar = new C3214a();
            boolean z2 = false;
            aVar.mo13301a(optJSONObject.optBoolean("enable_collect_apm6", false));
            if (optJSONObject.optInt("enable_upload", 0) == 1) {
                z2 = true;
            }
            aVar.mo13306b(z2);
            if (optJSONObject.optInt("dump_threshold") > 0) {
                aVar.mo13299a(((long) optJSONObject.optInt("dump_threshold")) * 1024 * 1024);
            }
            if (optJSONObject.optInt("abnormal_folder_size") > 0) {
                aVar.mo13304b(((long) optJSONObject.optInt("abnormal_folder_size")) * 1024 * 1024);
            }
            aVar.mo13310c(((long) optJSONObject.optInt("abnormal_file_size", 100)) * 1024);
            if (optJSONObject.optInt("dump_top_count") > 0) {
                aVar.mo13298a(optJSONObject.optInt("dump_top_count"));
            }
            aVar.mo13303b(optJSONObject.optInt("dump_outdated_count", 50));
            aVar.mo13309c(optJSONObject.optInt("dump_top_file_count", 20));
            aVar.mo13312d(optJSONObject.optInt("dump_exception_dir_count", 50));
            if (optJSONObject.optInt("outdated_days") > 0) {
                aVar.mo13313d(((long) optJSONObject.optInt("outdated_days")) * 86400000);
            }
            aVar.mo13300a(C3131o.m13023c(optJSONObject, "disk_customed_paths"));
            aVar.mo13305b(C3131o.m13022b(optJSONObject, "ignored_relative_paths"));
            this.f10511a = aVar;
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Disk", "parseConfig:" + optJSONObject);
            }
            C3212a.m13412a().mo13295a(mo13322a());
        }
    }
}
