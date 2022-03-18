package com.ss.android.lark.profile.func.v3.userprofile;

import android.app.Activity;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.contact.v1.UpdateFocusChatterResponse;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.job.base.RucketResult;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.dto.ProfileChat;
import com.ss.android.lark.profile.func.v3.userprofile.service.UserProfileService;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rJ\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001b\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ)\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\n2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ'\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J1\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010$J'\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J1\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010$J'\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+H@ø\u0001\u0000¢\u0006\u0002\u0010,R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileModelV3;", "", "()V", "profileModuleDependency", "Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency;", "getProfileModuleDependency", "()Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency;", "setProfileModuleDependency", "(Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency;)V", "acceptAddFriendRequest", "Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService$Response;", "", "contactApplicationId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createP2pSecretChat", "userId", ShareHitPoint.f121868c, "Lcom/ss/android/lark/biz/core/api/ContactSource;", "(Ljava/lang/String;Lcom/ss/android/lark/biz/core/api/ContactSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSingleNameCard", "", "context", "Landroid/app/Activity;", "email", "userName", "deleteSingleNameCard", "nameCardId", "getRecogniseSpansResult", "Lcom/ss/android/lark/widget/span/RecogniseSpansResult;", "userStatus", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserProfileFromLocal", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse;", "token", "chatId", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/biz/core/api/ContactSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserProfileFromServer", "updateFocusChatter", "Lcom/larksuite/rucket/job/base/RucketResult;", "Lcom/bytedance/lark/pb/contact/v1/UpdateFocusChatterResponse;", "isSpecialFocus", BottomDialog.f17198f, "", "(ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.aw */
public final class UserProfileModelV3 {

    /* renamed from: b */
    public static final Companion f130380b = new Companion(null);
    @Inject

