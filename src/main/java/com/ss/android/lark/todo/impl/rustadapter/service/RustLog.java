package com.ss.android.lark.todo.impl.rustadapter.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JM\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u000b2\u0006\u0010\f\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJC\u0010\u000f\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u000b2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog;", "", "()V", "sdkRequestWithErr", "Lcom/ss/android/lark/todo/impl/rustadapter/service/SdkResponse;", "T", "command", "Lcom/bytedance/lark/pb/basic/v1/Command;", "builder", "Lcom/squareup/wire/Message$Builder;", "iParser", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "reqLog", "", "(Lcom/bytedance/lark/pb/basic/v1/Command;Lcom/squareup/wire/Message$Builder;Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncSend", "(Lcom/bytedance/lark/pb/basic/v1/Command;Lcom/squareup/wire/Message$Builder;Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;Ljava/lang/String;)Ljava/lang/Object;", "ParserString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.a */
public final class RustLog {

    /* renamed from: a */
    public static final RustLog f141092a = new RustLog();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "T", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "parseToString", "", "obj", "(Ljava/lang/Object;)Ljava/lang/String;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.a$a */
    public interface ParserString<T> extends SdkSender.IParser<T> {
        /* renamed from: a */
        String mo194250a(T t);
    }

    private RustLog() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/RustLog$sdkRequestWithErr$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.a$b */
    public static final class C57215b implements IGetDataCallback<T> {

        /* renamed from: a */
        final /* synthetic */ String f141093a;

        /* renamed from: b */
        final /* synthetic */ Continuation f141094b;

        /* renamed from: c */
        final /* synthetic */ Command f141095c;

        /* renamed from: d */
        final /* synthetic */ String f141096d;

        /* renamed from: e */
        final /* synthetic */ Message.Builder f141097e;

        /* renamed from: f */
        final /* synthetic */ ParserString f141098f;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            LogMessageUtil cVar = LogMessageUtil.f139260a;
            String str = this.f141093a;
            Intrinsics.checkExpressionValueIsNotNull(str, "contextId");
            Log.m165383e("TodoRustCRUD", cVar.mo191766a(str, this.f141095c.toString(), errorResult));
            Continuation cVar2 = this.f141094b;
            SdkResponse bVar = new SdkResponse(null, errorResult);
            Result.Companion aVar = Result.Companion;
            cVar2.resumeWith(Result.m271569constructorimpl(bVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(T t) {
            LogMessageUtil cVar = LogMessageUtil.f139260a;
            String str = this.f141093a;
            Intrinsics.checkExpressionValueIsNotNull(str, "contextId");
            Log.m165389i("TodoRustCRUD", cVar.mo191768a(str, this.f141095c.toString(), "res", this.f141098f.mo194250a(t)));
            Continuation cVar2 = this.f141094b;
            SdkResponse bVar = new SdkResponse(t, null);
            Result.Companion aVar = Result.Companion;
            cVar2.resumeWith(Result.m271569constructorimpl(bVar));
        }

        C57215b(String str, Continuation cVar, Command command, String str2, Message.Builder builder, ParserString aVar) {
            this.f141093a = str;
            this.f141094b = cVar;
            this.f141095c = command;
            this.f141096d = str2;
            this.f141097e = builder;
            this.f141098f = aVar;
        }
    }

    /* renamed from: a */
    public final <T> Object mo194249a(Command command, Message.Builder<?, ?> builder, ParserString<T> aVar, String str, Continuation<? super SdkResponse<T>> cVar) {
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        String a = C53234a.m205877a();
        LogMessageUtil cVar2 = LogMessageUtil.f139260a;
        Intrinsics.checkExpressionValueIsNotNull(a, "contextId");
        Log.m165389i("TodoRustCRUD", cVar2.mo191770b(a, command.toString(), HiAnalyticsConstant.Direction.REQUEST, str));
        SdkSender.asynSendRequestNonWrap(command, builder, new C57215b(a, gVar, command, str, builder, aVar), aVar);
        Object a2 = gVar.mo239163a();
        if (a2 == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a2;
    }
}
