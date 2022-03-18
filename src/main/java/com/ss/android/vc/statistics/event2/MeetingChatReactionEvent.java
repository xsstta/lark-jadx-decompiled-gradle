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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingChatReactionEvent;", "", "()V", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.j */
public final class MeetingChatReactionEvent {

    /* renamed from: a */
    public static final Companion f160835a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingChatReactionEvent$Companion;", "", "()V", "TAG", "", "sendClickEvent", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "clickName", "reactionName", "target", "sendPageViewEvent", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220281a(C61303k kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(kVar.mo212093K())) {
                    jSONObject.put("env_id", kVar.mo212093K());
                }
                C63728b.m249928a("vc_meeting_chat_reaction_view", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                C60700b.m235851b("MeetingChatReactionEvent@", "[sendPageViewEvent]", "exception = " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220282a(C61303k kVar, String str, String str2, String str3) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            Intrinsics.checkParameterIsNotNull(str, "clickName");
            Intrinsics.checkParameterIsNotNull(str2, "reactionName");
            try {
                JSONObject jSONObject = new JSONObject();
                String K = kVar.mo212093K();
                boolean z2 = false;
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
                String str4 = str3;
                if (str4 == null || str4.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    str3 = "none";
                }
                jSONObject.put("target", str3);
                jSONObject.put("click", str);
                jSONObject.put("reaction_name", str2);
                C63728b.m249928a("vc_meeting_chat_reaction_click", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                C60700b.m235851b("MeetingChatReactionEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
            }
        }
    }
}
