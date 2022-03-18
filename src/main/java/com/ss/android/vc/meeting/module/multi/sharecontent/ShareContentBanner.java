package com.ss.android.vc.meeting.module.multi.sharecontent;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.AbstractC60902q;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.landscapefloater.ILandscapeFloatToolbarListener;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.sketch.AbsSketchControl;
import com.ss.android.vc.meeting.module.sketch.ISketchEnableChangeListener;
import com.ss.android.vc.meeting.module.sketch.ISketchLoadListener;
import com.ss.android.vc.statistics.event.C63745b;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dJ\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u001dH\u0002J\u000e\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010\tJ\u000e\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u001dJ\u000e\u0010/\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*J\u0010\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u001dH\u0002J\u000e\u00102\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u001dR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentBanner;", "Lcom/ss/android/vc/meeting/module/sketch/ISketchLoadListener;", "Lcom/ss/android/vc/meeting/module/sketch/ISketchEnableChangeListener;", "rootView", "Landroid/view/View;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Landroid/view/View;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "landscapeFloatToolbarListenerListener", "Lcom/ss/android/vc/meeting/module/landscapefloater/ILandscapeFloatToolbarListener;", "loadingLottie", "Lcom/airbnb/lottie/LottieAnimationView;", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "shareContentContainer", "shareContentTitle", "Landroid/widget/TextView;", "sketchContainer", "Landroid/widget/LinearLayout;", "sketchText", "dismissBanner", "", "initIfNotInflated", "onCanSketchChange", "canSketch", "", "onOrientation", "isLandscape", "isRotate", "onSketchClosed", "onSketchLoadBegin", "onSketchLoadCanceled", "onSketchLoadFailed", "onSketchLoadFinished", "openSketch", "needReLayout", "refreshName", "sharingName", "", "setLandscapeFloatToolBarListener", "listener", "setSketchEnabled", "enable", "showBanner", "showLoadingLottie", "show", "showSketchBtn", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.b.c */
public final class ShareContentBanner implements ISketchEnableChangeListener, ISketchLoadListener {

    /* renamed from: a */
    public static final Companion f157201a = new Companion(null);

    /* renamed from: b */
    private View f157202b;

    /* renamed from: c */
    private TextView f157203c;

    /* renamed from: d */
    private LinearLayout f157204d;

    /* renamed from: e */
    private LottieAnimationView f157205e;

    /* renamed from: f */
    private TextView f157206f;

    /* renamed from: g */
    private ILandscapeFloatToolbarListener f157207g;

    /* renamed from: h */
    private View f157208h;

