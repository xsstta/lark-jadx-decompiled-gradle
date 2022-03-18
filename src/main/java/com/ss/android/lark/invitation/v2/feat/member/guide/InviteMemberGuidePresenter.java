package com.ss.android.lark.invitation.v2.feat.member.guide;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.lark.pb.contact.v1.BizScenario;
import com.bytedance.lark.pb.contact.v1.GetDynamicMediaRequest;
import com.bytedance.lark.pb.contact.v1.ImageOptions;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.mvp.AbstractC40090b;
import com.ss.android.lark.inv.export.util.C40102d;
import com.ss.android.lark.inv.export.util.C40111j;
import com.ss.android.lark.inv.export.util.C40146y;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.invitation.v2.feat.member.common.C40338c;
import com.ss.android.lark.invitation.v2.feat.member.common.InviteConstantKeyImageDataParser;
import com.ss.android.lark.invitation.v2.p2052c.C40157a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0002J.\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0016J\u0012\u0010\u001c\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuidePresenter;", "Lcom/ss/android/lark/inv/export/mvp/InvBasePresenter;", "Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideView;", "Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideMvp$Presenter;", "()V", "isShareSuccess", "", "mInfo", "Lcom/ss/android/lark/invitation/v2/feat/member/bean/MemberInvitationInfo;", "getShareCard", "", "consumer", "Lcom/ss/android/lark/utils/ApiUtils$Consumer;", "Landroid/graphics/Bitmap;", "loadQrCode", "content", "", "width", "", "height", "successConsumer", "onBindView", "onClickSaveQrCode", "onClickShareLink", "onClickShareQrCode", "onClickShareQrImpl", "bitmap", "onResume", "saveQr", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.a */
public final class InviteMemberGuidePresenter extends AbstractC40090b<InviteMemberGuideView> {

    /* renamed from: c */
    public static final Companion f102591c = new Companion(null);

    /* renamed from: a */
    public MemberInvitationInfo f102592a;

    /* renamed from: b */
    public boolean f102593b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuidePresenter$Companion;", "", "()V", "TAG", "", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.a$c */
    public static final class RunnableC40386c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ApiUtils.AbstractC57748a f102597a;

        RunnableC40386c(ApiUtils.AbstractC57748a aVar) {
            this.f102597a = aVar;
        }

