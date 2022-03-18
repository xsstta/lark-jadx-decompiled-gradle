package com.ss.android.vc.statistics.event2;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.p3183d.C63728b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingChatSendMsgEvent;", "", "()V", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.k */
public final class MeetingChatSendMsgEvent {

    /* renamed from: a */
    public static final Companion f160836a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m249797a(C61303k kVar, String str) {
        Companion.m249798a(f160836a, kVar, str, null, null, 12, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingChatSendMsgEvent$Companion;", "", "()V", "TAG", "", "sendClickEvent", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "clickName", "target", "extraParams", "", "sendPageViewEvent", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220283a(C61303k kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(kVar.mo212093K())) {
                    jSONObject.put("env_id", kVar.mo212093K());
                }
                C63728b.m249928a("vc_meeting_chat_send_message_view", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                C60700b.m235851b("MeetingChatSendMsgEvent@", "[sendPageViewEvent]", "exception = " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220284a(C61303k kVar, String str, String str2, Map<String, String> map) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            Intrinsics.checkParameterIsNotNull(str, "clickName");
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
                String str3 = str2;
                if (str3 == null || str3.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    str2 = "none";
                }
                jSONObject.put("target", str2);
                jSONObject.put("click", str);
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                C63728b.m249928a("vc_meeting_chat_send_message_click", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                C60700b.m235851b("MeetingChatSendMsgEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.vc.statistics.b.k$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m249798a(Companion aVar, C61303k kVar, String str, String str2, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                map = null;
            }
            aVar.mo220284a(kVar, str, str2, map);
        }
    }
}
