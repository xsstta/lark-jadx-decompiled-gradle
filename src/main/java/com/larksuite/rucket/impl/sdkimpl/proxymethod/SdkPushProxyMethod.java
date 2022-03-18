package com.larksuite.rucket.impl.sdkimpl.proxymethod;

import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.core.proxymethod.BaseProxyMethod;
import com.larksuite.rucket.impl.base.push.PushCache;
import com.larksuite.rucket.impl.sdkimpl.SdkPushRucketJob;
import com.larksuite.rucket.impl.sdkimpl.annotation.SdkPush;
import com.larksuite.rucket.job.compat.CallbackCompatRucketJob;
import com.squareup.wire.Message;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J1\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011\"\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/larksuite/rucket/impl/sdkimpl/proxymethod/SdkPushProxyMethod;", "Lcom/larksuite/rucket/core/proxymethod/BaseProxyMethod;", "Lcom/larksuite/rucket/impl/sdkimpl/annotation/SdkPush;", "origin", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "command", "Lcom/bytedance/lark/pb/basic/v1/Command;", "getCommand", "()Lcom/bytedance/lark/pb/basic/v1/Command;", "getAnnotationClass", "Ljava/lang/Class;", "invokeWithCallback", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "args", "", "", "(Lcom/larksuite/framework/callback/IGetDataCallback;[Ljava/lang/Object;)V", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.impl.sdkimpl.a.b */
public final class SdkPushProxyMethod extends BaseProxyMethod<SdkPush> {

    /* renamed from: a */
    private final Command f64997a = ((SdkPush) mo93458b()).value();

    @Override // com.larksuite.rucket.core.proxymethod.BaseProxyMethod
    /* renamed from: a */
    public Class<SdkPush> mo93456a() {
        return SdkPush.class;
    }

    /* renamed from: f */
    public final Command mo93475f() {
        return this.f64997a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002j\u0002`\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/larksuite/rucket/impl/sdkimpl/SdkPushRucketJob;", "Lcom/squareup/wire/Message;", "Lcom/larksuite/rucket/impl/base/request/PBMessage;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.impl.sdkimpl.a.b$a */
    static final class C26339a extends Lambda implements Function0<SdkPushRucketJob<Message<?, ?>>> {
        final /* synthetic */ SdkPushProxyMethod this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26339a(SdkPushProxyMethod bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SdkPushRucketJob<Message<?, ?>> invoke() {
            return new SdkPushRucketJob<>(this.this$0.mo93475f(), this.this$0.mo93460c());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SdkPushProxyMethod(Method method) {
        super(method);
        Intrinsics.checkParameterIsNotNull(method, "origin");
    }

    @Override // com.larksuite.rucket.core.proxymethod.AsyncProxyMethod
    /* renamed from: a */
    public void mo93463a(IGetDataCallback<?> iGetDataCallback, Object... objArr) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Intrinsics.checkParameterIsNotNull(objArr, "args");
        if (iGetDataCallback instanceof CallbackCompatRucketJob) {
            PushCache.f64986a.mo93468a(this.f64997a, new C26339a(this)).mo93465a((CallbackCompatRucketJob) iGetDataCallback);
            return;
        }
        throw new BaseProxyMethod.GenerateProxyMethodError("Arguments Error! Callback should be subclass of CallbackCompactRucketJob");
    }
}
