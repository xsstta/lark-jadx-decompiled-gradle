package com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.lark.pb.contact.v1.BizScenario;
import com.bytedance.lark.pb.contact.v1.GetDynamicMediaRequest;
import com.bytedance.lark.pb.contact.v1.ImageOptions;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.mvp.AbstractC40090b;
import com.ss.android.lark.inv.export.util.C40102d;
import com.ss.android.lark.inv.export.util.C40111j;
import com.ss.android.lark.inv.export.util.C40146y;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.invitation.v2.feat.member.common.InviteConstantKeyImageDataParser;
import com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity;
import com.ss.android.lark.invitation.v2.p2052c.C40157a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0002J.\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\u0012\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0019\u001a\u00020\nH\u0016J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001dH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/qrCode/InviteMemberNonDirectionQrCodePresenter;", "Lcom/ss/android/lark/inv/export/mvp/InvBasePresenter;", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/qrCode/InviteMemberNonDirectionQrCodeView;", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/qrCode/InviteMemberNonDirectionQrCodeMvp$Presenter;", "()V", "TAG", "", "mInfo", "Lcom/ss/android/lark/invitation/v2/feat/member/bean/MemberInvitationInfo;", "getShareCard", "", "consumer", "Lcom/ss/android/lark/utils/ApiUtils$Consumer;", "Landroid/graphics/Bitmap;", "loadQrCode", "content", "width", "", "height", "successConsumer", "onBindView", "onClickRefresh", "onClickSaveQrCode", "onClickShareQr", "bitmap", "onClickShareQrCode", "saveQr", "updateRefreshAnim", "isStart", "", "updateView", "info", "isRefreshAction", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.b */
public final class InviteMemberNonDirectionQrCodePresenter extends AbstractC40090b<InviteMemberNonDirectionQrCodeView> {

    /* renamed from: a */
    public final String f102680a = "InvitationModule";

    /* renamed from: b */
    public MemberInvitationInfo f102681b;

    @Override // com.ss.android.lark.inv.export.mvp.AbstractC40090b
    /* renamed from: a */
    public void mo145598a() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.b$b */
    public static final class RunnableC40417b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ApiUtils.AbstractC57748a f102685a;

        RunnableC40417b(ApiUtils.AbstractC57748a aVar) {
            this.f102685a = aVar;
        }