    /* renamed from: a */
    public IProfileModuleDependency f130381a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileModelV3$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.aw$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final IProfileModuleDependency mo179979a() {
        IProfileModuleDependency iProfileModuleDependency = this.f130381a;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        return iProfileModuleDependency;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/UserProfileModelV3$acceptAddFriendRequest$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.aw$b */
    public static final class C52682b implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f130382a;

        C52682b(CancellableContinuation kVar) {
            this.f130382a = kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo179990a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo179990a(boolean z) {
            UserProfileService.Response.Success bVar = new UserProfileService.Response.Success(true);
            Result.Companion aVar = Result.Companion;
            this.f130382a.resumeWith(Result.m271569constructorimpl(bVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UserProfileModelV3", errorResult.getDebugMsg());
            UserProfileService.Response.Error aVar = new UserProfileService.Response.Error(errorResult);
            Result.Companion aVar2 = Result.Companion;
            this.f130382a.resumeWith(Result.m271569constructorimpl(aVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/UserProfileModelV3$deleteSingleNameCard$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.aw$e */
    public static final class C52685e implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f130385a;

        C52685e(CancellableContinuation kVar) {
            this.f130385a = kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo179993a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo179993a(boolean z) {
            UserProfileService.Response.Success bVar = new UserProfileService.Response.Success(Boolean.valueOf(z));
            Result.Companion aVar = Result.Companion;
            this.f130385a.resumeWith(Result.m271569constructorimpl(bVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UserProfileService.Response.Error aVar = new UserProfileService.Response.Error(errorResult);
            Result.Companion aVar2 = Result.Companion;
            this.f130385a.resumeWith(Result.m271569constructorimpl(aVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "profileChat", "Lcom/ss/android/lark/profile/dto/ProfileChat;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.aw$c */
    static final class C52683c<T> implements Consumer<ProfileChat> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f130383a;

        C52683c(CancellableContinuation kVar) {
            this.f130383a = kVar;
        }

        /* renamed from: a */
        public final void accept(ProfileChat profileChat) {
            if (profileChat == null) {
                Log.m165383e("UserProfileModel", "chat is null");
                UserProfileService.Response.Error aVar = new UserProfileService.Response.Error(new ErrorResult("chat is null"));
                Result.Companion aVar2 = Result.Companion;
                this.f130383a.resumeWith(Result.m271569constructorimpl(aVar));
                return;
            }
            UserProfileService.Response.Success bVar = new UserProfileService.Response.Success(profileChat.mo178838a());
            Result.Companion aVar3 = Result.Companion;
            this.f130383a.resumeWith(Result.m271569constructorimpl(bVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.aw$d */
    static final class C52684d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f130384a;

        C52684d(CancellableContinuation kVar) {
            this.f130384a = kVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            ErrorResult errorResult;
            Intrinsics.checkParameterIsNotNull(th, "error");
            if (th instanceof ErrorResult) {
                errorResult = (ErrorResult) th;
                Log.m165383e("UserProfileModel", errorResult.getDebugMsg());
            } else {
                Log.m165386e("UserProfileModel", th);
                errorResult = new ErrorResult(th.getMessage());
            }
            UserProfileService.Response.Error aVar = new UserProfileService.Response.Error(errorResult);
            Result.Companion aVar2 = Result.Companion;
            this.f130384a.resumeWith(Result.m271569constructorimpl(aVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00070\u0003H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "result", "", "", "kotlin.jvm.PlatformType", "Lcom/ss/android/lark/widget/span/RecogniseSpansResult;", "", "callBackRecognizeSpanResult", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileModelV3$getRecogniseSpansResult$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.aw$f */
    static final class C52686f implements C37030f.AbstractC37031a {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f130386a;

        /* renamed from: b */
        final /* synthetic */ String f130387b;

        /* renamed from: c */
        final /* synthetic */ String f130388c;

        C52686f(CancellableContinuation kVar, String str, String str2) {
            this.f130386a = kVar;
            this.f130387b = str;
            this.f130388c = str2;
        }

        @Override // com.ss.android.lark.C37030f.AbstractC37031a
        /* renamed from: a */
        public final void mo136555a(Map<String, RecogniseSpansResult> map) {
            if (map == null || map.get(this.f130388c) == null) {
                UserProfileService.Response.Error aVar = new UserProfileService.Response.Error(new ErrorResult("RecogniseSpansResult is null"));
                Result.Companion aVar2 = Result.Companion;
                this.f130386a.resumeWith(Result.m271569constructorimpl(aVar));
                return;
            }
            UserProfileService.Response.Success bVar = new UserProfileService.Response.Success(map.get(this.f130388c));
            Result.Companion aVar3 = Result.Companion;
            this.f130386a.resumeWith(Result.m271569constructorimpl(bVar));
        }
    }

    /* renamed from: b */
    public final Object mo179988b(String str, Continuation<? super UserProfileService.Response<Boolean>> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        lVar.mo243071d();
        mo179979a().mo133582l().mo133655a(str, new C52682b(lVar));
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* renamed from: a */
    public final Object mo179983a(String str, Continuation<? super UserProfileService.Response<Boolean>> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        lVar.mo243071d();
        mo179979a().mo133582l().mo133660c(str, new C52685e(lVar));
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* renamed from: a */
    public final Object mo179980a(String str, ContactSource contactSource, Continuation<? super UserProfileService.Response<GetUserProfileResponse>> cVar) {
        return UserProfileService.f130437a.mo180105a(str, contactSource, false, cVar);
    }

    /* renamed from: b */
    public final Object mo179986b(String str, ContactSource contactSource, Continuation<? super UserProfileService.Response<GetUserProfileResponse>> cVar) {
        return UserProfileService.f130437a.mo180105a(str, contactSource, true, cVar);
    }

    /* renamed from: a */
    public final Object mo179982a(String str, String str2, Continuation<? super UserProfileService.Response<? extends RecogniseSpansResult>> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        lVar.mo243071d();
        C37030f.m146093a().mo103025a(str, str2, true, new C52686f(lVar, str, str2));
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* renamed from: c */
    public final Object mo179989c(String str, ContactSource contactSource, Continuation<? super UserProfileService.Response<String>> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        lVar.mo243071d();
        CancellableContinuationImpl lVar2 = lVar;
        mo179979a().mo133586p().mo133601a(true, str, contactSource).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C52683c(lVar2), new C52684d(lVar2));
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* renamed from: a */
    public final Object mo179984a(boolean z, long j, Continuation<? super RucketResult<UpdateFocusChatterResponse>> cVar) {
        return UserProfileService.f130437a.mo180107a(z, j, cVar);
    }

    /* renamed from: a */
    public final void mo179985a(Activity activity, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(str, "email");
        Intrinsics.checkParameterIsNotNull(str2, "userName");
        IProfileModuleDependency iProfileModuleDependency = this.f130381a;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        iProfileModuleDependency.mo133582l().mo133652a(activity, str2, str, 1);
    }

    /* renamed from: b */
    public final Object mo179987b(String str, String str2, ContactSource contactSource, Continuation<? super UserProfileService.Response<GetUserProfileResponse>> cVar) {
        return UserProfileService.f130437a.mo180106a(str, str2, contactSource, true, cVar);
    }

    /* renamed from: a */
    public final Object mo179981a(String str, String str2, ContactSource contactSource, Continuation<? super UserProfileService.Response<GetUserProfileResponse>> cVar) {
        return UserProfileService.f130437a.mo180106a(str, str2, contactSource, false, cVar);
    }
}
