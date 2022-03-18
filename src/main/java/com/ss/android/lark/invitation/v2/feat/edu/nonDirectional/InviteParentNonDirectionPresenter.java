package com.ss.android.lark.invitation.v2.feat.edu.nonDirectional;

import com.bytedance.lark.pb.contact.v1.EduCardOptions;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlRequest;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlResponse;
import com.bytedance.lark.pb.contact.v1.InvitationSource;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.mvp.AbstractC40090b;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.edu.bean.EduInvitation;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001 B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0002R\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006!"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/edu/nonDirectional/InviteParentNonDirectionPresenter;", "Lcom/ss/android/lark/inv/export/mvp/InvBasePresenter;", "Lcom/ss/android/lark/invitation/v2/feat/edu/nonDirectional/InviteParentNonDirectionView;", "Lcom/ss/android/lark/invitation/v2/feat/edu/nonDirectional/InviteParentNonDirectionMvp$Presenter;", "from", "", ShareHitPoint.f121869d, "departments", "chatId", ShareHitPoint.f121868c, "Lcom/bytedance/lark/pb/contact/v1/InvitationSource;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/lark/pb/contact/v1/InvitationSource;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getDepartments", "setDepartments", "getFrom", "setFrom", "getSource", "()Lcom/bytedance/lark/pb/contact/v1/InvitationSource;", "setSource", "(Lcom/bytedance/lark/pb/contact/v1/InvitationSource;)V", "getType", "setType", "getEduCardOptions", "Lcom/bytedance/lark/pb/contact/v1/EduCardOptions;", "onBindView", "", "onClickErrorRetry", "requestInvitation", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.a */
public final class InviteParentNonDirectionPresenter extends AbstractC40090b<InviteParentNonDirectionView> {

    /* renamed from: a */
    public static final Companion f102125a = new Companion(null);

    /* renamed from: b */
    private String f102126b;

    /* renamed from: c */
    private String f102127c;

    /* renamed from: d */
    private String f102128d;

    /* renamed from: e */
    private String f102129e;

    /* renamed from: f */
    private InvitationSource f102130f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/edu/nonDirectional/InviteParentNonDirectionPresenter$Companion;", "", "()V", "TAG", "", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.inv.export.mvp.AbstractC40090b
    /* renamed from: a */
    public void mo145598a() {
        m159332g();
    }

    /* renamed from: d */
    public void mo145850d() {
        m159332g();
    }

    /* renamed from: f */
    public final String mo145852f() {
        return this.f102127c;
    }

    /* renamed from: g */
    private final void m159332g() {
        C40147z.m159162b().getDepartmentInvitationInfo(new GetDepartmentInvitationUrlRequest.C16232a().mo58167b(this.f102129e).mo58165a(this.f102128d).mo58164a(this.f102130f), new UIGetDataCallback(new C40197b(this)));
    }

    /* renamed from: e */
    public EduCardOptions mo145851e() {
        EduCardOptions.InvitationSource invitationSource;
        int i = C40198b.f102132a[this.f102130f.ordinal()];
        if (i == 1) {
            invitationSource = EduCardOptions.InvitationSource.AddressBook;
        } else if (i != 2) {
            invitationSource = EduCardOptions.InvitationSource.AddressBook;
        } else {
            invitationSource = EduCardOptions.InvitationSource.Group;
        }
        EduCardOptions a = new EduCardOptions.C16168a().mo58004a(this.f102128d).mo58003a(invitationSource).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "EduCardOptions.Builder()…on_source(source).build()");
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/invitation/v2/feat/edu/nonDirectional/InviteParentNonDirectionPresenter$requestInvitation$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/contact/v1/GetDepartmentInvitationUrlResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.a$b */
    public static final class C40197b implements IGetDataCallback<GetDepartmentInvitationUrlResponse> {

        /* renamed from: a */
        final /* synthetic */ InviteParentNonDirectionPresenter f102131a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40197b(InviteParentNonDirectionPresenter aVar) {
            this.f102131a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(GetDepartmentInvitationUrlResponse getDepartmentInvitationUrlResponse) {
            Intrinsics.checkParameterIsNotNull(getDepartmentInvitationUrlResponse, "response");
            ((InviteParentNonDirectionView) this.f102131a.mo145600b()).mo145844a(this.f102131a.mo145852f(), EduInvitation.f102065h.mo145787a(getDepartmentInvitationUrlResponse));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("InvitationModule", errorResult.getDebugMsg());
            String displayMsg = errorResult.getDisplayMsg();
            if (displayMsg != null) {
                Intrinsics.checkExpressionValueIsNotNull(displayMsg, "it");
                ((InviteParentNonDirectionView) this.f102131a.mo145600b()).mo145846b(displayMsg);
            }
        }
    }

    public InviteParentNonDirectionPresenter(String str, String str2, String str3, String str4, InvitationSource invitationSource) {
        Intrinsics.checkParameterIsNotNull(str, "from");
        Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str3, "departments");
        Intrinsics.checkParameterIsNotNull(str4, "chatId");
        Intrinsics.checkParameterIsNotNull(invitationSource, ShareHitPoint.f121868c);
        this.f102126b = str;
        this.f102127c = str2;
        this.f102128d = str3;
        this.f102129e = str4;
        this.f102130f = invitationSource;
    }
}
