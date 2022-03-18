package com.ss.android.vc.meeting.module.floatingwindow;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.ILKUIGlobalDialog;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.permission.AbstractC60798c;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.AbstractC60892h;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.irtc.AbstractC61025d;
import com.ss.android.vc.irtc.C61071u;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.irtc.utils.C61074b;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec;
import com.ss.android.vc.meeting.framework.statemachine.C61367r;
import com.ss.android.vc.meeting.model.C61373b;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.fastentry.AbstractC61660c;
import com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent;
import com.ss.android.vc.meeting.module.floatingwindow.MeetingFloatWindow;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.multi.gridcontent.TriggerType;
import com.ss.android.vc.meeting.module.p3117d.C61599a;
import com.ss.android.vc.meeting.module.p3130k.p3131a.C62003a;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vc.statistics.event.C63738ah;
import com.ss.android.vc.statistics.event.bk;
import com.ss.android.vc.statistics.event.ca;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@XClass(runOnProcess = XProcess.VC)
public class MeetingFloatWindow extends VCBaseFloatWindow implements View.OnClickListener, C61373b.AbstractC61374a, C61381c.AbstractC61382a, MeetingSpecificData.OnMeetingDataChangeListener, C61388g.AbstractC61393a, AbsBreakoutRoomControl.AbstractC61510d {

    /* renamed from: F */
    private ILKUIGlobalDialog f154794F;

    /* renamed from: G */
    private ILKUIGlobalDialog f154795G;

    /* renamed from: H */
    private String f154796H;

    /* renamed from: I */
    private final IFloatWindowPresent.FloatWindowType f154797I;

    /* renamed from: J */
    private AbstractC61732e f154798J;

    /* renamed from: K */
    private AbstractC61660c f154799K;

    /* renamed from: L */
    private View f154800L;

    /* renamed from: M */
    private boolean f154801M;

    /* renamed from: N */
    private C61689a f154802N;

