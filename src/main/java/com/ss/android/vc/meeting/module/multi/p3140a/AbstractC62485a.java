package com.ss.android.vc.meeting.module.multi.p3140a;

import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.multi.a.a */
public abstract class AbstractC62485a extends AbstractC61420b {

    /* renamed from: a */
    protected List<AbstractC62486a> f157195a = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.vc.meeting.module.multi.a.a$a */
    public interface AbstractC62486a {
        /* renamed from: a */
        void mo216038a(Participant participant, AbstractC62492f fVar);

        /* renamed from: a */
        void mo216039a(VideoChatInMeetingInfo videoChatInMeetingInfo);

        /* renamed from: a */
        void mo216040a(String str);

        /* renamed from: a */
        boolean mo216041a(Participant participant);

        /* renamed from: b */
        boolean mo216042b();

        /* renamed from: d */
        void mo216043d();
    }

    /* renamed from: a */
    public abstract void mo216031a(Participant participant, AbstractC62492f fVar);

    /* renamed from: a */
    public abstract void mo216033a(String str);

    /* renamed from: a */
    public abstract boolean mo216034a();

    /* renamed from: a */
    public abstract boolean mo216035a(Participant participant);

    /* renamed from: b */
    public abstract void mo216036b();

    /* renamed from: a */
    public void mo216032a(AbstractC62486a aVar) {
        this.f157195a.add(aVar);
    }

    /* renamed from: b */
    public void mo216037b(AbstractC62486a aVar) {
        this.f157195a.remove(aVar);
    }

    public AbstractC62485a(C61303k kVar) {
        super(kVar);
    }
}
