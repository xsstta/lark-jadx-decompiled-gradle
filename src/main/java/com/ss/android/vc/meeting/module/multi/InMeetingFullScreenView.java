package com.ss.android.vc.meeting.module.multi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.irtc.AbstractC61030i;
import com.ss.android.vc.irtc.utils.C61074b;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.InMeetingParticipantControlPopWindow;
import com.ss.android.vc.meeting.module.multi.InMeetingFullScreenView;
import com.ss.android.vc.meeting.module.multi.UserInfoStatusLayout;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62492f;
import com.ss.android.vc.meeting.module.p3119f.AbstractView$OnClickListenerC61652a;
import com.ss.android.vc.meeting.p3104c.C61254c;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.ax;
import com.ss.android.vc.statistics.event.bj;
import java.lang.ref.WeakReference;

public class InMeetingFullScreenView extends FrameLayout {

    /* renamed from: a */
    public View f157070a;

    /* renamed from: b */
    public View f157071b;

    /* renamed from: c */
    public InMeetingParticipantControlPopWindow f157072c;

    /* renamed from: d */
    public AbstractC62490e.AbstractC62491a f157073d;

    /* renamed from: e */
    public Activity f157074e;

    /* renamed from: f */
    private AbstractC62492f f157075f;

    /* renamed from: g */
    private ViewGroup f157076g;

    /* renamed from: h */
    private final ViewGroup f157077h;

    /* renamed from: i */
    private View f157078i;

    /* renamed from: j */
    private View f157079j;

    /* renamed from: k */
    private ConstraintLayout f157080k;

    /* renamed from: l */
    private ConstraintLayout f157081l;

    /* renamed from: m */
    private LKUIRoundedImageView f157082m;

    /* renamed from: n */
    private FrameLayout f157083n;

    /* renamed from: o */
    private UserInfoStatusLayout f157084o;

    /* renamed from: p */
    private View f157085p;

    /* renamed from: q */
    private View f157086q;

    /* renamed from: r */
    private View f157087r;

    /* renamed from: s */
    private View f157088s;

    /* renamed from: t */
    private View f157089t;

    /* renamed from: u */
    private AnimatorSet f157090u;

    /* renamed from: v */
    private AnimatorSet f157091v;

    /* renamed from: w */
    private C61254c.AbstractC61259a f157092w;

    /* renamed from: g */
    private void m244084g() {
        m244087j();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingFullScreenView$a */
    public static class C62458a implements AbstractC61030i {

        /* renamed from: a */
        WeakReference<InMeetingFullScreenView> f157100a;

        @Override // com.ss.android.vc.irtc.AbstractC61030i
        /* renamed from: c */
        public void mo210660c() {
        }

        @Override // com.ss.android.vc.irtc.AbstractC61030i
        /* renamed from: d */
        public void mo210661d() {
        }

        @Override // com.ss.android.vc.irtc.AbstractC61030i
        /* renamed from: b */
        public void mo210659b() {
            C60700b.m235851b("InMeetingFullScreenView", "[onEndRender]", "onEndRender");
        }

        @Override // com.ss.android.vc.irtc.AbstractC61030i
        /* renamed from: a */
        public void mo210658a() {
            InMeetingFullScreenView inMeetingFullScreenView;
            C60700b.m235851b("InMeetingFullScreenView", "[onBeginRender]", "onBeginRender");
            WeakReference<InMeetingFullScreenView> weakReference = this.f157100a;
            if (weakReference != null && (inMeetingFullScreenView = weakReference.get()) != null && inMeetingFullScreenView.getVisibility() == 0) {
                inMeetingFullScreenView.getClass();
                inMeetingFullScreenView.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.multi.$$Lambda$InMeetingFullScreenView$a$zxCGb0fp3TNf4nWtO7oxm2YVIKM */

                    public final void run() {
                        InMeetingFullScreenView.C62458a.lambda$zxCGb0fp3TNf4nWtO7oxm2YVIKM(InMeetingFullScreenView.this);
                    }
                });
            }
        }

