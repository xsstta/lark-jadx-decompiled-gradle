package com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.guide.biz.onboarding.tour.entity.C38605b;
import com.ss.android.lark.guide.biz.onboarding.tour.entity.TrustedMailRequestParam;
import com.ss.android.lark.guide.biz.onboarding.tour.p1926a.C38600b;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuideModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideModel;", "()V", "authTrustedMail", "", "auth", "", "mailDomain", "", "hitFrom", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.b */
public final class InviteGuideModel extends BaseModel implements IInviteGuideContract.IInviteGuideModel {

    /* renamed from: a */
    public static final Companion f141551a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuideModel$Companion;", "", "()V", "TAG", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuideModel$authTrustedMail$innerCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/entity/TrustedMailResult;", "onError", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.b$b */
    public static final class C57454b implements IGetDataCallback<C38605b> {

        /* renamed from: a */
        final /* synthetic */ boolean f141552a;

        /* renamed from: b */
        final /* synthetic */ String f141553b;

        /* renamed from: c */
        final /* synthetic */ String f141554c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            Log.m165383e("DyFlow", "authTrustedMail_onError, error=" + errorResult);
            OnboardingHitPoint.f99379a.mo141605a(this.f141552a, String.valueOf(errorResult.getErrorCode()), this.f141553b);
        }

        /* renamed from: a */
        public void onSuccess(C38605b bVar) {
            Integer num;
            String str;
            Integer num2 = null;
            if (bVar == null || !bVar.mo141382a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("authTrustedMail_onSuccess, fail, mailDomain=");
                sb.append(this.f141554c);
                sb.append(", hitFrom=");
                sb.append(this.f141553b);
                sb.append(", code=");
                if (bVar != null) {
                    num = Integer.valueOf(bVar.mo141383b());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(", msg=");
                if (bVar != null) {
                    str = bVar.mo141384c();
                } else {
                    str = null;
                }
                sb.append(str);
                Log.m165389i("DyFlow", sb.toString());
                OnboardingHitPoint.Companion aVar = OnboardingHitPoint.f99379a;
                boolean z = this.f141552a;
                if (bVar != null) {
                    num2 = Integer.valueOf(bVar.mo141383b());
                }
                aVar.mo141605a(z, String.valueOf(num2), this.f141553b);
                return;
            }
            Log.m165389i("DyFlow", "authTrustedMail_onSuccess, success, mailDomain=" + this.f141554c + ", hitFrom=" + this.f141553b);
            OnboardingHitPoint.f99379a.mo141605a(this.f141552a, (String) null, this.f141553b);
        }

        C57454b(boolean z, String str, String str2) {
            this.f141552a = z;
            this.f141553b = str;
            this.f141554c = str2;
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract.IInviteGuideModel
    /* renamed from: a */
    public void mo195013a(boolean z, String str, String str2) {
        boolean z2;
        String str3 = str;
        int i = 1;
        if (str3 == null || str3.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Log.m165388i("authTrustedMail, mail domain is null");
            return;
        }
        C57454b bVar = new C57454b(z, str2, str);
        if (!z) {
            i = 2;
        }
        C38600b.m152249a().mo141374a(TrustedMailRequestParam.m152259a(str, i), bVar);
    }
}