        public final void run() {
            this.f102597a.consume(null);
        }
    }

    /* renamed from: e */
    public void mo146325e() {
        mo146321a(new C40392g(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.a$j */
    public static final class RunnableC40395j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuidePresenter f102610a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f102611b;

        /* renamed from: c */
        final /* synthetic */ String f102612c;

        RunnableC40395j(InviteMemberGuidePresenter aVar, Bitmap bitmap, String str) {
            this.f102610a = aVar;
            this.f102611b = bitmap;
            this.f102612c = str;
        }

        public final void run() {
            final File a = C40102d.m159003a(this.f102611b, this.f102612c);
            ViewUtils.m224148a(new Runnable(this) {
                /* class com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuidePresenter.RunnableC40395j.RunnableC403961 */

                /* renamed from: a */
                final /* synthetic */ RunnableC40395j f102613a;

                {
                    this.f102613a = r1;
                }

                public final void run() {
                    if (a == null) {
                        ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
                        return;
                    }
                    FragmentActivity a = ((InviteMemberGuideView) this.f102613a.f102610a.mo145600b()).mo145593a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "view.getActivity()");
                    UDToast.show(a, (int) R.string.Lark_Legacy_QrCodeSaveAlbum, (int) R.drawable.ud_icon_yes_outlined);
                    C26311p.m95268a(aj.m224263a(), a.getAbsolutePath());
                }
            });
        }
    }

    @Override // com.ss.android.lark.inv.export.mvp.AbstractC40090b
    /* renamed from: a */
    public void mo145598a() {
        ((InviteMemberGuideView) mo145600b()).mo146301c();
        C40338c.m159892a().mo146228a(false, "", new C40389e(this));
    }

    /* renamed from: d */
    public void mo146324d() {
        C57805b.m224333d(((InviteMemberGuideView) mo145600b()).mo145593a(), new C40390f(this));
    }

    /* renamed from: f */
    public void mo146326f() {
        FragmentActivity a = ((InviteMemberGuideView) mo145600b()).mo145593a();
        MemberInvitationInfo memberInvitationInfo = this.f102592a;
        if (memberInvitationInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        C40157a.m159180a(a, memberInvitationInfo, (OnShareCallback) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.a$d */
    static final class RunnableC40387d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f102598a;

        /* renamed from: b */
        final /* synthetic */ int f102599b;

        /* renamed from: c */
        final /* synthetic */ int f102600c;

        /* renamed from: d */
        final /* synthetic */ ApiUtils.AbstractC57748a f102601d;

        RunnableC40387d(String str, int i, int i2, ApiUtils.AbstractC57748a aVar) {
            this.f102598a = str;
            this.f102599b = i;
            this.f102600c = i2;
            this.f102601d = aVar;
        }

        public final void run() {
            final Bitmap encodeQRCode = C40147z.m159160a().encodeQRCode(this.f102598a, this.f102599b, this.f102600c, 0);
            if (encodeQRCode == null || encodeQRCode.isRecycled()) {
                InvApmUtils.m158969a("ug_invite_member_nondirectional_load_qrcode", false, (Map) null, 4, (Object) null);
                Log.m165383e("InviteMemberGuidePresenter", "encodeQRCode failed.");
                return;
            }
            InvApmUtils.m158969a("ug_invite_member_nondirectional_load_qrcode", true, (Map) null, 4, (Object) null);
            ViewUtils.m224148a(new Runnable(this) {
                /* class com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuidePresenter.RunnableC40387d.RunnableC403881 */

                /* renamed from: a */
                final /* synthetic */ RunnableC40387d f102602a;

                {
                    this.f102602a = r1;
                }

                public final void run() {
                    this.f102602a.f102601d.consume(encodeQRCode);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuidePresenter$getShareCard$1", "Lcom/ss/android/lark/utils/TaskUtils$Task;", "Landroid/graphics/Bitmap;", "onDo", "onDone", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.a$b */
    public static final class C40384b extends C57768af.AbstractRunnableC57773c<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuidePresenter f102594a;

        /* renamed from: b */
        final /* synthetic */ ApiUtils.AbstractC57748a f102595b;

        /* renamed from: a */
        public Bitmap mo130916b() {
            C57768af.C57772b bVar = new C57768af.C57772b();
            GetDynamicMediaRequest.C16236a aVar = new GetDynamicMediaRequest.C16236a();
            aVar.mo58176a(BizScenario.TeamCard);
            aVar.mo58178a(new ImageOptions.C16314a().mo58348a(ImageOptions.ResolutionType.HighDefinition).build());
            ImageView b = ((InviteMemberGuideView) this.f102594a.mo145600b()).mo146300b();
            String displayTeamCode = InviteMemberGuidePresenter.m160003a(this.f102594a).getDisplayTeamCode();
            Intrinsics.checkExpressionValueIsNotNull(displayTeamCode, "mInfo.displayTeamCode");
            C40111j.m159029a(aVar, new InviteConstantKeyImageDataParser(b, displayTeamCode), new C40385a(bVar));
            return (Bitmap) bVar.mo196071a();
        }

        /* renamed from: a */
        public void mo130914a(Bitmap bitmap) {
            this.f102595b.consume(bitmap);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.a$b$a */
        public static final class C40385a<T> implements ApiUtils.AbstractC57748a<SdkSender.C53233d<Bitmap>> {

            /* renamed from: a */
            final /* synthetic */ C57768af.C57772b f102596a;

            C40385a(C57768af.C57772b bVar) {
                this.f102596a = bVar;
            }

            /* renamed from: a */
            public final void consume(SdkSender.C53233d<Bitmap> dVar) {
                if (dVar.f131573b != null) {
                    ErrorResult errorResult = dVar.f131573b;
                    Intrinsics.checkExpressionValueIsNotNull(errorResult, "data.error");
                    InvApmUtils.m158963a("ug_invite_member_nondirectional_get_save_or_share_qrcode", (Map) null, errorResult, 2, (Object) null);
                    ErrorResult errorResult2 = dVar.f131573b;
                    Intrinsics.checkExpressionValueIsNotNull(errorResult2, "data.error");
                    InvApmUtils.m158963a("ug_invite_member_nondir_get_save_or_share_qr", (Map) null, errorResult2, 2, (Object) null);
                } else {
                    InvApmUtils.m158969a("ug_invite_member_nondirectional_get_save_or_share_qrcode", true, (Map) null, 4, (Object) null);
                    InvApmUtils.m158969a("ug_invite_member_nondir_get_save_or_share_qr", true, (Map) null, 4, (Object) null);
                }
                this.f102596a.mo196072a(dVar.f131572a);
            }
        }

        C40384b(InviteMemberGuidePresenter aVar, ApiUtils.AbstractC57748a aVar2) {
            this.f102594a = aVar;
            this.f102595b = aVar2;
        }
    }

    /* renamed from: g */
    public void mo146327g() {
        if (this.f102593b) {
            new C25639g(((InviteMemberGuideView) mo145600b()).mo145593a()).mo89248g(R.string.Lark_Guide_TeamCreate2ShareSuccess).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Invitation_AddMembersInviteMore, DialogInterface$OnClickListenerC40393h.f102608a).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Passport_AppealNextButton, new DialogInterface$OnClickListenerC40394i(this)).mo89239c();
        }
        this.f102593b = false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuidePresenter$onBindView$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/invitation/v2/feat/member/bean/MemberInvitationInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "info", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.a$e */
    public static final class C40389e implements IGetDataCallback<MemberInvitationInfo> {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuidePresenter f102604a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40389e(InviteMemberGuidePresenter aVar) {
            this.f102604a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(MemberInvitationInfo memberInvitationInfo) {
            Intrinsics.checkParameterIsNotNull(memberInvitationInfo, "info");
            this.f102604a.f102592a = memberInvitationInfo;
            ((InviteMemberGuideView) this.f102604a.mo145600b()).mo146302d();
            ((InviteMemberGuideView) this.f102604a.mo145600b()).mo146299a(memberInvitationInfo);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((InviteMemberGuideView) this.f102604a.mo145600b()).mo145593a().finish();
            C40147z.m159160a().openLdrGuidePage(((InviteMemberGuideView) this.f102604a.mo145600b()).mo145593a(), true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/graphics/Bitmap;", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.a$g */
    static final class C40392g<T> implements ApiUtils.AbstractC57748a<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuidePresenter f102607a;

        C40392g(InviteMemberGuidePresenter aVar) {
            this.f102607a = aVar;
        }

        /* renamed from: a */
        public final void consume(Bitmap bitmap) {
            this.f102607a.mo146320a(bitmap);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MemberInvitationInfo m160003a(InviteMemberGuidePresenter aVar) {
        MemberInvitationInfo memberInvitationInfo = aVar.f102592a;
        if (memberInvitationInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        return memberInvitationInfo;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.a$f */
    public static final class C40390f implements C57805b.AbstractC57809a {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuidePresenter f102605a;

        C40390f(InviteMemberGuidePresenter aVar) {
            this.f102605a = aVar;
        }

        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
        public final void permissionGranted(boolean z) {
            if (z) {
                this.f102605a.mo146321a(new ApiUtils.AbstractC57748a<Bitmap>(this) {
                    /* class com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuidePresenter.C40390f.C403911 */

                    /* renamed from: a */
                    final /* synthetic */ C40390f f102606a;

                    {
                        this.f102606a = r1;
                    }

                    /* renamed from: a */
                    public final void consume(Bitmap bitmap) {
                        this.f102606a.f102605a.mo146323b(bitmap);
                    }
                });
            } else {
                ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
            }
            InvApmUtils.m158969a("ug_invite_member_nondirectional_save_qrcode_permisson", z, (Map) null, 4, (Object) null);
            InvApmUtils.m158969a("ug_invite_member_nondir_save_qr_permisson", z, (Map) null, 4, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo146320a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_ShareFailed);
        } else {
            C40157a.m159185b(((InviteMemberGuideView) mo145600b()).mo145593a(), bitmap, new InviteMemberGuidePresenter$onClickShareQrImpl$1(this));
        }
    }

    /* renamed from: b */
    public final void mo146323b(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
        } else {
            C40146y.m159159a(new RunnableC40395j(this, bitmap, C57881t.m224651w(aj.m224263a())));
        }
    }

    /* renamed from: a */
    public final void mo146321a(ApiUtils.AbstractC57748a<Bitmap> aVar) {
        InvApmUtils.m158958a("ug_invite_member_nondirectional_get_save_or_share_qrcode");
        InvApmUtils.m158958a("ug_invite_member_nondir_get_save_or_share_qr");
        C57768af.m224220b(((InviteMemberGuideView) mo145600b()).mo145593a(), new C40384b(this, aVar).mo196073a(5000, new RunnableC40386c(aVar)));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.a$h */
    public static final class DialogInterface$OnClickListenerC40393h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC40393h f102608a = new DialogInterface$OnClickListenerC40393h();

        DialogInterface$OnClickListenerC40393h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            InvHitPoint.m160420z();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.a$i */
    public static final class DialogInterface$OnClickListenerC40394i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberGuidePresenter f102609a;

        DialogInterface$OnClickListenerC40394i(InviteMemberGuidePresenter aVar) {
            this.f102609a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C40147z.m159160a().openLdrGuidePage(((InviteMemberGuideView) this.f102609a.mo145600b()).mo145593a(), false, InviteMemberGuidePresenter.m160003a(this.f102609a).teamName);
            InvHitPoint.m160320A();
        }
    }

    /* renamed from: a */
    public void mo146322a(String str, int i, int i2, ApiUtils.AbstractC57748a<Bitmap> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(aVar, "successConsumer");
        C40146y.m159159a(new RunnableC40387d(str, i, i2, aVar));
    }
}
