package com.ss.android.lark.invitation.v2.feat.edu.nonDirectional;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.mvp.AbstractC40090b;
import com.ss.android.lark.inv.export.mvp.InvBaseView;
import com.ss.android.lark.inv.export.util.InvErrorView;
import com.ss.android.lark.invitation.v2.feat.edu.bean.EduInvitation;
import com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionShareCardView;
import com.ss.android.lark.invitation.v2.feat.external.main1.InviteParentNonDirectionFragment;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0012\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u0019H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/edu/nonDirectional/InviteParentNonDirectionView;", "Lcom/ss/android/lark/inv/export/mvp/InvBaseView;", "Lcom/ss/android/lark/invitation/v2/feat/edu/nonDirectional/InviteParentNonDirectionMvp$View;", "fragment", "Lcom/ss/android/lark/invitation/v2/feat/external/main1/InviteParentNonDirectionFragment;", "(Lcom/ss/android/lark/invitation/v2/feat/external/main1/InviteParentNonDirectionFragment;)V", "ipnBottomTipTv", "Landroid/widget/TextView;", "ipnContentSv", "Landroid/widget/ScrollView;", "ipnErrorView", "Lcom/ss/android/lark/inv/export/util/InvErrorView;", "ipnShareCardView", "Lcom/ss/android/lark/invitation/v2/feat/edu/nonDirectional/InviteParentNonDirectionShareCardView;", "ipnTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "loadingDialog", "Lcom/ss/android/lark/utils/ViewUtils$PageLoadingDialog;", "retryListener", "Landroid/view/View$OnClickListener;", "getPresenter", "Lcom/ss/android/lark/invitation/v2/feat/edu/nonDirectional/InviteParentNonDirectionPresenter;", "initCard", "", ShareHitPoint.f121869d, "", "invitation", "Lcom/ss/android/lark/invitation/v2/feat/edu/bean/EduInvitation;", "initLoading", "setParamsForDesktop", "showError", "msg", "updateBottomTipByType", "it", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteParentNonDirectionView extends InvBaseView<InviteParentNonDirectionView> {

    /* renamed from: a */
    public final ScrollView f102114a;

    /* renamed from: b */
    public final InvErrorView f102115b;

    /* renamed from: c */
    public ViewUtils.C57757c f102116c;

    /* renamed from: d */
    private final CommonTitleBar f102117d;

    /* renamed from: e */
    private final InviteParentNonDirectionShareCardView f102118e;

    /* renamed from: f */
    private final TextView f102119f;

    /* renamed from: g */
    private View.OnClickListener f102120g;

    /* renamed from: d */
    private final void m159326d() {
        if (DesktopUtil.m144307b()) {
            this.f102117d.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        }
    }

    /* renamed from: b */
    public final InviteParentNonDirectionPresenter mo145845b() {
        AbstractC40090b a = mo145595a(InviteParentNonDirectionPresenter.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "getPresenter(InviteParen…ionPresenter::class.java)");
        return (InviteParentNonDirectionPresenter) a;
    }

    /* renamed from: c */
    private final void m159325c() {
        ViewUtils.C57757c d = ViewUtils.m224155d(mo145593a());
        Intrinsics.checkExpressionValueIsNotNull(d, "ViewUtils.createPageLoadingDialog(getActivity())");
        this.f102116c = d;
        if (d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
        }
        d.mo196036a(new DialogInterface$OnCancelListenerC40195b(this));
        ViewUtils.C57757c cVar = this.f102116c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
        }
        cVar.mo196039b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onModeChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionView$a */
    public static final class C40194a implements InviteParentNonDirectionShareCardView.AbstractC40192a {

        /* renamed from: a */
        final /* synthetic */ InviteParentNonDirectionView f102122a;

        C40194a(InviteParentNonDirectionView inviteParentNonDirectionView) {
            this.f102122a = inviteParentNonDirectionView;
        }

        @Override // com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionShareCardView.AbstractC40192a
        /* renamed from: a */
        public final void mo145842a(String str) {
            this.f102122a.mo145843a(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionView$b */
    public static final class DialogInterface$OnCancelListenerC40195b implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ InviteParentNonDirectionView f102123a;

        DialogInterface$OnCancelListenerC40195b(InviteParentNonDirectionView inviteParentNonDirectionView) {
            this.f102123a = inviteParentNonDirectionView;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f102123a.mo145593a().finish();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewUtils.C57757c m159324a(InviteParentNonDirectionView inviteParentNonDirectionView) {
        ViewUtils.C57757c cVar = inviteParentNonDirectionView.f102116c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo145843a(String str) {
        if (Intrinsics.areEqual("qr_code", str)) {
            this.f102119f.setText(R.string.Lark_Education_ShareTeamQRCodeTip);
        } else {
            this.f102119f.setText(R.string.Lark_Education_ShareTeamLinkTip);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionView$c */
    public static final class View$OnClickListenerC40196c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteParentNonDirectionView f102124a;

        View$OnClickListenerC40196c(InviteParentNonDirectionView inviteParentNonDirectionView) {
            this.f102124a = inviteParentNonDirectionView;
        }

        public final void onClick(View view) {
            InviteParentNonDirectionView.m159324a(this.f102124a).mo196039b();
            this.f102124a.f102114a.setVisibility(8);
            this.f102124a.f102115b.mo145640b();
            this.f102124a.mo145845b().mo145850d();
        }
    }

    /* renamed from: b */
    public void mo145846b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        ViewUtils.C57757c cVar = this.f102116c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
        }
        cVar.mo196042e();
        this.f102115b.mo145639a(str);
        this.f102114a.setVisibility(8);
        if (this.f102120g == null) {
            View$OnClickListenerC40196c cVar2 = new View$OnClickListenerC40196c(this);
            this.f102120g = cVar2;
            this.f102115b.setOnClickListener(cVar2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteParentNonDirectionView(InviteParentNonDirectionFragment aVar) {
        super(aVar);
        int i;
        Intrinsics.checkParameterIsNotNull(aVar, "fragment");
        CommonTitleBar commonTitleBar = (CommonTitleBar) aVar.mo145903a(R.id.ipnTitleBar);
        Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "it.ipnTitleBar");
        this.f102117d = commonTitleBar;
        ScrollView scrollView = (ScrollView) aVar.mo145903a(R.id.ipnContentSv);
        Intrinsics.checkExpressionValueIsNotNull(scrollView, "it.ipnContentSv");
        this.f102114a = scrollView;
        InviteParentNonDirectionShareCardView inviteParentNonDirectionShareCardView = (InviteParentNonDirectionShareCardView) aVar.mo145903a(R.id.ipnShareCardView);
        Intrinsics.checkExpressionValueIsNotNull(inviteParentNonDirectionShareCardView, "it.ipnShareCardView");
        this.f102118e = inviteParentNonDirectionShareCardView;
        InvErrorView invErrorView = (InvErrorView) aVar.mo145903a(R.id.ipnErrorView);
        Intrinsics.checkExpressionValueIsNotNull(invErrorView, "it.ipnErrorView");
        this.f102115b = invErrorView;
        TextView textView = (TextView) aVar.mo145903a(R.id.ipnBottomTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "it.ipnBottomTipTv");
        this.f102119f = textView;
        m159325c();
        m159326d();
        if (DesktopUtil.m144307b()) {
            i = R.drawable.inv_title_bar_right_icon_desktop_selector;
        } else {
            i = R.drawable.ud_icon_maybe_outlined;
        }
        commonTitleBar.setRightImage(UIHelper.getDrawable(i));
        commonTitleBar.getRightView(0).setOnClickListener(View$OnClickListenerC401931.f102121a);
        scrollView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo145844a(String str, EduInvitation aVar) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(aVar, "invitation");
        ViewUtils.C57757c cVar = this.f102116c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
        }
        cVar.mo196042e();
        this.f102115b.mo145640b();
        this.f102114a.setVisibility(0);
        this.f102118e.mo145833a(str, aVar);
        this.f102118e.setEduCardOptions(mo145845b().mo145851e());
        this.f102118e.setOnModeChangedListener(new C40194a(this));
        mo145843a(str);
    }
}
