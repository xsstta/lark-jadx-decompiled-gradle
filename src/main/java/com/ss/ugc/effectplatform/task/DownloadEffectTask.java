package com.ss.ugc.effectplatform.task;

import bytekn.foundation.concurrent.SharedReference;
import bytekn.foundation.concurrent.lock.AtomicBoolean;
import bytekn.foundation.concurrent.lock.Lock;
import bytekn.foundation.logger.Logger;
import bytekn.foundation.p054b.C1686c;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.UseComplexDiff;
import com.ss.ugc.effectplatform.bridge.EffectFetcher;
import com.ss.ugc.effectplatform.bridge.EffectFetcherArguments;
import com.ss.ugc.effectplatform.listener.IEffectPlatformBaseListener;
import com.ss.ugc.effectplatform.listener.IFetchEffectListener;
import com.ss.ugc.effectplatform.model.C65519b;
import com.ss.ugc.effectplatform.model.DownloadEffectExtra;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.monitor.IMonitorReport;
import com.ss.ugc.effectplatform.task.result.EffectTaskResult;
import com.ss.ugc.effectplatform.util.EffectUtils;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0014J\u001a\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0014J\b\u0010\u001d\u001a\u00020\u0014H\u0016R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/ugc/effectplatform/task/DownloadEffectTask;", "Lcom/ss/ugc/effectplatform/task/BaseTask;", "effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "taskFlag", "", "downloadExtra", "Lcom/ss/ugc/effectplatform/model/DownloadEffectExtra;", "(Lcom/ss/ugc/effectplatform/model/Effect;Lcom/ss/ugc/effectplatform/EffectConfig;Ljava/lang/String;Lcom/ss/ugc/effectplatform/model/DownloadEffectExtra;)V", "downLoadUrl", "", "realDownloadTask", "Lbytekn/foundation/concurrent/SharedReference;", "Lcom/ss/ugc/effectplatform/task/SyncTask;", "Lcom/ss/ugc/effectplatform/task/result/EffectTaskResult;", "shouldCreateDownloadTask", "Lbytekn/foundation/concurrent/lock/AtomicBoolean;", "cancel", "", "downloadEffect", "execute", "mobResult", "success", "", "e", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onCancel", "onPreExecute", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.d */
public final class DownloadEffectTask extends BaseTask {

    /* renamed from: d */
    public static final Companion f165021d = new Companion(null);

    /* renamed from: a */
    public final Effect f165022a;

    /* renamed from: b */
    public final EffectConfig f165023b;

    /* renamed from: c */
    public final String f165024c;

    /* renamed from: e */
    private final List<String> f165025e;

    /* renamed from: f */
    private final SharedReference<SyncTask<EffectTaskResult>> f165026f;

    /* renamed from: g */
    private final AtomicBoolean f165027g;