    /* renamed from: i */
    private final C61303k f157209i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentBanner$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final C61303k mo216084b() {
        return this.f157209i;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchLoadBegin() {
        m244305d(true);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchLoadCanceled() {
        this.f157209i.ag().removeSketchLoadListener(this);
    }

    /* renamed from: a */
    public final void mo216079a() {
        C60700b.m235851b("ShareContentBanner@", "[dismissBanner]", "dismiss");
        View view = this.f157202b;
        if (view != null) {
            C60752f.m236083c(view);
        }
        this.f157209i.ag().unRegisterSketchEnableChangeListener(this);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchLoadFinished() {
        m244305d(false);
        View view = this.f157202b;
        if (view != null) {
            C60752f.m236083c(view);
        }
        ILandscapeFloatToolbarListener aVar = this.f157207g;
        if (aVar != null) {
            aVar.mo214403a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchClosed() {
        int i;
        boolean z = false;
        m244305d(false);
        View view = this.f157202b;
        if (view != null) {
            C60752f.m236079a(view);
        }
        if (this.f157209i.ag().canSketchOn()) {
            VideoChat e = this.f157209i.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            VideoChatSettings videoChatSettings = e.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "meeting.videoChat.videoChatSettings");
            if (!videoChatSettings.getOnlyPresenterCanAnnotate() || this.f157209i.ay().mo216075f()) {
                z = true;
            }
        }
        TextView textView = this.f157206f;
        if (textView != null) {
            if (z) {
                i = C60773o.m236126d(R.color.text_title);
            } else {
                i = C60773o.m236126d(R.color.text_disable);
            }
            textView.setTextColor(i);
        }
        ILandscapeFloatToolbarListener aVar = this.f157207g;
        if (aVar != null) {
            aVar.mo214404b();
        }
        this.f157209i.ag().removeSketchLoadListener(this);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchLoadFailed() {
        int i;
        boolean z = false;
        m244305d(false);
        View view = this.f157202b;
        if (view != null) {
            C60752f.m236079a(view);
        }
        if (this.f157209i.ag().canSketchOn()) {
            VideoChat e = this.f157209i.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            VideoChatSettings videoChatSettings = e.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "meeting.videoChat.videoChatSettings");
            if (!videoChatSettings.getOnlyPresenterCanAnnotate() || this.f157209i.ay().mo216075f()) {
                z = true;
            }
        }
        TextView textView = this.f157206f;
        if (textView != null) {
            if (z) {
                i = C60773o.m236126d(R.color.text_title);
            } else {
                i = C60773o.m236126d(R.color.text_disable);
            }
            textView.setTextColor(i);
        }
        this.f157209i.ag().removeSketchLoadListener(this);
    }

    /* renamed from: c */
    private final void m244304c() {
        FrameLayout frameLayout;
        Context context;
        TextView textView;
        LinearLayout linearLayout;
        LottieAnimationView lottieAnimationView;
        TextView textView2;
        C60700b.m235851b("ShareContentBanner@", "[initIfNotInflated]", "start");
        ViewParent viewParent = null;
        if (this.f157202b == null) {
            View view = this.f157208h;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            View a = C60748b.m236068a(context, R.layout.share_content_banner_layout, null, false);
            this.f157202b = a;
            if (a != null) {
                textView = (TextView) a.findViewById(R.id.share_content_banner_title);
            } else {
                textView = null;
            }
            this.f157203c = textView;
            View view2 = this.f157202b;
            if (view2 != null) {
                linearLayout = (LinearLayout) view2.findViewById(R.id.share_content_sketch_container);
            } else {
                linearLayout = null;
            }
            this.f157204d = linearLayout;
            View view3 = this.f157202b;
            if (view3 != null) {
                lottieAnimationView = (LottieAnimationView) view3.findViewById(R.id.share_screen_sketch_loading_lottie);
            } else {
                lottieAnimationView = null;
            }
            this.f157205e = lottieAnimationView;
            View view4 = this.f157202b;
            if (view4 != null) {
                textView2 = (TextView) view4.findViewById(R.id.share_screen_prompt_annotate);
            } else {
                textView2 = null;
            }
            this.f157206f = textView2;
            LinearLayout linearLayout2 = this.f157204d;
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(new C62494b(this));
            }
        }
        View view5 = this.f157208h;
        if (view5 != null) {
            frameLayout = (FrameLayout) view5.findViewById(R.id.container_share_toolbar);
        } else {
            frameLayout = null;
        }
        View view6 = this.f157202b;
        if (view6 != null) {
            viewParent = view6.getParent();
        }
        if (!Intrinsics.areEqual(viewParent, frameLayout)) {
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f157202b, new FrameLayout.LayoutParams(-1, -2));
            }
        }
        if (frameLayout != null) {
            C60752f.m236079a((View) frameLayout);
        }
    }

    /* renamed from: a */
    public final void mo216080a(ILandscapeFloatToolbarListener aVar) {
        this.f157207g = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/multi/sharecontent/ShareContentBanner$initIfNotInflated$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.b.c$b */
    public static final class C62494b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareContentBanner f157210a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62494b(ShareContentBanner cVar) {
            this.f157210a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            IVideoChatDependency dependency = VideoChatModule.getDependency();
            Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModule.getDependency()");
            AbstractC60902q guideDependency = dependency.getGuideDependency();
            if (guideDependency.checkToShow("vc_follower_start_annotate")) {
                C60700b.m235851b("ShareContentBanner@", "[onClick]", "follower_start_annotate");
                C63745b.m250138c(this.f157210a.mo216084b().mo212056e());
                C60738ac.m236032b((int) R.string.View_G_AnnotationsVisibleToAll);
                guideDependency.completeGuide("vc_follower_start_annotate", false);
            }
            this.f157210a.mo216086b(true);
            MeetingOnTheCallEvent2.m249824a(MeetingOnTheCallEvent2.f160846b.mo220311a(), this.f157210a.mo216084b(), "annotate", "vc_meeting_annotate_view", null, null, null, 56, null);
        }
    }

    /* renamed from: d */
    private final void m244305d(boolean z) {
        boolean z2;
        LottieAnimationView lottieAnimationView;
        if (z) {
            LottieAnimationView lottieAnimationView2 = this.f157205e;
            if (lottieAnimationView2 != null) {
                C60752f.m236079a((View) lottieAnimationView2);
            }
            LottieAnimationView lottieAnimationView3 = this.f157205e;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.playAnimation();
                return;
            }
            return;
        }
        LottieAnimationView lottieAnimationView4 = this.f157205e;
        if (lottieAnimationView4 != null) {
            z2 = lottieAnimationView4.isAnimating();
        } else {
            z2 = false;
        }
        if (z2 && (lottieAnimationView = this.f157205e) != null) {
            lottieAnimationView.cancelAnimation();
        }
        LottieAnimationView lottieAnimationView5 = this.f157205e;
        if (lottieAnimationView5 != null) {
            C60752f.m236083c(lottieAnimationView5);
        }
    }

