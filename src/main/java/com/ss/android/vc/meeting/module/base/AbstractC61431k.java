package com.ss.android.vc.meeting.module.base;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p034e.p035a.C0978a;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.base.content.AbstractC61422a;
import com.ss.android.vc.meeting.module.base.content.AbstractC61423b;
import com.ss.android.vc.meeting.module.base.content.ContentViewType;
import com.ss.android.vc.meeting.module.bottombar.BottomBarViewControl;
import com.ss.android.vc.meeting.module.breakoutroom.C61519b;
import com.ss.android.vc.meeting.module.busyring.C61544d;
import com.ss.android.vc.meeting.module.chat.C61585g;
import com.ss.android.vc.meeting.module.codeinterview.CodeInterviewViewControl;
import com.ss.android.vc.meeting.module.fastentry.AbstractC61661d;
import com.ss.android.vc.meeting.module.gallery.GalleryViewControl;
import com.ss.android.vc.meeting.module.interpretation.p3126a.C61941e;
import com.ss.android.vc.meeting.module.livestream.C62071i;
import com.ss.android.vc.meeting.module.lobby.C62124e;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.multi.p3140a.C62489d;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import com.ss.android.vc.meeting.module.p3114c.C61550d;
import com.ss.android.vc.meeting.module.p3118e.C61604c;
import com.ss.android.vc.meeting.module.p3129j.C61998d;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.p3130k.p3131a.C62003a;
import com.ss.android.vc.meeting.module.p3132l.C62007c;
import com.ss.android.vc.meeting.module.p3156r.C62789c;
import com.ss.android.vc.meeting.module.reaction.ReactionViewControl;
import com.ss.android.vc.meeting.module.record.C62898e;
import com.ss.android.vc.meeting.module.sketch.SketchViewControl;
import com.ss.android.vc.meeting.module.speakrequest.C63114c;
import com.ss.android.vc.meeting.module.subtitle.C63190r;
import com.ss.android.vc.meeting.module.topbar.TopBarViewControl;
import com.ss.android.vc.meeting.module.toptips.TopTipsViewControl;
import com.ss.android.vc.meeting.utils.ProximityUtil;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import com.ss.android.vc.trace.C63784a;
import io.reactivex.p3457e.C68296b;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.base.k */
public abstract class AbstractC61431k extends C61434m implements AbstractC61423b, AbstractC61428h, AbstractC61661d {

    /* renamed from: a */
    public boolean f154015a;

    /* renamed from: b */
    protected BroadcastReceiver f154016b;

    /* renamed from: c */
    protected C61999a.AbstractC62001a f154017c;

    /* renamed from: d */
    protected FrameLayout f154018d;

    /* renamed from: e */
    protected FrameLayout f154019e;

    /* renamed from: f */
    protected FrameLayout f154020f;

    /* renamed from: g */
    protected final List<AbstractC61424d> f154021g = new LinkedList();

    /* renamed from: h */
    protected AbstractC61422a f154022h;

    /* renamed from: i */
    protected boolean f154023i;

    /* renamed from: j */
    protected GalleryViewControl f154024j;

    /* renamed from: k */
    private ViewGroup f154025k;

