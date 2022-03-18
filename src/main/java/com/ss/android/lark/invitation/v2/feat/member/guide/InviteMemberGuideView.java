package com.ss.android.lark.invitation.v2.feat.member.guide;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.universe_design.button.ButtonDrawableParams;
import com.larksuite.component.universe_design.button.C25717e;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.mvp.AbstractC40090b;
import com.ss.android.lark.inv.export.mvp.InvBaseView;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.inv.export.util.C40133s;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.invitation.v2.feat.member.contact.InviteMemberContactActivity;
import com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideFragment;
import com.ss.android.lark.invitation.v2.feat.member.orientation.InviteMemberOrientationActivity;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.invitation.v2.statistic.InvHitPointNew;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001GB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u0002032\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u0002032\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010:\u001a\u0002032\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010;\u001a\u0002032\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010<\u001a\u0002032\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010=\u001a\u0002032\u0006\u00107\u001a\u000208H\u0016J\u0010\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020\u0007H\u0002J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u000203H\u0002J\u001a\u0010C\u001a\u0002032\u0006\u0010D\u001a\u00020\u00072\b\b\u0002\u0010E\u001a\u00020AH\u0002J\b\u0010F\u001a\u000203H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006H"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideView;", "Lcom/ss/android/lark/inv/export/mvp/InvBaseView;", "Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideMvp$View;", "fragment", "Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideFragment;", "(Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideFragment;)V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "imgButtonContainer", "Landroid/view/ViewGroup;", "imgContentRl", "Landroid/widget/RelativeLayout;", "imgExpiredTimeTv", "Landroid/widget/TextView;", "imgInvContentContainer", "imgInvitePhoneContactsBtn", "Lcom/larksuite/component/universe_design/button/UDButton;", "imgInviteTipTv", "imgLinkTv", "imgMoreAddTv", "imgQrIv", "Landroid/widget/ImageView;", "getImgQrIv", "()Landroid/widget/ImageView;", "setImgQrIv", "(Landroid/widget/ImageView;)V", "imgQrIvParent", "getImgQrIvParent", "()Landroid/view/ViewGroup;", "setImgQrIvParent", "(Landroid/view/ViewGroup;)V", "imgSaveTv", "imgSendEmailInvitationsBtn", "imgShareTeamLinkBtn", "imgShareTv", "imgSubTitletv", "imgTenantTv", "imgTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "imgTitletv", UpdateKey.STATUS, "Lcom/larksuite/component/ui/loading/LKUIStatus;", "getStatus", "()Lcom/larksuite/component/ui/loading/LKUIStatus;", "setStatus", "(Lcom/larksuite/component/ui/loading/LKUIStatus;)V", "dismissLoading", "", "getPresenter", "Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuidePresenter;", "initFeishuView", "info", "Lcom/ss/android/lark/invitation/v2/feat/member/bean/MemberInvitationInfo;", "initLarkView", "initLinkView", "initQRCodeView", "initTitleBar", "initView", "loadQrCode", "url", "needSkipInvPage", "", "openInvitePhoneContactsPage", "performCopyLink", "link", "showToast", "showLoading", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteMemberGuideView extends InvBaseView<InviteMemberGuideView> {

    /* renamed from: b */
    public static final int f102554b = UIHelper.dp2px(20.0f);

    /* renamed from: c */
    public static final Companion f102555c = new Companion(null);

    /* renamed from: a */
    public TextView f102556a;

    /* renamed from: d */
    private String f102557d;

    /* renamed from: e */
    private RelativeLayout f102558e;

    /* renamed from: f */
    private CommonTitleBar f102559f;

    /* renamed from: g */
    private TextView f102560g;

    /* renamed from: h */
    private TextView f102561h;

    /* renamed from: i */
    private ViewGroup f102562i;

    /* renamed from: j */
    private TextView f102563j;

    /* renamed from: k */
    private TextView f102564k;

    /* renamed from: l */
    private TextView f102565l;

    /* renamed from: m */
    private TextView f102566m;

    /* renamed from: n */
    private TextView f102567n;

    /* renamed from: o */
    private TextView f102568o;

    /* renamed from: p */
    private ImageView f102569p;

    /* renamed from: q */
    private ViewGroup f102570q;

    /* renamed from: r */
    private ViewGroup f102571r;

    /* renamed from: s */
    private UDButton f102572s;

    /* renamed from: t */
    private UDButton f102573t;

    /* renamed from: u */
    private UDButton f102574u;

    /* renamed from: v */
    private LKUIStatus f102575v;

    /* renamed from: w */
    private final InviteMemberGuideFragment f102576w;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\f\u0010\n\u001a\u00020\u000b*\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideView$Companion;", "", "()V", "iconSize", "", "generateLinkText", "", "kotlin.jvm.PlatformType", "info", "Lcom/ss/android/lark/invitation/v2/feat/member/bean/MemberInvitationInfo;", "correctBounds", "Landroid/graphics/drawable/Drawable;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Drawable mo146305a(Drawable drawable) {
            drawable.setBounds(0, 0, InviteMemberGuideView.f102554b, InviteMemberGuideView.f102554b);
            return drawable;
        }

        /* renamed from: a */
        public final String mo146306a(MemberInvitationInfo memberInvitationInfo) {
            return UIHelper.mustacheFormat((int) R.string.Lark_Guide_InviteLinkMsg, MapsKt.mapOf(TuplesKt.to("TEAM_NAME", memberInvitationInfo.teamName), TuplesKt.to("INVITATION_LINK", memberInvitationInfo.invUrl)));
        }
    }

    /* renamed from: b */
    public final ImageView mo146300b() {
        return this.f102569p;
    }

    /* renamed from: d */
    public void mo146302d() {
        C40133s.m159126b(this.f102575v);
    }

    /* renamed from: f */
    public final InviteMemberGuidePresenter mo146304f() {
        AbstractC40090b a = mo145595a(InviteMemberGuidePresenter.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "getPresenter(InviteMembe…idePresenter::class.java)");
        return (InviteMemberGuidePresenter) a;
    }

    /* renamed from: c */
    public void mo146301c() {
        if (this.f102575v == null) {
            this.f102575v = C40133s.m159123a(mo145593a());
        }
        C40133s.m159125a(this.f102575v);
    }

    /* renamed from: e */
    public final void mo146303e() {
        InviteMemberContactActivity.m159904a(mo145593a(), false, "upgrade", "", "add_by_phone", true);
        InvHitPointNew.f102936a.mo146630a(InvHitPointNew.OnboardingTeamAddMemberGuideClickParam.ADDRESS_BOOK);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$n */
    public static final class RunnableC40382n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuideView f102588a;

        /* renamed from: b */
        final /* synthetic */ String f102589b;

        RunnableC40382n(InviteMemberGuideView inviteMemberGuideView, String str) {
            this.f102588a = inviteMemberGuideView;
            this.f102589b = str;
        }

        public final void run() {
            this.f102588a.mo146304f().mo146322a(this.f102589b, this.f102588a.mo146300b().getWidth(), this.f102588a.mo146300b().getHeight(), new ApiUtils.AbstractC57748a<Bitmap>(this) {
                /* class com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView.RunnableC40382n.C403831 */

                /* renamed from: a */
                final /* synthetic */ RunnableC40382n f102590a;

                {
                    this.f102590a = r1;
                }

                /* renamed from: a */
                public final void consume(Bitmap bitmap) {
                    this.f102590a.f102588a.mo146300b().setImageBitmap(bitmap);
                }
            });
        }
    }

    /* renamed from: g */
    private final boolean m159993g() {
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
        if (a.isLarkEnv() || !this.f102576w.mo146293b() || (this.f102576w.mo146294c() != InviteMemberGuideFragment.Companion.InvitationMethod.UNKNOWN && this.f102576w.mo146294c() != InviteMemberGuideFragment.Companion.InvitationMethod.SKIP)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$b */
    public static final class View$OnClickListenerC40370b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuideView f102577a;

        View$OnClickListenerC40370b(InviteMemberGuideView inviteMemberGuideView) {
            this.f102577a = inviteMemberGuideView;
        }

        public final void onClick(View view) {
            this.f102577a.mo146303e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$c */
    public static final class C40371c extends Lambda implements Function1<ButtonDrawableParams, Unit> {
        public static final C40371c INSTANCE = new C40371c();

        C40371c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ButtonDrawableParams aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ButtonDrawableParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            aVar.mo90321a(Integer.valueOf((int) R.string.Lark_Guide_TeamCreate2MobileTeamLink));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$e */
    public static final class C40373e extends Lambda implements Function1<ButtonDrawableParams, Unit> {
        public static final C40373e INSTANCE = new C40373e();

        C40373e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ButtonDrawableParams aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ButtonDrawableParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            aVar.mo90321a(Integer.valueOf((int) R.string.Lark_Guide_TeamCreate2MobileEmail));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$g */
    public static final class C40375g extends Lambda implements Function1<ButtonDrawableParams, Unit> {
        public static final C40375g INSTANCE = new C40375g();

        C40375g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ButtonDrawableParams aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ButtonDrawableParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            aVar.mo90321a(Integer.valueOf((int) R.string.Lark_Guide_TeamCreate2MobilePhoneContacts));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$h */
    public static final class View$OnClickListenerC40376h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuideView f102581a;

        View$OnClickListenerC40376h(InviteMemberGuideView inviteMemberGuideView) {
            this.f102581a = inviteMemberGuideView;
        }

        public final void onClick(View view) {
            this.f102581a.mo146303e();
            InvHitPointNew.f102936a.mo146630a(InvHitPointNew.OnboardingTeamAddMemberGuideClickParam.IMPORT_CONTACTS);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$f */
    public static final class View$OnClickListenerC40374f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuideView f102580a;

        View$OnClickListenerC40374f(InviteMemberGuideView inviteMemberGuideView) {
            this.f102580a = inviteMemberGuideView;
        }

        public final void onClick(View view) {
            InviteMemberOrientationActivity.m160105a(this.f102580a.mo145593a(), "invite_member_guide", MapsKt.emptyMap());
            InvHitPointNew.f102936a.mo146630a(InvHitPointNew.OnboardingTeamAddMemberGuideClickParam.EMAIL_INVITATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$i */
    public static final class View$OnClickListenerC40377i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuideView f102582a;

        View$OnClickListenerC40377i(InviteMemberGuideView inviteMemberGuideView) {
            this.f102582a = inviteMemberGuideView;
        }

        public final void onClick(View view) {
            InviteMemberGuideView inviteMemberGuideView = this.f102582a;
            InviteMemberGuideView.m159985a(inviteMemberGuideView, inviteMemberGuideView.f102556a.getText().toString(), false, 2, null);
            InvHitPointNew.f102936a.mo146630a(InvHitPointNew.OnboardingTeamAddMemberGuideClickParam.LINK_COPY);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$k */
    public static final class View$OnClickListenerC40379k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuideView f102584a;

        View$OnClickListenerC40379k(InviteMemberGuideView inviteMemberGuideView) {
            this.f102584a = inviteMemberGuideView;
        }

        public final void onClick(View view) {
            this.f102584a.mo146304f().mo146324d();
            InvHitPoint.m160416x();
            InvHitPointNew.f102936a.mo146630a(InvHitPointNew.OnboardingTeamAddMemberGuideClickParam.SAVE);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$l */
    public static final class View$OnClickListenerC40380l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuideView f102585a;

        View$OnClickListenerC40380l(InviteMemberGuideView inviteMemberGuideView) {
            this.f102585a = inviteMemberGuideView;
        }

        public final void onClick(View view) {
            this.f102585a.mo146304f().mo146325e();
            InvHitPoint.m160418y();
            InvHitPointNew.f102936a.mo146630a(InvHitPointNew.OnboardingTeamAddMemberGuideClickParam.SHARE);
        }
    }

    /* renamed from: a */
    private final void m159986a(String str) {
        this.f102569p.post(new RunnableC40382n(this, str));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$d */
    public static final class View$OnClickListenerC40372d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuideView f102578a;

        /* renamed from: b */
        final /* synthetic */ MemberInvitationInfo f102579b;

        View$OnClickListenerC40372d(InviteMemberGuideView inviteMemberGuideView, MemberInvitationInfo memberInvitationInfo) {
            this.f102578a = inviteMemberGuideView;
            this.f102579b = memberInvitationInfo;
        }

        public final void onClick(View view) {
            InviteMemberGuideView inviteMemberGuideView = this.f102578a;
            String a = InviteMemberGuideView.f102555c.mo146306a(this.f102579b);
            Intrinsics.checkExpressionValueIsNotNull(a, "generateLinkText(info)");
            InviteMemberGuideView.m159985a(inviteMemberGuideView, a, false, 2, null);
            this.f102578a.mo146304f().mo146326f();
            InvHitPointNew.f102936a.mo146630a(InvHitPointNew.OnboardingTeamAddMemberGuideClickParam.LINK_COPY_LARK);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$j */
    public static final class View$OnClickListenerC40378j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuideView f102583a;

        View$OnClickListenerC40378j(InviteMemberGuideView inviteMemberGuideView) {
            this.f102583a = inviteMemberGuideView;
        }

        public final void onClick(View view) {
            InviteMemberGuideView inviteMemberGuideView = this.f102583a;
            InviteMemberGuideView.m159985a(inviteMemberGuideView, inviteMemberGuideView.f102556a.getText().toString(), false, 2, null);
            this.f102583a.mo146304f().mo146326f();
            InvHitPointNew.f102936a.mo146630a(InvHitPointNew.OnboardingTeamAddMemberGuideClickParam.LINK_SHARE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideView$initTitleBar$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideView$m */
    public static final class C40381m extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuideView f102586a;

        /* renamed from: b */
        final /* synthetic */ MemberInvitationInfo f102587b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            C40147z.m159160a().bizReport(CollectionsKt.listOf("new_user_create_team_strong_guide"));
            C40147z.m159160a().openLdrGuidePage(this.f102586a.mo145593a(), false, this.f102587b.teamName);
            InvHitPointNew.f102936a.mo146630a(InvHitPointNew.OnboardingTeamAddMemberGuideClickParam.NEXT);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40381m(InviteMemberGuideView inviteMemberGuideView, MemberInvitationInfo memberInvitationInfo, String str, int i) {
            super(str, i);
            this.f102586a = inviteMemberGuideView;
            this.f102587b = memberInvitationInfo;
        }
    }

    /* renamed from: b */
    private final void m159988b(MemberInvitationInfo memberInvitationInfo) {
        TextView leftText = this.f102559f.getLeftText();
        Intrinsics.checkExpressionValueIsNotNull(leftText, "imgTitleBar.leftText");
        leftText.setVisibility(8);
        this.f102559f.addAction(new C40381m(this, memberInvitationInfo, UIHelper.getString(R.string.Lark_Passport_AppealNextButton), R.color.text_link_hover));
    }

    /* renamed from: c */
    private final void m159989c(MemberInvitationInfo memberInvitationInfo) {
        this.f102562i.setVisibility(0);
        this.f102566m.setVisibility(0);
        this.f102571r.setVisibility(8);
        this.f102560g.setText(UIHelper.mustacheFormat((int) R.string.Lark_Guide_TeamInviteTitle, "APP_DISPLAY_NAME", UIHelper.getString(R.string.Lark_App_Name)));
        this.f102566m.setOnClickListener(new View$OnClickListenerC40370b(this));
        if (this.f102576w.mo146294c() == InviteMemberGuideFragment.Companion.InvitationMethod.LINK) {
            m159991e(memberInvitationInfo);
        } else {
            m159990d(memberInvitationInfo);
        }
    }

    /* renamed from: a */
    public void mo146299a(MemberInvitationInfo memberInvitationInfo) {
        Intrinsics.checkParameterIsNotNull(memberInvitationInfo, "info");
        if (m159993g()) {
            this.f102558e.setVisibility(8);
            C40147z.m159160a().openLdrGuidePage(mo145593a(), true, memberInvitationInfo.teamName);
            return;
        }
        this.f102558e.setVisibility(0);
        m159988b(memberInvitationInfo);
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
        if (a.isLarkEnv()) {
            m159992f(memberInvitationInfo);
        } else {
            m159989c(memberInvitationInfo);
        }
        InvHitPoint.m160414w();
        InvHitPointNew.f102936a.mo146634c();
    }

    /* renamed from: d */
    private final void m159990d(MemberInvitationInfo memberInvitationInfo) {
        this.f102561h.setText(UIHelper.getString(R.string.Lark_Guide_TeamInviteSubTitleMobile));
        this.f102567n.setVisibility(0);
        this.f102567n.setText(UIHelper.mustacheFormat((int) R.string.Lark_Guide_TeamCreateInviteQRFristHalf, "USER_NAME", memberInvitationInfo.userName));
        this.f102568o.setVisibility(0);
        this.f102568o.setText(memberInvitationInfo.teamName);
        this.f102570q.setVisibility(0);
        this.f102556a.setVisibility(8);
        this.f102569p.setClipToOutline(true);
        String str = memberInvitationInfo.qrUrl;
        Intrinsics.checkExpressionValueIsNotNull(str, "info.qrUrl");
        m159986a(str);
        this.f102563j.setText(UIHelper.mustacheFormat((int) R.string.Lark_Invitation_AddMembersShowQRCode_ExpirationTime, "EXPIRATION_TIME", memberInvitationInfo.getExpiredTime()));
        this.f102564k.setText(UIHelper.getString(R.string.Lark_Legacy_QrCodeSave));
        C40103e.m159005a(this.f102564k, new View$OnClickListenerC40379k(this));
        this.f102565l.setOnClickListener(new View$OnClickListenerC40380l(this));
    }

    /* renamed from: e */
    private final void m159991e(MemberInvitationInfo memberInvitationInfo) {
        this.f102561h.setText(UIHelper.getString(R.string.Lark_Guide_TeamInviteSubTitleMobileV2));
        this.f102567n.setVisibility(8);
        this.f102568o.setVisibility(8);
        this.f102570q.setVisibility(8);
        this.f102556a.setVisibility(0);
        this.f102556a.setText(f102555c.mo146306a(memberInvitationInfo));
        ViewGroup.LayoutParams layoutParams = this.f102563j.getLayoutParams();
        if (layoutParams != null) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(3, R.id.imgLinkTv);
            this.f102563j.setText(UIHelper.mustacheFormat((int) R.string.Lark_Invitation_AddMembersShowLink_ExpirationTime, "EXPIRATION_TIME", memberInvitationInfo.getExpiredTime()));
            this.f102564k.setText(UIHelper.getString(R.string.Lark_Invitation_AddMembersShowLink_CopyButton));
            C40103e.m159005a(this.f102564k, new View$OnClickListenerC40377i(this));
            this.f102565l.setOnClickListener(new View$OnClickListenerC40378j(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: f */
    private final void m159992f(MemberInvitationInfo memberInvitationInfo) {
        this.f102562i.setVisibility(8);
        this.f102566m.setVisibility(8);
        this.f102571r.setVisibility(0);
        this.f102560g.setText(UIHelper.getString(R.string.Lark_Guide_TeamCreate2Title));
        this.f102561h.setText(UIHelper.mustacheFormat((int) R.string.Lark_Guide_TeamCreate2SubTitle, "APP_DISPLAY_NAME", UIHelper.getString(R.string.Lark_App_Name)));
        UDButton uDButton = this.f102572s;
        Companion aVar = f102555c;
        FragmentActivity a = mo145593a();
        Intrinsics.checkExpressionValueIsNotNull(a, "getActivity()");
        FragmentActivity a2 = mo145593a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "getActivity()");
        C25717e.m92488a(uDButton, aVar.mo146305a(UDIconUtils.getIconDrawable(a, (int) R.drawable.ud_icon_link_copy_outlined, UDColorUtils.getColor(a2, R.color.static_white))), C40371c.INSTANCE);
        this.f102572s.setOnClickListener(new View$OnClickListenerC40372d(this, memberInvitationInfo));
        UDButton uDButton2 = this.f102573t;
        FragmentActivity a3 = mo145593a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "getActivity()");
        FragmentActivity a4 = mo145593a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "getActivity()");
        C25717e.m92488a(uDButton2, aVar.mo146305a(UDIconUtils.getIconDrawable(a3, (int) R.drawable.ud_icon_mail_outlined, UDColorUtils.getColor(a4, R.color.icon_n1))), C40373e.INSTANCE);
        this.f102573t.setOnClickListener(new View$OnClickListenerC40374f(this));
        UDButton uDButton3 = this.f102574u;
        FragmentActivity a5 = mo145593a();
        Intrinsics.checkExpressionValueIsNotNull(a5, "getActivity()");
        FragmentActivity a6 = mo145593a();
        Intrinsics.checkExpressionValueIsNotNull(a6, "getActivity()");
        C25717e.m92488a(uDButton3, aVar.mo146305a(UDIconUtils.getIconDrawable(a5, (int) R.drawable.ud_icon_contacts_outlined, UDColorUtils.getColor(a6, R.color.icon_n1))), C40375g.INSTANCE);
        this.f102574u.setOnClickListener(new View$OnClickListenerC40376h(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteMemberGuideView(InviteMemberGuideFragment inviteMemberGuideFragment) {
        super(inviteMemberGuideFragment);
        Intrinsics.checkParameterIsNotNull(inviteMemberGuideFragment, "fragment");
        this.f102576w = inviteMemberGuideFragment;
        this.f102557d = inviteMemberGuideFragment.mo146292a();
        RelativeLayout relativeLayout = (RelativeLayout) inviteMemberGuideFragment.mo146291a(R.id.imgContentRl);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "it.imgContentRl");
        this.f102558e = relativeLayout;
        CommonTitleBar commonTitleBar = (CommonTitleBar) inviteMemberGuideFragment.mo146291a(R.id.imgTitleBar);
        Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "it.imgTitleBar");
        this.f102559f = commonTitleBar;
        TextView textView = (TextView) inviteMemberGuideFragment.mo146291a(R.id.imgTitleTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "it.imgTitleTv");
        this.f102560g = textView;
        TextView textView2 = (TextView) inviteMemberGuideFragment.mo146291a(R.id.imgSubTitleTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "it.imgSubTitleTv");
        this.f102561h = textView2;
        FrameLayout frameLayout = (FrameLayout) inviteMemberGuideFragment.mo146291a(R.id.imgInvContentContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "it.imgInvContentContainer");
        this.f102562i = frameLayout;
        TextView textView3 = (TextView) inviteMemberGuideFragment.mo146291a(R.id.imgInviteTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "it.imgInviteTipTv");
        this.f102567n = textView3;
        TextView textView4 = (TextView) inviteMemberGuideFragment.mo146291a(R.id.imgTenantTv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "it.imgTenantTv");
        this.f102568o = textView4;
        TextView textView5 = (TextView) inviteMemberGuideFragment.mo146291a(R.id.imgLinkTv);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "it.imgLinkTv");
        this.f102556a = textView5;
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) inviteMemberGuideFragment.mo146291a(R.id.imgQrIv);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "it.imgQrIv");
        this.f102569p = lKUIRoundedImageView2;
        FrameLayout frameLayout2 = (FrameLayout) inviteMemberGuideFragment.mo146291a(R.id.imgQrIvParent);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "it.imgQrIvParent");
        this.f102570q = frameLayout2;
        TextView textView6 = (TextView) inviteMemberGuideFragment.mo146291a(R.id.imgExpiredTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "it.imgExpiredTimeTv");
        this.f102563j = textView6;
        UDButton uDButton = (UDButton) inviteMemberGuideFragment.mo146291a(R.id.imgSaveTv);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "it.imgSaveTv");
        this.f102564k = uDButton;
        UDButton uDButton2 = (UDButton) inviteMemberGuideFragment.mo146291a(R.id.imgShareTv);
        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "it.imgShareTv");
        this.f102565l = uDButton2;
        TextView textView7 = (TextView) inviteMemberGuideFragment.mo146291a(R.id.imgMoreAddTv);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "it.imgMoreAddTv");
        this.f102566m = textView7;
        LinearLayout linearLayout = (LinearLayout) inviteMemberGuideFragment.mo146291a(R.id.imgButtonContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "it.imgButtonContainer");
        this.f102571r = linearLayout;
        UDButton uDButton3 = (UDButton) inviteMemberGuideFragment.mo146291a(R.id.imgShareTeamLinkBtn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton3, "it.imgShareTeamLinkBtn");
        this.f102572s = uDButton3;
        UDButton uDButton4 = (UDButton) inviteMemberGuideFragment.mo146291a(R.id.imgSendEmailInvitationsBtn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton4, "it.imgSendEmailInvitationsBtn");
        this.f102573t = uDButton4;
        UDButton uDButton5 = (UDButton) inviteMemberGuideFragment.mo146291a(R.id.imgInvitePhoneContactsBtn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton5, "it.imgInvitePhoneContactsBtn");
        this.f102574u = uDButton5;
    }

    /* renamed from: a */
    private final void m159987a(String str, boolean z) {
        Object systemService = mo145593a().getSystemService("clipboard");
        if (systemService != null) {
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("", str));
            if (z) {
                FragmentActivity a = mo145593a();
                Intrinsics.checkExpressionValueIsNotNull(a, "getActivity()");
                UDToast.show(a, (int) R.string.Lark_Guide_TeamCreate2CopyTeamLinkToast);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
    }

    /* renamed from: a */
    static /* synthetic */ void m159985a(InviteMemberGuideView inviteMemberGuideView, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        inviteMemberGuideView.m159987a(str, z);
    }
}
