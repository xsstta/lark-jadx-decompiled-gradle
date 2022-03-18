package com.ss.android.vc.p3095h;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.C61266a;
import com.ss.android.vc.meeting.framework.manager.C61275c;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61286c;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61301i;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.C61311l;
import com.ss.android.vc.meeting.framework.meeting.C61315p;
import com.ss.android.vc.meeting.framework.meeting.C61320s;
import com.ss.android.vc.meeting.framework.meeting.C61331x;
import com.ss.android.vc.meeting.framework.p3105a.AbstractC61267a;
import com.ss.android.vc.meeting.framework.statemachine.AbstractC61339e;
import com.ss.android.vc.statistics.monitor.C63783e;

/* renamed from: com.ss.android.vc.h.a */
public class C61002a {
    /* renamed from: b */
    private static AbstractC61267a m237239b() {
        return new AbstractC61267a() {
            /* class com.ss.android.vc.p3095h.C61002a.C610031 */

            @Override // com.ss.android.vc.meeting.framework.p3105a.AbstractC61267a
            /* renamed from: a */
            public AbstractC61286c mo210462a() {
                return new C61315p();
            }

            @Override // com.ss.android.vc.meeting.framework.p3105a.AbstractC61267a
            /* renamed from: c */
            public AbstractC61339e mo210469c() {
                return new C61331x();
            }

            @Override // com.ss.android.vc.meeting.framework.p3105a.AbstractC61267a
            /* renamed from: b */
            public C61275c.AbstractC61280b mo210468b() {
                return new C61311l();
            }

            @Override // com.ss.android.vc.meeting.framework.p3105a.AbstractC61267a
            /* renamed from: b */
            public Participant mo210467b(VideoChat videoChat) {
                return MeetingUtil.m238370b(videoChat);
            }

            @Override // com.ss.android.vc.meeting.framework.p3105a.AbstractC61267a
            /* renamed from: a */
            public AbstractC61294b mo210463a(VideoChat videoChat) {
                C61303k kVar = new C61303k(videoChat);
                kVar.mo212050a(mo210464a(kVar));
                return kVar;
            }

            /* renamed from: a */
            public AbstractC61301i mo210464a(AbstractC61294b bVar) {
                return new C61320s(bVar);
            }

            @Override // com.ss.android.vc.meeting.framework.p3105a.AbstractC61267a
            /* renamed from: a */
            public void mo210465a(boolean z, VideoChat videoChat) {
                C63783e.m250420a(z, videoChat);
            }

            @Override // com.ss.android.vc.meeting.framework.p3105a.AbstractC61267a
            /* renamed from: a */
            public boolean mo210466a(VideoChat videoChat, VideoChat videoChat2) {
                return MeetingUtil.m238365a(videoChat, videoChat2);
            }
        };
    }

    /* renamed from: a */
    public static void m237238a() {
        C60700b.m235851b("MeetingModuleProvider", "[init]", "start");
        C61266a.m238333a(m237239b());
        C60700b.m235851b("MeetingModuleProvider", "[init]", "end");
    }
}
