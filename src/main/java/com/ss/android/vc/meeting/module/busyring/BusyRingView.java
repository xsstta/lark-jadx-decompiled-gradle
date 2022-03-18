package com.ss.android.vc.meeting.module.busyring;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28459a;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60749c;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.common.widget.RoundRectImageView;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.framework.meeting.C61312m;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.follow.common.VCShadowLayout;
import com.ss.android.vc.meeting.module.livestream.C62063d;
import com.ss.android.vc.meeting.utils.C63492g;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63736af;
import com.ss.android.vc.statistics.event.C63755e;
import com.ss.android.vc.statistics.event.aj;
import com.ss.android.vc.statistics.event.bn;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;

public class BusyRingView extends C61312m implements View.OnClickListener {

    /* renamed from: A */
    private View f154344A;

    /* renamed from: B */
    private View f154345B;

    /* renamed from: C */
    private View f154346C;

    /* renamed from: D */
    private LineHeightTextView f154347D;

    /* renamed from: E */
    private Runnable f154348E = new Runnable() {
        /* class com.ss.android.vc.meeting.module.busyring.BusyRingView.RunnableC615323 */

        public void run() {
            VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.BUSY_JOIN);
            aj.m250013a("calling_page", BusyRingView.this.mo212181b().mo212056e(), BusyRingView.this.mo212181b().mo212093K());
            VCLauncherStatistics.m250421a();
            C63736af.m249999a("all_close", BusyRingView.this.mo212181b().mo212056e(), BusyRingView.this.mo212181b().mo212093K(), VcBizService.updateVideoChat(BusyRingView.this.mo212181b(), BusyRingView.this.mo212183d(), VideoChat.UpdateVideoChatAction.ACCEPT.getNumber(), BusyRingView.this.mo213243a((Boolean) false), new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.busyring.BusyRingView.RunnableC615323.C615331 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    BusyRingView.this.mo213246b(false);
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    BusyRingView.this.mo213246b(true);
                }
            }));
            BusyRingView.this.mo212181b().mo212149b(1);
            BusyRingView.this.mo213250i();
            C63492g.m248821a(false, Boolean.valueOf(BusyRingView.this.mo212181b().mo212092J().mo212512I()));
        }
    };

    /* renamed from: F */
    private Runnable f154349F = new Runnable() {
        /* class com.ss.android.vc.meeting.module.busyring.BusyRingView.RunnableC615344 */

        public void run() {
            VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.BUSY_JOIN);
            MeetingAudioManager.m239471k().mo212717v();
            aj.m250013a("calling_page", BusyRingView.this.mo212181b().mo212056e(), BusyRingView.this.mo212181b().mo212093K());
            VCLauncherStatistics.m250421a();
            C63736af.m249999a("all_close", BusyRingView.this.mo212181b().mo212056e(), BusyRingView.this.mo212181b().mo212093K(), VcBizService.updateVideoChat(BusyRingView.this.mo212181b(), BusyRingView.this.mo212183d(), VideoChat.UpdateVideoChatAction.ACCEPT.getNumber(), BusyRingView.this.mo213243a((Boolean) true), new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.busyring.BusyRingView.RunnableC615344.C615351 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    BusyRingView.this.mo213246b(false);
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    BusyRingView.this.mo213246b(true);
                }
            }));
            BusyRingView.this.mo212181b().mo212149b(1);
            BusyRingView.this.mo213250i();
            C63492g.m248821a(false, Boolean.valueOf(BusyRingView.this.mo212181b().mo212092J().mo212512I()));
        }
    };

    /* renamed from: G */
    private Runnable f154350G = new Runnable() {
        /* class com.ss.android.vc.meeting.module.busyring.BusyRingView.RunnableC615365 */

        public void run() {
            BusyRingView.this.mo213251j();
            C60700b.m235841a(BusyRingView.this.mo212181b().mo212056e(), "UI", "StateEngine", "clickRingingDecline", "BusyRingView", "[onClick] click ringing decline button");
            BusyRingView.this.mo212181b().mo212051a(C61344j.m239002a().mo212329a(101).mo212331a(EventSource.EVENT_WINDOW));
            BusyRingView.this.mo213246b(false);
            bn.m250197a(BusyRingView.this.mo212181b().mo212056e(), true, BusyRingView.this.mo212181b().mo212093K());
        }
    };

    /* renamed from: b */
    public ViewGroup f154351b;

    /* renamed from: c */
    public ViewGroup f154352c;

    /* renamed from: d */
    public IconFontView f154353d;

    /* renamed from: e */
    public TextView f154354e;

    /* renamed from: f */
    private VideoChatUser f154355f;

    /* renamed from: g */
    private Activity f154356g;

    /* renamed from: h */
    private FrameLayout f154357h;

    /* renamed from: i */
    private VCShadowLayout f154358i;

    /* renamed from: j */
    private RelativeLayout f154359j;

    /* renamed from: k */
    private RelativeLayout f154360k;

    /* renamed from: l */
    private ConstraintLayout f154361l;

    /* renamed from: m */
    private TextView f154362m;

    /* renamed from: n */
    private TextView f154363n;

    /* renamed from: o */
    private TextView f154364o;

    /* renamed from: p */
    private ImageView f154365p;

    /* renamed from: q */
    private ImageView f154366q;

    /* renamed from: r */
    private LKUIRoundedImageView f154367r;

    /* renamed from: s */
    private boolean f154368s;

    /* renamed from: t */
    private PageType f154369t = PageType.Video;

    /* renamed from: u */
    private AbstractC61539a f154370u;

    /* renamed from: v */
    private C62063d f154371v;

    /* renamed from: w */
    private LinearLayout f154372w;

    /* renamed from: x */
    private boolean f154373x;

    /* renamed from: y */
    private TextView f154374y;

    /* renamed from: z */
    private RoundRectImageView f154375z;

    public enum PageType {
        Video,
        Follow
    }

    /* renamed from: com.ss.android.vc.meeting.module.busyring.BusyRingView$a */
    public interface AbstractC61539a {
        /* renamed from: a */
        void mo213261a(boolean z);
    }

    /* renamed from: h */
    public boolean mo213249h() {
        return this.f154368s;
    }

    /* renamed from: r */
    private ParticipantSettings.EquipmentStatus m240190r() {
        if (!C60788y.m236247a(this.f154356g)) {
            return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        return ParticipantSettings.EquipmentStatus.NORMAL;
    }

    /* renamed from: s */
    private ParticipantSettings.EquipmentStatus m240191s() {
        if (!C60788y.m236250b(this.f154356g)) {
            return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        return ParticipantSettings.EquipmentStatus.NORMAL;
    }

    /* renamed from: g */
    public void mo213248g() {
        C60700b.m235851b("BusyRingView", "[dismiss]", "start");
        mo213246b(false);
    }

    /* renamed from: n */
    private void m240186n() {
        VideoChatUser videoChatUser = this.f154355f;
        if (videoChatUser != null && !TextUtils.isEmpty(videoChatUser.getAvatarKey()) && this.f154375z != null) {
            Observable.create(new ObservableOnSubscribe() {
                /* class com.ss.android.vc.meeting.module.busyring.$$Lambda$BusyRingView$FbwPXzVqkX6NT8ihNJWspZoGco0 */

                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    BusyRingView.lambda$FbwPXzVqkX6NT8ihNJWspZoGco0(BusyRingView.this, observableEmitter);
                }
            }).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer() {
                /* class com.ss.android.vc.meeting.module.busyring.$$Lambda$BusyRingView$Y94wGodIEeki48PKe5KfCT7VGA */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BusyRingView.m271221lambda$Y94wGodIEeki48PKe5KfCT7VGA(BusyRingView.this, (Bitmap) obj);
                }
            });
        }
    }

    /* renamed from: f */
    public void mo213247f() {
        C60700b.m235851b("BusyRingView", "[show]", "start");
        this.f154351b.removeAllViews();
        ViewGroup viewGroup = this.f154352c;
        if (viewGroup == null) {
            C60700b.m235851b("BusyRingView", "[show2]", "mRootView is null");
            return;
        }
        this.f154351b.addView(viewGroup);
        m240188p();
    }

    /* renamed from: j */
    public void mo213251j() {
        this.f154344A.setClickable(false);
        this.f154344A.setEnabled(false);
        this.f154365p.setEnabled(false);
        this.f154374y.setEnabled(false);
        this.f154345B.setClickable(false);
        this.f154345B.setEnabled(false);
        this.f154366q.setEnabled(false);
        this.f154366q.setEnabled(false);
        this.f154372w.setClickable(false);
        this.f154372w.setEnabled(false);
        this.f154353d.setEnabled(false);
        this.f154354e.setEnabled(false);
    }

    /* renamed from: k */
    public void mo213252k() {
        C60700b.m235851b("BusyRingView", "[cancelAnimation]", "start");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f154360k.findViewById(R.id.calling_1v1_from_with_lottie);
        if (lottieAnimationView.isAnimating()) {
            lottieAnimationView.cancelAnimation();
            C60700b.m235851b("BusyRingView", "[cancelAnimation2]", "done");
        }
    }

    /* renamed from: l */
    private boolean m240184l() {
        C60700b.m235851b("BusyRingView", "[init]", "start");
        if (this.f154355f == null) {
            return true;
        }
        this.f154344A.setOnClickListener(this);
        this.f154345B.setOnClickListener(this);
        this.f154372w.setOnClickListener(this);
        this.f154372w.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.vc.meeting.module.busyring.BusyRingView.View$OnTouchListenerC615301 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    BusyRingView.this.f154354e.setTextColor(C60773o.m236126d(R.color.ud_N500));
                    BusyRingView.this.f154353d.setTextColor(C60773o.m236126d(R.color.ud_N500));
                    return false;
                } else if (action != 1 && action != 4) {
                    return false;
                } else {
                    BusyRingView.this.f154354e.setTextColor(C60773o.m236126d(R.color.iconfont_black_icon_selector));
                    BusyRingView.this.f154353d.setTextColor(C60773o.m236126d(R.color.vc_black_text_selector));
                    return false;
                }
            }
        });
        if (mo212181b().mo212057f() == VideoChat.Type.CALL) {
            m240192t();
        } else if (mo212181b().mo212057f() == VideoChat.Type.MEET) {
            mo213250i();
        }
        m240189q();
        m240186n();
        C60700b.m235851b("BusyRingView", "[init]", "end");
        return true;
    }

    /* renamed from: o */
    private void m240187o() {
        if (mo212181b() != null && mo212181b().mo212056e() != null) {
            if (mo212181b().mo212056e().getType() != VideoChat.Type.CALL || !mo212181b().mo212056e().isVoiceCall()) {
                this.f154373x = false;
                this.f154372w.setVisibility(0);
                this.f154365p.setImageResource(R.drawable.ic_busy_ring_video_accept_selector);
                return;
            }
            this.f154373x = true;
            ((TextView) this.f154352c.findViewById(R.id.ringing_invite_1v1)).setText(ar.m236694a().getResources().getString(R.string.View_A_IncomingVoiceCall));
            this.f154372w.setVisibility(8);
            this.f154365p.setImageResource(R.drawable.ic_busy_ring_voice_only_accept_selector);
        }
    }

    /* renamed from: q */
    private void m240189q() {
        if (mo212181b().mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && mo212181b().mo212089G() == ParticipantRole.INTERVIEWEE) {
            C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, this.f154367r);
        } else if (!TextUtils.isEmpty(this.f154355f.getAvatarKey()) && this.f154367r != null) {
            C60783v.m236230a(this.f154355f.getAvatarKey(), this.f154355f.getId(), this.f154355f.getType(), this.f154367r, 48, 48);
        }
    }

    /* renamed from: t */
    private void m240192t() {
        C60700b.m235851b("BusyRingView", "[updateRinging1v1View]", "start");
        if (this.f154355f != null) {
            if (mo212181b().mo212104V() == 1) {
                if (!C63634c.m249496b("byteview.call.android.status_connecting")) {
                    ((TextView) this.f154352c.findViewById(R.id.ringing_invite_1v1)).setText(ar.m236694a().getResources().getString(R.string.View_G_Connecting));
                }
                mo213251j();
                return;
            }
            this.f154367r = (LKUIRoundedImageView) this.f154352c.findViewById(R.id.calling_1v1_from);
            this.f154359j.setVisibility(8);
            this.f154360k.setVisibility(0);
            TextView textView = (TextView) this.f154352c.findViewById(R.id.calling_1v1_name);
            textView.setText(this.f154355f.getName());
            textView.postDelayed(new Runnable(textView) {
                /* class com.ss.android.vc.meeting.module.busyring.$$Lambda$BusyRingView$NsE0HXQHxDQBNRHGcRv_emenep8 */
                public final /* synthetic */ TextView f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    BusyRingView.lambda$NsE0HXQHxDQBNRHGcRv_emenep8(BusyRingView.this, this.f$1);
                }
            }, 0);
        }
    }

    /* renamed from: p */
    private void m240188p() {
        C60700b.m235851b("BusyRingView", "[showMultiRing]", "isShown=" + this.f154368s);
        if (mo212181b().mo212068q() == null || mo212181b().mo212068q().mo212056e() == null || mo212181b().mo212068q().mo212056e().getVideoChatSettings() == null || mo212181b().mo212068q().mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE) {
            this.f154347D.setText(UIHelper.getString(R.string.View_G_IfAcceptCurrentCallEnds));
        } else {
            this.f154347D.setText(UIHelper.getString(R.string.View_G_SharingWillEndIfAcceptCall));
        }
        if (!this.f154368s) {
            this.f154368s = true;
            this.f154357h.setVisibility(0);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, -1.0f, 1, BitmapDescriptorFactory.HUE_RED);
            translateAnimation.setDuration(200);
            AlphaAnimation alphaAnimation = new AlphaAnimation((float) BitmapDescriptorFactory.HUE_RED, 1.0f);
            alphaAnimation.setDuration(200);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(alphaAnimation);
            this.f154357h.startAnimation(animationSet);
        }
    }

    /* renamed from: m */
    private View m240185m() {
        int i;
        if (this.f154355f == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f154356g, R.layout.busy_ringing_2, null);
        this.f154352c = viewGroup;
        this.f154361l = (ConstraintLayout) viewGroup.findViewById(R.id.sublayer_layout);
        this.f154365p = (ImageView) this.f154352c.findViewById(R.id.multi_ringing_accept);
        this.f154344A = this.f154352c.findViewById(R.id.multi_ringing_accept_container);
        this.f154374y = (TextView) this.f154352c.findViewById(R.id.multi_ringing_accept_text);
        this.f154366q = (ImageView) this.f154352c.findViewById(R.id.multi_ringing_decline);
        this.f154345B = this.f154352c.findViewById(R.id.multi_ringing_decline_container);
        View findViewById = this.f154352c.findViewById(R.id.externalTag);
        this.f154346C = findViewById;
        if (mo212181b().mo212056e().isExternalForRing()) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        this.f154353d = (IconFontView) this.f154352c.findViewById(R.id.multi_ringing_voice_only_icon);
        this.f154354e = (TextView) this.f154352c.findViewById(R.id.multi_ringing_voice_only_text);
        this.f154372w = (LinearLayout) this.f154352c.findViewById(R.id.multi_ringing_voice_only_container);
        this.f154357h = (FrameLayout) this.f154352c.findViewById(R.id.multi_ringing_dialog);
        this.f154358i = (VCShadowLayout) this.f154352c.findViewById(R.id.shadow_layout);
        this.f154360k = (RelativeLayout) this.f154352c.findViewById(R.id.ringing_dialog_top_1v1);
        this.f154359j = (RelativeLayout) this.f154352c.findViewById(R.id.ringing_dialog_top_meeting);
        this.f154362m = (TextView) this.f154352c.findViewById(R.id.calling_1v1_name);
        this.f154363n = (TextView) this.f154352c.findViewById(R.id.ringing_invite_1v1);
        this.f154364o = (TextView) this.f154352c.findViewById(R.id.calling_meeting_name);
        this.f154375z = (RoundRectImageView) this.f154352c.findViewById(R.id.meeting_ringing_blurImage);
        this.f154347D = (LineHeightTextView) this.f154352c.findViewById(R.id.multi_ringing_tip_text);
        m240187o();
        return this.f154352c;
    }

    /* renamed from: i */
    public void mo213250i() {
        C60700b.m235851b("BusyRingView", "[updateRingingMeetingView]", "start");
        if (this.f154355f != null) {
            if (mo212181b().mo212104V() == 1) {
                ((TextView) this.f154352c.findViewById(R.id.multi_ringing_invite_msg)).setText(ar.m236694a().getResources().getString(R.string.View_G_Connecting));
                mo213251j();
                return;
            }
            this.f154367r = (LKUIRoundedImageView) this.f154352c.findViewById(R.id.calling_meeting_from);
            this.f154359j.setVisibility(0);
            this.f154360k.setVisibility(8);
            TextView textView = (TextView) this.f154352c.findViewById(R.id.calling_meeting_name);
            TextView textView2 = (TextView) this.f154352c.findViewById(R.id.multi_ringing_invite_msg);
            if (!(mo212181b().mo212056e() == null || mo212181b().mo212056e().getVideoChatSettings() == null)) {
                if (!TextUtils.isEmpty(mo212181b().mo212056e().getVideoChatSettings().getTopic())) {
                    textView.setText(mo212181b().mo212056e().getVideoChatSettings().getTopic());
                } else {
                    textView.setText(R.string.View_G_ServerNoTitle);
                }
            }
            if (mo212181b().mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && mo212181b().mo212089G() == ParticipantRole.INTERVIEWEE) {
                textView2.setText(UIHelper.mustacheFormat((int) R.string.View_M_WantsYouToJoinNameBraces, "name", ar.m236694a().getResources().getString(R.string.View_M_Interviewer)));
            } else if (!TextUtils.isEmpty(this.f154355f.getName())) {
                textView2.setText(UIHelper.mustacheFormat((int) R.string.View_M_WantsYouToJoinNameBraces, "name", this.f154355f.getName()));
            } else {
                textView2.setText(UIHelper.mustacheFormat((int) R.string.View_M_WantsYouToJoinNameBraces, "name", ""));
            }
            textView2.postDelayed(new Runnable(textView2) {
                /* class com.ss.android.vc.meeting.module.busyring.$$Lambda$BusyRingView$c3QLgBFAE3ZsIVTMJOsJPbAAM_o */
                public final /* synthetic */ TextView f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    BusyRingView.lambda$c3QLgBFAE3ZsIVTMJOsJPbAAM_o(BusyRingView.this, this.f$1);
                }
            }, 0);
        }
    }

    /* renamed from: a */
    public void mo213244a(PageType pageType) {
        this.f154369t = pageType;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m240180a(Bitmap bitmap) {
        this.f154375z.setBitmap(bitmap);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m240181a(TextView textView) {
        if (textView.getLineCount() > 1) {
            TextView textView2 = (TextView) this.f154352c.findViewById(R.id.multi_ringing_invite_msg);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
            marginLayoutParams.topMargin = C28459a.m104293b(this.f154356g, 0);
            textView2.setLayoutParams(marginLayoutParams);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m240183b(TextView textView) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (textView.getLineCount() > 1) {
            View findViewById = this.f154352c.findViewById(R.id.calling_1v1_from_with_lottie);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C28459a.m104293b(this.f154356g, 20);
                findViewById.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m240182a(ObservableEmitter observableEmitter) {
        Bitmap bitmap;
        Bitmap a = C60783v.m236225a(this.f154355f.getAvatarKey(), this.f154355f.getId(), this.f154355f.getType(), LocationRequest.PRIORITY_NO_POWER, LocationRequest.PRIORITY_NO_POWER);
        if (a != null) {
            bitmap = C60749c.m236070a(a, 5, 5);
        } else {
            bitmap = null;
        }
        observableEmitter.onNext(bitmap);
        observableEmitter.onComplete();
    }

    /* renamed from: a */
    public ParticipantSettings mo213243a(Boolean bool) {
        boolean z;
        ParticipantSettings participantSettings = new ParticipantSettings();
        boolean z2 = false;
        Boolean bool2 = false;
        if (bool.booleanValue() || mo212181b().mo212056e().getVideoChatSettings().isCameraMuted()) {
            z = true;
        } else {
            z = false;
        }
        participantSettings.setCameraMuted(z);
        if (bool2.booleanValue() || mo212181b().mo212056e().getVideoChatSettings().isMicrophoneMuted()) {
            z2 = true;
        }
        participantSettings.setMicrophoneMuted(z2);
        participantSettings.setCameraStatus(m240190r());
        participantSettings.setMicrophoneStatus(m240191s());
        return participantSettings;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r15 != false) goto L_0x004b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo213246b(boolean r15) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.busyring.BusyRingView.mo213246b(boolean):void");
    }

    /* renamed from: a */
    public void mo213245a(boolean z) {
        C60700b.m235851b("BusyRingView", "[updateOrientation]", "isLand=" + z);
        if (this.f154361l != null && this.f154365p != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f154358i.getLayoutParams();
            if (!z) {
                layoutParams.setMargins(C28459a.m104293b(this.f154356g, 8), StatusBarUtil.getStatusBarHeight(this.f154356g) + C28459a.m104293b(this.f154356g, 4), C28459a.m104293b(this.f154356g, 8), 0);
            } else {
                int max = (Math.max(C60776r.m236144b(), C60776r.m236139a()) - (Math.min(C60776r.m236144b(), C60776r.m236139a()) + UIHelper.dp2px(24.0f))) / 2;
                layoutParams.setMargins(max, C28459a.m104293b(this.f154356g, 8), max, 0);
            }
            this.f154358i.setLayoutParams(layoutParams);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.multi_ringing_accept_container && !this.f154373x) {
            C60700b.m235851b("BusyRingView", "[onClick]", "click ringing accept button");
            MeetingAudioManager.m239471k().mo212716u();
            if (C60785x.m236238b()) {
                C63693e.m249680a();
                mo212181b().mo212092J().mo212521a((Boolean) false);
                if (mo212181b().mo212057f() == VideoChat.Type.MEET) {
                    this.f154371v.mo214799a(this.f154348E, this.f154350G, mo212181b().mo212093K());
                    return;
                }
                VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.BUSY_JOIN);
                mo212181b().mo212149b(1);
                VCLauncherStatistics.m250421a();
                C63755e.m250282a(mo212181b().mo212056e(), mo212181b().mo212093K(), VcBizService.updateVideoChat(mo212181b(), mo212183d(), VideoChat.UpdateVideoChatAction.ACCEPT.getNumber(), mo213243a((Boolean) false), new AbstractC63598b() {
                    /* class com.ss.android.vc.meeting.module.busyring.BusyRingView.C615376 */

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        BusyRingView.this.mo213246b(false);
                    }

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onSuccess(Object obj) {
                        BusyRingView.this.mo213246b(true);
                    }
                }));
                m240192t();
                return;
            }
            mo213246b(false);
            mo212181b().mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_NONET).mo212331a(EventSource.EVENT_WINDOW));
        } else if (view.getId() == R.id.multi_ringing_decline_container) {
            this.f154350G.run();
        } else if (view.getId() == R.id.multi_ringing_voice_only_container || (view.getId() == R.id.multi_ringing_accept_container && this.f154373x)) {
            C60700b.m235851b("BusyRingView", "[onClick2]", "click ringing voice only button");
            if (!C60785x.m236238b()) {
                mo212181b().mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_NONET).mo212331a(EventSource.EVENT_WINDOW));
                return;
            }
            C63693e.m249680a();
            mo212181b().mo212092J().mo212521a((Boolean) true);
            if (mo212181b().mo212057f() == VideoChat.Type.MEET) {
                this.f154371v.mo214799a(this.f154349F, this.f154350G, mo212181b().mo212093K());
                return;
            }
            VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.BUSY_JOIN);
            MeetingAudioManager.m239471k().mo212717v();
            mo212181b().mo212149b(1);
            VCLauncherStatistics.m250421a();
            C63755e.m250284b(mo212181b().mo212056e(), mo212181b().mo212093K(), VcBizService.updateVideoChat(mo212181b(), mo212183d(), VideoChat.UpdateVideoChatAction.ACCEPT.getNumber(), mo213243a((Boolean) true), new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.busyring.BusyRingView.C615387 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    BusyRingView.this.mo213246b(false);
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    BusyRingView.this.mo213246b(true);
                }
            }));
            mo212181b().mo212155b(true);
            m240192t();
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.C61312m, com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onStateTransform(int i, int i2, int i3) {
        super.onStateTransform(i, i2, i3);
        if (i2 == 5 || i2 == 4) {
            mo212177a();
        }
    }

    public BusyRingView(Activity activity, ViewGroup viewGroup, String str, boolean z) {
        super(str, DisplayMode.ATTACH_VIEW);
        VideoChatUser videoChatUser;
        if (mo212181b() != null) {
            this.f154356g = activity;
            this.f154351b = viewGroup;
            if (mo212181b().mo212057f() == VideoChat.Type.CALL) {
                videoChatUser = mo212181b().mo212088F().getSingleCallerUser();
            } else {
                videoChatUser = mo212181b().mo212088F().getMultiCaller();
            }
            this.f154355f = videoChatUser;
            this.f154371v = new C62063d(this.f154356g).mo214796a(mo212181b());
            m240185m();
            m240184l();
            mo213245a(z);
            return;
        }
        throw new MeetingNullException("BusyRingView bind meeting is null");
    }
}
