package com.ss.android.vc.statistics.event2;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.p3183d.C63728b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJG\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016¨\u0006\u0018"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingMagicShareEvent;", "", "()V", "sendAssignPresenterEvent", "", "userId", "", "isSharer", "", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "sendClickEvent", "click", "target", "extendJson", "Lorg/json/JSONObject;", "envId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/json/JSONObject;Lcom/ss/android/vc/entity/VideoChat;Ljava/lang/String;)V", "sendCopyFileLinkEvent", "fileToken", "sendPageViewEvent", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.p */
public final class MeetingMagicShareEvent {

    /* renamed from: a */
    public static final Lazy f160843a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63714b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160844b = new Companion(null);

    /* renamed from: a */
    public static final MeetingMagicShareEvent m249817a() {
        return f160844b.mo220300a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingMagicShareEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event2/MeetingMagicShareEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/MeetingMagicShareEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.p$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingMagicShareEvent mo220300a() {
            Lazy lazy = MeetingMagicShareEvent.f160843a;
            Companion aVar = MeetingMagicShareEvent.f160844b;
            return (MeetingMagicShareEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/MeetingMagicShareEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.p$b */
    static final class C63714b extends Lambda implements Function0<MeetingMagicShareEvent> {
        public static final C63714b INSTANCE = new C63714b();

        C63714b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingMagicShareEvent invoke() {
            return new MeetingMagicShareEvent();
        }
    }

    /* renamed from: a */
    public final void mo220296a(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(kVar.mo212093K())) {
                jSONObject.put("env_id", kVar.mo212093K());
            }
            C63728b.m249928a("vc_meeting_magic_share_view", jSONObject, kVar.mo212056e());
        } catch (JSONException e) {
            C60700b.m235851b("MeetingMagicShareEvent@", "[sendPageViewEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220298a(String str, boolean z, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("file_token", str);
            mo220297a("copy_file_link", null, Boolean.valueOf(z), jSONObject, videoChat, null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingMagicShareEvent@", "[sendCopyFileLinkEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo220299b(String str, boolean z, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("assigned_user_id", str);
            mo220297a("assign_presenter", null, Boolean.valueOf(z), jSONObject, videoChat, null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingMagicShareEvent@", "[sendAssignPresenterEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220297a(String str, String str2, Boolean bool, JSONObject jSONObject, VideoChat videoChat, String str3) {
        String str4;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e) {
                C60700b.m235851b("MeetingMagicShareEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
                return;
            }
        }
        jSONObject.put("click", str);
        jSONObject.put("target", str2);
        jSONObject.put("env_id", str3);
        if (bool != null) {
            if (bool.booleanValue()) {
                str4 = "true";
            } else {
                str4 = "false";
            }
            jSONObject.put("is_sharer", str4);
        }
        C63728b.m249928a("vc_meeting_magic_share_click", jSONObject, videoChat);
    }
}
