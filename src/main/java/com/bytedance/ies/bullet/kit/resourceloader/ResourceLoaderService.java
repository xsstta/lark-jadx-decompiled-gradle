package com.bytedance.ies.bullet.kit.resourceloader;

import android.app.Application;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import bolts.Task;
import com.bytedance.ies.bullet.kit.resourceloader.loader.AssetsLoader;
import com.bytedance.ies.bullet.kit.resourceloader.loader.CDNLoader;
import com.bytedance.ies.bullet.kit.resourceloader.loader.GeckoLoader;
import com.bytedance.ies.bullet.kit.resourceloader.loader.LoaderUtil;
import com.bytedance.ies.bullet.kit.resourceloader.pipeline.ResourceLoaderChain;
import com.bytedance.ies.bullet.service.base.ChannelBundleModel;
import com.bytedance.ies.bullet.service.base.CustomLoaderType;
import com.bytedance.ies.bullet.service.base.ILoggerService;
import com.bytedance.ies.bullet.service.base.IMonitorReportService;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.ISchemaService;
import com.bytedance.ies.bullet.service.base.LoadTask;
import com.bytedance.ies.bullet.service.base.ReportInfo;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.api.ILoggable;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.bytedance.ies.bullet.service.base.api.LoggerWrapper;
import com.bytedance.ies.bullet.service.base.impl.BaseBulletService;
import com.bytedance.ies.bullet.service.base.impl.ServiceCenter;
import com.bytedance.ies.bullet.service.base.resourceloader.config.ExtraInfo;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.ies.bullet.service.base.resourceloader.config.LoaderType;
import com.bytedance.ies.bullet.service.base.resourceloader.config.ResourceLoaderConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u001e\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00140\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0012H\u0016J@\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020#2\u0006\u0010 \u001a\u00020!2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001c0,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u001c0,H\u0016J\u001a\u0010/\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020#2\u0006\u0010 \u001a\u00020!H\u0016J\b\u00100\u001a\u00020\u001cH\u0016J\u0018\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020#2\u0006\u0010 \u001a\u000203H\u0016J \u00104\u001a\u00020\u001c2\u000e\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00142\u0006\u00106\u001a\u000207H\u0016J \u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020#H\u0002J\u0018\u0010<\u001a\u00020\u001c2\u0006\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020!H\u0002J\u0010\u0010=\u001a\u00020\u001c2\u0006\u00102\u001a\u00020#H\u0016J \u0010>\u001a\u00020\u001c2\u000e\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00142\u0006\u00106\u001a\u000207H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8VX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00140\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00140\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceLoaderService;", "Lcom/bytedance/ies/bullet/service/base/impl/BaseBulletService;", "Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "defaultSequence", "", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/LoaderType;", "hasInit", "", "loggerWrapper", "Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "getLoggerWrapper", "()Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "loggerWrapper$delegate", "Lkotlin/Lazy;", "mConfig", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ResourceLoaderConfig;", "priorityHighLoader", "Ljava/lang/Class;", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/IXResourceLoader;", "priorityLowLoader", "taskMap", "", "Lcom/bytedance/ies/bullet/service/base/LoadTask;", "Lcom/bytedance/ies/bullet/kit/resourceloader/pipeline/ResourceLoaderChain;", "cancel", "", "task", "createLoaders", "", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "dealPrefix", "", "str", "deleteResource", "info", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "init", "loadAsync", "uri", "resolve", "Lkotlin/Function1;", "reject", "", "loadSync", "onUnRegister", "registerConfig", "ak", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/GeckoConfig;", "registerCustomLoader", "clazz", ShareHitPoint.f121869d, "Lcom/bytedance/ies/bullet/service/base/CustomLoaderType;", "reportFailed", "resInfo", "taskConfig", "errorMessage", "reportSuccess", "unRegisterConfig", "unregisterCustomLoader", "Companion", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.f */
public class ResourceLoaderService extends BaseBulletService implements IResourceLoaderService {

    /* renamed from: b */
    public static final Companion f37789b = new Companion(null);

    /* renamed from: a */
    public final Map<LoadTask, ResourceLoaderChain> f37790a = new LinkedHashMap();

    /* renamed from: f */
    private final List<Class<? extends IXResourceLoader>> f37791f = new ArrayList();

    /* renamed from: g */
    private final List<Class<? extends IXResourceLoader>> f37792g = new ArrayList();

    /* renamed from: h */
    private ResourceLoaderConfig f37793h;

