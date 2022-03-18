package com.ss.android.lark.profile.func.v3.userprofile.service;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.contact.v1.UpdateFocusChatterRequest;
import com.bytedance.lark.pb.contact.v1.UpdateFocusChatterResponse;
import com.bytedance.lark.pb.contact.v2.GetUserProfileRequest;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.bytedance.lark.pb.contact.v2.PatchSelfUserProfileRequest;
import com.bytedance.lark.pb.contact.v2.PatchSelfUserProfileResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.Rucket;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070!\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService;", "Lcom/larksuite/rucket/core/base/ServiceModel;", "Lcom/ss/android/lark/profile/func/v3/userprofile/service/SdkService;", "()V", "buildRequest", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileRequest$Builder;", "token", "", ShareHitPoint.f121868c, "Lcom/ss/android/lark/biz/core/api/ContactSource;", "isLocal", "", "userId", "chatId", "getUserProfile", "Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService$Response;", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse;", "request", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileRequest;", "(Lcom/bytedance/lark/pb/contact/v2/GetUserProfileRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lcom/ss/android/lark/biz/core/api/ContactSource;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/biz/core/api/ContactSource;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFocusChatter", "Lcom/larksuite/rucket/job/base/RucketResult;", "Lcom/bytedance/lark/pb/contact/v1/UpdateFocusChatterResponse;", "isSpecialFocus", BottomDialog.f17198f, "", "(ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadProfileCoverKey", "", "coverKey", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Response", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.b.b */
public final class UserProfileService {

    /* renamed from: a */
    public static final UserProfileService f130437a = new UserProfileService();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService$Response;", "T", "", "()V", "Error", "Success", "Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService$Response$Success;", "Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService$Response$Error;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.b.b$a */
    public static abstract class Response<T> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService$Response$Error;", "Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService$Response;", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;)V", "getError", "()Lcom/larksuite/framework/callback/Entity/ErrorResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.b.b$a$a */
        public static final class Error extends Response {

