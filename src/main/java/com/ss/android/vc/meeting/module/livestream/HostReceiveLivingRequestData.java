package com.ss.android.vc.meeting.module.livestream;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.InMeetingData;

public class HostReceiveLivingRequestData {

    /* renamed from: a */
    private boolean f155804a;

    /* renamed from: b */
    private InMeetingData.LiveMeetingData f155805b;

    /* renamed from: c */
    private Step f155806c;

    public enum Step {
        Request,
        Setting,
        None
    }

    /* renamed from: a */
    public InMeetingData.LiveMeetingData mo214662a() {
        return this.f155805b;
    }

    /* renamed from: b */
    public boolean mo214665b() {
        return this.f155804a;
    }

    /* renamed from: c */
    public Step mo214666c() {
        C60700b.m235851b("HostReceiveLivingRequestDataLives", "[getCurrentStep]", "currentStep = " + this.f155806c);
        return this.f155806c;
    }

    /* renamed from: d */
    public void mo214667d() {
        C60700b.m235851b("HostReceiveLivingRequestDataLives", "[reset]", "reset");
        this.f155804a = false;
        this.f155806c = Step.None;
        this.f155805b = null;
    }

    /* renamed from: a */
    public void mo214663a(InMeetingData.LiveMeetingData liveMeetingData) {
        C60700b.m235851b("HostReceiveLivingRequestDataLives", "[cacheDataWhenShow]", "cacheDataWhenShow");
        this.f155804a = true;
        this.f155805b = liveMeetingData;
    }

    /* renamed from: a */
    public void mo214664a(Step step) {
        C60700b.m235851b("HostReceiveLivingRequestDataLives", "[setCurrentStep]", "step = " + step);
        this.f155806c = step;
    }
}
