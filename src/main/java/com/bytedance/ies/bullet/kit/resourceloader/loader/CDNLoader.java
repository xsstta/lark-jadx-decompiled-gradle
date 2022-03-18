package com.bytedance.ies.bullet.kit.resourceloader.loader;

import android.net.Uri;
import bolts.Task;
import com.bytedance.ies.bullet.kit.resourceloader.FileMetaInfo;
import com.bytedance.ies.bullet.kit.resourceloader.ResLoaderConfigManager;
import com.bytedance.ies.bullet.kit.resourceloader.ResourceMetaData;
import com.bytedance.ies.bullet.service.base.ResourceFrom;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.ResourceType;
import com.bytedance.ies.bullet.service.base.api.ILoggable;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.ies.bullet.service.base.resourceloader.config.RLDownLoadInfo;
import com.bytedance.ies.bullet.service.base.resourceloader.config.RLDownloaderListener;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016JH\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u000eH\u0002J@\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JH\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u000eH\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/loader/CDNLoader;", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/IXResourceLoader;", "Lcom/bytedance/ies/bullet/service/base/api/ILoggable;", "()V", "cancelLoad", "", "downloadResourceFile", "sourceUrl", "", "syncCall", "", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "resolve", "Lkotlin/Function1;", "Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceMetaData;", "reject", "", "loadAsync", "input", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "loadFromCDN", "uri", "Landroid/net/Uri;", "loadSync", "Companion", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.a.b */
public final class CDNLoader extends IXResourceLoader implements ILoggable {

    /* renamed from: a */
    public static final Companion f37742a = new Companion(null);

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public void cancelLoad() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/loader/CDNLoader$Companion;", "", "()V", "DIR_NAME", "", "SCHEMA_HTTP", "SCHEMA_HTTPS", "SCHEMA_LYNXVIEW", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/bytedance/ies/bullet/kit/resourceloader/loader/CDNLoader$downloadResourceFile$1", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/RLDownloaderListener;", "onFailed", "", "errorMessage", "", "onSuccess", "infoRL", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/RLDownLoadInfo;", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.a.b$b */
    public static final class C14379b implements RLDownloaderListener {

        /* renamed from: a */
        final /* synthetic */ Function1 f37743a;

        /* renamed from: b */
        final /* synthetic */ String f37744b;

        /* renamed from: c */
        final /* synthetic */ Function1 f37745c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ies.bullet.a.a.a.b$b$a */
        static final class CallableC14380a<V> implements Callable<Unit> {

            /* renamed from: a */
            final /* synthetic */ C14379b f37746a;

            /* renamed from: b */
            final /* synthetic */ String f37747b;