        public final void run() {
            this.f102685a.consume(null);
        }
    }

    /* renamed from: f */
    public void mo146408f() {
        mo146402a(new C40422e(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.b$f */
    public static final class RunnableC40423f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Bitmap f102696a;

        /* renamed from: b */
        final /* synthetic */ String f102697b;

        RunnableC40423f(Bitmap bitmap, String str) {
            this.f102696a = bitmap;
            this.f102697b = str;
        }

        public final void run() {
            final File a = C40102d.m159003a(this.f102696a, this.f102697b);
            ViewUtils.m224148a(new Runnable() {
                /* class com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.InviteMemberNonDirectionQrCodePresenter.RunnableC40423f.RunnableC404241 */

                public final void run() {
                    if (a == null) {
                        ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
                        return;
                    }
                    ViewUtils.m224145a((int) R.string.Lark_Legacy_QrCodeSaveAlbum);
                    C26311p.m95268a(aj.m224263a(), a.getAbsolutePath());
                }
            });
        }
    }

    /* renamed from: d */
    public void mo146406d() {
        InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity = (InviteMemberNonDirectionalActivity) ((InviteMemberNonDirectionQrCodeView) mo145600b()).mo145593a();
        if (inviteMemberNonDirectionalActivity != null) {
            inviteMemberNonDirectionalActivity.mo146348b();
        }
    }

    /* renamed from: e */
    public void mo146407e() {
        C57805b.m224333d(((InviteMemberNonDirectionQrCodeView) mo145600b()).mo145593a(), new C40420d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.b$c */
    static final class RunnableC40418c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionQrCodePresenter f102686a;

        /* renamed from: b */
        final /* synthetic */ String f102687b;

        /* renamed from: c */
        final /* synthetic */ int f102688c;

        /* renamed from: d */
        final /* synthetic */ int f102689d;

        /* renamed from: e */
        final /* synthetic */ ApiUtils.AbstractC57748a f102690e;

        RunnableC40418c(InviteMemberNonDirectionQrCodePresenter bVar, String str, int i, int i2, ApiUtils.AbstractC57748a aVar) {
            this.f102686a = bVar;
            this.f102687b = str;
            this.f102688c = i;
            this.f102689d = i2;
            this.f102690e = aVar;
        }

        public final void run() {
            final Bitmap encodeQRCode = C40147z.m159160a().encodeQRCode(this.f102687b, this.f102688c, this.f102689d, 0);
            if (encodeQRCode == null || encodeQRCode.isRecycled()) {
                InvApmUtils.m158969a("ug_invite_member_nondirectional_load_qrcode", false, (Map) null, 4, (Object) null);
                Log.m165383e(this.f102686a.f102680a, "encodeQRCode failed.");
                return;
            }
            InvApmUtils.m158969a("ug_invite_member_nondirectional_load_qrcode", true, (Map) null, 4, (Object) null);
            ViewUtils.m224148a(new Runnable(this) {
                /* class com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.InviteMemberNonDirectionQrCodePresenter.RunnableC40418c.RunnableC404191 */

                /* renamed from: a */
                final /* synthetic */ RunnableC40418c f102691a;

                {
                    this.f102691a = r1;
                }

                public final void run() {
                    this.f102691a.f102690e.consume(encodeQRCode);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/nonDirectional/qrCode/InviteMemberNonDirectionQrCodePresenter$getShareCard$1", "Lcom/ss/android/lark/utils/TaskUtils$Task;", "Landroid/graphics/Bitmap;", "onDo", "onDone", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.b$a */
    public static final class C40415a extends C57768af.AbstractRunnableC57773c<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionQrCodePresenter f102682a;

        /* renamed from: b */
        final /* synthetic */ ApiUtils.AbstractC57748a f102683b;

        /* renamed from: a */
        public Bitmap mo130916b() {
            C57768af.C57772b bVar = new C57768af.C57772b();
            GetDynamicMediaRequest.C16236a aVar = new GetDynamicMediaRequest.C16236a();
            aVar.mo58176a(BizScenario.TeamCard);
            aVar.mo58178a(new ImageOptions.C16314a().mo58348a(ImageOptions.ResolutionType.HighDefinition).build());
            ImageView c = ((InviteMemberNonDirectionQrCodeView) this.f102682a.mo145600b()).mo146386c();
            String displayTeamCode = InviteMemberNonDirectionQrCodePresenter.m160084a(this.f102682a).getDisplayTeamCode();
            Intrinsics.checkExpressionValueIsNotNull(displayTeamCode, "mInfo.displayTeamCode");
            C40111j.m159029a(aVar, new InviteConstantKeyImageDataParser(c, displayTeamCode), new C40416a(bVar));
            return (Bitmap) bVar.mo196071a();
        }

        /* renamed from: a */
        public void mo130914a(Bitmap bitmap) {
            this.f102683b.consume(bitmap);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.b$a$a */
        public static final class C40416a<T> implements ApiUtils.AbstractC57748a<SdkSender.C53233d<Bitmap>> {

            /* renamed from: a */
            final /* synthetic */ C57768af.C57772b f102684a;

            C40416a(C57768af.C57772b bVar) {
                this.f102684a = bVar;
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
                this.f102684a.mo196072a(dVar.f131572a);
            }
        }

        C40415a(InviteMemberNonDirectionQrCodePresenter bVar, ApiUtils.AbstractC57748a aVar) {
            this.f102682a = bVar;
            this.f102683b = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/graphics/Bitmap;", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.b$e */
    static final class C40422e<T> implements ApiUtils.AbstractC57748a<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionQrCodePresenter f102695a;

        C40422e(InviteMemberNonDirectionQrCodePresenter bVar) {
            this.f102695a = bVar;
        }

        /* renamed from: a */
        public final void consume(Bitmap bitmap) {
            this.f102695a.mo146400a(bitmap);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MemberInvitationInfo m160084a(InviteMemberNonDirectionQrCodePresenter bVar) {
        MemberInvitationInfo memberInvitationInfo = bVar.f102681b;
        if (memberInvitationInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        return memberInvitationInfo;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.b$d */
    public static final class C40420d implements C57805b.AbstractC57809a {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionQrCodePresenter f102693a;

        C40420d(InviteMemberNonDirectionQrCodePresenter bVar) {
            this.f102693a = bVar;
        }

        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
        public final void permissionGranted(boolean z) {
            if (z) {
                InvHitPoint.m160399o(((InviteMemberNonDirectionQrCodeView) this.f102693a.mo145600b()).mo146384b());
                this.f102693a.mo146402a(new ApiUtils.AbstractC57748a<Bitmap>(this) {
                    /* class com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.InviteMemberNonDirectionQrCodePresenter.C40420d.C404211 */

                    /* renamed from: a */
                    final /* synthetic */ C40420d f102694a;

                    {
                        this.f102694a = r1;
                    }

                    /* renamed from: a */
                    public final void consume(Bitmap bitmap) {
                        this.f102694a.f102693a.mo146405b(bitmap);
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
    public final void mo146400a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_ShareFailed);
        } else {
            C40157a.m159185b(((InviteMemberNonDirectionQrCodeView) mo145600b()).mo145593a(), bitmap, new InviteMemberNonDirectionQrCodePresenter$onClickShareQr$1(this));
        }
    }

    /* renamed from: b */
    public final void mo146405b(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
        } else {
            C40146y.m159159a(new RunnableC40423f(bitmap, C57881t.m224651w(aj.m224263a())));
        }
    }

    /* renamed from: a */
    public final void mo146402a(ApiUtils.AbstractC57748a<Bitmap> aVar) {
        InvApmUtils.m158958a("ug_invite_member_nondirectional_get_save_or_share_qrcode");
        InvApmUtils.m158958a("ug_invite_member_nondir_get_save_or_share_qr");
        C57768af.m224220b(((InviteMemberNonDirectionQrCodeView) mo145600b()).mo145593a(), new C40415a(this, aVar).mo196073a(5000, new RunnableC40417b(aVar)));
    }

    /* renamed from: a */
    public void mo146404a(boolean z) {
        ((InviteMemberNonDirectionQrCodeView) mo145600b()).mo146383a(z);
    }

    /* renamed from: a */
    public void mo146401a(MemberInvitationInfo memberInvitationInfo, boolean z) {
        Intrinsics.checkParameterIsNotNull(memberInvitationInfo, "info");
        this.f102681b = memberInvitationInfo;
        if (z) {
            ((InviteMemberNonDirectionQrCodeView) mo145600b()).mo146385b(memberInvitationInfo);
        } else {
            ((InviteMemberNonDirectionQrCodeView) mo145600b()).mo146382a(memberInvitationInfo);
        }
    }

    /* renamed from: a */
    public void mo146403a(String str, int i, int i2, ApiUtils.AbstractC57748a<Bitmap> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(aVar, "successConsumer");
        C40146y.m159159a(new RunnableC40418c(this, str, i, i2, aVar));
    }
}
