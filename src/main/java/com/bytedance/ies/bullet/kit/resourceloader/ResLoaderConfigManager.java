package com.bytedance.ies.bullet.kit.resourceloader;

import android.app.Application;
import android.util.Log;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.ICdnDownloadDepender;
import com.bytedance.ies.bullet.service.base.resourceloader.config.ILoaderDepender;
import com.bytedance.ies.bullet.service.base.resourceloader.config.OnUpdateListener;
import com.bytedance.ies.bullet.service.base.resourceloader.config.RLDownloaderListener;
import com.bytedance.ies.bullet.service.base.resourceloader.config.ResourceLoaderConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/ResLoaderConfigManager;", "", "()V", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "cfgMap", "", "Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ResourceLoaderConfig;", "placeHolder", "getPlaceHolder", "()Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ResourceLoaderConfig;", "setPlaceHolder", "(Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ResourceLoaderConfig;)V", "getConfig", "service", "register", "", "config", "unRegister", "Companion", "SingletonHolder", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.d */
public final class ResLoaderConfigManager {

    /* renamed from: a */
    public static final Companion f37779a = new Companion(null);

    /* renamed from: b */
    private ResourceLoaderConfig f37780b;

    /* renamed from: c */
    private Map<IResourceLoaderService, ResourceLoaderConfig> f37781c;

    /* renamed from: d */
    private Application f37782d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/ResLoaderConfigManager$Companion;", "", "()V", "getInstance", "Lcom/bytedance/ies/bullet/kit/resourceloader/ResLoaderConfigManager;", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final ResLoaderConfigManager mo52569a() {
            return SingletonHolder.f37783a.mo52570a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/ResLoaderConfigManager$SingletonHolder;", "", "()V", "holder", "Lcom/bytedance/ies/bullet/kit/resourceloader/ResLoaderConfigManager;", "getHolder", "()Lcom/bytedance/ies/bullet/kit/resourceloader/ResLoaderConfigManager;", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.d$b */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f37783a = new SingletonHolder();

        /* renamed from: b */
        private static final ResLoaderConfigManager f37784b = new ResLoaderConfigManager(null);

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final ResLoaderConfigManager mo52570a() {
            return f37784b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J \u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"com/bytedance/ies/bullet/kit/resourceloader/ResLoaderConfigManager$placeHolder$1", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ILoaderDepender;", "service", "Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "getService", "()Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "setService", "(Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;)V", "checkIsExists", "", "rootDir", "", "accessKey", "channel", "checkUpdate", "", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "channelList", "", "listener", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/OnUpdateListener;", "getGeckoOfflineDir", "offlineDir", "relativePath", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.d$c */
    public static final class C14393c implements ILoaderDepender {

        /* renamed from: a */
        private IResourceLoaderService f37785a;

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.ILoaderDepender
        /* renamed from: a */
        public void mo52572a(TaskConfig jVar, List<String> list, OnUpdateListener fVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "config");
            Intrinsics.checkParameterIsNotNull(list, "channelList");
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.ILoaderDepender
        /* renamed from: a */
        public boolean mo52573a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "rootDir");
            Intrinsics.checkParameterIsNotNull(str2, "accessKey");
            Intrinsics.checkParameterIsNotNull(str3, "channel");
            return false;
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.ILoaderDepender
        /* renamed from: b */
        public String mo52574b(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "offlineDir");
            Intrinsics.checkParameterIsNotNull(str2, "accessKey");
            Intrinsics.checkParameterIsNotNull(str3, "relativePath");
            return "";
        }

        C14393c() {
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.ILoaderDepender
        /* renamed from: a */
        public void mo52571a(IResourceLoaderService iResourceLoaderService) {
            this.f37785a = iResourceLoaderService;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ies/bullet/kit/resourceloader/ResLoaderConfigManager$placeHolder$2", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ICdnDownloadDepender;", "downloadResourceFile", "", "sourceUrl", "", "syncCall", "", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "listener", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/RLDownloaderListener;", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.d$d */
    public static final class C14394d implements ICdnDownloadDepender {
        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.ICdnDownloadDepender
        /* renamed from: a */
        public void mo52575a(String str, boolean z, TaskConfig jVar, RLDownloaderListener hVar) {
            Intrinsics.checkParameterIsNotNull(str, "sourceUrl");
            Intrinsics.checkParameterIsNotNull(jVar, "config");
        }

        C14394d() {
        }
    }

    /* renamed from: a */
    public final Application mo52564a() {
        return this.f37782d;
    }

    private ResLoaderConfigManager() {
        this.f37780b = new ResourceLoaderConfig("", "", CollectionsKt.mutableListOf(""), "", "", "", new GeckoConfig("", "", new C14393c(), false, false, 24, null), null, new C14394d(), null, null, 1664, null);
        this.f37781c = new LinkedHashMap();
    }

    public /* synthetic */ ResLoaderConfigManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo52566a(Application application) {
        this.f37782d = application;
    }

    /* renamed from: b */
    public final void mo52568b(IResourceLoaderService iResourceLoaderService) {
        Intrinsics.checkParameterIsNotNull(iResourceLoaderService, "service");
        this.f37781c.remove(iResourceLoaderService);
    }

    /* renamed from: a */
    public final ResourceLoaderConfig mo52565a(IResourceLoaderService iResourceLoaderService) {
        if (iResourceLoaderService == null) {
            Log.e("ResLoaderConfigManager", "getConfig service is null,return placeholder");
        }
        ResourceLoaderConfig iVar = this.f37781c.get(iResourceLoaderService);
        if (iVar != null) {
            return iVar;
        }
        return this.f37780b;
    }

    /* renamed from: a */
    public final void mo52567a(IResourceLoaderService iResourceLoaderService, ResourceLoaderConfig iVar) {
        Intrinsics.checkParameterIsNotNull(iResourceLoaderService, "service");
        Intrinsics.checkParameterIsNotNull(iVar, "config");
        this.f37781c.put(iResourceLoaderService, iVar);
    }
}
