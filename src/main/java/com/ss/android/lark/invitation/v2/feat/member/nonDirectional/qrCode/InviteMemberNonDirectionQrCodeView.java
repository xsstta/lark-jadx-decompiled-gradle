package com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.mvp.AbstractC40090b;
import com.ss.android.lark.inv.export.mvp.InvBaseView;
import com.ss.android.lark.inv.export.ui.CircleImageView;
import com.ss.android.lark.inv.export.util.C40099a;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.inv.export.util.C40125p;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020<H\u0016J\u0010\u0010G\u001a\u00020D2\u0006\u0010H\u001a\u00020\u0007H\u0002J\b\u0010I\u001a\u00020DH\u0016J\u0010\u0010J\u001a\u00020D2\u0006\u0010F\u001a\u00020<H\u0016J\u0010\u0010K\u001a\u00020D2\u0006\u0010L\u001a\u00020:H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001a\u0010$\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\u001a\u00100\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011R\u001a\u00103\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\u001a\u00106\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u000f\"\u0004\b8\u0010\u0011R\u000e\u00109\u001a\u00020:X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X.¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X.¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/qrCode/InviteMemberNonDirectionQrCodeView;", "Lcom/ss/android/lark/inv/export/mvp/InvBaseView;", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/qrCode/InviteMemberNonDirectionQrCodeMvp$View;", "fragment", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/qrCode/InviteMemberNonDirectionQrCodeFragment;", "(Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/qrCode/InviteMemberNonDirectionQrCodeFragment;)V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "imndbExpiredTimeTv", "Landroid/widget/TextView;", "getImndbExpiredTimeTv", "()Landroid/widget/TextView;", "setImndbExpiredTimeTv", "(Landroid/widget/TextView;)V", "imndbRefreshLl", "Landroid/widget/LinearLayout;", "getImndbRefreshLl", "()Landroid/widget/LinearLayout;", "setImndbRefreshLl", "(Landroid/widget/LinearLayout;)V", "imndbRefreshView", "Landroid/view/View;", "getImndbRefreshView", "()Landroid/view/View;", "setImndbRefreshView", "(Landroid/view/View;)V", "imndbSaveOrCopyLinkTv", "getImndbSaveOrCopyLinkTv", "setImndbSaveOrCopyLinkTv", "imndbShareTv", "getImndbShareTv", "setImndbShareTv", "imndqAvatarIv", "Landroid/widget/ImageView;", "getImndqAvatarIv", "()Landroid/widget/ImageView;", "setImndqAvatarIv", "(Landroid/widget/ImageView;)V", "imndqNameTv", "getImndqNameTv", "setImndqNameTv", "imndqQrIv", "getImndqQrIv", "setImndqQrIv", "imndqTeamCodeTv", "getImndqTeamCodeTv", "setImndqTeamCodeTv", "imndqTeamIv", "getImndqTeamIv", "setImndqTeamIv", "imndqTenantTv", "getImndqTenantTv", "setImndqTenantTv", "isRefreshing", "", "mInfo", "Lcom/ss/android/lark/invitation/v2/feat/member/bean/MemberInvitationInfo;", "refreshAnimator", "Landroid/animation/ValueAnimator;", "getNameSpan", "Landroid/text/SpannableString;", "getPresenter", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/qrCode/InviteMemberNonDirectionQrCodePresenter;", "initBottomView", "", "initView", "info", "loadQrCode", "url", "onDestroy", "refreshView", "updateRefreshAnim", "isStart", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteMemberNonDirectionQrCodeView extends InvBaseView<InviteMemberNonDirectionQrCodeView> {

    /* renamed from: a */
    public ValueAnimator f102654a;

    /* renamed from: b */
    public boolean f102655b;

    /* renamed from: c */
    private String f102656c;

    /* renamed from: d */
    private ImageView f102657d;

    /* renamed from: e */
    private TextView f102658e;

    /* renamed from: f */
    private TextView f102659f;

    /* renamed from: g */
    private ImageView f102660g;

    /* renamed from: h */
    private ImageView f102661h;

    /* renamed from: i */
    private TextView f102662i;

    /* renamed from: j */
    private TextView f102663j;

    /* renamed from: k */
    private LinearLayout f102664k;

    /* renamed from: l */
    private View f102665l;

    /* renamed from: m */
    private TextView f102666m;

    /* renamed from: n */
    private TextView f102667n;

    /* renamed from: o */
    private MemberInvitationInfo f102668o;

    /* renamed from: b */
    public final String mo146384b() {
        return this.f102656c;
    }

    /* renamed from: c */
    public final ImageView mo146386c() {
        return this.f102660g;
    }

    /* renamed from: d */
    public final LinearLayout mo146387d() {
        return this.f102664k;
    }

    /* renamed from: e */
    public final InviteMemberNonDirectionQrCodePresenter mo146388e() {
        AbstractC40090b a = mo145595a(InviteMemberNonDirectionQrCodePresenter.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "getPresenter(InviteMembe…odePresenter::class.java)");
        return (InviteMemberNonDirectionQrCodePresenter) a;
    }

    @Override // com.ss.android.lark.inv.export.mvp.InvBaseView
    public void onDestroy() {
        super.onDestroy();
        ValueAnimator valueAnimator = this.f102654a;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("refreshAnimator");
        }
        valueAnimator.cancel();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.InviteMemberNonDirectionQrCodeView$d */
    public static final class RunnableC40413d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionQrCodeView f102673a;

        /* renamed from: b */
        final /* synthetic */ String f102674b;

        RunnableC40413d(InviteMemberNonDirectionQrCodeView inviteMemberNonDirectionQrCodeView, String str) {
            this.f102673a = inviteMemberNonDirectionQrCodeView;
            this.f102674b = str;
        }

        public final void run() {
            this.f102673a.mo146388e().mo146403a(this.f102674b, this.f102673a.mo146386c().getWidth(), this.f102673a.mo146386c().getHeight(), new ApiUtils.AbstractC57748a<Bitmap>(this) {
                /* class com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.InviteMemberNonDirectionQrCodeView.RunnableC40413d.C404141 */

                /* renamed from: a */
                final /* synthetic */ RunnableC40413d f102675a;

                {
                    this.f102675a = r1;
                }

                /* renamed from: a */
                public final void consume(Bitmap bitmap) {
                    this.f102675a.f102673a.mo146386c().setImageBitmap(bitmap);
                }
            });
        }
    }

    /* renamed from: f */
    private final SpannableString m160069f() {
        MemberInvitationInfo memberInvitationInfo = this.f102668o;
        if (memberInvitationInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        SpannableString spannableString = new SpannableString(UIHelper.mustacheFormat((int) R.string.Lark_Invitation_AddMemberQRCodePictureDesc, "USER_NAME", memberInvitationInfo.userName));
        StyleSpan styleSpan = new StyleSpan(1);
        MemberInvitationInfo memberInvitationInfo2 = this.f102668o;
        if (memberInvitationInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        spannableString.setSpan(styleSpan, 0, memberInvitationInfo2.userName.length(), 33);
        return spannableString;
    }

    /* renamed from: g */
    private final void m160070g() {
        TextView textView = this.f102663j;
        StringBuilder sb = new StringBuilder();
        sb.append(UIHelper.getString(R.string.Lark_Invitation_AddMembersExpiredTime));
        MemberInvitationInfo memberInvitationInfo = this.f102668o;
        if (memberInvitationInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        sb.append(memberInvitationInfo.getExpiredTime());
        textView.setText(sb.toString());
        this.f102664k.setOnClickListener(new View$OnClickListenerC40410a(this));
        this.f102666m.setText(UIHelper.getString(R.string.Lark_Legacy_QrCodeSave));
        C40103e.m159005a(this.f102666m, new View$OnClickListenerC40411b(this));
        this.f102667n.setOnClickListener(new View$OnClickListenerC40412c(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.InviteMemberNonDirectionQrCodeView$a */
    public static final class View$OnClickListenerC40410a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionQrCodeView f102670a;

        View$OnClickListenerC40410a(InviteMemberNonDirectionQrCodeView inviteMemberNonDirectionQrCodeView) {
            this.f102670a = inviteMemberNonDirectionQrCodeView;
        }

        public final void onClick(View view) {
            this.f102670a.mo146388e().mo146406d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.InviteMemberNonDirectionQrCodeView$b */
    public static final class View$OnClickListenerC40411b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionQrCodeView f102671a;

        View$OnClickListenerC40411b(InviteMemberNonDirectionQrCodeView inviteMemberNonDirectionQrCodeView) {
            this.f102671a = inviteMemberNonDirectionQrCodeView;
        }

        public final void onClick(View view) {
            this.f102671a.mo146388e().mo146407e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.InviteMemberNonDirectionQrCodeView$c */
    public static final class View$OnClickListenerC40412c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionQrCodeView f102672a;

        View$OnClickListenerC40412c(InviteMemberNonDirectionQrCodeView inviteMemberNonDirectionQrCodeView) {
            this.f102672a = inviteMemberNonDirectionQrCodeView;
        }

        public final void onClick(View view) {
            this.f102672a.mo146388e().mo146408f();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ValueAnimator m160067a(InviteMemberNonDirectionQrCodeView inviteMemberNonDirectionQrCodeView) {
        ValueAnimator valueAnimator = inviteMemberNonDirectionQrCodeView.f102654a;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("refreshAnimator");
        }
        return valueAnimator;
    }

    /* renamed from: a */
    private final void m160068a(String str) {
        this.f102660g.post(new RunnableC40413d(this, str));
    }

    /* renamed from: a */
    public void mo146383a(boolean z) {
        if (z) {
            this.f102655b = true;
            ViewUtils.m224146a((View) this.f102664k, false);
            ValueAnimator valueAnimator = this.f102654a;
            if (valueAnimator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("refreshAnimator");
            }
            valueAnimator.start();
            return;
        }
        this.f102655b = false;
    }

    /* renamed from: a */
    public void mo146382a(MemberInvitationInfo memberInvitationInfo) {
        Intrinsics.checkParameterIsNotNull(memberInvitationInfo, "info");
        mo146385b(memberInvitationInfo);
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
        IInvitationModuleDependency.AbstractC40087c loginDependency = a.getLoginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "InvUtils.getDep().loginDependency");
        String a2 = loginDependency.mo145582a();
        IInvitationModuleDependency a3 = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "InvUtils.getDep()");
        a3.isLarkEnv();
        MemberInvitationInfo memberInvitationInfo2 = this.f102668o;
        if (memberInvitationInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        C40125p.m159094a(memberInvitationInfo2.userAvatarKey, a2, this.f102657d);
        this.f102658e.setText(m160069f());
        TextView textView = this.f102659f;
        MemberInvitationInfo memberInvitationInfo3 = this.f102668o;
        if (memberInvitationInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        textView.setText(memberInvitationInfo3.teamName);
        IInvitationModuleDependency a4 = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "InvUtils.getDep()");
        IInvitationModuleDependency.AbstractC40087c loginDependency2 = a4.getLoginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency2, "InvUtils.getDep().loginDependency");
        C40125p.m159092a(loginDependency2.mo145591g(), this.f102661h);
        m160070g();
    }

    /* renamed from: b */
    public void mo146385b(MemberInvitationInfo memberInvitationInfo) {
        Intrinsics.checkParameterIsNotNull(memberInvitationInfo, "info");
        this.f102668o = memberInvitationInfo;
        if (memberInvitationInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        String str = memberInvitationInfo.qrUrl;
        Intrinsics.checkExpressionValueIsNotNull(str, "mInfo.qrUrl");
        m160068a(str);
        TextView textView = this.f102662i;
        MemberInvitationInfo memberInvitationInfo2 = this.f102668o;
        if (memberInvitationInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        textView.setText(memberInvitationInfo2.getDisplayTeamCode());
        TextView textView2 = this.f102663j;
        StringBuilder sb = new StringBuilder();
        sb.append(UIHelper.getString(R.string.Lark_Invitation_AddMembersExpiredTime));
        MemberInvitationInfo memberInvitationInfo3 = this.f102668o;
        if (memberInvitationInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        sb.append(memberInvitationInfo3.getExpiredTime());
        textView2.setText(sb.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteMemberNonDirectionQrCodeView(InviteMemberNonDirectionQrCodeFragment aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "fragment");
        this.f102656c = aVar.mo146396a();
        CircleImageView circleImageView = (CircleImageView) aVar.mo146395a(R.id.imndqAvatarIv);
        Intrinsics.checkExpressionValueIsNotNull(circleImageView, "it.imndqAvatarIv");
        this.f102657d = circleImageView;
        TextView textView = (TextView) aVar.mo146395a(R.id.imndqNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "it.imndqNameTv");
        this.f102658e = textView;
        TextView textView2 = (TextView) aVar.mo146395a(R.id.imndqTenantTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "it.imndqTenantTv");
        this.f102659f = textView2;
        ImageView imageView = (ImageView) aVar.mo146395a(R.id.imndqQrIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "it.imndqQrIv");
        this.f102660g = imageView;
        LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) aVar.mo146395a(R.id.imndqTeamIv);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView, "it.imndqTeamIv");
        this.f102661h = lKUIRoundedImageView;
        TextView textView3 = (TextView) aVar.mo146395a(R.id.imndqTeamCodeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "it.imndqTeamCodeTv");
        this.f102662i = textView3;
        TextView textView4 = (TextView) aVar.mo146395a(R.id.imndbExpiredTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "it.imndbExpiredTimeTv");
        this.f102663j = textView4;
        LinearLayout linearLayout = (LinearLayout) aVar.mo146395a(R.id.imndbRefreshLl);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "it.imndbRefreshLl");
        this.f102664k = linearLayout;
        ImageView imageView2 = (ImageView) aVar.mo146395a(R.id.imndbRefreshView);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "it.imndbRefreshView");
        this.f102665l = imageView2;
        TextView textView5 = (TextView) aVar.mo146395a(R.id.imndbSaveOrCopyLinkTv);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "it.imndbSaveOrCopyLinkTv");
        this.f102666m = textView5;
        TextView textView6 = (TextView) aVar.mo146395a(R.id.imndbShareTv);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "it.imndbShareTv");
        this.f102667n = textView6;
        ValueAnimator a = C40099a.m158956a(this.f102665l, new Runnable(this) {
            /* class com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.InviteMemberNonDirectionQrCodeView.RunnableC404091 */

            /* renamed from: a */
            final /* synthetic */ InviteMemberNonDirectionQrCodeView f102669a;

            {
                this.f102669a = r1;
            }

            public final void run() {
                if (!this.f102669a.f102655b) {
                    InviteMemberNonDirectionQrCodeView.m160067a(this.f102669a).cancel();
                    ViewUtils.m224146a((View) this.f102669a.mo146387d(), true);
                }
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(a, "InvAnimUtils.getRotation…)\n            }\n        }");
        this.f102654a = a;
    }
}
