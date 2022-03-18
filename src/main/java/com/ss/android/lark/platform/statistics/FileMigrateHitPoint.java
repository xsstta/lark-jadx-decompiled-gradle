package com.ss.android.lark.platform.statistics;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\r*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/platform/statistics/FileMigrateHitPoint;", "", "()V", "DISABLED", "", "ENABLED", "PARAM_ABILITY", "", "PARAM_COUNT", "PARAM_DISTRIBUTION", "PARAM_SPACE", "PARAM_SPEED", "reportFileMigrateAbility", "", "enabled", "speed", "", "count", "space", "distribution", "(ILjava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)V", "putIfValid", "Lorg/json/JSONObject;", "key", "value", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.statistics.c */
public final class FileMigrateHitPoint {

    /* renamed from: a */
    public static final FileMigrateHitPoint f129087a = new FileMigrateHitPoint();

    private FileMigrateHitPoint() {
    }

    /* renamed from: a */
    private final void m201653a(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: a */
    public final void mo178192a(int i, Float f, Integer num, Float f2, String str) {
        JSONObject jSONObject = new JSONObject();
        FileMigrateHitPoint cVar = f129087a;
        cVar.m201653a(jSONObject, "ability", Integer.valueOf(i));
        cVar.m201653a(jSONObject, "speed", f);
        cVar.m201653a(jSONObject, "count", num);
        cVar.m201653a(jSONObject, "space", f2);
        cVar.m201653a(jSONObject, "distribution", str);
        Statistics.sendEvent("target_api_30_file_migrate_dev", jSONObject);
    }
}
