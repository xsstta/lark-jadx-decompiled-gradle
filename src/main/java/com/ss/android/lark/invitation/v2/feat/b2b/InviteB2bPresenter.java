package com.ss.android.lark.invitation.v2.feat.b2b;

import android.graphics.Bitmap;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.mvp.AbstractC40090b;
import com.ss.android.lark.inv.export.util.C40102d;
import com.ss.android.lark.inv.export.util.C40115k;
import com.ss.android.lark.inv.export.util.C40146y;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.p2052c.C40157a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.collaboration.PullCollaborationInviteQrCodeResponse;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0002J.\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\u0012\u0010\u001d\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u001f\u001a\u00020\rH\u0016J\u0012\u0010 \u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0002R\u000e\u0010\u0007\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bPresenter;", "Lcom/ss/android/lark/inv/export/mvp/InvBasePresenter;", "Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bView;", "Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bMvp$Presenter;", "from", "", "(Ljava/lang/String;)V", "TAG", "getFrom", "()Ljava/lang/String;", "mResp", "Lcom/ss/android/lark/pb/collaboration/PullCollaborationInviteQrCodeResponse;", "fetchData", "", "reset", "", "getShareCard", "consumer", "Lcom/ss/android/lark/utils/ApiUtils$Consumer;", "Landroid/graphics/Bitmap;", "loadQrCode", "content", "width", "", "height", "successConsumer", "onBindView", "onClickErrorRetry", "onClickSaveQrCode", "onClickShareQr", "bitmap", "onClickShareQrCode", "saveQr", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.b */
public final class InviteB2bPresenter extends AbstractC40090b<InviteB2bView> {

    /* renamed from: a */
    public final String f102043a = "InvitationModule";

    /* renamed from: b */
    public PullCollaborationInviteQrCodeResponse f102044b;

    /* renamed from: c */
    private final String f102045c;

