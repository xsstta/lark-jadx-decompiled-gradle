package com.ss.android.vc.meeting.module.reaction.view;

import android.animation.Animator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.IReactionDependency;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.chat.AbstractC61566a;
import com.ss.android.vc.meeting.module.chat.C61584f;
import com.ss.android.vc.meeting.module.chat.p3115a.C61569b;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.multi.InMeetingFragment;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.reaction.entity.IMSource;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.module.reaction.entity.ViewItemReaction;
import com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView;
import com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionPosition;
import com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionView;
import com.ss.android.vc.meeting.module.sketch.AbsSketchControl;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020\u001fJ\n\u0010&\u001a\u0004\u0018\u00010'H\u0002J\n\u0010(\u001a\u0004\u0018\u00010\u0012H\u0002J\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\rJ\b\u0010+\u001a\u00020\u001fH\u0002J\b\u0010,\u001a\u00020\u001fH\u0002J\u0006\u0010-\u001a\u00020\rJ\u0006\u0010.\u001a\u00020\rJ\u0016\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\rJ\b\u00102\u001a\u00020\u001fH\u0002J\u0010\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020#H\u0002J\u000e\u00104\u001a\u00020\u001f2\u0006\u00103\u001a\u00020#J\u000e\u00105\u001a\u00020\u001f2\u0006\u00103\u001a\u00020#J\u000e\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020#J\u0012\u00108\u001a\u00020\u001f2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0010\u0010;\u001a\u00020\u001f2\b\u00109\u001a\u0004\u0018\u00010:J\u0016\u0010<\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010=\u001a\u00020>J\u000e\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020#R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u001b0\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/view/IMGeneralView;", "", "mPresent", "Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "(Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;)V", "TAG", "", "bottomSpace", "Landroid/view/View;", "contentTv", "Lcom/ss/android/vc/meeting/module/reaction/livewidget/VCLinkEmojiTextView;", "mIMRootContainer", "mIsLandScape", "", "getMPresent", "()Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "setMPresent", "mReactionView", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionView;", "mViewDependency", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionView$IViewDependency;", "messageBubbleView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "reactionDependency", "Lcom/ss/android/vc/dependency/IReactionDependency;", "kotlin.jvm.PlatformType", "rootView", "Landroid/view/ViewGroup;", "usernameTv", "Landroid/widget/TextView;", "addReactionCountNum", "", "position", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionPosition;", "countNum", "", "displayPeriod", "destroy", "getMeeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "getReactionView", "hideMessage", "withAnimation", "initData", "initListener", "isMessageBubbleVisible", "isShowing", "onOrientation", "isLandscape", "isRotate", "onOrientationChange", "bottomMargin", "onOrientationInFullScreenPage", "onOrientationInSketchPage", "setBottomMargin", "value", "setMessageView", "message", "Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessage;", "showMessage", "showReaction", "reactionItem", "Lcom/ss/android/vc/meeting/module/reaction/entity/ViewItemReaction;", "updateReactionMaxNum", "num", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.reaction.view.a */
public final class IMGeneralView {

    /* renamed from: a */
    public final String f158228a = "IMGeneralView";

    /* renamed from: b */
    public final IReactionDependency f158229b;

    /* renamed from: c */
    public View f158230c;

    /* renamed from: d */
    public boolean f158231d;

    /* renamed from: e */
    public View f158232e;

    /* renamed from: f */
    public ConstraintLayout f158233f;

    /* renamed from: g */
    private ViewGroup f158234g;

    /* renamed from: h */
    private ReactionView.IViewDependency f158235h;

    /* renamed from: i */
    private ReactionView f158236i;

    /* renamed from: j */
    private TextView f158237j;

    /* renamed from: k */
    private VCLinkEmojiTextView f158238k;

    /* renamed from: l */
    private AbstractC61429i f158239l;

    /* renamed from: d */
    public final AbstractC61429i mo217168d() {
        return this.f158239l;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.a$b */
    public static final class RunnableC62849b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IMGeneralView f158242a;

        RunnableC62849b(IMGeneralView aVar) {
            this.f158242a = aVar;
        }

        public final void run() {
            this.f158242a.f158229b.syncReactionOrder();
        }
    }

