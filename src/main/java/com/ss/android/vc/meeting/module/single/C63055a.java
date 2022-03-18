package com.ss.android.vc.meeting.module.single;

import android.os.Bundle;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60741ae;
import com.ss.android.vc.meeting.module.base.AbstractC61421c;
import com.ss.android.vc.meeting.module.fastentry.AbstractC61661d;
import com.ss.android.vc.meeting.module.floatingwindow.FloatWindowLaunchType;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.single.callingringing.observers.CallingBottomBtsObserver;
import com.ss.android.vc.meeting.module.single.callingringing.observers.CallingCreateRequestObserver;
import com.ss.android.vc.meeting.module.single.callingringing.observers.CrInviteTipsObserver;
import com.ss.android.vc.meeting.module.single.callingringing.observers.CrTopBtnsObserver;
import com.ss.android.vc.meeting.module.single.callingringing.observers.CrVectorLogObserver;
import com.ss.android.vc.meeting.module.single.callingringing.observers.PreviewAndUserInfoObserver;
import com.ss.android.vc.meeting.module.single.callingringing.observers.RingingBellObserver;
import com.ss.android.vc.meeting.module.single.callingringing.observers.RingingBottomBtnObserver;
import com.ss.android.vc.meeting.module.single.callingringing.observers.livedata.CallingRingingLiveDatas;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.statistics.event.C63765n;
import com.ss.android.vc.statistics.event2.MeetingCallingEvent;
import com.ss.android.vc.statistics.p3180a.C63687b;
import com.ss.android.vc.statistics.p3180a.C63693e;

/* renamed from: com.ss.android.vc.meeting.module.single.a */
public class C63055a extends AbstractC61421c implements AbstractC61661d {

    /* renamed from: c */
    protected boolean f158911c;

    /* renamed from: d */
    public int f158912d;

    /* renamed from: e */
    private VideoChatUser f158913e;

    /* renamed from: f */
    private View f158914f;

