package com.larksuite.rucket.impl.serverimpl.proxymethod;

import com.bytedance.lark.sdk.StreamDataSource;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.impl.base.request.BaseCallProxyMethod;
import com.larksuite.rucket.impl.serverimpl.annotation.ServerCall;
import com.squareup.wire.Message;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.C53253l;
import com.ss.android.lark.sdk.SdkSender;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016Jj\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000ej\u0002`\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000ej\u0002`\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000ej\u0002`\u000f0\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0012\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/larksuite/rucket/impl/serverimpl/proxymethod/ServerCallProxyMethod;", "Lcom/larksuite/rucket/impl/base/request/BaseCallProxyMethod;", "Lcom/larksuite/rucket/impl/serverimpl/annotation/ServerCall;", "origin", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "command", "Lcom/ss/android/lark/pb/improto/Command;", "Lcom/larksuite/rucket/impl/serverimpl/annotation/ServerCommand;", "getAnnotationClass", "Ljava/lang/Class;", "onInvoke", "", "request", "Lcom/squareup/wire/Message;", "Lcom/larksuite/rucket/impl/base/request/PBMessage;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "contextId", "", "parser", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", ShareHitPoint.f121868c, "Lcom/bytedance/lark/sdk/StreamDataSource;", "params", "Lcom/ss/android/lark/sdk/RequestParams;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.impl.serverimpl.a.a */
public final class ServerCallProxyMethod extends BaseCallProxyMethod<ServerCall> {

    /* renamed from: b */
    private final Command f64999b = ((ServerCall) mo93458b()).value();

    @Override // com.larksuite.rucket.core.proxymethod.BaseProxyMethod
    /* renamed from: a */
    public Class<ServerCall> mo93456a() {
        return ServerCall.class;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerCallProxyMethod(Method method) {
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
        SdkSender.sendPassThroughRequest(this.f64999b, message, iGetDataCallback, iParser, lVar);
    }
}
