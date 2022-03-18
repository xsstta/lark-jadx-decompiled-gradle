package com.ss.ugc.effectplatform.task;

import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.cache.ICache;
import com.ss.ugc.effectplatform.listener.IEffectPlatformBaseListener;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchEffectFromCacheTask;", "Lcom/ss/ugc/effectplatform/task/BaseTask;", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "taskFlag", "", "(Lcom/ss/ugc/effectplatform/EffectConfig;Lcom/ss/ugc/effectplatform/model/Effect;Ljava/lang/String;)V", "execute", "", "onCancel", "onFail", "e", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.h */
public final class FetchEffectFromCacheTask extends BaseTask {

    /* renamed from: a */
    public final EffectConfig f165052a;

    /* renamed from: b */
    public final Effect f165053b;

    /* renamed from: c */
    public final String f165054c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.h$a */
    static final class C65538a extends Lambda implements Function0<Unit> {
        final /* synthetic */ Effect $effect;
        final /* synthetic */ FetchEffectFromCacheTask this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65538a(FetchEffectFromCacheTask hVar, Effect effect) {
            super(0);
            this.this$0 = hVar;
            this.$effect = effect;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IEffectPlatformBaseListener a = this.this$0.f165052a.mo227550J().mo227753a(this.this$0.f165054c);
            if (a != null) {
                a.mo207370a(this.$effect);
            }
            this.this$0.f165052a.mo227550J().mo227755b(this.this$0.f165054c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.h$b */
    public static final class C65539b extends Lambda implements Function0<Unit> {
        final /* synthetic */ ExceptionResult $e;
        final /* synthetic */ FetchEffectFromCacheTask this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65539b(FetchEffectFromCacheTask hVar, ExceptionResult cVar) {
            super(0);
            this.this$0 = hVar;
            this.$e = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IEffectPlatformBaseListener a = this.this$0.f165052a.mo227550J().mo227753a(this.this$0.f165054c);
            if (a != null) {
                a.mo207371a(this.this$0.f165053b, this.$e);
            }
            this.this$0.f165052a.mo227550J().mo227755b(this.this$0.f165054c);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseTask
    /* renamed from: f */
    public void mo228248f() {
        Effect effect;
        if (this.f165053b == null || this.f165052a.mo227576w().mo8625a() == null) {
            m256997a(new ExceptionResult(10003));
        }
        ICache a = this.f165052a.mo227576w().mo8625a();
        if (a != null && (effect = this.f165053b) != null) {
            try {
                if (a.mo227690e(effect.getId())) {
                    mo228259a(new C65538a(this, effect));
                } else {
                    m256997a(new ExceptionResult(10003));
                }
            } catch (Exception e) {
                m256997a(new ExceptionResult(e));
            }
        }
    }

    /* renamed from: a */
    private final void m256997a(ExceptionResult cVar) {
        mo228259a(new C65539b(this, cVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchEffectFromCacheTask(EffectConfig effectConfig, Effect effect, String str) {
        super(str, null, 2, null);
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        Intrinsics.checkParameterIsNotNull(str, "taskFlag");
        this.f165052a = effectConfig;
        this.f165053b = effect;
        this.f165054c = str;
    }
}
