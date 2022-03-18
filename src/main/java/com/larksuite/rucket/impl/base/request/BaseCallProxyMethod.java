package com.larksuite.rucket.impl.base.request;

import com.bytedance.lark.sdk.StreamDataSource;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.core.proxymethod.BaseProxyMethod;
import com.larksuite.rucket.toolkit.Util;
import com.squareup.wire.Message;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.sdk.C53253l;
import com.ss.android.lark.sdk.SdkSender;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u001b*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J1\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f\"\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u000eJj\u0010\u000f\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0011j\u0002`\u00122\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0011j\u0002`\u00120\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0011j\u0002`\u00120\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&¨\u0006\u001c"}, d2 = {"Lcom/larksuite/rucket/impl/base/request/BaseCallProxyMethod;", "T", "", "Lcom/larksuite/rucket/core/proxymethod/BaseProxyMethod;", "origin", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "invokeWithCallback", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "args", "", "", "(Lcom/larksuite/framework/callback/IGetDataCallback;[Ljava/lang/Object;)V", "onInvoke", "request", "Lcom/squareup/wire/Message;", "Lcom/larksuite/rucket/impl/base/request/PBMessage;", "contextId", "", "parser", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", ShareHitPoint.f121868c, "Lcom/bytedance/lark/sdk/StreamDataSource;", "params", "Lcom/ss/android/lark/sdk/RequestParams;", "Companion", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.impl.base.request.a */
public abstract class BaseCallProxyMethod<T extends Annotation> extends BaseProxyMethod<T> {

    /* renamed from: a */
    public static final Companion f64988a = new Companion(null);

    /* renamed from: a */
    public abstract void mo93470a(Message<?, ?> message, IGetDataCallback<Message<?, ?>> iGetDataCallback, String str, SdkSender.IParser<Message<?, ?>> iParser, StreamDataSource streamDataSource, C53253l lVar);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/rucket/impl/base/request/BaseCallProxyMethod$Companion;", "", "()V", "TAG", "", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.impl.base.request.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "", "Lcom/larksuite/rucket/impl/base/request/RequestConfigImpl;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.impl.base.request.a$b */
    static final class C26337b extends Lambda implements Function1<RequestConfigImpl, Unit> {
        public static final C26337b INSTANCE = new C26337b();

        C26337b() {
            super(1);
        }

        public final void invoke(RequestConfigImpl bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestConfigImpl bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseCallProxyMethod(Method method) {
        super(method);
        Intrinsics.checkParameterIsNotNull(method, "origin");
    }

    @Override // com.larksuite.rucket.core.proxymethod.AsyncProxyMethod
    /* renamed from: a */
    public void mo93463a(IGetDataCallback<?> iGetDataCallback, Object... objArr) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Intrinsics.checkParameterIsNotNull(objArr, "args");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (C69121n.m265983a(obj, 1)) {
                arrayList.add(obj);
            }
        }
        C26337b bVar = (Function1) CollectionsKt.firstOrNull((List) arrayList);
        if (bVar == null) {
            bVar = C26337b.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : objArr) {
            if (obj2 instanceof Message) {
                arrayList2.add(obj2);
            }
        }
        Message<?, ?> message = (Message) CollectionsKt.first((List) arrayList2);
        RequestConfigImpl bVar2 = new RequestConfigImpl();
        bVar.invoke(bVar2);
        mo93470a(message, iGetDataCallback, bVar2.mo93473b(), Util.f64970a.mo93446a(mo93460c()), bVar2.mo93472a().toSource(), bVar2.mo93474c());
    }
}
