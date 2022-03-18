package com.ss.android.vc.statistics.event2;

import android.text.TextUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder;
import com.ss.android.vc.statistics.p3183d.C63728b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingShareWindowEvent;", "", "()V", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.y */
public final class MeetingShareWindowEvent {

    /* renamed from: a */
    public static final Companion f160861a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH\u0007JX\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH\u0007J@\u0010\u0012\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J2\u0010\u0015\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingShareWindowEvent$Companion;", "", "()V", "TAG", "", "sendClickEvent", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "clickName", ShareHitPoint.f121868c, "Lcom/ss/android/vc/meeting/module/follow/share/desktop/ShareContentViewHolder$SharePanelSource;", "envId", "target", "extraParams", "", "jsonObject", "Lorg/json/JSONObject;", "sendClickEventWithRank", "rank", "", "sendMagicShareDocClickEvent", "doc", "Lcom/ss/android/vc/entity/VcDoc;", "sendPageViewEvent", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.y$a */
    public static final class Companion {
        @JvmStatic
        /* renamed from: a */
        public final void mo220363a(C61303k kVar, String str, ShareContentViewHolder.SharePanelSource sharePanelSource, String str2) {
            m249898a(this, kVar, str, sharePanelSource, str2, null, null, 48, null);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220364a(C61303k kVar, String str, ShareContentViewHolder.SharePanelSource sharePanelSource, String str2, String str3) {
            m249898a(this, kVar, str, sharePanelSource, str2, str3, null, 32, null);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220362a(C61303k kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(kVar.mo212093K())) {
                    jSONObject.put("env_id", kVar.mo212093K());
                }
                C63728b.m249928a("vc_meeting_sharewindow_view", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                C60700b.m235851b("MeetingShareWindowEvent@", "[sendPageViewEvent]", "exception = " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220365a(C61303k kVar, String str, ShareContentViewHolder.SharePanelSource sharePanelSource, String str2, String str3, Map<String, String> map) {
            boolean z;
            VideoChat videoChat;
            String K;
            boolean z2;
            Intrinsics.checkParameterIsNotNull(str, "clickName");
            Intrinsics.checkParameterIsNotNull(sharePanelSource, ShareHitPoint.f121868c);
            try {
                JSONObject jSONObject = new JSONObject();
                boolean z3 = false;
                if (sharePanelSource == ShareContentViewHolder.SharePanelSource.FROM_OUT_TAB) {
                    jSONObject.put("env_id", str2);
                } else if (!(kVar == null || (K = kVar.mo212093K()) == null)) {
                    if (K.length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        jSONObject.put("env_id", kVar.mo212093K());
                    }
                }
                String str4 = str3;
                if (str4 == null || str4.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str3 = "none";
                }
                jSONObject.put("target", str3);
                jSONObject.put("click", str);
                int i = C63723z.f160863b[sharePanelSource.ordinal()];
                if (i == 1) {
                    z3 = true;
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONObject.put("is_vr_mirror", z3);
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                if (kVar != null) {
                    videoChat = kVar.mo212056e();
                } else {
                    videoChat = null;
                }
                C63728b.m249928a("vc_meeting_sharewindow_click", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235851b("MeetingShareWindowEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m249898a(Companion aVar, C61303k kVar, String str, ShareContentViewHolder.SharePanelSource sharePanelSource, String str2, String str3, Map map, int i, Object obj) {
            String str4;
            Map map2;
            if ((i & 16) != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            if ((i & 32) != 0) {
                map2 = null;
            } else {
                map2 = map;
            }
            aVar.mo220365a(kVar, str, sharePanelSource, str2, str4, map2);
        }
    }
}