    /* renamed from: g */
    private Runnable f158915g = new Runnable() {
        /* class com.ss.android.vc.meeting.module.single.C63055a.RunnableC630561 */

        public void run() {
            if (C63055a.this.mo212965w() != null && C63055a.this.mo212965w().mo212165y() != null) {
                if (C63055a.this.f158912d == ByteRTCMeetingActivity.TYPE.CALL_RINGING.ordinal() || C63055a.this.f158912d == ByteRTCMeetingActivity.TYPE.MEET_RINGING.ordinal()) {
                    C60700b.m235851b("CallingRingingFragment@", "[initRtc]", "init rtc sdk");
                    C63055a.this.mo212965w().mo212165y().mo211989a();
                }
            }
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.base.AbstractC61421c
    /* renamed from: a */
    public int mo212878a() {
        return R.layout.fragment_calling_ringing_2;
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: q */
    public void mo212938q() {
        C60700b.m235851b("CallingRingingFragment@", "[onDestroy]", "onDestroy");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: C */
    public void mo212962C() {
        super.mo212962C();
        if (this.f158912d == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
            C63687b.m249667b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: o */
    public void mo212936o() {
        C60700b.m235851b("CallingRingingFragment@", "[onStop_]", "onStop_");
        if (this.f158912d == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
            C63687b.m249668c();
        }
    }

    /* renamed from: b */
    public void mo217876b() {
        C60700b.m235851b("CallingRingingFragment@", "[showFloatingWindowForAppTurnBackground]", "show");
        if (C28460b.m104296a(getActivity())) {
            if (this.f158912d == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
                C63693e.m249682a("calling");
            } else {
                C63693e.m249682a("single_ringing");
            }
            mo212965w().ae().mo213805a(0, FloatWindowLaunchType.BACK2FRONT);
        }
    }

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61661d
    public boolean bx_() {
        if (getActivity() == null || !C28460b.m104296a(getActivity())) {
            return false;
        }
        if (this.f158912d == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
            C63693e.m249682a("calling");
        } else {
            C63693e.m249682a("single_ringing");
        }
        mo212965w().ae().mo213805a(0, FloatWindowLaunchType.NORMAL);
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: p */
    public void mo212937p() {
        super.mo212937p();
        View view = this.f158914f;
        if (view != null) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.ringing_view);
            if (lottieAnimationView != null && lottieAnimationView.isAnimating()) {
                C60700b.m235851b("CallingRingingFragment@", "[onDestroyView_]", "cancelAnimation");
                lottieAnimationView.cancelAnimation();
            }
            C60741ae.m236055b(this.f158915g);
        }
    }

    /* renamed from: b */
    public static C63055a m246976b(boolean z) {
        C60700b.m235851b("CallingRingingFragment@", "[newRingingInstance]", "isFromFloat = " + z);
        return m246973a(ByteRTCMeetingActivity.TYPE.CALL_RINGING, z);
    }

    /* renamed from: c */
    public void mo217877c(boolean z) {
        View view;
        if (isAdded() && (view = this.f158914f) != null) {
            view.findViewById(R.id.calling_minimize).setEnabled(z);
        }
    }

    /* renamed from: a */
    public static C63055a m246974a(boolean z) {
        C60700b.m235851b("CallingRingingFragment@", "[newCallingInstance]", "isFromFloat = " + z);
        return m246973a(ByteRTCMeetingActivity.TYPE.CALLING, z);
    }

    /* renamed from: a */
    private void m246975a(VideoChatUser videoChatUser) {
        String str;
        if (!this.f158911c) {
            VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
            if (currentUser != null) {
                str = currentUser.getId();
            } else {
                str = "";
            }
            if (!(videoChatUser == null || videoChatUser.getId() == null)) {
                mo212965w().mo212092J().mo212523a(str, videoChatUser.getId());
            }
            if (this.f158912d == ByteRTCMeetingActivity.TYPE.CALLING.ordinal() && mo212965w().mo212056e() != null && mo212965w().mo212056e().isVoiceCall()) {
                mo212965w().mo212155b(true);
                mo212965w().mo212092J().mo212539e(true);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public void mo212927a(Bundle bundle) {
        if (mo212965w() == null) {
            C60700b.m235851b("CallingRingingFragment@", "[onCreate_]", "myMeeting is null ");
            return;
        }
        Bundle arguments = getArguments();
        C60700b.m235851b("CallingRingingFragment@", "[onCreate_2]", "arguments = " + arguments);
        if (arguments != null) {
            this.f158912d = arguments.getInt("key_type", -1);
            this.f158911c = arguments.getBoolean("key_is_from_float");
            VideoChatUser singleRemoteUser = mo212965w().mo212088F().getSingleRemoteUser();
            this.f158913e = singleRemoteUser;
            m246975a(singleRemoteUser);
            C60741ae.m236053a(this.f158915g);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static C63055a m246973a(ByteRTCMeetingActivity.TYPE type, boolean z) {
        C63055a aVar = new C63055a();
        Bundle bundle = new Bundle();
        bundle.putInt("key_type", type.ordinal());
        bundle.putBoolean("key_is_from_float", z);
        aVar.setArguments(bundle);
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.base.AbstractC61421c
    /* renamed from: a */
    public void mo212881a(View view, Bundle bundle) {
        C60700b.m235851b("CallingRingingFragment@", "[onInflated]", "type = " + this.f158912d);
        if (this.f158913e == null || mo212965w() == null) {
            C60700b.m235851b("CallingRingingFragment@", "[onInflated2]", "remote remoteUser is null ");
            return;
        }
        if (this.f158912d == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
            C63765n.m250319a(mo212965w().mo212056e());
            MeetingCallingEvent.m249787a().mo220275a(mo212965w().mo212056e(), mo212965w().mo212093K());
        }
        CallingRingingLiveDatas aVar = new CallingRingingLiveDatas();
        getLifecycle().addObserver(new CallingBottomBtsObserver(this, mo212965w(), aVar));
        getLifecycle().addObserver(new CrInviteTipsObserver(this, mo212965w(), aVar));
        getLifecycle().addObserver(new RingingBottomBtnObserver(this, mo212965w(), aVar));
        getLifecycle().addObserver(new CrTopBtnsObserver(this, mo212965w()));
        PreviewAndUserInfoObserver previewAndUserInfoObserver = new PreviewAndUserInfoObserver(this, mo212965w(), aVar);
        getLifecycle().addObserver(previewAndUserInfoObserver);
        getLifecycle().addObserver(new CallingCreateRequestObserver(this, mo212965w(), previewAndUserInfoObserver));
        getLifecycle().addObserver(new CrVectorLogObserver(this, mo212965w()));
        if (this.f158912d == ByteRTCMeetingActivity.TYPE.CALL_RINGING.ordinal()) {
            getLifecycle().addObserver(new RingingBellObserver(this, mo212965w()));
        }
        this.f158914f = view;
    }
}
