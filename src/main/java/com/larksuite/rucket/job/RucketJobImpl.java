package com.larksuite.rucket.job;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.rucket.job.extension.JobItrImpl;
import com.larksuite.rucket.job.extension.RucketJobIterator;
import com.larksuite.rucket.job.impl.DataHolderRucketJob;
import com.larksuite.rucket.job.impl.ErrorHolderRucketJob;
import com.larksuite.rucket.job.impl.FutureRucketJob;
import com.ss.android.lark.sdk.C53241h;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.C69379i;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.cr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 O*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001OB\u0005¢\u0006\u0002\u0010\u0004J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\fH\u0016J\u0011\u0010&\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010$J\b\u0010'\u001a\u00020(H\u0002JB\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010*\u001a\u00020\u000f2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0016ø\u0001\u0000¢\u0006\u0002\u0010,JN\u0010-\u001a\b\u0012\u0004\u0012\u0002H.0\u0002\"\u0004\b\u0001\u0010.2\u0006\u0010*\u001a\u00020\u000f2(\u0010+\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H.0\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0016ø\u0001\u0000¢\u0006\u0002\u0010,J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0019\u00100\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u00101J\u0019\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u00104J\b\u00105\u001a\u00020(H\u0016J\u0015\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000707H\u0002JB\u00108\u001a\b\u0012\u0004\u0012\u0002H90\u0002\"\u0004\b\u0001\u001092\u0006\u0010*\u001a\u00020\u000f2$\u0010+\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H90:j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H9`;H\u0016J\u000e\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J<\u0010=\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u000f2\"\u0010>\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0002ø\u0001\u0000¢\u0006\u0002\u0010?J<\u0010@\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u000f2\"\u0010>\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0002ø\u0001\u0000¢\u0006\u0002\u0010?J\u000e\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\u0011\u0010B\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0011\u0010C\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0011\u0010D\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0010\u0010E\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0002J\u0011\u0010F\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0019\u0010G\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u00101J\u0016\u0010H\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\u0016\u0010I\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\u001b\u0010J\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00018\u0000H@ø\u0001\u0000¢\u0006\u0002\u00104JB\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010*\u001a\u00020\u000f2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0016ø\u0001\u0000¢\u0006\u0002\u0010,J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000MH\u0016J\u0010\u0010N\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R;\u0010\b\u001a,\u0012(\u0012&\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\n0\tX\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R1\u0010\u0012\u001a \b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\nX\u000eø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00070\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R1\u0010 \u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\nX\u000eø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, d2 = {"Lcom/larksuite/rucket/job/RucketJobImpl;", "T", "Lcom/larksuite/rucket/job/RucketJob;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "channel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/larksuite/rucket/job/base/RucketResult;", "consumerQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "errorHandler", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "Lkotlin/jvm/functions/Function2;", "idleConsumers", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastProduceIndex", "", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "next", "pendingErrorBuffer", "", "pendingResultBuffer", "prev", "resolver", "terminalFlag", "Ljava/util/concurrent/atomic/AtomicBoolean;", "awaitGet", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "consumeChannelData", "distributeAnIleConsumer", "", "error", "context", C14002h.f36692e, "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lcom/larksuite/rucket/job/RucketJob;", "flatMap", "V", "get", "handleConsumeError", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleConsumeResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCanceled", "iterator", "Lcom/larksuite/rucket/job/extension/RucketJobIterator;", "map", "D", "Lkotlin/Function1;", "Lcom/larksuite/rucket/job/compat/IMapFunction;", "nextJob", "onDataPrepared", "action", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "onErrorOccurred", "prevJob", "produceAllErrors", "produceAllResults", "produceErrorOnce", "produceNext", "produceResultOnce", "setError", "setNextJob", "setPrevJob", "setResult", "then", "toFlow", "Lkotlinx/coroutines/flow/Flow;", "tryProduceImmediately", "Companion", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.job.b */
public class RucketJobImpl<T> extends RucketJob<T> implements CoroutineScope {

    /* renamed from: g */
    public static final Companion f65004g = new Companion(null);

    /* renamed from: a */
    private Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> f65005a;

    /* renamed from: b */
    private Function2<? super ErrorResult, ? super Continuation<? super Unit>, ? extends Object> f65006b;

    /* renamed from: c */
    private RucketJob<?> f65007c;

    /* renamed from: d */
    public final ConcurrentLinkedQueue<Function2<RucketResult<? extends T>, Continuation<? super Unit>, Object>> f65008d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    public final AtomicInteger f65009e = new AtomicInteger(0);

    /* renamed from: f */
    public final ReentrantLock f65010f = new ReentrantLock();

    /* renamed from: h */
    private RucketJob<?> f65011h;

    /* renamed from: i */
    private ConcurrentLinkedQueue<RucketResult<T>> f65012i = new ConcurrentLinkedQueue<>();

    /* renamed from: j */
    private ConcurrentLinkedQueue<RucketResult> f65013j = new ConcurrentLinkedQueue<>();

    /* renamed from: k */
    private final AtomicBoolean f65014k = new AtomicBoolean(false);

    /* renamed from: l */
    private final Channel<RucketResult<T>> f65015l = C69379i.m266614a(Integer.MAX_VALUE);

    /* renamed from: m */
    private final CoroutineContext f65016m = Dispatchers.m266325c().plus(cr.m266795a(null, 1, null));

