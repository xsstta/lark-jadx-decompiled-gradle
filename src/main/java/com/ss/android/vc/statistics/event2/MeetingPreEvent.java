package com.ss.android.vc.statistics.event2;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.background.MaterialSource;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62269o;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import com.ss.android.vc.statistics.event.C63732ac;
import com.ss.android.vc.statistics.p3183d.C63728b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u001b\u0018\u0000 82\u00020\u0001:\u00018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJP\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\u0011\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bJ \u0010\u0014\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017J \u0010\u0018\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006JZ\u0010\u001a\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000eH\u0002J \u0010!\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006J(\u0010\"\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006JR\u0010$\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010%\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\bJ \u0010&\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0017J \u0010(\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0017J \u0010*\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0017J \u0010,\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0017J\u0010\u0010.\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0018\u0010/\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\bJ\u0010\u00100\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J \u00101\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bJ4\u00102\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\bJ*\u00106\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0006\u00107\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006¨\u00069"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingPreEvent;", "", "()V", "sendAttendClickEvent", "", "envId", "", "isCameraOn", "", "backgroundStats", "backgroundType", "avatarStats", "touchUpStats", "touchUpCustomValue", "Lorg/json/JSONObject;", "filterStats", "filterValue", "sendCameraClickEvent", "isStartingAuth", "open", "sendChangeFilterValueClickEvent", "isDefault", "value", "", "sendChooseAvatarClickEvent", "filterName", "sendChooseEvent", "target", "clickName", "extraParams", "", "paramsJsonObjectKey", "paramsJsonObject", "sendChooseFilterClickEvent", "sendChooseVirtualBackgroundClickEvent", "backgroundPicName", "sendClickEvent", "sendCloseClickEvent", "sendHaulBuffingClickEvent", "buffingValue", "sendHaulEyesClickEvent", "eyesValue", "sendHaulFaceLiftClickEvent", "faceLiftValue", "sendHaulLipstickClickEvent", "lipstickValue", "sendInsertTitleClickEvent", "sendLabsSettingClickEvent", "sendLeaveClickEvent", "sendMicrophoneClickEvent", "sendPageViewEvent", "isMicOn", "isCamOn", "fromUrl", "sendSpeakerClickEvent", "optionName", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.u */
public final class MeetingPreEvent {

    /* renamed from: a */
    public static final Lazy f160855a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63720b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160856b = new Companion(null);

    /* renamed from: a */
    public static final MeetingPreEvent m249851a() {
        return f160856b.mo220344a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingPreEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event2/MeetingPreEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/MeetingPreEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.u$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingPreEvent mo220344a() {
            Lazy lazy = MeetingPreEvent.f160855a;
            Companion aVar = MeetingPreEvent.f160856b;
            return (MeetingPreEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private MeetingPreEvent() {
    }

    /* renamed from: a */
    public final void mo220333a(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("env_id", str);
            }
            jSONObject.put("is_starting_auth", String.valueOf(z3));
            jSONObject.put("is_mic_on", String.valueOf(z));
            jSONObject.put("is_cam_on", String.valueOf(z2));
            if (z4) {
                jSONObject.put("from_source", "landing_page_link");
            }
            C63728b.m249928a("vc_meeting_pre_view", jSONObject, null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingPreEvent@", "[sendPageViewEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220332a(String str, boolean z, boolean z2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_starting_auth", String.valueOf(z));
        linkedHashMap.put("option", z2 ? "open" : "close");
        m249852a(this, str, (String) null, "camera", linkedHashMap, (String) null, (JSONObject) null, 48, (Object) null);
    }

    /* renamed from: a */
    public final void mo220331a(String str, boolean z, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str2, "optionName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2.length() == 0) {
            str2 = "another";
        }
        linkedHashMap.put("option", str2);
        linkedHashMap.put("is_starting_auth", String.valueOf(z));
        m249852a(this, str, str3, "speaker", linkedHashMap, (String) null, (JSONObject) null, 48, (Object) null);
    }

    /* renamed from: a */
    public final void mo220330a(String str, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "filterName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("labs_tab", "filter");
        linkedHashMap.put("filter_name", str2);
        m249853a(this, str, null, "choose_filter", z, linkedHashMap, null, null, 96, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/MeetingPreEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.u$b */
    static final class C63720b extends Lambda implements Function0<MeetingPreEvent> {
        public static final C63720b INSTANCE = new C63720b();

        C63720b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingPreEvent invoke() {
            return new MeetingPreEvent(null);
        }
    }

    public /* synthetic */ MeetingPreEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo220326a(String str) {
        m249852a(this, str, (String) null, "insert_title", (Map) null, (String) null, (JSONObject) null, 48, (Object) null);
    }

    /* renamed from: b */
    public final void mo220334b(String str) {
        m249852a(this, str, (String) null, "leave", (Map) null, (String) null, (JSONObject) null, 48, (Object) null);
    }

    /* renamed from: b */
    public final void mo220335b(String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_starting_auth", String.valueOf(z));
        m249852a(this, str, (String) null, "close", linkedHashMap, (String) null, (JSONObject) null, 48, (Object) null);
    }

    /* renamed from: c */
    public final void mo220340c(String str, boolean z) {
        boolean z2;
        MaterialSource materialSource;
        String str2;
        String str3;
        boolean z3;
        String str4;
        boolean z4;
        boolean z5;
        String str5;
        String str6;
        Iterator<EffectModel> it;
        JSONObject jSONObject;
        int i;
        VirtualBackgroundInfo g = C62269o.m243189g();
        JSONObject b = C62269o.m243179b();
        String a = C63732ac.m249946a(g);
        if (g == null || !g.isBlur) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (g != null) {
            materialSource = g.materialSource;
        } else {
            materialSource = null;
        }
        String a2 = C63732ac.m249948a(z2, materialSource);
        String optString = b.optString("selectedAnimojiName");
        String str7 = "close";
        if (TextUtils.isEmpty(optString)) {
            str2 = str7;
        } else {
            str2 = optString;
        }
        String optString2 = b.optString("selectedFilterName");
        if (TextUtils.isEmpty(optString2)) {
            str3 = str7;
        } else {
            str3 = optString2;
        }
        String optString3 = b.optString("selectedFilter");
        String str8 = optString3;
        if (str8 == null || str8.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            str4 = "none";
        } else {
            str4 = String.valueOf(b.optInt(optString3));
        }
        int optInt = C62269o.m243179b().optInt("selectedBeautyStyle", -1);
        if (optInt == EffectModel.BeautifyStyle.AUTO.getValue()) {
            z5 = false;
            z4 = true;
        } else {
            if (optInt == EffectModel.BeautifyStyle.ORIGINAL.getValue()) {
                z5 = true;
            } else {
                z5 = false;
            }
            z4 = false;
        }
        C60700b.m235851b("MeetingPreEvent@", "[sendOnTheCallEffectEvent]", "touch_up close: " + z5 + ", def: " + z4);
        List<EffectModel> d = C62228c.m243022d();
        JSONObject jSONObject2 = new JSONObject();
        if (d != null && !d.isEmpty()) {
            try {
                Iterator<EffectModel> it2 = d.iterator();
                int i2 = 1;
                boolean z6 = true;
                while (it2.hasNext()) {
                    EffectModel next = it2.next();
                    Intrinsics.checkExpressionValueIsNotNull(next, "model");
                    int optInt2 = b.optInt(next.getResourceId(), -1);
                    if (optInt2 == -1) {
                        jSONObject = b;
                        it = it2;
                    } else {
                        if (optInt2 != 0) {
                            z6 = false;
                        }
                        StringBuilder sb = new StringBuilder();
                        jSONObject = b;
                        sb.append("id");
                        sb.append(i2);
                        jSONObject2.put(sb.toString(), next.getResourceId());
                        if (z4) {
                            jSONObject2.put("value" + i2, next.getTagDefaultValue());
                            jSONObject2.put("is_default" + i2, 1);
                            it = it2;
                        } else if (z5) {
                            jSONObject2.put("value" + i2, 0);
                            jSONObject2.put("is_default" + i2, 0);
                            it = it2;
                        } else {
                            it = it2;
                            jSONObject2.put("value" + i2, optInt2);
                            String str9 = "is_default" + i2;
                            if (optInt2 == next.getTagDefaultValue()) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            jSONObject2.put(str9, i);
                        }
                        i2++;
                    }
                    str7 = str7;
                    b = jSONObject;
                    it2 = it;
                }
                if (!z5) {
                    if (z4) {
                        str6 = "default";
                        str5 = str6;
                        MeetingPreEvent a3 = f160856b.mo220344a();
                        Intrinsics.checkExpressionValueIsNotNull(a, "backgroundStatus");
                        Intrinsics.checkExpressionValueIsNotNull(a2, "backgroundType");
                        Intrinsics.checkExpressionValueIsNotNull(str2, "avatarStatus");
                        Intrinsics.checkExpressionValueIsNotNull(str3, "filterStatus");
                        a3.mo220327a(str, a, a2, str2, str5, jSONObject2, str3, str4, z);
                    } else if (!z6) {
                        str5 = "custom";
                        MeetingPreEvent a32 = f160856b.mo220344a();
                        Intrinsics.checkExpressionValueIsNotNull(a, "backgroundStatus");
                        Intrinsics.checkExpressionValueIsNotNull(a2, "backgroundType");
                        Intrinsics.checkExpressionValueIsNotNull(str2, "avatarStatus");
                        Intrinsics.checkExpressionValueIsNotNull(str3, "filterStatus");
                        a32.mo220327a(str, a, a2, str2, str5, jSONObject2, str3, str4, z);
                    }
                }
                str5 = str7;
            } catch (JSONException e) {
                C60700b.m235851b("MeetingPreEvent@", "[sendAttendClickEvent]", "exception = " + e.getMessage());
            }
            MeetingPreEvent a322 = f160856b.mo220344a();
            Intrinsics.checkExpressionValueIsNotNull(a, "backgroundStatus");
            Intrinsics.checkExpressionValueIsNotNull(a2, "backgroundType");
            Intrinsics.checkExpressionValueIsNotNull(str2, "avatarStatus");
            Intrinsics.checkExpressionValueIsNotNull(str3, "filterStatus");
            a322.mo220327a(str, a, a2, str2, str5, jSONObject2, str3, str4, z);
        }
        str6 = "";
        str5 = str6;
        MeetingPreEvent a3222 = f160856b.mo220344a();
        Intrinsics.checkExpressionValueIsNotNull(a, "backgroundStatus");
        Intrinsics.checkExpressionValueIsNotNull(a2, "backgroundType");
        Intrinsics.checkExpressionValueIsNotNull(str2, "avatarStatus");
        Intrinsics.checkExpressionValueIsNotNull(str3, "filterStatus");
        a3222.mo220327a(str, a, a2, str2, str5, jSONObject2, str3, str4, z);
    }

    /* renamed from: a */
    public final void mo220328a(String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_starting_auth", String.valueOf(z));
        m249852a(this, str, (String) null, "labs_setting", linkedHashMap, (String) null, (JSONObject) null, 48, (Object) null);
    }

    /* renamed from: b */
    public final void mo220336b(String str, boolean z, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_default", String.valueOf(z));
        linkedHashMap.put("filter_value", String.valueOf(i));
        m249852a(this, str, (String) null, "haul_filter", linkedHashMap, (String) null, (JSONObject) null, 48, (Object) null);
    }

    /* renamed from: c */
    public final void mo220341c(String str, boolean z, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_default", String.valueOf(z));
        linkedHashMap.put("eyes_value", String.valueOf(i));
        m249852a(this, str, (String) null, "haul_eyes", linkedHashMap, (String) null, (JSONObject) null, 48, (Object) null);
    }

    /* renamed from: d */
    public final void mo220342d(String str, boolean z, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_default", String.valueOf(z));
        linkedHashMap.put("facelift_value", String.valueOf(i));
        m249852a(this, str, (String) null, "haul_facelift", linkedHashMap, (String) null, (JSONObject) null, 48, (Object) null);
    }

    /* renamed from: e */
    public final void mo220343e(String str, boolean z, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_default", String.valueOf(z));
        linkedHashMap.put("lipstick_value", String.valueOf(i));
        m249852a(this, str, (String) null, "haul_lipstick", linkedHashMap, (String) null, (JSONObject) null, 48, (Object) null);
    }

    /* renamed from: b */
    public final void mo220337b(String str, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "filterName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("labs_tab", "avatar");
        linkedHashMap.put("avatar_name", str2);
        m249853a(this, str, null, "choose_avatar", z, linkedHashMap, null, null, 96, null);
    }

    /* renamed from: b */
    public final void mo220339b(String str, boolean z, boolean z2) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_starting_auth", String.valueOf(z));
        if (z2) {
            str2 = "open";
        } else {
            str2 = "close";
        }
        linkedHashMap.put("option", str2);
        m249852a(this, str, (String) null, "mic", linkedHashMap, (String) null, (JSONObject) null, 48, (Object) null);
    }

    /* renamed from: a */
    public final void mo220329a(String str, boolean z, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_default", String.valueOf(z));
        linkedHashMap.put("buffing_value", String.valueOf(i));
        m249852a(this, str, (String) null, "haul_buffing", linkedHashMap, (String) null, (JSONObject) null, 48, (Object) null);
    }

    /* renamed from: b */
    public final void mo220338b(String str, boolean z, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str2, "backgroundType");
        Intrinsics.checkParameterIsNotNull(str3, "backgroundPicName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("labs_tab", "background");
        linkedHashMap.put("background_type", str2);
        linkedHashMap.put("background_picture_name", str3);
        m249853a(this, str, null, "choose_virtual_background", z, linkedHashMap, null, null, 96, null);
    }

    /* renamed from: a */
    private final void m249854a(String str, String str2, String str3, Map<String, String> map, String str4, JSONObject jSONObject) {
        boolean z;
        try {
            JSONObject jSONObject2 = new JSONObject();
            boolean z2 = false;
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    jSONObject2.put("env_id", str);
                }
            }
            String str5 = str2;
            if (str5 == null || str5.length() == 0) {
                z2 = true;
            }
            if (z2) {
                str2 = "none";
            }
            jSONObject2.put("target", str2);
            jSONObject2.put("click", str3);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            if (str4 != null) {
                jSONObject2.put(str4, jSONObject);
            }
            C63728b.m249928a("vc_meeting_pre_click", jSONObject2, null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingPreEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    private final void m249855a(String str, String str2, String str3, boolean z, Map<String, String> map, String str4, JSONObject jSONObject) {
        boolean z2;
        try {
            JSONObject jSONObject2 = new JSONObject();
            boolean z3 = false;
            if (str != null) {
                if (str.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    jSONObject2.put("env_id", str);
                }
            }
            String str5 = str2;
            if (str5 == null || str5.length() == 0) {
                z3 = true;
            }
            if (z3) {
                str2 = "none";
            }
            jSONObject2.put("target", str2);
            jSONObject2.put("click", str3);
            jSONObject2.put("is_starting_auth", z);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            if (str4 != null) {
                jSONObject2.put(str4, jSONObject);
            }
            C63728b.m249928a("vc_meeting_pre_click", jSONObject2, null);
        } catch (JSONException e) {
            C60700b.m235851b("MeetingPreEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m249852a(MeetingPreEvent uVar, String str, String str2, String str3, Map map, String str4, JSONObject jSONObject, int i, Object obj) {
        String str5;
        JSONObject jSONObject2;
        if ((i & 16) != 0) {
            str5 = null;
        } else {
            str5 = str4;
        }
        if ((i & 32) != 0) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject;
        }
        uVar.m249854a(str, str2, str3, map, str5, jSONObject2);
    }

    /* renamed from: a */
    public final void mo220327a(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, String str6, String str7, boolean z) {
        Intrinsics.checkParameterIsNotNull(str2, "backgroundStats");
        Intrinsics.checkParameterIsNotNull(str3, "backgroundType");
        Intrinsics.checkParameterIsNotNull(str4, "avatarStats");
        Intrinsics.checkParameterIsNotNull(str5, "touchUpStats");
        Intrinsics.checkParameterIsNotNull(jSONObject, "touchUpCustomValue");
        Intrinsics.checkParameterIsNotNull(str6, "filterStats");
        Intrinsics.checkParameterIsNotNull(str7, "filterValue");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("background_status", str2);
        linkedHashMap.put("background_type", str3);
        linkedHashMap.put("avatar_status", str4);
        linkedHashMap.put("touch_up_status", str5);
        linkedHashMap.put("filter_status", str6);
        linkedHashMap.put("filter_value", str7);
        linkedHashMap.put("is_cam_on", String.valueOf(z));
        m249854a(str, "vc_meeting_onthcall_view", "attend", linkedHashMap, "touch_up_custom_value", jSONObject);
    }

    /* renamed from: a */
    static /* synthetic */ void m249853a(MeetingPreEvent uVar, String str, String str2, String str3, boolean z, Map map, String str4, JSONObject jSONObject, int i, Object obj) {
        String str5;
        JSONObject jSONObject2;
        if ((i & 32) != 0) {
            str5 = null;
        } else {
            str5 = str4;
        }
        if ((i & 64) != 0) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject;
        }
        uVar.m249855a(str, str2, str3, z, map, str5, jSONObject2);
    }
}
