package com.bytedance.ies.bullet.kit.resourceloader.pipeline;

import com.bytedance.ies.bullet.kit.resourceloader.ResourceInfoWrapper;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.api.ILoggable;
import com.bytedance.ies.bullet.service.base.api.LogLevel;
import com.bytedance.ies.bullet.service.base.api.LoggerWrapper;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u001a\u001a\u00020\u001bJ6\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001b0 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0 JN\u0010#\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040%2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001b0 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0 H\u0002J8\u0010&\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001b0 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0 H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/pipeline/ResourceLoaderChain;", "Lcom/bytedance/ies/bullet/service/base/api/ILoggable;", "processors", "", "Ljava/lang/Class;", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/IXResourceLoader;", "loggerWrapper", "Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "service", "Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "(Ljava/util/List;Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;)V", "countDown", "Ljava/util/concurrent/CountDownLatch;", "current", "getCurrent", "()Lcom/bytedance/ies/bullet/service/base/resourceloader/config/IXResourceLoader;", "setCurrent", "(Lcom/bytedance/ies/bullet/service/base/resourceloader/config/IXResourceLoader;)V", "hasCanceled", "", "getHasCanceled", "()Z", "setHasCanceled", "(Z)V", "getLoggerWrapper", "()Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "cancel", "", "load", "input", "Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceInfoWrapper;", "resolve", "Lkotlin/Function1;", "reject", "", "loadAsyncInner", "iter", "", "loadSyncImpl", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.b.a */
public final class ResourceLoaderChain implements ILoggable {

    /* renamed from: a */
    private boolean f37769a;

    /* renamed from: b */
    private IXResourceLoader f37770b;

    /* renamed from: d */
    private CountDownLatch f37771d;

    /* renamed from: e */
    private final List<Class<? extends IXResourceLoader>> f37772e;

    /* renamed from: f */
    private final LoggerWrapper f37773f;

    /* renamed from: g */
    private final IResourceLoaderService f37774g;

