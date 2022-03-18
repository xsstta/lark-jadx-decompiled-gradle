package com.ss.android.vc.meeting.framework.p3105a;

import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.C61275c;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61286c;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.statemachine.AbstractC61339e;

/* renamed from: com.ss.android.vc.meeting.framework.a.a */
public interface AbstractC61267a {
    /* renamed from: a */
    AbstractC61286c mo210462a();

    /* renamed from: a */
    AbstractC61294b mo210463a(VideoChat videoChat);

    /* renamed from: a */
    void mo210465a(boolean z, VideoChat videoChat);

    /* renamed from: a */
    boolean mo210466a(VideoChat videoChat, VideoChat videoChat2);

    /* renamed from: b */
    Participant mo210467b(VideoChat videoChat);

    /* renamed from: b */
    C61275c.AbstractC61280b mo210468b();

    /* renamed from: c */
    AbstractC61339e mo210469c();
}
