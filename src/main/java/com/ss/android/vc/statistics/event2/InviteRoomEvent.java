package com.ss.android.vc.statistics.event2;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.p3183d.C63728b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/InviteRoomEvent;", "", "()V", "TAG", "", "sendCallClickEvent", "", "roomType", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "sendEntryClickEvent", "sendPageViewEvent", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.a */
public final class InviteRoomEvent {

    /* renamed from: a */
    public static final InviteRoomEvent f160802a = new InviteRoomEvent();

    private InviteRoomEvent() {
    }

    /* renamed from: b */
    public final void mo220223b(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        try {
            C63728b.m249928a("vc_meeting_room_system_invite_view", null, kVar.mo212056e());
        } catch (JSONException e) {
            C60700b.m235851b("InviteRoomEvent", "[sendPageViewEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220221a(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "room_system_invite");
            jSONObject.put("target", "vc_meeting_room_system_invite_view");
            jSONObject.put("is_more", "true");
            C63728b.m249928a("vc_meeting_onthcall_click", jSONObject, kVar.mo212056e());
        } catch (JSONException e) {
            C60700b.m235851b("InviteRoomEvent", "[sendEntryClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220222a(String str, C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(str, "roomType");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "call");
            jSONObject.put("room_type", str);
            jSONObject.put("target", "none");
            C63728b.m249928a("vc_meeting_room_system_invite_click", jSONObject, kVar.mo212056e());
        } catch (JSONException e) {
            C60700b.m235851b("InviteRoomEvent", "[sendEntryClickEvent]", "exception = " + e.getMessage());
        }
    }
}
