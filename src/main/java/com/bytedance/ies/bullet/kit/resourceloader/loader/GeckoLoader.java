package com.bytedance.ies.bullet.kit.resourceloader.loader;

import android.net.Uri;
import bolts.Task;
import com.bytedance.ies.bullet.kit.resourceloader.FileMetaInfo;
import com.bytedance.ies.bullet.kit.resourceloader.ResLoaderConfigManager;
import com.bytedance.ies.bullet.kit.resourceloader.ResourceMetaData;
import com.bytedance.ies.bullet.p782a.p783a.C14403i;
import com.bytedance.ies.bullet.service.base.ResourceFrom;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.ResourceType;
import com.bytedance.ies.bullet.service.base.api.ILoggable;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.ies.bullet.service.base.resourceloader.config.OnUpdateListener;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J@\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0016H\u0016JX\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0016H\u0002J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tH\u0016JX\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0016H\u0002¨\u0006\""}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/loader/GeckoLoader;", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/IXResourceLoader;", "()V", "cancelLoad", "", "checkUpdate", "uri", "Landroid/net/Uri;", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "updateListener", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/OnUpdateListener;", "geckoLoadOfflineFile", "Ljava/io/File;", "relativePath", "", "innerLoadFromGeckoFile", "Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceMetaData;", "loadAsync", "input", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "resolve", "Lkotlin/Function1;", "reject", "", "loadGeckoFile", "channel", "bundle", "isCache", "", "loadSync", "pullGeckoPackSync", "dynamic", "Companion", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.a.c */
public class GeckoLoader extends IXResourceLoader {

    /* renamed from: a */
    public static final Companion f37750a = new Companion(null);

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public void cancelLoad() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/loader/GeckoLoader$Companion;", "", "()V", "KEY_DYNAMIC", "", "KEY_ONLY_LOCAL", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J \u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ies/bullet/kit/resourceloader/loader/GeckoLoader$pullGeckoPackSync$1", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/OnUpdateListener;", "onUpdateFailed", "", "channelList", "", "", "throwable", "", "onUpdateSuccess", "path", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.a.c$e */
    public static final class C14388e implements OnUpdateListener {

        /* renamed from: a */
        final /* synthetic */ GeckoLoader f37755a;

        /* renamed from: b */
        final /* synthetic */ String f37756b;

        /* renamed from: c */
        final /* synthetic */ String f37757c;

        /* renamed from: d */
        final /* synthetic */ String f37758d;

        /* renamed from: e */
        final /* synthetic */ boolean f37759e;

        /* renamed from: f */
        final /* synthetic */ ResourceInfo f37760f;

        /* renamed from: g */
        final /* synthetic */ TaskConfig f37761g;

        /* renamed from: h */
        final /* synthetic */ Function1 f37762h;

        /* renamed from: i */
        final /* synthetic */ Function1 f37763i;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ies.bullet.a.a.a.c$e$a */
        static final class CallableC14389a<V> implements Callable<Unit> {

            /* renamed from: a */
            final /* synthetic */ C14388e f37764a;