    /* renamed from: l */
    private FrameLayout f154026l;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m239696a(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo212928a(AbstractC61422a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo212931b(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo212932b(AbstractC61422a aVar);

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61423b
    /* renamed from: v */
    public Fragment mo212890v() {
        return this;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: d */
    public ViewGroup mo212919d() {
        return this.f154025k;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: e */
    public FrameLayout mo212920e() {
        return this.f154026l;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: g */
    public boolean mo212922g() {
        return this.f154015a;
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: p */
    public void mo212937p() {
        mo216097D();
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: q */
    public void mo212938q() {
        mo216100G();
    }

    /* renamed from: r */
    public GalleryViewControl mo212939r() {
        return this.f154024j;
    }

    /* renamed from: t */
    public FrameLayout mo212941t() {
        return this.f154019e;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: a */
    public Context mo212916a() {
        return getContext();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: b */
    public Activity mo212918b() {
        return getActivity();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: f */
    public C61303k mo212921f() {
        return mo212965w();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: j */
    public InMeetingPresenter mo212925j() {
        return mo212967y();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: k */
    public boolean mo212926k() {
        return isAdded();
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61423b
    /* renamed from: u */
    public FragmentManager mo212889u() {
        return getChildFragmentManager();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61428h
    /* renamed from: c */
    public boolean mo212915c() {
        AbstractC61422a aVar = this.f154022h;
        if (aVar != null) {
            return aVar.bS_();
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: h */
    public boolean mo212923h() {
        AbstractC61422a aVar = this.f154022h;
        if (aVar == null || aVar.mo212886g() != ContentViewType.SHARE_SCREEN) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: i */
    public boolean mo212924i() {
        AbstractC61422a aVar = this.f154022h;
        if (aVar == null || aVar.mo212886g() != ContentViewType.MAGIC_SHARE) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo212940s() {
        mo212965w().ar().mo216855b();
    }

    /* renamed from: G */
    private void mo216100G() {
        if (this.f154016b != null) {
            C0978a.m4782a(ar.m236694a()).mo4990a(this.f154016b);
            this.f154016b = null;
        }
    }

    /* renamed from: D */
    private void mo216097D() {
        for (AbstractC61424d dVar : this.f154021g) {
            if (dVar != null) {
                dVar.destroy();
            }
        }
        this.f154021g.clear();
        AbstractC61422a aVar = this.f154022h;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    /* renamed from: F */
    private void mo216099F() {
        C60700b.m235851b("MeetingCallFragment", "[registerReceiver]", "register");
        this.f154016b = new BroadcastReceiver() {
            /* class com.ss.android.vc.meeting.module.base.AbstractC61431k.C614321 */

            public void onReceive(Context context, Intent intent) {
                if ("action.broadcast.orientation".equals(intent.getAction())) {
                    C60700b.m235851b("MeetingCallFragment", "[onReceive]", "BC_ORIENTATION_ACTION");
                    AbstractC61431k.this.mo212929a(intent.getBooleanExtra("orientation_landscape", false), true);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action.broadcast.orientation");
        C0978a.m4782a(ar.m236694a()).mo4991a(this.f154016b, intentFilter);
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: l */
    public void mo212933l() {
        super.mo212933l();
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingCallFragment:onStart_");
        for (AbstractC61424d dVar : this.f154021g) {
            if (dVar != null) {
                dVar.onStart();
            }
        }
        AbstractC61422a aVar = this.f154022h;
        if (aVar != null) {
            aVar.onStart();
        }
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: m */
    public void mo212934m() {
        super.mo212934m();
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingCallFragment:onResume_");
        for (AbstractC61424d dVar : this.f154021g) {
            if (dVar != null) {
                dVar.onResume();
            }
        }
        AbstractC61422a aVar = this.f154022h;
        if (aVar != null) {
            aVar.onResume();
        }
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: n */
    public void mo212935n() {
        super.mo212935n();
        for (AbstractC61424d dVar : this.f154021g) {
            if (dVar != null) {
                dVar.onPause();
            }
        }
        AbstractC61422a aVar = this.f154022h;
        if (aVar != null) {
            aVar.onPause();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: o */
    public void mo212936o() {
        super.mo212936o();
        for (AbstractC61424d dVar : this.f154021g) {
            if (dVar != null) {
                dVar.onStop();
            }
        }
        AbstractC61422a aVar = this.f154022h;
        if (aVar != null) {
            aVar.onStop();
        }
    }

    /* renamed from: E */
    private void mo216098E() {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingCallFragment:initViewControls");
        this.f154021g.add(new C61604c(this));
        this.f154021g.add(new C62898e(this));
        this.f154021g.add(new C61998d(this));
        this.f154021g.add(new C62071i(this));
        this.f154021g.add(new C62789c(this, this.f154026l));
        this.f154021g.add(new C61544d(this, this.f154020f));
        this.f154021g.add(new ReactionViewControl(this));
        this.f154021g.add(new C61585g(this));
        this.f154021g.add(new C62124e(this));
        C68296b<Boolean> a2 = TimeConsumeUtils.m248927a("MeetingCallFragment:TopBarViewControl");
        this.f154021g.add(new TopBarViewControl(this));
        TimeConsumeUtils.m248928a(a2);
        C68296b<Boolean> a3 = TimeConsumeUtils.m248927a("MeetingCallFragment:BottomBarViewControl");
        this.f154021g.add(new BottomBarViewControl(this));
        TimeConsumeUtils.m248928a(a3);
        this.f154021g.add(new C63114c(this));
        this.f154021g.add(new C61941e(this));
        this.f154021g.add(new C61550d(this));
        GalleryViewControl fVar = new GalleryViewControl(this);
        this.f154024j = fVar;
        this.f154021g.add(fVar);
        this.f154021g.add(new C62489d(this));
        this.f154021g.add(new SketchViewControl(this));
        this.f154021g.add(new C63190r(this));
        this.f154021g.add(new C62007c(this));
        this.f154021g.add(new C61519b(this));
        this.f154021g.add(new CodeInterviewViewControl(this));
        this.f154021g.add(new TopTipsViewControl((AbstractC61429i) this, true));
        this.f154025k.post(new Runnable() {
            /* class com.ss.android.vc.meeting.module.base.$$Lambda$dZeQCbHq5ooa28NKEQ291FiaI */

            public final void run() {
                AbstractC61431k.this.mo212940s();
            }
        });
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: a */
    public <T extends View> T mo212917a(int i) {
        return (T) this.f154025k.findViewById(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        C60776r.m236145c();
        if (configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        mo212929a(z, true);
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public void mo212927a(Bundle bundle) {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingCallFragment:onCreate_");
        C63784a.m250428a("[VideoChat_MeetingCallFragment_onCreate_]");
        mo216099F();
        C63784a.m250429b("[VideoChat_MeetingCallFragment_onCreate_]");
        MeetingOnTheCallEvent2.m249823a().mo220307a(mo212965w().mo212093K(), false, mo212965w().mo212056e());
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61423b
    /* renamed from: c */
    public void mo212888c(AbstractC61422a aVar) {
        boolean z = true;
        if (aVar == null || this.f154018d == null || aVar == this.f154022h) {
            StringBuilder sb = new StringBuilder();
            sb.append("return = ");
            if (aVar != this.f154022h) {
                z = false;
            }
            sb.append(z);
            C60700b.m235851b("MeetingCallFragment", "[setContentViewControl]", sb.toString());
            return;
        }
        if (getActivity() instanceof ByteRTCMeetingActivity) {
            ByteRTCMeetingActivity byteRTCMeetingActivity = (ByteRTCMeetingActivity) getActivity();
            if (mo212965w() != null && mo212965w().aE().mo208293c() && byteRTCMeetingActivity != null && !byteRTCMeetingActivity.mo215863x()) {
                this.f154023i = true;
                C60700b.m235851b("MeetingCallFragment", "[setContentViewControl]", "activity is in backgound, delay");
                return;
            }
        }
        C60700b.m235851b("MeetingCallFragment", "[setContentViewControl2]", "type = " + aVar.mo212886g());
        View e = aVar.mo212884e();
        mo212928a(aVar);
        C60740ad.m236048a(this.f154018d, 8, 1000);
        this.f154018d.addView(e, new FrameLayout.LayoutParams(-1, -1));
        AbstractC61422a aVar2 = this.f154022h;
        if (aVar2 != null) {
            aVar2.mo212885f();
            mo212932b(this.f154022h);
        }
        this.f154022h = aVar;
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    public void a_(View view, Bundle bundle) {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingCallFragment:onViewCreated_");
        C63784a.m250428a("[VideoChat_MeetingCallFragment_onViewCreated_]");
        mo216098E();
        mo212931b(bundle);
        C63784a.m250429b("[VideoChat_MeetingCallFragment_onViewCreated_]");
        TimeConsumeUtils.m248928a(a);
    }

    /* renamed from: a */
    public void mo212929a(boolean z, boolean z2) {
        boolean z3;
        if (z || !MeetingAudioManager.m239471k().mo212681A()) {
            z3 = false;
        } else {
            z3 = true;
        }
        ProximityUtil.m248871a(z3);
        for (AbstractC61424d dVar : this.f154021g) {
            if (dVar != null) {
                dVar.onOrientation(z, z2);
            }
        }
        AbstractC61422a aVar = this.f154022h;
        if (aVar != null) {
            aVar.onOrientation(z, z2);
        }
        C62003a.m242249a();
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public final View mo212879a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingCallFragment:onCreateView_");
        C63784a.m250428a("[VideoChat_MeetingCallFragment_onCreateView]");
        ViewGroup viewGroup2 = (ViewGroup) C60748b.m236068a(getActivity(), R.layout.fragment_in_meeting_ui_skeleton, viewGroup, false);
        this.f154025k = viewGroup2;
        viewGroup2.setOnClickListener($$Lambda$k$Vz890i1x3U5Dil_YZKrzR3n6ng.INSTANCE);
        this.f154018d = (FrameLayout) this.f154025k.findViewById(R.id.container_content);
        this.f154019e = (FrameLayout) this.f154025k.findViewById(R.id.container_dialog);
        this.f154020f = (FrameLayout) this.f154025k.findViewById(R.id.busy_ringing_layout);
        this.f154026l = (FrameLayout) this.f154025k.findViewById(R.id.container_notice);
        C63784a.m250429b("[VideoChat_MeetingCallFragment_onCreateView]");
        TimeConsumeUtils.m248928a(a);
        return this.f154025k;
    }
}