    /* renamed from: i */
    private boolean f37794i;

    /* renamed from: j */
    private final List<LoaderType> f37795j = CollectionsKt.mutableListOf(LoaderType.GECKO, LoaderType.BUILTIN, LoaderType.CDN);

    /* renamed from: k */
    private final Lazy f37796k = LazyKt.lazy(new C14399f(this));

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void deleteResource(ResourceInfo mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "info");
    }

    @Override // com.bytedance.ies.bullet.service.base.impl.BaseBulletService, com.bytedance.ies.bullet.service.base.api.ILoggable
    public LoggerWrapper getLoggerWrapper() {
        return (LoggerWrapper) this.f37796k.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceLoaderService$Companion;", "", "()V", "TAG", "", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.f$g */
    public static final class CallableC14400g<V> implements Callable<Unit> {

        /* renamed from: a */
        final /* synthetic */ ResourceLoaderService f37797a;

        /* renamed from: b */
        final /* synthetic */ ResourceInfo f37798b;

        /* renamed from: c */
        final /* synthetic */ TaskConfig f37799c;

        /* renamed from: d */
        final /* synthetic */ String f37800d;

        CallableC14400g(ResourceLoaderService fVar, ResourceInfo mVar, TaskConfig jVar, String str) {
            this.f37797a = fVar;
            this.f37798b = mVar;
            this.f37799c = jVar;
            this.f37800d = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public /* synthetic */ Unit call() {
            mo52595a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo52595a() {
            IMonitorReportService eVar;
            Object obj;
            StatisticFilter.f37809a.mo52602a(this.f37798b, this.f37799c);
            if (this.f37798b.mo52709g() && (eVar = (IMonitorReportService) this.f37797a.mo52629a(IMonitorReportService.class)) != null) {
                ReportInfo lVar = new ReportInfo("bdx_resourceloader_fetch", null, null, null, null, null, null, null, 254, null);
                try {
                    Result.Companion aVar = Result.Companion;
                    obj = Result.m271569constructorimpl(this.f37798b.mo52702b().getQueryParameter("surl"));
                } catch (Throwable th) {
                    Result.Companion aVar2 = Result.Companion;
                    obj = Result.m271569constructorimpl(C69097g.m265890a(th));
                }
                if (Result.m271575isFailureimpl(obj)) {
                    obj = null;
                }
                String str = (String) obj;
                if (str == null) {
                    str = this.f37798b.mo52702b().toString();
                }
                lVar.mo52680a(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("res_url", this.f37798b.mo52702b().toString());
                jSONObject.put("res_state", "fail");
                jSONObject.put("res_message", this.f37800d);
                lVar.mo52681a(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("res_duration", SystemClock.uptimeMillis() - this.f37798b.mo52713k());
                lVar.mo52683b(jSONObject2);
                lVar.mo52679a((Boolean) true);
                eVar.mo52612a(lVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.f$h */
    public static final class CallableC14401h<V> implements Callable<Unit> {

        /* renamed from: a */
        final /* synthetic */ ResourceLoaderService f37801a;

        /* renamed from: b */
        final /* synthetic */ ResourceInfo f37802b;

        /* renamed from: c */
        final /* synthetic */ TaskConfig f37803c;

        CallableC14401h(ResourceLoaderService fVar, ResourceInfo mVar, TaskConfig jVar) {
            this.f37801a = fVar;
            this.f37802b = mVar;
            this.f37803c = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public /* synthetic */ Unit call() {
            mo52597a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo52597a() {
            IMonitorReportService eVar;
            Object obj;
            StatisticFilter.f37809a.mo52602a(this.f37802b, this.f37803c);
            if (this.f37802b.mo52709g() && (eVar = (IMonitorReportService) this.f37801a.mo52629a(IMonitorReportService.class)) != null) {
                ReportInfo lVar = new ReportInfo("bdx_resourceloader_fetch", null, null, null, null, null, null, null, 254, null);
                try {
                    Result.Companion aVar = Result.Companion;
                    obj = Result.m271569constructorimpl(this.f37802b.mo52702b().getQueryParameter("surl"));
                } catch (Throwable th) {
                    Result.Companion aVar2 = Result.Companion;
                    obj = Result.m271569constructorimpl(C69097g.m265890a(th));
                }
                if (Result.m271575isFailureimpl(obj)) {
                    obj = null;
                }
                String str = (String) obj;
                if (str == null) {
                    str = this.f37802b.mo52702b().toString();
                }
                lVar.mo52680a(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("res_url", this.f37802b.mo52702b().toString());
                jSONObject.put("res_from", this.f37802b.mo52694a());
                jSONObject.put("res_version", this.f37802b.mo52708f());
                jSONObject.put("res_state", "success");
                jSONObject.put("res_message", this.f37802b.mo52712j());
                lVar.mo52681a(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("res_duration", SystemClock.uptimeMillis() - this.f37802b.mo52713k());
                lVar.mo52683b(jSONObject2);
                lVar.mo52679a((Boolean) true);
                eVar.mo52612a(lVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.f$f */
    static final class C14399f extends Lambda implements Function0<LoggerWrapper> {
        final /* synthetic */ ResourceLoaderService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14399f(ResourceLoaderService fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoggerWrapper invoke() {
            return new LoggerWrapper((ILoggerService) ServiceCenter.f37850b.mo52643a().mo52635a(this.this$0.mo52631c(), ILoggerService.class), "res-Service");
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.impl.BaseBulletService, com.bytedance.ies.bullet.service.base.api.IBulletService
    /* renamed from: a */
    public void mo52581a() {
        ResLoaderConfigManager.f37779a.mo52569a().mo52568b(this);
        Map<LoadTask, ResourceLoaderChain> map = this.f37790a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<LoadTask, ResourceLoaderChain> entry : map.entrySet()) {
            entry.getValue().mo52552b();
            arrayList.add(Unit.INSTANCE);
        }
        this.f37790a.clear();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceInfoWrapper;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.f$b */
    public static final class C14395b extends Lambda implements Function1<ResourceInfoWrapper, Unit> {
        final /* synthetic */ TaskConfig $config;
        final /* synthetic */ Function1 $resolve;
        final /* synthetic */ LoadTask $task;
        final /* synthetic */ ResourceLoaderService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14395b(ResourceLoaderService fVar, LoadTask jVar, Function1 function1, TaskConfig jVar2) {
            super(1);
            this.this$0 = fVar;
            this.$task = jVar;
            this.$resolve = function1;
            this.$config = jVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ResourceInfoWrapper eVar) {
            invoke(eVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ResourceInfoWrapper eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "it");
            this.this$0.f37790a.remove(this.$task);
            this.$resolve.invoke(eVar.mo52579b());
            this.this$0.mo52582a(eVar.mo52579b(), this.$config);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.f$c */
    public static final class C14396c extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ TaskConfig $config;
        final /* synthetic */ Function1 $reject;
        final /* synthetic */ ResourceInfo $resInfo;
        final /* synthetic */ LoadTask $task;
        final /* synthetic */ ResourceLoaderService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14396c(ResourceLoaderService fVar, LoadTask jVar, Function1 function1, ResourceInfo mVar, TaskConfig jVar2) {
            super(1);
            this.this$0 = fVar;
            this.$task = jVar;
            this.$reject = function1;
            this.$resInfo = mVar;
            this.$config = jVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            this.this$0.f37790a.remove(this.$task);
            this.$reject.invoke(th);
            ResourceLoaderService fVar = this.this$0;
            ResourceInfo mVar = this.$resInfo;
            TaskConfig jVar = this.$config;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.mo52583a(mVar, jVar, message);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceInfoWrapper;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.f$d */
    public static final class C14397d extends Lambda implements Function1<ResourceInfoWrapper, Unit> {
        final /* synthetic */ TaskConfig $config;
        final /* synthetic */ Ref.ObjectRef $info;
        final /* synthetic */ ResourceLoaderService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14397d(ResourceLoaderService fVar, TaskConfig jVar, Ref.ObjectRef objectRef) {
            super(1);
            this.this$0 = fVar;
            this.$config = jVar;
            this.$info = objectRef;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ResourceInfoWrapper eVar) {
            invoke(eVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ResourceInfoWrapper eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "it");
            this.this$0.mo52582a(eVar.mo52579b(), this.$config);
            this.$info.element = (T) eVar.mo52579b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.f$e */
    public static final class C14398e extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ TaskConfig $config;
        final /* synthetic */ ResourceInfo $resInfo;
        final /* synthetic */ String $uri;
        final /* synthetic */ ResourceLoaderService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14398e(ResourceLoaderService fVar, String str, ResourceInfo mVar, TaskConfig jVar) {
            super(1);
            this.this$0 = fVar;
            this.$uri = str;
            this.$resInfo = mVar;
            this.$config = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            Log.d("ResourceLoaderService", "loadSync: reject uri =" + this.$uri);
            ResourceLoaderService fVar = this.this$0;
            ResourceInfo mVar = this.$resInfo;
            TaskConfig jVar = this.$config;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.mo52583a(mVar, jVar, message);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void cancel(LoadTask jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "task");
        ResourceLoaderChain aVar = this.f37790a.get(jVar);
        if (aVar != null) {
            aVar.mo52552b();
        }
        this.f37790a.remove(jVar);
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void unRegisterConfig(String str) {
        Intrinsics.checkParameterIsNotNull(str, "ak");
        ResourceLoaderConfig iVar = this.f37793h;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfig");
        }
        iVar.mo52743h().remove(str);
    }

    /* renamed from: b */
    private final String m57923b(String str) {
        if (StringsKt.lastIndexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null) != str.length() - 1) {
            return str;
        }
        int length = str.length() - 1;
        if (str != null) {
            String substring = str.substring(0, length);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public ResourceLoaderService(Application application) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        ResLoaderConfigManager.f37779a.mo52569a().mo52566a(application);
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void init(ResourceLoaderConfig iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "config");
        if (this.f37794i) {
            ILoggable.C14411b.m58025a(this, "init# service is already init", null, null, 6, null);
            return;
        }
        ILoggable.C14411b.m58025a(this, "init globalConfig = " + iVar, null, null, 6, null);
        this.f37794i = true;
        ResLoaderConfigManager.f37779a.mo52569a().mo52567a(this, iVar);
        this.f37793h = iVar;
        registerConfig(iVar.mo52742g().mo52730d(), iVar.mo52742g());
    }

    /* renamed from: a */
    private final List<Class<? extends IXResourceLoader>> m57922a(TaskConfig jVar) {
        ArrayList arrayList = new ArrayList();
        List<Class<? extends IXResourceLoader>> b = jVar.mo52748a().mo52721b();
        if (b != null) {
            arrayList.addAll(b);
        }
        arrayList.addAll(this.f37791f);
        if (jVar.mo52748a().mo52719a().isEmpty() && !jVar.mo52748a().mo52724e()) {
            jVar.mo52748a().mo52720a(this.f37795j);
        }
        for (LoaderType loaderType : jVar.mo52748a().mo52719a()) {
            int i = C14402g.f37806c[loaderType.ordinal()];
            if (i == 1) {
                arrayList.add(GeckoLoader.class);
            } else if (i == 2) {
                arrayList.add(AssetsLoader.class);
            } else if (i == 3) {
                arrayList.add(CDNLoader.class);
            }
        }
        arrayList.addAll(this.f37792g);
        List<Class<? extends IXResourceLoader>> c = jVar.mo52748a().mo52722c();
        if (c != null) {
            arrayList.addAll(c);
        }
        List<Class<? extends IXResourceLoader>> d = jVar.mo52748a().mo52723d();
        if (d != null) {
            arrayList.removeAll(d);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo52582a(ResourceInfo mVar, TaskConfig jVar) {
        ILoggable.C14411b.m58025a(this, "reportSuccess " + LoaderUtil.f37766a.mo52544a(mVar.mo52702b()), null, null, 6, null);
        Task.call(new CallableC14401h(this, mVar, jVar), Task.BACKGROUND_EXECUTOR);
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void registerCustomLoader(Class<? extends IXResourceLoader> cls, CustomLoaderType customLoaderType) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(customLoaderType, ShareHitPoint.f121869d);
        int i = C14402g.f37804a[customLoaderType.ordinal()];
        if (i != 1) {
            if (i == 2 && !this.f37791f.contains(cls)) {
                this.f37792g.add(cls);
            }
        } else if (!this.f37791f.contains(cls)) {
            this.f37791f.add(cls);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void unregisterCustomLoader(Class<? extends IXResourceLoader> cls, CustomLoaderType customLoaderType) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(customLoaderType, ShareHitPoint.f121869d);
        int i = C14402g.f37805b[customLoaderType.ordinal()];
        if (i == 1) {
            this.f37791f.remove(cls);
        } else if (i == 2) {
            this.f37792g.remove(cls);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void registerConfig(String str, GeckoConfig cVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "ak");
        Intrinsics.checkParameterIsNotNull(cVar, "config");
        cVar.mo52732f().mo52571a(this);
        ResourceLoaderConfig iVar = this.f37793h;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfig");
        }
        iVar.mo52743h().put(str, cVar);
        if (cVar.mo52729c() == null) {
            if (cVar.mo52728b().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ResourceLoaderConfig iVar2 = this.f37793h;
                if (iVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                }
                cVar.mo52726a(iVar2.mo52745j());
                return;
            }
            ResourceLoaderConfig iVar3 = this.f37793h;
            if (iVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
            }
            cVar.mo52726a(iVar3.mo52746k());
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public ResourceInfo loadSync(String str, TaskConfig jVar) {
        boolean z;
        boolean z2;
        String str2;
        ExtraInfo bVar;
        String a;
        String str3;
        boolean z3;
        Intrinsics.checkParameterIsNotNull(str, "uri");
        Intrinsics.checkParameterIsNotNull(jVar, "config");
        long uptimeMillis = SystemClock.uptimeMillis();
        ILoggable.C14411b.m58025a(this, "loadSync# url=" + str + ",taskConfig=" + jVar, null, null, 6, null);
        ChannelBundleModel aVar = null;
        if (!this.f37794i) {
            ILoggable.C14411b.m58025a(this, "call loadSync# but not init ", null, null, 6, null);
            return null;
        }
        Uri parse = Uri.parse(str);
        boolean z4 = true;
        if (jVar.mo52767m().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                Result.Companion aVar2 = Result.Companion;
                String queryParameter = parse.getQueryParameter("accessKey");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                str3 = Result.m271569constructorimpl(queryParameter);
            } catch (Throwable th) {
                Result.Companion aVar3 = Result.Companion;
                str3 = Result.m271569constructorimpl(C69097g.m265890a(th));
            }
            ResourceLoaderConfig iVar = this.f37793h;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
            }
            String d = iVar.mo52742g().mo52730d();
            if (Result.m271575isFailureimpl(str3)) {
                str3 = d;
            }
            jVar.mo52758d((String) str3);
            if (jVar.mo52767m().length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                ResourceLoaderConfig iVar2 = this.f37793h;
                if (iVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                }
                jVar.mo52758d(iVar2.mo52742g().mo52730d());
            }
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        ResourceLoaderChain aVar4 = new ResourceLoaderChain(m57922a(jVar), getLoggerWrapper(), this);
        Intrinsics.checkExpressionValueIsNotNull(parse, "srcUri");
        ResourceInfo mVar = new ResourceInfo(parse, null, null, null, false, 0, false, null, null, null, uptimeMillis, 1022, null);
        if (jVar.mo52760f().length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ArrayList arrayList = new ArrayList();
            ResourceLoaderConfig iVar3 = this.f37793h;
            if (iVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
            }
            arrayList.addAll(iVar3.mo52738c());
            ISchemaService iVar4 = (ISchemaService) mo52629a(ISchemaService.class);
            if (iVar4 != null) {
                arrayList.addAll(iVar4.mo52670b().mo52668a());
            } else {
                iVar4 = null;
            }
            IServiceToken l = jVar.mo52766l();
            if (!(l == null || (bVar = (ExtraInfo) mo52630a(l, ExtraInfo.class)) == null || (a = bVar.mo52725a()) == null)) {
                if (a != null) {
                    if (!(!TextUtils.isEmpty(StringsKt.trim((CharSequence) a).toString()))) {
                        a = null;
                    }
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList<String> arrayList3 = arrayList;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (String str4 : arrayList3) {
                arrayList4.add(Boolean.valueOf(arrayList2.add(m57923b(str4))));
            }
            if (iVar4 != null) {
                if (jVar.mo52762h().length() <= 0) {
                    z4 = false;
                }
                if (z4) {
                    str2 = jVar.mo52762h();
                } else {
                    str2 = str;
                }
                aVar = iVar4.mo52669a(str2, arrayList2);
            }
            mVar.mo52698a(aVar);
        }
        ILoggable.C14411b.m58025a(this, "loadSync# start load taskConfig=" + jVar + ",resInfo = " + mVar, null, null, 6, null);
        ResourceInfoWrapper eVar = new ResourceInfoWrapper(mVar, jVar);
        eVar.mo52577a(false);
        aVar4.mo52550a(eVar, new C14397d(this, jVar, objectRef), new C14398e(this, str, mVar, jVar));
        return objectRef.element;
    }

    /* renamed from: a */
    public final void mo52583a(ResourceInfo mVar, TaskConfig jVar, String str) {
        ILoggable.C14411b.m58025a(this, "reportFailed " + mVar.mo52702b().getScheme() + mVar.mo52702b().getAuthority() + mVar.mo52702b().getHost() + mVar.mo52702b().getPath(), null, null, 6, null);
        Task.call(new CallableC14400g(this, mVar, jVar, str), Task.BACKGROUND_EXECUTOR);
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public LoadTask loadAsync(String str, TaskConfig jVar, Function1<? super ResourceInfo, Unit> function1, Function1<? super Throwable, Unit> function12) {
        boolean z;
        boolean z2;
        ExtraInfo bVar;
        String a;
        Object obj;
        boolean z3;
        Object obj2 = "";
        String str2 = str;
        Intrinsics.checkParameterIsNotNull(str2, "uri");
        Intrinsics.checkParameterIsNotNull(jVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "resolve");
        Intrinsics.checkParameterIsNotNull(function12, "reject");
        ILoggable.C14411b.m58025a(this, "loadAsync#begin", null, null, 6, null);
        long uptimeMillis = SystemClock.uptimeMillis();
        Uri parse = Uri.parse(str);
        boolean z4 = false;
        ChannelBundleModel aVar = null;
        LoadTask jVar2 = new LoadTask(parse, 0, null);
        if (!this.f37794i) {
            ILoggable.C14411b.m58025a(this, "call loadAsync# but not init ", null, null, 6, null);
            function12.invoke(new Throwable("resource loader service not init"));
            return jVar2;
        }
        if (jVar.mo52767m().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                Result.Companion aVar2 = Result.Companion;
                Object queryParameter = parse.getQueryParameter("accessKey");
                if (queryParameter == null) {
                    queryParameter = obj2;
                }
                obj = Result.m271569constructorimpl(queryParameter);
            } catch (Throwable th) {
                Result.Companion aVar3 = Result.Companion;
                obj = Result.m271569constructorimpl(C69097g.m265890a(th));
            }
            if (!Result.m271575isFailureimpl(obj)) {
                obj2 = obj;
            }
            jVar.mo52758d((String) obj2);
            if (jVar.mo52767m().length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                ResourceLoaderConfig iVar = this.f37793h;
                if (iVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                }
                jVar.mo52758d(iVar.mo52742g().mo52730d());
            }
        }
        ResourceLoaderChain aVar4 = new ResourceLoaderChain(m57922a(jVar), getLoggerWrapper(), this);
        Intrinsics.checkExpressionValueIsNotNull(parse, "srcUri");
        ResourceInfo mVar = new ResourceInfo(parse, null, null, null, false, 0, false, null, null, null, uptimeMillis, 1022, null);
        if (jVar.mo52760f().length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ArrayList arrayList = new ArrayList();
            ResourceLoaderConfig iVar2 = this.f37793h;
            if (iVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
            }
            arrayList.addAll(iVar2.mo52738c());
            ISchemaService iVar3 = (ISchemaService) mo52629a(ISchemaService.class);
            if (iVar3 != null) {
                arrayList.addAll(iVar3.mo52670b().mo52668a());
            } else {
                iVar3 = null;
            }
            IServiceToken l = jVar.mo52766l();
            if (!(l == null || (bVar = (ExtraInfo) mo52630a(l, ExtraInfo.class)) == null || (a = bVar.mo52725a()) == null)) {
                if (a != null) {
                    if (!(!TextUtils.isEmpty(StringsKt.trim((CharSequence) a).toString()))) {
                        a = null;
                    }
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList<String> arrayList3 = arrayList;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (String str3 : arrayList3) {
                arrayList4.add(Boolean.valueOf(arrayList2.add(m57923b(str3))));
            }
            if (iVar3 != null) {
                if (jVar.mo52762h().length() > 0) {
                    z4 = true;
                }
                if (z4) {
                    str2 = jVar.mo52762h();
                }
                aVar = iVar3.mo52669a(str2, arrayList2);
            }
            mVar.mo52698a(aVar);
        }
        new ResourceInfoWrapper(mVar, jVar).mo52577a(true);
        ILoggable.C14411b.m58025a(this, "loadAsync# start load taskConfig=" + jVar + ",resInfo = " + mVar, null, null, 6, null);
        ResourceInfoWrapper eVar = new ResourceInfoWrapper(mVar, jVar);
        eVar.mo52577a(true);
        aVar4.mo52550a(eVar, new C14395b(this, jVar2, function1, jVar), new C14396c(this, jVar2, function12, mVar, jVar));
        this.f37790a.put(jVar2, aVar4);
        return jVar2;
    }
}
