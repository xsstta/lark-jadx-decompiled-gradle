package com.ss.android.vc.statistics.p3180a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.a.c */
public class C63688c {

    /* renamed from: a */
    private static final Map<String, Runnable> f160772a = new HashMap();

    /* renamed from: b */
    private static final Handler f160773b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final List<Command> f160774c;

    /* renamed from: d */
    private static final List<Command> f160775d;

    /* renamed from: e */
    private static final List<com.ss.android.lark.pb.improto.Command> f160776e;

    /* renamed from: a */
    public static void m249669a() {
        f160773b.removeCallbacksAndMessages(null);
        f160772a.clear();
    }

    static {
        ArrayList arrayList = new ArrayList();
        f160774c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f160775d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        f160776e = arrayList3;
        arrayList.add(Command.UPDATE_VIDEO_CHAT);
        arrayList.add(Command.TRIG_PUSH_FULL_MEETING_INFO);
        arrayList.add(Command.TRIG_PUSH_SELF_INFO);
        arrayList.add(Command.HOST_MANAGE);
        arrayList.add(Command.PARTICIPANT_CHANGE_SETTINGS);
        arrayList.add(Command.START_BYTEVIEW_POLLING);
        arrayList.add(Command.STOP_BYTEVIEW_POLLING);
        arrayList.add(Command.START_BYTEVIEW_HEARTBEAT);
        arrayList.add(Command.STOP_BYTEVIEW_HEARTBEAT);
        arrayList.add(Command.INVITE_VIDEO_CHAT);
        arrayList.add(Command.SHARE_VIDEO_CHAT);
        arrayList.add(Command.GET_CALENDAR_INFO);
        arrayList.add(Command.GET_CALENDAR_GROUP);
        arrayList.add(Command.PULL_SUBTITLES);
        arrayList.add(Command.GET_PARTICIPANT_LIST);
        arrayList.add(Command.SEARCH_SUBTITLES);
        arrayList.add(Command.SYNC_SUBTITLES);
        arrayList.add(Command.RECORD_MEETING);
        arrayList.add(Command.LIVE_MEETING_ACTION);
        arrayList.add(Command.LIVE_MEETING_EXTRA_INFO);
        arrayList.add(Command.GET_SUGGESTED_PARTICIPANTS);
        arrayList.add(Command.FETCH_ALL_SKETCH_DATA);
        arrayList.add(Command.SKETCH_START);
        arrayList.add(Command.GET_URL_BRIEFS);
        arrayList.add(Command.REQUEST_FOLLOW_PERM);
        arrayList.add(Command.SHARE_FOLLOW);
        arrayList.add(Command.CREATE_DOC);
        arrayList.add(Command.PULL_ALL_FOLLOW_STATES);
        arrayList.add(Command.GET_FOLLOW_RESOURCES);
        arrayList.add(Command.GRANT_FOLLOW_TOKEN);
        arrayList.add(Command.APPLY_BYTEVIEW_ACCESSIBILITY);
        arrayList.add(Command.SHARE_SCREEN);
        arrayList.add(Command.SHARE_SCREEN_TO_ROOM);
        arrayList.add(Command.SEND_VIDEO_CHAT_INTERACTION_MESSAGE);
        arrayList.add(Command.PULL_VIDEO_CHAT_INTERACTION_MESSAGES);
        arrayList.add(Command.GET_PARTICIPANTS_BY_IDS);
        arrayList.add(Command.CHECK_VC_MANAGE_CAPABILITIES);
        arrayList.add(Command.GET_AUTH_CHATTERS);
        arrayList.add(Command.PATCH_VIEW_USER_SETTING);
        arrayList.add(Command.GET_VIEW_USER_SETTING);
        arrayList.add(Command.UPLOAD_EQUIPMENT_INFO);
        arrayList.add(Command.VC_LARK_SEARCH_USER_IN_MEETING);
        arrayList.add(Command.VC_GET_SUITE_QUOTA);
        arrayList2.add(Command.GET_FEEDBACK_REASONS);
        arrayList2.add(Command.PATCH_VIEW_USER_SETTING);
        arrayList2.add(Command.LIVE_MEETING_FETCH_LIVE_POLICY);
        arrayList2.add(Command.GET_ADMIN_SETTINGS);
        arrayList2.add(Command.REGISTER_CLIENT_INFO);
        arrayList2.add(Command.PULL_VIDEO_CHAT_CONFIG);
        arrayList3.add(com.ss.android.lark.pb.improto.Command.GET_ADMIN_PERMISSION_INFO);
    }

