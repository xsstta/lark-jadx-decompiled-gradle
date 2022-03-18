package com.ss.android.lark.leanmode.statistics;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/leanmode/statistics/LeanModeHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_lean-mode_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.leanmode.d.a */
public final class LeanModeHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f105030a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/leanmode/statistics/LeanModeHitPoint$Companion;", "", "()V", "ALL_DEVICES", "", "ALL_DEVICES_NO", "ALL_DEVICES_YES", "recordUserCloseLeanMode", "", "recordUserCloseLeanModeAllDevice", "recordUserConfirmToOpenLeanMode", "allDevice", "recordUserOpenLeanMode", "recordUserOpenLeanModeOnlyCurrentDevice", "recordUserSecurityVerifySuccess", "im_lean-mode_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.leanmode.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo148619a() {
            Statistics.sendEvent("lean_mode_turnon_attempt");
        }

        /* renamed from: b */
        public final void mo148621b() {
            Statistics.sendEvent("lean_mode_turnoff_attempt");
        }

        /* renamed from: c */
        public final void mo148622c() {
            Statistics.sendEvent("lean_mode_turnoff_confirmed");
        }

        /* renamed from: d */
        public final void mo148623d() {
            Statistics.sendEvent("lean_mode_turnoff_confirmed_all_devices");
        }

        /* renamed from: e */
        public final void mo148624e() {
            Statistics.sendEvent("lean_mode_turnoff_confirmed_current_device");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo148620a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "allDevice");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("all_devices", str);
                Statistics.sendEvent("lean_mode_turnon_confirmed", jSONObject);
            } catch (Throwable th) {
                Log.m165382e(th.getMessage());
            }
        }
    }
}