    /* renamed from: g */
    public final String mo145766g() {
        return this.f102045c;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.b$d */
    public static final class RunnableC40171d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ApiUtils.AbstractC57748a f102051a;

        RunnableC40171d(ApiUtils.AbstractC57748a aVar) {
            this.f102051a = aVar;
        }

        public final void run() {
            this.f102051a.consume(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/invitation/v2/feat/b2b/InviteB2bPresenter$getShareCard$1", "Lcom/ss/android/lark/utils/TaskUtils$Task;", "Landroid/graphics/Bitmap;", "onDo", "onDone", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.b$c */
    public static final class C40170c extends C57768af.AbstractRunnableC57773c<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ InviteB2bPresenter f102049a;

        /* renamed from: b */
        final /* synthetic */ ApiUtils.AbstractC57748a f102050b;

        /* renamed from: a */
        public Bitmap mo130916b() {
            return C40115k.m159053a(InviteB2bPresenter.m159223a(this.f102049a).mview_qr, "CollaborationCard");
        }

        /* renamed from: a */
        public void mo130914a(Bitmap bitmap) {
            this.f102050b.consume(bitmap);
        }

        C40170c(InviteB2bPresenter bVar, ApiUtils.AbstractC57748a aVar) {
            this.f102049a = bVar;
            this.f102050b = aVar;
        }
    }

    /* renamed from: e */
    public void mo145764e() {
        InvHitPoint.m160410u();
        mo145759a(new C40176g(this));
    }

    /* renamed from: f */
    public void mo145765f() {
        ((InviteB2bView) mo145600b()).mo145741h();
        mo145761a(false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.b$h */
    public static final class RunnableC40177h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Bitmap f102062a;

        /* renamed from: b */
        final /* synthetic */ String f102063b;

        RunnableC40177h(Bitmap bitmap, String str) {
            this.f102062a = bitmap;
            this.f102063b = str;
        }

        public final void run() {
            final File a = C40102d.m159003a(this.f102062a, this.f102063b);
            ViewUtils.m224148a(new Runnable() {
                /* class com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bPresenter.RunnableC40177h.RunnableC401781 */

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
    public void mo145763d() {
        C57805b.m224333d(((InviteB2bView) mo145600b()).mo145593a(), new C40174f(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.b$e */
    static final class RunnableC40172e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InviteB2bPresenter f102052a;

        /* renamed from: b */
        final /* synthetic */ String f102053b;

        /* renamed from: c */
        final /* synthetic */ int f102054c;

        /* renamed from: d */
        final /* synthetic */ int f102055d;

        /* renamed from: e */
        final /* synthetic */ ApiUtils.AbstractC57748a f102056e;

        RunnableC40172e(InviteB2bPresenter bVar, String str, int i, int i2, ApiUtils.AbstractC57748a aVar) {
            this.f102052a = bVar;
            this.f102053b = str;
            this.f102054c = i;
            this.f102055d = i2;
            this.f102056e = aVar;
        }

        public final void run() {
            final Bitmap encodeQRCode = C40147z.m159160a().encodeQRCode(this.f102053b, this.f102054c, this.f102055d, 0);
            if (encodeQRCode == null || encodeQRCode.isRecycled()) {
                Log.m165383e(this.f102052a.f102043a, "encodeQRCode failed.");
            } else {
                ViewUtils.m224148a(new Runnable(this) {
                    /* class com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bPresenter.RunnableC40172e.RunnableC401731 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC40172e f102057a;

                    {
                        this.f102057a = r1;
                    }

                    public final void run() {
                        this.f102057a.f102056e.consume(encodeQRCode);
                    }
                });
            }
        }
    }

    @Override // com.ss.android.lark.inv.export.mvp.AbstractC40090b
    /* renamed from: a */
    public void mo145598a() {
        ((InviteB2bView) mo145600b()).mo145741h();
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
        if (a.isLarkEnv()) {
            ((InviteB2bView) mo145600b()).mo145739f();
        } else {
            ((InviteB2bView) mo145600b()).mo145740g();
        }
        mo145761a(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/invitation/v2/feat/b2b/InviteB2bPresenter$fetchData$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.b$b */
    public static final class C40169b implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ InviteB2bPresenter f102048a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40169b(InviteB2bPresenter bVar) {
            this.f102048a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            String g = this.f102048a.mo145766g();
            InvitationServiceApi b = C40147z.m159162b();
            Intrinsics.checkExpressionValueIsNotNull(b, "InvUtils.getService()");
            InvHitPoint.m160359a(g, b.isAdmin());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/graphics/Bitmap;", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.b$g */
    static final class C40176g<T> implements ApiUtils.AbstractC57748a<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ InviteB2bPresenter f102061a;

        C40176g(InviteB2bPresenter bVar) {
            this.f102061a = bVar;
        }

        /* renamed from: a */
        public final void consume(Bitmap bitmap) {
            this.f102061a.mo145758a(bitmap);
        }
    }

    public InviteB2bPresenter(String str) {
        Intrinsics.checkParameterIsNotNull(str, "from");
        this.f102045c = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ PullCollaborationInviteQrCodeResponse m159223a(InviteB2bPresenter bVar) {
        PullCollaborationInviteQrCodeResponse pullCollaborationInviteQrCodeResponse = bVar.f102044b;
        if (pullCollaborationInviteQrCodeResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResp");
        }
        return pullCollaborationInviteQrCodeResponse;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.b$f */
    public static final class C40174f implements C57805b.AbstractC57809a {

        /* renamed from: a */
        final /* synthetic */ InviteB2bPresenter f102059a;

        C40174f(InviteB2bPresenter bVar) {
            this.f102059a = bVar;
        }

        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
        public final void permissionGranted(boolean z) {
            if (z) {
                this.f102059a.mo145759a(new ApiUtils.AbstractC57748a<Bitmap>(this) {
                    /* class com.ss.android.lark.invitation.v2.feat.b2b.InviteB2bPresenter.C40174f.C401751 */

                    /* renamed from: a */
                    final /* synthetic */ C40174f f102060a;

                    {
                        this.f102060a = r1;
                    }

                    /* renamed from: a */
                    public final void consume(Bitmap bitmap) {
                        this.f102060a.f102059a.mo145762b(bitmap);
                    }
                });
            } else {
                ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/invitation/v2/feat/b2b/InviteB2bPresenter$fetchData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/collaboration/PullCollaborationInviteQrCodeResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.b$a */
    public static final class C40168a implements IGetDataCallback<PullCollaborationInviteQrCodeResponse> {

        /* renamed from: a */
        final /* synthetic */ InviteB2bPresenter f102046a;

        /* renamed from: b */
        final /* synthetic */ boolean f102047b;

        /* renamed from: a */
        public void onSuccess(PullCollaborationInviteQrCodeResponse pullCollaborationInviteQrCodeResponse) {
            Intrinsics.checkParameterIsNotNull(pullCollaborationInviteQrCodeResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f102046a.f102044b = pullCollaborationInviteQrCodeResponse;
            ((InviteB2bView) this.f102046a.mo145600b()).mo145742i();
            ((InviteB2bView) this.f102046a.mo145600b()).mo145734a(this.f102047b, pullCollaborationInviteQrCodeResponse);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((InviteB2bView) this.f102046a.mo145600b()).mo145742i();
            Log.m165382e(errorResult.toString());
            ViewUtils.m224150a(errorResult.getDisplayMsg());
            InviteB2bView inviteB2bView = (InviteB2bView) this.f102046a.mo145600b();
            String displayMsg = errorResult.getDisplayMsg();
            if (displayMsg == null) {
                displayMsg = UIHelper.getString(R.string.Lark_Legacy_RecallMessageErr);
                Intrinsics.checkExpressionValueIsNotNull(displayMsg, "UIHelper.getString(R.str…_Legacy_RecallMessageErr)");
            }
            inviteB2bView.mo145732a(displayMsg);
        }

        C40168a(InviteB2bPresenter bVar, boolean z) {
            this.f102046a = bVar;
            this.f102047b = z;
        }
    }

    /* renamed from: b */
    public final void mo145762b(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
        } else {
            C40146y.m159159a(new RunnableC40177h(bitmap, C57881t.m224651w(aj.m224263a())));
        }
    }

    /* renamed from: a */
    public final void mo145758a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_ShareFailed);
        } else {
            C40157a.m159188c(((InviteB2bView) mo145600b()).mo145593a(), bitmap, new InviteB2bPresenter$onClickShareQr$1());
        }
    }

    /* renamed from: a */
    public final void mo145759a(ApiUtils.AbstractC57748a<Bitmap> aVar) {
        C57768af.m224220b(((InviteB2bView) mo145600b()).mo145593a(), new C40170c(this, aVar).mo196073a(5000, new RunnableC40171d(aVar)));
    }

    /* renamed from: a */
    public void mo145761a(boolean z) {
        C40147z.m159162b().getCollaborationInviteQrcode(z, new UIGetDataCallback(new C40168a(this, z)));
        C40147z.m159162b().isAdmin(new C40169b(this));
    }

    /* renamed from: a */
    public void mo145760a(String str, int i, int i2, ApiUtils.AbstractC57748a<Bitmap> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(aVar, "successConsumer");
        C40146y.m159159a(new RunnableC40172e(this, str, i, i2, aVar));
    }
}
