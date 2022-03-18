package com.ss.android.vc.statistics.event;

import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.statistics.p3182c.C63724a;
import com.ss.android.vc.statistics.p3182c.C63726b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.k */
public class C63761k {
    /* renamed from: a */
    public static void m250296a() {
        C60735ab.m236018e(new Runnable() {
            /* class com.ss.android.vc.statistics.event.C63761k.RunnableC637621 */

            public void run() {
                if (C57744a.m224104a().getBoolean("SP_KEY_MEETING_CRASH_FLAG")) {
                    List<VideoChat> c = VideoChatManager.m249444a().mo220134l().mo219638c();
                    if (c != null && c.size() > 0) {
                        for (VideoChat videoChat : c) {
                            if (videoChat != null) {
                                VideoChat.Type type = videoChat.getType();
                                if (type == VideoChat.Type.CALL) {
                                    C63761k.m250298a(videoChat, 5, "kill_process");
                                } else if (type == VideoChat.Type.MEET) {
                                    ao.m250026a(videoChat, "kill_process");
                                }
                            }
                        }
                    }
                    C57744a.m224104a().putBoolean("SP_KEY_MEETING_CRASH_FLAG", false);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m250297a(VideoChat videoChat) {
        if (videoChat != null) {
            C60700b.m235851b("CallFinishEvent", "[sendCallBeenFinish]", "type = " + videoChat.getEndReason());
            if (videoChat.getEndReason() == VideoChat.EndReason.HANGUP) {
                m250298a(videoChat, 1, "hang_up");
            } else if (videoChat.getEndReason() == VideoChat.EndReason.SDK_EXCEPTION) {
                m250298a(videoChat, 3, "streaming_sdk_bad");
            } else if (videoChat.getEndReason() == VideoChat.EndReason.CONNECTION_FAILED) {
                m250298a(videoChat, 2, "heartbeat_fail");
            } else {
                m250298a(videoChat, 100, "other");
            }
        }
    }

    /* renamed from: a */
    public static void m250298a(VideoChat videoChat, int i, String str) {
        if (videoChat != null) {
            C60700b.m235851b("CallFinishEvent", "[sendCallFinish]", "finishType = " + i + ", finishReason = " + str);
            if (!C60785x.m236238b()) {
                i = 4;
                if (videoChat.getType() == VideoChat.Type.CALL && C63724a.m249909b(videoChat)) {
                    C63726b.m249913a("vc_call_finish_callee_nonetwork", videoChat);
                }
                str = "no_network";
            }
            if (videoChat.getType() == VideoChat.Type.CALL) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("conference_id", videoChat.getId());
                    jSONObject.put("finish_type", i);
                    jSONObject.put("finish_reason", str);
                    jSONObject.put("participant_type", "lark_user");
                    C63726b.m249915a("vc_call_finish", jSONObject, videoChat);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
