package com.bytedance.ee.bear.onboarding.synchronization;

import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.onboarding.v1.PostUserConsumingGuideResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.C25970d;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.pb.guide.GuideScene;
import com.ss.android.lark.pb.guide.PostUserConsumingGuideRequest;
import com.ss.android.lark.pb.guide.PullProductGuideRequest;
import com.ss.android.lark.pb.guide.PullProductGuideResponse;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.SdkSender;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u001e\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J@\u0010\u0011\u001a\u00020\u00062 \u0010\u0012\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00060\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00060\u0013H\u0016J\"\u0010\u0016\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000e0\u000bH\u0002J:\u0010\u0017\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00060\u0013H\u0016J:\u0010\u0018\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00060\u0013H\u0016J\u001e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/synchronization/OnBoardingRustSynchronizer;", "Lcom/bytedance/ee/bear/onboarding/synchronization/IOnBoardingNetSynchronizer;", "()V", "callbackRef", "Lcom/larksuite/framework/callback/CancelableGetDataCallback;", "dispose", "", "doneOnBoarding", "action", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "extractOnBoardingIdMap", "", "response", "Lcom/ss/android/lark/pb/guide/PullProductGuideResponse;", "fetchOnBoardings", "onResult", "Lkotlin/Function1;", "onError", "", "getOnBoarding", "syncDoneToRemote", "syncUpdateToRemote", "updateOnBoarding", "Companion", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.synchronization.e */
public final class OnBoardingRustSynchronizer implements IOnBoardingNetSynchronizer {

    /* renamed from: a */
    public static final Companion f27993a = new Companion(null);

