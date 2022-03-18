package com.ss.android.vc.meeting.module.gallery;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.common.VCShadowLayout;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.ControlOptionShowHelper;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.InMeetingParticipantControlPopWindow;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.multi.InMeetingFragment;
import com.ss.android.vc.meeting.module.multi.InMeetingGridView;
import com.ss.android.vc.meeting.module.multi.UserInfoStatusLayout;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62492f;
import com.ss.android.vc.meeting.module.multi.presenter.C62526c;
import com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator;
import com.ss.android.vc.statistics.event.bj;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0016J\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\u0012H\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J\u0012\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0010H\u0016J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0012H\u0016J\b\u0010)\u001a\u00020\u0010H\u0016J\b\u0010*\u001a\u00020\u0010H\u0016J\b\u0010+\u001a\u00020\u0010H\u0016J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u00060"}, d2 = {"Lcom/ss/android/vc/meeting/module/gallery/GalleryItemView;", "Lcom/ss/android/vc/meeting/module/multi/InMeetingGridView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "adjustLayoutForGallery", "", "checkNeedUpdateUserInfo", "", "getClipRadius", "", "getGridModelById", "Lcom/ss/android/vc/meeting/module/multi/presenter/MeetingGridModel;", "gridId", "inflateGridView", "isFrozen", "isShowing", "refreshActiveState", "remeasureAsHint", "setOnTheCallStatusInfoBg", "view", "Landroid/view/View;", "fillParent", "shouldShowCancel", "showDoubleTapTip", "showFullScreenVideo", "participant", "Lcom/ss/android/vc/entity/Participant;", "updateActionMore", "updateAsHintVisibility", "visible", "updateAvatarImageSize", "updateCameraUnavailableSize", "updateSwitchCamera", "updateUserInfoBackground", "textView", "Landroid/widget/TextView;", "videoStreamInvalid", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class GalleryItemView extends InMeetingGridView {

    /* renamed from: f */
    private String f155428f;

    /* renamed from: g */
    private HashMap f155429g;

    public GalleryItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public GalleryItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: a */
    public View mo214298a(int i) {
        if (this.f155429g == null) {
            this.f155429g = new HashMap();
        }
        View view = (View) this.f155429g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f155429g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: b */
    public boolean mo214304b() {
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    public double getClipRadius() {
        return 8.8d;
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: j */
    public boolean mo214314j() {
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: m */
    public void mo214316m() {
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    public String getTAG() {
        return this.f155428f;
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: n */
    public boolean mo214317n() {
        C60738ac.m236037c((int) R.string.View_G_DoubleTapToViewInFullScreen);
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: g */
    public void mo214309g() {
        if (!mo215958w() || getMRootView() == null) {
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: d */
    public boolean mo214306d() {
        Participant participant;
        AbstractC62485a az = getMMeeting().az();
        C62526c x = mo215959x();
        if (x != null) {
            participant = x.mo216208m();
        } else {
            participant = null;
        }
        return az.mo216035a(participant);
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: f */
    public boolean mo214308f() {
        C62526c x = mo215959x();
        if (!(x instanceof GalleryModel)) {
            x = null;
        }
        GalleryModel eVar = (GalleryModel) x;
        if (eVar != null) {
            return eVar.mo214367d();
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: h */
    public void mo214312h() {
        VCShadowLayout vCShadowLayout;
        AppCompatImageView appCompatImageView;
        ViewGroup mRootView = getMRootView();
        if (!(mRootView == null || (appCompatImageView = (AppCompatImageView) mRootView.findViewById(R.id.switch_camera)) == null)) {
            C60752f.m236083c(appCompatImageView);
        }
        ViewGroup mRootView2 = getMRootView();
        if (mRootView2 != null && (vCShadowLayout = (VCShadowLayout) mRootView2.findViewById(R.id.switch_camera_shadow_layout)) != null) {
            C60752f.m236083c(vCShadowLayout);
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: l */
    public void mo214315l() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_in_meeting_gallery_grid, (ViewGroup) this, true);
        if (inflate != null) {
            setMRootView((ViewGroup) inflate);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: c */
    public void mo214305c() {
        ((UserInfoStatusLayout) mo214298a(R.id.tv_user_info_status_onthecall)).setTextSize(10.0f);
        ((UserInfoStatusLayout) mo214298a(R.id.tv_user_info_status_onthecall)).setMUdIconSize(14.0f);
        ((UserInfoStatusLayout) mo214298a(R.id.tv_user_info_status_onthecall)).setTextPadding(C60773o.m236115a(4.0d));
        ((UserInfoStatusLayout) mo214298a(R.id.tv_user_info_status_onthecall)).setHostTextViewBgRes(R.drawable.vc_bg_user_info_host_gallery);
        ((UserInfoStatusLayout) mo214298a(R.id.tv_user_info_status_onthecall)).setIconMargin(C60773o.m236115a(2.0d));
        ((UserInfoStatusLayout) mo214298a(R.id.tv_user_info_status_onthecall)).mo215999a(true);
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: e */
    public void mo214307e() {
        ActiveSpeakerCalculator.ActiveSpeakerSpeakListener bVar;
        ActiveSpeakerCalculator w;
        if (mo215958w()) {
            if (!getMMeeting().aE().mo208293c() || getMMeeting().aE().mo208292b()) {
                C62526c x = mo215959x();
                if (x == null || !x.mo216206k() || !mo214308f()) {
                    mo214303a(false);
                } else {
                    getMMeeting().mo212163w().mo219602a(getAsSpeakerListener());
                }
            } else {
                ActiveSpeakerCalculator w2 = getMMeeting().mo212163w();
                if (w2 != null) {
                    bVar = w2.mo219610d();
                } else {
                    bVar = null;
                }
                if (Intrinsics.areEqual(bVar, getAsSpeakerListener()) && (w = getMMeeting().mo212163w()) != null) {
                    w.mo219602a((ActiveSpeakerCalculator.ActiveSpeakerSpeakListener) null);
                }
                mo214303a(false);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: o */
    public boolean mo214318o() {
        boolean z;
        boolean z2;
        C62526c x = mo215959x();
        if (x == null) {
            return true;
        }
        boolean q = mo215936q();
        if (mo215957v() || !mo214308f()) {
            return true;
        }
        AbsGalleryControl ax = getMMeeting().ax();
        if (ax != null) {
            z = ax.mo214361o();
        } else {
            z = false;
        }
        if (!z || q) {
            return true;
        }
        if (!(x instanceof GalleryModel)) {
            x = null;
        }
        GalleryModel eVar = (GalleryModel) x;
        if (eVar != null) {
            z2 = eVar.mo214366c();
        } else {
            z2 = true;
        }
        if (z2) {
            return true;
        }
        if (!getMMeeting().aE().mo208293c() || getMMeeting().aE().mo208292b()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: i */
    public void mo214313i() {
        VCShadowLayout vCShadowLayout;
        AppCompatImageView appCompatImageView;
        VCShadowLayout vCShadowLayout2;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        Participant participant;
        int i;
        ViewGroup mRootView = getMRootView();
        if (!(mRootView == null || (appCompatImageView3 = (AppCompatImageView) mRootView.findViewById(R.id.action_more)) == null)) {
            ControlOptionShowHelper aVar = ControlOptionShowHelper.f156623a;
            C61303k mMeeting = getMMeeting();
            C62526c x = mo215959x();
            if (x != null) {
                participant = x.mo216208m();
            } else {
                participant = null;
            }
            if (aVar.mo215543a(mMeeting, participant, InMeetingParticipantControlPopWindow.GridType.GALLERY) || mo215956u()) {
                i = 0;
            } else {
                i = 4;
            }
            appCompatImageView3.setVisibility(i);
        }
        ViewGroup mRootView2 = getMRootView();
        if (!(mRootView2 == null || (appCompatImageView2 = (AppCompatImageView) mRootView2.findViewById(R.id.action_more)) == null)) {
            appCompatImageView2.setOnClickListener(new C61903b(this));
        }
        ViewGroup mRootView3 = getMRootView();
        if (mRootView3 == null || (appCompatImageView = (AppCompatImageView) mRootView3.findViewById(R.id.action_more)) == null || appCompatImageView.getVisibility() != 0) {
            ViewGroup mRootView4 = getMRootView();
            if (mRootView4 != null && (vCShadowLayout = (VCShadowLayout) mRootView4.findViewById(R.id.action_more_shadow_layout)) != null) {
                vCShadowLayout.setVisibility(4);
                return;
            }
            return;
        }
        ViewGroup mRootView5 = getMRootView();
        if (mRootView5 != null && (vCShadowLayout2 = (VCShadowLayout) mRootView5.findViewById(R.id.action_more_shadow_layout)) != null) {
            vCShadowLayout2.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/gallery/GalleryItemView$updateActionMore$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.GalleryItemView$b */
    public static final class C61903b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ GalleryItemView f155431a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61903b(GalleryItemView galleryItemView) {
            this.f155431a = galleryItemView;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Participant participant;
            InMeetingFragment z;
            GalleryViewControl r;
            C62526c x = this.f155431a.mo215959x();
            if (x != null) {
                participant = x.mo216208m();
            } else {
                participant = null;
            }
            Activity b = C60773o.m236124b(this.f155431a.getContext());
            if (b == null) {
                C60700b.m235851b(this.f155431a.getTAG(), "[updateActionMore]", "mActivity is null");
            } else if (participant == null) {
                C60700b.m235851b(this.f155431a.getTAG(), "[updateActionMore2]", "participant is null");
            } else {
                this.f155431a.setPopWindow(new InMeetingParticipantControlPopWindow(b, this.f155431a.getMMeeting(), InMeetingParticipantControlPopWindow.GridType.GALLERY, participant));
                InMeetingParticipantControlPopWindow popWindow = this.f155431a.getPopWindow();
                if (popWindow != null) {
                    if (!(!(b instanceof ByteRTCMeetingActivity) || (z = ((ByteRTCMeetingActivity) b).mo215865z()) == null || (r = z.mo212939r()) == null)) {
                        r.mo214369a(popWindow);
                    }
                    popWindow.mo100027a((View) ((AppCompatImageView) this.f155431a.mo214298a(R.id.action_more)));
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    public void setTAG(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f155428f = str;
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: a */
    public C62526c mo214299a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "gridId");
        return getMMeeting().ax().mo214333c(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "show", "", "onFullScreenShowChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.GalleryItemView$a */
    static final class C61902a implements AbstractC62492f {

        /* renamed from: a */
        final /* synthetic */ GalleryItemView f155430a;

        C61902a(GalleryItemView galleryItemView) {
            this.f155430a = galleryItemView;
        }

        @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62492f
        public final void onFullScreenShowChanged(boolean z) {
            if (!z && this.f155430a.mo214308f() && this.f155430a.isAttachedToWindow()) {
                C62526c x = this.f155430a.mo215959x();
                if (!(x instanceof GalleryModel)) {
                    x = null;
                }
                GalleryModel eVar = (GalleryModel) x;
                if (eVar != null) {
                    eVar.mo214365b();
                }
                this.f155430a.mo215937r();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: a */
    public void mo214301a(TextView textView) {
        int i;
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        if (((float) ((textView.getMeasuredWidth() - textView.getCompoundPaddingLeft()) - textView.getCompoundPaddingRight())) < Layout.getDesiredWidth(textView.getText(), textView.getPaint())) {
            i = R.drawable.bg_user_info_gallery_status_1;
        } else {
            i = R.drawable.bg_user_info_gallery_status_2;
        }
        textView.setBackground(C60773o.m236128f(i));
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: a */
    public void mo214302a(Participant participant) {
        getMMeeting().az().mo216031a(participant, new C61902a(this));
        bj.m250181a(true, getMMeeting().mo212056e());
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: a */
    public void mo214303a(boolean z) {
        View mAsHintView;
        View mAsHintView2;
        if (z && getMMeeting().mo212057f() == VideoChat.Type.MEET) {
            if (getMAsHintView() == null) {
                C60740ad.m236052b((ViewStub) findViewById(R.id.stub_as_hint));
                setMAsHintView(mo214298a(R.id.view_as_hint_border));
            }
            View mAsHintView3 = getMAsHintView();
            if (mAsHintView3 == null) {
                Intrinsics.throwNpe();
            }
            if (mAsHintView3.getVisibility() != 0 && (mAsHintView2 = getMAsHintView()) != null) {
                C60752f.m236079a(mAsHintView2);
            }
        } else if (getMAsHintView() != null) {
            View mAsHintView4 = getMAsHintView();
            if (mAsHintView4 == null) {
                Intrinsics.throwNpe();
            }
            if (mAsHintView4.getVisibility() == 0 && (mAsHintView = getMAsHintView()) != null) {
                C60752f.m236083c(mAsHintView);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.InMeetingGridView
    /* renamed from: a */
    public void mo214300a(View view, boolean z) {
        int i;
        if (view != null) {
            if (z) {
                i = R.drawable.bg_user_info_gallery_status_1;
            } else {
                i = R.drawable.bg_user_info_gallery_status_2;
            }
            view.setBackground(C60773o.m236128f(i));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f155428f = "GalleryItemView@";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GalleryItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
