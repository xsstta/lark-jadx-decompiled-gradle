package com.ss.android.vc.meeting.module.single.callingringing.observers;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60749c;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.PreviewVideoView;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.single.AbstractC63057b;
import com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver;
import com.ss.android.vc.meeting.module.single.callingringing.observers.livedata.CallingRingingLiveDatas;
import com.ss.android.vc.net.service.VideoChatUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010'\u001a\u00020\u0018H\u0002J\b\u0010(\u001a\u00020\u0018H\u0002J\b\u0010)\u001a\u00020\u0018H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/vc/meeting/module/single/callingringing/observers/PreviewAndUserInfoObserver;", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/base/CallingRingingBaseObserver;", "Lcom/ss/android/vc/meeting/module/single/OnRtcInitListener;", "fragment", "Landroidx/fragment/app/Fragment;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "liveDatas", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/livedata/CallingRingingLiveDatas;", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/single/callingringing/observers/livedata/CallingRingingLiveDatas;)V", "blurBackgroundView", "Landroid/widget/ImageView;", "blurFrontView", "Landroid/view/View;", "previewerMask", "thumbnailView", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "userAvatarContainer", "userAvatarView", "usernameView", "Landroid/widget/TextView;", "videoView", "Lcom/ss/android/vc/common/widget/PreviewVideoView;", "cancelVideoCalling", "", "isGranted", "", "disableCameraPreview", "enableCameraPreview", "hideAvatarAndBackground", "initAvatarAndBackground", "initAvatarContainerPosition", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onFinished", "onObserverCreated", "onStart", "onStop", "setLightColor", "showAvatarAndBackground", "showPreview", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class PreviewAndUserInfoObserver extends CallingRingingBaseObserver implements AbstractC63057b {

    /* renamed from: c */
    public PreviewVideoView f158962c;

    /* renamed from: d */
    public View f158963d;

    /* renamed from: e */
    public ImageView f158964e;

    /* renamed from: f */
    private View f158965f;

    /* renamed from: g */
    private LKUIRoundedImageView f158966g;

    /* renamed from: h */
    private TextView f158967h;

    /* renamed from: i */
    private View f158968i;

    /* renamed from: j */
    private View f158969j;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.PreviewAndUserInfoObserver$b */
    public static final class RunnableC63070b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PreviewAndUserInfoObserver f158971a;

        RunnableC63070b(PreviewAndUserInfoObserver previewAndUserInfoObserver) {
            this.f158971a = previewAndUserInfoObserver;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/vc/meeting/module/single/callingringing/observers/PreviewAndUserInfoObserver$initAvatarAndBackground$1$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.PreviewAndUserInfoObserver$b$a */
        static final class RunnableC63071a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bitmap f158972a;

            /* renamed from: b */
            final /* synthetic */ RunnableC63070b f158973b;

            /* renamed from: c */
            final /* synthetic */ Bitmap f158974c;

            RunnableC63071a(Bitmap bitmap, RunnableC63070b bVar, Bitmap bitmap2) {
                this.f158972a = bitmap;
                this.f158973b = bVar;
                this.f158974c = bitmap2;
            }

            public final void run() {
                ImageView imageView = this.f158973b.f158971a.f158964e;
                if (imageView != null) {
                    imageView.setImageBitmap(this.f158972a);
                }
            }
        }

        public final void run() {
            String str;
            String str2;
            VideoChatUser h = this.f158971a.mo217938h();
            ParticipantType participantType = null;
            if (h != null) {
                str = h.getAvatarKey();
            } else {
                str = null;
            }
            VideoChatUser h2 = this.f158971a.mo217938h();
            if (h2 != null) {
                str2 = h2.getId();
            } else {
                str2 = null;
            }
            VideoChatUser h3 = this.f158971a.mo217938h();
            if (h3 != null) {
                participantType = h3.getType();
            }
            Bitmap a = C60783v.m236225a(str, str2, participantType, SmEvents.EVENT_NO, SmEvents.EVENT_NO);
            if (a != null) {
                C26171w.m94675a(new RunnableC63071a(C60749c.m236070a(a, 5, 5), this, a));
            }
        }
    }

    /* renamed from: k */
    private final void m247039k() {
        PreviewVideoView previewVideoView = this.f158962c;
        if (previewVideoView != null) {
            previewVideoView.mo208476b();
        }
        m247041m();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.PreviewAndUserInfoObserver$a */
    public static final class RunnableC63069a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PreviewAndUserInfoObserver f158970a;

        RunnableC63069a(PreviewAndUserInfoObserver previewAndUserInfoObserver) {
            this.f158970a = previewAndUserInfoObserver;
        }

        public final void run() {
            this.f158970a.mo217918b();
            this.f158970a.mo217919c();
            View view = this.f158970a.f158963d;
            if (view != null) {
                C60752f.m236079a(view);
            }
            PreviewVideoView previewVideoView = this.f158970a.f158962c;
            if (previewVideoView != null) {
                previewVideoView.mo208475a(null);
            }
        }
    }

    /* renamed from: e */
    private final void m247038e() {
        C60700b.m235851b(mo217936f(), "[enableCameraPreview]", "enableCameraPreview");
        C26171w.m94675a(new RunnableC63069a(this));
    }

    @Override // com.ss.android.vc.meeting.module.single.AbstractC63057b
    /* renamed from: a */
    public void mo217889a() {
        C61303k kVar = this.f151993b;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
        if (kVar.mo212092J().mo212504A()) {
            m247039k();
        } else {
            m247038e();
        }
    }

    /* renamed from: m */
    private final void m247041m() {
        if (C60752f.m236082b((Object) this.f158965f) && C60752f.m236082b((Object) this.f158964e)) {
            ImageView imageView = this.f158964e;
            if (imageView != null) {
                C60752f.m236079a((View) imageView);
            }
            View view = this.f158965f;
            if (view != null) {
                C60752f.m236079a(view);
            }
        }
    }

    /* renamed from: c */
    public final void mo217919c() {
        if (C60752f.m236082b((Object) this.f158965f) && C60752f.m236082b((Object) this.f158964e)) {
            ImageView imageView = this.f158964e;
            if (imageView != null) {
                C60752f.m236083c(imageView);
            }
            View view = this.f158965f;
            if (view != null) {
                C60752f.m236083c(view);
            }
        }
    }

    /* renamed from: l */
    private final void m247040l() {
        C60700b.m235851b(mo217936f(), "[showPreview]", "request");
        int g = mo217937g();
        if (g == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
            String f = mo217936f();
            C60700b.m235851b(f, "[showPreview2]", "isVideoMuted: " + this.f151993b + ".meetingSpecificData.isVideoMuted()");
            C61303k kVar = this.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            if (kVar.mo212092J().mo212504A()) {
                m247039k();
            } else {
                m247038e();
            }
        } else if (g == ByteRTCMeetingActivity.TYPE.CALL_RINGING.ordinal()) {
            m247041m();
        }
    }

    /* renamed from: n */
    private final void m247042n() {
        String str;
        String str2;
        if (C60752f.m236082b((Object) this.f158966g) && C60752f.m236082b((Object) this.f158964e)) {
            ImageView imageView = this.f158964e;
            if (imageView != null) {
                C60752f.m236079a((View) imageView);
            }
            View view = this.f158965f;
            if (view != null) {
                C60752f.m236079a(view);
            }
            VideoChatUser h = mo217938h();
            ParticipantType participantType = null;
            if (h != null) {
                str = h.getAvatarKey();
            } else {
                str = null;
            }
            VideoChatUser h2 = mo217938h();
            if (h2 != null) {
                str2 = h2.getId();
            } else {
                str2 = null;
            }
            VideoChatUser h3 = mo217938h();
            if (h3 != null) {
                participantType = h3.getType();
            }
            C60783v.m236230a(str, str2, participantType, this.f158966g, LocationRequest.PRIORITY_NO_POWER, LocationRequest.PRIORITY_NO_POWER);
            C60735ab.m236018e(new RunnableC63070b(this));
        }
    }

    /* renamed from: d */
    private final void m247037d() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f158969j;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (!DesktopUtil.m144307b()) {
            Fragment fragment = this.f151992a;
            Intrinsics.checkExpressionValueIsNotNull(fragment, "fragment");
            float dimension = fragment.getResources().getDimension(R.dimen.ringing_bottom_btns_height);
            Fragment fragment2 = this.f151992a;
            Intrinsics.checkExpressionValueIsNotNull(fragment2, "fragment");
            float dimension2 = fragment2.getResources().getDimension(R.dimen.cr_avatar_container_height);
            int g = mo217937g();
            if (g == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
                Fragment fragment3 = this.f151992a;
                Intrinsics.checkExpressionValueIsNotNull(fragment3, "fragment");
                float dimension3 = fragment3.getResources().getDimension(R.dimen.calling_oncall_bottom_btns_height);
                Fragment fragment4 = this.f151992a;
                Intrinsics.checkExpressionValueIsNotNull(fragment4, "fragment");
                dimension = dimension3 + fragment4.getResources().getDimension(R.dimen.calling_oncall_bottom_btns_margin_bottom);
            } else if (g == ByteRTCMeetingActivity.TYPE.CALL_RINGING.ordinal()) {
                Fragment fragment5 = this.f151992a;
                Intrinsics.checkExpressionValueIsNotNull(fragment5, "fragment");
                dimension = fragment5.getResources().getDimension(R.dimen.ringing_bottom_btns_height);
            }
            if (layoutParams2 != null) {
                layoutParams2.topMargin = (int) (((((float) C60776r.m236144b()) - dimension) - dimension2) / ((float) 2));
                return;
            }
            return;
        }
        if (layoutParams2 != null) {
            layoutParams2.topMargin = 0;
        }
        if (layoutParams2 != null) {
            layoutParams2.addRule(15);
        }
    }

    /* renamed from: b */
    public final void mo217918b() {
        LottieAnimationView lottieAnimationView;
        IconFontView iconFontView;
        TextView textView;
        ConstraintLayout constraintLayout;
        IconFontView iconFontView2;
        TextView textView2;
        Fragment fragment = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment, "fragment");
        View view = fragment.getView();
        TextView textView3 = null;
        if (view != null) {
            lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.ringing_view);
        } else {
            lottieAnimationView = null;
        }
        if (lottieAnimationView != null) {
            lottieAnimationView.setAnimation("lottie/ripple.json");
        }
        if (lottieAnimationView != null) {
            lottieAnimationView.resumeAnimation();
        }
        int d = C60773o.m236126d(R.color.static_white);
        int d2 = C60773o.m236126d(R.color.shadow_default_sm);
        float a = (float) C60773o.m236115a(1.0d);
        float a2 = (float) C60773o.m236115a(2.0d);
        Fragment fragment2 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment2, "fragment");
        View view2 = fragment2.getView();
        if (view2 != null) {
            iconFontView = (IconFontView) view2.findViewById(R.id.calling_minimize);
        } else {
            iconFontView = null;
        }
        if (iconFontView != null) {
            iconFontView.setTextColor(C60773o.m236126d(R.color.static_white));
        }
        if (iconFontView != null) {
            iconFontView.setShadowLayer(a2, BitmapDescriptorFactory.HUE_RED, a, d2);
        }
        TextView textView4 = this.f158967h;
        if (textView4 != null) {
            textView4.setTextColor(d);
        }
        TextView textView5 = this.f158967h;
        if (textView5 != null) {
            textView5.setShadowLayer(a2, BitmapDescriptorFactory.HUE_RED, a, d2);
        }
        Fragment fragment3 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment3, "fragment");
        View view3 = fragment3.getView();
        if (view3 != null) {
            textView = (TextView) view3.findViewById(R.id.cr_invite_msg);
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setTextColor(C60773o.m236116a((int) R.color.static_white, 0.9f));
        }
        if (textView != null) {
            textView.setShadowLayer(a2, BitmapDescriptorFactory.HUE_RED, a, d2);
        }
        Fragment fragment4 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment4, "fragment");
        View view4 = fragment4.getView();
        if (view4 != null) {
            constraintLayout = (ConstraintLayout) view4.findViewById(R.id.speaker_container);
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setBackground(C60773o.m236128f(R.drawable.bg_calling_transparent_iconfont_selector));
        }
        if (constraintLayout != null) {
            constraintLayout.setPadding(0, UIHelper.dp2px(1.0f), 0, UIHelper.dp2px(3.0f));
        }
        Fragment fragment5 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment5, "fragment");
        View view5 = fragment5.getView();
        if (view5 != null) {
            iconFontView2 = (IconFontView) view5.findViewById(R.id.calling_speaker);
        } else {
            iconFontView2 = null;
        }
        if (iconFontView2 != null) {
            iconFontView2.setTextColor(d);
        }
        if (iconFontView2 != null) {
            iconFontView2.setShadowLayer(a2, BitmapDescriptorFactory.HUE_RED, a, d2);
        }
        Fragment fragment6 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment6, "fragment");
        View view6 = fragment6.getView();
        if (view6 != null) {
            textView2 = (TextView) view6.findViewById(R.id.calling_speaker_text);
        } else {
            textView2 = null;
        }
        if (textView2 != null) {
            textView2.setTextColor(d);
        }
        if (textView2 != null) {
            textView2.setShadowLayer(a2, BitmapDescriptorFactory.HUE_RED, a, d2);
        }
        Fragment fragment7 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment7, "fragment");
        View view7 = fragment7.getView();
        if (view7 != null) {
            textView3 = (TextView) view7.findViewById(R.id.calling_cancel_text);
        }
        if (textView3 != null) {
            textView3.setTextColor(d);
        }
        if (textView3 != null) {
            textView3.setShadowLayer(a2, BitmapDescriptorFactory.HUE_RED, a, d2);
        }
    }

    @Override // com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver
    public void ca_() {
        PreviewVideoView previewVideoView;
        View view;
        ImageView imageView;
        View view2;
        LKUIRoundedImageView lKUIRoundedImageView;
        TextView textView;
        View view3;
        View view4;
        ParticipantType participantType;
        String str;
        Fragment fragment = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment, "fragment");
        View view5 = fragment.getView();
        String str2 = null;
        if (view5 != null) {
            previewVideoView = (PreviewVideoView) view5.findViewById(R.id.video_view);
        } else {
            previewVideoView = null;
        }
        this.f158962c = previewVideoView;
        Fragment fragment2 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment2, "fragment");
        View view6 = fragment2.getView();
        if (view6 != null) {
            view = view6.findViewById(R.id.previewer_mask);
        } else {
            view = null;
        }
        this.f158963d = view;
        Fragment fragment3 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment3, "fragment");
        View view7 = fragment3.getView();
        if (view7 != null) {
            imageView = (ImageView) view7.findViewById(R.id.calling_ringing_blurImage);
        } else {
            imageView = null;
        }
        this.f158964e = imageView;
        Fragment fragment4 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment4, "fragment");
        View view8 = fragment4.getView();
        if (view8 != null) {
            view2 = view8.findViewById(R.id.calling_ringing_blurImageFg);
        } else {
            view2 = null;
        }
        this.f158965f = view2;
        Fragment fragment5 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment5, "fragment");
        View view9 = fragment5.getView();
        if (view9 != null) {
            lKUIRoundedImageView = (LKUIRoundedImageView) view9.findViewById(R.id.cr_thumbnail);
        } else {
            lKUIRoundedImageView = null;
        }
        this.f158966g = lKUIRoundedImageView;
        Fragment fragment6 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment6, "fragment");
        View view10 = fragment6.getView();
        if (view10 != null) {
            textView = (TextView) view10.findViewById(R.id.cr_username);
        } else {
            textView = null;
        }
        this.f158967h = textView;
        Fragment fragment7 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment7, "fragment");
        View view11 = fragment7.getView();
        if (view11 != null) {
            view3 = view11.findViewById(R.id.cr_user_avatar);
        } else {
            view3 = null;
        }
        this.f158968i = view3;
        Fragment fragment8 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment8, "fragment");
        View view12 = fragment8.getView();
        if (view12 != null) {
            view4 = view12.findViewById(R.id.cr_user_avatar_container);
        } else {
            view4 = null;
        }
        this.f158969j = view4;
        TextView textView2 = this.f158967h;
        if (textView2 != null) {
            VideoChatUser h = mo217938h();
            if (h != null) {
                participantType = h.getType();
            } else {
                participantType = null;
            }
            if (participantType == ParticipantType.PSTN_USER) {
                VideoChatUser h2 = mo217938h();
                if (h2 != null) {
                    str = h2.getNickname();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    VideoChatUser h3 = mo217938h();
                    if (h3 != null) {
                        str2 = h3.getNickname();
                    }
                    textView2.setText(str2);
                }
            }
            VideoChatUser h4 = mo217938h();
            if (h4 != null) {
                str2 = h4.getName();
            }
            textView2.setText(str2);
        }
        m247037d();
        m247042n();
    }

    @Override // com.ss.android.vc.common.lifecycle.BaseFragmentLifeCycleObserver, androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        super.onStop(lifecycleOwner);
    }

    @Override // com.ss.android.vc.common.lifecycle.BaseFragmentLifeCycleObserver, androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        C60700b.m235851b(mo217936f(), "[onDestroy]", "onDestroy");
        PreviewVideoView previewVideoView = this.f158962c;
        if (previewVideoView != null) {
            previewVideoView.mo208477c();
        }
        super.onDestroy(lifecycleOwner);
    }

    @Override // com.ss.android.vc.common.lifecycle.BaseFragmentLifeCycleObserver, androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        super.onStart(lifecycleOwner);
        C60700b.m235851b(mo217936f(), "[onStart]", "onStart");
        m247040l();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewAndUserInfoObserver(Fragment fragment, C61303k kVar, CallingRingingLiveDatas aVar) {
        super(fragment, kVar, aVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