            /* renamed from: a */
            private final ErrorResult f130438a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof Error) && Intrinsics.areEqual(this.f130438a, ((Error) obj).f130438a);
                }
                return true;
            }

            public int hashCode() {
                ErrorResult errorResult = this.f130438a;
                if (errorResult != null) {
                    return errorResult.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "Error(error=" + this.f130438a + ")";
            }

            /* renamed from: a */
            public final ErrorResult mo180109a() {
                return this.f130438a;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Error(ErrorResult errorResult) {
                super(null);
                Intrinsics.checkParameterIsNotNull(errorResult, "error");
                this.f130438a = errorResult;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService$Response$Success;", "T", "Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService$Response;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService$Response$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.b.b$a$b */
        public static final class Success<T> extends Response<T> {

            /* renamed from: a */
            private final T f130439a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof Success) && Intrinsics.areEqual(this.f130439a, ((Success) obj).f130439a);
                }
                return true;
            }

            public int hashCode() {
                T t = this.f130439a;
                if (t != null) {
                    return t.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "Success(data=" + ((Object) this.f130439a) + ")";
            }

            /* renamed from: a */
            public final T mo180113a() {
                return this.f130439a;
            }

            public Success(T t) {
                super(null);
                this.f130439a = t;
            }
        }

        private Response() {
        }

        public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, d2 = {"getUserProfile", "", "request", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileRequest;", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService$Response;", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.v3.userprofile.service.UserProfileService", mo239173f = "UserProfileService.kt", mo239174i = {0, 0}, mo239175l = {42}, mo239176m = "getUserProfile", mo239177n = {"this", "request"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.b.b$b */
    public static final class C52691b extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ UserProfileService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52691b(UserProfileService bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo180104a((GetUserProfileRequest) null, this);
        }
    }

    private UserProfileService() {
    }

    /* renamed from: a */
    private final GetUserProfileRequest.C16488a m204228a() {
        GetUserProfileRequest.C16488a aVar = new GetUserProfileRequest.C16488a();
        aVar.f42801h = true;
        aVar.f42800g = true;
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/contact/v2/PatchSelfUserProfileResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.v3.userprofile.service.UserProfileService$uploadProfileCoverKey$1", mo239173f = "UserProfileService.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.b.b$c */
    public static final class C52692c extends SuspendLambda implements Function2<PatchSelfUserProfileResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ IGetDataCallback $callback;
        final /* synthetic */ String $coverKey;
        int label;
        private PatchSelfUserProfileResponse p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52692c(IGetDataCallback iGetDataCallback, String str, Continuation cVar) {
            super(2, cVar);
            this.$callback = iGetDataCallback;
            this.$coverKey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52692c cVar2 = new C52692c(this.$callback, this.$coverKey, cVar);
            cVar2.p$0 = (PatchSelfUserProfileResponse) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PatchSelfUserProfileResponse patchSelfUserProfileResponse, Continuation<? super Unit> cVar) {
            return ((C52692c) create(patchSelfUserProfileResponse, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                this.$callback.onSuccess(this.$coverKey);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.v3.userprofile.service.UserProfileService$uploadProfileCoverKey$2", mo239173f = "UserProfileService.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.b.b$d */
    public static final class C52693d extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ IGetDataCallback $callback;
        int label;
        private ErrorResult p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52693d(IGetDataCallback iGetDataCallback, Continuation cVar) {
            super(2, cVar);
            this.$callback = iGetDataCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52693d dVar = new C52693d(this.$callback, cVar);
            dVar.p$0 = (ErrorResult) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C52693d) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                this.$callback.onError(this.p$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo180104a(com.bytedance.lark.pb.contact.v2.GetUserProfileRequest r5, kotlin.coroutines.Continuation<? super com.ss.android.lark.profile.func.v3.userprofile.service.UserProfileService.Response<com.bytedance.lark.pb.contact.v2.GetUserProfileResponse>> r6) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.v3.userprofile.service.UserProfileService.mo180104a(com.bytedance.lark.pb.contact.v2.GetUserProfileRequest, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo180108a(String str, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "coverKey");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        PatchSelfUserProfileRequest a = new PatchSelfUserProfileRequest.C16548a().mo58912a(str).mo58913a(CollectionsKt.listOf(PatchSelfUserProfileRequest.SelfUserProfileUpdateProperty.TOP_IMAGE)).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "request");
        RucketJob.m95402b(RucketJob.m95401a(((SdkService) Rucket.m95345a(SdkService.class)).mo180103a(a), (CoroutineContext) null, new C52692c(iGetDataCallback, str, null), 1, (Object) null), null, new C52693d(iGetDataCallback, null), 1, null);
    }

    /* renamed from: a */
    private final GetUserProfileRequest.C16488a m204229a(String str, ContactSource contactSource, boolean z) {
        SyncDataStrategy syncDataStrategy;
        GetUserProfileRequest.C16488a a = m204228a();
        a.f42797d = str;
        a.f42794a = GetUserProfileRequest.Scene.BY_CONTACT_TOKEN;
        a.f42799f = com.bytedance.lark.pb.basic.v1.ContactSource.fromValue(contactSource.getSourceType());
        if (z) {
            syncDataStrategy = SyncDataStrategy.LOCAL;
        } else {
            syncDataStrategy = SyncDataStrategy.FORCE_SERVER;
        }
        a.f42795b = syncDataStrategy;
        return a;
    }

    /* renamed from: a */
    public final Object mo180107a(boolean z, long j, Continuation<? super RucketResult<UpdateFocusChatterResponse>> cVar) {
        UpdateFocusChatterRequest.Operate operate;
        if (z) {
            operate = UpdateFocusChatterRequest.Operate.DELETE;
        } else {
            operate = UpdateFocusChatterRequest.Operate.ADD;
        }
        UpdateFocusChatterRequest.C16410a aVar = new UpdateFocusChatterRequest.C16410a();
        aVar.f42680a = CollectionsKt.listOf(C69089a.m265840a(j));
        aVar.f42681b = operate;
        UpdateFocusChatterRequest a = aVar.build();
        Intrinsics.checkExpressionValueIsNotNull(a, "request");
        return ((SdkService) Rucket.m95345a(SdkService.class)).mo180101a(a).mo93484a(cVar);
    }

    /* renamed from: a */
    private final GetUserProfileRequest.C16488a m204230a(String str, String str2, ContactSource contactSource, boolean z) {
        boolean z2;
        GetUserProfileRequest.Scene scene;
        SyncDataStrategy syncDataStrategy;
        GetUserProfileRequest.C16488a a = m204228a();
        a.f42796c = str;
        String str3 = str2;
        if (str3 == null || str3.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            scene = GetUserProfileRequest.Scene.BY_USER_ID;
        } else {
            a.f42798e = str2;
            scene = GetUserProfileRequest.Scene.IN_CHAT;
        }
        a.f42794a = scene;
        a.f42799f = com.bytedance.lark.pb.basic.v1.ContactSource.fromValue(contactSource.getSourceType());
        if (z) {
            syncDataStrategy = SyncDataStrategy.LOCAL;
        } else {
            syncDataStrategy = SyncDataStrategy.FORCE_SERVER;
        }
        a.f42795b = syncDataStrategy;
        return a;
    }

    /* renamed from: a */
    public final Object mo180105a(String str, ContactSource contactSource, boolean z, Continuation<? super Response<GetUserProfileResponse>> cVar) {
        GetUserProfileRequest a = m204229a(str, contactSource, z).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
        return mo180104a(a, cVar);
    }

    /* renamed from: a */
    public final Object mo180106a(String str, String str2, ContactSource contactSource, boolean z, Continuation<? super Response<GetUserProfileResponse>> cVar) {
        GetUserProfileRequest a = m204230a(str, str2, contactSource, z).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
        return mo180104a(a, cVar);
    }
}
