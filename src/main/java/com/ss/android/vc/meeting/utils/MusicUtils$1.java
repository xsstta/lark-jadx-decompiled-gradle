package com.ss.android.vc.meeting.utils;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener;
import com.ss.android.vc.meeting.framework.statemachine.C61367r;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.follow.p3121b.C61775b;
import com.ss.android.vc.meeting.module.foregroundservice.C61869a;
import com.ss.android.vc.meeting.module.guest.C61917a;
import com.ss.android.vc.trace.C63784a;
import java.util.List;

class MusicUtils$1 implements IMeetingsSizeChangeListener {
    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
    /* renamed from: a */
    public /* synthetic */ void mo208172a(List list) {
        IMeetingsSizeChangeListener.CC.$default$a(this, list);
    }

    MusicUtils$1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248699a() {
        MeetingAudioManager.m239471k().mo212714s();
        C63495h.m248840c();
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
    public void onMeetingsEnd() {
        C60700b.m235851b("MeetingAudioManager", "[onMeetingsEnd]", "continueMusic");
        C60735ab.m236017e().post($$Lambda$MusicUtils$1$lXX4p3eAch33IYTtVrX6LroNr_g.INSTANCE);
        C61775b.m241312a();
        C61869a.m241680a().mo214247b();
        C61917a.m241891a();
        C60700b.m235847b();
        C61367r.m239117a(ar.m236694a()).mo212393a();
        C63492g.m248825c();
        ProximityUtil.m248868a();
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
    public void onMeetingsBegin(boolean z) {
        C60735ab.m236017e().post(new Runnable(z) {
            /* class com.ss.android.vc.meeting.utils.$$Lambda$MusicUtils$1$9hoSie5gqY7fc06TeAhSEjWjU1M */
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                MusicUtils$1.m248700a(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248700a(boolean z) {
        C63784a.m250428a("[VideoChat_Music_beginMeet_2]");
        C63495h.m248836a();
        C60700b.m235840a();
        MeetingAudioManager.m239471k().mo212700e(z);
        C63784a.m250429b("[VideoChat_Music_beginMeet_2]");
    }
}