    /* renamed from: a */
    public static void m249672a(String str) {
        Runnable runnable;
        if (!TextUtils.isEmpty(str) && (runnable = f160772a.get(str)) != null) {
            f160773b.removeCallbacks(runnable);
            C60700b.m235851b("ErrorAppreciable", "[subStreamSuccess]", "streamId = " + str);
        }
    }

    /* renamed from: b */
    public static void m249675b(String str) {
        Runnable runnable;
        if (!TextUtils.isEmpty(str) && (runnable = f160772a.get(str)) != null) {
            f160773b.removeCallbacks(runnable);
            C60700b.m235851b("ErrorAppreciable", "[subStreamCancel]", "streamId = " + str);
        }
    }

    /* renamed from: a */
    public static void m249670a(int i, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            C63686a.m249661a("vc_perf_rtc_error", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("ErrorAppreciable", "[sendRtcError]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m249676b(String str, VideoChat videoChat) {
        if (C60785x.m236238b()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("stream_id", str);
                C63686a.m249661a("vc_perf_rtc_sub_timeout", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("ErrorAppreciable", "[sendRtcSubTimeout]", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m249674a(final String str, final VideoChat videoChat) {
        if (!TextUtils.isEmpty(str)) {
            Map<String, Runnable> map = f160772a;
            if (!map.containsKey(str)) {
                RunnableC636891 r1 = new Runnable() {
                    /* class com.ss.android.vc.statistics.p3180a.C63688c.RunnableC636891 */

                    public void run() {
                        C63688c.m249676b(str, videoChat);
                    }
                };
                f160773b.postDelayed(r1, 12000);
                map.put(str, r1);
                C60700b.m235851b("ErrorAppreciable", "[subStreamStart]", "streamId = " + str);
            }
        }
    }

    /* renamed from: a */
    public static void m249673a(String str, int i, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && C60785x.m236238b()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("third_type", str);
                jSONObject.put("code", i);
                jSONObject.put("error_url", str2);
                jSONObject.put("error_msg", str3);
                C63686a.m249661a("vc_perf_third_http_error", jSONObject, (VideoChat) null);
            } catch (JSONException e) {
                C60700b.m235864f("ErrorAppreciable", "[sendThirdHttpError]", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m249671a(int i, Object obj, String str, String str2) {
        AbstractC61294b j;
        if (obj != null && !TextUtils.isEmpty(str) && C60785x.m236238b()) {
            if (TextUtils.isEmpty(VideoChatModuleDependency.m236630c())) {
                C60700b.m235851b("ErrorAppreciable", "[sendHttpError]", obj.toString() + ", userId is empty");
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                if ((obj instanceof Command) && f160775d.contains((Command) obj)) {
                    C60700b.m235851b("ErrorAppreciable", "[sendHttpError2]", obj.toString() + ", debugMsg is empty");
                    return;
                } else if ((obj instanceof com.ss.android.lark.pb.improto.Command) && f160776e.contains((com.ss.android.lark.pb.improto.Command) obj)) {
                    C60700b.m235851b("ErrorAppreciable", "[sendHttpError3]", obj.toString() + ", debugMsg is empty");
                    return;
                }
            }
            VideoChat videoChat = null;
            if ((obj instanceof Command) && f160774c.contains((Command) obj) && (j = MeetingManager.m238341a().mo211906j()) != null) {
                videoChat = j.mo212056e();
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i);
                jSONObject.put("command", obj.toString());
                jSONObject.put("context_id", str);
                jSONObject.put("debug_msg", str2);
                C63686a.m249661a("vc_perf_http_error", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("ErrorAppreciable", "[sendHttpError]", e.getMessage());
            }
        }
    }
}
