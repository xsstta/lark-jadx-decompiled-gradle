package com.ss.android.lark.guide.biz.onboarding.tour.page.member;

import android.os.SystemClock;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.component.metriclogger_constants.domains.onboarding.tour.C24353a;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.guide.biz.onboarding.common.p1925a.C38598a;
import com.ss.android.lark.guide.biz.onboarding.tour.entity.C38604a;
import com.ss.android.lark.guide.biz.onboarding.tour.entity.C38605b;
import com.ss.android.lark.guide.biz.onboarding.tour.entity.TrustedMailRequestParam;
import com.ss.android.lark.guide.biz.onboarding.tour.p1926a.C38600b;
import com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract;
import com.ss.android.lark.guide.metric.OnboardingMetric;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0004R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberModel;", "()V", "trustedMail", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberModel$TrustedMail;", "getTrustedMail", "()Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberModel$TrustedMail;", "setTrustedMail", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberModel$TrustedMail;)V", "authTrustedMail", "", "auth", "", "hitFrom", "", "parseMailDomain", "mail", "Companion", "ModelFromInAppUpdate", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.a */
public abstract class AddTeamMemberModel extends BaseModel implements IAddTeamMemberContract.IAddTeamMemberModel {

    /* renamed from: a */
    public static final Companion f99242a = new Companion(null);

