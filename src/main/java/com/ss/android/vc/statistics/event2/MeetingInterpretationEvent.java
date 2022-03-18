package com.ss.android.vc.statistics.event2;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.p3183d.C63728b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingInterpretationEvent;", "", "()V", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.o */
public final class MeetingInterpretationEvent {

    /* renamed from: a */
    public static final Companion f160842a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m249814a(C61303k kVar, String str) {
        f160842a.mo220295a(kVar, str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingInterpretationEvent$Companion;", "", "()V", "TAG", "", "sendClickEvent", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "clickName", "sendPageViewEvent", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.o$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220294a(C61303k kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(kVar.mo212093K())) {
                    jSONObject.put("env_id", kVar.mo212093K());
                }
                C63728b.m249928a("vc_meeting_interpretation_view", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                C60700b.m235851b("MeetingInterpretationEvent@", "[sendPageViewEvent]", "exception = " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220295a(C61303k kVar, String str) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            Intrinsics.checkParameterIsNotNull(str, "clickName");
            try {
                JSONObject jSONObject = new JSONObject();
                String K = kVar.mo212093K();
                if (K != null) {
                    if (K.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        jSONObject.put("env_id", kVar.mo212093K());
                    }
                }
                jSONObject.put("click", str);
                C63728b.m249928a("vc_meeting_interpretation_click", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                C60700b.m235851b("MeetingInterpretationEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
            }
        }
    }
}