    /* renamed from: O */
    private final FrameLayout.LayoutParams f154803O = new FrameLayout.LayoutParams(-1, -1);

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212617a(InterpreterSetting interpreterSetting, InterpreterSetting interpreterSetting2) {
        C61388g.AbstractC61393a.CC.$default$a(this, interpreterSetting, interpreterSetting2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212618a(LanguageType languageType, LanguageType languageType2) {
        C61388g.AbstractC61393a.CC.$default$a(this, languageType, languageType2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212619a(Participant participant) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212620a(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212486a(List list) {
        C61381c.AbstractC61382a.CC.$default$a(this, list);
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    /* renamed from: a */
    public void mo212578a(List<Participant> list, boolean z, String str, TriggerType triggerType) {
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    /* renamed from: a */
    public void mo212579a(List<Participant> list, boolean z, String str, TriggerType triggerType, HashSet<String> hashSet) {
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: b */
    public /* synthetic */ void mo212621b(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$b(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: b */
    public /* synthetic */ void mo212445b(boolean z) {
        C61373b.AbstractC61374a.CC.$default$b(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bB_() {
        C61388g.AbstractC61393a.CC.$default$bB_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bD_() {
        C61388g.AbstractC61393a.CC.$default$bD_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void bF_() {
        C61373b.AbstractC61374a.CC.$default$bF_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bG_() {
        C61388g.AbstractC61393a.CC.$default$bG_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: c */
    public /* synthetic */ void mo212449c(boolean z) {
        C61373b.AbstractC61374a.CC.$default$c(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void c_(String str, String str2) {
        C61373b.AbstractC61374a.CC.$default$c_(this, str, str2);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: d */
    public /* synthetic */ void mo212451d(boolean z) {
        C61373b.AbstractC61374a.CC.$default$d(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public /* synthetic */ void h_(boolean z) {
        C61381c.AbstractC61382a.CC.$default$h_(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void i_(boolean z) {
        C61373b.AbstractC61374a.CC.$default$i_(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void onOnlyPresenterCanAnnotateChanged(boolean z) {
        C61373b.AbstractC61374a.CC.$default$onOnlyPresenterCanAnnotateChanged(this, z);
    }

    @XMethod(isReleaseMethod = true)
    public void release() {
    }

    @XMethod(runOnProcess = XProcess.Main)
    private void postRefreshViewOnMain() {
        m240798C();
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    public void bE_() {
        m240796A();
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    /* renamed from: d */
    public void mo213204d() {
        m240796A();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo213688a(C61071u uVar) {
        if (this.f154801M) {
            onFrameOnMain(uVar.f152941a, uVar.f152942b, uVar.f152943c, uVar);
        } else {
            m240818b(uVar);
        }
    }

    /* renamed from: a */
    public void mo213687a(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        if (videoChatInMeetingInfo != null) {
            C26171w.m94675a(new Runnable(videoChatInMeetingInfo) {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$x4rzTzQEe8fCinTXySRcoqhF60 */
                public final /* synthetic */ VideoChatInMeetingInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    MeetingFloatWindow.this.m240817b((MeetingFloatWindow) this.f$1);
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    /* renamed from: a */
    public void mo212577a(String str) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$7JkbJd0ilnAil97MmqHLhenxrM */

            public final void run() {
                MeetingFloatWindow.this.m240802G();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211752a(String str, int i, int i2) {
        if (this.f154801M) {
            postRefreshViewOnMain();
        } else {
            m240798C();
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211750a(VcByteStream vcByteStream, String str) {
        mo213813e().mo212102T().mo212214a(vcByteStream, StreamSpec.Scene.GLOBAL_FLOAT_WINDOW, StreamSpec.Resolution.FLOAT_WINDOW, true);
        if (this.f154801M) {
            postRefreshViewOnMain();
        } else {
            m240798C();
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public void mo212487a(boolean z) {
        C60700b.m235851b("MeetingFloatWindow", "[onAllowPartiUnMuteChanged]", "" + z);
        if (!z) {
            ILKUIGlobalDialog cVar = this.f154794F;
            if (cVar != null && cVar.mo89213b()) {
                this.f154794F.mo89212a();
            }
            this.f154794F = null;
            mo213813e().aA().f155796b = false;
        }
    }

    /* renamed from: D */
    private void m240799D() {
        this.f154906c.callOnClick();
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m240804I() {
        this.f154827j.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m240805J() {
        this.f154825h.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m240806K() {
        this.f154802N.mo213703a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m240807L() {
        C61074b.m237509a(this.f154800L);
    }

    @XMethod
    private C61303k getVcMeeting() {
        return this.f154904a.mo213668m();
    }

    /* renamed from: v */
    private void m240838v() {
        refreshView();
        updateRecAndLiveView();
    }

    /* renamed from: y */
    private void m240841y() {
        this.f154834q.mo208474a();
    }

    /* renamed from: C */
    private void m240798C() {
        this.f154906c.post(new Runnable() {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$TQZWkaHP6xm_tb5JFY7tfUIGTQ */

            public final void run() {
                MeetingFloatWindow.this.refreshView();
            }
        });
    }

    /* renamed from: E */
    private void m240800E() {
        C60700b.m235851b("MeetingFloatWindow", "[hideContentView]", "hideContentView");
        this.f154906c.setVisibility(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m240802G() {
        if (this.f154801M) {
            postRefreshViewOnMain();
        } else {
            m240798C();
        }
    }

    @XMethod
    private boolean isRinging() {
        return this.f154904a.mo213668m().mo212063l();
    }

    @XMethod
    private boolean isWaiting() {
        return this.f154904a.mo213668m().mo212066o();
    }

    @XMethod
    private void unsubscribeFrame() {
        C61689a aVar = this.f154802N;
        if (aVar != null) {
            aVar.mo213702a();
        }
        this.f154802N = null;
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61729b, com.ss.android.vc.meeting.module.floatingwindow.AbstractC61734g
    /* renamed from: l */
    public void mo213667l() {
        C60700b.m235851b("MeetingFloatWindow", "[onInit]", "onInit");
        registerListeners();
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61729b
    /* renamed from: m */
    public void mo213690m() {
        C60700b.m235851b("MeetingFloatWindow", "[onShow]", "onShow");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo213695p() {
        C60700b.m235851b("MeetingFloatWindow", "[fromWaiting2OnTheCall]", "switch to on_the_call state");
        m240840x();
        m240838v();
    }

    /* renamed from: r */
    public void mo213697r() {
        C60700b.m235851b("MeetingFloatWindow", "[meetingWakeUp]", "wakeUp");
        m240799D();
    }

    /* renamed from: s */
    public void mo213699s() {
        C60700b.m235851b("MeetingFloatWindow", "[showContentView]", "showContentView");
        this.f154906c.setVisibility(0);
    }

    /* renamed from: A */
    private void m240796A() {
        setBreakoutRoomCoverVisibility(mo213813e().al().mo213186m(), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m240803H() {
        this.f154814B = UIHelper.getString(R.string.View_M_Interviewer);
        this.f154830m.setText(this.f154814B);
        mo213716u();
    }

    /* renamed from: x */
    private void m240840x() {
        C60700b.m235851b("MeetingFloatWindow", "[hideLobbyView]", "hide");
        if (this.f154834q != null) {
            this.f154834q.mo208477c();
            this.f154834q.setVisibility(8);
        }
    }

    /* renamed from: o */
    public void mo213692o() {
        ByteRtc y = this.f154904a.mo213668m().mo212165y();
        if (this.f154800L == null) {
            this.f154800L = y.mo211988a(false);
        }
        C26171w.m94675a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$sKkDDVhYRQiAP5katZtNmjJNgcs */

            public final void run() {
                MeetingFloatWindow.this.m240807L();
            }
        });
    }

    /* renamed from: q */
    public void mo213696q() {
        if (this.f154797I == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            this.f154798J.mo213677s();
        } else if (this.f154797I == IFloatWindowPresent.FloatWindowType.FAST_ENTRY) {
            this.f154799K.dismissFastEntry();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.MeetingFloatWindow$a */
    public static class C61689a implements AbstractC61025d {

        /* renamed from: a */
        protected String f154808a = "";

        /* renamed from: b */
        protected boolean f154809b = true;

        /* renamed from: c */
        protected boolean f154810c;

        /* renamed from: d */
        private MeetingFloatWindow f154811d;

        /* renamed from: a */
        public void mo213702a() {
            this.f154809b = false;
            MeetingFloatWindow meetingFloatWindow = this.f154811d;
            if (meetingFloatWindow != null) {
                if (this.f154810c) {
                    meetingFloatWindow.mo213813e().mo212165y().mo212009b((AbstractC61025d) null, this.f154808a);
                } else {
                    meetingFloatWindow.mo213813e().mo212165y().mo211996a((AbstractC61025d) null, this.f154808a);
                }
                this.f154811d = null;
            }
        }

        /* renamed from: a */
        public boolean mo213704a(String str) {
            return this.f154808a.equals(str);
        }

        @Override // com.ss.android.vc.irtc.AbstractC61025d
        /* renamed from: a */
        public void mo210648a(C61071u uVar) {
            MeetingFloatWindow meetingFloatWindow;
            if (this.f154809b && (meetingFloatWindow = this.f154811d) != null) {
                meetingFloatWindow.mo213688a(uVar);
            }
        }

        /* renamed from: a */
        public void mo213703a(MeetingFloatWindow meetingFloatWindow) {
            this.f154811d = meetingFloatWindow;
            if (meetingFloatWindow != null) {
                if (this.f154810c) {
                    meetingFloatWindow.mo213813e().mo212165y().mo212009b(this, this.f154808a);
                } else {
                    meetingFloatWindow.mo213813e().mo212165y().mo211996a(this, this.f154808a);
                }
            }
        }

        C61689a(String str, boolean z) {
            this.f154808a = str;
            this.f154810c = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m240801F() {
        mo213813e().mo212165y().mo212014c();
        mo213813e().mo212165y().mo212012b(mo213813e().mo212092J().mo212513J());
    }

    /* renamed from: w */
    private void m240839w() {
        this.f154834q.setVisibility(0);
        this.f154834q.setCornerRadius(C60773o.m236115a(8.0d));
        if (!mo213813e().mo212092J().mo212504A()) {
            m240841y();
        } else {
            m240842z();
        }
    }

    /* renamed from: z */
    private void m240842z() {
        if (C60788y.m236247a(ar.m236694a())) {
            this.f154835r.setVisibility(0);
        } else {
            this.f154827j.setVisibility(0);
        }
        AbstractC60892h chatDependency = VideoChatModuleDependency.getChatDependency();
        if (chatDependency != null) {
            chatDependency.getLoginChatter(new XIGetDataCallback<OpenChatter>() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.MeetingFloatWindow.C616873 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                @XMethod
                public void onError(ErrorResult errorResult) {
                    C60700b.m235864f("MeetingFloatWindow", "[getLoginChatter2]", "async onError: $errorResult");
                }

                @XMethod
                public void onSuccess(OpenChatter openChatter) {
                    C60700b.m235851b("MeetingFloatWindow", "[getLoginChatter]", "async success");
                    if (!TextUtils.isEmpty(openChatter.getAvatarKey())) {
                        C60783v.m236230a(openChatter.getAvatarKey(), openChatter.getId(), ParticipantType.LARK_USER, MeetingFloatWindow.this.f154835r, 60, 60);
                    }
                }
            });
        }
    }

    /* renamed from: B */
    private void m240797B() {
        String b = ParticipantUtil.m248728b(mo213813e());
        C60700b.m235851b("MeetingFloatWindow", "[unSubscribePrevAs]", "selfRtc = " + b + ", prevActiveRtcJoinId = " + this.f154796H);
        if (!TextUtils.isEmpty(this.f154796H)) {
            mo213813e().mo212102T().mo212215a(this.f154796H, StreamSpec.Scene.GLOBAL_FLOAT_WINDOW, StreamSpec.Resolution.UNKNOWN, true);
        }
    }

    @XMethod
    private void registerListeners() {
        MeetingAudioManager.m239471k().mo212685a(this);
        mo213813e().mo212092J().mo212520a(this);
        mo213813e().mo212091I().mo212490a().mo212468a(this);
        mo213813e().mo212091I().mo212498e().mo212443a(this);
        mo213813e().mo212091I().mo212494b().mo212593a(this);
        mo213813e().mo212164x().mo211751a(this);
        mo213813e().af().mo216821a(this);
        mo213813e().mo212105W().mo212845x();
        mo213813e().al().mo213165a(this);
    }

    @XMethod
    private void unregisterListeners() {
        MeetingAudioManager.m239471k().mo212693b(this);
        mo213813e().mo212092J().mo212528b(this);
        mo213813e().mo212164x().mo211761b(this);
        mo213813e().mo212091I().mo212490a().mo212470b(this);
        mo213813e().mo212091I().mo212498e().mo212444b(this);
        mo213813e().mo212091I().mo212494b().mo212597b(this);
        mo213813e().af().mo216824b(this);
        mo213813e().an().mo214605b(this);
        mo213813e().al().mo213171b(this);
        mo213813e().an().mo214604a(false);
    }

    @XMethod
    private void updateRecAndLiveView() {
        if (mo213813e().mo212091I() != null) {
            m240831h(mo213813e().mo212091I().mo212490a().mo212482n());
            if (mo213813e().mo212091I().mo212490a().mo212481m() != null) {
                m240833j(mo213813e().mo212091I().mo212490a().mo212481m().mo209943b());
            }
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public void bX_() {
        C60700b.m235851b("MeetingFloatWindow", "[onHostOpenCamera]", "" + this.f154795G);
        if (this.f154795G == null) {
            mo213813e().aA().f155795a = true;
            this.f154795G = VCDialogUtils.m236171a((int) R.string.View_M_HostCameraRequestStandard, 1, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$vzRS8uEcHOi2z0gZfmhZYqlRDSg */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    MeetingFloatWindow.this.m240816b((MeetingFloatWindow) dialogInterface, (DialogInterface) i);
                }
            }, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$TYtqlCGTjsnjCh0li7kAVhBjS8 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    MeetingFloatWindow.this.m240808a((MeetingFloatWindow) dialogInterface, (DialogInterface) i);
                }
            }, false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61729b, com.ss.android.vc.meeting.module.floatingwindow.VCBaseFloatWindow
    /* renamed from: n */
    public void mo213691n() {
        super.mo213691n();
        C60700b.m235851b("MeetingFloatWindow", "[onDismiss]", "onDismiss");
        unregisterListeners();
        try {
            ILKUIGlobalDialog cVar = this.f154795G;
            if (cVar != null && cVar.mo89213b()) {
                this.f154795G.mo89212a();
                this.f154795G = null;
            }
            ILKUIGlobalDialog cVar2 = this.f154794F;
            if (cVar2 != null && cVar2.mo89213b()) {
                this.f154794F.mo89212a();
                this.f154794F = null;
            }
        } catch (Exception e) {
            C60775q.m236136a(e.getMessage());
        }
        if (!this.f154801M) {
            mo213813e().mo212165y().mo211992a(this.f154800L);
        } else if (this.f154800L != null) {
            unsubscribeFrame();
            C61074b.m237513b(this.f154800L);
            this.f154800L = null;
        }
    }

    /* access modifiers changed from: private */
    @XMethod
    public void returnToVideoChatFragment() {
        mo213813e().mo212102T().mo212222c();
        if (this.f154904a.mo213668m().mo212063l()) {
            C60700b.m235841a(mo213813e().mo212056e(), "UI", "UI", "clickFloatOpenRingingFragment", "MeetingFloatWindow", "clickFloatOpenRingingFragment");
            C63693e.m249685b("multi_ringing");
            ByteRTCMeetingActivity.m244039b(mo213813e(), true);
            if (!mo213813e().mo212060i()) {
                C61367r.m239117a(ar.m236694a()).mo212395b();
            }
        } else if (this.f154904a.mo213668m().mo212066o()) {
            C60700b.m235841a(mo213813e().mo212056e(), "UI", "UI", "clickFloatOpenWaitingFragment", "MeetingFloatWindow", "clickFloatOpenWaitingFragment");
            C63693e.m249685b("lobby");
            ByteRTCMeetingActivity.m244043c(mo213813e(), true);
        } else {
            C60700b.m235841a(mo213813e().mo212056e(), "UI", "UI", "clickFloatOpenOnTheCallFragment", "MeetingFloatWindow", "clickFloatOpenOnTheCallFragment");
            C63693e.m249685b("onthecall");
            ByteRTCMeetingActivity.m244032a(mo213813e());
        }
        mo213696q();
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public void bC_() {
        int i;
        Integer num;
        boolean G = mo213813e().mo212092J().mo212510G();
        C60700b.m235851b("MeetingFloatWindow", "[onHostOpenMicrophone]", "mute = " + G + ", " + this.f154794F);
        if (this.f154794F == null) {
            mo213813e().aA().f155796b = true;
            if (G) {
                i = R.string.View_MV_HostAskTurnOnEcho;
            } else {
                i = R.string.View_M_HostMicRequestStandard;
            }
            $$Lambda$MeetingFloatWindow$BgaVIijeoLW05uodWwcgzQpJzo r5 = new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$BgaVIijeoLW05uodWwcgzQpJzo */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    MeetingFloatWindow.this.m240824d((MeetingFloatWindow) dialogInterface, (DialogInterface) i);
                }
            };
            $$Lambda$MeetingFloatWindow$ydzZiHmWnXdZcYDho0Jtx8n74M r7 = new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$ydzZiHmWnXdZcYDho0Jtx8n74M */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    MeetingFloatWindow.this.m240821c((MeetingFloatWindow) dialogInterface, (DialogInterface) i);
                }
            };
            if (G) {
                num = Integer.valueOf((int) R.color.function_danger_500);
            } else {
                num = null;
            }
            this.f154794F = VCDialogUtils.m236172a(i, 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) r5, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) r7, false, num);
            MeetingPopupEvent.m249838a().mo220317a("host_mic_on", mo213813e().mo212056e());
        }
    }

    /* access modifiers changed from: private */
    @XMethod
    public void refreshView() {
        String c = mo213813e().mo212092J().mo212531c();
        Participant a = mo213813e().mo212091I().mo212494b().mo212588a(c);
        boolean z = false;
        if (isInFollow()) {
            detachScreenShareView();
            C60700b.m235851b("MeetingFloatWindow", "[refreshView]", "refresh follow");
            if (!TextUtils.equals(mo213813e().mo212091I().mo212490a().mo212480l().getRawUrl(), this.f154839v)) {
                showFollowThumbnail();
            }
            m240797B();
            mo213813e().ay().mo216071c(true);
            this.f154796H = null;
        } else if (isInShareContent()) {
            C60700b.m235851b("MeetingFloatWindow", "[refreshView2]", "refresh screen stream");
            this.f154839v = null;
            processShareContent();
            m240797B();
            this.f154796H = null;
        } else {
            detachScreenShareView();
            C60700b.m235851b("MeetingFloatWindow", "[refreshView3]", "refresh video");
            setFollowThumbnailVisibility(8);
            setShareIconVisibility(8);
            this.f154839v = null;
            if (a != null && a.getStatus() == Participant.Status.ON_THE_CALL) {
                String b = ParticipantUtil.m248728b(mo213813e());
                if (!c.equals(this.f154796H)) {
                    m240797B();
                    this.f154796H = c;
                    if (this.f154800L != null) {
                        mo213813e().mo212165y().mo211992a(this.f154800L);
                    }
                    this.f154800L = mo213813e().mo212165y().mo211988a(false);
                    if (!c.equals(b)) {
                        mo213813e().mo212102T().mo212218b(this.f154800L, c);
                    } else {
                        mo213813e().mo212102T().mo212208a(this.f154800L, b);
                    }
                    C60740ad.m236044a(this.f154800L);
                }
                if (!TextUtils.isEmpty(c)) {
                    mo213813e().mo212102T().mo212215a(c, StreamSpec.Scene.GLOBAL_FLOAT_WINDOW, StreamSpec.Resolution.FLOAT_WINDOW, false);
                }
                boolean isCameraMuted = a.getParticipantSettings().isCameraMuted();
                if (b.equals(c) && mo213813e().mo212092J().mo212504A()) {
                    isCameraMuted = true;
                }
                if (!m240815a(isCameraMuted, TextUtils.equals(b, c))) {
                    boolean equals = b.equals(c);
                    if (!equals) {
                        mo213813e().mo212102T().mo212215a(c, StreamSpec.Scene.GLOBAL_FLOAT_WINDOW, StreamSpec.Resolution.FLOAT_WINDOW, a.getParticipantSettings().isCameraMuted());
                    }
                    m240822c(c, equals);
                }
                updateScreenStreamSubscribe(true);
            } else {
                return;
            }
        }
        if (mo213813e() != null && mo213813e().mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && mo213813e().mo212089G() == ParticipantRole.INTERVIEWEE) {
            z = true;
        }
        m240814a(getVcMeeting().mo212055d(), a, z);
    }

    @XMethod(runOnProcess = XProcess.Main)
    private void showAvatarOnMain(boolean z) {
        m240830g(z);
    }

    @XMethod(runOnProcess = XProcess.Main)
    private void showLiveViewOnMain(boolean z) {
        m240834k(z);
    }

    @XMethod(runOnProcess = XProcess.Main)
    private void showRecViewOnMain(boolean z) {
        m240832i(z);
    }

    /* renamed from: e */
    public void mo213689e(boolean z) {
        this.f154801M = z;
    }

    @XMethod(runOnProcess = XProcess.Main)
    public void onInMeetingInfoUpdateOnMain(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        mo213687a(videoChatInMeetingInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m240817b(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        if (videoChatInMeetingInfo != null) {
            refreshView();
            updateRecAndLiveView();
        }
    }

    /* renamed from: f */
    private void m240829f(boolean z) {
        if (this.f154801M) {
            showAvatarOnMain(z);
        } else {
            m240830g(z);
        }
    }

    /* renamed from: g */
    private void m240830g(boolean z) {
        C26171w.m94675a(new Runnable(z) {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$bpz6PZnFSeXAihu5LaiCfUwWTUI */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MeetingFloatWindow.this.m240837n(this.f$1);
            }
        });
    }

    /* renamed from: h */
    private void m240831h(boolean z) {
        if (this.f154801M) {
            showRecViewOnMain(z);
        } else {
            m240832i(z);
        }
    }

    /* renamed from: j */
    private void m240833j(boolean z) {
        if (this.f154801M) {
            showLiveViewOnMain(z);
        } else {
            m240834k(z);
        }
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    public void j_(boolean z) {
        if (this.f154801M) {
            postRefreshViewOnMain();
        } else {
            m240798C();
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f, com.ss.android.vc.meeting.module.floatingwindow.AbstractC61729b, com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        if (this.f154801M) {
            onInMeetingInfoUpdateOnMain(videoChatInMeetingInfo);
        } else {
            mo213687a(videoChatInMeetingInfo);
        }
    }

    /* renamed from: i */
    private void m240832i(boolean z) {
        if (z) {
            this.f154832o.setVisibility(0);
            this.f154833p.mo217344a();
            return;
        }
        this.f154832o.setVisibility(8);
        this.f154833p.mo217346b();
    }

    /* renamed from: k */
    private void m240834k(boolean z) {
        if (z) {
            this.f154831n.setVisibility(0);
        } else {
            this.f154831n.setVisibility(8);
        }
    }

    /* renamed from: b */
    private void m240818b(C61071u uVar) {
        if (this.f154825h.getVisibility() == 0) {
            C26171w.m94675a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$2mNUL2OMO5uWxYAuGONYf8v4DI */

                public final void run() {
                    MeetingFloatWindow.this.m240805J();
                }
            });
        }
        if (this.f154827j.getVisibility() == 0) {
            C26171w.m94675a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$amU6M_kgtUQWJTXDzuN6yzNwkPs */

                public final void run() {
                    MeetingFloatWindow.this.m240804I();
                }
            });
        }
        mo213813e().mo212165y().mo211994a(this.f154800L, uVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m240837n(boolean z) {
        this.f154823f.setVisibility(8);
        if (C60788y.m236247a(ar.m236694a()) || !z) {
            this.f154825h.setVisibility(0);
            this.f154827j.setVisibility(8);
            return;
        }
        this.f154827j.setVisibility(0);
        this.f154825h.setVisibility(8);
    }

    /* renamed from: l */
    private void m240835l(boolean z) {
        C60700b.m235851b("MeetingFloatWindow", "[doOpenMicrophone]", "doOpenMicrophone");
        Participant j = mo213813e().mo212091I().mo212494b().mo212605j();
        if (j == null || j.getParticipantSettings() == null || !(j.getParticipantSettings().getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST || j.getParticipantSettings().getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.UNKNOWN || j.getParticipantSettings().getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE)) {
            C60788y.m236249b(ar.m236694a(), new AbstractC60798c(z) {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$RiNlH4ZzbRAUYlXeuZJdY8vEiaY */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.vc.common.permission.AbstractC60798c
                public final void permissionGranted(boolean z) {
                    MeetingFloatWindow.this.m240826d((MeetingFloatWindow) this.f$1, z);
                }
            });
            return;
        }
        C60738ac.m236023a((int) R.string.View_VM_NoMicTip);
        C60700b.m235851b("MeetingFloatWindow", "[doOpenMicrophone2]", "no usable microphone device");
    }

    /* renamed from: m */
    private void m240836m(boolean z) {
        C60700b.m235851b("MeetingFloatWindow", "[doOpenCamera]", "doOpenCamera");
        Participant j = mo213813e().mo212091I().mo212494b().mo212605j();
        if (j == null || j.getParticipantSettings() == null || !(j.getParticipantSettings().getCameraStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST || j.getParticipantSettings().getCameraStatus() == ParticipantSettings.EquipmentStatus.UNKNOWN || j.getParticipantSettings().getCameraStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE)) {
            C60788y.m236246a(ar.m236694a(), new AbstractC60798c(z) {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$CMBPLxhJcAkC5QToaiL_MoWTzSc */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.vc.common.permission.AbstractC60798c
                public final void permissionGranted(boolean z) {
                    MeetingFloatWindow.this.m240823c((MeetingFloatWindow) this.f$1, z);
                }
            });
            return;
        }
        C60738ac.m236023a((int) R.string.View_VM_NoCameraTip);
        C60700b.m235851b("MeetingFloatWindow", "[doOpenCamera2]", "no usable camera device");
    }

    public void onClick(View view) {
        C60700b.m235851b("MeetingFloatWindow", "[onClick]", "isRinging" + isRinging());
        int[] iArr = new int[2];
        if (this.f154797I == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            if (this.f154798J.mo213580f() != null) {
                this.f154798J.mo213580f().getLocationOnScreen(iArr);
            }
        } else if (this.f154797I == IFloatWindowPresent.FloatWindowType.FAST_ENTRY && this.f154799K.mo213580f() != null) {
            this.f154799K.mo213580f().getLocationOnScreen(iArr);
        }
        if (this.f154815C || iArr[0] <= C60776r.m236139a() / 2) {
            returnToVideoChatFragment();
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f154906c, "translationX", 0.0f, (float) UIHelper.getDimens(R.dimen.fv_width));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.start();
            this.f154906c.postDelayed(new Runnable() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$mXaBFopl82RGcRGrJRE9LnTmps */

                public final void run() {
                    MeetingFloatWindow.this.returnToVideoChatFragment();
                }
            }, 100);
        }
        bk.m250184b(mo213813e().mo212056e(), this.f154797I);
    }

    /* renamed from: a */
    private void m240811a(VideoChat videoChat) {
        String str = "";
        try {
            str = videoChat.getVideoChatSettings().getTopic();
            if (mo213813e().mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                HashMap hashMap = new HashMap();
                hashMap.put("name", str);
                str = UIHelper.mustacheFormat((int) R.string.View_M_VideoInterviewNameBraces, hashMap);
            }
        } catch (Exception e) {
            C60700b.m235864f("MeetingFloatWindow", "[initRingingView]", "title error" + e.toString());
        }
        this.f154814B = str;
        this.f154830m.setText(this.f154814B);
        int dpFromDimenXml = DeviceUtils.getDpFromDimenXml(ar.m236694a(), R.dimen.fv_avatar_size);
        String inviteId = videoChat.getInviteId();
        ParticipantType inviterType = videoChat.getInviterType();
        UserInfoService.getUserInfoById(mo213813e().mo212055d(), inviteId, inviterType, new GetUserInfoListener(inviterType, dpFromDimenXml) {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$xnc01JyNzG6ws82eUcTRRXpcQ */
            public final /* synthetic */ ParticipantType f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.vc.net.service.GetUserInfoListener
            public final void onGetUserInfo(VideoChatUser videoChatUser) {
                MeetingFloatWindow.this.m240810a((MeetingFloatWindow) this.f$1, (ParticipantType) this.f$2, (int) videoChatUser);
            }
        });
        this.f154828k.setText(R.string.View_G_Ringing);
        this.f154828k.setVisibility(0);
        this.f154825h.setVisibility(0);
        if (!TextUtils.isEmpty(this.f154814B)) {
            this.f154824g.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo213686a(long j) {
        C61303k vcMeeting = getVcMeeting();
        boolean isRinging = isRinging();
        boolean isWaiting = isWaiting();
        C60700b.m235851b("MeetingFloatWindow", "[showFloat]", "meetingId = " + vcMeeting.mo212055d() + ", isRinging = " + isRinging);
        mo213715t();
        this.f154906c.setOnClickListener(this);
        this.f154904a.mo213667l();
        m240800E();
        $$Lambda$MeetingFloatWindow$FlBFDj2kBYDUBwEJQWb8xtOZVXQ r0 = new Runnable(isRinging, isWaiting) {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$FlBFDj2kBYDUBwEJQWb8xtOZVXQ */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                MeetingFloatWindow.this.m240828e((MeetingFloatWindow) this.f$1, this.f$2);
            }
        };
        if (j == 0) {
            j = -1;
        }
        C60735ab.m236002a(r0, j);
    }

    @XMethod(runOnProcess = XProcess.Main)
    private void refreshViewInternalOnMain(String str, boolean z) {
        m240825d(str, z);
    }

    @XMethod(runOnProcess = XProcess.Main)
    private boolean switchToAvatarOnMain(boolean z, boolean z2) {
        return m240820b(z, z2);
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    public void a_(String str, String str2) {
        setBreakoutRoomCoverVisibility(null, 8);
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    /* renamed from: d */
    public void mo213205d(String str, String str2) {
        setBreakoutRoomCoverVisibility(null, 8);
    }

    /* renamed from: c */
    private void m240822c(String str, boolean z) {
        if (this.f154801M) {
            refreshViewInternalOnMain(str, z);
        } else {
            m240825d(str, z);
        }
    }

    /* renamed from: d */
    private void m240825d(String str, boolean z) {
        C26171w.m94675a(new Runnable(str, z) {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$kq7QJGyzXx0u42ppmdh9s5ZpYcc */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                MeetingFloatWindow.this.m240827e((MeetingFloatWindow) this.f$1, (String) this.f$2);
            }
        });
    }

    public MeetingFloatWindow(IFloatWindowPresent iFloatWindowPresent, IFloatWindowPresent.FloatWindowType floatWindowType) {
        super(iFloatWindowPresent, floatWindowType);
        this.f154797I = floatWindowType;
        if (floatWindowType == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            this.f154798J = (AbstractC61732e) iFloatWindowPresent;
        } else if (floatWindowType == IFloatWindowPresent.FloatWindowType.FAST_ENTRY) {
            this.f154799K = (AbstractC61660c) iFloatWindowPresent;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m240808a(DialogInterface dialogInterface, int i) {
        mo213813e().aA().f155795a = false;
        this.f154795G = null;
        ca.m250248e(mo213813e().mo212056e());
        m240836m(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m240816b(DialogInterface dialogInterface, int i) {
        mo213813e().aA().f155795a = false;
        this.f154795G = null;
        ca.m250249f(mo213813e().mo212056e());
    }

    @XMethod
    private boolean subscribeFrame(String str, boolean z) {
        C61689a aVar = this.f154802N;
        if (aVar != null && aVar.mo213704a(str)) {
            return false;
        }
        unsubscribeFrame();
        this.f154802N = new C61689a(str, z);
        C26171w.m94675a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$X3w94AIJjWVhINs4jIkCXzlfhqY */

            public final void run() {
                MeetingFloatWindow.this.m240806K();
            }
        });
        return true;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: c */
    public void mo211770c(String str, String str2) {
        mo213813e().mo212102T().mo212216a(str2, false);
        if (this.f154801M) {
            postRefreshViewOnMain();
        } else {
            m240798C();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m240821c(DialogInterface dialogInterface, int i) {
        mo213813e().aA().f155796b = false;
        this.f154794F = null;
        ca.m250250g(mo213813e().mo212056e());
        MeetingPopupEvent.m249838a().mo220318a("confirm", "host_mic_on", mo213813e().mo212056e());
        m240835l(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m240824d(DialogInterface dialogInterface, int i) {
        mo213813e().aA().f155796b = false;
        this.f154794F = null;
        ca.m250251h(mo213813e().mo212056e());
        MeetingPopupEvent.m249838a().mo220318a("cancel", "host_mic_on", mo213813e().mo212056e());
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public void onSelfRtcModeUpdate(Participant participant, Participant participant2) {
        if (participant != null && participant2 != null && participant.getParticipantSettings() != null && participant2.getParticipantSettings() != null && participant.getParticipantSettings().getRtcMode() != participant2.getParticipantSettings().getRtcMode()) {
            mo213813e().mo212165y().mo212013c(participant2.getParticipantSettings().getRtcMode().getNumber());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m240823c(boolean z, boolean z2) {
        C60700b.m235851b("MeetingFloatWindow", "[doOpenCamera3]", "isGranted = " + z2);
        if (z2) {
            C60735ab.m236018e(new Runnable() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$5A2x8JFtwZ8GpFmORMn9x6TUQPM */

                public final void run() {
                    MeetingFloatWindow.this.m240801F();
                }
            });
            VcBizService.muteCamera(mo213813e().mo212055d(), false, z, C60788y.m236247a(ar.m236694a()));
            mo213813e().mo212092J().mo212539e(false);
            mo213813e().mo212165y().mo212018d(false);
            C60738ac.m236037c((int) R.string.View_VM_YouTurnedOnCamera);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m240826d(boolean z, boolean z2) {
        String str;
        C60700b.m235851b("MeetingFloatWindow", "[doOpenMicrophone3]", "isGranted = " + z2);
        if (z2) {
            boolean b = C60788y.m236250b(ar.m236694a());
            if (!mo213813e().al().mo213182i() || mo213813e().al().mo213184k() == null) {
                str = "";
            } else {
                str = mo213813e().al().mo213184k().getBreakoutRoomId();
            }
            VcBizService.muteAudio(mo213813e().mo212055d(), str, false, z, b);
            mo213813e().mo212092J().mo212542f(false);
            mo213813e().mo212165y().mo212016c(false);
            C60738ac.m236037c((int) R.string.View_G_YouTurnedOnMic);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m240827e(String str, boolean z) {
        this.f154823f.setVisibility(0);
        if (this.f154801M) {
            if (!subscribeFrame(str, z)) {
                return;
            }
        } else if (this.f154800L.getParent() != null && this.f154800L.getParent() == this.f154823f) {
            return;
        }
        if (C60788y.m236247a(ar.m236694a())) {
            this.f154825h.setVisibility(0);
        } else {
            this.f154827j.setVisibility(0);
        }
        C61074b.m237511a(this.f154800L, C60773o.m236126d(R.color.vc_bg_float_video));
        C61074b.m237510a(this.f154800L, (float) C60773o.m236115a(8.0d));
        mo213813e().mo212165y().mo211993a(this.f154800L, new C61599a("MeetingFloatWindow") {
            /* class com.ss.android.vc.meeting.module.floatingwindow.MeetingFloatWindow.C616884 */

            @Override // com.ss.android.vc.meeting.module.p3117d.C61599a, com.ss.android.vc.irtc.AbstractC61030i
            /* renamed from: a */
            public void mo210658a() {
                C62003a.m242249a();
                C60735ab.m236001a(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$4$Clw9Pzax4ZR5fSktGqKOIPGA_SA */

                    public final void run() {
                        MeetingFloatWindow.C616884.this.m240875e();
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m240875e() {
                MeetingFloatWindow.this.f154825h.setVisibility(8);
                MeetingFloatWindow.this.f154827j.setVisibility(8);
                int childCount = MeetingFloatWindow.this.f154823f.getChildCount() - 1;
                if (childCount > 0) {
                    MeetingFloatWindow.this.f154823f.removeViews(1, childCount);
                    C60700b.m235851b("MeetingFloatWindow", "[onBeginRender]", "remove last " + childCount + "view surface");
                    return;
                }
                C60700b.m235851b("MeetingFloatWindow", "[onBeginRender2]", "cancel! surfaceLayout.getChildCount：" + MeetingFloatWindow.this.f154823f.getChildCount());
            }
        });
        this.f154823f.removeAllViews();
        this.f154823f.addView(this.f154800L, 0, this.f154803O);
        mo213813e().an().mo214602a(this);
    }

    /* renamed from: b */
    private boolean m240820b(boolean z, boolean z2) {
        if (!z) {
            return false;
        }
        m240829f(z2);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m240828e(boolean z, boolean z2) {
        m240812a(this.f154904a.mo213668m().mo212056e(), z, z2);
        if (this.f154797I == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            if (!this.f154798J.mo213675q()) {
                C60700b.m235851b("MeetingFloatWindow", "[showFloat2]", "bubble showFloat show, " + this.f154815C);
                if (this.f154815C) {
                    this.f154798J.mo213676r();
                    this.f154906c.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    mo213699s();
                    return;
                }
                this.f154798J.mo213676r();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f154906c, "translationX", (float) UIHelper.getDimens(R.dimen.fv_width), 0.0f);
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(new AccelerateInterpolator());
                ofFloat.addListener(new C61740j() {
                    /* class com.ss.android.vc.meeting.module.floatingwindow.MeetingFloatWindow.C616851 */

                    @Override // com.ss.android.vc.meeting.module.floatingwindow.C61740j
                    public void onAnimationStart(Animator animator) {
                        C60700b.m235851b("MeetingFloatWindow", "[showFloat3]", "onAnimationStart");
                        MeetingFloatWindow.this.mo213699s();
                    }
                });
                ofFloat.start();
                return;
            }
            C60700b.m235864f("MeetingFloatWindow", "[showFloat4]", "other, " + this.f154815C);
            mo213699s();
        } else if (this.f154797I != IFloatWindowPresent.FloatWindowType.FAST_ENTRY) {
        } else {
            if (!this.f154799K.isFastEntryShown()) {
                C60700b.m235851b("MeetingFloatWindow", "[showFloat5]", "fast entry showFloat show, " + this.f154815C);
                this.f154799K.showFastEntry();
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f154906c, "translationX", (float) UIHelper.getDimens(R.dimen.fv_width), 0.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new AccelerateInterpolator());
                ofFloat2.addListener(new C61740j() {
                    /* class com.ss.android.vc.meeting.module.floatingwindow.MeetingFloatWindow.C616862 */

                    @Override // com.ss.android.vc.meeting.module.floatingwindow.C61740j
                    public void onAnimationStart(Animator animator) {
                        C60700b.m235851b("MeetingFloatWindow", "[showFloat6]", "onAnimationStart");
                        MeetingFloatWindow.this.mo213699s();
                    }
                });
                ofFloat2.start();
                return;
            }
            C60700b.m235864f("MeetingFloatWindow", "[showFloat7]", "other, " + this.f154815C);
            mo213699s();
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: b */
    public void mo211764b(String str, String str2) {
        super.mo211764b(str, str2);
        if (this.f154801M) {
            postRefreshViewOnMain();
        } else {
            m240798C();
        }
    }

    /* renamed from: a */
    private boolean m240815a(boolean z, boolean z2) {
        if (this.f154801M) {
            return switchToAvatarOnMain(z, z2);
        }
        return m240820b(z, z2);
    }

    @XMethod(runOnProcess = XProcess.Main)
    private void reloadUserInfoOnMain(String str, Participant participant, boolean z) {
        m240819b(str, participant, z);
    }

    /* renamed from: a */
    private void m240814a(String str, Participant participant, boolean z) {
        if (this.f154801M) {
            reloadUserInfoOnMain(str, participant, z);
        } else {
            m240819b(str, participant, z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a, com.ss.android.vc.meeting.module.floatingwindow.AbstractC61729b
    public void onAudioStateUnchanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        if (z2 && mo213813e() != null) {
            C63738ah.m250009a(audioType, z, mo213813e().mo212056e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m240810a(ParticipantType participantType, int i, VideoChatUser videoChatUser) {
        if (videoChatUser != null) {
            C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), participantType, this.f154826i, i, i);
        }
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a, com.ss.android.vc.meeting.module.floatingwindow.AbstractC61729b
    public void onAudioStateChanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        super.onAudioStateChanged(audioType, z, z2);
        boolean z3 = MeetingAudioManager.m239471k().mo212721z();
        MeetingAudioManager.AudioType y = MeetingAudioManager.m239471k().mo212720y();
        mo213811a(audioType, z, y, z3);
        if (z2 && mo213813e() != null) {
            C63738ah.m250010a(audioType, z, y, z3, mo213813e().mo212056e());
        }
    }

    /* renamed from: a */
    private void m240812a(VideoChat videoChat, boolean z, boolean z2) {
        C60700b.m235851b("MeetingFloatWindow", "[initFloatViewInfo]", "videoChat.id = " + videoChat.getId() + ", isRinging = " + z + ", isWaiting =" + z2);
        if (z) {
            m240811a(videoChat);
        } else if (z2) {
            m240839w();
        } else {
            m240838v();
        }
    }

    /* renamed from: b */
    private void m240819b(String str, Participant participant, boolean z) {
        if (participant == null) {
            C60700b.m235851b("MeetingFloatWindow", "[reloadUserInfoOnVC]", "activeParticipant is null");
        } else {
            UserInfoService.getUserInfoById(str, participant.getId(), participant.getParticipantType(), new GetUserInfoListener(participant, z) {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$aAHn_xopzTyVlH82LKr7X3yVxQ */
                public final /* synthetic */ Participant f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public final void onGetUserInfo(VideoChatUser videoChatUser) {
                    MeetingFloatWindow.this.m240809a((MeetingFloatWindow) this.f$1, (Participant) this.f$2, (boolean) videoChatUser);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m240809a(Participant participant, boolean z, VideoChatUser videoChatUser) {
        boolean z2;
        videoChatUser.setType(participant.getParticipantType());
        if (participant.getParticipantSettings() != null && (videoChatUser.getType() == ParticipantType.NEO_USER || videoChatUser.getType().isNewType() || videoChatUser.getType().isUnknownType())) {
            videoChatUser.setNickname(participant.getParticipantSettings().getNickname());
        }
        boolean z3 = true;
        if (!z || participant.getParticipantRole() == ParticipantRole.INTERVIEWEE) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, this.f154826i);
            this.f154906c.post(new Runnable() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$Kz6FkdxbyDFqb4LqlBNgacUSPCA */

                public final void run() {
                    MeetingFloatWindow.this.m240803H();
                }
            });
            return;
        }
        int dpFromDimenXml = DeviceUtils.getDpFromDimenXml(ar.m236694a(), R.dimen.fv_avatar_size);
        C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), this.f154826i, dpFromDimenXml, dpFromDimenXml);
        boolean isMicrophoneMuted = participant.getParticipantSettings().isMicrophoneMuted();
        if (!ParticipantUtil.m248732c(participant) || C60788y.m236250b(ar.m236694a())) {
            z3 = false;
        }
        this.f154906c.post(new Runnable(videoChatUser, isMicrophoneMuted, z3) {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$MeetingFloatWindow$LJEc1JDVe4hEiFK4vkTxoJd42ZU */
            public final /* synthetic */ VideoChatUser f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                MeetingFloatWindow.this.m240813a((MeetingFloatWindow) this.f$1, (VideoChatUser) this.f$2, this.f$3);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: b */
    public void mo211763b(String str, int i, int i2) {
        if (this.f154801M) {
            postRefreshViewOnMain();
        } else {
            m240798C();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m240813a(VideoChatUser videoChatUser, boolean z, boolean z2) {
        String str;
        if (videoChatUser.isRoom()) {
            this.f154814B = videoChatUser.getRoom().fullNameParticipant;
        } else if (videoChatUser.getType() == ParticipantType.LARK_USER) {
            this.f154814B = videoChatUser.getName();
        } else if (videoChatUser.getType() == ParticipantType.NEO_USER || videoChatUser.getType().isNewType() || videoChatUser.getType().isUnknownType()) {
            if (!TextUtils.isEmpty(videoChatUser.getNickname())) {
                str = videoChatUser.getNickname();
            } else {
                str = videoChatUser.getName();
            }
            this.f154814B = str;
        }
        this.f154830m.setText(this.f154814B);
        if (z || z2) {
            this.f154829l.setVisibility(0);
            if (z2) {
                this.f154829l.setImageResource(R.drawable.ud_icon_mic_off_filled);
                this.f154829l.getDrawable().setTint(C60773o.m236126d(R.color.icon_disable));
            } else {
                this.f154829l.setImageResource(R.drawable.ud_icon_mic_off_filled);
                this.f154829l.getDrawable().setTint(C60773o.m236126d(R.color.function_danger_500));
            }
        } else {
            this.f154829l.setVisibility(8);
        }
        mo213716u();
    }

    @XMethod(bigParamCacheId = "8d76f710-286d-4eb4-8155-0951cd2e619f", runOnProcess = XProcess.Main)
    private void onFrameOnMain(byte[] bArr, byte[] bArr2, byte[] bArr3, C61071u uVar) {
        uVar.f152941a = bArr;
        uVar.f152942b = bArr2;
        uVar.f152943c = bArr3;
        m240818b(uVar);
    }
}
