package com.ss.android.vc.statistics.event;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.background.FileStatus;
import com.ss.android.vc.entity.background.MaterialSource;
import com.ss.android.vc.entity.background.ViewDeviceSetting;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.irtc.RtcSystemUsageInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62269o;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.AnimojiEffect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.BeautifyEffect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.FilterEffect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62276a;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62277b;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62284e;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.LabsTouchUpTab;
import com.ss.android.vc.net.service.VCSyncGetService;
import com.ss.android.vc.statistics.p3182c.C63726b;
import com.ss.android.vc.statistics.p3183d.C63728b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.ac */
public class C63732ac {

    /* renamed from: a */
    private static Map<String, C63734a> f160872a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.statistics.event.ac$a */
    public static class C63734a {

        /* renamed from: a */
        int f160877a;

        /* renamed from: b */
        long f160878b;

        private C63734a() {
        }

        /* synthetic */ C63734a(C637331 r1) {
            this();
        }
    }

    /* renamed from: a */
    public static void m249968a(boolean z) {
        JSONObject b = C62269o.m243179b();
        if (TextUtils.isEmpty(b.optString("selectedAnimoji"))) {
            m249966a("avatar", false);
        } else {
            m249966a("avatar", z);
        }
        if (TextUtils.isEmpty(b.optString("selectedFilter"))) {
            m249966a("filter", false);
        } else {
            m249966a("filter", z);
        }
        List<EffectModel> d = C62228c.m243022d();
        if (d != null) {
            for (EffectModel effectModel : d) {
                if (b.has(effectModel.getResourceId()) && effectModel.getTagUserValue() > 0) {
                    m249966a("touch_up", z);
                    return;
                }
            }
        }
        m249966a("touch_up", false);
    }

    /* renamed from: a */
    private static void m249966a(String str, boolean z) {
        C63734a aVar;
        Map<String, C63734a> map = f160872a;
        if (map != null && (aVar = map.get(str)) != null) {
            if (!z) {
                if (aVar.f160878b > 0) {
                    aVar.f160877a = (int) (((long) aVar.f160877a) + (SystemClock.uptimeMillis() - aVar.f160878b));
                }
                aVar.f160878b = 0;
            } else if (aVar.f160878b == 0) {
                aVar.f160878b = SystemClock.uptimeMillis();
            }
        }
    }

    /* renamed from: a */
    public static void m249960a(C61303k kVar, boolean z) {
        boolean e = LabsUtils.m242913e();
        C60700b.m235851b("LabsEvent", "[muteCameraEvent]", z + ", " + e);
        if (e) {
            m249949a(C62269o.m243189g(), !z);
            m249968a(!z);
            m249977c(kVar, !z);
            m249972b(kVar, !z);
        }
    }