    /* renamed from: b */
    private C25970d<?> f27994b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/synchronization/OnBoardingRustSynchronizer$Companion;", "", "()V", "TAG", "", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.onboarding.synchronization.IOnBoardingNetSynchronizer
    /* renamed from: a */
    public void mo39640a() {
        C25970d<?> dVar = this.f27994b;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.e$b */
    public static final class C10420b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C10420b f27995a = new C10420b();

        C10420b() {
        }

        /* renamed from: a */
        public final boolean mo39661a(byte[] bArr) {
            PostUserConsumingGuideResponse.ADAPTER.decode(bArr);
            return true;
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Object parse(byte[] bArr) {
            return Boolean.valueOf(mo39661a(bArr));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.e$j */
    public static final class C10428j<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C10428j f28003a = new C10428j();

        C10428j() {
        }

        /* renamed from: a */
        public final boolean mo39669a(byte[] bArr) {
            PostUserConsumingGuideResponse.ADAPTER.decode(bArr);
            return true;
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Object parse(byte[] bArr) {
            return Boolean.valueOf(mo39669a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ee/bear/onboarding/synchronization/OnBoardingRustSynchronizer$fetchOnBoardings$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.e$c */
    public static final class C10421c implements IGetDataCallback<Map<String, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ Function1 f27996a;

        /* renamed from: b */
        final /* synthetic */ Function2 f27997b;

        /* renamed from: a */
        public void onSuccess(Map<String, Boolean> map) {
            C13479a.m54772d("OnBoardingManager", String.valueOf(map));
            this.f27996a.invoke(map);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f27997b.invoke(Integer.valueOf(errorResult.getErrorCode()), errorResult.getDebugMsg());
        }

        C10421c(Function1 function1, Function2 kVar) {
            this.f27996a = function1;
            this.f27997b = kVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.e$e */
    public static final class C10423e<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ OnBoardingRustSynchronizer f27998a;

        C10423e(OnBoardingRustSynchronizer eVar) {
            this.f27998a = eVar;
        }

        /* renamed from: a */
        public final Map<String, Boolean> parse(byte[] bArr) {
            return this.f27998a.mo39660a(PullProductGuideResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/onboarding/synchronization/OnBoardingRustSynchronizer$syncDoneToRemote$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.e$f */
    public static final class C10424f implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Function1 f27999a;

        /* renamed from: b */
        final /* synthetic */ Function2 f28000b;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f27999a.invoke(true);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f28000b.invoke(Integer.valueOf(errorResult.getErrorCode()), errorResult.getDebugMsg());
        }

        C10424f(Function1 function1, Function2 kVar) {
            this.f27999a = function1;
            this.f28000b = kVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/onboarding/synchronization/OnBoardingRustSynchronizer$syncUpdateToRemote$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.e$h */
    public static final class C10426h implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Function1 f28001a;

        /* renamed from: b */
        final /* synthetic */ Function2 f28002b;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f28001a.invoke(true);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f28002b.invoke(Integer.valueOf(errorResult.getErrorCode()), errorResult.getDebugMsg());
        }

        C10426h(Function1 function1, Function2 kVar) {
            this.f28001a = function1;
            this.f28002b = kVar;
        }
    }

    /* renamed from: a */
    private final void m43316a(IGetDataCallback<Map<String, Boolean>> iGetDataCallback) {
        SdkSender.sendPassThroughRequest(Command.PULL_PRODUCT_GUIDE, new PullProductGuideRequest.C49790a().mo173324a(GuideScene.GUIDE_SCENE_CCM), iGetDataCallback, new C10423e(this));
    }

    /* renamed from: a */
    public final Map<String, Boolean> mo39660a(PullProductGuideResponse pullProductGuideResponse) {
        Map<String, Boolean> map;
        HashMap hashMap = new HashMap();
        if (pullProductGuideResponse == null || (map = pullProductGuideResponse.mguides) == null) {
            return hashMap;
        }
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkExpressionValueIsNotNull(key, "item.key");
            hashMap.put(key, Boolean.valueOf(!entry.getValue().booleanValue()));
        }
        return hashMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "errorCode", "", ApiHandler.API_CALLBACK_ERRMSG, "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.e$d */
    static final class C10422d extends Lambda implements Function2<Integer, String, Unit> {
        final /* synthetic */ Function1 $onError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10422d(Function1 function1) {
            super(2);
            this.$onError = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, String str) {
            invoke(num.intValue(), str);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, String str) {
            Function1 function1 = this.$onError;
            function1.invoke(new RuntimeException("OnBoardingManager: server response error code: " + i + ", errMsg: " + str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "errorCode", "", ApiHandler.API_CALLBACK_ERRMSG, "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.e$g */
    static final class C10425g extends Lambda implements Function2<Integer, String, Unit> {
        final /* synthetic */ Function1 $onError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10425g(Function1 function1) {
            super(2);
            this.$onError = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, String str) {
            invoke(num.intValue(), str);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, String str) {
            Function1 function1 = this.$onError;
            function1.invoke(new RuntimeException("OnBoardingManager: server response error code: " + i + ", errMsg: " + str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "errorCode", "", ApiHandler.API_CALLBACK_ERRMSG, "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.synchronization.e$i */
    static final class C10427i extends Lambda implements Function2<Integer, String, Unit> {
        final /* synthetic */ Function1 $onError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10427i(Function1 function1) {
            super(2);
            this.$onError = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, String str) {
            invoke(num.intValue(), str);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, String str) {
            Function1 function1 = this.$onError;
            function1.invoke(new RuntimeException("OnBoardingManager: server response error code: " + i + ", errMsg: " + str));
        }
    }

    /* renamed from: b */
    private final void m43318b(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.sendPassThroughRequest(Command.POST_USER_CONSUMING_GUIDE_REQUEST, new PostUserConsumingGuideRequest.C49784a().mo173308a(CollectionsKt.listOf(str)), iGetDataCallback, C10428j.f28003a);
    }

    /* renamed from: a */
    private final void m43317a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.sendPassThroughRequest(Command.POST_USER_CONSUMING_GUIDE_REQUEST, new PostUserConsumingGuideRequest.C49784a().mo173310b(CollectionsKt.listOf(str)), iGetDataCallback, C10420b.f27995a);
    }

    @Override // com.bytedance.ee.bear.onboarding.synchronization.IOnBoardingNetSynchronizer
    /* renamed from: a */
    public void mo39642a(Function1<? super Map<String, Boolean>, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(function1, "onResult");
        Intrinsics.checkParameterIsNotNull(function12, "onError");
        C25970d<?> dVar = this.f27994b;
        if (dVar != null) {
            dVar.cancel();
        }
        C25970d<?> dVar2 = new C25970d<>(new C10421c(function1, new C10422d(function12)));
        this.f27994b = dVar2;
        m43316a(dVar2);
    }

    @Override // com.bytedance.ee.bear.onboarding.synchronization.IOnBoardingNetSynchronizer
    /* renamed from: b */
    public void mo39643b(String str, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "action");
        Intrinsics.checkParameterIsNotNull(function1, "onResult");
        Intrinsics.checkParameterIsNotNull(function12, "onError");
        C25970d<?> dVar = this.f27994b;
        if (dVar != null) {
            dVar.cancel();
        }
        C25970d<?> dVar2 = new C25970d<>(new C10426h(function1, new C10427i(function12)));
        this.f27994b = dVar2;
        m43318b(str, dVar2);
    }

    @Override // com.bytedance.ee.bear.onboarding.synchronization.IOnBoardingNetSynchronizer
    /* renamed from: a */
    public void mo39641a(String str, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "action");
        Intrinsics.checkParameterIsNotNull(function1, "onResult");
        Intrinsics.checkParameterIsNotNull(function12, "onError");
        C25970d<?> dVar = this.f27994b;
        if (dVar != null) {
            dVar.cancel();
        }
        C25970d<?> dVar2 = new C25970d<>(new C10424f(function1, new C10425g(function12)));
        this.f27994b = dVar2;
        m43317a(str, dVar2);
    }
}