        public C62458a(InMeetingFullScreenView inMeetingFullScreenView) {
            this.f157100a = new WeakReference<>(inMeetingFullScreenView);
        }
    }

    /* renamed from: i */
    private boolean m244086i() {
        AnimatorSet animatorSet = this.f157091v;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void m244088k() {
        post(new Runnable() {
            /* class com.ss.android.vc.meeting.module.multi.$$Lambda$InMeetingFullScreenView$9QJz8mDQisnf6t7ZsDQcG9te8Sk */

            public final void run() {
                InMeetingFullScreenView.lambda$9QJz8mDQisnf6t7ZsDQcG9te8Sk(InMeetingFullScreenView.this);
            }
        });
    }

    /* renamed from: b */
    public void mo215895b() {
        this.f157080k.setVisibility(8);
        this.f157083n.setVisibility(0);
    }

    /* renamed from: e */
    public boolean mo215903e() {
        if (getVisibility() != 0 || m244086i()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m244085h() {
        if (this.f157089t != null) {
            this.f157080k.setVisibility(0);
            this.f157073d.mo216046a(this.f157089t);
            this.f157083n.removeAllViews();
            this.f157089t = null;
        }
    }

    /* renamed from: j */
    private void m244087j() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f157076g.getLayoutParams();
        marginLayoutParams.topMargin = C60776r.m236148f();
        this.f157076g.setLayoutParams(marginLayoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m244090m() {
        clearAnimation();
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setVisibility(8);
        AbstractC62492f fVar = this.f157075f;
        if (fVar != null) {
            fVar.onFullScreenShowChanged(false);
        }
        m244085h();
    }

    /* renamed from: d */
    public void mo215902d() {
        this.f157092w = null;
        FrameLayout frameLayout = this.f157083n;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.f157083n.getChildAt(0);
            if (childAt instanceof C61254c) {
                ((C61254c) childAt).mo211850b();
            }
        }
        InMeetingParticipantControlPopWindow inMeetingParticipantControlPopWindow = this.f157072c;
        if (inMeetingParticipantControlPopWindow != null) {
            inMeetingParticipantControlPopWindow.dismiss();
        }
        m244085h();
    }

    /* renamed from: f */
    private void m244083f() {
        if (this.f157089t == null) {
            View a = this.f157073d.mo216045a(false);
            this.f157089t = a;
            C61074b.m237511a(a, C60773o.m236126d(R.color.vc_bg_cam_off));
            C61254c a2 = m244078a(this.f157089t);
            a2.setOnDoubleTapListener(this.f157092w);
            this.f157083n.removeAllViews();
            this.f157083n.addView(a2);
            this.f157073d.mo216047a(this.f157089t, new C62458a(this));
            this.f157080k.setVisibility(0);
            this.f157083n.setVisibility(0);
            this.f157088s.setVisibility(8);
            return;
        }
        C60700b.m235851b("InMeetingFullScreenView", "[setupVideoSurface]", "Render view has been attached.");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m244089l() {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f157090u = animatorSet;
        animatorSet.play(ObjectAnimator.ofFloat(this.f157070a, View.SCALE_X, 0.8f, 1.0f)).with(ObjectAnimator.ofFloat(this.f157070a, View.SCALE_Y, 0.8f, 1.0f)).with(ObjectAnimator.ofFloat(this.f157070a, View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f));
        this.f157090u.setDuration(250L);
        this.f157090u.setInterpolator(new DecelerateInterpolator());
        this.f157090u.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.vc.meeting.module.multi.InMeetingFullScreenView.C624565 */

            public void onAnimationStart(Animator animator) {
                InMeetingFullScreenView.this.f157070a.setVisibility(0);
            }
        });
        this.f157090u.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m244091n() {
        View view;
        if (this.f157077h != null && (view = this.f157070a) != null && this.f157081l != null && this.f157080k != null) {
            int width = view.getWidth();
            int height = this.f157070a.getHeight();
            C0689b bVar = new C0689b();
            C0689b bVar2 = new C0689b();
            bVar2.mo3901b(this.f157081l);
            bVar.mo3901b(this.f157080k);
            if (width < height) {
                bVar.mo3887a(R.id.img_avatar, "H,1:1");
                bVar2.mo3887a(R.id.camera_unavailable, "H,1:1");
            } else if (width > height) {
                bVar.mo3887a(R.id.img_avatar, "W,1:1");
                bVar2.mo3887a(R.id.camera_unavailable, "W,1:1");
            } else {
                bVar.mo3887a(R.id.img_avatar, "H,1:1");
                bVar2.mo3887a(R.id.camera_unavailable, "H,1:1");
            }
            bVar.mo3905c(this.f157080k);
            bVar2.mo3905c(this.f157081l);
        }
    }

    /* renamed from: c */
    public void mo215899c() {
        FrameLayout frameLayout = this.f157083n;
        if (frameLayout != null) {
            View childAt = frameLayout.getChildAt(0);
            if (childAt instanceof C61254c) {
                C61254c cVar = (C61254c) childAt;
                cVar.mo211850b();
                cVar.mo211854c();
            }
        }
        if (getVisibility() == 0) {
            if (m244086i()) {
                C60700b.m235864f("InMeetingFullScreenView", "[dismiss]", "[hide]Full screen is exiting.");
                return;
            }
            C60700b.m235851b("InMeetingFullScreenView", "[dismiss]", "Hide full screen: " + this.f157073d.mo216051c().getDeviceId());
            m244080a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.multi.$$Lambda$InMeetingFullScreenView$kicSZw42poYJRQUIlsSVOk6TDEo */

                public final void run() {
                    InMeetingFullScreenView.lambda$kicSZw42poYJRQUIlsSVOk6TDEo(InMeetingFullScreenView.this);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo215889a() {
        this.f157076g = (ViewGroup) this.f157077h.findViewById(R.id.fullscreen_topbar);
        this.f157070a = this.f157077h.findViewById(R.id.fullscreen_content);
        this.f157078i = this.f157077h.findViewById(R.id.fullscreen_exit);
        this.f157079j = this.f157077h.findViewById(R.id.fullscreen_exit_shadow_layout);
        this.f157080k = (ConstraintLayout) this.f157077h.findViewById(R.id.container_avatar);
        this.f157082m = (LKUIRoundedImageView) this.f157077h.findViewById(R.id.img_avatar);
        this.f157083n = (FrameLayout) this.f157077h.findViewById(R.id.container_surface);
        this.f157081l = (ConstraintLayout) this.f157077h.findViewById(R.id.container_videocam);
        this.f157088s = this.f157077h.findViewById(R.id.camera_unavailable);
        this.f157085p = this.f157077h.findViewById(R.id.switch_camera);
        this.f157086q = this.f157077h.findViewById(R.id.switch_camera_shadow_layout);
        this.f157071b = this.f157077h.findViewById(R.id.action_more);
        this.f157087r = this.f157077h.findViewById(R.id.action_more_shadow_layout);
        UserInfoStatusLayout userInfoStatusLayout = (UserInfoStatusLayout) this.f157077h.findViewById(R.id.tv_user_info_status_onthecall);
        this.f157084o = userInfoStatusLayout;
        userInfoStatusLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.multi.$$Lambda$InMeetingFullScreenView$_ztqv1rQbQucYzWDqWaWr8lVPDk */

            public final void onClick(View view) {
                InMeetingFullScreenView.lambda$_ztqv1rQbQucYzWDqWaWr8lVPDk(InMeetingFullScreenView.this, view);
            }
        });
        this.f157078i.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.multi.InMeetingFullScreenView.C624521 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                InMeetingFullScreenView.this.mo215899c();
            }
        });
        this.f157077h.post(new Runnable() {
            /* class com.ss.android.vc.meeting.module.multi.$$Lambda$InMeetingFullScreenView$49AsDGZfHOqn06kK2pV6Q9TvSLo */

            public final void run() {
                InMeetingFullScreenView.lambda$49AsDGZfHOqn06kK2pV6Q9TvSLo(InMeetingFullScreenView.this);
            }
        });
        this.f157084o.setTextSize(12.0f);
        this.f157084o.setMUdIconSize(16.0f);
        this.f157084o.setTextPadding(C60773o.m236115a(5.0d));
        this.f157084o.setHostTextViewBgRes(R.drawable.vc_bg_user_info_host_fullscreen);
        this.f157084o.setIconMargin(C60773o.m236115a(2.0d));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m244082c(View view) {
        mo215899c();
    }

    public void setViewModel(AbstractC62490e.AbstractC62491a aVar) {
        this.f157073d = aVar;
    }

    public InMeetingFullScreenView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private C61254c m244078a(View view) {
        C61254c cVar = new C61254c(ar.m236694a());
        cVar.mo211839a(view);
        return cVar;
    }

    /* renamed from: b */
    public void mo215896b(String str) {
        mo215899c();
        C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_M_NameLeftTheMeeting, "name", str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m244081b(View view) {
        if (this.f157073d.mo216051c() != null) {
            Activity activity = this.f157074e;
            C61303k b = this.f157073d.mo216050b();
            if (C63497j.m248860d(b, new ByteviewUser(this.f157073d.mo216051c()))) {
                ax.m250127a(b.mo212056e());
                C63497j.m248853a(activity, b, new ByteviewUser(this.f157073d.mo216051c()));
            }
        }
    }

    /* renamed from: a */
    public void mo215891a(VideoChatUser videoChatUser) {
        if (MeetingUtil.m238366a(this.f157073d.mo216050b(), this.f157073d.mo216051c())) {
            C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, this.f157082m);
            return;
        }
        int e = (int) (((double) C60776r.m236147e()) * 0.5d);
        C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), this.f157082m, e, e);
    }

    /* renamed from: c */
    public void mo215900c(boolean z) {
        if (!z) {
            this.f157071b.setVisibility(4);
            this.f157087r.setVisibility(4);
            return;
        }
        this.f157071b.setVisibility(0);
        this.f157087r.setVisibility(0);
        this.f157071b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.multi.InMeetingFullScreenView.C624554 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (InMeetingFullScreenView.this.f157074e == null) {
                    C60700b.m235861e("InMeetingFullScreenView", "[updateActionMore]", "hostActivity is null");
                } else if (InMeetingFullScreenView.this.f157073d.mo216051c() == null) {
                    C60700b.m235861e("InMeetingFullScreenView", "[updateActionMore2]", "participant is null");
                } else {
                    InMeetingFullScreenView.this.f157072c = new InMeetingParticipantControlPopWindow(InMeetingFullScreenView.this.f157074e, InMeetingFullScreenView.this.f157073d.mo216050b(), InMeetingParticipantControlPopWindow.GridType.FULL_SCREEN, InMeetingFullScreenView.this.f157073d.mo216051c());
                    InMeetingFullScreenView.this.f157072c.mo100027a(InMeetingFullScreenView.this.f157071b);
                }
            }
        });
    }

    public void setHostActivity(Activity activity) {
        C60700b.m235851b("InMeetingFullScreenView", "[setHostActivity]", "hostActivity: " + activity);
        if (activity == null) {
            activity = C60773o.m236124b(getContext());
        }
        this.f157074e = activity;
    }

    /* renamed from: a */
    private void m244080a(final Runnable runnable) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f157091v = animatorSet;
        animatorSet.play(ObjectAnimator.ofFloat(this.f157070a, View.SCALE_X, 1.0f, 0.8f)).with(ObjectAnimator.ofFloat(this.f157070a, View.SCALE_Y, 1.0f, 0.8f)).with(ObjectAnimator.ofFloat(this.f157070a, View.ALPHA, 1.0f, BitmapDescriptorFactory.HUE_RED));
        this.f157091v.setDuration(250L);
        this.f157091v.setInterpolator(new DecelerateInterpolator());
        this.f157091v.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.vc.meeting.module.multi.InMeetingFullScreenView.C624576 */

            public void onAnimationCancel(Animator animator) {
                runnable.run();
            }

            public void onAnimationEnd(Animator animator) {
                runnable.run();
            }
        });
        this.f157091v.start();
    }

    /* renamed from: b */
    public void mo215897b(boolean z) {
        if (!z) {
            this.f157085p.setVisibility(4);
            this.f157086q.setVisibility(4);
            return;
        }
        this.f157085p.setVisibility(0);
        this.f157086q.setVisibility(0);
        this.f157085p.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.multi.InMeetingFullScreenView.C624543 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                DataAdapterUtil.f154006a.mo212860f(InMeetingFullScreenView.this.f157073d.mo216050b());
                C63742at.m250116w(InMeetingFullScreenView.this.f157073d.mo216050b().mo212056e());
            }
        });
    }

    /* renamed from: a */
    public void mo215890a(AbstractC62492f fVar) {
        AbstractC62490e.AbstractC62491a aVar = this.f157073d;
        if (aVar == null || aVar.mo216051c() == null) {
            C60700b.m235864f("InMeetingFullScreenView", "[show]", "Participant is null.");
            throw new IllegalArgumentException("viewModel is null");
        }
        C60700b.m235851b("InMeetingFullScreenView", "[show2]", "Show full screen: " + this.f157073d.mo216051c().getDeviceId());
        if (m244086i()) {
            this.f157091v.cancel();
        }
        setOnClickListener(new AbstractView$OnClickListenerC61652a() {
            /* class com.ss.android.vc.meeting.module.multi.InMeetingFullScreenView.C624532 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.vc.meeting.module.p3119f.AbstractView$OnClickListenerC61652a
            /* renamed from: a */
            public void mo213552a(View view) {
                bj.m250181a(false, InMeetingFullScreenView.this.f157073d.mo216050b().mo212056e());
                InMeetingFullScreenView.this.mo215899c();
            }
        });
        this.f157075f = fVar;
        setVisibility(0);
        this.f157077h.setFocusableInTouchMode(true);
        this.f157077h.requestFocus();
        setAlpha(1.0f);
        this.f157070a.setVisibility(4);
        m244084g();
        AbstractC62492f fVar2 = this.f157075f;
        if (fVar2 != null) {
            fVar2.onFullScreenShowChanged(true);
        }
        m244088k();
    }

    /* renamed from: a */
    public void mo215892a(String str) {
        this.f157084o.setOnLayoutChangeObserver(new UserInfoStatusLayout.OnLayoutChangeObserver() {
            /* class com.ss.android.vc.meeting.module.multi.$$Lambda$InMeetingFullScreenView$OIkzy4oSzrSB1aRBFWuOAg37rOU */

            @Override // com.ss.android.vc.meeting.module.multi.UserInfoStatusLayout.OnLayoutChangeObserver
            public final void onLayoutChange(View view, boolean z) {
                InMeetingFullScreenView.lambda$OIkzy4oSzrSB1aRBFWuOAg37rOU(InMeetingFullScreenView.this, view, z);
            }
        });
        this.f157084o.mo215998a(str);
    }

    /* renamed from: a */
    public void mo215893a(boolean z) {
        this.f157084o.mo215994a(Boolean.valueOf(z));
    }

    public InMeetingFullScreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m244079a(View view, boolean z) {
        this.f157084o.setBackgroundResource(R.drawable.bg_user_info_status_3);
    }

    /* renamed from: b */
    public void mo215898b(boolean z, boolean z2) {
        this.f157084o.mo216000b(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* renamed from: c */
    public void mo215901c(boolean z, boolean z2) {
        if (z) {
            this.f157080k.setVisibility(8);
            this.f157083n.setVisibility(8);
            this.f157088s.setVisibility(0);
            m244085h();
        } else if (z2) {
            this.f157088s.setVisibility(8);
            this.f157080k.setVisibility(0);
            this.f157083n.setVisibility(8);
            m244085h();
        } else {
            m244083f();
        }
    }

    /* renamed from: a */
    public void mo215894a(boolean z, boolean z2) {
        this.f157084o.mo215995a(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public InMeetingFullScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f157092w = new C61254c.AbstractC61259a() {
            /* class com.ss.android.vc.meeting.module.multi.$$Lambda$InMeetingFullScreenView$a0sTZzHrAl4ma2DcjoMU3xrsU0 */

            @Override // com.ss.android.vc.meeting.p3104c.C61254c.AbstractC61259a
            public final void onDoubleTap(View view) {
                InMeetingFullScreenView.m271339lambda$a0sTZzHrAl4ma2DcjoMU3xrsU0(InMeetingFullScreenView.this, view);
            }
        };
        this.f157077h = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.view_inmeeting_fullscreen, (ViewGroup) this, true);
        mo215889a();
    }
}
