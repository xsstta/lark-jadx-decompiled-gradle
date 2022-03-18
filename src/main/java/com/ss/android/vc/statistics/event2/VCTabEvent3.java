package com.ss.android.vc.statistics.event2;

import android.text.TextUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3183d.C63728b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJL\u0010\u0006\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012J2\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012J<\u0010\u0013\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012J&\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u001e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018JD\u0010\u0019\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012J\u0006\u0010\u001a\u001a\u00020\u0007J\u0010\u0010\u001a\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/vc/statistics/event2/VCTabEvent3;", "", "()V", "TAG", "", "envId", "sendClickDetailEvent", "", "clickName", "target", "conferenceId", "meetingStatus", "Lcom/ss/android/vc/entity/MeetingStatus;", "isMeetType", "", "fromSource", ShareHitPoint.f121869d, "extraParams", "", "sendClickEvent", "sendClickGroupProfileEvent", "sendClickHistoryItemEvent", "sendDetailViewEvent", "meetingType", "Lcom/ss/android/vc/entity/VideoChat$Type;", "sendListViewEvent", "sendPageViewEvent", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.ah */
public final class VCTabEvent3 {

    /* renamed from: a */
    public static String f160815a;

    /* renamed from: b */
    public static final VCTabEvent3 f160816b = new VCTabEvent3();

    private VCTabEvent3() {
    }

    /* renamed from: a */
    public final void mo220245a() {
        mo220246a(f160815a);
    }

    static {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        f160815a = uuid;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m249746b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "conferenceId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("conference_id", str);
        VCTabEvent.f160814a.mo220244a(f160815a, "meeting_list", "vc_tab_list_view", linkedHashMap);
    }

    /* renamed from: a */
    public final void mo220246a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("env_id", str);
            }
            C63728b.m249928a("vc_tab_view", jSONObject, null);
        } catch (JSONException e) {
            C60700b.m235851b("VCTabEvent@", "[sendPageViewEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220252a(String str, String str2, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(str, "clickName");
        mo220251a(f160815a, str, str2, map);
    }

    /* renamed from: a */
    public final void mo220247a(String str, String str2, VideoChat.Type type) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "conferenceId");
        Intrinsics.checkParameterIsNotNull(str2, "fromSource");
        Intrinsics.checkParameterIsNotNull(type, "meetingType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("conference_id", str);
        int i = C63705ai.f160817a[type.ordinal()];
        if (i == 1) {
            str3 = "call";
        } else if (i != 2) {
            str3 = "";
        } else {
            str3 = "meeting";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(f160815a)) {
                jSONObject.put("env_id", f160815a);
            }
            jSONObject.put("from_source", str2);
            jSONObject.put("meeting_type", str3);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C63728b.m249928a("vc_tab_list_view", jSONObject, null);
        } catch (JSONException e) {
            C60700b.m235851b("VCTabEvent@", "[sendListViewEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220249a(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "clickName");
        Intrinsics.checkParameterIsNotNull(str2, "target");
        Intrinsics.checkParameterIsNotNull(str3, "conferenceId");
        Intrinsics.checkParameterIsNotNull(str4, "meetingStatus");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("conference_id", str3);
        mo220250a(f160815a, str, str2, str4, "meeting", linkedHashMap);
    }

    /* renamed from: a */
    public final void mo220251a(String str, String str2, String str3, Map<String, String> map) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str2, "clickName");
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z2 = false;
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    jSONObject.put("env_id", str);
                }
            }
            String str4 = str3;
            if (str4 == null || str4.length() == 0) {
                z2 = true;
            }
            if (z2) {
                str3 = "none";
            }
            jSONObject.put("target", str3);
            jSONObject.put("click", str2);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            C63728b.m249928a("vc_tab_click", jSONObject, null);
        } catch (JSONException e) {
            C60700b.m235851b("VCTabEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220248a(String str, String str2, String str3, MeetingStatus meetingStatus, boolean z) {
        String str4;
        String str5;
        Intrinsics.checkParameterIsNotNull(str, "clickName");
        Intrinsics.checkParameterIsNotNull(str2, "target");
        Intrinsics.checkParameterIsNotNull(str3, "conferenceId");
        Intrinsics.checkParameterIsNotNull(meetingStatus, "meetingStatus");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("conference_id", str3);
        if (C63705ai.f160818b[meetingStatus.ordinal()] != 1) {
            str4 = "ongoing";
        } else {
            str4 = "history";
        }
        if (z) {
            str5 = "meeting";
        } else if (!z) {
            str5 = "call";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mo220250a(f160815a, str, str2, str4, str5, linkedHashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[Catch:{ JSONException -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b A[Catch:{ JSONException -> 0x0074 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo220250a(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event2.VCTabEvent3.mo220250a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }
}
