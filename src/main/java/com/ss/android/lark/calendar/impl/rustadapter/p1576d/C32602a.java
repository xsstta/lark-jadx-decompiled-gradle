package com.ss.android.lark.calendar.impl.rustadapter.p1576d;

import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0005\u001a\u0002H\u0002¢\u0006\u0002\u0010\b\u001a\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a?\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a?\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0012\u001a\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0017\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"sdkError", "Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "T", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "t", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;Ljava/lang/Object;)Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "sdkSuccess", "(Ljava/lang/Object;)Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "simpleBooleanParser", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "", "result", "asyncCoroutine", "Lcom/bytedance/lark/pb/basic/v1/Command;", "builder", "Lcom/squareup/wire/Message$Builder;", "adapter", "Lcom/squareup/wire/ProtoAdapter;", "(Lcom/bytedance/lark/pb/basic/v1/Command;Lcom/squareup/wire/Message$Builder;Lcom/squareup/wire/ProtoAdapter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parser", "(Lcom/bytedance/lark/pb/basic/v1/Command;Lcom/squareup/wire/Message$Builder;Lcom/ss/android/lark/sdk/SdkSender$IParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdkCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lkotlin/coroutines/Continuation;", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.d.a */
public final class C32602a {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.d.a$c */
    public static final class C32605c<T> implements SdkSender.IParser<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f83558a;

        C32605c(boolean z) {
            this.f83558a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Boolean parse(byte[] bArr) {
            return Boolean.valueOf(mo119078a(bArr));
        }

        /* renamed from: a */
        public final boolean mo119078a(byte[] bArr) {
            return this.f83558a;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse", "([B)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.d.a$a */
    public static final class C32603a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ ProtoAdapter f83556a;

        C32603a(ProtoAdapter protoAdapter) {
            this.f83556a = protoAdapter;
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public final T parse(byte[] bArr) {
            return (T) this.f83556a.decode(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/rustadapter/utils/SdkResultUtilsKt$sdkCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.d.a$b */
    public static final class C32604b implements IGetDataCallback<T> {

        /* renamed from: a */
        final /* synthetic */ Continuation f83557a;

        C32604b(Continuation<? super SdkSender.C53233d<T>> cVar) {
            this.f83557a = cVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(T t) {
            Continuation cVar = this.f83557a;
            SdkSender.C53233d a = C32602a.m124911a((Object) t);
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(a));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Continuation cVar = this.f83557a;
            SdkSender.C53233d a = C32602a.m124910a(errorResult, (Object) null, 2, (Object) null);
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(a));
        }
    }

    /* renamed from: a */
    public static final SdkSender.IParser<Boolean> m124907a(boolean z) {
        return new C32605c(z);
    }

    /* renamed from: a */
    public static final <T> IGetDataCallback<T> m124905a(Continuation<? super SdkSender.C53233d<T>> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$sdkCallback");
        return new C32604b(cVar);
    }

    /* renamed from: a */
    public static final <T> SdkSender.IParser<T> m124906a(ProtoAdapter<T> protoAdapter) {
        Intrinsics.checkParameterIsNotNull(protoAdapter, "$this$parser");
        return new C32603a(protoAdapter);
    }

    /* renamed from: a */
    public static final <T> SdkSender.C53233d<T> m124911a(T t) {
        SdkSender.C53233d<T> dVar = new SdkSender.C53233d<>();
        dVar.f131572a = t;
        return dVar;
    }

    /* renamed from: a */
    public static final <T> SdkSender.C53233d<T> m124909a(ErrorResult errorResult, T t) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        SdkSender.C53233d<T> dVar = new SdkSender.C53233d<>();
        dVar.f131572a = t;
        dVar.f131573b = errorResult;
        return dVar;
    }

    /* renamed from: a */
    public static /* synthetic */ SdkSender.IParser m124908a(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m124907a(z);
    }

    /* renamed from: a */
    public static /* synthetic */ SdkSender.C53233d m124910a(ErrorResult errorResult, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return m124909a(errorResult, obj);
    }

    /* renamed from: a */
    public static final <T> Object m124912a(Command command, Message.Builder<?, ?> builder, ProtoAdapter<T> protoAdapter, Continuation<? super SdkSender.C53233d<T>> cVar) {
        return m124913a(command, builder, m124906a((ProtoAdapter) protoAdapter), cVar);
    }

    /* renamed from: a */
    public static final <T> Object m124913a(Command command, Message.Builder<?, ?> builder, SdkSender.IParser<T> iParser, Continuation<? super SdkSender.C53233d<T>> cVar) {
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        SdkSender.asynSendRequestNonWrap(command, builder, m124905a((Continuation) gVar), iParser);
        Object a = gVar.mo239163a();
        if (a == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a;
    }
}
