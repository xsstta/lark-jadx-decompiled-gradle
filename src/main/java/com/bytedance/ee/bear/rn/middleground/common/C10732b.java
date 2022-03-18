package com.bytedance.ee.bear.rn.middleground.common;

import com.bytedance.ee.bear.rn.RnSyncManager;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0005¨\u0006\u0006"}, d2 = {"generateRequestId", "", "sendDocRequestFlowableUntilJSBundleReady", "Lio/reactivex/Flowable;", "apply", "Lkotlin/Function0;", "rn-bridge-impl_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.middleground.common.b */
public final class C10732b {
    /* renamed from: a */
    public static final String m44452a() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append('_');
        sb.append((int) (((Random.f173148c.mo239194d() * ((double) 9)) + ((double) 1)) * ((double) 1000)));
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "builder.toString()");
        return sb2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Flowable;"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.common.b$b */
    public static final class C10734b<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ Function0 f28708a;

        C10734b(Function0 function0) {
            this.f28708a = function0;
        }

        /* renamed from: a */
        public final AbstractC68307f<String> apply(Boolean bool) {
            Intrinsics.checkParameterIsNotNull(bool, "it");
            AbstractC68307f<String> fVar = (AbstractC68307f) this.f28708a.invoke();
            if (fVar != null) {
                return fVar;
            }
            return AbstractC68307f.m265083a("empty return");
        }
    }

    /* renamed from: a */
    public static final AbstractC68307f<String> m44451a(Function0<? extends AbstractC68307f<String>> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "apply");
        return AbstractC68307f.m265080a(C10733a.f28707a, BackpressureStrategy.BUFFER).mo238014c(new C10734b(function0));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/FlowableEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.common.b$a */
    public static final class C10733a<T> implements AbstractC68324h<T> {

        /* renamed from: a */
        public static final C10733a f28707a = new C10733a();

        C10733a() {
        }

        @Override // io.reactivex.AbstractC68324h
        public final void subscribe(AbstractC68323g<Boolean> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            if (RnSyncManager.f28587a.mo40391f()) {
                gVar.onNext(true);
                gVar.onComplete();
                return;
            }
            RnSyncManager.f28587a.mo40377a(new UtilsKt$sendDocRequestFlowableUntilJSBundleReady$1$1(gVar));
        }
    }
}
