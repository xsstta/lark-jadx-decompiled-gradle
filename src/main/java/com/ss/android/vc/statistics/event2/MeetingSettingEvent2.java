package com.ss.android.vc.statistics.event2;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ8\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ \u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ \u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ \u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ6\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006J,\u0010&\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010$\u001a\u00020\u0006¨\u0006("}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingSettingEvent2;", "", "()V", "sendChangeFilterValueClickEvent", "", "envId", "", "isDefault", "", "value", "", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "sendChangeUssSettingClickEvent", "isChecked", "sendChooseAvatarClickEvent", "avatarName", "sendChooseFilterClickEvent", "filterName", "sendChooseVirtualBackgroundClickEvent", "backgroundType", "backgroundPicName", "sendClickEvent", "click", "target", "extendJson", "Lorg/json/JSONObject;", "sendHaulBuffingClickEvent", "buffingValue", "isDefaultValue", "sendHaulEyesClickEvent", "sendHaulFaceLiftClickEvent", "sendHaulLipstickClickEvent", "sendSubtitleSettingLanguageEvent", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "settingTab", "language", "sendViewEvent", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.x */
public final class MeetingSettingEvent2 {

    /* renamed from: a */
    public static final Lazy f160859a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63722b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160860b = new Companion(null);

    /* renamed from: a */
    public static final MeetingSettingEvent2 m249883a() {
        return f160860b.mo220361a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingSettingEvent2$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event2/MeetingSettingEvent2;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/MeetingSettingEvent2;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.x$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingSettingEvent2 mo220361a() {
            Lazy lazy = MeetingSettingEvent2.f160859a;
            Companion aVar = MeetingSettingEvent2.f160860b;
            return (MeetingSettingEvent2) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo220355a(String str, boolean z, int i, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_default", String.valueOf(z));
            jSONObject.put("filter_value", String.valueOf(i));
            mo220354a("haul_filter", "none", jSONObject, videoChat, str);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSettingEvent@", "[sendChangeFilterValueClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220356a(boolean z, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("setting_tab", "general");
            jSONObject.put("is_check", String.valueOf(z));
            mo220354a("use_ultrasonic", "none", jSONObject, videoChat, (String) null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSettingEvent@", "[sendChangeUssSettingClickEvent]", "exception = " + e.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/MeetingSettingEvent2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.x$b */
    static final class C63722b extends Lambda implements Function0<MeetingSettingEvent2> {
        public static final C63722b INSTANCE = new C63722b();

        C63722b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingSettingEvent2 invoke() {
            return new MeetingSettingEvent2();
        }
    }

    /* renamed from: b */
    public final void mo220358b(String str, VideoChat videoChat) {
        Intrinsics.checkParameterIsNotNull(str, "avatarName");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("labs_tab", "moji");
            jSONObject.put("avatar_name", str);
            mo220354a("choose_avatar", "none", jSONObject, videoChat, (String) null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSettingEvent@", "[sendChooseAvatarClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220351a(String str, VideoChat videoChat) {
        Intrinsics.checkParameterIsNotNull(str, "filterName");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("labs_tab", "filter");
            jSONObject.put("filter_name", str);
            mo220354a("choose_filter", "none", jSONObject, videoChat, (String) null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSettingEvent@", "[sendChooseFilterClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220349a(int i, boolean z, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("buffing_value", String.valueOf(i));
            jSONObject.put("is_default", z);
            mo220354a("haul_buffing", "none", jSONObject, videoChat, (String) null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSettingEvent@", "[sendHaulBuffingClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo220357b(int i, boolean z, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eyes_value", String.valueOf(i));
            jSONObject.put("is_default", z);
            mo220354a("haul_eyes", "none", jSONObject, videoChat, (String) null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSettingEvent@", "[sendHaulEyesClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: c */
    public final void mo220359c(int i, boolean z, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("facelift_value", String.valueOf(i));
            jSONObject.put("is_default", z);
            mo220354a("haul_facelift", "none", jSONObject, videoChat, (String) null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSettingEvent@", "[sendHaulFaceLiftClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: d */
    public final void mo220360d(int i, boolean z, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lipstick_value", String.valueOf(i));
            jSONObject.put("is_default", z);
            mo220354a("haul_lipstick", "none", jSONObject, videoChat, (String) null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSettingEvent@", "[sendHaulLipstickClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220353a(String str, String str2, VideoChat videoChat) {
        Intrinsics.checkParameterIsNotNull(str, "backgroundType");
        Intrinsics.checkParameterIsNotNull(str2, "backgroundPicName");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("labs_tab", "background");
            jSONObject.put("background_picture_name", str2);
            jSONObject.put("background_type", str);
            mo220354a("choose_virtual_background", "none", jSONObject, videoChat, (String) null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSettingEvent@", "[sendChooseVirtualBackgroundClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220352a(String str, VideoChat videoChat, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str3, "settingTab");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("target", str);
            jSONObject.put("env_id", str2);
            jSONObject.put("setting_tab", str3);
            C63728b.m249928a("vc_meeting_setting_view", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSettingEvent@", "[sendViewEvent]", "exception = " + e.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031 A[Catch:{ JSONException -> 0x003f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo220350a(com.ss.android.vc.meeting.framework.meeting.C61303k r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r7 = this;
            java.lang.String r0 = "meeting"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "click"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "settingTab"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003f }
            r4.<init>()     // Catch:{ JSONException -> 0x003f }
            java.lang.String r0 = "setting_tab"
            r4.put(r0, r10)     // Catch:{ JSONException -> 0x003f }
            if (r11 == 0) goto L_0x0020
            java.lang.String r10 = "language"
            r4.put(r10, r11)     // Catch:{ JSONException -> 0x003f }
        L_0x0020:
            r10 = r12
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ JSONException -> 0x003f }
            if (r10 == 0) goto L_0x002e
            int r10 = r10.length()     // Catch:{ JSONException -> 0x003f }
            if (r10 != 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r10 = 0
            goto L_0x002f
        L_0x002e:
            r10 = 1
        L_0x002f:
            if (r10 == 0) goto L_0x0033
            java.lang.String r12 = "none"
        L_0x0033:
            r3 = r12
            com.ss.android.vc.entity.VideoChat r5 = r8.mo212056e()     // Catch:{ JSONException -> 0x003f }
            r6 = 0
            r1 = r7
            r2 = r9
            r1.mo220354a(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x003f }
            goto L_0x005c
        L_0x003f:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "exception = "
            r9.append(r10)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "MeetingSettingEvent@"
            java.lang.String r10 = "[sendSubtitleSettingLanguageEvent]"
            com.ss.android.vc.common.p3077b.C60700b.m235851b(r9, r10, r8)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event2.MeetingSettingEvent2.mo220350a(com.ss.android.vc.meeting.framework.meeting.k, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo220354a(String str, String str2, JSONObject jSONObject, VideoChat videoChat, String str3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("click", str);
            jSONObject.put("target", str2);
            jSONObject.put("env_id", str3);
            C63728b.m249928a("vc_meeting_setting_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingSettingEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m249884a(MeetingSettingEvent2 xVar, C61303k kVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        xVar.mo220350a(kVar, str, str2, str3, str4);
    }
}
