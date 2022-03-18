package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J \u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/statistics/event/VideoChatIMEvent;", "", "()V", "TAG", "", "sendControlBarVisibilityEvent", "", "isExpendBar", "", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "sendMessageSendEvent", "sendReactionEvent", "reactionType", "reactionTimes", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.event.cd */
public final class VideoChatIMEvent {

    /* renamed from: a */
    public static final VideoChatIMEvent f160907a = new VideoChatIMEvent();

    /* renamed from: b */
    private static final String f160908b = f160908b;

    private VideoChatIMEvent() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m250259a(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "send_message");
            C63726b.m249915a("vc_meeting_chat_box", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f(f160908b, "[sendMessageSendEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220402a(String str, int i, VideoChat videoChat) {
        Intrinsics.checkParameterIsNotNull(str, "reactionType");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "reaction");
            jSONObject.put("reaction_times", i);
            jSONObject.put("reaction_type", str);
            C63726b.m249915a("vc_meeting_chat_box", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f(f160908b, "[sendReactionEvent]", e.getMessage());
        }
    }
}
