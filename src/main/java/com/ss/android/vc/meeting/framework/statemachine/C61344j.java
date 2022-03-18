package com.ss.android.vc.meeting.framework.statemachine;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.EventSource;

/* renamed from: com.ss.android.vc.meeting.framework.statemachine.j */
public class C61344j {

    /* renamed from: a */
    public int f153703a;

    /* renamed from: b */
    public VideoChat f153704b;

    /* renamed from: c */
    private C61345k f153705c;

    /* renamed from: d */
    private EventSource f153706d;

    /* renamed from: e */
    private AbstractC61346l f153707e;

    private C61344j() {
    }

    /* renamed from: b */
    public C61345k mo212334b() {
        return this.f153705c;
    }

    /* renamed from: c */
    public EventSource mo212336c() {
        return this.f153706d;
    }

    /* renamed from: d */
    public AbstractC61346l mo212337d() {
        return this.f153707e;
    }

    /* renamed from: a */
    public static C61344j m239002a() {
        return new C61344j();
    }

    /* renamed from: a */
    public C61344j mo212329a(int i) {
        this.f153703a = i;
        return this;
    }

    /* renamed from: b */
    public void mo212335b(int i) {
        AbstractC61346l lVar = this.f153707e;
        if (lVar != null) {
            lVar.eventHandledOnState(i);
        }
    }

    /* renamed from: a */
    public C61344j mo212330a(VideoChat videoChat) {
        this.f153704b = videoChat;
        return this;
    }

    /* renamed from: a */
    public C61344j mo212331a(EventSource eventSource) {
        this.f153706d = eventSource;
        return this;
    }

    /* renamed from: a */
    public C61344j mo212332a(C61345k kVar) {
        this.f153705c = kVar;
        return this;
    }

    /* renamed from: a */
    public C61344j mo212333a(AbstractC61346l lVar) {
        this.f153707e = lVar;
        return this;
    }
}
