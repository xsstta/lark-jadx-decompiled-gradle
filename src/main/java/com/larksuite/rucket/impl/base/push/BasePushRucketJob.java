package com.larksuite.rucket.impl.base.push;

import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.RucketJobImpl;
import com.squareup.wire.Message;
import com.ss.android.lark.sdk.C53248k;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \u001d*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002j\u0002`\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001\u001dB\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J,\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0010H&J\b\u0010\u001c\u001a\u00020\u0010H&R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/larksuite/rucket/impl/base/push/BasePushRucketJob;", "T", "Lcom/squareup/wire/Message;", "Lcom/larksuite/rucket/impl/base/request/PBMessage;", "Lcom/larksuite/rucket/job/RucketJobImpl;", "Lcom/ss/android/lark/sdk/PushDispatcher$ISdkPushListener;", "Lcom/larksuite/rucket/impl/base/push/IPushDispatcher;", "responseClazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "children", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/larksuite/rucket/job/RucketJob;", "isRegistered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "addPushListener", "", "rucketJob", "cancel", "onPush", "request", "", "sid", "", "fromServerPipe", "", "offlinePush", "registerSelf", "unregisterSelf", "Companion", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.impl.base.a.a */
public abstract class BasePushRucketJob<T extends Message<?, ?>> extends RucketJobImpl<T> implements C53248k.AbstractC53250a {

    /* renamed from: c */
    public static final Companion f64982c = new Companion(null);

    /* renamed from: a */
    public final CopyOnWriteArrayList<RucketJob<T>> f64983a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final Class<T> f64984b;

    /* renamed from: h */
    private AtomicBoolean f64985h = new AtomicBoolean(false);

    /* renamed from: b */
    public abstract void mo93466b();

    /* renamed from: c */
    public abstract void mo93467c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/rucket/impl/base/push/BasePushRucketJob$Companion;", "", "()V", "TAG", "", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.impl.base.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.rucket.job.RucketJobImpl, com.larksuite.rucket.job.RucketJob
    /* renamed from: a */
    public void mo93464a() {
        ArrayList arrayList = new ArrayList();
        for (T t : this.f64983a) {
            if (true ^ t.mo93486d()) {
                arrayList.add(t);
            }
        }
        this.f64983a.clear();
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            this.f64983a.addAll(arrayList2);
        } else if (this.f64985h.compareAndSet(true, false)) {
            mo93466b();
        }
    }

    public BasePushRucketJob(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "responseClazz");
        this.f64984b = cls;
    }

    /* renamed from: a */
    public void mo93465a(RucketJob<T> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "rucketJob");
        if (this.f64985h.compareAndSet(false, true)) {
            mo93467c();
        }
        aVar.mo93488b(this);
        this.f64983a.add(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003j\u0002`\u0004*\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Lcom/squareup/wire/Message;", "Lcom/larksuite/rucket/impl/base/request/PBMessage;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.impl.base.push.BasePushRucketJob$onPush$1", mo239173f = "BasePushRucketJob.kt", mo239174i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, mo239175l = {53, 56}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "pbResponse", "$this$forEach$iv", "element$iv", "it", "$this$launch", "e", "$this$forEach$iv", "element$iv", "it"}, mo239178s = {"L$0", "L$1", "L$2", "L$4", "L$5", "L$0", "L$1", "L$2", "L$4", "L$5"})
    /* renamed from: com.larksuite.rucket.impl.base.a.a$b */
    static final class C26336b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $request;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ BasePushRucketJob this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26336b(BasePushRucketJob aVar, byte[] bArr, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
            this.$request = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C26336b bVar = new C26336b(this.this$0, this.$request, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C26336b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x009a A[Catch:{ Exception -> 0x00b6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0105 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
            // Method dump skipped, instructions count: 264
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.rucket.impl.base.push.BasePushRucketJob.C26336b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
        Job unused = C69553g.m266944a(this, null, null, new C26336b(this, bArr, null), 3, null);
    }
}
