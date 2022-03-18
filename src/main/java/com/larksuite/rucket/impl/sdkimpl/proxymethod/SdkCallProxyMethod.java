package com.larksuite.rucket.impl.sdkimpl.proxymethod;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.sdk.StreamDataSource;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.impl.base.request.BaseCallProxyMethod;
import com.larksuite.rucket.impl.sdkimpl.annotation.SdkCall;
import com.squareup.wire.Message;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.sdk.C53253l;
import com.ss.android.lark.sdk.SdkSender;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016Jj\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\rj\u0002`\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\rj\u0002`\u000e0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\rj\u0002`\u000e0\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/larksuite/rucket/impl/sdkimpl/proxymethod/SdkCallProxyMethod;", "Lcom/larksuite/rucket/impl/base/request/BaseCallProxyMethod;", "Lcom/larksuite/rucket/impl/sdkimpl/annotation/SdkCall;", "origin", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "command", "Lcom/bytedance/lark/pb/basic/v1/Command;", "getAnnotationClass", "Ljava/lang/Class;", "onInvoke", "", "request", "Lcom/squareup/wire/Message;", "Lcom/larksuite/rucket/impl/base/request/PBMessage;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "contextId", "", "parser", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", ShareHitPoint.f121868c, "Lcom/bytedance/lark/sdk/StreamDataSource;", "params", "Lcom/ss/android/lark/sdk/RequestParams;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.impl.sdkimpl.a.a */
public final class SdkCallProxyMethod extends BaseCallProxyMethod<SdkCall> {

    /* renamed from: b */
    private final Command f64996b = ((SdkCall) mo93458b()).value();

    @Override // com.larksuite.rucket.core.proxymethod.BaseProxyMethod
    /* renamed from: a */
    public Class<SdkCall> mo93456a() {
        return SdkCall.class;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SdkCallProxyMethod(Method method) {
        super(method);
        Intrinsics.checkParameterIsNotNull(method, "origin");
    }

    @Override // com.larksuite.rucket.impl.base.request.BaseCallProxyMethod
    /* renamed from: a */
    public void mo93470a(Message<?, ?> message, IGetDataCallback<Message<?, ?>> iGetDataCallback, String str, SdkSender.IParser<Message<?, ?>> iParser, StreamDataSource streamDataSource, C53253l lVar) {
        Intrinsics.checkParameterIsNotNull(message, "request");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Intrinsics.checkParameterIsNotNull(str, "contextId");
        Intrinsics.checkParameterIsNotNull(iParser, "parser");
        Intrinsics.checkParameterIsNotNull(lVar, "params");
        SdkSender.asynSendRequestNonWrap(this.f64996b, message.encode(), (IGetDataCallback) iGetDataCallback, false, str, (SdkSender.IParser) iParser, streamDataSource, lVar);
    }
}
