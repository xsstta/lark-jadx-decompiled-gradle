package com.ss.android.lark.invitation.v2.feat.b2b;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.mvp.AbstractC40090b;
import com.ss.android.lark.inv.export.mvp.InvBaseView;
import com.ss.android.lark.inv.export.util.C40099a;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.inv.export.util.C40125p;
import com.ss.android.lark.inv.export.util.C40133s;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvErrorView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.collaboration.PullCollaborationInviteQrCodeResponse;
import com.ss.android.lark.pb.entities.Image;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010O\u001a\u00020PH\u0016J\u0012\u0010Q\u001a\u0004\u0018\u00010\u00072\u0006\u0010R\u001a\u00020SH\u0002J\b\u0010T\u001a\u00020UH\u0002J\b\u0010V\u001a\u00020PH\u0016J\u0010\u0010W\u001a\u00020P2\u0006\u0010X\u001a\u00020\u0007H\u0016J\b\u0010Y\u001a\u00020PH\u0016J\b\u0010Z\u001a\u00020PH\u0016J\b\u0010[\u001a\u00020PH\u0016J\u0018\u0010\\\u001a\u00020P2\u0006\u0010]\u001a\u00020F2\u0006\u0010^\u001a\u00020_H\u0016J\u0010\u0010`\u001a\u00020P2\u0006\u0010a\u001a\u00020FH\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001a\u00106\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R\u001a\u00109\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010'\"\u0004\b;\u0010)R\u001a\u0010<\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010'\"\u0004\b>\u0010)R\u001a\u0010?\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R\u001a\u0010B\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010!\"\u0004\bD\u0010#R\u000e\u0010E\u001a\u00020FX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX.¢\u0006\u0002\n\u0000R\u001c\u0010I\u001a\u0004\u0018\u00010JX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006b"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bView;", "Lcom/ss/android/lark/inv/export/mvp/InvBaseView;", "Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bMvp$View;", "fragment", "Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bFragment;", "(Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bFragment;)V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "ibqBottomLl", "Landroid/widget/LinearLayout;", "getIbqBottomLl", "()Landroid/widget/LinearLayout;", "setIbqBottomLl", "(Landroid/widget/LinearLayout;)V", "ibqContentSv", "Landroid/widget/ScrollView;", "getIbqContentSv", "()Landroid/widget/ScrollView;", "setIbqContentSv", "(Landroid/widget/ScrollView;)V", "ibqErrorView", "Lcom/ss/android/lark/inv/export/util/InvErrorView;", "getIbqErrorView", "()Lcom/ss/android/lark/inv/export/util/InvErrorView;", "setIbqErrorView", "(Lcom/ss/android/lark/inv/export/util/InvErrorView;)V", "ibqExpiredTimeTv", "Landroid/widget/TextView;", "getIbqExpiredTimeTv", "()Landroid/widget/TextView;", "setIbqExpiredTimeTv", "(Landroid/widget/TextView;)V", "ibqQrIv", "Landroid/widget/ImageView;", "getIbqQrIv", "()Landroid/widget/ImageView;", "setIbqQrIv", "(Landroid/widget/ImageView;)V", "ibqRefreshLl", "getIbqRefreshLl", "setIbqRefreshLl", "ibqRefreshView", "Landroid/view/View;", "getIbqRefreshView", "()Landroid/view/View;", "setIbqRefreshView", "(Landroid/view/View;)V", "ibqSaveOrTv", "getIbqSaveOrTv", "setIbqSaveOrTv", "ibqShareTv", "getIbqShareTv", "setIbqShareTv", "ibqTeamLogo2Iv", "getIbqTeamLogo2Iv", "setIbqTeamLogo2Iv", "ibqTeamLogoIv", "getIbqTeamLogoIv", "setIbqTeamLogoIv", "ibqTeamNameTv", "getIbqTeamNameTv", "setIbqTeamNameTv", "imndqTeamCodeTitleTv", "getImndqTeamCodeTitleTv", "setImndqTeamCodeTitleTv", "isRefreshing", "", "refreshAnimator", "Landroid/animation/ValueAnimator;", UpdateKey.STATUS, "Lcom/larksuite/component/ui/loading/LKUIStatus;", "getStatus", "()Lcom/larksuite/component/ui/loading/LKUIStatus;", "setStatus", "(Lcom/larksuite/component/ui/loading/LKUIStatus;)V", "dismissLoading", "", "getExpiredTime", "sec", "", "getPresenter", "Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bPresenter;", "onDestroy", "showError", "msg", "showFeishuInvitationTip", "showLarkInvitationTip", "showLoading", "showSuccessView", "reset", "response", "Lcom/ss/android/lark/pb/collaboration/PullCollaborationInviteQrCodeResponse;", "updateRefreshAnim", "isPlay", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteB2bView extends InvBaseView<InviteB2bView> {

    /* renamed from: a */
    public ValueAnimator f102011a;

    /* renamed from: b */
    public boolean f102012b;

    /* renamed from: c */
    private String f102013c;

    /* renamed from: d */
    private InvErrorView f102014d;

    /* renamed from: e */
    private ScrollView f102015e;

    /* renamed from: f */
    private ImageView f102016f;

    /* renamed from: g */
    private TextView f102017g;

    /* renamed from: h */
    private ImageView f102018h;

    /* renamed from: i */
    private ImageView f102019i;

    /* renamed from: j */
    private TextView f102020j;

    /* renamed from: k */
    private LinearLayout f102021k;

    /* renamed from: l */
    private View f102022l;

    /* renamed from: m */
    private LinearLayout f102023m;

    /* renamed from: n */
    private TextView f102024n;

    /* renamed from: o */
    private TextView f102025o;

    /* renamed from: p */
    private LKUIStatus f102026p;

    /* renamed from: q */
    private TextView f102027q;

    /* renamed from: b */
    public final InvErrorView mo145735b() {
        return this.f102014d;
    }

    /* renamed from: c */
    public final ImageView mo145736c() {
        return this.f102018h;
    }

    /* renamed from: d */
    public final ImageView mo145737d() {
        return this.f102019i;
    }

    /* renamed from: e */
    public final LinearLayout mo145738e() {
        return this.f102021k;
    }

    /* renamed from: i */
    public void mo145742i() {
        C40133s.m159126b(this.f102026p);
    }

    /* renamed from: f */
    public void mo145739f() {
        this.f102027q.setText(R.string.Lark_B2B_SuperScanCodeLark);
    }

    /* renamed from: g */
    public void mo145740g() {
        this.f102027q.setText(R.string.Lark_B2B_SuperScanCode);
    }

    /* renamed from: j */
    public final InviteB2bPresenter mo145743j() {
        AbstractC40090b a = mo145595a(InviteB2bPresenter.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "getPresenter(InviteB2bPresenter::class.java)");
        return (InviteB2bPresenter) a;
    }

    @Override // com.ss.android.lark.inv.export.mvp.InvBaseView
    public void onDestroy() {
        super.onDestroy();
        ValueAnimator valueAnimator = this.f102011a;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("refreshAnimator");
        }
        valueAnimator.cancel();
    }

    /* renamed from: h */
    public void mo145741h() {
        if (this.f102026p == null) {
            this.f102026p = C40133s.m159123a(mo145593a());
        }
        C40133s.m159125a(this.f102026p);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bView$c */
    public static final class RunnableC40161c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InviteB2bView f102031a;

        /* renamed from: b */
        final /* synthetic */ PullCollaborationInviteQrCodeResponse f102032b;

        RunnableC40161c(InviteB2bView inviteB2bView, PullCollaborationInviteQrCodeResponse pullCollaborationInviteQrCodeResponse) {
            this.f102031a = inviteB2bView;
            this.f102032b = pullCollaborationInviteQrCodeResponse;
        }

        public final void run() {
            InviteB2bPresenter j = this.f102031a.mo145743j();
            String str = this.f102032b.murl;
            Intrinsics.checkExpressionValueIsNotNull(str, "response.murl");
            j.mo145760a(str, this.f102031a.mo145736c().getWidth(), this.f102031a.mo145736c().getHeight(), new ApiUtils.AbstractC57748a<Bitmap>(this) {
                /* class com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bView.RunnableC40161c.C401621 */

                /* renamed from: a */
                final /* synthetic */ RunnableC40161c f102033a;

                {
                    this.f102033a = r1;
                }

                /* renamed from: a */
                public final void consume(Bitmap bitmap) {
                    this.f102033a.f102031a.mo145736c().setImageBitmap(bitmap);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "consume", "com/ss/android/lark/invitation/v2/feat/b2b/InviteB2bView$showSuccessView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bView$b */
    public static final class C40160b<T> implements ApiUtils.AbstractC57748a<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ InviteB2bView f102030a;

        C40160b(InviteB2bView inviteB2bView) {
            this.f102030a = inviteB2bView;
        }

        /* renamed from: a */
        public final void consume(Bitmap bitmap) {
            if (bitmap != null) {
                this.f102030a.mo145737d().setImageBitmap(bitmap);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bView$e */
    public static final class View$OnClickListenerC40166e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteB2bView f102037a;

        View$OnClickListenerC40166e(InviteB2bView inviteB2bView) {
            this.f102037a = inviteB2bView;
        }

        public final void onClick(View view) {
            this.f102037a.mo145743j().mo145763d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bView$f */
    public static final class View$OnClickListenerC40167f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteB2bView f102038a;

        View$OnClickListenerC40167f(InviteB2bView inviteB2bView) {
            this.f102038a = inviteB2bView;
        }

        public final void onClick(View view) {
            this.f102038a.mo145743j().mo145764e();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ValueAnimator m159203a(InviteB2bView inviteB2bView) {
        ValueAnimator valueAnimator = inviteB2bView.f102011a;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("refreshAnimator");
        }
        return valueAnimator;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bView$a */
    public static final class View$OnClickListenerC40159a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteB2bView f102029a;

        View$OnClickListenerC40159a(InviteB2bView inviteB2bView) {
            this.f102029a = inviteB2bView;
        }

        public final void onClick(View view) {
            this.f102029a.mo145741h();
            this.f102029a.mo145735b().mo145640b();
            this.f102029a.mo145743j().mo145765f();
        }
    }

    /* renamed from: a */
    public final void mo145733a(boolean z) {
        if (z) {
            this.f102012b = true;
            ViewUtils.m224146a((View) this.f102021k, false);
            ValueAnimator valueAnimator = this.f102011a;
            if (valueAnimator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("refreshAnimator");
            }
            valueAnimator.start();
            return;
        }
        this.f102012b = false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bView$d */
    public static final class View$OnClickListenerC40163d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteB2bView f102034a;

        View$OnClickListenerC40163d(InviteB2bView inviteB2bView) {
            this.f102034a = inviteB2bView;
        }

        public final void onClick(View view) {
            new C25639g(this.f102034a.mo145593a()).mo89248g(R.string.Lark_B2B_ConfirmReset).mo89254m(R.string.Lark_B2B_InvitationExpired).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Invitation_AddMembersRefreshDialogCancel, DialogInterface$OnClickListenerC401641.f102035a).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Invitation_AddMembersRefreshDialogConfirm, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bView.View$OnClickListenerC40163d.DialogInterface$OnClickListenerC401652 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC40163d f102036a;

                {
                    this.f102036a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
                    dialogInterface.dismiss();
                    this.f102036a.f102034a.mo145733a(true);
                    this.f102036a.f102034a.mo145743j().mo145761a(true);
                }
            }).mo89239c();
        }
    }

    /* renamed from: a */
    public void mo145732a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        this.f102014d.mo145639a(str);
        this.f102015e.setVisibility(8);
        this.f102023m.setVisibility(8);
        this.f102014d.setOnClickListener(new View$OnClickListenerC40159a(this));
    }

    /* renamed from: a */
    private final String m159204a(long j) {
        String str;
        if (j == -1) {
            str = UIHelper.getString(R.string.Lark_Invitation_AddMembersPermanentLinkQRCode);
            Intrinsics.checkExpressionValueIsNotNull(str, "UIHelper.getString(R.str…mbersPermanentLinkQRCode)");
        } else {
            str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(j * ((long) 1000)));
            Intrinsics.checkExpressionValueIsNotNull(str, "format.format(Date(sec * 1000))");
        }
        Log.m165389i("UtilsMVP", "expiredTime: " + str);
        return str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteB2bView(InviteB2bFragment aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "fragment");
        this.f102013c = aVar.mo145755a();
        InvErrorView invErrorView = (InvErrorView) aVar.mo145754a(R.id.ibqErrorView);
        Intrinsics.checkExpressionValueIsNotNull(invErrorView, "it.ibqErrorView");
        this.f102014d = invErrorView;
        ScrollView scrollView = (ScrollView) aVar.mo145754a(R.id.ibqContentSv);
        Intrinsics.checkExpressionValueIsNotNull(scrollView, "it.ibqContentSv");
        this.f102015e = scrollView;
        LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) aVar.mo145754a(R.id.ibqTeamLogoIv);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView, "it.ibqTeamLogoIv");
        this.f102016f = lKUIRoundedImageView;
        TextView textView = (TextView) aVar.mo145754a(R.id.ibqTeamNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "it.ibqTeamNameTv");
        this.f102017g = textView;
        ImageView imageView = (ImageView) aVar.mo145754a(R.id.ibqQrIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "it.ibqQrIv");
        this.f102018h = imageView;
        LKUIRoundedImageView lKUIRoundedImageView2 = (LKUIRoundedImageView) aVar.mo145754a(R.id.ibqTeamLogo2Iv);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "it.ibqTeamLogo2Iv");
        this.f102019i = lKUIRoundedImageView2;
        TextView textView2 = (TextView) aVar.mo145754a(R.id.ibqExpiredTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "it.ibqExpiredTimeTv");
        this.f102020j = textView2;
        LinearLayout linearLayout = (LinearLayout) aVar.mo145754a(R.id.ibqRefreshLl);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "it.ibqRefreshLl");
        this.f102021k = linearLayout;
        ImageView imageView2 = (ImageView) aVar.mo145754a(R.id.ibqRefreshView);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "it.ibqRefreshView");
        this.f102022l = imageView2;
        LinearLayout linearLayout2 = (LinearLayout) aVar.mo145754a(R.id.ibqBottomLl);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "it.ibqBottomLl");
        this.f102023m = linearLayout2;
        TextView textView3 = (TextView) aVar.mo145754a(R.id.ibqSaveOrTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "it.ibqSaveOrTv");
        this.f102024n = textView3;
        TextView textView4 = (TextView) aVar.mo145754a(R.id.ibqShareTv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "it.ibqShareTv");
        this.f102025o = textView4;
        TextView textView5 = (TextView) aVar.mo145754a(R.id.imndqTeamCodeTitleTv);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "it.imndqTeamCodeTitleTv");
        this.f102027q = textView5;
        ValueAnimator a = C40099a.m158956a(this.f102022l, new Runnable(this) {
            /* class com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bView.RunnableC401581 */

            /* renamed from: a */
            final /* synthetic */ InviteB2bView f102028a;

            {
                this.f102028a = r1;
            }

            public final void run() {
                if (!this.f102028a.f102012b) {
                    InviteB2bView.m159203a(this.f102028a).cancel();
                    ViewUtils.m224146a((View) this.f102028a.mo145738e(), true);
                }
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(a, "InvAnimUtils.getRotation…)\n            }\n        }");
        this.f102011a = a;
    }

    /* renamed from: a */
    public void mo145734a(boolean z, PullCollaborationInviteQrCodeResponse pullCollaborationInviteQrCodeResponse) {
        Intrinsics.checkParameterIsNotNull(pullCollaborationInviteQrCodeResponse, "response");
        mo145733a(false);
        this.f102015e.setVisibility(0);
        this.f102023m.setVisibility(0);
        Image image = pullCollaborationInviteQrCodeResponse.mtenant_avatar;
        if (image != null) {
            String str = image.mkey;
            IInvitationModuleDependency a = C40147z.m159160a();
            Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
            IInvitationModuleDependency.AbstractC40087c loginDependency = a.getLoginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "InvUtils.getDep().loginDependency");
            C40125p.m159095a(str, loginDependency.mo145582a(), this.f102016f, new C40160b(this));
        }
        this.f102017g.setText(pullCollaborationInviteQrCodeResponse.mtenant_name);
        this.f102018h.post(new RunnableC40161c(this, pullCollaborationInviteQrCodeResponse));
        TextView textView = this.f102020j;
        StringBuilder sb = new StringBuilder();
        sb.append(UIHelper.getString(R.string.Lark_B2B_ExpiresBy));
        sb.append(' ');
        Long l = pullCollaborationInviteQrCodeResponse.mexpired_time;
        Intrinsics.checkExpressionValueIsNotNull(l, "response.mexpired_time");
        sb.append(m159204a(l.longValue()));
        textView.setText(sb.toString());
        this.f102021k.setOnClickListener(new View$OnClickListenerC40163d(this));
        C40103e.m159005a(this.f102024n, new View$OnClickListenerC40166e(this));
        C40103e.m159005a(this.f102025o, new View$OnClickListenerC40167f(this));
    }
}
