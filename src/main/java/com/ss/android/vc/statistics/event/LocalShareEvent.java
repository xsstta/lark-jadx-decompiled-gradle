package com.ss.android.vc.statistics.event;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J&\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J$\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J$\u0010\u0011\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u001c\u0010\u0012\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J$\u0010\u0013\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/statistics/event/LocalShareEvent;", "", "()V", "createMeetingPageStarted", "", "sendCreateShareMeetingPageEvent", "", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "envId", "", "sendLocalShareCodePageEvent", "action", "sendLocalShareFailEvent", ShareHitPoint.f121868c, "reason", "sendLocalShareFinishEvent", "sendLocalShareOnTheCallEvent", "sendShareMeetingPageRenderedEvent", "sendStartLocalShareEvent", "inMeeting", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.event.ae */
public final class LocalShareEvent {

    /* renamed from: a */
    public static final LocalShareEvent f160879a = new LocalShareEvent();

    /* renamed from: b */
    private static boolean f160880b;

    private LocalShareEvent() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m249992a(VideoChat videoChat, String str) {
        f160880b = true;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "req_onthecall");
            jSONObject.put("env_id", str);
            C63726b.m249915a("vc_client_signal_info", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m249997b(VideoChat videoChat, String str) {
        if (f160880b) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                jSONObject.put("env_id", str);
                C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                f160880b = false;
                throw th;
            }
            f160880b = false;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m249995a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            jSONObject.put("env_id", str2);
            C63726b.m249915a("vc_meeting_page_share_code", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m249998b(String str, VideoChat videoChat, String str2) {
        Intrinsics.checkParameterIsNotNull(videoChat, "videoChat");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            jSONObject.put("env_id", str2);
            C63726b.m249915a("vc_meeting_page_onthecall_share_screen", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m249993a(String str, int i, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", str);
            jSONObject.put("during_meeting", i);
            jSONObject.put("env_id", str2);
            C63726b.m249915a("vc_meeting_lark_entry", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m249994a(String str, VideoChat videoChat, String str2) {
        Intrinsics.checkParameterIsNotNull(videoChat, "videoChat");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("finish_reason", str);
            jSONObject.put("env_id", str2);
            C63726b.m249915a("vc_meeting_finish", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m249996a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", str);
            jSONObject.put("fail_reason", str2);
            jSONObject.put("env_id", str3);
            C63726b.m249915a("vc_meeting_attend_fail", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
