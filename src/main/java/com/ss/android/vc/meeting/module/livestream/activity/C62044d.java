package com.ss.android.vc.meeting.module.livestream.activity;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.C60989x;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.aq;

/* renamed from: com.ss.android.vc.meeting.module.livestream.activity.d */
public class C62044d {
    /* renamed from: a */
    public static void m242417a(String str) {
        C61303k kVar;
        if (!TextUtils.isEmpty(str) && (kVar = (C61303k) MeetingManager.m238341a().getMeeting(str)) != null && kVar.mo212065n()) {
            kVar.am().mo214679d(true);
        }
    }

    /* renamed from: a */
    public static void m242416a(final Context context, final boolean z) {
        VcBizSender.m249274f("").mo219889a(new AbstractC63598b<C60989x>() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.C62044d.C620451 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("LiveAuthUtil", "[onError]", "<LiveAuth>");
            }

            /* renamed from: a */
            public void onSuccess(C60989x xVar) {
                C60700b.m235851b("LiveAuthUtil", "[onSuccess]", "<LiveAuth>");
                RealAuthenticationActivity.m242374a(context, "", z);
                aq.m250043a("vc_meeting_popup", "identity_verification_qrcode", "scan_success", (VideoChat) null);
            }
        });
    }
}