    /* renamed from: a */
    public final void mo216081a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sharingName");
        TextView textView = this.f157203c;
        if (textView != null) {
            textView.setText(str + UIHelper.getString(R.string.View_M_SharingToast));
        }
    }

    /* renamed from: b */
    public final void mo216086b(boolean z) {
        ILandscapeFloatToolbarListener aVar = this.f157207g;
        if (aVar != null) {
            aVar.mo214405b(z);
        }
        this.f157209i.ag().addSketchLoadListener(this);
        this.f157209i.ag().openSketch();
        TextView textView = this.f157206f;
        if (textView != null) {
            textView.setTextColor(C60773o.m236126d(R.color.text_placeholder));
        }
    }

    /* renamed from: b */
    public final void mo216085b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sharingName");
        C60700b.m235851b("ShareContentBanner@", "[showBanner]", "start");
        this.f157209i.ag().registerSketchEnableChangeListener(this);
        m244304c();
        View view = this.f157202b;
        if (view != null) {
            C60752f.m236079a(view);
        }
        AbsSketchControl ag = this.f157209i.ag();
        Intrinsics.checkExpressionValueIsNotNull(ag, "meeting.sketchControl");
        if (ag.isSketchOn()) {
            mo216086b(false);
        }
        LinearLayout linearLayout = this.f157204d;
        if (linearLayout != null) {
            C60752f.m236083c(linearLayout);
        }
        TextView textView = this.f157203c;
        if (textView != null) {
            textView.setText(str + UIHelper.getString(R.string.View_M_SharingToast));
        }
        mo216083a(C61999a.m242220f(), false);
    }

    /* renamed from: c */
    public final void mo216087c(boolean z) {
        boolean z2;
        int i;
        C60700b.m235851b("ShareContentBanner@", "[setSketchEnabled]", "enable = " + z);
        if (!this.f157209i.ag().canSketchOn() || (!z && !this.f157209i.ay().mo216075f())) {
            z2 = false;
        } else {
            z2 = true;
        }
        LinearLayout linearLayout = this.f157204d;
        if (linearLayout != null) {
            linearLayout.setEnabled(z2);
        }
        TextView textView = this.f157206f;
        if (textView != null) {
            if (z2) {
                i = C60773o.m236126d(R.color.text_title);
            } else {
                i = C60773o.m236126d(R.color.text_disable);
            }
            textView.setTextColor(i);
        }
        if (!z2) {
            this.f157209i.ag().closeSketchPenel();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0083, code lost:
        if (r7.isOnlyPresenterCanAnnote() == true) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
        if (r6.f157209i.ay().mo216075f() != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0056, code lost:
        if (r7.getOnlyPresenterCanAnnotate() != false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo216082a(boolean r7) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.sharecontent.ShareContentBanner.mo216082a(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0071, code lost:
        if (r7.isOnlyPresenterCanAnnote() == true) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007d, code lost:
        if (r6.f157209i.ay().mo216075f() != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0044, code lost:
        if (r7.getOnlyPresenterCanAnnotate() != false) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.vc.meeting.module.sketch.ISketchEnableChangeListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCanSketchChange(boolean r7) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.sharecontent.ShareContentBanner.onCanSketchChange(boolean):void");
    }

    public ShareContentBanner(View view, C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f157208h = view;
        this.f157209i = kVar;
    }

    /* renamed from: a */
    public final void mo216083a(boolean z, boolean z2) {
        ViewGroup.LayoutParams layoutParams = null;
        if (z) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            TextView textView = this.f157203c;
            if (textView != null) {
                textView.setLayoutParams(layoutParams2);
            }
            View view = this.f157202b;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            }
            if (layoutParams != null) {
                layoutParams.height = UIHelper.dp2px(36.0f);
            }
            View view2 = this.f157202b;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        TextView textView2 = this.f157203c;
        if (textView2 != null) {
            textView2.setLayoutParams(layoutParams3);
        }
        View view3 = this.f157202b;
        if (view3 != null) {
            layoutParams = view3.getLayoutParams();
        }
        if (layoutParams != null) {
            layoutParams.height = UIHelper.dp2px(40.0f);
        }
        View view4 = this.f157202b;
        if (view4 != null) {
            view4.setLayoutParams(layoutParams);
        }
    }
}