            CallableC14380a(C14379b bVar, String str) {
                this.f37746a = bVar;
                this.f37747b = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ Unit call() {
                mo52526a();
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo52526a() {
                this.f37746a.f37745c.invoke(new Throwable(this.f37747b));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ies.bullet.a.a.a.b$b$b */
        static final class CallableC14381b<V> implements Callable<Unit> {

            /* renamed from: a */
            final /* synthetic */ C14379b f37748a;

            /* renamed from: b */
            final /* synthetic */ RLDownLoadInfo f37749b;

            CallableC14381b(C14379b bVar, RLDownLoadInfo gVar) {
                this.f37748a = bVar;
                this.f37749b = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ Unit call() {
                mo52528a();
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo52528a() {
                Function1 function1 = this.f37748a.f37743a;
                Uri parse = Uri.parse(this.f37748a.f37744b);
                Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(sourceUrl)");
                ResourceMetaData hVar = new ResourceMetaData(parse);
                FileMetaInfo cVar = new FileMetaInfo(new File(this.f37749b.mo52734a()), ResourceFrom.CDN);
                cVar.mo52559a((Long) 0L);
                cVar.mo52558a(ResourceFrom.CDN);
                cVar.mo52560a(this.f37749b.mo52735b());
                hVar.mo52600a(cVar);
                function1.invoke(hVar);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.RLDownloaderListener
        /* renamed from: a */
        public void mo52524a(RLDownLoadInfo gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "infoRL");
            Task.call(new CallableC14381b(this, gVar), Task.UI_THREAD_EXECUTOR);
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.RLDownloaderListener
        /* renamed from: a */
        public void mo52525a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "errorMessage");
            Task.call(new CallableC14380a(this, str), Task.UI_THREAD_EXECUTOR);
        }

        C14379b(Function1 function1, String str, Function1 function12) {
            this.f37743a = function1;
            this.f37744b = str;
            this.f37745c = function12;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceMetaData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.a.b$c */
    static final class C14382c extends Lambda implements Function1<ResourceMetaData, Unit> {
        final /* synthetic */ ResourceInfo $input;
        final /* synthetic */ Function1 $reject;
        final /* synthetic */ Function1 $resolve;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14382c(Function1 function1, ResourceInfo mVar, Function1 function12) {
            super(1);
            this.$resolve = function1;
            this.$input = mVar;
            this.$reject = function12;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ResourceMetaData hVar) {
            invoke(hVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ResourceMetaData hVar) {
            File file;
            Intrinsics.checkParameterIsNotNull(hVar, "it");
            FileMetaInfo a = hVar.mo52599a();
            if (a != null) {
                file = a.mo52563c();
            } else {
                file = null;
            }
            if (file == null || !file.exists()) {
                Function1 function1 = this.$reject;
                function1.invoke(new FileNotFoundException("[cdn] resource not found on url:" + this.$input.mo52702b()));
                return;
            }
            Function1 function12 = this.$resolve;
            ResourceInfo mVar = this.$input;
            mVar.mo52700a(file.getAbsolutePath());
            mVar.mo52697a(ResourceType.DISK);
            mVar.mo52696a(ResourceFrom.CDN);
            mVar.mo52701a(a.mo52561a());
            function12.invoke(mVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceMetaData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.a.b$d */
    static final class C14383d extends Lambda implements Function1<ResourceMetaData, Unit> {
        final /* synthetic */ CountDownLatch $countDown;
        final /* synthetic */ ResourceInfo $input;
        final /* synthetic */ Ref.ObjectRef $result;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14383d(Ref.ObjectRef objectRef, ResourceInfo mVar, CountDownLatch countDownLatch) {
            super(1);
            this.$result = objectRef;
            this.$input = mVar;
            this.$countDown = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ResourceMetaData hVar) {
            invoke(hVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ResourceMetaData hVar) {
            File file;
            Intrinsics.checkParameterIsNotNull(hVar, "it");
            FileMetaInfo a = hVar.mo52599a();
            if (a != null) {
                file = a.mo52563c();
            } else {
                file = null;
            }
            if (file != null && file.exists()) {
                Ref.ObjectRef objectRef = this.$result;
                T t = (T) this.$input;
                t.mo52700a(file.getAbsolutePath());
                t.mo52697a(ResourceType.DISK);
                t.mo52696a(ResourceFrom.CDN);
                t.mo52701a(a.mo52561a());
                objectRef.element = t;
            }
            this.$countDown.countDown();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.a.b$e */
    static final class C14384e extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ CountDownLatch $countDown;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14384e(CountDownLatch countDownLatch) {
            super(1);
            this.$countDown = countDownLatch;
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
            this.$countDown.countDown();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public ResourceInfo loadSync(ResourceInfo mVar, TaskConfig jVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "input");
        Intrinsics.checkParameterIsNotNull(jVar, "config");
        ILoggable.C14411b.m58025a(this, "start to sync load from cdn", null, null, 6, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        m57868a(mVar.mo52702b(), true, jVar, (Function1<? super ResourceMetaData, Unit>) new C14383d(objectRef, mVar, countDownLatch), (Function1<? super Throwable, Unit>) new C14384e(countDownLatch));
        countDownLatch.await(jVar.mo52755c(), TimeUnit.MILLISECONDS);
        return objectRef.element;
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public void loadAsync(ResourceInfo mVar, TaskConfig jVar, Function1<? super ResourceInfo, Unit> function1, Function1<? super Throwable, Unit> function12) {
        boolean z;
        Uri uri;
        Intrinsics.checkParameterIsNotNull(mVar, "input");
        Intrinsics.checkParameterIsNotNull(jVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "resolve");
        Intrinsics.checkParameterIsNotNull(function12, "reject");
        ILoggable.C14411b.m58025a(this, "start to async load from cdn", null, null, 6, null);
        if (jVar.mo52762h().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            uri = mVar.mo52702b();
        } else {
            uri = Uri.parse(jVar.mo52762h());
        }
        Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
        m57868a(uri, false, jVar, (Function1<? super ResourceMetaData, Unit>) new C14382c(function1, mVar, function12), function12);
    }

    /* renamed from: a */
    private final void m57869a(String str, boolean z, TaskConfig jVar, Function1<? super ResourceMetaData, Unit> function1, Function1<? super Throwable, Unit> function12) {
        ResLoaderConfigManager.f37779a.mo52569a().mo52565a(getService()).mo52744i().mo52575a(str, z, jVar, new C14379b(function1, str, function12));
    }

    /* renamed from: a */
    private final void m57868a(Uri uri, boolean z, TaskConfig jVar, Function1<? super ResourceMetaData, Unit> function1, Function1<? super Throwable, Unit> function12) {
        if (!jVar.mo52763i()) {
            function12.invoke(new Throwable("does not use cdn loader,uri=" + uri));
            return;
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            if (hashCode != -1772600516) {
                if (hashCode != 3213448) {
                }
                String uri2 = uri.toString();
                Intrinsics.checkExpressionValueIsNotNull(uri2, "uri.toString()");
                m57869a(uri2, z, jVar, function1, function12);
                return;
            } else if (scheme.equals("lynxview")) {
                String queryParameter = uri.getQueryParameter("surl");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                m57869a(queryParameter, z, jVar, function1, function12);
                return;
            }
        }
        function12.invoke(new IllegalArgumentException("error scheme"));
    }
}