    /* renamed from: b */
    private IAddTeamMemberContract.IAddTeamMemberModel.TrustedMail f99243b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberModel$Companion;", "", "()V", "TAG", "", "createModel", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberModel;", "from", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final IAddTeamMemberContract.IAddTeamMemberModel mo141454a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "from");
            if (str.hashCode() == -1565334044 && str.equals("in_app_upgrade")) {
                return new ModelFromInAppUpdate();
            }
            Log.m165383e("AddTeamMemberModel", "from not found, from=" + str);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final IAddTeamMemberContract.IAddTeamMemberModel.TrustedMail mo141450a() {
        return this.f99243b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo141452a(IAddTeamMemberContract.IAddTeamMemberModel.TrustedMail aVar) {
        this.f99243b = aVar;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberModel$ModelFromInAppUpdate;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberModel;", "()V", "getTrustedMail", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberModel$TrustedMail;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.a$b */
    public static final class ModelFromInAppUpdate extends AddTeamMemberModel {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberModel$ModelFromInAppUpdate$getTrustedMail$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/entity/TrustedMailInfoResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.a$b$a */
        public static final class C38615a implements IGetDataCallback<C38604a> {

            /* renamed from: a */
            final /* synthetic */ ModelFromInAppUpdate f99244a;

            /* renamed from: b */
            final /* synthetic */ IGetDataCallback f99245b;

            /* renamed from: c */
            final /* synthetic */ IGetDataCallback f99246c;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                this.f99246c.onError(errorResult);
                OnboardingMetric.Companion aVar = OnboardingMetric.f99302a;
                C24341b bVar = C24353a.f60077o;
                Intrinsics.checkExpressionValueIsNotNull(bVar, "TourTrustedMailDomain.PULL_TRUST_MAIL_FAILED");
                aVar.mo141515a(bVar);
            }

            /* renamed from: a */
            public void onSuccess(C38604a aVar) {
                String str;
                boolean z;
                Boolean bool = null;
                if (aVar != null) {
                    str = aVar.mo141381b();
                } else {
                    str = null;
                }
                if (aVar != null) {
                    bool = Boolean.valueOf(aVar.mo141380a());
                }
                String a = this.f99244a.mo141451a(str);
                String str2 = a;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f99245b.onError(new ErrorResult("email domain is null, mail=" + str));
                } else {
                    ModelFromInAppUpdate bVar = this.f99244a;
                    IAddTeamMemberContract.IAddTeamMemberModel.TrustedMail aVar2 = new IAddTeamMemberContract.IAddTeamMemberModel.TrustedMail();
                    aVar2.mo141484a(a);
                    aVar2.mo141483a(bool);
                    bVar.mo141452a(aVar2);
                    this.f99245b.onSuccess(this.f99244a.mo141450a());
                }
                OnboardingMetric.Companion aVar3 = OnboardingMetric.f99302a;
                C24341b bVar2 = C24353a.f60076n;
                Intrinsics.checkExpressionValueIsNotNull(bVar2, "TourTrustedMailDomain.PULL_TRUST_MAIL_SUCCESS");
                aVar3.mo141515a(bVar2);
            }

            C38615a(ModelFromInAppUpdate bVar, IGetDataCallback iGetDataCallback, IGetDataCallback iGetDataCallback2) {
                this.f99244a = bVar;
                this.f99245b = iGetDataCallback;
                this.f99246c = iGetDataCallback2;
            }
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract.IAddTeamMemberModel
        /* renamed from: a */
        public void mo141455a(IGetDataCallback<IAddTeamMemberContract.IAddTeamMemberModel.TrustedMail> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            CallbackManager callbackManager = getCallbackManager();
            Intrinsics.checkExpressionValueIsNotNull(callbackManager, "callbackManager");
            C38600b.m152249a().mo141373a(new C38615a(this, C38598a.m152201a(callbackManager, iGetDataCallback), iGetDataCallback));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberModel$authTrustedMail$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/entity/TrustedMailResult;", "onError", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.a$c */
    public static final class C38616c implements IGetDataCallback<C38605b> {

        /* renamed from: a */
        final /* synthetic */ boolean f99247a;

        /* renamed from: b */
        final /* synthetic */ String f99248b;

        /* renamed from: c */
        final /* synthetic */ long f99249c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            Log.m165383e("AddTeamMemberModel", "[authTrustedMail] error=" + errorResult);
            OnboardingHitPoint.f99379a.mo141605a(this.f99247a, String.valueOf(errorResult.getErrorCode()), this.f99248b);
        }

        /* renamed from: a */
        public void onSuccess(C38605b bVar) {
            Integer num;
            String str;
            Integer num2;
            Integer num3 = null;
            if (bVar == null || !bVar.mo141382a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[authTrustedMail] fail, code=");
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
                Log.m165389i("AddTeamMemberModel", sb.toString());
                OnboardingHitPoint.Companion aVar = OnboardingHitPoint.f99379a;
                boolean z = this.f99247a;
                if (bVar != null) {
                    num2 = Integer.valueOf(bVar.mo141383b());
                } else {
                    num2 = null;
                }
                aVar.mo141605a(z, String.valueOf(num2), this.f99248b);
                OnboardingMetric.Companion aVar2 = OnboardingMetric.f99302a;
                C24341b bVar2 = C24353a.f60074l;
                Intrinsics.checkExpressionValueIsNotNull(bVar2, "TourTrustedMailDomain.SET_TRUST_MAIL_FAILED");
                HashMap hashMap = new HashMap();
                if (bVar != null) {
                    num3 = Integer.valueOf(bVar.mo141383b());
                }
                hashMap.put("code", String.valueOf(num3));
                aVar2.mo141517a(bVar2, hashMap);
            } else {
                Log.m165389i("AddTeamMemberModel", "[authTrustedMail] success");
                OnboardingHitPoint.f99379a.mo141605a(this.f99247a, (String) null, this.f99248b);
                OnboardingMetric.Companion aVar3 = OnboardingMetric.f99302a;
                C24341b bVar3 = C24353a.f60073k;
                Intrinsics.checkExpressionValueIsNotNull(bVar3, "TourTrustedMailDomain.SET_TRUST_MAIL_SUCCESS");
                aVar3.mo141515a(bVar3);
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.f99249c;
            OnboardingMetric.Companion aVar4 = OnboardingMetric.f99302a;
            C24341b bVar4 = C24353a.f60075m;
            Intrinsics.checkExpressionValueIsNotNull(bVar4, "TourTrustedMailDomain.SET_TRUST_MAIL_TIME");
            aVar4.mo141516a(bVar4, uptimeMillis);
        }

        C38616c(boolean z, String str, long j) {
            this.f99247a = z;
            this.f99248b = str;
            this.f99249c = j;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo141451a(String str) {
        int indexOf$default;
        if (str == null || (indexOf$default = StringsKt.indexOf$default((CharSequence) str, "@", 0, false, 6, (Object) null)) == -1 || indexOf$default >= str.length()) {
            return null;
        }
        if (str != null) {
            String substring = str.substring(indexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            if (substring.length() > 2) {
                return substring;
            }
            return null;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract.IAddTeamMemberModel
    /* renamed from: a */
    public void mo141453a(boolean z, String str) {
        String str2;
        boolean z2;
        IAddTeamMemberContract.IAddTeamMemberModel.TrustedMail aVar = this.f99243b;
        if (aVar != null) {
            str2 = aVar.mo141482a();
        } else {
            str2 = null;
        }
        String str3 = str2;
        int i = 1;
        if (str3 == null || str3.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Log.m165382e("[authTrustedMail] email domain is null");
            return;
        }
        C38616c cVar = new C38616c(z, str, SystemClock.uptimeMillis());
        if (!z) {
            i = 2;
        }
        C38600b.m152249a().mo141374a(TrustedMailRequestParam.m152259a(str2, i), cVar);
    }
}
