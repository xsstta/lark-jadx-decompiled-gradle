package com.bytedance.ee.bear.integrator;

import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.larksuite.framework.launch.task.ILaunchTask;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.koin.core.module.Module;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001e\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/integrator/DynamicModuleLoader;", "", "koinModules", "", "Lorg/koin/core/module/Module;", "getKoinModules", "()Ljava/util/List;", "launchTasks", "Lcom/larksuite/framework/launch/task/ILaunchTask;", "getLaunchTasks", "routeInterceptors", "Lcom/bytedance/ee/bear/route/IRouteInterceptor;", "getRouteInterceptors", "routers", "", "", "Lcom/bytedance/ee/bear/route/RouteService$IntentProvider;", "getRouters", "()Ljava/util/Map;", "Companion", "Empty", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.integrator.a */
public interface DynamicModuleLoader {

    /* renamed from: a */
    public static final Companion f21254a = Companion.f21255a;

    /* renamed from: a */
    List<Module> mo30699a();

    /* renamed from: b */
    List<ILaunchTask<?>> mo30700b();

    /* renamed from: c */
    Map<String, AbstractC10740f.AbstractC10742b> mo30701c();

    /* renamed from: d */
    List<AbstractC10738c> mo30702d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/integrator/DynamicModuleLoader$Companion;", "", "()V", "KEY_IMPL_CLASS", "", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.a$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f21255a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/integrator/DynamicModuleLoader$Empty;", "Lcom/bytedance/ee/bear/integrator/DynamicModuleLoader;", "()V", "koinModules", "", "Lorg/koin/core/module/Module;", "getKoinModules", "()Ljava/util/List;", "launchTasks", "Lcom/larksuite/framework/launch/task/ILaunchTask;", "getLaunchTasks", "routeInterceptors", "Lcom/bytedance/ee/bear/route/IRouteInterceptor;", "getRouteInterceptors", "routers", "", "", "Lcom/bytedance/ee/bear/route/RouteService$IntentProvider;", "getRouters", "()Ljava/util/Map;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.a$b */
    public static final class Empty implements DynamicModuleLoader {

        /* renamed from: b */
        private final List<Module> f21256b = CollectionsKt.emptyList();

        /* renamed from: c */
        private final List<ILaunchTask<?>> f21257c = CollectionsKt.emptyList();

        /* renamed from: d */
        private final Map<String, AbstractC10740f.AbstractC10742b> f21258d = MapsKt.emptyMap();

        /* renamed from: e */
        private final List<AbstractC10738c> f21259e = CollectionsKt.emptyList();

        @Override // com.bytedance.ee.bear.integrator.DynamicModuleLoader
        /* renamed from: a */
        public List<Module> mo30699a() {
            return this.f21256b;
        }

        @Override // com.bytedance.ee.bear.integrator.DynamicModuleLoader
        /* renamed from: b */
        public List<ILaunchTask<?>> mo30700b() {
            return this.f21257c;
        }

        @Override // com.bytedance.ee.bear.integrator.DynamicModuleLoader
        /* renamed from: c */
        public Map<String, AbstractC10740f.AbstractC10742b> mo30701c() {
            return this.f21258d;
        }

        @Override // com.bytedance.ee.bear.integrator.DynamicModuleLoader
        /* renamed from: d */
        public List<AbstractC10738c> mo30702d() {
            return this.f21259e;
        }
    }
}
