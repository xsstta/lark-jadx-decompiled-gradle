package com.ss.android.lark.invitation.v2.feat.member.nonDirectional.link;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.mvp.AbstractC40090b;
import com.ss.android.lark.inv.export.mvp.InvBaseView;
import com.ss.android.lark.inv.export.util.C40099a;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020*H\u0016J\b\u00102\u001a\u000200H\u0016J\u0010\u00103\u001a\u0002002\u0006\u00101\u001a\u00020*H\u0016J\u0010\u00104\u001a\u0002002\u0006\u00105\u001a\u00020(H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001a\u0010$\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u000e\u0010'\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X.¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkView;", "Lcom/ss/android/lark/inv/export/mvp/InvBaseView;", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkMvp$View;", "fragment", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkFragment;", "(Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkFragment;)V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "imndbExpiredTimeTv", "Landroid/widget/TextView;", "getImndbExpiredTimeTv", "()Landroid/widget/TextView;", "setImndbExpiredTimeTv", "(Landroid/widget/TextView;)V", "imndbRefreshLl", "Landroid/widget/LinearLayout;", "getImndbRefreshLl", "()Landroid/widget/LinearLayout;", "setImndbRefreshLl", "(Landroid/widget/LinearLayout;)V", "imndbRefreshView", "Landroid/view/View;", "getImndbRefreshView", "()Landroid/view/View;", "setImndbRefreshView", "(Landroid/view/View;)V", "imndbSaveOrCopyLinkTv", "getImndbSaveOrCopyLinkTv", "setImndbSaveOrCopyLinkTv", "imndbShareTv", "getImndbShareTv", "setImndbShareTv", "imndlContentTv", "getImndlContentTv", "setImndlContentTv", "isRefreshing", "", "mInfo", "Lcom/ss/android/lark/invitation/v2/feat/member/bean/MemberInvitationInfo;", "refreshAnimator", "Landroid/animation/ValueAnimator;", "getPresenter", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkPresenter;", "initView", "", "info", "onDestroy", "refreshView", "updateRefreshAnim", "isStart", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteMemberNonDirectionLinkView extends InvBaseView<InviteMemberNonDirectionLinkView> {

    /* renamed from: a */
    public ValueAnimator f102635a;

    /* renamed from: b */
    public boolean f102636b;

    /* renamed from: c */
    private String f102637c;

    /* renamed from: d */
    private TextView f102638d;

    /* renamed from: e */
    private TextView f102639e;

    /* renamed from: f */
    private LinearLayout f102640f;

    /* renamed from: g */
    private View f102641g;

    /* renamed from: h */
    private TextView f102642h;

    /* renamed from: i */
    private TextView f102643i;

    /* renamed from: j */
    private MemberInvitationInfo f102644j;

    /* renamed from: b */
    public final String mo146364b() {
        return this.f102637c;
    }

    /* renamed from: c */
    public final LinearLayout mo146366c() {
        return this.f102640f;
    }

    /* renamed from: d */
    public final InviteMemberNonDirectionLinkPresenter mo146367d() {
        AbstractC40090b a = mo145595a(InviteMemberNonDirectionLinkPresenter.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "getPresenter(InviteMembe…inkPresenter::class.java)");
        return (InviteMemberNonDirectionLinkPresenter) a;
    }

    @Override // com.ss.android.lark.inv.export.mvp.InvBaseView
    public void onDestroy() {
        super.onDestroy();
        ValueAnimator valueAnimator = this.f102635a;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("refreshAnimator");
        }
        valueAnimator.cancel();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.link.InviteMemberNonDirectionLinkView$a */
    public static final class View$OnClickListenerC40406a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionLinkView f102646a;

        View$OnClickListenerC40406a(InviteMemberNonDirectionLinkView inviteMemberNonDirectionLinkView) {
            this.f102646a = inviteMemberNonDirectionLinkView;
        }

        public final void onClick(View view) {
            this.f102646a.mo146367d().mo146379d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.link.InviteMemberNonDirectionLinkView$b */
    public static final class View$OnClickListenerC40407b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionLinkView f102647a;

        View$OnClickListenerC40407b(InviteMemberNonDirectionLinkView inviteMemberNonDirectionLinkView) {
            this.f102647a = inviteMemberNonDirectionLinkView;
        }

        public final void onClick(View view) {
            this.f102647a.mo146367d().mo146380e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.link.InviteMemberNonDirectionLinkView$c */
    public static final class View$OnClickListenerC40408c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionLinkView f102648a;

        View$OnClickListenerC40408c(InviteMemberNonDirectionLinkView inviteMemberNonDirectionLinkView) {
            this.f102648a = inviteMemberNonDirectionLinkView;
        }

        public final void onClick(View view) {
            this.f102648a.mo146367d().mo146381f();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ValueAnimator m160049a(InviteMemberNonDirectionLinkView inviteMemberNonDirectionLinkView) {
        ValueAnimator valueAnimator = inviteMemberNonDirectionLinkView.f102635a;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("refreshAnimator");
        }
        return valueAnimator;
    }

    /* renamed from: a */
    public void mo146363a(boolean z) {
        if (z) {
            this.f102636b = true;
            ViewUtils.m224146a((View) this.f102640f, false);
            ValueAnimator valueAnimator = this.f102635a;
            if (valueAnimator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("refreshAnimator");
            }
            valueAnimator.start();
            return;
        }
        this.f102636b = false;
    }

    /* renamed from: a */
    public void mo146362a(MemberInvitationInfo memberInvitationInfo) {
        Intrinsics.checkParameterIsNotNull(memberInvitationInfo, "info");
        mo146365b(memberInvitationInfo);
        TextView textView = this.f102639e;
        StringBuilder sb = new StringBuilder();
        sb.append(UIHelper.getString(R.string.Lark_Invitation_AddMembersExpiredTime));
        MemberInvitationInfo memberInvitationInfo2 = this.f102644j;
        if (memberInvitationInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        sb.append(memberInvitationInfo2.getExpiredTime());
        textView.setText(sb.toString());
        this.f102640f.setOnClickListener(new View$OnClickListenerC40406a(this));
        this.f102642h.setText(UIHelper.getString(R.string.Lark_Legacy_Copy));
        C40103e.m159005a(this.f102642h, new View$OnClickListenerC40407b(this));
        this.f102643i.setOnClickListener(new View$OnClickListenerC40408c(this));
    }

    /* renamed from: b */
    public void mo146365b(MemberInvitationInfo memberInvitationInfo) {
        Intrinsics.checkParameterIsNotNull(memberInvitationInfo, "info");
        this.f102644j = memberInvitationInfo;
        TextView textView = this.f102638d;
        if (memberInvitationInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        textView.setText(memberInvitationInfo.getLinkMsg());
        TextView textView2 = this.f102639e;
        StringBuilder sb = new StringBuilder();
        sb.append(UIHelper.getString(R.string.Lark_Invitation_AddMembersExpiredTime));
        MemberInvitationInfo memberInvitationInfo2 = this.f102644j;
        if (memberInvitationInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        sb.append(memberInvitationInfo2.getExpiredTime());
        textView2.setText(sb.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteMemberNonDirectionLinkView(InviteMemberNonDirectionLinkFragment aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "fragment");
        this.f102637c = aVar.mo146373a();
        EditText editText = (EditText) aVar.mo146372a(R.id.imndlContentTv);
        Intrinsics.checkExpressionValueIsNotNull(editText, "it.imndlContentTv");
        this.f102638d = editText;
        TextView textView = (TextView) aVar.mo146372a(R.id.imndbExpiredTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "it.imndbExpiredTimeTv");
        this.f102639e = textView;
        LinearLayout linearLayout = (LinearLayout) aVar.mo146372a(R.id.imndbRefreshLl);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "it.imndbRefreshLl");
        this.f102640f = linearLayout;
        ImageView imageView = (ImageView) aVar.mo146372a(R.id.imndbRefreshView);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "it.imndbRefreshView");
        this.f102641g = imageView;
        TextView textView2 = (TextView) aVar.mo146372a(R.id.imndbSaveOrCopyLinkTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "it.imndbSaveOrCopyLinkTv");
        this.f102642h = textView2;
        TextView textView3 = (TextView) aVar.mo146372a(R.id.imndbShareTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "it.imndbShareTv");
        this.f102643i = textView3;
        ValueAnimator a = C40099a.m158956a(this.f102641g, new Runnable(this) {
            /* class com.ss.android.lark.invitation.v2.feat.member.nonDirectional.link.InviteMemberNonDirectionLinkView.RunnableC404051 */

            /* renamed from: a */
            final /* synthetic */ InviteMemberNonDirectionLinkView f102645a;

            {
                this.f102645a = r1;
            }

            public final void run() {
                if (!this.f102645a.f102636b) {
                    InviteMemberNonDirectionLinkView.m160049a(this.f102645a).cancel();
                    ViewUtils.m224146a((View) this.f102645a.mo146366c(), true);
                }
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(a, "InvAnimUtils.getRotation…)\n            }\n        }");
        this.f102635a = a;
    }
}
