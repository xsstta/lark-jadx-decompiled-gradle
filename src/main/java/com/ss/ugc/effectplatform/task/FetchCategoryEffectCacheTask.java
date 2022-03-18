package com.ss.ugc.effectplatform.task;

import bytekn.foundation.concurrent.clock.DefaultClock;
import bytekn.foundation.io.file.ContentEncoding;
import bytekn.foundation.io.file.FileInputStream;
import bytekn.foundation.io.file.FileManager;
import bytekn.foundation.logger.Logger;
import bytekn.foundation.p054b.C1686c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.bridge.jsonconverter.IJsonConverter;
import com.ss.ugc.effectplatform.cache.ICache;
import com.ss.ugc.effectplatform.listener.IEffectPlatformBaseListener;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse;
import com.ss.ugc.effectplatform.monitor.IMonitorReport;
import com.ss.ugc.effectplatform.p3244e.C65510b;
import com.ss.ugc.effectplatform.util.EffectCacheKeyGenerator;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aBI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0014J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchCategoryEffectCacheTask;", "Lcom/ss/ugc/effectplatform/task/BaseTask;", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "panel", "", "taskFlag", "category", "count", "", "cursor", "sortingPosition", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "(Lcom/ss/ugc/effectplatform/EffectConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V", "execute", "", "mobEvent", "duration", "", "onCancel", "onFail", "exceptionResult", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onSuccess", "categoryPageModel", "Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.g */
public final class FetchCategoryEffectCacheTask extends BaseTask {

    /* renamed from: c */
    public static final Companion f165044c = new Companion(null);

    /* renamed from: a */
    public final EffectConfig f165045a;

    /* renamed from: b */
    public final String f165046b;

    /* renamed from: d */
    private final String f165047d;

    /* renamed from: e */
    private final String f165048e;

    /* renamed from: f */
    private final int f165049f;

    /* renamed from: g */
    private final int f165050g;

    /* renamed from: h */
    private final int f165051h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchCategoryEffectCacheTask$Companion;", "", "()V", "TAG", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.g$b */
    public static final class C65536b extends Lambda implements Function0<Unit> {
        final /* synthetic */ ExceptionResult $exceptionResult;
        final /* synthetic */ FetchCategoryEffectCacheTask this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65536b(FetchCategoryEffectCacheTask gVar, ExceptionResult cVar) {
            super(0);
            this.this$0 = gVar;
            this.$exceptionResult = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IEffectPlatformBaseListener a = this.this$0.f165045a.mo227550J().mo227753a(this.this$0.f165046b);
            if (a != null) {
                a.mo207371a(null, this.$exceptionResult);
            }
            this.this$0.f165045a.mo227550J().mo227755b(this.this$0.f165046b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.g$c */
    public static final class C65537c extends Lambda implements Function0<Unit> {
        final /* synthetic */ CategoryPageModel $categoryPageModel;
        final /* synthetic */ FetchCategoryEffectCacheTask this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65537c(FetchCategoryEffectCacheTask gVar, CategoryPageModel categoryPageModel) {
            super(0);
            this.this$0 = gVar;
            this.$categoryPageModel = categoryPageModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IEffectPlatformBaseListener a = this.this$0.f165045a.mo227550J().mo227753a(this.this$0.f165046b);
            if (a != null) {
                a.mo207370a(this.$categoryPageModel);
            }
            this.this$0.f165045a.mo227550J().mo227755b(this.this$0.f165046b);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseTask
    /* renamed from: f */
    public void mo228248f() {
        FileInputStream bVar;
        long a = DefaultClock.f5722a.mo8623a();
        ICache fVar = (ICache) C1686c.m7468a(this.f165045a.mo227576w());
        CategoryEffectListResponse categoryEffectListResponse = null;
        if (fVar != null) {
            bVar = fVar.mo227687c(EffectCacheKeyGenerator.f165106a.mo228303a(this.f165047d, this.f165048e, this.f165049f, this.f165050g, this.f165051h));
        } else {
            bVar = null;
        }
        if (bVar == null) {
            m256995a(new ExceptionResult(10004));
            return;
        }
        CategoryEffectListResponse categoryEffectListResponse2 = null;
        try {
            String a2 = FileManager.m7583a(FileManager.f5817a, bVar, (ContentEncoding) null, 2, (Object) null);
            IJsonConverter q = this.f165045a.mo227570q();
            if (q != null) {
                categoryEffectListResponse = (CategoryEffectListResponse) q.mo227739a().mo207364a(a2, CategoryEffectListResponse.class);
            }
            FileManager.f5817a.mo8716a(bVar);
            categoryEffectListResponse2 = categoryEffectListResponse;
        } catch (Exception e) {
            Logger.m7508a(Logger.f5760a, "FetchCategoryEffectCacheTask", "Json Parse Exception: " + e, null, 4, null);
            FileManager.f5817a.mo8716a(bVar);
        } catch (Throwable th) {
            FileManager.f5817a.mo8716a(bVar);
            throw th;
        }
        long a3 = DefaultClock.f5722a.mo8623a();
        if (categoryEffectListResponse2 == null || !categoryEffectListResponse2.checkValue()) {
            m256993a(a3 - a);
            m256995a(new ExceptionResult(10004));
            return;
        }
        m256994a(categoryEffectListResponse2.getData());
    }

    /* renamed from: a */
    private final void m256994a(CategoryPageModel categoryPageModel) {
        if (categoryPageModel != null) {
            mo228259a(new C65537c(this, categoryPageModel));
        }
    }

    /* renamed from: a */
    private final void m256995a(ExceptionResult cVar) {
        mo228259a(new C65536b(this, cVar));
    }

    /* renamed from: a */
    private final void m256993a(long j) {
        IMonitorReport a = this.f165045a.mo227572s().mo8625a();
        if (a != null) {
            EffectConfig effectConfig = this.f165045a;
            String str = this.f165047d;
            String str2 = this.f165048e;
            if (str2 == null) {
                str2 = "";
            }
            C65510b.m256822a(a, true, effectConfig, str, str2, MapsKt.mapOf(TuplesKt.to("duration", Long.valueOf(j)), TuplesKt.to("from_cache", "true")), null, 32, null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchCategoryEffectCacheTask(EffectConfig effectConfig, String str, String str2, String str3, int i, int i2, int i3, String str4) {
        super(str2, null, 2, null);
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        Intrinsics.checkParameterIsNotNull(str, "panel");
        Intrinsics.checkParameterIsNotNull(str2, "taskFlag");
        this.f165045a = effectConfig;
        this.f165047d = str;
        this.f165046b = str2;
        this.f165048e = str3;
        this.f165049f = i;
        this.f165050g = i2;
        this.f165051h = i3;
    }
}