    /* renamed from: h */
    private final DownloadEffectExtra f165028h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/task/DownloadEffectTask$Companion;", "", "()V", "TAG", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseTask
    /* renamed from: f */
    public void mo228248f() {
        if (this.f165027g.mo8629a()) {
            m256969c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J&\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"com/ss/ugc/effectplatform/task/DownloadEffectTask$downloadEffect$3", "Lcom/ss/ugc/effectplatform/task/SyncTaskListener;", "Lcom/ss/ugc/effectplatform/task/result/EffectTaskResult;", "onFailed", "", "syncTask", "Lcom/ss/ugc/effectplatform/task/SyncTask;", "e", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onFinally", "onProgress", "progress", "", "totalSize", "", "onResponse", "response", "onStart", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.d$d */
    public static final class C65528d implements SyncTaskListener<EffectTaskResult> {

        /* renamed from: a */
        final /* synthetic */ DownloadEffectTask f165029a;

        @Override // com.ss.ugc.effectplatform.task.SyncTaskListener
        /* renamed from: b */
        public void mo228256b(SyncTask<EffectTaskResult> mVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.ugc.effectplatform.task.d$d$d */
        static final class C65532d extends Lambda implements Function0<Unit> {
            final /* synthetic */ C65528d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65532d(C65528d dVar) {
                super(0);
                this.this$0 = dVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f165029a.f165023b.mo227549I().mo227808c(this.this$0.f165029a.f165022a);
                IEffectPlatformBaseListener a = this.this$0.f165029a.f165023b.mo227550J().mo227753a(this.this$0.f165029a.f165024c);
                if (!(a instanceof IFetchEffectListener)) {
                    a = null;
                }
                IFetchEffectListener dVar = (IFetchEffectListener) a;
                if (dVar != null) {
                    dVar.mo207367a(this.this$0.f165029a.f165022a);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.ugc.effectplatform.task.d$d$a */
        static final class C65529a extends Lambda implements Function0<Unit> {
            final /* synthetic */ ExceptionResult $e;
            final /* synthetic */ C65528d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65529a(C65528d dVar, ExceptionResult cVar) {
                super(0);
                this.this$0 = dVar;
                this.$e = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f165029a.f165023b.mo227549I().mo227804a(this.this$0.f165029a.f165022a, this.$e);
                IEffectPlatformBaseListener a = this.this$0.f165029a.f165023b.mo227550J().mo227753a(this.this$0.f165029a.f165024c);
                if (!(a instanceof IFetchEffectListener)) {
                    a = null;
                }
                IFetchEffectListener dVar = (IFetchEffectListener) a;
                if (dVar != null) {
                    dVar.mo207371a(this.this$0.f165029a.f165022a, this.$e);
                }
                this.this$0.f165029a.f165023b.mo227550J().mo227755b(this.this$0.f165029a.f165024c);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.ugc.effectplatform.task.d$d$b */
        static final class C65530b extends Lambda implements Function0<Unit> {
            final /* synthetic */ int $progress;
            final /* synthetic */ long $totalSize;
            final /* synthetic */ C65528d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65530b(C65528d dVar, int i, long j) {
                super(0);
                this.this$0 = dVar;
                this.$progress = i;
                this.$totalSize = j;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f165029a.f165023b.mo227549I().mo227802a(this.this$0.f165029a.f165022a, this.$progress, this.$totalSize);
                IEffectPlatformBaseListener a = this.this$0.f165029a.f165023b.mo227550J().mo227753a(this.this$0.f165029a.f165024c);
                if (!(a instanceof IFetchEffectListener)) {
                    a = null;
                }
                IFetchEffectListener dVar = (IFetchEffectListener) a;
                if (dVar != null) {
                    dVar.mo207368a(this.this$0.f165029a.f165022a, this.$progress, this.$totalSize);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.ugc.effectplatform.task.d$d$c */
        public static final class C65531c extends Lambda implements Function0<Unit> {
            final /* synthetic */ EffectTaskResult $response;
            final /* synthetic */ C65528d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65531c(C65528d dVar, EffectTaskResult aVar) {
                super(0);
                this.this$0 = dVar;
                this.$response = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f165029a.f165023b.mo227549I().mo227807b(this.this$0.f165029a.f165022a);
                IEffectPlatformBaseListener a = this.this$0.f165029a.f165023b.mo227550J().mo227753a(this.this$0.f165029a.f165024c);
                if (!(a instanceof IFetchEffectListener)) {
                    a = null;
                }
                IFetchEffectListener dVar = (IFetchEffectListener) a;
                if (dVar != null) {
                    dVar.mo207370a((Object) this.$response.mo228263a());
                }
                this.this$0.f165029a.f165023b.mo227550J().mo227755b(this.this$0.f165029a.f165024c);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C65528d(DownloadEffectTask dVar) {
            this.f165029a = dVar;
        }

        @Override // com.ss.ugc.effectplatform.task.SyncTaskListener
        /* renamed from: a */
        public void mo228251a(SyncTask<EffectTaskResult> mVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
            this.f165029a.mo228259a(new C65532d(this));
        }

        @Override // com.ss.ugc.effectplatform.task.SyncTaskListener
        /* renamed from: a */
        public void mo228253a(SyncTask<EffectTaskResult> mVar, ExceptionResult cVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
            Intrinsics.checkParameterIsNotNull(cVar, "e");
            this.f165029a.mo228267a(false, cVar);
            Logger bVar = Logger.f5760a;
            bVar.mo8662a("DownloadEffectTask", "fetchEffect: " + this.f165029a.f165022a.getName() + " onFailed");
            this.f165029a.mo228259a(new C65529a(this, cVar));
        }

        /* renamed from: a */
        public void mo228255a(SyncTask<EffectTaskResult> mVar, EffectTaskResult aVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
            Intrinsics.checkParameterIsNotNull(aVar, "response");
            this.f165029a.mo228267a(true, null);
            Logger bVar = Logger.f5760a;
            bVar.mo8662a("DownloadEffectTask", "fetchEffect: " + this.f165029a.f165022a.getName() + " onSuccess");
            this.f165029a.mo228259a(new C65531c(this, aVar));
        }

        @Override // com.ss.ugc.effectplatform.task.SyncTaskListener
        /* renamed from: a */
        public void mo228252a(SyncTask<EffectTaskResult> mVar, int i, long j) {
            Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
            this.f165029a.mo228259a(new C65530b(this, i, j));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.d$b */
    public static final class C65526b extends Lambda implements Function0<Unit> {
        final /* synthetic */ DownloadEffectTask this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65526b(DownloadEffectTask dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f165023b.mo227549I().mo227807b(this.this$0.f165022a);
            IEffectPlatformBaseListener a = this.this$0.f165023b.mo227550J().mo227753a(this.this$0.f165024c);
            if (!(a instanceof IFetchEffectListener)) {
                a = null;
            }
            IFetchEffectListener dVar = (IFetchEffectListener) a;
            if (dVar != null) {
                dVar.mo207370a((Object) this.this$0.f165022a);
            }
            this.this$0.f165023b.mo227550J().mo227755b(this.this$0.f165024c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.d$c */
    public static final class C65527c extends Lambda implements Function0<Unit> {
        final /* synthetic */ DownloadEffectTask this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65527c(DownloadEffectTask dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ExceptionResult cVar = new ExceptionResult(10017);
            this.this$0.f165023b.mo227549I().mo227804a(this.this$0.f165022a, cVar);
            IEffectPlatformBaseListener a = this.this$0.f165023b.mo227550J().mo227753a(this.this$0.f165024c);
            if (!(a instanceof IFetchEffectListener)) {
                a = null;
            }
            IFetchEffectListener dVar = (IFetchEffectListener) a;
            if (dVar != null) {
                dVar.mo207371a(this.this$0.f165022a, cVar);
            }
            this.this$0.f165023b.mo227550J().mo227755b(this.this$0.f165024c);
        }
    }

    /* renamed from: c */
    private final void m256969c() {
        SyncTask<EffectTaskResult> mVar;
        if (!UseComplexDiff.f164911a.mo227796a() || !this.f165023b.mo227549I().mo227805a(this.f165022a)) {
            EffectFetcherArguments bVar = new EffectFetcherArguments(this.f165022a, this.f165025e, this.f165023b.mo227562i());
            if (C1686c.m7468a(this.f165023b.mo227575v()) == null) {
                mo228259a(new C65527c(this));
                return;
            }
            SharedReference<SyncTask<EffectTaskResult>> bVar2 = this.f165026f;
            EffectFetcher a = this.f165023b.mo227575v().mo8625a();
            if (a != null) {
                mVar = a.mo227702a(bVar);
            } else {
                mVar = null;
            }
            bVar2.mo8626a(mVar);
            new EffectTaskResult(this.f165022a, null).mo228264a(0).mo228265a(0L);
            SyncTask<EffectTaskResult> a2 = this.f165026f.mo8625a();
            if (a2 != null) {
                a2.mo228289a(new C65528d(this));
            }
            SyncTask<EffectTaskResult> a3 = this.f165026f.mo8625a();
            if (a3 != null) {
                a3.mo228250a();
                return;
            }
            return;
        }
        Logger.f5760a.mo8662a("DownloadEffectTask", "fetchEffect: " + this.f165022a.getEffect_id() + " name: " + this.f165022a.getName() + " already exists!");
        mo228259a(new C65526b(this));
    }

    @Override // com.ss.ugc.effectplatform.task.BaseTask
    /* renamed from: h */
    public void mo228261h() {
        Lock gVar = C65534e.f165032a;
        gVar.mo8634a();
        try {
            if (this.f165023b.mo227549I().mo227806a(C65519b.m256862a(this.f165022a))) {
                Logger bVar = Logger.f5760a;
                bVar.mo8662a("DownloadEffectTask", "effect: " + this.f165022a.getEffect_id() + ", name: " + this.f165022a.getName() + ", " + C65519b.m256862a(this.f165022a) + " is now downloading, add in listener");
                IEffectPlatformBaseListener a = this.f165023b.mo227550J().mo227753a(this.f165024c);
                if (!(a instanceof IFetchEffectListener)) {
                    a = null;
                }
                IFetchEffectListener dVar = (IFetchEffectListener) a;
                if (dVar != null) {
                    dVar.mo207367a(this.f165022a);
                    this.f165023b.mo227549I().mo227803a(this.f165022a, new C65533e(dVar, this));
                }
                this.f165027g.mo8628a(false);
            } else {
                this.f165027g.mo8628a(true);
                this.f165023b.mo227549I().mo227809d(this.f165022a);
                Logger bVar2 = Logger.f5760a;
                bVar2.mo8662a("DownloadEffectTask", "effect: " + this.f165022a.getEffect_id() + ", name: " + this.f165022a.getName() + ", " + C65519b.m256862a(this.f165022a) + " added in download list!");
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            gVar.mo8635b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0011¸\u0006\u0012"}, d2 = {"com/ss/ugc/effectplatform/task/DownloadEffectTask$onPreExecute$1$1$1", "Lcom/ss/ugc/effectplatform/listener/IFetchEffectListener;", "onFail", "", "failedResult", "Lcom/ss/ugc/effectplatform/model/Effect;", ApiHandler.API_CALLBACK_EXCEPTION, "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onProgress", "effect", "progress", "", "contentLength", "", "onStart", "onSuccess", "response", "effectplatform_release", "com/ss/ugc/effectplatform/task/DownloadEffectTask$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.d$e */
    public static final class C65533e implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ IFetchEffectListener f165030a;

        /* renamed from: b */
        final /* synthetic */ DownloadEffectTask f165031b;

        @Override // com.ss.ugc.effectplatform.listener.IFetchEffectListener
        /* renamed from: a */
        public void mo207367a(Effect effect) {
        }

        /* renamed from: b */
        public void mo207370a(Effect effect) {
            this.f165030a.mo207370a((Object) effect);
            this.f165031b.f165023b.mo227550J().mo227755b(this.f165031b.f165024c);
        }

        C65533e(IFetchEffectListener dVar, DownloadEffectTask dVar2) {
            this.f165030a = dVar;
            this.f165031b = dVar2;
        }

        /* renamed from: a */
        public void mo207371a(Effect effect, ExceptionResult cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, ApiHandler.API_CALLBACK_EXCEPTION);
            this.f165030a.mo207371a(effect, cVar);
            this.f165031b.f165023b.mo227550J().mo227755b(this.f165031b.f165024c);
        }

        @Override // com.ss.ugc.effectplatform.listener.IFetchEffectListener
        /* renamed from: a */
        public void mo207368a(Effect effect, int i, long j) {
            this.f165030a.mo207368a(effect, i, j);
        }
    }

    /* renamed from: a */
    public final void mo228267a(boolean z, ExceptionResult cVar) {
        DownloadEffectExtra aVar;
        String b;
        if (!(this.f165023b.mo227572s().mo8625a() == null || (aVar = this.f165028h) == null)) {
            if (Intrinsics.areEqual("beautify", aVar.getPanel()) || Intrinsics.areEqual("beautifynew", this.f165028h.getPanel())) {
                int i = !z ? 1 : 0;
                StringBuilder sb = new StringBuilder();
                List<String> list = this.f165025e;
                if (list != null) {
                    for (String str : list) {
                        sb.append(str);
                        sb.append(",");
                    }
                }
                IMonitorReport a = this.f165023b.mo227572s().mo8625a();
                if (a != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("effect_id", this.f165022a.getEffect_id());
                    hashMap.put("effect_name", this.f165022a.getName());
                    String k = this.f165023b.mo227564k();
                    String str2 = "";
                    if (k == null) {
                        k = str2;
                    }
                    hashMap.put("app_id", k);
                    String b2 = this.f165023b.mo227555b();
                    if (b2 == null) {
                        b2 = str2;
                    }
                    hashMap.put("access_key", b2);
                    hashMap.put("download_urls", sb.toString());
                    String panel = this.f165028h.getPanel();
                    if (panel == null) {
                        panel = str2;
                    }
                    hashMap.put("panel", panel);
                    hashMap.put("error_code", cVar == null ? str2 : str2 + cVar.mo227908a());
                    if (!(cVar == null || (b = cVar.mo227911b()) == null)) {
                        str2 = b;
                    }
                    hashMap.put("error_msg", str2);
                    hashMap.put("effect_platform_type", 1);
                    a.mo227791a("effect_resource_download_success_rate", i, hashMap);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadEffectTask(Effect effect, EffectConfig effectConfig, String str, DownloadEffectExtra aVar) {
        super(str, null, 2, null);
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        Intrinsics.checkParameterIsNotNull(str, "taskFlag");
        this.f165022a = effect;
        this.f165023b = effectConfig;
        this.f165024c = str;
        this.f165028h = aVar;
        this.f165025e = EffectUtils.f165112a.mo228316b(effect.getFile_url());
        this.f165026f = new SharedReference<>(null);
        this.f165027g = new AtomicBoolean(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadEffectTask(Effect effect, EffectConfig effectConfig, String str, DownloadEffectExtra aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(effect, effectConfig, str, (i & 8) != 0 ? null : aVar);
    }
}
