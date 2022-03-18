package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.request.CreateDocEntityRequest;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.u */
public class C63772u {

    /* renamed from: com.ss.android.vc.statistics.event.u$1 */
    static /* synthetic */ class C637731 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160944a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.vc.entity.request.CreateDocEntityRequest$CreateDocType[] r0 = com.ss.android.vc.entity.request.CreateDocEntityRequest.CreateDocType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.statistics.event.C63772u.C637731.f160944a = r0
                com.ss.android.vc.entity.request.CreateDocEntityRequest$CreateDocType r1 = com.ss.android.vc.entity.request.CreateDocEntityRequest.CreateDocType.DOC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.statistics.event.C63772u.C637731.f160944a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.request.CreateDocEntityRequest$CreateDocType r1 = com.ss.android.vc.entity.request.CreateDocEntityRequest.CreateDocType.SHEET     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.statistics.event.C63772u.C637731.f160944a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.request.CreateDocEntityRequest$CreateDocType r1 = com.ss.android.vc.entity.request.CreateDocEntityRequest.CreateDocType.BITABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.statistics.event.C63772u.C637731.f160944a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.entity.request.CreateDocEntityRequest$CreateDocType r1 = com.ss.android.vc.entity.request.CreateDocEntityRequest.CreateDocType.MINDNOTE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event.C63772u.C637731.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m250374a(VideoChat videoChat) {
        m250379a("create_new", "", (JSONObject) null, videoChat);
    }

    /* renamed from: b */
    public static void m250380b(VideoChat videoChat) {
        m250379a("search", "", (JSONObject) null, videoChat);
    }

    /* renamed from: a */
    public static void m250378a(CreateDocEntityRequest.CreateDocType createDocType, VideoChat videoChat) {
        int i = C637731.f160944a[createDocType.ordinal()];
        int i2 = 4;
        if (i == 1) {
            i2 = 1;
        } else if (i == 2) {
            i2 = 2;
        } else if (i == 3) {
            i2 = 3;
        } else if (i != 4) {
            i2 = 0;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("doc_type", i2);
            m250379a("create_file", "new_file_list", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250376a(VideoChat videoChat, String str, FollowInfo followInfo) {
        if (followInfo != null && followInfo.getShareType() == FollowInfo.ShareType.CCM) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("share_id", followInfo.getShareId());
                m250379a("start_sharecontent", str, jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250373a(int i, VcDoc vcDoc, String str, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rank", i);
            jSONObject.put("doc_type", vcDoc.getDocType().getNumber());
            jSONObject.put("sub_type", vcDoc.getDocSubType().getNumber());
            jSONObject.put("file_token", C57859q.m224565a(vcDoc.getDocToken()));
            m250379a("docs_file", str, jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250377a(VideoChat videoChat, boolean z, String str, boolean z2) {
        String str2;
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str2 = "ms_groot_channel_open";
            } else {
                str2 = "ms_groot_channel_open_failed";
            }
            jSONObject.put("action_name", str2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("share_id", str);
            }
            if (z2) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_presenter", i);
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m250379a(String str, String str2, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("from_source", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_onthecall_share_window", jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250375a(VideoChat videoChat, String str, int i, int i2, boolean z) {
        int i3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "ms_received_new_share");
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("share_id", str);
            }
            jSONObject.put("sub_type", i);
            jSONObject.put("follow_type", i2);
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_presenter", i3);
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