    /* renamed from: a */
    public final boolean mo52551a() {
        return this.f37769a;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.ILoggable
    public LoggerWrapper getLoggerWrapper() {
        return this.f37773f;
    }

    /* renamed from: b */
    public final void mo52552b() {
        this.f37769a = true;
        CountDownLatch countDownLatch = this.f37771d;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        IXResourceLoader iXResourceLoader = this.f37770b;
        if (iXResourceLoader != null) {
            iXResourceLoader.cancelLoad();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.b.a$a */
    public static final class C14391a extends Lambda implements Function1<ResourceInfo, Unit> {
        final /* synthetic */ Class $clz;
        final /* synthetic */ ResourceInfoWrapper $input;
        final /* synthetic */ Function1 $reject;
        final /* synthetic */ Function1 $resolve;
        final /* synthetic */ ResourceLoaderChain this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14391a(ResourceLoaderChain aVar, Function1 function1, ResourceInfoWrapper eVar, Class cls, Function1 function12) {
            super(1);
            this.this$0 = aVar;
            this.$reject = function1;
            this.$input = eVar;
            this.$clz = cls;
            this.$resolve = function12;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ResourceInfo mVar) {
            invoke(mVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ResourceInfo mVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "it");
            if (this.this$0.mo52551a()) {
                this.$reject.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
                return;
            }
            this.$input.mo52576a(mVar);
            ResourceInfo b = this.$input.mo52579b();
            String simpleName = this.$clz.getSimpleName();
            Intrinsics.checkExpressionValueIsNotNull(simpleName, "clz.simpleName");
            b.mo52703b(simpleName);
            this.$resolve.invoke(this.$input);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.b.a$b */
    public static final class C14392b extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ boolean $hasNext;
        final /* synthetic */ ResourceInfoWrapper $input;
        final /* synthetic */ Iterator $iter;
        final /* synthetic */ Function1 $reject;
        final /* synthetic */ Function1 $resolve;
        final /* synthetic */ ResourceLoaderChain this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14392b(ResourceLoaderChain aVar, Function1 function1, boolean z, ResourceInfoWrapper eVar, Iterator it, Function1 function12) {
            super(1);
            this.this$0 = aVar;
            this.$reject = function1;
            this.$hasNext = z;
            this.$input = eVar;
            this.$iter = it;
            this.$resolve = function12;
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
            if (this.this$0.mo52551a()) {
                this.$reject.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
            } else if (this.$hasNext) {
                this.this$0.mo52549a(this.$input, this.$iter, this.$resolve, this.$reject);
            } else {
                this.$reject.invoke(th);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.api.ILoggable
    public void printReject(Throwable th, String str) {
        Intrinsics.checkParameterIsNotNull(th, "e");
        Intrinsics.checkParameterIsNotNull(str, "extraMsg");
        ILoggable.C14411b.m58026a(this, th, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.lang.Class<? extends com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader>> */
    /* JADX WARN: Multi-variable type inference failed */
    public ResourceLoaderChain(List<? extends Class<? extends IXResourceLoader>> list, LoggerWrapper kVar, IResourceLoaderService iResourceLoaderService) {
        Intrinsics.checkParameterIsNotNull(list, "processors");
        Intrinsics.checkParameterIsNotNull(kVar, "loggerWrapper");
        Intrinsics.checkParameterIsNotNull(iResourceLoaderService, "service");
        this.f37772e = list;
        this.f37773f = kVar;
        this.f37774g = iResourceLoaderService;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.ILoggable
    public void printLog(String str, LogLevel logLevel, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        Intrinsics.checkParameterIsNotNull(logLevel, "logLevel");
        Intrinsics.checkParameterIsNotNull(str2, "subModule");
        ILoggable.C14411b.m58024a(this, str, logLevel, str2);
    }

    /* renamed from: a */
    public final void mo52550a(ResourceInfoWrapper eVar, Function1<? super ResourceInfoWrapper, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(eVar, "input");
        Intrinsics.checkParameterIsNotNull(function1, "resolve");
        Intrinsics.checkParameterIsNotNull(function12, "reject");
        if (eVar.mo52578a()) {
            Iterator<Class<? extends IXResourceLoader>> it = this.f37772e.iterator();
            if (!it.hasNext()) {
                function12.invoke(new Throwable("ResourceLoaderChain# no processor for " + eVar.mo52579b().mo52702b()));
                return;
            }
            mo52549a(eVar, it, function1, function12);
            return;
        }
        m57894b(eVar, function1, function12);
    }

    /* renamed from: b */
    private final void m57894b(ResourceInfoWrapper eVar, Function1<? super ResourceInfoWrapper, Unit> function1, Function1<? super Throwable, Unit> function12) {
        int i = 0;
        for (T t : this.f37772e) {
            try {
                IXResourceLoader iXResourceLoader = (IXResourceLoader) t.newInstance();
                iXResourceLoader.setService(this.f37774g);
                iXResourceLoader.setLoaderLogger(getLoggerWrapper());
                this.f37770b = iXResourceLoader;
                ResourceInfo loadSync = iXResourceLoader.loadSync(eVar.mo52579b(), eVar.mo52580c());
                if (loadSync == null) {
                    Throwable th = new Throwable(Intrinsics.stringPlus(t.getCanonicalName(), " return null"));
                    if (i == this.f37772e.size() - 1) {
                        function12.invoke(th);
                    }
                    ILoggable.C14411b.m58027a(this, th, null, 2, null);
                    if (this.f37769a) {
                        function12.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
                        return;
                    }
                    i++;
                } else {
                    function1.invoke(eVar);
                    eVar.mo52576a(loadSync);
                    ResourceInfo b = eVar.mo52579b();
                    String simpleName = t.getSimpleName();
                    Intrinsics.checkExpressionValueIsNotNull(simpleName, "clz.simpleName");
                    b.mo52703b(simpleName);
                    return;
                }
            } catch (Throwable th2) {
                if (i == this.f37772e.size() - 1) {
                    function12.invoke(th2);
                }
                ILoggable.C14411b.m58025a(this, "ResourceLoaderChain# onException " + th2.getMessage(), null, null, 6, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo52549a(ResourceInfoWrapper eVar, Iterator<? extends Class<? extends IXResourceLoader>> it, Function1<? super ResourceInfoWrapper, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Class cls = (Class) it.next();
        boolean hasNext = it.hasNext();
        IXResourceLoader iXResourceLoader = (IXResourceLoader) cls.newInstance();
        iXResourceLoader.setService(this.f37774g);
        iXResourceLoader.setLoaderLogger(getLoggerWrapper());
        this.f37770b = iXResourceLoader;
        try {
            iXResourceLoader.loadAsync(eVar.mo52579b(), eVar.mo52580c(), new C14391a(this, function12, eVar, cls, function1), new C14392b(this, function12, hasNext, eVar, it, function1));
        } catch (Throwable th) {
            ILoggable.C14411b.m58025a(this, "ResourceLoaderChain# onException " + th.getMessage(), null, null, 6, null);
            if (this.f37769a) {
                function12.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
            } else if (hasNext) {
                mo52549a(eVar, it, function1, function12);
            }
        }
    }
}
