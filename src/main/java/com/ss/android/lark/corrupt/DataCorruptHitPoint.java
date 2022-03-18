package com.ss.android.lark.corrupt;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/corrupt/DataCorruptHitPoint;", "", "()V", "Companion", "features_sdk-db-corrupt_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.corrupt.b */
public final class DataCorruptHitPoint {

    /* renamed from: a */
    public static final Companion f93525a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/corrupt/DataCorruptHitPoint$Companion;", "", "()V", "ACTION_CANCEL", "", "ACTION_RESTART", "KEY_ACTION", "", "recordCorrptAction", "", "value", "recordCorruptOccurred", "features_sdk-db-corrupt_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.corrupt.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo133684a() {
            Statistics.sendEvent("db_damage_info");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo133685a(int i) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", i);
                Statistics.sendEvent("db_damage_action", jSONObject);
            } catch (Throwable th) {
                Log.m165382e(th.getMessage());
            }
        }
    }
}