    /* renamed from: a */
    public static void m249962a(LabsScene labsScene, C61303k kVar, VirtualBackgroundInfo virtualBackgroundInfo) {
        C60700b.m235851b("LabsEvent", "[sendBackgroundEvent]", labsScene + ", sendBackgroundEvent: " + virtualBackgroundInfo.name);
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121869d, m249948a(virtualBackgroundInfo.isBlur, virtualBackgroundInfo.materialSource));
        hashMap.put("picture_name", m249946a(virtualBackgroundInfo));
        m249958a(kVar, m249970b(labsScene), "virtual_background", "", hashMap, null);
    }

    /* renamed from: a */
    public static void m249961a(LabsScene labsScene, C61303k kVar) {
        VideoChat videoChat;
        C60700b.m235851b("LabsEvent", "[sendCustomizeBackgroundClickEvent]", labsScene + ", sendCustomizeBackgroundClickEvent");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "third_background");
            jSONObject.put("target", "vc_meeting_popup_view");
            jSONObject.put("setting_tab", "effect");
            jSONObject.put("labs_tab", "background");
            if (kVar == null) {
                videoChat = null;
            } else {
                videoChat = kVar.mo212056e();
            }
            C63728b.m249928a("vc_meeting_setting_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("LabsEvent", "[sendCustomizeBackgroundClickEvent2]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m249951a(C61303k kVar, FileStatus fileStatus) {
        VideoChat videoChat;
        C60700b.m235851b("LabsEvent", "[sendUploadBackgroundFailEven]", "sendUploadBackgroundFailEvent, fileStatus = " + fileStatus);
        try {
            JSONObject jSONObject = new JSONObject();
            String str = "";
            int i = C637331.f160873a[fileStatus.ordinal()];
            if (i == 1) {
                str = "background_limit_size_vc";
            } else if (i == 2) {
                str = "background_limit_amount_vc";
            } else if (i == 3) {
                str = "background_limit_audit_vc";
            }
            jSONObject.put("content", str);
            if (kVar == null) {
                videoChat = null;
            } else {
                videoChat = kVar.mo212056e();
            }
            C63726b.m249915a("vc_meeting_popup_view", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("LabsEvent", "[sendUploadBackgroundFailEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m249963a(LabsScene labsScene, C61303k kVar, EffectModel effectModel) {
        String str = "close";
        if (effectModel instanceof AnimojiEffect) {
            HashMap hashMap = new HashMap();
            if (!effectModel.isDisabled) {
                str = effectModel.getName();
            }
            hashMap.put("avatar_name", str);
            m249956a(kVar, labsScene, m249970b(labsScene), "choose_avatar", "", hashMap, null);
        } else if (effectModel instanceof FilterEffect) {
            HashMap hashMap2 = new HashMap();
            if (!effectModel.isDisabled) {
                str = effectModel.getName();
            }
            hashMap2.put("filter_name", str);
            m249956a(kVar, labsScene, m249970b(labsScene), "choose_filter", "", hashMap2, null);
        }
    }

    /* renamed from: a */
    public static void m249952a(C61303k kVar, VirtualBackgroundInfo virtualBackgroundInfo) {
        if (kVar != null && !kVar.mo212092J().mo212504A()) {
            m249953a(kVar, virtualBackgroundInfo, true);
        }
    }

    /* renamed from: a */
    private static void m249953a(C61303k kVar, VirtualBackgroundInfo virtualBackgroundInfo, boolean z) {
        if (kVar != null && virtualBackgroundInfo != null) {
            m249959a(kVar, "background_status", !virtualBackgroundInfo.isDisabled && z, m249946a(virtualBackgroundInfo));
        }
    }

    /* renamed from: a */
    private static void m249959a(C61303k kVar, String str, boolean z, Object obj) {
        if (kVar != null) {
            C60700b.m235851b("LabsEvent", "[sendEffectStatus]", str + ":" + z + ", type:" + obj);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", UpdateKey.STATUS);
                jSONObject.put(str, z + "");
                if (!z) {
                    obj = "close";
                }
                jSONObject.put(ShareHitPoint.f121869d, obj);
                C63728b.m249928a("vc_meeting_onthecall_status", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                C60700b.m235864f("LabsEvent", "[sendEffectStatus]", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m249957a(C61303k kVar, EffectModel effectModel) {
        Pair<Boolean, JSONObject> a;
        if (kVar == null || kVar.mo212092J().mo212504A()) {
            return;
        }
        if (effectModel instanceof AnimojiEffect) {
            m249959a(kVar, "avatar_status", !effectModel.isDisabled, effectModel.getName());
        } else if (effectModel instanceof FilterEffect) {
            m249959a(kVar, "filter_status", !effectModel.isDisabled, effectModel.getName());
        } else if ((effectModel instanceof BeautifyEffect) && (a = m249945a()) != null) {
            m249959a(kVar, "touch_up_status", !((Boolean) a.first).booleanValue(), a.second);
        }
    }

    /* renamed from: a */
    public static void m249954a(C61303k kVar, RtcSystemUsageInfo rtcSystemUsageInfo, String str) {
        if (kVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", UpdateKey.STATUS);
                jSONObject.put("dynamic_monitor", "true");
                jSONObject.put("info", JSON.toJSON(rtcSystemUsageInfo));
                jSONObject.put("rule", str);
                C63728b.m249928a("vc_meeting_onthecall_status", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                C60700b.m235864f("LabsEvent", "[sendSystemOverLoaded]", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m249964a(LabsScene labsScene, C61303k kVar, AbstractC62283d dVar) {
        String str;
        if (dVar instanceof C62277b) {
            str = "tab_virtual_background";
        } else if (dVar instanceof C62276a) {
            str = "tab_avatar";
        } else if (dVar instanceof C62284e) {
            str = "tab_filter";
        } else {
            str = dVar instanceof LabsTouchUpTab ? "tab_touch_up" : "";
        }
        C60700b.m235851b("LabsEvent", "[sendOnTabSelectEvent]", labsScene + ", sendOnTabSelectEvent: " + str);
        m249958a(kVar, m249970b(labsScene), str, "", null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056 A[Catch:{ JSONException -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058 A[Catch:{ JSONException -> 0x0060 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m249955a(com.ss.android.vc.meeting.framework.meeting.C61303k r4, com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene r5, com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel.BeautifyStyle r6) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event.C63732ac.m249955a(com.ss.android.vc.meeting.framework.meeting.k, com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene, com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel$BeautifyStyle):void");
    }

    /* renamed from: a */
    private static void m249956a(C61303k kVar, LabsScene labsScene, String str, String str2, String str3, Map<String, String> map, JSONObject jSONObject) {
        VideoChat videoChat;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("from_source", str3);
            }
            jSONObject2.put("is_starting_auth", labsScene == LabsScene.PRE_WAITING_ROOM);
            if (map != null) {
                for (String str4 : map.keySet()) {
                    jSONObject2.put(str4, map.get(str4));
                }
            }
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            if (kVar == null) {
                videoChat = null;
            } else {
                videoChat = kVar.mo212056e();
            }
            C63726b.m249915a(str, jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m249958a(C61303k kVar, String str, String str2, String str3, Map<String, String> map, JSONObject jSONObject) {
        VideoChat videoChat;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("from_source", str3);
            }
            if (map != null) {
                for (String str4 : map.keySet()) {
                    jSONObject2.put(str4, map.get(str4));
                }
            }
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            if (kVar == null) {
                videoChat = null;
            } else {
                videoChat = kVar.mo212056e();
            }
            C63726b.m249915a(str, jSONObject2, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("LabsEvent", "[sendEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m249965a(LabsScene labsScene, boolean z, boolean z2) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", "setting_low_performance");
            if (labsScene == LabsScene.PAGE_PREVIEW) {
                str = "preview";
            } else if (labsScene == LabsScene.PAGE_WAITING_ROOMS) {
                str = "waiting_room";
            } else {
                str = labsScene == LabsScene.LABS_SETTING_PAGE ? "meeting_setting" : null;
            }
            jSONObject.put("location", str);
            jSONObject.put("is_cam_on", z);
            m249967a(jSONObject);
            if (z2) {
                jSONObject.put("click", "known");
                str2 = "vc_meeting_popup_click";
            } else {
                str2 = "vc_meeting_popup_view";
            }
            C63728b.m249928a(str2, jSONObject, null);
        } catch (JSONException e) {
            C60700b.m235864f("LabsEvent", "[sendLabsPagePopUpEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m249969a(boolean z, boolean z2, boolean z3) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", "onthecall_low_performance");
            jSONObject.put("location", "onthecall");
            jSONObject.put("is_cam_on", z);
            m249967a(jSONObject);
            if (z2) {
                str = "vc_meeting_popup_view";
            } else {
                if (z3) {
                    jSONObject.put("click", "stop_effect");
                } else {
                    jSONObject.put("click", "close");
                }
                str = "vc_meeting_popup_click";
            }
            C63728b.m249928a(str, jSONObject, null);
        } catch (JSONException e) {
            C60700b.m235864f("LabsEvent", "[sendLabsDynamicTipsEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    private static void m249967a(JSONObject jSONObject) {
        try {
            if (C62269o.m243179b().optInt("selectedBeautyStyle", -1) == EffectModel.BeautifyStyle.ORIGINAL.getValue()) {
                jSONObject.put("is_touch_up_on", "false");
            } else {
                jSONObject.put("is_touch_up_on", "true");
            }
            if (TextUtils.isEmpty(C62269o.m243179b().optString("selectedAnimoji"))) {
                jSONObject.put("is_avatar_on ", "false");
            } else {
                jSONObject.put("is_avatar_on ", "true");
            }
            if (TextUtils.isEmpty(C62269o.m243179b().optString("selectedFilter"))) {
                jSONObject.put("is_filter_on", "false");
            } else {
                jSONObject.put("is_filter_on", "true");
            }
            ViewDeviceSetting viewDeviceSetting = VCSyncGetService.getViewDeviceSetting();
            if (viewDeviceSetting != null && viewDeviceSetting.video != null) {
                if (viewDeviceSetting.video.backgroundBlur || !TextUtils.isEmpty(viewDeviceSetting.video.virtualBackground)) {
                    jSONObject.put("is_background_on", "true");
                } else {
                    jSONObject.put("is_background_on", "false");
                }
            }
        } catch (JSONException e) {
            C60700b.m235864f("LabsEvent", "[handleEffectData]", e.getMessage());
        }
    }

    /* renamed from: a */
    private static Pair<Boolean, JSONObject> m249945a() {
        JSONObject b = C62269o.m243179b();
        List<EffectModel> d = C62228c.m243022d();
        JSONObject jSONObject = new JSONObject();
        if (d == null || d.isEmpty()) {
            return null;
        }
        try {
            boolean z = true;
            boolean z2 = true;
            int i = 1;
            for (EffectModel effectModel : d) {
                int optInt = b.optInt(effectModel.getResourceId(), -1);
                if (optInt != -1) {
                    int i2 = 0;
                    if (optInt != 0) {
                        z = false;
                    }
                    if (optInt != effectModel.getTagDefaultValue()) {
                        z2 = false;
                    }
                    jSONObject.put("id" + i, effectModel.getResourceId());
                    jSONObject.put("value" + i, optInt);
                    String str = "is_default" + i;
                    if (optInt == effectModel.getTagDefaultValue()) {
                        i2 = 1;
                    }
                    jSONObject.put(str, i2);
                    i++;
                }
            }
            C60700b.m235851b("LabsEvent", "[getTouchUpState]", "touch_up close: " + z + ", def: " + z2);
            if (z2) {
                jSONObject.put("touch_up_state", "default");
            } else if (!z) {
                jSONObject.put("touch_up_state", "custom");
            }
            return new Pair<>(Boolean.valueOf(z), jSONObject);
        } catch (JSONException e) {
            C60700b.m235864f("LabsEvent", "[getTouchUpState]", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.statistics.event.ac$1 */
    public static /* synthetic */ class C637331 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160873a;

        /* renamed from: b */
        static final /* synthetic */ int[] f160874b;

        /* renamed from: c */
        static final /* synthetic */ int[] f160875c;

        /* renamed from: d */
        static final /* synthetic */ int[] f160876d;

        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|58) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|49|51|52|53|54|55|56|58) */
        /* JADX WARNING: Can't wrap try/catch for region: R(51:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|49|51|52|53|54|55|56|58) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|49|51|52|53|54|55|56|58) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0091 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00da */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00ff */
        static {
            /*
            // Method dump skipped, instructions count: 266
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event.C63732ac.C637331.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m249947a(LabsScene labsScene) {
        int i = C637331.f160874b[labsScene.ordinal()];
        if (i == 1 || i == 2) {
            return "vc_meeting_setting_click";
        }
        if (i == 3 || i == 4) {
            return "vc_meeting_pre_click";
        }
        return "";
    }

    /* renamed from: a */
    private static long m249944a(String str) {
        C63734a aVar;
        Map<String, C63734a> map = f160872a;
        if (map == null || (aVar = map.get(str)) == null) {
            return 0;
        }
        if (aVar.f160878b > 0) {
            aVar.f160877a = (int) (((long) aVar.f160877a) + (SystemClock.uptimeMillis() - aVar.f160878b));
        }
        aVar.f160878b = 0;
        return (long) (aVar.f160877a / 1000);
    }

    /* renamed from: b */
    private static String m249970b(LabsScene labsScene) {
        if (labsScene == LabsScene.LABS_SETTING_PAGE) {
            return "vc_labs_setting_page";
        }
        if (labsScene == LabsScene.PAGE_PREVIEW) {
            return "vc_meeting_page_preview";
        }
        if (labsScene == LabsScene.PAGE_WAITING_ROOMS) {
            return "vc_meeting_page_waiting_rooms";
        }
        if (labsScene == LabsScene.PRE_WAITING_ROOM) {
            return "vc_pre_waitingroom";
        }
        throw new IllegalArgumentException("" + labsScene);
    }

    /* renamed from: c */
    public static void m249976c(C61303k kVar) {
        if (kVar != null) {
            boolean e = LabsUtils.m242913e();
            C60700b.m235851b("LabsEvent", "[monitorOnTheCallAction]", "config = " + e);
            if (e) {
                m249987g(kVar);
                m249989i(kVar);
                m249983e(kVar);
            }
        }
    }

    /* renamed from: d */
    public static void m249980d(C61303k kVar) {
        boolean z;
        VideoChat videoChat;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("target", "vc_meeting_onthecall_view");
            if (!kVar.mo212092J().mo212504A()) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("is_cam_on", z);
            m249967a(jSONObject);
            if (kVar == null) {
                videoChat = null;
            } else {
                videoChat = kVar.mo212056e();
            }
            C63728b.m249928a("vc_meeting_setting_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("LabsEvent", "[sendLabsPageCloseEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static String m249946a(VirtualBackgroundInfo virtualBackgroundInfo) {
        if (virtualBackgroundInfo == null) {
            return "";
        }
        if (virtualBackgroundInfo.isDisabled) {
            return "no_background";
        }
        if (virtualBackgroundInfo.isBlur) {
            return "blur_my_background";
        }
        String str = virtualBackgroundInfo.name;
        MaterialSource materialSource = virtualBackgroundInfo.materialSource;
        if (materialSource == null) {
            return str;
        }
        switch (C637331.f160875c[materialSource.ordinal()]) {
            case 2:
                return virtualBackgroundInfo.name;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return "customized_background";
            case 11:
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "";
            default:
                return str;
        }
    }

    /* renamed from: b */
    public static void m249971b(C61303k kVar) {
        if (kVar != null) {
            boolean e = LabsUtils.m242913e();
            C60700b.m235851b("LabsEvent", "[monitorOnIdleAction]", "" + e);
            if (e) {
                m249988h(kVar);
                m249985f(kVar);
            }
        }
    }

    /* renamed from: g */
    private static void m249987g(C61303k kVar) {
        Participant j = kVar.mo212091I().mo212494b().mo212605j();
        boolean A = kVar.mo212092J().mo212504A();
        if (!(j == null || j.getParticipantSettings() == null)) {
            A = j.getParticipantSettings().isCameraMuted();
        }
        C60700b.m235851b("LabsEvent", "[sendOnTheCallEffectStatus]", "onthecall camera mute: " + A);
        if (!A) {
            m249977c(kVar, true);
            m249981d(kVar, true);
        }
    }

    /* renamed from: h */
    private static void m249988h(C61303k kVar) {
        Participant j = kVar.mo212091I().mo212494b().mo212605j();
        boolean A = kVar.mo212092J().mo212504A();
        if (!(j == null || j.getParticipantSettings() == null)) {
            A = j.getParticipantSettings().isCameraMuted();
        }
        C60700b.m235851b("LabsEvent", "[sendOnIdleEffectStatus]", "onidle camera mute: " + A);
        if (!A) {
            m249977c(kVar, false);
            m249981d(kVar, false);
        }
    }

    /* renamed from: e */
    private static void m249983e(C61303k kVar) {
        Participant j = kVar.mo212091I().mo212494b().mo212605j();
        boolean A = kVar.mo212092J().mo212504A();
        if (!(j == null || j.getParticipantSettings() == null)) {
            A = j.getParticipantSettings().isCameraMuted();
        }
        C60700b.m235851b("LabsEvent", "[recordStart]", "camera mute: " + A);
        HashMap hashMap = new HashMap();
        f160872a = hashMap;
        hashMap.put("virtual_background", new C63734a(null));
        f160872a.put("blur_my_background", new C63734a(null));
        f160872a.put("filter", new C63734a(null));
        f160872a.put("avatar", new C63734a(null));
        f160872a.put("touch_up", new C63734a(null));
        m249949a(C62269o.m243189g(), !A);
        m249968a(!A);
    }

    /* renamed from: f */
    private static void m249985f(C61303k kVar) {
        if (f160872a != null) {
            C60700b.m235851b("LabsEvent", "[recordStop]", "virtual_background-" + m249944a("virtual_background") + "," + "blur_my_background" + "-" + m249944a("blur_my_background") + "," + "avatar" + "-" + m249944a("avatar") + "," + "filter" + "-" + m249944a("filter") + "," + "touch_up" + "-" + m249944a("touch_up"));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("virtual_background", m249944a("virtual_background"));
                jSONObject.put("blur_my_background", m249944a("blur_my_background"));
                jSONObject.put("avatar", m249944a("avatar"));
                jSONObject.put("filter", m249944a("filter"));
                jSONObject.put("touch_up", m249944a("touch_up"));
            } catch (Exception e) {
                C60700b.m235864f("LabsEvent", "[recordStop]", e.getMessage());
            }
            f160872a = null;
            m249958a(kVar, "vc_labs", "vc_labs_inuse_duration", "", null, jSONObject);
        }
    }

    /* renamed from: i */
    private static void m249989i(C61303k kVar) {
        String str;
        int i;
        if (kVar.mo212057f() == VideoChat.Type.CALL) {
            str = "vc_call_page_onthecall";
        } else {
            str = "vc_meeting_page_onthecall";
        }
        HashMap hashMap = new HashMap();
        VirtualBackgroundInfo g = C62269o.m243189g();
        if (g != null) {
            hashMap.put(ShareHitPoint.f121869d, m249948a(g.isBlur, g.materialSource));
            hashMap.put("picture_name", m249946a(g));
            m249958a(kVar, str, "display_virtual_background", "", hashMap, null);
        }
        JSONObject b = C62269o.m243179b();
        HashMap hashMap2 = new HashMap();
        String optString = b.optString("selectedAnimojiName");
        if (TextUtils.isEmpty(optString)) {
            optString = "close";
        }
        hashMap2.put("avatar_name", optString);
        m249958a(kVar, str, "display_avatar", "", hashMap2, null);
        HashMap hashMap3 = new HashMap();
        String optString2 = b.optString("selectedFilterName");
        if (TextUtils.isEmpty(optString2)) {
            optString2 = "close";
        }
        hashMap3.put("filter_name", optString2);
        List<EffectModel> d = C62228c.m243022d();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (d != null && !d.isEmpty()) {
            try {
                boolean z = true;
                boolean z2 = true;
                int i2 = 1;
                for (EffectModel effectModel : d) {
                    int optInt = b.optInt(effectModel.getResourceId(), -1);
                    if (optInt != -1) {
                        if (optInt != 0) {
                            z = false;
                        }
                        if (optInt != effectModel.getTagDefaultValue()) {
                            z2 = false;
                        }
                        jSONObject2.put("id" + i2, effectModel.getResourceId());
                        jSONObject2.put("value" + i2, optInt);
                        String str2 = "is_default" + i2;
                        if (optInt == effectModel.getTagDefaultValue()) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject2.put(str2, i);
                        i2++;
                    }
                }
                C60700b.m235851b("LabsEvent", "[sendOnTheCallEffectEvent]", "touch_up close: " + z + ", def: " + z2);
                if (z) {
                    jSONObject.put("touch_up_state", "close");
                } else if (z2) {
                    jSONObject.put("touch_up_state", "default");
                } else {
                    jSONObject.put("touch_up_state", "custom");
                    jSONObject.put("custom_value", jSONObject2);
                }
            } catch (Exception e) {
                C60700b.m235864f("LabsEvent", "[sendOnTheCallEffectEvent]", e.getMessage());
            }
        }
        m249958a(kVar, str, "display_touch_up_and_filters", "", hashMap3, jSONObject);
    }

    /* renamed from: a */
    public static void m249950a(C61303k kVar) {
        C60700b.m235851b("LabsEvent", "[sendLabsPageEntryEvent]", "sendLabsPageEntryEvent");
        m249958a(kVar, "vc_meeting_page_onthecall", "vc_labs", "addition", null, null);
    }

    /* renamed from: b */
    private static void m249972b(C61303k kVar, boolean z) {
        m249981d(kVar, z);
    }

    /* renamed from: c */
    private static void m249977c(C61303k kVar, boolean z) {
        VirtualBackgroundInfo g = C62269o.m243189g();
        if (g != null && !g.isDisabled) {
            m249953a(kVar, g, z);
        }
    }

    /* renamed from: f */
    public static void m249986f(LabsScene labsScene, C61303k kVar) {
        C60700b.m235851b("LabsEvent", "[sendClickLabsEntryEvent]", labsScene + ", sendClickLabsEntryEvent");
        m249958a(kVar, m249970b(labsScene), "effect", "", null, null);
    }

    /* renamed from: c */
    public static void m249978c(LabsScene labsScene, C61303k kVar) {
        VideoChat videoChat;
        C60700b.m235851b("LabsEvent", "[sendCustomizeBackgroundPopupConfirmEvent]", labsScene + ", sendCustomizeBackgroundPopupConfirmEvent");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "confirm");
            jSONObject.put("content", "third_background");
            jSONObject.put("target", "none");
            if (kVar == null) {
                videoChat = null;
            } else {
                videoChat = kVar.mo212056e();
            }
            C63728b.m249928a("vc_meeting_popup_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("LabsEvent", "[sendCustomizeBackgroundPopupConfirmEvent2]", e.getMessage());
        }
    }

    /* renamed from: d */
    private static void m249981d(C61303k kVar, boolean z) {
        JSONObject b = C62269o.m243179b();
        String optString = b.optString("selectedAnimojiName");
        if (!TextUtils.isEmpty(optString)) {
            m249959a(kVar, "avatar_status", z, optString);
        }
        String optString2 = b.optString("selectedFilterName");
        if (!TextUtils.isEmpty(optString2)) {
            m249959a(kVar, "filter_status", z, optString2);
        }
        Pair<Boolean, JSONObject> a = m249945a();
        if (a != null && !((Boolean) a.first).booleanValue()) {
            m249959a(kVar, "touch_up_status", z, a.second);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[Catch:{ JSONException -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052 A[Catch:{ JSONException -> 0x005a }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m249984e(com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene r5, com.ss.android.vc.meeting.framework.meeting.C61303k r6) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event.C63732ac.m249984e(com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene, com.ss.android.vc.meeting.framework.meeting.k):void");
    }

    /* renamed from: b */
    public static void m249973b(LabsScene labsScene, C61303k kVar) {
        VideoChat videoChat;
        C60700b.m235851b("LabsEvent", "[sendCustomizeBackgroundPopupEvent]", labsScene + ", sendCustomizeBackgroundPopupEvent");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", "third_background");
            if (kVar == null) {
                videoChat = null;
            } else {
                videoChat = kVar.mo212056e();
            }
            C63728b.m249928a("vc_meeting_popup_view", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("LabsEvent", "[sendCustomizeBackgroundPopupEvent2]", e.getMessage());
        }
    }

    /* renamed from: d */
    public static void m249982d(LabsScene labsScene, C61303k kVar) {
        VideoChat videoChat;
        C60700b.m235851b("LabsEvent", "[sendCustomizeBackgroundPopupCancelEvent]", labsScene + ", sendCustomizeBackgroundPopupCancelEvent");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "cancel");
            jSONObject.put("content", "third_background");
            jSONObject.put("target", "none");
            if (kVar == null) {
                videoChat = null;
            } else {
                videoChat = kVar.mo212056e();
            }
            C63728b.m249928a("vc_meeting_popup_click", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("LabsEvent", "[sendCustomizeBackgroundPopupCancelEvent2]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static String m249948a(boolean z, MaterialSource materialSource) {
        if (z) {
            return "settings";
        }
        if (materialSource == null) {
            return "";
        }
        switch (C637331.f160875c[materialSource.ordinal()]) {
            case 1:
                return "settings";
            case 2:
                return "admin_background";
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return "customized";
            case 8:
                return "isv_customized_background";
            case 9:
                return "isv_background_uploaded_in_linchan";
            case 10:
                return "isv_system";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static void m249949a(VirtualBackgroundInfo virtualBackgroundInfo, boolean z) {
        if (virtualBackgroundInfo != null) {
            if (virtualBackgroundInfo.isBlur) {
                m249966a("blur_my_background", z);
                m249966a("virtual_background", false);
            } else if (virtualBackgroundInfo.isDisabled) {
                m249966a("virtual_background", false);
                m249966a("blur_my_background", false);
            } else {
                m249966a("virtual_background", z);
                m249966a("blur_my_background", false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056 A[Catch:{ JSONException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[Catch:{ JSONException -> 0x0082 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m249979c(com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene r4, com.ss.android.vc.meeting.framework.meeting.C61303k r5, com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d r6) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event.C63732ac.m249979c(com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene, com.ss.android.vc.meeting.framework.meeting.k, com.ss.android.vc.meeting.module.meetingdialog.labs.page.d):void");
    }

    /* renamed from: b */
    public static void m249974b(LabsScene labsScene, C61303k kVar, EffectModel effectModel) {
        int i = 1;
        if (effectModel instanceof FilterEffect) {
            if (!effectModel.isDisabled) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", effectModel.getResourceId());
                    jSONObject.put("value", effectModel.getTagUserValue());
                    if (effectModel.getTagUserValue() != effectModel.getTagDefaultValue()) {
                        i = 0;
                    }
                    jSONObject.put("is_default", i);
                } catch (Exception e) {
                    C60700b.m235864f("LabsEvent", "[sendChangeEffectValueEvent]", e.getMessage());
                }
                m249958a(kVar, m249970b(labsScene), "filter_change_value", "", null, jSONObject);
            }
        } else if (effectModel instanceof BeautifyEffect) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("id", effectModel.getResourceId());
                jSONObject2.put("value", effectModel.getTagUserValue());
                if (effectModel.getTagUserValue() != effectModel.getTagDefaultValue()) {
                    i = 0;
                }
                jSONObject2.put("is_default", i);
            } catch (Exception e2) {
                C60700b.m235864f("LabsEvent", "[sendChangeEffectValueEvent2]", e2.getMessage());
            }
            m249958a(kVar, m249970b(labsScene), "touch_up_change_value", "", null, jSONObject2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052 A[Catch:{ JSONException -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0054 A[Catch:{ JSONException -> 0x005c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m249975b(com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene r4, com.ss.android.vc.meeting.framework.meeting.C61303k r5, com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d r6) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event.C63732ac.m249975b(com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene, com.ss.android.vc.meeting.framework.meeting.k, com.ss.android.vc.meeting.module.meetingdialog.labs.page.d):void");
    }
}
