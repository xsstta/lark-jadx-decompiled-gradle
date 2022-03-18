package com.ss.android.lark.mine.impl.status.statistics;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mine/impl/status/statistics/ProfileHitPointV3;", "", "()V", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.status.b.b */
public final class ProfileHitPointV3 {

    /* renamed from: a */
    public static final Companion f115593a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m181507a() {
        f115593a.mo161045a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m181508a(int i) {
        f115593a.mo161046a(i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m181509a(boolean z) {
        f115593a.mo161047a(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mine/impl/status/statistics/ProfileHitPointV3$Companion;", "", "()V", "sendSignatureRecordClick", "", "sendSignatureSaveClick", "signatureLength", "", "sendSignatureSettingView", "hasHistoricalRecord", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.status.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo161045a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "historical_signature_record");
            jSONObject.put("target", "none");
            Statistics.sendEvent("profile_signature_setting_click", jSONObject);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo161046a(int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "save");
            jSONObject.put("target", "none");
            jSONObject.put("signature_length", i);
            Statistics.sendEvent("profile_signature_setting_click", jSONObject);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo161047a(boolean z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_historical_signature_record_shown", String.valueOf(z));
            Statistics.sendEvent("profile_signature_setting_view", jSONObject);
        }
    }
}
