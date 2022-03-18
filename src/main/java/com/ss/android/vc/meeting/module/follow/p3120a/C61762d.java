package com.ss.android.vc.meeting.module.follow.p3120a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.AbstractC60902q;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView;
import com.ss.android.vc.meeting.module.p3130k.C61999a;

/* renamed from: com.ss.android.vc.meeting.module.follow.a.d */
public class C61762d extends C61756a implements AbstractC61768k {

    /* renamed from: c */
    private static final AbstractC60902q f154977c = VideoChatModule.getDependency().getGuideDependency();

    /* renamed from: d */
    private View f154978d;

    /* renamed from: e */
    private FollowOnBoardingPopupView f154979e;

    /* renamed from: f */
    private FollowOnBoardingPopupView f154980f;

    /* renamed from: g */
    private FollowOnBoardingPopupView f154981g;

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61768k
    /* renamed from: a */
    public void mo213961a(boolean z, boolean z2) {
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61768k
    /* renamed from: b */
    public void mo213962b() {
        C60700b.m235851b("FollowLog_FollowOnBoardingViewControl", "[dismissAll]", "dismissAll");
        FollowOnBoardingPopupView followOnBoardingPopupView = this.f154979e;
        if (followOnBoardingPopupView != null) {
            followOnBoardingPopupView.mo211398c();
        }
        FollowOnBoardingPopupView followOnBoardingPopupView2 = this.f154980f;
        if (followOnBoardingPopupView2 != null) {
            followOnBoardingPopupView2.mo211398c();
        }
        FollowOnBoardingPopupView followOnBoardingPopupView3 = this.f154981g;
        if (followOnBoardingPopupView3 != null) {
            followOnBoardingPopupView3.mo211398c();
        }
    }

    /* renamed from: c */
    private void m241162c() {
        FollowOnBoardingPopupView.Type type;
        FollowOnBoardingPopupView followOnBoardingPopupView = this.f154981g;
        if (followOnBoardingPopupView != null) {
            followOnBoardingPopupView.mo211398c();
            View findViewById = this.f154978d.findViewById(R.id.follow_content_viewcontrol_container);
            FollowOnBoardingPopupView followOnBoardingPopupView2 = this.f154981g;
            if (C61999a.m242220f()) {
                type = FollowOnBoardingPopupView.Type.HORIZONTAL_FREE_BROWSE;
            } else {
                type = FollowOnBoardingPopupView.Type.VERTICAL_FREE_BROWSE;
            }
            followOnBoardingPopupView2.mo214088a(type);
            this.f154981g.mo214089a(UIHelper.getString(R.string.View_VM_TapToViewOnYourOwn));
            this.f154981g.mo214086a(findViewById);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61768k
    /* renamed from: a */
    public void mo213959a() {
        AbstractC60902q qVar = f154977c;
        boolean checkToShow = qVar.checkToShow("mobile_magic_share_free_browse");
        C60700b.m235851b("FollowLog_FollowOnBoardingViewControl", "[checkShowFreeBrowseOnBoarding]", "" + checkToShow);
        if (checkToShow) {
            m241162c();
            qVar.completeGuide("mobile_magic_share_free_browse", true);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61768k
    /* renamed from: b */
    public void mo213963b(ViewGroup viewGroup) {
        AbstractC60902q qVar = f154977c;
        boolean checkToShow = qVar.checkToShow("mobile_magic_share_to_presenter");
        C60700b.m235851b("FollowLog_FollowOnBoardingViewControl", "[checkToPresenterOnBoarding]", "shouldShowAtTip= " + checkToShow);
        if (checkToShow) {
            m241163c(viewGroup);
            qVar.completeGuide("mobile_magic_share_to_presenter", true);
        }
    }

    /* renamed from: c */
    private void m241163c(ViewGroup viewGroup) {
        FollowOnBoardingPopupView.Type type;
        FollowOnBoardingPopupView followOnBoardingPopupView = this.f154980f;
        if (followOnBoardingPopupView != null) {
            followOnBoardingPopupView.mo211398c();
            View findViewById = viewGroup.findViewById(R.id.agent_follow_action_to_presenter);
            if (this.f154960a.ab().mo213882h() != null) {
                this.f154980f.mo214089a(UIHelper.getString(R.string.View_VM_TapToFollowPersonSharing));
                FollowOnBoardingPopupView followOnBoardingPopupView2 = this.f154980f;
                if (C61999a.m242220f()) {
                    type = FollowOnBoardingPopupView.Type.HORIZONTAL_TO_PRESENTER;
                } else {
                    type = FollowOnBoardingPopupView.Type.VERTICAL_TO_PRESENTER;
                }
                followOnBoardingPopupView2.mo214088a(type);
                this.f154980f.mo214086a(findViewById);
            }
        }
    }

    /* renamed from: d */
    private void m241164d(ViewGroup viewGroup) {
        String str;
        FollowOnBoardingPopupView.Type type;
        FollowOnBoardingPopupView followOnBoardingPopupView = this.f154979e;
        if (followOnBoardingPopupView != null) {
            followOnBoardingPopupView.mo211398c();
            View findViewById = viewGroup.findViewById(R.id.follow_icon_back);
            if (this.f154960a.ab().mo213882h() != null) {
                if (this.f154960a.ab().mo213882h().getShareType() == FollowInfo.ShareType.CCM || this.f154960a.ab().mo213882h().getShareType() == FollowInfo.ShareType.GOOGLE) {
                    str = UIHelper.getString(R.string.View_VM_TapToGoBackToFile);
                } else {
                    str = UIHelper.getString(R.string.View_VM_TapToGoBackToWebPage);
                }
                this.f154979e.mo214089a(str);
                FollowOnBoardingPopupView followOnBoardingPopupView2 = this.f154979e;
                if (C61999a.m242220f()) {
                    type = FollowOnBoardingPopupView.Type.HORIZONTAL_GO_BACK;
                } else {
                    type = FollowOnBoardingPopupView.Type.VERTICAL_GO_BACK;
                }
                followOnBoardingPopupView2.mo214088a(type);
                this.f154979e.mo214086a(findViewById);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61768k
    /* renamed from: a */
    public void mo213960a(ViewGroup viewGroup) {
        AbstractC60902q qVar = f154977c;
        boolean checkToShow = qVar.checkToShow("mobile_vc_magic_share_back");
        C60700b.m235851b("FollowLog_FollowOnBoardingViewControl", "[checkGoBackOnBoarding]", "shouldShowAtTip= " + checkToShow);
        if (checkToShow) {
            m241164d(viewGroup);
            qVar.completeGuide("mobile_vc_magic_share_back", true);
        }
    }

    public C61762d(Context context, C61303k kVar, View view) {
        super(kVar);
        this.f154978d = view;
        this.f154979e = (FollowOnBoardingPopupView) FollowOnBoardingPopupView.m241448a(context).mo219699g();
        this.f154980f = (FollowOnBoardingPopupView) FollowOnBoardingPopupView.m241448a(context).mo219699g();
        this.f154981g = (FollowOnBoardingPopupView) FollowOnBoardingPopupView.m241448a(context).mo219699g();
    }
}