    /* renamed from: n */
    private int f65017n;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@"}, d2 = {"consumeChannelData", "", "T", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl", mo239173f = "RucketJobImpl.kt", mo239174i = {0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, mo239175l = {444, 451, 455, 456}, mo239176m = "consumeChannelData", mo239177n = {"this", "this", "result", "consumer", "this", "result", "consumer", "this", "result", "consumer"}, mo239178s = {"L$0", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    /* renamed from: com.larksuite.rucket.job.b$d */
    public static final class C26344d extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RucketJobImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26344d(RucketJobImpl bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo93508f(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, d2 = {"handleConsumeError", "", "T", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl", mo239173f = "RucketJobImpl.kt", mo239174i = {0, 0, 1, 1}, mo239175l = {468, 470}, mo239176m = "handleConsumeError", mo239177n = {"this", "error", "this", "error"}, mo239178s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.larksuite.rucket.job.b$g */
    public static final class C26347g extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RucketJobImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26347g(RucketJobImpl bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo93500b((ErrorResult) null, (Continuation<? super Unit>) this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"handleConsumeResult", "", "T", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl", mo239173f = "RucketJobImpl.kt", mo239174i = {0, 0}, mo239175l = {463}, mo239176m = "handleConsumeResult", mo239177n = {"this", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.larksuite.rucket.job.b$h */
    public static final class C26348h extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RucketJobImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26348h(RucketJobImpl bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo93501b((Object) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@"}, d2 = {"produceAllErrors", "", "T", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl", mo239173f = "RucketJobImpl.kt", mo239174i = {0}, mo239175l = {372}, mo239176m = "produceAllErrors", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.larksuite.rucket.job.b$n */
    public static final class C26356n extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RucketJobImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26356n(RucketJobImpl bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo93505d(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@"}, d2 = {"produceAllResults", "", "T", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl", mo239173f = "RucketJobImpl.kt", mo239174i = {0}, mo239175l = {357}, mo239176m = "produceAllResults", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.larksuite.rucket.job.b$o */
    public static final class C26357o extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RucketJobImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26357o(RucketJobImpl bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo93502b(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@"}, d2 = {"produceErrorOnce", "", "T", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl", mo239173f = "RucketJobImpl.kt", mo239174i = {0, 0}, mo239175l = {381}, mo239176m = "produceErrorOnce", mo239177n = {"this", "it"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.larksuite.rucket.job.b$p */
    public static final class C26358p extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RucketJobImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26358p(RucketJobImpl bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo93506e(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@"}, d2 = {"produceResultOnce", "", "T", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl", mo239173f = "RucketJobImpl.kt", mo239174i = {0, 0}, mo239175l = {366}, mo239176m = "produceResultOnce", mo239177n = {"this", "it"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.larksuite.rucket.job.b$q */
    public static final class C26359q extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RucketJobImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26359q(RucketJobImpl bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo93504c(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, d2 = {"setError", "", "T", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl", mo239173f = "RucketJobImpl.kt", mo239174i = {0, 0, 1, 1}, mo239175l = {335, 348}, mo239176m = "setError$suspendImpl", mo239177n = {"this", "error", "this", "error"}, mo239178s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.larksuite.rucket.job.b$r */
    public static final class C26360r extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RucketJobImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26360r(RucketJobImpl bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RucketJobImpl.m95420a(this.this$0, (ErrorResult) null, (Continuation) this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"setResult", "", "T", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl", mo239173f = "RucketJobImpl.kt", mo239174i = {0, 0, 1, 1, 2, 2}, mo239175l = {302, 313, 325}, mo239176m = "setResult$suspendImpl", mo239177n = {"this", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "this", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "this", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, mo239178s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.larksuite.rucket.job.b$s */
    public static final class C26361s extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RucketJobImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26361s(RucketJobImpl bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RucketJobImpl.m95421a(this.this$0, (Object) null, this);
        }
    }

    @Override // com.larksuite.rucket.job.RucketJob
    /* renamed from: a */
    public Object mo93482a(ErrorResult errorResult, Continuation<? super Unit> cVar) {
        return m95420a((RucketJobImpl) this, errorResult, (Continuation) cVar);
    }

    @Override // com.larksuite.rucket.job.RucketJob
    /* renamed from: a */
    public Object mo93483a(T t, Continuation<? super Unit> cVar) {
        return m95421a((RucketJobImpl) this, (Object) t, (Continuation) cVar);
    }

    @Override // com.larksuite.rucket.job.RucketJob
    /* renamed from: a */
    public Object mo93484a(Continuation<? super RucketResult<? extends T>> cVar) {
        return m95422a(this, cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/rucket/job/RucketJobImpl$Companion;", "", "()V", "TAG", "", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.job.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    public RucketJob<?> mo93509g() {
        return this.f65011h;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f65016m;
    }

    /* renamed from: h */
    public RucketJob<?> mo93510h() {
        return this.f65007c;
    }

    @Override // com.larksuite.rucket.job.RucketJob
    /* renamed from: d */
    public boolean mo93486d() {
        return this.f65014k.get();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.job.b$b */
    public static final class C26342b extends Lambda implements Function0<Unit> {
        final /* synthetic */ CancellableContinuation $cont;
        final /* synthetic */ RucketResult $result;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26342b(CancellableContinuation kVar, RucketResult bVar) {
            super(0);
            this.$cont = kVar;
            this.$result = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            RucketResult bVar = this.$result;
            Result.Companion aVar = Result.Companion;
            this.$cont.resumeWith(Result.m271569constructorimpl(bVar));
        }
    }

    @Override // com.larksuite.rucket.job.RucketJob
    /* renamed from: e */
    public RucketJobIterator<RucketResult<T>> mo93487e() {
        return new JobItrImpl(this);
    }

    /* renamed from: f */
    public final RucketResult<T> mo93507f() {
        RucketResult<T> b = mo93466b();
        if (b != null) {
            return b;
        }
        return mo93466b();
    }

    /* renamed from: b */
    private final RucketResult<T> mo93466b() {
        int i = (this.f65017n + 1) % 2;
        this.f65017n = i;
        if (i % 2 != 0) {
            return this.f65013j.poll();
        }
        return this.f65012i.poll();
    }

    /* renamed from: c */
    private final boolean mo93467c() {
        int i = this.f65009e.get();
        if (i <= 0 || !this.f65009e.compareAndSet(i, i - 1)) {
            return false;
        }
        return true;
    }

    public RucketJobImpl() {
        Job unused = C69553g.m266944a(this, null, null, new C263411(this, null), 3, null);
        this.f65017n = 1;
    }

    @Override // com.larksuite.rucket.job.RucketJob
    /* renamed from: a */
    public void mo93464a() {
        if (this.f65014k.compareAndSet(false, true)) {
            C69364ai.m266267a(this, null, 1, null);
            Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> kVar = null;
            this.f65005a = kVar;
            this.f65006b = kVar;
            this.f65012i.clear();
            this.f65013j.clear();
            this.f65008d.clear();
            this.f65009e.set(0);
            RucketJob<?> g = mo93509g();
            if (g != null) {
                g.mo93464a();
            }
            RucketJob<?> h = mo93510h();
            if (h != null) {
                h.mo93464a();
            }
        }
    }

    @Override // com.larksuite.rucket.job.base.IRucketJobChain
    /* renamed from: b */
    public void mo93488b(RucketJob<?> aVar) {
        this.f65007c = aVar;
    }

    @Override // com.larksuite.rucket.job.base.IRucketJobChain
    /* renamed from: c */
    public void mo93489c(RucketJob<?> aVar) {
        this.f65011h = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lcom/larksuite/rucket/job/impl/DataHolderRucketJob;", "D", "T", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl$map$1", mo239173f = "RucketJobImpl.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.larksuite.rucket.job.b$i */
    static final class C26349i extends SuspendLambda implements Function2<T, Continuation<? super DataHolderRucketJob<D>>, Object> {
        final /* synthetic */ Function1 $h;
        int label;
        private Object p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26349i(Function1 function1, Continuation cVar) {
            super(2, cVar);
            this.$h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C26349i iVar = new C26349i(this.$h, cVar);
            iVar.p$0 = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((C26349i) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                return new DataHolderRucketJob(this.$h.invoke(this.p$0));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl$1", mo239173f = "RucketJobImpl.kt", mo239174i = {0}, mo239175l = {72}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.larksuite.rucket.job.b$1 */
    static final class C263411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ RucketJobImpl this$0;

        {
            this.this$0 = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C263411 r0 = new C263411(this.this$0, cVar);
            r0.p$ = (CoroutineScope) obj;
            return r0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C263411) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                RucketJobImpl bVar = this.this$0;
                this.L$0 = ahVar;
                this.label = 1;
                if (bVar.mo93508f(this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Lcom/larksuite/rucket/job/base/RucketResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl$awaitGet$2$2", mo239173f = "RucketJobImpl.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.larksuite.rucket.job.b$c */
    public static final class C26343c extends SuspendLambda implements Function2<RucketResult<? extends T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ CancellableContinuation $cont;
        int label;
        private RucketResult p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26343c(CancellableContinuation kVar, Continuation cVar) {
            super(2, cVar);
            this.$cont = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C26343c cVar2 = new C26343c(this.$cont, cVar);
            cVar2.p$0 = (RucketResult) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
            return ((C26343c) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                RucketResult bVar = this.p$0;
                Result.Companion aVar = Result.Companion;
                this.$cont.resumeWith(Result.m271569constructorimpl(bVar));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/larksuite/rucket/job/RucketJobImpl$error$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.job.b$e */
    static final class C26345e extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $context$inlined;
        final /* synthetic */ Function2 $h$inlined;
        Object L$0;
        int label;
        private ErrorResult p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26345e(Continuation cVar, CoroutineContext fVar, Function2 kVar) {
            super(2, cVar);
            this.$context$inlined = fVar;
            this.$h$inlined = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C26345e eVar = new C26345e(cVar, this.$context$inlined, this.$h$inlined);
            eVar.p$0 = (ErrorResult) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C26345e) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                ErrorResult errorResult = this.p$0;
                Function2 kVar = this.$h$inlined;
                this.L$0 = errorResult;
                this.label = 1;
                if (kVar.invoke(errorResult, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                ErrorResult errorResult2 = (ErrorResult) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl$onDataPrepared$1", mo239173f = "RucketJobImpl.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.larksuite.rucket.job.b$j */
    public static final class C26350j extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2 $action;
        final /* synthetic */ CoroutineContext $context;
        int label;
        private Object p$0;
        final /* synthetic */ RucketJobImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26350j(RucketJobImpl bVar, CoroutineContext fVar, Function2 kVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$context = fVar;
            this.$action = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C26350j jVar = new C26350j(this.this$0, this.$context, this.$action, cVar);
            jVar.p$0 = obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
            return ((C26350j) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final Object obj2 = this.p$0;
                Job unused = C69553g.m266944a(this.this$0, this.$context, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
                    /* class com.larksuite.rucket.job.RucketJobImpl.C26350j.C263511 */
                    Object L$0;
                    int label;
                    private CoroutineScope p$;
                    final /* synthetic */ C26350j this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                        C263511 r0 = 

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                        @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl$onDataPrepared$2", mo239173f = "RucketJobImpl.kt", mo239174i = {0}, mo239175l = {428}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                        /* renamed from: com.larksuite.rucket.job.b$k */
                        public static final class C26352k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            Object L$0;
                            int label;
                            private CoroutineScope p$;
                            final /* synthetic */ RucketJobImpl this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C26352k(RucketJobImpl bVar, Continuation cVar) {
                                super(2, cVar);
                                this.this$0 = bVar;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                C26352k kVar = new C26352k(this.this$0, cVar);
                                kVar.p$ = (CoroutineScope) obj;
                                return kVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                                return ((C26352k) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object a = C69086a.m265828a();
                                int i = this.label;
                                if (i == 0) {
                                    C69097g.m265891a(obj);
                                    CoroutineScope ahVar = this.p$;
                                    RucketJobImpl bVar = this.this$0;
                                    this.L$0 = ahVar;
                                    this.label = 1;
                                    if (bVar.mo93502b(this) == a) {
                                        return a;
                                    }
                                } else if (i == 1) {
                                    CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                                    C69097g.m265891a(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                        @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl$onErrorOccurred$1", mo239173f = "RucketJobImpl.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
                        /* renamed from: com.larksuite.rucket.job.b$l */
                        public static final class C26353l extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
                            final /* synthetic */ Function2 $action;
                            final /* synthetic */ CoroutineContext $context;
                            int label;
                            private ErrorResult p$0;
                            final /* synthetic */ RucketJobImpl this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C26353l(RucketJobImpl bVar, CoroutineContext fVar, Function2 kVar, Continuation cVar) {
                                super(2, cVar);
                                this.this$0 = bVar;
                                this.$context = fVar;
                                this.$action = kVar;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                C26353l lVar = new C26353l(this.this$0, this.$context, this.$action, cVar);
                                lVar.p$0 = (ErrorResult) obj;
                                return lVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
                                return ((C26353l) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                C69086a.m265828a();
                                if (this.label == 0) {
                                    C69097g.m265891a(obj);
                                    final ErrorResult errorResult = this.p$0;
                                    Job unused = C69553g.m266944a(this.this$0, this.$context, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
                                        /* class com.larksuite.rucket.job.RucketJobImpl.C26353l.C263541 */
                                        Object L$0;
                                        int label;
                                        private CoroutineScope p$;
                                        final /* synthetic */ C26353l this$0;

                                        {
                                            this.this$0 = r1;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                            C263541 r0 = 

                                            /* access modifiers changed from: package-private */
                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                                            @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl$onErrorOccurred$2", mo239173f = "RucketJobImpl.kt", mo239174i = {0}, mo239175l = {440}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                                            /* renamed from: com.larksuite.rucket.job.b$m */
                                            public static final class C26355m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                Object L$0;
                                                int label;
                                                private CoroutineScope p$;
                                                final /* synthetic */ RucketJobImpl this$0;

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C26355m(RucketJobImpl bVar, Continuation cVar) {
                                                    super(2, cVar);
                                                    this.this$0 = bVar;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                                    C26355m mVar = new C26355m(this.this$0, cVar);
                                                    mVar.p$ = (CoroutineScope) obj;
                                                    return mVar;
                                                }

                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                                                    return ((C26355m) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    Object a = C69086a.m265828a();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        C69097g.m265891a(obj);
                                                        CoroutineScope ahVar = this.p$;
                                                        RucketJobImpl bVar = this.this$0;
                                                        this.L$0 = ahVar;
                                                        this.label = 1;
                                                        if (bVar.mo93505d(this) == a) {
                                                            return a;
                                                        }
                                                    } else if (i == 1) {
                                                        CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                                                        C69097g.m265891a(obj);
                                                    } else {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/larksuite/rucket/job/RucketJobImpl$then$1$1"}, mo238835k = 3, mv = {1, 1, 16})
                                            /* renamed from: com.larksuite.rucket.job.b$t */
                                            static final class C26362t extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ CoroutineContext $context$inlined;
                                                final /* synthetic */ Function2 $h$inlined;
                                                Object L$0;
                                                int label;
                                                private Object p$0;

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C26362t(Continuation cVar, CoroutineContext fVar, Function2 kVar) {
                                                    super(2, cVar);
                                                    this.$context$inlined = fVar;
                                                    this.$h$inlined = kVar;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                                    C26362t tVar = new C26362t(cVar, this.$context$inlined, this.$h$inlined);
                                                    tVar.p$0 = obj;
                                                    return tVar;
                                                }

                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
                                                    return ((C26362t) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    Object a = C69086a.m265828a();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        C69097g.m265891a(obj);
                                                        Object obj2 = this.p$0;
                                                        Function2 kVar = this.$h$inlined;
                                                        this.L$0 = obj2;
                                                        this.label = 1;
                                                        if (kVar.invoke(obj2, this) == a) {
                                                            return a;
                                                        }
                                                    } else if (i == 1) {
                                                        C69097g.m265891a(obj);
                                                    } else {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "V", "T", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                                            @DebugMetadata(mo239172c = "com.larksuite.rucket.job.RucketJobImpl$flatMap$1", mo239173f = "RucketJobImpl.kt", mo239174i = {0}, mo239175l = {234}, mo239176m = "invokeSuspend", mo239177n = {Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, mo239178s = {"L$0"})
                                            /* renamed from: com.larksuite.rucket.job.b$f */
                                            public static final class C26346f extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ Function2 $h;
                                                final /* synthetic */ FutureRucketJob $nextJobDelegate;
                                                Object L$0;
                                                int label;
                                                private Object p$0;

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C26346f(Function2 kVar, FutureRucketJob cVar, Continuation cVar2) {
                                                    super(2, cVar2);
                                                    this.$h = kVar;
                                                    this.$nextJobDelegate = cVar;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                                    C26346f fVar = new C26346f(this.$h, this.$nextJobDelegate, cVar);
                                                    fVar.p$0 = obj;
                                                    return fVar;
                                                }

                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
                                                    return ((C26346f) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    ErrorHolderRucketJob bVar;
                                                    Object a = C69086a.m265828a();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        C69097g.m265891a(obj);
                                                        Object obj2 = this.p$0;
                                                        Function2 kVar = this.$h;
                                                        this.L$0 = obj2;
                                                        this.label = 1;
                                                        obj = kVar.invoke(obj2, this);
                                                        if (obj == a) {
                                                            return a;
                                                        }
                                                    } else if (i == 1) {
                                                        try {
                                                            C69097g.m265891a(obj);
                                                        } catch (Exception e) {
                                                            C53241h.m205898b("RucketJob", "flatMap: there is an error occurred in IFlatMapHandler#invoke");
                                                            bVar = new ErrorHolderRucketJob(e);
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    bVar = (RucketJob) obj;
                                                    this.$nextJobDelegate.mo93511a(bVar);
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
                                            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                                            /* renamed from: c */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public final /* synthetic */ java.lang.Object mo93504c(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                                                /*
                                                    r4 = this;
                                                    boolean r0 = r5 instanceof com.larksuite.rucket.job.RucketJobImpl.C26359q
                                                    if (r0 == 0) goto L_0x0014
                                                    r0 = r5
                                                    com.larksuite.rucket.job.b$q r0 = (com.larksuite.rucket.job.RucketJobImpl.C26359q) r0
                                                    int r1 = r0.label
                                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                                    r1 = r1 & r2
                                                    if (r1 == 0) goto L_0x0014
                                                    int r5 = r0.label
                                                    int r5 = r5 - r2
                                                    r0.label = r5
                                                    goto L_0x0019
                                                L_0x0014:
                                                    com.larksuite.rucket.job.b$q r0 = new com.larksuite.rucket.job.b$q
                                                    r0.<init>(r4, r5)
                                                L_0x0019:
                                                    java.lang.Object r5 = r0.result
                                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
                                                    int r2 = r0.label
                                                    r3 = 1
                                                    if (r2 == 0) goto L_0x003a
                                                    if (r2 != r3) goto L_0x0032
                                                    java.lang.Object r1 = r0.L$1
                                                    com.larksuite.rucket.job.a.b r1 = (com.larksuite.rucket.job.base.RucketResult) r1
                                                    java.lang.Object r0 = r0.L$0
                                                    com.larksuite.rucket.job.b r0 = (com.larksuite.rucket.job.RucketJobImpl) r0
                                                    kotlin.C69097g.m265891a(r5)
                                                    goto L_0x0056
                                                L_0x0032:
                                                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                                    r5.<init>(r0)
                                                    throw r5
                                                L_0x003a:
                                                    kotlin.C69097g.m265891a(r5)
                                                    java.util.concurrent.ConcurrentLinkedQueue<com.larksuite.rucket.job.a.b<T>> r5 = r4.f65012i
                                                    java.lang.Object r5 = r5.poll()
                                                    com.larksuite.rucket.job.a.b r5 = (com.larksuite.rucket.job.base.RucketResult) r5
                                                    if (r5 == 0) goto L_0x0056
                                                    kotlinx.coroutines.channels.f<com.larksuite.rucket.job.a.b<T>> r2 = r4.f65015l
                                                    r0.L$0 = r4
                                                    r0.L$1 = r5
                                                    r0.label = r3
                                                    java.lang.Object r5 = r2.mo242817a(r5, r0)
                                                    if (r5 != r1) goto L_0x0056
                                                    return r1
                                                L_0x0056:
                                                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                                                    return r5
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.larksuite.rucket.job.RucketJobImpl.mo93504c(kotlin.coroutines.c):java.lang.Object");
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
                                            /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
                                            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                                            /* renamed from: d */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public final /* synthetic */ java.lang.Object mo93505d(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                                                /*
                                                    r4 = this;
                                                    boolean r0 = r5 instanceof com.larksuite.rucket.job.RucketJobImpl.C26356n
                                                    if (r0 == 0) goto L_0x0014
                                                    r0 = r5
                                                    com.larksuite.rucket.job.b$n r0 = (com.larksuite.rucket.job.RucketJobImpl.C26356n) r0
                                                    int r1 = r0.label
                                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                                    r1 = r1 & r2
                                                    if (r1 == 0) goto L_0x0014
                                                    int r5 = r0.label
                                                    int r5 = r5 - r2
                                                    r0.label = r5
                                                    goto L_0x0019
                                                L_0x0014:
                                                    com.larksuite.rucket.job.b$n r0 = new com.larksuite.rucket.job.b$n
                                                    r0.<init>(r4, r5)
                                                L_0x0019:
                                                    java.lang.Object r5 = r0.result
                                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
                                                    int r2 = r0.label
                                                    r3 = 1
                                                    if (r2 == 0) goto L_0x0036
                                                    if (r2 != r3) goto L_0x002e
                                                    java.lang.Object r2 = r0.L$0
                                                    com.larksuite.rucket.job.b r2 = (com.larksuite.rucket.job.RucketJobImpl) r2
                                                    kotlin.C69097g.m265891a(r5)
                                                    goto L_0x003a
                                                L_0x002e:
                                                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                                    r5.<init>(r0)
                                                    throw r5
                                                L_0x0036:
                                                    kotlin.C69097g.m265891a(r5)
                                                    r2 = r4
                                                L_0x003a:
                                                    java.util.concurrent.ConcurrentLinkedQueue<com.larksuite.rucket.job.a.b> r5 = r2.f65013j
                                                    boolean r5 = r5.isEmpty()
                                                    if (r5 != 0) goto L_0x004d
                                                    r0.L$0 = r2
                                                    r0.label = r3
                                                    java.lang.Object r5 = r2.mo93506e(r0)
                                                    if (r5 != r1) goto L_0x003a
                                                    return r1
                                                L_0x004d:
                                                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                                                    return r5
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.larksuite.rucket.job.RucketJobImpl.mo93505d(kotlin.coroutines.c):java.lang.Object");
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
                                            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                                            /* renamed from: e */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public final /* synthetic */ java.lang.Object mo93506e(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                                                /*
                                                    r4 = this;
                                                    boolean r0 = r5 instanceof com.larksuite.rucket.job.RucketJobImpl.C26358p
                                                    if (r0 == 0) goto L_0x0014
                                                    r0 = r5
                                                    com.larksuite.rucket.job.b$p r0 = (com.larksuite.rucket.job.RucketJobImpl.C26358p) r0
                                                    int r1 = r0.label
                                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                                    r1 = r1 & r2
                                                    if (r1 == 0) goto L_0x0014
                                                    int r5 = r0.label
                                                    int r5 = r5 - r2
                                                    r0.label = r5
                                                    goto L_0x0019
                                                L_0x0014:
                                                    com.larksuite.rucket.job.b$p r0 = new com.larksuite.rucket.job.b$p
                                                    r0.<init>(r4, r5)
                                                L_0x0019:
                                                    java.lang.Object r5 = r0.result
                                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
                                                    int r2 = r0.label
                                                    r3 = 1
                                                    if (r2 == 0) goto L_0x003a
                                                    if (r2 != r3) goto L_0x0032
                                                    java.lang.Object r1 = r0.L$1
                                                    com.larksuite.rucket.job.a.b r1 = (com.larksuite.rucket.job.base.RucketResult) r1
                                                    java.lang.Object r0 = r0.L$0
                                                    com.larksuite.rucket.job.b r0 = (com.larksuite.rucket.job.RucketJobImpl) r0
                                                    kotlin.C69097g.m265891a(r5)
                                                    goto L_0x0056
                                                L_0x0032:
                                                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                                    r5.<init>(r0)
                                                    throw r5
                                                L_0x003a:
                                                    kotlin.C69097g.m265891a(r5)
                                                    java.util.concurrent.ConcurrentLinkedQueue<com.larksuite.rucket.job.a.b> r5 = r4.f65013j
                                                    java.lang.Object r5 = r5.poll()
                                                    com.larksuite.rucket.job.a.b r5 = (com.larksuite.rucket.job.base.RucketResult) r5
                                                    if (r5 == 0) goto L_0x0056
                                                    kotlinx.coroutines.channels.f<com.larksuite.rucket.job.a.b<T>> r2 = r4.f65015l
                                                    r0.L$0 = r4
                                                    r0.L$1 = r5
                                                    r0.label = r3
                                                    java.lang.Object r5 = r2.mo242817a(r5, r0)
                                                    if (r5 != r1) goto L_0x0056
                                                    return r1
                                                L_0x0056:
                                                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                                                    return r5
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.larksuite.rucket.job.RucketJobImpl.mo93506e(kotlin.coroutines.c):java.lang.Object");
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
                                            /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
                                            /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
                                            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
                                            /* renamed from: f */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public final /* synthetic */ java.lang.Object mo93508f(kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
                                                /*
                                                // Method dump skipped, instructions count: 222
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.larksuite.rucket.job.RucketJobImpl.mo93508f(kotlin.coroutines.c):java.lang.Object");
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
                                            /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
                                            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                                            /* renamed from: b */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public final /* synthetic */ java.lang.Object mo93502b(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                                                /*
                                                    r4 = this;
                                                    boolean r0 = r5 instanceof com.larksuite.rucket.job.RucketJobImpl.C26357o
                                                    if (r0 == 0) goto L_0x0014
                                                    r0 = r5
                                                    com.larksuite.rucket.job.b$o r0 = (com.larksuite.rucket.job.RucketJobImpl.C26357o) r0
                                                    int r1 = r0.label
                                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                                    r1 = r1 & r2
                                                    if (r1 == 0) goto L_0x0014
                                                    int r5 = r0.label
                                                    int r5 = r5 - r2
                                                    r0.label = r5
                                                    goto L_0x0019
                                                L_0x0014:
                                                    com.larksuite.rucket.job.b$o r0 = new com.larksuite.rucket.job.b$o
                                                    r0.<init>(r4, r5)
                                                L_0x0019:
                                                    java.lang.Object r5 = r0.result
                                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
                                                    int r2 = r0.label
                                                    r3 = 1
                                                    if (r2 == 0) goto L_0x0036
                                                    if (r2 != r3) goto L_0x002e
                                                    java.lang.Object r2 = r0.L$0
                                                    com.larksuite.rucket.job.b r2 = (com.larksuite.rucket.job.RucketJobImpl) r2
                                                    kotlin.C69097g.m265891a(r5)
                                                    goto L_0x003a
                                                L_0x002e:
                                                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                                    r5.<init>(r0)
                                                    throw r5
                                                L_0x0036:
                                                    kotlin.C69097g.m265891a(r5)
                                                    r2 = r4
                                                L_0x003a:
                                                    java.util.concurrent.ConcurrentLinkedQueue<com.larksuite.rucket.job.a.b<T>> r5 = r2.f65012i
                                                    boolean r5 = r5.isEmpty()
                                                    if (r5 != 0) goto L_0x0050
                                                    r2.mo93467c()
                                                    r0.L$0 = r2
                                                    r0.label = r3
                                                    java.lang.Object r5 = r2.mo93504c(r0)
                                                    if (r5 != r1) goto L_0x003a
                                                    return r1
                                                L_0x0050:
                                                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                                                    return r5
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.larksuite.rucket.job.RucketJobImpl.mo93502b(kotlin.coroutines.c):java.lang.Object");
                                            }

                                            /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: com.larksuite.rucket.job.a<V>, com.larksuite.rucket.job.a<D> */
                                            @Override // com.larksuite.rucket.job.RucketJob
                                            /* renamed from: a */
                                            public <D> RucketJob<D> mo93480a(CoroutineContext fVar, Function1<? super T, ? extends D> function1) {
                                                Intrinsics.checkParameterIsNotNull(fVar, "context");
                                                Intrinsics.checkParameterIsNotNull(function1, C14002h.f36692e);
                                                return (RucketJob<V>) mo93503c(fVar, new C26349i(function1, null));
                                            }

                                            /* renamed from: d */
                                            private final void m95425d(CoroutineContext fVar, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> kVar) {
                                                if (!mo93486d()) {
                                                    this.f65005a = new C26350j(this, fVar, kVar, null);
                                                    Job unused = C69553g.m266944a(this, null, null, new C26352k(this, null), 3, null);
                                                }
                                            }

                                            /* renamed from: e */
                                            private final void m95426e(CoroutineContext fVar, Function2<? super ErrorResult, ? super Continuation<? super Unit>, ? extends Object> kVar) {
                                                if (!mo93486d()) {
                                                    this.f65006b = new C26353l(this, fVar, kVar, null);
                                                    Job unused = C69553g.m266944a(this, null, null, new C26355m(this, null), 3, null);
                                                }
                                            }

                                            @Override // com.larksuite.rucket.job.RucketJob
                                            /* renamed from: a */
                                            public RucketJob<T> mo93481a(CoroutineContext fVar, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> kVar) {
                                                Intrinsics.checkParameterIsNotNull(fVar, "context");
                                                Intrinsics.checkParameterIsNotNull(kVar, C14002h.f36692e);
                                                m95425d(fVar, new C26362t(null, fVar, kVar));
                                                return this;
                                            }

                                            @Override // com.larksuite.rucket.job.RucketJob
                                            /* renamed from: b */
                                            public RucketJob<T> mo93485b(CoroutineContext fVar, Function2<? super ErrorResult, ? super Continuation<? super Unit>, ? extends Object> kVar) {
                                                Intrinsics.checkParameterIsNotNull(fVar, "context");
                                                Intrinsics.checkParameterIsNotNull(kVar, C14002h.f36692e);
                                                m95426e(fVar, new C26345e(null, fVar, kVar));
                                                return this;
                                            }

                                            /* renamed from: c */
                                            public <V> RucketJob<V> mo93503c(CoroutineContext fVar, Function2<? super T, ? super Continuation<? super RucketJob<V>>, ? extends Object> kVar) {
                                                Intrinsics.checkParameterIsNotNull(fVar, "context");
                                                Intrinsics.checkParameterIsNotNull(kVar, C14002h.f36692e);
                                                FutureRucketJob cVar = new FutureRucketJob();
                                                FutureRucketJob cVar2 = cVar;
                                                mo93489c(cVar2);
                                                cVar.mo93488b(this);
                                                m95425d(fVar, new C26346f(kVar, cVar, null));
                                                return cVar2;
                                            }

                                            /* renamed from: a */
                                            static /* synthetic */ Object m95422a(RucketJobImpl bVar, Continuation cVar) {
                                                if (bVar.mo93486d()) {
                                                    return RucketResult.f65001a.mo93491a();
                                                }
                                                CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
                                                lVar.mo243071d();
                                                CancellableContinuationImpl lVar2 = lVar;
                                                C26342b bVar2 = null;
                                                try {
                                                    bVar.f65010f.lock();
                                                    RucketResult<T> f = bVar.mo93507f();
                                                    if (f != null) {
                                                        C53241h.m205899c("RucketJob", "awaitGet: pending result is not null, now return it directly.");
                                                        bVar2 = new C26342b(lVar2, f);
                                                    } else {
                                                        bVar.f65009e.incrementAndGet();
                                                        bVar.f65008d.add(new C26343c(lVar2, null));
                                                        C53241h.m205899c("RucketJob", "awaitGet: pending result is null, now suspend current coroutine.");
                                                    }
                                                    if (bVar2 != null) {
                                                        Unit unit = (Unit) bVar2.invoke();
                                                    }
                                                    Object g = lVar.mo243073g();
                                                    if (g == C69086a.m265828a()) {
                                                        C69091e.m265847c(cVar);
                                                    }
                                                    return g;
                                                } finally {
                                                    bVar.f65010f.unlock();
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
                                            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
                                            /* renamed from: b */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public final /* synthetic */ java.lang.Object mo93500b(com.larksuite.framework.callback.Entity.ErrorResult r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                                                /*
                                                // Method dump skipped, instructions count: 106
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.larksuite.rucket.job.RucketJobImpl.mo93500b(com.larksuite.framework.callback.Entity.ErrorResult, kotlin.coroutines.c):java.lang.Object");
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
                                            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                                            /* renamed from: b */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public final /* synthetic */ java.lang.Object mo93501b(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                                                /*
                                                    r4 = this;
                                                    boolean r0 = r6 instanceof com.larksuite.rucket.job.RucketJobImpl.C26348h
                                                    if (r0 == 0) goto L_0x0014
                                                    r0 = r6
                                                    com.larksuite.rucket.job.b$h r0 = (com.larksuite.rucket.job.RucketJobImpl.C26348h) r0
                                                    int r1 = r0.label
                                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                                    r1 = r1 & r2
                                                    if (r1 == 0) goto L_0x0014
                                                    int r6 = r0.label
                                                    int r6 = r6 - r2
                                                    r0.label = r6
                                                    goto L_0x0019
                                                L_0x0014:
                                                    com.larksuite.rucket.job.b$h r0 = new com.larksuite.rucket.job.b$h
                                                    r0.<init>(r4, r6)
                                                L_0x0019:
                                                    java.lang.Object r6 = r0.result
                                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
                                                    int r2 = r0.label
                                                    r3 = 1
                                                    if (r2 == 0) goto L_0x0038
                                                    if (r2 != r3) goto L_0x0030
                                                    java.lang.Object r5 = r0.L$1
                                                    java.lang.Object r5 = r0.L$0
                                                    com.larksuite.rucket.job.b r5 = (com.larksuite.rucket.job.RucketJobImpl) r5
                                                    kotlin.C69097g.m265891a(r6)
                                                    goto L_0x004c
                                                L_0x0030:
                                                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                                    r5.<init>(r6)
                                                    throw r5
                                                L_0x0038:
                                                    kotlin.C69097g.m265891a(r6)
                                                    kotlin.jvm.functions.k<? super T, ? super kotlin.coroutines.c<? super kotlin.Unit>, ? extends java.lang.Object> r6 = r4.f65005a
                                                    if (r6 == 0) goto L_0x004c
                                                    r0.L$0 = r4
                                                    r0.L$1 = r5
                                                    r0.label = r3
                                                    java.lang.Object r5 = r6.invoke(r5, r0)
                                                    if (r5 != r1) goto L_0x004c
                                                    return r1
                                                L_0x004c:
                                                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                                                    return r5
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.larksuite.rucket.job.RucketJobImpl.mo93501b(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                                            }

                                            /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
                                            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
                                            /* renamed from: a */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            static /* synthetic */ java.lang.Object m95420a(com.larksuite.rucket.job.RucketJobImpl r5, com.larksuite.framework.callback.Entity.ErrorResult r6, kotlin.coroutines.Continuation r7) {
                                                /*
                                                // Method dump skipped, instructions count: 181
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.larksuite.rucket.job.RucketJobImpl.m95420a(com.larksuite.rucket.job.b, com.larksuite.framework.callback.Entity.ErrorResult, kotlin.coroutines.c):java.lang.Object");
                                            }

                                            /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
                                            /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0  */
                                            /* JADX WARNING: Removed duplicated region for block: B:41:0x00b8  */
                                            /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
                                            /* renamed from: a */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            static /* synthetic */ java.lang.Object m95421a(com.larksuite.rucket.job.RucketJobImpl r8, java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                                                /*
                                                // Method dump skipped, instructions count: 210
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.larksuite.rucket.job.RucketJobImpl.m95421a(com.larksuite.rucket.job.b, java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                                            }
                                        }
