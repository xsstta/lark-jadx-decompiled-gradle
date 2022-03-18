package com.ss.android.vc.net.request;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3080d.AbstractRunnableC60727j;
import com.ss.android.vc.common.p3080d.C60724i;
import com.ss.android.vc.common.p3080d.p3081a.C60712a;
import com.ss.android.vc.entity.MeetingFeedbackBean;

/* renamed from: com.ss.android.vc.net.request.c */
public class C63599c {
    /* renamed from: a */
    public static void m249416a(MeetingFeedbackBean meetingFeedbackBean) {
        C60724i.m235924a().mo208318a((AbstractRunnableC60727j) new C60712a("sync_key_meeting_feedback" + meetingFeedbackBean.meetingId, 3, VcBizSender.m249145a(meetingFeedbackBean), new AbstractC63598b<String>() {
            /* class com.ss.android.vc.net.request.C63599c.C636001 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C60700b.m235851b("VcBizSyncSender", "[submitMultiFeedback]", "success " + str);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VcBizSyncSender", "[submitMultiFeedback]", "error " + eVar.toString());
            }
        }).mo208307l());
    }
}
