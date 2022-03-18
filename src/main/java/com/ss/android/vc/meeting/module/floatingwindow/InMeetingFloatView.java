package com.ss.android.vc.meeting.module.floatingwindow;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.widget.VCFloatLayout;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.irtc.utils.C61074b;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamManagerGlobal;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.follow.common.VCShadowLayout;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.ControlOptionShowHelper;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.InMeetingParticipantControlPopWindow;
import com.ss.android.vc.meeting.module.multi.UserInfoStatusLayout;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import com.ss.android.vc.meeting.module.p3117d.C61600b;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.statistics.event.C63742at;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001*B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0014J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0002J\u0010\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\fJ\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0014J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J\u0018\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010)R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/vc/meeting/module/floatingwindow/InMeetingFloatView;", "Lcom/ss/android/vc/common/widget/VCFloatLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "contentListener", "Landroid/view/View$OnClickListener;", "invalid", "", "lastParticipant", "Lcom/ss/android/vc/entity/Participant;", "mName", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "popWindow", "Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/popupwindow/InMeetingParticipantControlPopWindow;", "renderSurface", "Landroid/view/View;", "shouldInitLandscape", "destroy", "", "initFloatView", "isSelfCameraUnavailable", "isSelfMicUnavailable", "setContentClickListener", "listener", "setVisibility", "visibility", "updateActionMore", "updateAttachInfo", "updateSwitchCamera", "updateUserInfo", "updateView", "participant", "presenter", "Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;", "FloatViewRenderListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InMeetingFloatView extends VCFloatLayout {

    /* renamed from: d */
    public final String f154781d;

    /* renamed from: e */
    public String f154782e;

    /* renamed from: f */
    public Participant f154783f;

    /* renamed from: g */
    public InMeetingParticipantControlPopWindow f154784g;

    /* renamed from: h */
    public C61303k f154785h;

    /* renamed from: i */
    private View.OnClickListener f154786i;

    /* renamed from: j */
    private View f154787j;

    /* renamed from: k */
    private boolean f154788k;

    /* renamed from: l */
    private HashMap f154789l;

    public InMeetingFloatView(Context context) {
        this(context, null, 0, 6, null);
    }

    public InMeetingFloatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo213678a(int i) {
        if (this.f154789l == null) {
            this.f154789l = new HashMap();
        }
        View view = (View) this.f154789l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f154789l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/floatingwindow/InMeetingFloatView$updateUserInfo$1", "Lcom/ss/android/vc/meeting/module/multi/UserInfoStatusLayout$OnLayoutChangeObserver;", "onLayoutChange", "", "self", "Landroid/view/View;", "fillParent", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView$d */
    public static final class C61683d implements UserInfoStatusLayout.OnLayoutChangeObserver {
        C61683d() {
        }

        @Override // com.ss.android.vc.meeting.module.multi.UserInfoStatusLayout.OnLayoutChangeObserver
        public void onLayoutChange(View view, boolean z) {
            int i;
            if (z) {
                i = R.drawable.vc_bg_floatview_name_long;
            } else {
                i = R.drawable.bg_floatview_name_not_fill;
            }
            if (view != null) {
                view.setBackground(C60773o.m236128f(i));
            }
        }
    }

    /* renamed from: i */
    private final boolean m240786i() {
        if (!ParticipantUtil.m248732c(this.f154783f) || C60788y.m236247a(getContext())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private final boolean m240787j() {
        if (!ParticipantUtil.m248732c(this.f154783f) || C60788y.m236250b(getContext())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.widget.VCFloatLayout
    /* renamed from: a */
    public void mo208522a() {
        super.mo208522a();
        View.OnClickListener onClickListener = this.f154786i;
        if (onClickListener != null && onClickListener != null) {
            getContentView().setOnClickListener(this.f154786i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.widget.VCFloatLayout
    /* renamed from: d */
    public void mo208528d() {
        C61303k kVar = this.f154785h;
        if (kVar != null) {
            VideoChat e = kVar.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "it.videoChat");
            if (e.getType() == VideoChat.Type.MEET) {
                setMinTopMargin(C60773o.m236115a(38.0d));
            }
        }
        super.mo208528d();
    }

    /* renamed from: f */
    public final void mo213681f() {
        ByteRtc y;
        if (!this.f154788k) {
            C60700b.m235851b(this.f154781d, "[destroy]", "destroy");
            this.f154788k = true;
            this.f154783f = null;
            FrameLayout frameLayout = (FrameLayout) mo213678a(R.id.container_surface);
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            C61303k kVar = this.f154785h;
            if (!(kVar == null || (y = kVar.mo212165y()) == null)) {
                y.mo211992a(this.f154787j);
            }
            InMeetingParticipantControlPopWindow inMeetingParticipantControlPopWindow = this.f154784g;
            if (inMeetingParticipantControlPopWindow != null) {
                inMeetingParticipantControlPopWindow.dismiss();
            }
        }
    }

    /* renamed from: g */
    private final void m240784g() {
        int i;
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo213678a(R.id.switch_camera);
        if (appCompatImageView != null) {
            if (ControlOptionShowHelper.f156623a.mo215544b(this.f154785h, this.f154783f, InMeetingParticipantControlPopWindow.GridType.FLOAT)) {
                i = 0;
            } else {
                i = 4;
            }
            appCompatImageView.setVisibility(i);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo213678a(R.id.switch_camera);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new C61682c(this));
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) mo213678a(R.id.switch_camera);
        if (appCompatImageView3 == null || appCompatImageView3.getVisibility() != 0) {
            VCShadowLayout vCShadowLayout = (VCShadowLayout) mo213678a(R.id.switch_camera_shadow_layout);
            if (vCShadowLayout != null) {
                vCShadowLayout.setVisibility(4);
                return;
            }
            return;
        }
        VCShadowLayout vCShadowLayout2 = (VCShadowLayout) mo213678a(R.id.switch_camera_shadow_layout);
        if (vCShadowLayout2 != null) {
            vCShadowLayout2.setVisibility(0);
        }
    }

    /* renamed from: h */
    private final void m240785h() {
        int i;
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo213678a(R.id.action_more);
        if (appCompatImageView != null) {
            if (ControlOptionShowHelper.f156623a.mo215543a(this.f154785h, this.f154783f, InMeetingParticipantControlPopWindow.GridType.FLOAT)) {
                i = 0;
            } else {
                i = 4;
            }
            appCompatImageView.setVisibility(i);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo213678a(R.id.action_more);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new C61681b(this));
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) mo213678a(R.id.action_more);
        if (appCompatImageView3 == null || appCompatImageView3.getVisibility() != 0) {
            VCShadowLayout vCShadowLayout = (VCShadowLayout) mo213678a(R.id.action_more_shadow_layout);
            if (vCShadowLayout != null) {
                vCShadowLayout.setVisibility(4);
                return;
            }
            return;
        }
        VCShadowLayout vCShadowLayout2 = (VCShadowLayout) mo213678a(R.id.action_more_shadow_layout);
        if (vCShadowLayout2 != null) {
            vCShadowLayout2.setVisibility(0);
        }
    }

    /* renamed from: e */
    public final void mo213680e() {
        Boolean bool;
        Participant participant = this.f154783f;
        if (participant != null) {
            ParticipantSettings participantSettings = participant.getParticipantSettings();
            Intrinsics.checkExpressionValueIsNotNull(participantSettings, "it.participantSettings");
            bool = Boolean.valueOf(participantSettings.isMicrophoneMuted());
        } else {
            bool = null;
        }
        ((UserInfoStatusLayout) mo213678a(R.id.user_info)).setTextSize(10.0f);
        ((UserInfoStatusLayout) mo213678a(R.id.user_info)).setMUdIconSize(14.0f);
        ((UserInfoStatusLayout) mo213678a(R.id.user_info)).setTextPadding(C60773o.m236115a(4.0d));
        ((UserInfoStatusLayout) mo213678a(R.id.user_info)).setHostTextViewBgRes(R.drawable.vc_bg_user_info_host_float);
        ((UserInfoStatusLayout) mo213678a(R.id.user_info)).setIconMargin(C60773o.m236115a(2.0d));
        UserInfoStatusLayout.m244197a((UserInfoStatusLayout) mo213678a(R.id.user_info), null, bool, null, null, this.f154782e, null, Boolean.valueOf(m240787j()), 8, null);
        ((UserInfoStatusLayout) mo213678a(R.id.user_info)).setOnLayoutChangeObserver(new C61683d());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/floatingwindow/InMeetingFloatView$updateActionMore$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView$b */
    public static final class C61681b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ InMeetingFloatView f154790a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61681b(InMeetingFloatView inMeetingFloatView) {
            this.f154790a = inMeetingFloatView;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Activity b = C60773o.m236124b(this.f154790a.getContext());
            if (b == null) {
                C60700b.m235861e(this.f154790a.f154781d, "[updateActionMore]", "mActivity is null");
            } else if (this.f154790a.f154783f == null) {
                C60700b.m235861e(this.f154790a.f154781d, "[updateActionMore2]", "participant is null");
            } else {
                this.f154790a.f154784g = new InMeetingParticipantControlPopWindow(b, this.f154790a.f154785h, InMeetingParticipantControlPopWindow.GridType.FLOAT, this.f154790a.f154783f);
                InMeetingParticipantControlPopWindow inMeetingParticipantControlPopWindow = this.f154790a.f154784g;
                if (inMeetingParticipantControlPopWindow != null) {
                    inMeetingParticipantControlPopWindow.mo100027a((View) ((AppCompatImageView) this.f154790a.mo213678a(R.id.action_more)));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/floatingwindow/InMeetingFloatView$updateSwitchCamera$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView$c */
    public static final class C61682c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ InMeetingFloatView f154791a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61682c(InMeetingFloatView inMeetingFloatView) {
            this.f154791a = inMeetingFloatView;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            VideoChat videoChat;
            DataAdapterUtil aVar = DataAdapterUtil.f154006a;
            C61303k kVar = this.f154791a.f154785h;
            if (kVar == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo212860f(kVar);
            C61303k kVar2 = this.f154791a.f154785h;
            if (kVar2 != null) {
                videoChat = kVar2.mo212056e();
            } else {
                videoChat = null;
            }
            C63742at.m250116w(videoChat);
        }
    }

    public final void setContentClickListener(View.OnClickListener onClickListener) {
        this.f154786i = onClickListener;
        View contentView = getContentView();
        if (contentView != null && contentView != null) {
            getContentView().setOnClickListener(this.f154786i);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (!isShown()) {
            this.f154783f = null;
            LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) mo213678a(R.id.img_avatar);
            if (lKUIRoundedImageView != null) {
                lKUIRoundedImageView.setImageBitmap(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/ss/android/vc/meeting/module/floatingwindow/InMeetingFloatView$FloatViewRenderListener;", "Lcom/ss/android/vc/meeting/module/eglrenderlistener/WeakRtcEglRenderListener;", "Lcom/ss/android/vc/meeting/module/floatingwindow/InMeetingFloatView;", "tag", "", "host", "(Ljava/lang/String;Lcom/ss/android/vc/meeting/module/floatingwindow/InMeetingFloatView;)V", "onBeginRender", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView$a */
    private static final class FloatViewRenderListener extends C61600b<InMeetingFloatView> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo213457a(InMeetingFloatView inMeetingFloatView) {
            String str;
            Boolean bool;
            int childCount;
            LKUIRoundedImageView lKUIRoundedImageView;
            Participant participant;
            ParticipantSettings participantSettings;
            Participant participant2;
            String str2 = this.f154539a;
            StringBuilder sb = new StringBuilder();
            sb.append("deviceId: ");
            FrameLayout frameLayout = null;
            if (inMeetingFloatView == null || (participant2 = inMeetingFloatView.f154783f) == null) {
                str = null;
            } else {
                str = participant2.getDeviceId();
            }
            sb.append(str);
            sb.append(", ");
            sb.append("isCameraMuted: ");
            if (inMeetingFloatView == null || (participant = inMeetingFloatView.f154783f) == null || (participantSettings = participant.getParticipantSettings()) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(participantSettings.isCameraMuted());
            }
            sb.append(bool);
            C60700b.m235851b(str2, "[onBeginRender]", sb.toString());
            if (!(inMeetingFloatView == null || (lKUIRoundedImageView = (LKUIRoundedImageView) inMeetingFloatView.mo213678a(R.id.img_avatar)) == null)) {
                C60752f.m236083c(lKUIRoundedImageView);
            }
            if (inMeetingFloatView != null) {
                frameLayout = (FrameLayout) inMeetingFloatView.mo213678a(R.id.container_surface);
            }
            if (frameLayout != null && (childCount = frameLayout.getChildCount() - 1) > 0) {
                frameLayout.removeViews(1, childCount);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FloatViewRenderListener(String str, InMeetingFloatView inMeetingFloatView) {
            super(str, inMeetingFloatView);
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(inMeetingFloatView, "host");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "user", "Lcom/ss/android/vc/net/service/VideoChatUser;", "kotlin.jvm.PlatformType", "onGetUserInfo"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView$e */
    static final class C61684e implements GetUserInfoListener {

        /* renamed from: a */
        final /* synthetic */ InMeetingFloatView f154792a;

        /* renamed from: b */
        final /* synthetic */ Participant f154793b;

        C61684e(InMeetingFloatView inMeetingFloatView, Participant participant) {
            this.f154792a = inMeetingFloatView;
            this.f154793b = participant;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
            if (r0.isUnknownType() != false) goto L_0x003a;
         */
        @Override // com.ss.android.vc.net.service.GetUserInfoListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onGetUserInfo(com.ss.android.vc.net.service.VideoChatUser r10) {
            /*
            // Method dump skipped, instructions count: 262
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView.C61684e.onGetUserInfo(com.ss.android.vc.net.service.VideoChatUser):void");
        }
    }

    /* renamed from: a */
    public final void mo213679a(Participant participant, InMeetingPresenter bVar) {
        C61303k kVar;
        Integer num;
        C61303k kVar2;
        C61303k meeting;
        ByteRtc y;
        C61303k meeting2;
        ByteRtc y2;
        StreamManagerGlobal T;
        StreamManagerGlobal T2;
        ViewParent viewParent;
        C61303k meeting3;
        StreamManagerGlobal T3;
        StreamManagerGlobal T4;
        Participant participant2;
        C61303k meeting4;
        StreamManagerGlobal T5;
        StreamManagerGlobal T6;
        Intrinsics.checkParameterIsNotNull(participant, "participant");
        boolean a = ParticipantUtil.m248715a(participant, this.f154783f);
        boolean z = true;
        if (!(a || (participant2 = this.f154783f) == null || participant2 == null || bVar == null || (meeting4 = bVar.getMeeting()) == null || (T5 = meeting4.mo212102T()) == null)) {
            Participant participant3 = this.f154783f;
            if (participant3 == null) {
                Intrinsics.throwNpe();
            }
            String rtcJoinId = participant3.getRtcJoinId();
            Intrinsics.checkExpressionValueIsNotNull(rtcJoinId, "lastParticipant!!.rtcJoinId");
            VcByteStream e = T5.mo212228e(rtcJoinId);
            if (e != null) {
                C61303k meeting5 = bVar.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting5, "presenter.meeting");
                if (!meeting5.aw().mo216148d()) {
                    C60700b.m235851b(this.f154781d, "[updateView]", "[unSubscribeStream] " + e.f152907a);
                    C61303k meeting6 = bVar.getMeeting();
                    if (!(meeting6 == null || (T6 = meeting6.mo212102T()) == null)) {
                        T6.mo212214a(e, StreamSpec.Scene.MEETING_FLOAT_VIEW, StreamSpec.Resolution.UNKNOWN, true);
                    }
                }
            }
        }
        if (!(bVar == null || (meeting3 = bVar.getMeeting()) == null || (T3 = meeting3.mo212102T()) == null)) {
            String rtcJoinId2 = participant.getRtcJoinId();
            Intrinsics.checkExpressionValueIsNotNull(rtcJoinId2, "participant.rtcJoinId");
            VcByteStream e2 = T3.mo212228e(rtcJoinId2);
            if (e2 != null) {
                C60700b.m235851b(this.f154781d, "[updateView2]", "[subscribeStream] " + e2.f152907a);
                C61303k meeting7 = bVar.getMeeting();
                if (!(meeting7 == null || (T4 = meeting7.mo212102T()) == null)) {
                    StreamSpec.Scene scene = StreamSpec.Scene.MEETING_FLOAT_VIEW;
                    StreamSpec.Resolution resolution = StreamSpec.Resolution.FLOAT_WINDOW;
                    ParticipantSettings participantSettings = participant.getParticipantSettings();
                    Intrinsics.checkExpressionValueIsNotNull(participantSettings, "participant.participantSettings");
                    T4.mo212214a(e2, scene, resolution, participantSettings.isCameraMuted());
                }
            }
        }
        String str = null;
        if (bVar != null) {
            kVar = bVar.getMeeting();
        } else {
            kVar = null;
        }
        this.f154785h = kVar;
        this.f154783f = participant;
        this.f154788k = false;
        String str2 = this.f154781d;
        StringBuilder sb = new StringBuilder();
        sb.append("New as is : ");
        sb.append(participant.getDeviceId());
        sb.append(" surface: ");
        View view = this.f154787j;
        if (view != null) {
            num = Integer.valueOf(view.hashCode());
        } else {
            num = null;
        }
        sb.append(num.intValue());
        C60700b.m235851b(str2, "[updateFloatView]", sb.toString());
        boolean i = m240786i();
        ParticipantSettings participantSettings2 = participant.getParticipantSettings();
        Intrinsics.checkExpressionValueIsNotNull(participantSettings2, "participant.participantSettings");
        if (participantSettings2.isCameraMuted() || i) {
            String str3 = this.f154781d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Mute] surface null is ");
            if (this.f154787j != null) {
                z = false;
            }
            sb2.append(z);
            sb2.append(", camera mute is ");
            ParticipantSettings participantSettings3 = participant.getParticipantSettings();
            Intrinsics.checkExpressionValueIsNotNull(participantSettings3, "participant.participantSettings");
            sb2.append(participantSettings3.isCameraMuted());
            C60700b.m235864f(str3, "[updateFloatView2]", sb2.toString());
            if (i) {
                FrameLayout frameLayout = (FrameLayout) mo213678a(R.id.container_surface);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "container_surface");
                C60752f.m236083c(frameLayout);
                LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) mo213678a(R.id.img_avatar);
                Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView, "img_avatar");
                C60752f.m236083c(lKUIRoundedImageView);
                AppCompatImageView appCompatImageView = (AppCompatImageView) mo213678a(R.id.camera_unavailable);
                Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "camera_unavailable");
                C60752f.m236079a((View) appCompatImageView);
            } else {
                FrameLayout frameLayout2 = (FrameLayout) mo213678a(R.id.container_surface);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "container_surface");
                C60752f.m236083c(frameLayout2);
                LKUIRoundedImageView lKUIRoundedImageView2 = (LKUIRoundedImageView) mo213678a(R.id.img_avatar);
                Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "img_avatar");
                C60752f.m236079a((View) lKUIRoundedImageView2);
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo213678a(R.id.camera_unavailable);
                Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "camera_unavailable");
                C60752f.m236083c(appCompatImageView2);
            }
            if (this.f154787j.getParent() != null) {
                C61303k kVar3 = this.f154785h;
                if (!(kVar3 == null || (y = kVar3.mo212165y()) == null)) {
                    y.mo211992a(this.f154787j);
                }
                FrameLayout frameLayout3 = (FrameLayout) mo213678a(R.id.container_surface);
                if (frameLayout3 != null) {
                    frameLayout3.removeAllViews();
                }
            }
        } else {
            FrameLayout frameLayout4 = (FrameLayout) mo213678a(R.id.container_surface);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout4, "container_surface");
            C60752f.m236079a((View) frameLayout4);
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) mo213678a(R.id.camera_unavailable);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView3, "camera_unavailable");
            C60752f.m236083c(appCompatImageView3);
            if (a) {
                View view2 = this.f154787j;
                if (view2 != null) {
                    viewParent = view2.getParent();
                } else {
                    viewParent = null;
                }
                if (Intrinsics.areEqual(viewParent, (FrameLayout) mo213678a(R.id.container_surface))) {
                    C60700b.m235864f(this.f154781d, "[updateFloatView3]", "[Unmute] surface has been attached.");
                }
            }
            LKUIRoundedImageView lKUIRoundedImageView3 = (LKUIRoundedImageView) mo213678a(R.id.img_avatar);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView3, "img_avatar");
            C60752f.m236079a((View) lKUIRoundedImageView3);
            C60700b.m235851b(this.f154781d, "[updateFloatView4]", "Show surface");
            C61074b.m237510a(this.f154787j, (float) C60773o.m236115a(8.0d));
            C61074b.m237511a(this.f154787j, C60773o.m236126d(R.color.vc_bg_float_video));
            ((FrameLayout) mo213678a(R.id.container_surface)).removeAllViews();
            ((FrameLayout) mo213678a(R.id.container_surface)).addView(this.f154787j, new FrameLayout.LayoutParams(-1, -1));
            if (ParticipantUtil.m248732c(this.f154783f)) {
                C61303k kVar4 = this.f154785h;
                if (!(kVar4 == null || (T2 = kVar4.mo212102T()) == null)) {
                    T2.mo212208a(this.f154787j, ParticipantUtil.m248728b(this.f154785h));
                }
            } else {
                C61303k kVar5 = this.f154785h;
                if (!(kVar5 == null || (T = kVar5.mo212102T()) == null)) {
                    T.mo212218b(this.f154787j, participant.getRtcJoinId());
                }
            }
            if (!(bVar == null || (meeting2 = bVar.getMeeting()) == null || (y2 = meeting2.mo212165y()) == null)) {
                y2.mo211993a(this.f154787j, new FloatViewRenderListener(this.f154781d, this));
            }
        }
        if (bVar != null) {
            kVar2 = bVar.getMeeting();
        } else {
            kVar2 = null;
        }
        if (MeetingUtil.m238366a(kVar2, participant)) {
            C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, (LKUIRoundedImageView) mo213678a(R.id.img_avatar));
            this.f154782e = getResources().getString(R.string.View_M_Interviewer);
            C60700b.m235851b(this.f154781d, "[updateFloatView5]", "Update Name for : " + participant.getDeviceId());
            mo213680e();
        } else {
            if (!(bVar == null || (meeting = bVar.getMeeting()) == null)) {
                str = meeting.mo212055d();
            }
            UserInfoService.getUserInfoById(str, participant.getId(), participant.getParticipantType(), new C61684e(this, participant));
        }
        m240784g();
        m240785h();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InMeetingFloatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f154781d = "InMeetingFloatView";
        View c = C61237h.m238223a().mo210531c(false);
        Intrinsics.checkExpressionValueIsNotNull(c, "VcRtcService.getInstance().createRenderView(false)");
        this.f154787j = c;
        LayoutInflater.from(context).inflate(R.layout.floatview_inmeeting, (ViewGroup) this, true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InMeetingFloatView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
