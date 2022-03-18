package com.ss.android.vc.statistics.event;

import com.google.firebase.messaging.Constants;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tJ/\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/statistics/event/MeetingLobbyEvent;", "", "()V", "sendEnterLobbyEvent", "", "envId", "", "interactiveId", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "sendLobbyActionEvent", "actionName", "Lcom/ss/android/vc/statistics/event/MeetingLobbyEvent$LobbyAction;", "isEnable", "", "(Lcom/ss/android/vc/statistics/event/MeetingLobbyEvent$LobbyAction;Ljava/lang/String;Ljava/lang/Integer;Lcom/ss/android/vc/entity/VideoChat;)V", "sendPreLobbyActionEvent", "LobbyAction", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingLobbyEvent {

    /* renamed from: a */
    public static final MeetingLobbyEvent f160867a = new MeetingLobbyEvent();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/vc/statistics/event/MeetingLobbyEvent$LobbyAction;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MIC", "CAMERA", "HANGUP", "SPEAKER", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum LobbyAction {
        MIC("mic"),
        CAMERA("camera"),
        HANGUP("hangup"),
        SPEAKER("speaker");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        private LobbyAction(String str) {
            this.value = str;
        }
    }

    private MeetingLobbyEvent() {
    }

    /* renamed from: a */
    public final void mo220383a(String str, VideoChat videoChat) {
        Intrinsics.checkParameterIsNotNull(str, "actionName");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            C63726b.m249915a("vc_pre_waitingroom", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo220384a(String str, String str2, VideoChat videoChat) {
        Intrinsics.checkParameterIsNotNull(str, "envId");
        Intrinsics.checkParameterIsNotNull(str2, "interactiveId");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            jSONObject.put("interactive_id", str2);
            jSONObject.put("env_id", str);
            C63726b.m249915a("vc_meeting_page_waiting_rooms", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo220382a(LobbyAction lobbyAction, String str, Integer num, VideoChat videoChat) {
        Intrinsics.checkParameterIsNotNull(lobbyAction, "actionName");
        Intrinsics.checkParameterIsNotNull(str, "envId");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", lobbyAction.getValue());
            jSONObject.put("from_source", "control_bar");
            jSONObject.put("env_id", str);
            if (num != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("action_enabled", num.intValue());
                jSONObject.put("extend_value", jSONObject2);
            }
            C63726b.m249915a("vc_meeting_page_waiting_rooms", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
