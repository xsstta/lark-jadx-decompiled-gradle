package com.ss.android.vc.statistics.event2;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.MeetingSecuritySetting;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.p3183d.C63728b;
import java.util.LinkedHashMap;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0007J\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bJ\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bJ2\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingHostPanelEvent;", "", "()V", "sendClickEvent", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "clickName", "", "hostTab", "target", "extraParams", "", "sendJoinPermissionClickEvent", "securityLevel", "Lcom/ss/android/vc/entity/MeetingSecuritySetting$SecurityLevel;", "fromSource", "sendPageViewEvent", "sendSwitchCheckEvent", "isChecked", "", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.n */
public final class MeetingHostPanelEvent {

    /* renamed from: a */
    public static final Lazy f160840a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63713b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160841b = new Companion(null);

    /* renamed from: a */
    public static final MeetingHostPanelEvent m249805a() {
        return f160841b.mo220293a();
    }

    /* renamed from: b */
    public final void mo220292b(C61303k kVar, String str) {
        m249806a(this, kVar, str, (String) null, (String) null, (Map) null, 28, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingHostPanelEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event2/MeetingHostPanelEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/MeetingHostPanelEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.n$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingHostPanelEvent mo220293a() {
            Lazy lazy = MeetingHostPanelEvent.f160840a;
            Companion aVar = MeetingHostPanelEvent.f160841b;
            return (MeetingHostPanelEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private MeetingHostPanelEvent() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/MeetingHostPanelEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.n$b */
    static final class C63713b extends Lambda implements Function0<MeetingHostPanelEvent> {
        public static final C63713b INSTANCE = new C63713b();

        C63713b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingHostPanelEvent invoke() {
            return new MeetingHostPanelEvent(null);
        }
    }

    public /* synthetic */ MeetingHostPanelEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo220289a(C61303k kVar, String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(kVar.mo212093K())) {
                jSONObject.put("env_id", kVar.mo212093K());
            }
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    jSONObject.put("from_source", str);
                }
            }
            C63728b.m249928a("vc_meeting_hostpanel_view", jSONObject, kVar.mo212056e());
        } catch (JSONException e) {
            C60700b.m235851b("MeetingHostPanelEvent@", "[sendPageViewEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220288a(C61303k kVar, MeetingSecuritySetting.SecurityLevel securityLevel, String str) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(securityLevel, "securityLevel");
        Intrinsics.checkParameterIsNotNull(str, "fromSource");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String eventString = securityLevel.eventString();
        if (eventString == null) {
            eventString = "unknow";
        }
        linkedHashMap.put("option", eventString);
        linkedHashMap.put("from_source", str);
        mo220290a(kVar, "join_permission", "join_permission", "none", linkedHashMap);
    }

    /* renamed from: a */
    public final void mo220290a(C61303k kVar, String str, String str2, String str3, Map<String, String> map) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(str, "clickName");
        try {
            JSONObject jSONObject = new JSONObject();
            String K = kVar.mo212093K();
            boolean z3 = false;
            if (K != null) {
                if (K.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    jSONObject.put("env_id", kVar.mo212093K());
                }
            }
            if (str2 != null) {
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    jSONObject.put("host_tab", str2);
                }
            }
            String str4 = str3;
            if (str4 == null || str4.length() == 0) {
                z3 = true;
            }
            if (z3) {
                str3 = "none";
            }
            jSONObject.put("target", str3);
            jSONObject.put("click", str);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            C63728b.m249928a("vc_meeting_hostpanel_click", jSONObject, kVar.mo212056e());
        } catch (JSONException e) {
            C60700b.m235851b("MeetingHostPanelEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220291a(C61303k kVar, String str, String str2, boolean z, String str3) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(str, "hostTab");
        Intrinsics.checkParameterIsNotNull(str2, "clickName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_check", String.valueOf(z));
        if (str3 != null) {
            if (str3.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                linkedHashMap.put("from_source", str3);
            }
        }
        mo220290a(kVar, str2, str, (String) null, linkedHashMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.android.vc.statistics.b.n */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m249806a(MeetingHostPanelEvent nVar, C61303k kVar, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            map = null;
        }
        nVar.mo220290a(kVar, str, str2, str3, map);
    }

    /* renamed from: a */
    public static /* synthetic */ void m249807a(MeetingHostPanelEvent nVar, C61303k kVar, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        nVar.mo220291a(kVar, str, str2, z, str3);
    }
}