    /* renamed from: e */
    private final C61303k m246021e() {
        return this.f158239l.mo212921f();
    }

    /* renamed from: a */
    public final void mo217156a() {
        ReactionView reactionView = this.f158236i;
        if (reactionView != null) {
            reactionView.mo217200a();
        }
    }

    /* renamed from: f */
    private final void m246023f() {
        C60735ab.m236018e(new RunnableC62849b(this));
    }

    /* renamed from: g */
    private final void m246024g() {
        this.f158235h = new C62850c(this);
    }

    /* renamed from: b */
    public final boolean mo217165b() {
        ConstraintLayout constraintLayout = this.f158233f;
        if (constraintLayout == null || constraintLayout == null || constraintLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/reaction/view/IMGeneralView$initListener$1", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionView$IViewDependency;", "isFollowPage", "", "isShareScreen", "isSharingPage", "isSketchPage", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.a$c */
    public static final class C62850c implements ReactionView.IViewDependency {

        /* renamed from: a */
        final /* synthetic */ IMGeneralView f158243a;

        @Override // com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionView.IViewDependency
        /* renamed from: a */
        public boolean mo217176a() {
            C61303k f = this.f158243a.mo217168d().mo212921f();
            Intrinsics.checkExpressionValueIsNotNull(f, "mPresent.vcMeeting");
            AbsSketchControl ag = f.ag();
            Intrinsics.checkExpressionValueIsNotNull(ag, "mPresent.vcMeeting.sketchControl");
            return ag.isSketchOn();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62850c(IMGeneralView aVar) {
            this.f158243a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.a$d */
    public static final class RunnableC62851d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IMGeneralView f158244a;

        /* renamed from: b */
        final /* synthetic */ int f158245b;

        RunnableC62851d(IMGeneralView aVar, int i) {
            this.f158244a = aVar;
            this.f158245b = i;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            View view = this.f158244a.f158232e;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = this.f158245b;
            }
            View view2 = this.f158244a.f158230c;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: h */
    private final void m246025h() {
        double d;
        if (this.f158231d) {
            d = 16.0d;
        } else {
            d = 40.0d;
        }
        m246022e(C60773o.m236115a(d));
    }

    /* renamed from: c */
    public final boolean mo217167c() {
        ConstraintLayout constraintLayout = this.f158233f;
        if (constraintLayout == null || constraintLayout == null || constraintLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.a$a */
    public static final class RunnableC62847a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IMGeneralView f158240a;

        RunnableC62847a(IMGeneralView aVar) {
            this.f158240a = aVar;
        }

        public final void run() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            ConstraintLayout constraintLayout = this.f158240a.f158233f;
            if (constraintLayout != null) {
                constraintLayout.setAlpha(1.0f);
            }
            ConstraintLayout constraintLayout2 = this.f158240a.f158233f;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
            ConstraintLayout constraintLayout3 = this.f158240a.f158233f;
            if (constraintLayout3 != null && (animate = constraintLayout3.animate()) != null && (alpha = animate.alpha(BitmapDescriptorFactory.HUE_RED)) != null && (duration = alpha.setDuration(500)) != null) {
                duration.setListener(new Animator.AnimatorListener(this) {
                    /* class com.ss.android.vc.meeting.module.reaction.view.IMGeneralView.RunnableC62847a.C628481 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC62847a f158241a;

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f158241a = r1;
                    }

                    public void onAnimationCancel(Animator animator) {
                        ConstraintLayout constraintLayout = this.f158241a.f158240a.f158233f;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                        }
                    }

                    public void onAnimationEnd(Animator animator) {
                        ConstraintLayout constraintLayout = this.f158241a.f158240a.f158233f;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.a$g */
    public static final class RunnableC62854g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IMGeneralView f158249a;

        /* renamed from: b */
        final /* synthetic */ InteractionMessage f158250b;

        RunnableC62854g(IMGeneralView aVar, InteractionMessage aVar2) {
            this.f158249a = aVar;
            this.f158250b = aVar2;
        }

        public final void run() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            this.f158249a.mo217158a(this.f158250b);
            ConstraintLayout constraintLayout = this.f158249a.f158233f;
            if (constraintLayout != null) {
                constraintLayout.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            ConstraintLayout constraintLayout2 = this.f158249a.f158233f;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
            ConstraintLayout constraintLayout3 = this.f158249a.f158233f;
            if (constraintLayout3 != null && (animate = constraintLayout3.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(500)) != null) {
                duration.setListener(null);
            }
        }
    }

    /* renamed from: i */
    private final ReactionView m246026i() {
        if (this.f158236i == null) {
            ViewStub viewStub = (ViewStub) this.f158234g.findViewById(R.id.stub_im_reaction);
            if (viewStub != null) {
                viewStub.inflate();
            }
            ReactionView reactionView = (ReactionView) this.f158234g.findViewById(R.id.im_reaction_part);
            this.f158236i = reactionView;
            if (reactionView != null) {
                reactionView.setMeetingCallPresent(this.f158239l);
            }
        }
        return this.f158236i;
    }

    /* renamed from: a */
    public final void mo217157a(int i) {
        m246022e(i);
    }

    /* renamed from: b */
    public final void mo217163b(int i) {
        m246022e(i);
    }

    /* renamed from: d */
    public final void mo217169d(int i) {
        ReactionView reactionView = this.f158236i;
        if (reactionView != null) {
            reactionView.mo217201a(i);
        }
    }

    /* renamed from: c */
    public final void mo217166c(int i) {
        UICallbackExecutor.execute(new RunnableC62851d(this, i));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.a$f */
    public static final class View$OnClickListenerC62853f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMGeneralView f158248a;

        View$OnClickListenerC62853f(IMGeneralView aVar) {
            this.f158248a = aVar;
        }

        public final void onClick(View view) {
            C60700b.m235851b(this.f158248a.f158228a, "[onClick2]", "click close icon");
            this.f158248a.mo217161a(true);
        }
    }

    /* renamed from: a */
    public final void mo217161a(boolean z) {
        ConstraintLayout constraintLayout = this.f158233f;
        if (constraintLayout != null) {
            if (z) {
                C26171w.m94675a(new RunnableC62847a(this));
            } else if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public final void mo217164b(InteractionMessage aVar) {
        if (this.f158233f == null) {
            C60700b.m235851b(this.f158228a, "[showMessage]", "bubble is null, return");
        } else {
            C26171w.m94675a(new RunnableC62854g(this, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.a$e */
    public static final class View$OnClickListenerC62852e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMGeneralView f158246a;

        /* renamed from: b */
        final /* synthetic */ C61303k f158247b;

        View$OnClickListenerC62852e(IMGeneralView aVar, C61303k kVar) {
            this.f158246a = aVar;
            this.f158247b = kVar;
        }

        public final void onClick(View view) {
            InMeetingFragment z;
            C60700b.m235851b(this.f158246a.f158228a, "[onClick]", "click message bubble");
            C61303k kVar = this.f158247b;
            if (kVar != null) {
                kVar.as().mo213371a(true);
                ConstraintLayout constraintLayout = this.f158246a.f158233f;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                Activity b = C60773o.m236124b(this.f158246a.mo217168d().mo212918b());
                if (b != null) {
                    if (this.f158246a.f158231d) {
                        AbstractC61566a as = this.f158247b.as();
                        Intrinsics.checkExpressionValueIsNotNull(as, "meeting.chatControl");
                        as.mo213374b(true);
                        if (b instanceof ByteRTCMeetingActivity) {
                            ByteRTCMeetingActivity byteRTCMeetingActivity = (ByteRTCMeetingActivity) b;
                            if (!(byteRTCMeetingActivity.mo215865z() == null || (z = byteRTCMeetingActivity.mo215865z()) == null)) {
                                z.mo216098E();
                            }
                        }
                    }
                    C61584f.m240416a(b, this.f158247b).mo211606a();
                }
            }
        }
    }

    public IMGeneralView(AbstractC61429i iVar) {
        TextView textView;
        Intrinsics.checkParameterIsNotNull(iVar, "mPresent");
        this.f158239l = iVar;
        this.f158234g = iVar.mo212919d();
        this.f158229b = VideoChatModuleDependency.getReactionDependency();
        View findViewById = this.f158234g.findViewById(R.id.im_general_root_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.…m_general_root_container)");
        this.f158232e = findViewById;
        this.f158233f = (ConstraintLayout) this.f158234g.findViewById(R.id.reaction_new_message);
        View findViewById2 = this.f158234g.findViewById(R.id.down_triangle);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
            ConstraintLayout constraintLayout = this.f158233f;
            VCLinkEmojiTextView vCLinkEmojiTextView = null;
            if (constraintLayout != null) {
                textView = (TextView) constraintLayout.findViewById(R.id.new_message_username);
            } else {
                textView = null;
            }
            this.f158237j = textView;
            ConstraintLayout constraintLayout2 = this.f158233f;
            this.f158238k = constraintLayout2 != null ? (VCLinkEmojiTextView) constraintLayout2.findViewById(R.id.new_message_content) : vCLinkEmojiTextView;
            m246024g();
            m246023f();
            mo217162a(C61999a.m242220f(), false);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    /* renamed from: e */
    private final void m246022e(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f158232e;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (this.f158231d) {
                layoutParams2.leftMargin = C60773o.m236115a(15.0d);
                layoutParams2.rightMargin = C60773o.m236115a(15.0d);
                layoutParams2.width = C60773o.m236115a(360.0d);
            } else {
                layoutParams2.leftMargin = C60773o.m236115a(7.0d);
                layoutParams2.rightMargin = C60773o.m236115a(7.0d);
                layoutParams2.width = -1;
            }
            View view2 = this.f158232e;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
            mo217166c(i);
            TextView textView = this.f158237j;
            if (textView != null) {
                textView.setMinimumWidth(C61569b.m240337b(IMSource.REACTION, this.f158231d));
            }
            TextView textView2 = this.f158237j;
            if (textView2 != null) {
                textView2.setMaxWidth(C61569b.m240335a(IMSource.REACTION, this.f158231d));
            }
            VCLinkEmojiTextView vCLinkEmojiTextView = this.f158238k;
            if (vCLinkEmojiTextView != null) {
                vCLinkEmojiTextView.setMinimumWidth(C61569b.m240339d(IMSource.REACTION, this.f158231d));
            }
            VCLinkEmojiTextView vCLinkEmojiTextView2 = this.f158238k;
            if (vCLinkEmojiTextView2 != null) {
                vCLinkEmojiTextView2.setMaxWidth(C61569b.m240338c(IMSource.REACTION, this.f158231d));
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo217158a(com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage r12) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.reaction.view.IMGeneralView.mo217158a(com.ss.android.vc.meeting.module.reaction.entity.a):void");
    }

    /* renamed from: a */
    public final void mo217160a(ReactionPosition reactionPosition, ViewItemReaction fVar) {
        Intrinsics.checkParameterIsNotNull(reactionPosition, "position");
        Intrinsics.checkParameterIsNotNull(fVar, "reactionItem");
        String str = this.f158228a;
        C60700b.m235851b(str, "[showReaction]", "position:" + reactionPosition + ", reactionKey:" + fVar.mo216952b());
        ReactionView i = m246026i();
        if (i != null) {
            i.mo217204a(reactionPosition, fVar);
        }
    }

    /* renamed from: a */
    public final void mo217162a(boolean z, boolean z2) {
        this.f158231d = z;
        ReactionView.IViewDependency aVar = this.f158235h;
        if (aVar != null) {
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            if (aVar.mo217176a()) {
                return;
            }
        }
        m246025h();
    }

    /* renamed from: a */
    public final void mo217159a(ReactionPosition reactionPosition, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(reactionPosition, "position");
        String str = this.f158228a;
        C60700b.m235851b(str, "[addReactionCountNum]", "position:" + reactionPosition + ", countNum:" + i);
        ReactionView i3 = m246026i();
        if (i3 != null) {
            i3.mo217203a(reactionPosition, i, i2);
        }
    }
}