            CallableC14389a(C14388e eVar) {
                this.f37764a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ Unit call() {
                mo52538a();
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo52538a() {
                this.f37764a.f37755a.mo52533a(this.f37764a.f37760f, this.f37764a.f37761g, this.f37764a.f37757c, this.f37764a.f37758d, false, this.f37764a.f37762h, this.f37764a.f37763i);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ies.bullet.a.a.a.c$e$b */
        static final class CallableC14390b<V> implements Callable<Unit> {

            /* renamed from: a */
            final /* synthetic */ C14388e f37765a;

            CallableC14390b(C14388e eVar) {
                this.f37765a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ Unit call() {
                mo52540a();
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo52540a() {
                this.f37765a.f37755a.mo52533a(this.f37765a.f37760f, this.f37765a.f37761g, this.f37765a.f37757c, this.f37765a.f37758d, false, this.f37765a.f37762h, this.f37765a.f37763i);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.OnUpdateListener
        /* renamed from: a */
        public void mo52534a(List<String> list, String str) {
            Intrinsics.checkParameterIsNotNull(list, "channelList");
            GeckoLoader cVar = this.f37755a;
            ILoggable.C14411b.m58025a(cVar, "download success with dynamic=" + this.f37756b + " , channel=" + this.f37757c + ",bundle=" + this.f37758d, null, null, 6, null);
            if (this.f37759e) {
                ILoggable.C14411b.m58025a(this.f37755a, "success, skip callbacks when onlyLocal is true", null, null, 6, null);
            } else {
                Task.call(new CallableC14390b(this), Task.UI_THREAD_EXECUTOR);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.OnUpdateListener
        /* renamed from: a */
        public void mo52535a(List<String> list, Throwable th) {
            String str;
            Intrinsics.checkParameterIsNotNull(list, "channelList");
            GeckoLoader cVar = this.f37755a;
            StringBuilder sb = new StringBuilder();
            sb.append("download failed with dynamic=");
            sb.append(this.f37756b);
            sb.append(" ,channel = ");
            sb.append(this.f37757c);
            sb.append(",bundle = ");
            sb.append(this.f37758d);
            sb.append(',');
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            sb.append(str);
            ILoggable.C14411b.m58025a(cVar, sb.toString(), null, null, 6, null);
            if (this.f37759e) {
                ILoggable.C14411b.m58025a(this.f37755a, "failed, skip callbacks when onlyLocal is true", null, null, 6, null);
            } else {
                Task.call(new CallableC14389a(this), Task.UI_THREAD_EXECUTOR);
            }
        }

        C14388e(GeckoLoader cVar, String str, String str2, String str3, boolean z, ResourceInfo mVar, TaskConfig jVar, Function1 function1, Function1 function12) {
            this.f37755a = cVar;
            this.f37756b = str;
            this.f37757c = str2;
            this.f37758d = str3;
            this.f37759e = z;
            this.f37760f = mVar;
            this.f37761g = jVar;
            this.f37762h = function1;
            this.f37763i = function12;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.a.c$c */
    static final class C14386c extends Lambda implements Function1<ResourceInfo, Unit> {
        final /* synthetic */ CountDownLatch $countDownLatch;
        final /* synthetic */ Ref.ObjectRef $result;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14386c(Ref.ObjectRef objectRef, CountDownLatch countDownLatch) {
            super(1);
            this.$result = objectRef;
            this.$countDownLatch = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ResourceInfo mVar) {
            invoke(mVar);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.bullet.service.base.m */
        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(ResourceInfo mVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "it");
            this.$result.element = mVar;
            this.$countDownLatch.countDown();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.a.c$d */
    static final class C14387d extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ CountDownLatch $countDownLatch;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14387d(CountDownLatch countDownLatch) {
            super(1);
            this.$countDownLatch = countDownLatch;
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
            this.$countDownLatch.countDown();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J \u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ies/bullet/kit/resourceloader/loader/GeckoLoader$loadAsync$2", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/OnUpdateListener;", "onUpdateFailed", "", "channelList", "", "", "throwable", "", "onUpdateSuccess", "path", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.a.c$b */
    public static final class C14385b implements OnUpdateListener {

        /* renamed from: a */
        final /* synthetic */ GeckoLoader f37751a;

        /* renamed from: b */
        final /* synthetic */ String f37752b;

        /* renamed from: c */
        final /* synthetic */ String f37753c;

        /* renamed from: d */
        final /* synthetic */ String f37754d;

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.OnUpdateListener
        /* renamed from: a */
        public void mo52534a(List<String> list, String str) {
            Intrinsics.checkParameterIsNotNull(list, "channelList");
            GeckoLoader cVar = this.f37751a;
            ILoggable.C14411b.m58025a(cVar, "download success with dynamic=" + this.f37752b + " , channel=" + this.f37753c + ",bundle=" + this.f37754d, null, null, 6, null);
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.OnUpdateListener
        /* renamed from: a */
        public void mo52535a(List<String> list, Throwable th) {
            String str;
            Intrinsics.checkParameterIsNotNull(list, "channelList");
            GeckoLoader cVar = this.f37751a;
            StringBuilder sb = new StringBuilder();
            sb.append("download failed with dynamic=");
            sb.append(this.f37752b);
            sb.append(" ,channel = ");
            sb.append(this.f37753c);
            sb.append(",bundle = ");
            sb.append(this.f37754d);
            sb.append(",errorMessage=");
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            sb.append(str);
            ILoggable.C14411b.m58025a(cVar, sb.toString(), null, null, 6, null);
        }

        C14385b(GeckoLoader cVar, String str, String str2, String str3) {
            this.f37751a = cVar;
            this.f37752b = str;
            this.f37753c = str2;
            this.f37754d = str3;
        }
    }

    /* renamed from: a */
    private final File m57875a(String str, TaskConfig jVar) {
        boolean z;
        String m = jVar.mo52767m();
        GeckoConfig a = LoaderUtil.f37766a.mo52542a(ResLoaderConfigManager.f37779a.mo52569a().mo52565a(getService()), jVar.mo52767m());
        String b = a.mo52732f().mo52574b(a.mo52731e(), m, str);
        ILoggable.C14411b.m58025a(this, "using gecko info [accessKey=" + m + ",filePath=" + b + ']', null, null, 6, null);
        String str2 = b;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return new File(b);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public ResourceInfo loadSync(ResourceInfo mVar, TaskConfig jVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "input");
        Intrinsics.checkParameterIsNotNull(jVar, "config");
        ILoggable.C14411b.m58025a(this, "start to loadSync load  channel = " + jVar.mo52760f() + ",bundle = " + jVar.mo52761g() + " from gecko", null, null, 6, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(mVar, jVar, new C14386c(objectRef, countDownLatch), new C14387d(countDownLatch));
        countDownLatch.await(jVar.mo52755c(), TimeUnit.MILLISECONDS);
        return objectRef.element;
    }

    /* renamed from: a */
    private final ResourceMetaData m57874a(Uri uri, TaskConfig jVar) {
        File file;
        try {
            String scheme = uri.getScheme();
            if (scheme == null || scheme.hashCode() != 1303296464 || !scheme.equals("local_file")) {
                throw new FileNotFoundException(uri + " not found");
            }
            String authority = uri.getAuthority();
            if (authority != null) {
                int hashCode = authority.hashCode();
                String str = "";
                if (hashCode != -554435892) {
                    if (hashCode == 1728122231 && authority.equals("absolute")) {
                        String path = uri.getPath();
                        if (path != null) {
                            str = path;
                        }
                        file = new File(str);
                    }
                } else if (authority.equals("relative")) {
                    String path2 = uri.getPath();
                    if (path2 != null) {
                        str = path2;
                    }
                    file = m57875a(str, jVar);
                }
                if (file == null) {
                    return null;
                }
                ResourceMetaData hVar = new ResourceMetaData(uri);
                ILoggable.C14411b.m58025a(this, "load from gecko success", null, null, 6, null);
                FileMetaInfo cVar = new FileMetaInfo(file, null, 2, null);
                cVar.mo52558a(ResourceFrom.GECKO);
                hVar.mo52600a(cVar);
                return hVar;
            }
            throw new FileNotFoundException(uri + " not found");
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final void m57876a(Uri uri, TaskConfig jVar, OnUpdateListener fVar) {
        if (Intrinsics.areEqual(uri.getScheme(), "local_file") && Intrinsics.areEqual(uri.getAuthority(), "relative")) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            boolean z = false;
            String str = null;
            if (path.length() > 1 && StringsKt.startsWith$default(path, "/", false, 2, (Object) null)) {
                z = true;
            }
            if (!z) {
                path = null;
            }
            if (path != null) {
                if (path != null) {
                    str = path.substring(1);
                    Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            if (str == null) {
                fVar.mo52535a(new ArrayList(), new Exception("update failed because channel is null"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            LoaderUtil.f37766a.mo52542a(ResLoaderConfigManager.f37779a.mo52569a().mo52565a(getService()), jVar.mo52767m()).mo52732f().mo52572a(jVar, arrayList, fVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0140  */
    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadAsync(com.bytedance.ies.bullet.service.base.ResourceInfo r18, com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig r19, kotlin.jvm.functions.Function1<? super com.bytedance.ies.bullet.service.base.ResourceInfo, kotlin.Unit> r20, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r21) {
        /*
        // Method dump skipped, instructions count: 584
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.resourceloader.loader.GeckoLoader.loadAsync(com.bytedance.ies.bullet.service.base.m, com.bytedance.ies.bullet.service.base.resourceloader.config.j, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    /* renamed from: a */
    private final void m57877a(ResourceInfo mVar, TaskConfig jVar, String str, String str2, String str3, Function1<? super ResourceInfo, Unit> function1, Function1<? super Throwable, Unit> function12) {
        boolean z;
        if (Intrinsics.areEqual(mVar.mo52702b().getQueryParameter("onlyLocal"), "1") || jVar.mo52759e()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            function12.invoke(new Exception("reject direct as onlyLocal is true"));
        }
        m57876a(C14403i.m57934a(str, null, 2, null), jVar, new C14388e(this, str3, str, str2, z, mVar, jVar, function1, function12));
    }

    /* renamed from: a */
    public final void mo52533a(ResourceInfo mVar, TaskConfig jVar, String str, String str2, boolean z, Function1<? super ResourceInfo, Unit> function1, Function1<? super Throwable, Unit> function12) {
        long j;
        String a = LoaderUtil.f37766a.mo52545a(str, str2);
        FileMetaInfo cVar = null;
        Uri a2 = C14403i.m57934a(a, null, 2, null);
        ResourceMetaData a3 = m57874a(a2, jVar);
        if (a3 != null) {
            cVar = a3.mo52599a();
        }
        if (cVar == null || !cVar.mo52563c().exists()) {
            function12.invoke(new FileNotFoundException("file not find " + a2));
            return;
        }
        mVar.mo52700a(cVar.mo52563c().getAbsolutePath());
        mVar.mo52697a(ResourceType.DISK);
        mVar.mo52696a(ResourceFrom.GECKO);
        Long b = cVar.mo52562b();
        if (b != null) {
            j = b.longValue();
        } else {
            j = 0;
        }
        mVar.mo52695a(j);
        mVar.mo52701a(z);
        function1.invoke(mVar);
    }
}
